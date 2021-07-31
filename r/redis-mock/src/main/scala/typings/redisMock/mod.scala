package typings.redisMock

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.redis.mod.ClientOpts
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redis-mock", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("redis-mock", "AbortError")
  @js.native
  class AbortError ()
    extends typings.redis.mod.AbortError
  
  @JSImport("redis-mock", "AggregateError")
  @js.native
  class AggregateError ()
    extends typings.redis.mod.AggregateError
  
  @JSImport("redis-mock", "Multi")
  @js.native
  val Multi: Instantiable0[typings.redis.mod.Multi] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("redis-mock", "MultiCls")
  @js.native
  class MultiCls ()
    extends typings.redis.mod.MultiCls
  
  @JSImport("redis-mock", "ParserError")
  @js.native
  class ParserError ()
    extends typings.redis.mod.ParserError
  
  @JSImport("redis-mock", "RedisClient")
  @js.native
  val RedisClient: Instantiable1[/* options */ ClientOpts, typings.redis.mod.RedisClient] = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("redis-mock", "RedisClientCls")
  @js.native
  class RedisClientCls protected ()
    extends typings.redis.mod.RedisClientCls {
    def this(options: ClientOpts) = this()
  }
  
  @JSImport("redis-mock", "RedisError")
  @js.native
  class RedisError ()
    extends typings.redis.mod.RedisError
  
  @JSImport("redis-mock", "ReplyError")
  @js.native
  class ReplyError ()
    extends typings.redis.mod.ReplyError
  
  @scala.inline
  def createClient(): typings.redis.mod.RedisClient = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")().asInstanceOf[typings.redis.mod.RedisClient]
  @scala.inline
  def createClient(options: ClientOpts): typings.redis.mod.RedisClient = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(options.asInstanceOf[js.Any]).asInstanceOf[typings.redis.mod.RedisClient]
  @scala.inline
  def createClient(port: Double): typings.redis.mod.RedisClient = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(port.asInstanceOf[js.Any]).asInstanceOf[typings.redis.mod.RedisClient]
  @scala.inline
  def createClient(port: Double, host: String): typings.redis.mod.RedisClient = (^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[typings.redis.mod.RedisClient]
  @scala.inline
  def createClient(port: Double, host: String, options: ClientOpts): typings.redis.mod.RedisClient = (^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.redis.mod.RedisClient]
  @scala.inline
  def createClient(port: Double, host: Unit, options: ClientOpts): typings.redis.mod.RedisClient = (^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(port.asInstanceOf[js.Any], host.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.redis.mod.RedisClient]
  @scala.inline
  def createClient(unix_socket: String): typings.redis.mod.RedisClient = ^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(unix_socket.asInstanceOf[js.Any]).asInstanceOf[typings.redis.mod.RedisClient]
  @scala.inline
  def createClient(unix_socket: String, options: ClientOpts): typings.redis.mod.RedisClient = (^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(unix_socket.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.redis.mod.RedisClient]
  
  @JSImport("redis-mock", "debug_mode")
  @js.native
  def debugMode: Boolean = js.native
  
  @scala.inline
  def debugMode_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debug_mode")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def print(err: Null, reply: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("print")(err.asInstanceOf[js.Any], reply.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def print(err: Error, reply: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("print")(err.asInstanceOf[js.Any], reply.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
