package typings.pulumiAws.inputMod.msk

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterEncryptionInfo extends StObject {
  
  /**
    * You may specify a KMS key short ID or ARN (it will always output an ARN) to use for encrypting your data at rest.  If no key is specified, an AWS managed KMS ('aws/msk' managed service) key will be used for encrypting the data at rest.
    */
  var encryptionAtRestKmsKeyArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * Configuration block to specify encryption in transit. See below.
    */
  var encryptionInTransit: js.UndefOr[Input[ClusterEncryptionInfoEncryptionInTransit]] = js.native
}
object ClusterEncryptionInfo {
  
  @scala.inline
  def apply(): ClusterEncryptionInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterEncryptionInfo]
  }
  
  @scala.inline
  implicit class ClusterEncryptionInfoMutableBuilder[Self <: ClusterEncryptionInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEncryptionAtRestKmsKeyArn(value: Input[String]): Self = StObject.set(x, "encryptionAtRestKmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionAtRestKmsKeyArnUndefined: Self = StObject.set(x, "encryptionAtRestKmsKeyArn", js.undefined)
    
    @scala.inline
    def setEncryptionInTransit(value: Input[ClusterEncryptionInfoEncryptionInTransit]): Self = StObject.set(x, "encryptionInTransit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionInTransitUndefined: Self = StObject.set(x, "encryptionInTransit", js.undefined)
  }
}
