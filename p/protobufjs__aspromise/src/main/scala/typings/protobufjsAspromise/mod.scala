package typings.protobufjsAspromise

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  @JSImport("@protobufjs/aspromise", JSImport.Namespace)
  @js.native
  def apply(fn: asPromiseCallback, ctx: js.Any, params: js.Any*): js.Promise[_] = js.native
  
  type asPromiseCallback = js.Function2[/* error */ Error | Null, /* repeated */ js.Any, js.Object]
}
