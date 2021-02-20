package typings.pulumiAws.outputMod.wafregional

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RulePredicate extends StObject {
  
  var dataId: String = js.native
  
  var negated: Boolean = js.native
  
  var `type`: String = js.native
}
object RulePredicate {
  
  @scala.inline
  def apply(dataId: String, negated: Boolean, `type`: String): RulePredicate = {
    val __obj = js.Dynamic.literal(dataId = dataId.asInstanceOf[js.Any], negated = negated.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulePredicate]
  }
  
  @scala.inline
  implicit class RulePredicateMutableBuilder[Self <: RulePredicate] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataId(value: String): Self = StObject.set(x, "dataId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegated(value: Boolean): Self = StObject.set(x, "negated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
