package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataCatalogEncryptionSettingsDataCatalogEncryptionSettings extends js.Object {
  
  /**
    * When connection password protection is enabled, the Data Catalog uses a customer-provided key to encrypt the password as part of CreateConnection or UpdateConnection and store it in the ENCRYPTED_PASSWORD field in the connection properties. You can enable catalog encryption or only password encryption. see Connection Password Encryption.
    */
  var connectionPasswordEncryption: Input[
    DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption
  ] = js.native
  
  /**
    * Specifies the encryption-at-rest configuration for the Data Catalog. see Encryption At Rest.
    */
  var encryptionAtRest: Input[DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest] = js.native
}
object DataCatalogEncryptionSettingsDataCatalogEncryptionSettings {
  
  @scala.inline
  def apply(
    connectionPasswordEncryption: Input[
      DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption
    ],
    encryptionAtRest: Input[DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest]
  ): DataCatalogEncryptionSettingsDataCatalogEncryptionSettings = {
    val __obj = js.Dynamic.literal(connectionPasswordEncryption = connectionPasswordEncryption.asInstanceOf[js.Any], encryptionAtRest = encryptionAtRest.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCatalogEncryptionSettingsDataCatalogEncryptionSettings]
  }
  
  @scala.inline
  implicit class DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsOps[Self <: DataCatalogEncryptionSettingsDataCatalogEncryptionSettings] (val x: Self) extends AnyVal {
    
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
    def setConnectionPasswordEncryption(
      value: Input[
          DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption
        ]
    ): Self = this.set("connectionPasswordEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionAtRest(value: Input[DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest]): Self = this.set("encryptionAtRest", value.asInstanceOf[js.Any])
  }
}
