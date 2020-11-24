package typings.pulumiAws.inputMod.glue

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest extends js.Object {
  
  /**
    * The encryption-at-rest mode for encrypting Data Catalog data. Valid values are `DISABLED` and `SSE-KMS`.
    */
  var catalogEncryptionMode: Input[String] = js.native
  
  /**
    * The ARN of the AWS KMS key to use for encryption at rest.
    */
  var sseAwsKmsKeyId: js.UndefOr[Input[String]] = js.native
}
object DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest {
  
  @scala.inline
  def apply(catalogEncryptionMode: Input[String]): DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest = {
    val __obj = js.Dynamic.literal(catalogEncryptionMode = catalogEncryptionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest]
  }
  
  @scala.inline
  implicit class DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRestOps[Self <: DataCatalogEncryptionSettingsDataCatalogEncryptionSettingsEncryptionAtRest] (val x: Self) extends AnyVal {
    
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
    def setCatalogEncryptionMode(value: Input[String]): Self = this.set("catalogEncryptionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSseAwsKmsKeyId(value: Input[String]): Self = this.set("sseAwsKmsKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSseAwsKmsKeyId: Self = this.set("sseAwsKmsKeyId", js.undefined)
  }
}
