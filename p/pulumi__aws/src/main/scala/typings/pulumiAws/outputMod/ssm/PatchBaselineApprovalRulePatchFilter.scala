package typings.pulumiAws.outputMod.ssm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchBaselineApprovalRulePatchFilter extends StObject {
  
  var key: String
  
  var values: js.Array[String]
}
object PatchBaselineApprovalRulePatchFilter {
  
  inline def apply(key: String, values: js.Array[String]): PatchBaselineApprovalRulePatchFilter = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchBaselineApprovalRulePatchFilter]
  }
  
  extension [Self <: PatchBaselineApprovalRulePatchFilter](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
