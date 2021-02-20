package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption extends StObject {
  
  /**
    * A KMS key ARN that is used to encrypt the connection password. If connection password protection is enabled, the caller of CreateConnection and UpdateConnection needs at least `kms:Encrypt` permission on the specified AWS KMS key, to encrypt passwords before storing them in the Data Catalog.
    */
  var awsKmsKeyId: js.UndefOr[Input[String]] = js.native
  
  /**
    * When set to `true`, passwords remain encrypted in the responses of GetConnection and GetConnections. This encryption takes effect independently of the catalog encryption.
    */
  var returnConnectionPasswordEncrypted: Input[Boolean] = js.native
}
object DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption {
  
  @scala.inline
  def apply(returnConnectionPasswordEncrypted: Input[Boolean]): DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption = {
    val __obj = js.Dynamic.literal(returnConnectionPasswordEncrypted = returnConnectionPasswordEncrypted.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption]
  }
  
  @scala.inline
  implicit class DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionMutableBuilder[Self <: DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAwsKmsKeyId(value: Input[String]): Self = StObject.set(x, "awsKmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsKmsKeyIdUndefined: Self = StObject.set(x, "awsKmsKeyId", js.undefined)
    
    @scala.inline
    def setReturnConnectionPasswordEncrypted(value: Input[Boolean]): Self = StObject.set(x, "returnConnectionPasswordEncrypted", value.asInstanceOf[js.Any])
  }
}
