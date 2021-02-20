package typings.rcFieldForm.interfaceMod

import typings.rcFieldForm.rcFieldFormStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.rcFieldForm.interfaceMod.AggregationRule
  - typings.rcFieldForm.interfaceMod.ArrayRule
*/
trait RuleObject extends StObject
object RuleObject {
  
  @scala.inline
  def AggregationRule(): typings.rcFieldForm.interfaceMod.AggregationRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.rcFieldForm.interfaceMod.AggregationRule]
  }
  
  @scala.inline
  def ArrayRule(`type`: array): typings.rcFieldForm.interfaceMod.ArrayRule = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.rcFieldForm.interfaceMod.ArrayRule]
  }
}
