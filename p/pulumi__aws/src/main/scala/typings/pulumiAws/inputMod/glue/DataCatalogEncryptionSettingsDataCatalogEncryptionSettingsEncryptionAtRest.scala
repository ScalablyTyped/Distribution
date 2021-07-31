package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest extends StObject {
  
  /**
    * The encryption-at-rest mode for encrypting Data Catalog data. Valid values are `DISABLED` and `SSE-KMS`.
    */
  var catalogEncryptionMode: Input[String]
  
  /**
    * The ARN of the AWS KMS key to use for encryption at rest.
    */
  var sseAwsKmsKeyId: js.UndefOr[Input[String]] = js.undefined
}
object DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest {
  
  @scala.inline
  def apply(catalogEncryptionMode: Input[String]): DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest = {
    val __obj = js.Dynamic.literal(catalogEncryptionMode = catalogEncryptionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest]
  }
  
  @scala.inline
  implicit class DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestMutableBuilder[Self <: DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCatalogEncryptionMode(value: Input[String]): Self = StObject.set(x, "catalogEncryptionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSseAwsKmsKeyId(value: Input[String]): Self = StObject.set(x, "sseAwsKmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSseAwsKmsKeyIdUndefined: Self = StObject.set(x, "sseAwsKmsKeyId", js.undefined)
  }
}
