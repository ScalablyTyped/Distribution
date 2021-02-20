package typings.pulumiAws.outputMod.ssm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchBaselineApprovalRulePatchFilter extends StObject {
  
  var key: String = js.native
  
  var values: js.Array[String] = js.native
}
object PatchBaselineApprovalRulePatchFilter {
  
  @scala.inline
  def apply(key: String, values: js.Array[String]): PatchBaselineApprovalRulePatchFilter = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchBaselineApprovalRulePatchFilter]
  }
  
  @scala.inline
  implicit class PatchBaselineApprovalRulePatchFilterMutableBuilder[Self <: PatchBaselineApprovalRulePatchFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: js.Array[String]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: String*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
