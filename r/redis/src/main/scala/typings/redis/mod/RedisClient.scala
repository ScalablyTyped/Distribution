package typings.redis.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Duplex
import typings.redis.redisStrings.message
import typings.redis.redisStrings.message_buffer
import typings.redis.redisStrings.pmessage
import typings.redis.redisStrings.pmessage_buffer
import typings.redis.redisStrings.psubscribe
import typings.redis.redisStrings.punsubscribe
import typings.redis.redisStrings.subscribe
import typings.redis.redisStrings.unsubscribe
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedisClient
  extends EventEmitter
     with Commands[Boolean] {
  
  def BATCH(): Multi = js.native
  def BATCH(args: js.Array[js.Array[String | Double | Callback[_]]]): Multi = js.native
  
  def MULTI(): Multi = js.native
  def MULTI(args: js.Array[js.Array[String | Double | Callback[_]]]): Multi = js.native
  
  def addCommand(command: String): Unit = js.native
  
  def add_command(command: String): Unit = js.native
  
  def batch(): Multi = js.native
  def batch(args: js.Array[js.Array[String | Double | Callback[_]]]): Multi = js.native
  
  var command_queue: js.Array[_] = js.native
  
  var command_queue_length: Double = js.native
  
  var connected: Boolean = js.native
  
  var connection_id: Double = js.native
  
  def cork(): Unit = js.native
  
  def duplicate(): RedisClient = js.native
  def duplicate(options: js.UndefOr[scala.Nothing], cb: Callback[RedisClient]): RedisClient = js.native
  def duplicate(options: ClientOpts): RedisClient = js.native
  def duplicate(options: ClientOpts, cb: Callback[RedisClient]): RedisClient = js.native
  
  /**
    * Client methods.
    */
  def end(): Unit = js.native
  def end(flush: Boolean): Unit = js.native
  
  /**
    * Mark the start of a transaction block.
    */
  def multi(): Multi = js.native
  def multi(args: js.Array[js.Array[String | Double | Callback[_]]]): Multi = js.native
  
  var offline_queue: js.Array[_] = js.native
  
  var offline_queue_length: Double = js.native
  
  @JSName("on")
  def on_message(event: message, listener: js.Function2[/* channel */ String, /* message */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_messagebuffer(event: message_buffer, listener: js.Function2[/* channel */ String, /* message */ String, Unit]): this.type = js.native
  @JSName("on")
  def on_pmessage(
    event: pmessage,
    listener: js.Function3[/* pattern */ String, /* channel */ String, /* message */ String, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_pmessagebuffer(
    event: pmessage_buffer,
    listener: js.Function3[/* pattern */ String, /* channel */ String, /* message */ String, Unit]
  ): this.type = js.native
  @JSName("on")
  def on_psubscribe(event: psubscribe, listener: js.Function2[/* pattern */ String, /* count */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_punsubscribe(event: punsubscribe, listener: js.Function2[/* pattern */ String, /* count */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_subscribe(event: subscribe, listener: js.Function2[/* channel */ String, /* count */ Double, Unit]): this.type = js.native
  @JSName("on")
  def on_unsubscribe(event: unsubscribe, listener: js.Function2[/* channel */ String, /* count */ Double, Unit]): this.type = js.native
  
  var retry_backoff: Double = js.native
  
  var retry_delay: Double | Error = js.native
  
  def sendCommand(command: String): Boolean = js.native
  def sendCommand(command: String, args: js.UndefOr[scala.Nothing], cb: Callback[_]): Boolean = js.native
  def sendCommand(command: String, args: js.Array[_]): Boolean = js.native
  def sendCommand(command: String, args: js.Array[_], cb: Callback[_]): Boolean = js.native
  def sendCommand(command: String, cb: Callback[_]): Boolean = js.native
  
  def send_command(command: String): Boolean = js.native
  def send_command(command: String, args: js.UndefOr[scala.Nothing], cb: Callback[_]): Boolean = js.native
  def send_command(command: String, args: js.Array[_]): Boolean = js.native
  def send_command(command: String, args: js.Array[_], cb: Callback[_]): Boolean = js.native
  def send_command(command: String, cb: Callback[_]): Boolean = js.native
  
  var server_info: ServerInfo = js.native
  
  var stream: Duplex = js.native
  
  def uncork(): Unit = js.native
  
  def unref(): Unit = js.native
}
@JSImport("redis", "RedisClient")
@js.native
object RedisClient extends TopLevel[Instantiable1[/* options */ ClientOpts, RedisClient]]
