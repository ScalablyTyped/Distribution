package typings.pulumiAws.inputMod.wafv2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebAclDefaultAction extends js.Object {
  
  /**
    * Specifies that AWS WAF should allow requests by default.
    */
  var allow: js.UndefOr[Input[WebAclDefaultActionAllow]] = js.native
  
  /**
    * Specifies that AWS WAF should block requests by default.
    */
  var block: js.UndefOr[Input[WebAclDefaultActionBlock]] = js.native
}
object WebAclDefaultAction {
  
  @scala.inline
  def apply(): WebAclDefaultAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebAclDefaultAction]
  }
  
  @scala.inline
  implicit class WebAclDefaultActionOps[Self <: WebAclDefaultAction] (val x: Self) extends AnyVal {
    
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
    def setAllow(value: Input[WebAclDefaultActionAllow]): Self = this.set("allow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllow: Self = this.set("allow", js.undefined)
    
    @scala.inline
    def setBlock(value: Input[WebAclDefaultActionBlock]): Self = this.set("block", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlock: Self = this.set("block", js.undefined)
  }
}
