package typings
package redisLib.redisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redis", JSImport.Namespace)
@js.native
object redisModMembers extends js.Object {
  val Multi: redisLib.Anon_Multi = js.native
  val RedisClient: redisLib.Anon_Options = js.native
  var debug_mode: scala.Boolean = js.native
  def createClient(): RedisClient = js.native
  def createClient(options: ClientOpts): RedisClient = js.native
  def createClient(port: scala.Double): RedisClient = js.native
  def createClient(port: scala.Double, host: java.lang.String): RedisClient = js.native
  def createClient(port: scala.Double, host: java.lang.String, options: ClientOpts): RedisClient = js.native
  def createClient(unix_socket: java.lang.String): RedisClient = js.native
  def createClient(unix_socket: java.lang.String, options: ClientOpts): RedisClient = js.native
  def print(err: nodeLib.Error, reply: js.Any): scala.Unit = js.native
  def print(err: scala.Null, reply: js.Any): scala.Unit = js.native
}

