package typings
package redisLib.redisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RedisClient
  extends nodeLib.eventsMod.EventEmitter
     with Commands[scala.Boolean] {
  var command_queue: js.Array[_] = js.native
  var command_queue_length: scala.Double = js.native
  var connected: scala.Boolean = js.native
  var connection_id: scala.Double = js.native
  var offline_queue: js.Array[_] = js.native
  var offline_queue_length: scala.Double = js.native
  var retry_backoff: scala.Double = js.native
  var retry_delay: scala.Double = js.native
  var server_info: ServerInfo = js.native
  var stream: nodeLib.streamMod.Duplex = js.native
  def BATCH(): Multi = js.native
  def BATCH(args: js.Array[js.Array[java.lang.String | scala.Double | Callback[_]]]): Multi = js.native
  def MULTI(): Multi = js.native
  def MULTI(args: js.Array[js.Array[java.lang.String | scala.Double | Callback[_]]]): Multi = js.native
  def addCommand(command: java.lang.String): scala.Unit = js.native
  def add_command(command: java.lang.String): scala.Unit = js.native
  def batch(): Multi = js.native
  def batch(args: js.Array[js.Array[java.lang.String | scala.Double | Callback[_]]]): Multi = js.native
  def cork(): scala.Unit = js.native
  def duplicate(): RedisClient = js.native
  def duplicate(options: ClientOpts): RedisClient = js.native
  def duplicate(options: ClientOpts, cb: Callback[RedisClient]): RedisClient = js.native
  /**
    * Client methods.
    */
  def end(): scala.Unit = js.native
  def end(flush: scala.Boolean): scala.Unit = js.native
  /**
    * Mark the start of a transaction block.
    */
  def multi(): Multi = js.native
  def multi(args: js.Array[js.Array[java.lang.String | scala.Double | Callback[_]]]): Multi = js.native
  @JSName("on")
  def on_message(
    event: redisLib.redisLibStrings.message,
    listener: js.Function2[/* channel */ java.lang.String, /* message */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_message_buffer(
    event: redisLib.redisLibStrings.message_buffer,
    listener: js.Function2[/* channel */ java.lang.String, /* message */ java.lang.String, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_pmessage(
    event: redisLib.redisLibStrings.pmessage,
    listener: js.Function3[
      /* pattern */ java.lang.String, 
      /* channel */ java.lang.String, 
      /* message */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_pmessage_buffer(
    event: redisLib.redisLibStrings.pmessage_buffer,
    listener: js.Function3[
      /* pattern */ java.lang.String, 
      /* channel */ java.lang.String, 
      /* message */ java.lang.String, 
      scala.Unit
    ]
  ): this.type = js.native
  @JSName("on")
  def on_psubscribe(
    event: redisLib.redisLibStrings.psubscribe,
    listener: js.Function2[/* pattern */ java.lang.String, /* count */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_punsubscribe(
    event: redisLib.redisLibStrings.punsubscribe,
    listener: js.Function2[/* pattern */ java.lang.String, /* count */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_subscribe(
    event: redisLib.redisLibStrings.subscribe,
    listener: js.Function2[/* channel */ java.lang.String, /* count */ scala.Double, scala.Unit]
  ): this.type = js.native
  @JSName("on")
  def on_unsubscribe(
    event: redisLib.redisLibStrings.unsubscribe,
    listener: js.Function2[/* channel */ java.lang.String, /* count */ scala.Double, scala.Unit]
  ): this.type = js.native
  def sendCommand(command: java.lang.String): scala.Boolean = js.native
  def sendCommand(command: java.lang.String, args: js.Array[_]): scala.Boolean = js.native
  def sendCommand(command: java.lang.String, args: js.Array[_], cb: Callback[_]): scala.Boolean = js.native
  def sendCommand(command: java.lang.String, cb: Callback[_]): scala.Boolean = js.native
  def send_command(command: java.lang.String): scala.Boolean = js.native
  def send_command(command: java.lang.String, args: js.Array[_]): scala.Boolean = js.native
  def send_command(command: java.lang.String, args: js.Array[_], cb: Callback[_]): scala.Boolean = js.native
  def send_command(command: java.lang.String, cb: Callback[_]): scala.Boolean = js.native
  def uncork(): scala.Unit = js.native
  def unref(): scala.Unit = js.native
}

