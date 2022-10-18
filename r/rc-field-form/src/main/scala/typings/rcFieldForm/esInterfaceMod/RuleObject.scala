package typings.rcFieldForm.esInterfaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.rcFieldForm.esInterfaceMod.AggregationRule
  - typings.rcFieldForm.esInterfaceMod.ArrayRule
*/
trait RuleObject extends StObject
object RuleObject {
  
  inline def AggregationRule(): typings.rcFieldForm.esInterfaceMod.AggregationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.rcFieldForm.esInterfaceMod.AggregationRule]
  }
  
  inline def ArrayRule(): typings.rcFieldForm.esInterfaceMod.ArrayRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[typings.rcFieldForm.esInterfaceMod.ArrayRule]
  }
}
