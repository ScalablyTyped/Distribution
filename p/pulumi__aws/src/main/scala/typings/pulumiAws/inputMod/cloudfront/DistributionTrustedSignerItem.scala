package typings.pulumiAws.inputMod.cloudfront

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DistributionTrustedSignerItem extends StObject {
  
  /**
    * AWS account ID or `self`
    */
  var awsAccountNumber: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Set of active CloudFront key pairs associated with the signer account
    */
  var keyPairIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}
object DistributionTrustedSignerItem {
  
  inline def apply(): DistributionTrustedSignerItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DistributionTrustedSignerItem]
  }
  
  extension [Self <: DistributionTrustedSignerItem](x: Self) {
    
    inline def setAwsAccountNumber(value: Input[String]): Self = StObject.set(x, "awsAccountNumber", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountNumberUndefined: Self = StObject.set(x, "awsAccountNumber", js.undefined)
    
    inline def setKeyPairIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "keyPairIds", value.asInstanceOf[js.Any])
    
    inline def setKeyPairIdsUndefined: Self = StObject.set(x, "keyPairIds", js.undefined)
    
    inline def setKeyPairIdsVarargs(value: Input[String]*): Self = StObject.set(x, "keyPairIds", js.Array(value :_*))
  }
}
