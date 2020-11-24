package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption extends js.Object {
  
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
  implicit class DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryptionOps[Self <: DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption] (val x: Self) extends AnyVal {
    
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
    def setReturnConnectionPasswordEncrypted(value: Input[Boolean]): Self = this.set("returnConnectionPasswordEncrypted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAwsKmsKeyId(value: Input[String]): Self = this.set("awsKmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsKmsKeyId: Self = this.set("awsKmsKeyId", js.undefined)
  }
}
