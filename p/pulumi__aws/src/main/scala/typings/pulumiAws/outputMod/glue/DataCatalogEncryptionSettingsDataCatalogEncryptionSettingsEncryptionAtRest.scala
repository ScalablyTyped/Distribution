package typings.pulumiAws.outputMod.glue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest extends StObject {
  
  /**
    * The encryption-at-rest mode for encrypting Data Catalog data. Valid values are `DISABLED` and `SSE-KMS`.
    */
  var catalogEncryptionMode: String
  
  /**
    * The ARN of the AWS KMS key to use for encryption at rest.
    */
  var sseAwsKmsKeyId: js.UndefOr[String] = js.undefined
}
object DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest {
  
  inline def apply(catalogEncryptionMode: String): DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest = {
    val __obj = js.Dynamic.literal(catalogEncryptionMode = catalogEncryptionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest]
  }
  
  extension [Self <: DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest](x: Self) {
    
    inline def setCatalogEncryptionMode(value: String): Self = StObject.set(x, "catalogEncryptionMode", value.asInstanceOf[js.Any])
    
    inline def setSseAwsKmsKeyId(value: String): Self = StObject.set(x, "sseAwsKmsKeyId", value.asInstanceOf[js.Any])
    
    inline def setSseAwsKmsKeyIdUndefined: Self = StObject.set(x, "sseAwsKmsKeyId", js.undefined)
  }
}
