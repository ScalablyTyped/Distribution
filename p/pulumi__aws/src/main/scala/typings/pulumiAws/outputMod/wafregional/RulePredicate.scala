package typings.pulumiAws.outputMod.wafregional

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RulePredicate extends StObject {
  
  var dataId: String
  
  var negated: Boolean
  
  var `type`: String
}
object RulePredicate {
  
  inline def apply(dataId: String, negated: Boolean, `type`: String): RulePredicate = {
    val __obj = js.Dynamic.literal(dataId = dataId.asInstanceOf[js.Any], negated = negated.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RulePredicate]
  }
  
  extension [Self <: RulePredicate](x: Self) {
    
    inline def setDataId(value: String): Self = StObject.set(x, "dataId", value.asInstanceOf[js.Any])
    
    inline def setNegated(value: Boolean): Self = StObject.set(x, "negated", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
