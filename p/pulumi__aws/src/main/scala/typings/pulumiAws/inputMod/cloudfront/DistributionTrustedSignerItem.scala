package typings.pulumiAws.inputMod.cloudfront

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionTrustedSignerItem extends js.Object {
  
  /**
    * AWS account ID or `self`
    */
  var awsAccountNumber: js.UndefOr[Input[String]] = js.native
  
  /**
    * Set of active CloudFront key pairs associated with the signer account
    */
  var keyPairIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}
object DistributionTrustedSignerItem {
  
  @scala.inline
  def apply(): DistributionTrustedSignerItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistributionTrustedSignerItem]
  }
  
  @scala.inline
  implicit class DistributionTrustedSignerItemOps[Self <: DistributionTrustedSignerItem] (val x: Self) extends AnyVal {
    
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
    def setAwsAccountNumber(value: Input[String]): Self = this.set("awsAccountNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsAccountNumber: Self = this.set("awsAccountNumber", js.undefined)
    
    @scala.inline
    def setKeyPairIdsVarargs(value: Input[String]*): Self = this.set("keyPairIds", js.Array(value :_*))
    
    @scala.inline
    def setKeyPairIds(value: Input[js.Array[Input[String]]]): Self = this.set("keyPairIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPairIds: Self = this.set("keyPairIds", js.undefined)
  }
}
