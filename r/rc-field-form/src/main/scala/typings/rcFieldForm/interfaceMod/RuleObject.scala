package typings.rcFieldForm.interfaceMod

import typings.rcFieldForm.rcFieldFormStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.rcFieldForm.interfaceMod.AggregationRule
  - typings.rcFieldForm.interfaceMod.ArrayRule
*/
trait RuleObject extends js.Object
object RuleObject {
  
  @scala.inline
  def AggregationRule(): RuleObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuleObject]
  }
  
  @scala.inline
  def ArrayRule(`type`: array): RuleObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleObject]
  }
}
