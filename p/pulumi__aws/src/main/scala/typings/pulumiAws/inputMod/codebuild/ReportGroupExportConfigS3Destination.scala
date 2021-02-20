package typings.pulumiAws.inputMod.codebuild

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportGroupExportConfigS3Destination extends StObject {
  
  /**
    * The name of the S3 bucket where the raw data of a report are exported.
    */
  var bucket: Input[String] = js.native
  
  /**
    * A boolean value that specifies if the results of a report are encrypted.
    * **Note: the API does not currently allow setting encryption as disabled**
    */
  var encryptionDisabled: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The encryption key for the report's encrypted raw data. The KMS key ARN.
    */
  var encryptionKey: Input[String] = js.native
  
  /**
    * The type of build output artifact to create. Valid values are: `NONE` (default) and `ZIP`.
    */
  var packaging: js.UndefOr[Input[String]] = js.native
  
  /**
    * The path to the exported report's raw data results.
    */
  var path: js.UndefOr[Input[String]] = js.native
}
object ReportGroupExportConfigS3Destination {
  
  @scala.inline
  def apply(bucket: Input[String], encryptionKey: Input[String]): ReportGroupExportConfigS3Destination = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], encryptionKey = encryptionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportGroupExportConfigS3Destination]
  }
  
  @scala.inline
  implicit class ReportGroupExportConfigS3DestinationMutableBuilder[Self <: ReportGroupExportConfigS3Destination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucket(value: Input[String]): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionDisabled(value: Input[Boolean]): Self = StObject.set(x, "encryptionDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionDisabledUndefined: Self = StObject.set(x, "encryptionDisabled", js.undefined)
    
    @scala.inline
    def setEncryptionKey(value: Input[String]): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackaging(value: Input[String]): Self = StObject.set(x, "packaging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackagingUndefined: Self = StObject.set(x, "packaging", js.undefined)
    
    @scala.inline
    def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
