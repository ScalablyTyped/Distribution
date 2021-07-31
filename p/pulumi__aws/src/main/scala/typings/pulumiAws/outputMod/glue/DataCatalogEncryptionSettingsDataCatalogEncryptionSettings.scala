package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataCatalogEncryptionSettingsDataCatalogEncryptionSettings extends StObject {
  
  /**
    * When connection password protection is enabled, the Data Catalog uses a customer-provided key to encrypt the password as part of CreateConnection or UpdateConnection and store it in the ENCRYPTED_PASSWORD field in the connection properties. You can enable catalog encryption or only password encryption. see Connection Password Encryption.
    */
  var connectionPasswordEncryption: DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption
  
  /**
    * Specifies the encryption-at-rest configuration for the Data Catalog. see Encryption At Rest.
    */
  var encryptionAtRest: DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest
}
object DataCatalogEncryptionSettingsDataCatalogEncryptionSettings {
  
  @scala.inline
  def apply(
    connectionPasswordEncryption: DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption,
    encryptionAtRest: DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest
  ): DataCatalogEncryptionSettingsDataCatalogEncryptionSettings = {
    val __obj = js.Dynamic.literal(connectionPasswordEncryption = connectionPasswordEncryption.asInstanceOf[js.Any], encryptionAtRest = encryptionAtRest.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCatalogEncryptionSettingsDataCatalogEncryptionSettings]
  }
  
  @scala.inline
  implicit class DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsMutableBuilder[Self <: DataCatalogEncryptionSettingsDataCatalogEncryptionSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConnectionPasswordEncryption(value: DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsConnectionPasswordEncryption): Self = StObject.set(x, "connectionPasswordEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionAtRest(value: DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest): Self = StObject.set(x, "encryptionAtRest", value.asInstanceOf[js.Any])
  }
}
