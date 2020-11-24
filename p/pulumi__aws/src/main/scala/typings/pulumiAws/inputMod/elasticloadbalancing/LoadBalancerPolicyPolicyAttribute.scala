package typings.pulumiAws.inputMod.elasticloadbalancing

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadBalancerPolicyPolicyAttribute extends js.Object {
  
  var name: js.UndefOr[Input[String]] = js.native
  
  var value: js.UndefOr[Input[String]] = js.native
}
object LoadBalancerPolicyPolicyAttribute {
  
  @scala.inline
  def apply(): LoadBalancerPolicyPolicyAttribute = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerPolicyPolicyAttribute]
  }
  
  @scala.inline
  implicit class LoadBalancerPolicyPolicyAttributeOps[Self <: LoadBalancerPolicyPolicyAttribute] (val x: Self) extends AnyVal {
    
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
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setValue(value: Input[String]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
