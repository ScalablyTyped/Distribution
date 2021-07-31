package typings.pulumiAws.outputMod.cloudfront

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionTrustedSignerItem extends StObject {
  
  /**
    * AWS account ID or `self`
    */
  var awsAccountNumber: String
  
  /**
    * Set of active CloudFront key pairs associated with the signer account
    */
  var keyPairIds: js.Array[String]
}
object DistributionTrustedSignerItem {
  
  @scala.inline
  def apply(awsAccountNumber: String, keyPairIds: js.Array[String]): DistributionTrustedSignerItem = {
    val __obj = js.Dynamic.literal(awsAccountNumber = awsAccountNumber.asInstanceOf[js.Any], keyPairIds = keyPairIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DistributionTrustedSignerItem]
  }
  
  @scala.inline
  implicit class DistributionTrustedSignerItemMutableBuilder[Self <: DistributionTrustedSignerItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsAccountNumber(value: String): Self = StObject.set(x, "awsAccountNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPairIds(value: js.Array[String]): Self = StObject.set(x, "keyPairIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPairIdsVarargs(value: String*): Self = StObject.set(x, "keyPairIds", js.Array(value :_*))
  }
}
