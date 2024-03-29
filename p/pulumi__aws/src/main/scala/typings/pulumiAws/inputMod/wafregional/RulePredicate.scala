package typings.pulumiAws.inputMod.wafregional

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RulePredicate extends StObject {
  
  var dataId: Input[String]
  
  var negated: Input[Boolean]
  
  var `type`: Input[String]
}
object RulePredicate {
  
  inline def apply(dataId: Input[String], negated: Input[Boolean], `type`: Input[String]): RulePredicate = {
    val __obj = js.Dynamic.literal(dataId = dataId.asInstanceOf[js.Any], negated = negated.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulePredicate]
  }
  
  extension [Self <: RulePredicate](x: Self) {
    
    inline def setDataId(value: Input[String]): Self = StObject.set(x, "dataId", value.asInstanceOf[js.Any])
    
    inline def setNegated(value: Input[Boolean]): Self = StObject.set(x, "negated", value.asInstanceOf[js.Any])
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
