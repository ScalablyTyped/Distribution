package typings.pulumiAws.inputMod.cloudfront

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionTrustedSigner extends js.Object {
  
  /**
    * Whether the distribution is enabled to accept end
    * user requests for content.
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * List of nested attributes for each trusted signer
    */
  var items: js.UndefOr[Input[js.Array[Input[DistributionTrustedSignerItem]]]] = js.native
}
object DistributionTrustedSigner {
  
  @scala.inline
  def apply(): DistributionTrustedSigner = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistributionTrustedSigner]
  }
  
  @scala.inline
  implicit class DistributionTrustedSignerOps[Self <: DistributionTrustedSigner] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: Input[DistributionTrustedSignerItem]*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: Input[js.Array[Input[DistributionTrustedSignerItem]]]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
  }
}
