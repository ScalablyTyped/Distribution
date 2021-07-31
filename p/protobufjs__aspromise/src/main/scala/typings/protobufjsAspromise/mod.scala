package typings.protobufjsAspromise

import typings.std.Error
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
  @scala.inline
  def apply(fn: asPromiseCallback, ctx: js.Any, params: js.Any*): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].apply(fn.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  
  @JSImport("@protobufjs/aspromise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  trait asPromiseCallback extends StObject {
    
    def apply(error: Null, params: js.Any*): js.Object = js.native
    def apply(error: Error, params: js.Any*): js.Object = js.native
  }
}
