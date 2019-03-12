package typings
package redisLib.redisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redis", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Multi: org.scalablytyped.runtime.Instantiable0[Multi] = js.native
  val RedisClient: org.scalablytyped.runtime.Instantiable1[/* options */ ClientOpts, RedisClient] = js.native
  var debug_mode: scala.Boolean = js.native
  def createClient(): RedisClient = js.native
  def createClient(options: ClientOpts): RedisClient = js.native
  def createClient(port: scala.Double): RedisClient = js.native
  def createClient(port: scala.Double, host: java.lang.String): RedisClient = js.native
  def createClient(port: scala.Double, host: java.lang.String, options: ClientOpts): RedisClient = js.native
  def createClient(unix_socket: java.lang.String): RedisClient = js.native
  def createClient(unix_socket: java.lang.String, options: ClientOpts): RedisClient = js.native
  def print(err: scala.Null, reply: js.Any): scala.Unit = js.native
  def print(err: stdLib.Error, reply: js.Any): scala.Unit = js.native
}

