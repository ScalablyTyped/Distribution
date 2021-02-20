package typings.pulumiAws.inputMod.s3

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault extends StObject {
  
  /**
    * The AWS KMS master key ID used for the SSE-KMS encryption. This can only be used when you set the value of `sseAlgorithm` as `aws:kms`. The default `aws/s3` AWS KMS master key is used if this element is absent while the `sseAlgorithm` is `aws:kms`.
    */
  var kmsMasterKeyId: js.UndefOr[Input[String]] = js.native
  
  /**
    * The server-side encryption algorithm to use. Valid values are `AES256` and `aws:kms`
    */
  var sseAlgorithm: Input[String] = js.native
}
object BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault {
  
  @scala.inline
  def apply(sseAlgorithm: Input[String]): BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault = {
    val __obj = js.Dynamic.literal(sseAlgorithm = sseAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault]
  }
  
  @scala.inline
  implicit class BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefaultMutableBuilder[Self <: BucketServerSideEncryptionConfigurationRuleApplyServerSideEncryptionByDefault] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKmsMasterKeyId(value: Input[String]): Self = StObject.set(x, "kmsMasterKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsMasterKeyIdUndefined: Self = StObject.set(x, "kmsMasterKeyId", js.undefined)
    
    @scala.inline
    def setSseAlgorithm(value: Input[String]): Self = StObject.set(x, "sseAlgorithm", value.asInstanceOf[js.Any])
  }
}
