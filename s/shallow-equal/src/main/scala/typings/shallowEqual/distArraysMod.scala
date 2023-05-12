package typings.shallowEqual

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distArraysMod {
  
  @JSImport("shallow-equal/dist/arrays", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(arrA: validArrayValue, arrB: validArrayValue): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(arrA.asInstanceOf[js.Any], arrB.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type validArrayValue = js.UndefOr[js.Array[Any] | Null]
}
