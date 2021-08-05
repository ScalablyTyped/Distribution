package typings.pulumiAws.outputMod.s3

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault extends StObject {
  
  /**
    * The AWS KMS master key ID used for the SSE-KMS encryption. This can only be used when you set the value of `sseAlgorithm` as `aws:kms`. The default `aws/s3` AWS KMS master key is used if this element is absent while the `sseAlgorithm` is `aws:kms`.
    */
  var kmsMasterKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The server-side encryption algorithm to use. Valid values are `AES256` and `aws:kms`
    */
  var sseAlgorithm: String
}
object BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault {
  
  inline def apply(sseAlgorithm: String): BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault = {
    val __obj = js.Dynamic.literal(sseAlgorithm = sseAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault]
  }
  
  extension [Self <: BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault](x: Self) {
    
    inline def setKmsMasterKeyId(value: String): Self = StObject.set(x, "kmsMasterKeyId", value.asInstanceOf[js.Any])
    
    inline def setKmsMasterKeyIdUndefined: Self = StObject.set(x, "kmsMasterKeyId", js.undefined)
    
    inline def setSseAlgorithm(value: String): Self = StObject.set(x, "sseAlgorithm", value.asInstanceOf[js.Any])
  }
}
