package typings.sawtoothSdk.protobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPolicyList extends StObject {
  
  /** PolicyList policies */
  var policies: js.UndefOr[js.Array[IPolicy] | Null] = js.native
}
object IPolicyList {
  
  @scala.inline
  def apply(): IPolicyList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPolicyList]
  }
  
  @scala.inline
  implicit class IPolicyListMutableBuilder[Self <: IPolicyList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPolicies(value: js.Array[IPolicy]): Self = StObject.set(x, "policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoliciesNull: Self = StObject.set(x, "policies", null)
    
    @scala.inline
    def setPoliciesUndefined: Self = StObject.set(x, "policies", js.undefined)
    
    @scala.inline
    def setPoliciesVarargs(value: IPolicy*): Self = StObject.set(x, "policies", js.Array(value :_*))
  }
}
