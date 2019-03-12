package typings
package redisDashMockLib.redisDashMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("redis-mock", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Multi: org.scalablytyped.runtime.Instantiable0[redisLib.redisMod.Multi] = js.native
  val RedisClient: org.scalablytyped.runtime.Instantiable1[/* options */ redisLib.redisMod.ClientOpts, redisLib.redisMod.RedisClient] = js.native
  var debug_mode: scala.Boolean = js.native
  def createClient(): redisLib.redisMod.RedisClient = js.native
  def createClient(options: redisLib.redisMod.ClientOpts): redisLib.redisMod.RedisClient = js.native
  def createClient(port: scala.Double): redisLib.redisMod.RedisClient = js.native
  def createClient(port: scala.Double, host: java.lang.String): redisLib.redisMod.RedisClient = js.native
  def createClient(port: scala.Double, host: java.lang.String, options: redisLib.redisMod.ClientOpts): redisLib.redisMod.RedisClient = js.native
  def createClient(unix_socket: java.lang.String): redisLib.redisMod.RedisClient = js.native
  def createClient(unix_socket: java.lang.String, options: redisLib.redisMod.ClientOpts): redisLib.redisMod.RedisClient = js.native
  def print(err: scala.Null, reply: js.Any): scala.Unit = js.native
  def print(err: stdLib.Error, reply: js.Any): scala.Unit = js.native
}

