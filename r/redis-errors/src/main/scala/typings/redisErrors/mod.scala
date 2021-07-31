package typings.redisErrors

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redis-errors", "AbortError")
  @js.native
  class AbortError () extends RedisError {
    
    var args: js.UndefOr[js.Array[js.Any]] = js.native
    
    var command: js.UndefOr[String] = js.native
  }
  
  @JSImport("redis-errors", "InterruptError")
  @js.native
  class InterruptError () extends RedisError {
    
    var args: js.UndefOr[js.Array[js.Any]] = js.native
    
    var command: js.UndefOr[String] = js.native
    
    var origin: Error = js.native
  }
  
  @JSImport("redis-errors", "ParserError")
  @js.native
  class ParserError protected () extends RedisError {
    def this(message: String, buffer: String, offset: Double) = this()
    
    var buffer: String = js.native
    
    var offset: Double = js.native
  }
  
  @JSImport("redis-errors", "RedisError")
  @js.native
  class RedisError ()
    extends StObject
       with Error {
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("redis-errors", "ReplyError")
  @js.native
  class ReplyError protected () extends RedisError {
    def this(message: String) = this()
    
    var args: js.UndefOr[js.Array[js.Any]] = js.native
    
    var code: js.UndefOr[String] = js.native
    
    var command: js.UndefOr[String] = js.native
  }
}
