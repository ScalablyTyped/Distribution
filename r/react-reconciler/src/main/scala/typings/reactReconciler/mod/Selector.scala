package typings.reactReconciler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.reactReconciler.mod.ComponentSelector
  - typings.reactReconciler.mod.HasPseudoClassSelector
  - typings.reactReconciler.mod.RoleSelector
  - typings.reactReconciler.mod.TextSelector
  - typings.reactReconciler.mod.TestNameSelector
*/
trait Selector extends StObject
object Selector {
  
  inline def ComponentSelector(DollarDollartypeof: js.Symbol | Double, value: ReactAbstractComponent[scala.Nothing, Any]): typings.reactReconciler.mod.ComponentSelector = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactReconciler.mod.ComponentSelector]
  }
  
  inline def HasPseudoClassSelector(DollarDollartypeof: js.Symbol | Double, value: js.Array[Selector]): typings.reactReconciler.mod.HasPseudoClassSelector = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactReconciler.mod.HasPseudoClassSelector]
  }
  
  inline def RoleSelector(DollarDollartypeof: js.Symbol | Double, value: String): typings.reactReconciler.mod.RoleSelector = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactReconciler.mod.RoleSelector]
  }
  
  inline def TestNameSelector(DollarDollartypeof: js.Symbol | Double, value: String): typings.reactReconciler.mod.TestNameSelector = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactReconciler.mod.TestNameSelector]
  }
  
  inline def TextSelector(DollarDollartypeof: js.Symbol | Double, value: String): typings.reactReconciler.mod.TextSelector = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.reactReconciler.mod.TextSelector]
  }
}
