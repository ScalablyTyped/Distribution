package typings.pulumiAws.outputMod.cloudfront

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DistributionTrustedSignerItem extends js.Object {
  
  /**
    * AWS account ID or `self`
    */
  var awsAccountNumber: String = js.native
  
  /**
    * Set of active CloudFront key pairs associated with the signer account
    */
  var keyPairIds: js.Array[String] = js.native
}
object DistributionTrustedSignerItem {
  
  @scala.inline
  def apply(awsAccountNumber: String, keyPairIds: js.Array[String]): DistributionTrustedSignerItem = {
    val __obj = js.Dynamic.literal(awsAccountNumber = awsAccountNumber.asInstanceOf[js.Any], keyPairIds = keyPairIds.asInstanceOf[js.Any])
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
    def setAwsAccountNumber(value: String): Self = this.set("awsAccountNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPairIdsVarargs(value: String*): Self = this.set("keyPairIds", js.Array(value :_*))
    
    @scala.inline
    def setKeyPairIds(value: js.Array[String]): Self = this.set("keyPairIds", value.asInstanceOf[js.Any])
  }
}
