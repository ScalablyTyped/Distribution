package typings.protobufjsAspromise

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns a promise from a node-style callback function.
    * @memberof util
    * @param {asPromiseCallback} fn Function to call
    * @param {*} ctx Function context
    * @param {...*} params Function arguments
    * @returns {Promise<*>} Promisified function
    */
  inline def apply(fn: asPromiseCallback, ctx: Any, params: Any*): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].apply((List(fn.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).`++`(params.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[js.Promise[Any]]
  
  @JSImport("@protobufjs/aspromise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait asPromiseCallback extends StObject {
    
    def apply(error: js.Error, params: Any*): js.Object = js.native
    def apply(error: Null, params: Any*): js.Object = js.native
  }
}
