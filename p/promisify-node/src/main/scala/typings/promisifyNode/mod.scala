package typings.promisifyNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Public API for Promisify.  Will resolve modules names using `require`.
    *
    * @param {*} name - Can be a module name, object, or function.
    * @param {Function} test - Optional function to identify async methods.
    * @param {Boolean} noMutate - Optional set to true to avoid mutating the target.
    * @returns {*} exports - The resolved value from require or passed in value.
    */
  inline def apply(name: String): js.Any = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def apply(name: String, test: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def apply(name: String, test: js.Function, noMutate: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], test.asInstanceOf[js.Any], noMutate.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def apply(name: String, test: Unit, noMutate: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], test.asInstanceOf[js.Any], noMutate.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def apply(name: js.Function): js.Any = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def apply(name: js.Function, test: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def apply(name: js.Function, test: js.Function, noMutate: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], test.asInstanceOf[js.Any], noMutate.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def apply(name: js.Function, test: Unit, noMutate: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], test.asInstanceOf[js.Any], noMutate.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def apply(name: js.Object): js.Any = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def apply(name: js.Object, test: js.Function): js.Any = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], test.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def apply(name: js.Object, test: js.Function, noMutate: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], test.asInstanceOf[js.Any], noMutate.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def apply(name: js.Object, test: Unit, noMutate: Boolean): js.Any = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], test.asInstanceOf[js.Any], noMutate.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @JSImport("promisify-node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
