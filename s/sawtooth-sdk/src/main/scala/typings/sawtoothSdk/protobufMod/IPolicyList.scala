package typings.sawtoothSdk.protobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPolicyList extends js.Object {
  
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
  implicit class IPolicyListOps[Self <: IPolicyList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setPoliciesVarargs(value: IPolicy*): Self = this.set("policies", js.Array(value :_*))
    
    @scala.inline
    def setPolicies(value: js.Array[IPolicy]): Self = this.set("policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicies: Self = this.set("policies", js.undefined)
    
    @scala.inline
    def setPoliciesNull: Self = this.set("policies", null)
  }
}
