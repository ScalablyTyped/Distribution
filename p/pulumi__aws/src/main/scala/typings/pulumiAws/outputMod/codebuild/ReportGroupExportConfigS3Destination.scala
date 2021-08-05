package typings.pulumiAws.outputMod.codebuild

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportGroupExportConfigS3Destination extends StObject {
  
  /**
    * The name of the S3 bucket where the raw data of a report are exported.
    */
  var bucket: String
  
  /**
    * A boolean value that specifies if the results of a report are encrypted.
    * **Note: the API does not currently allow setting encryption as disabled**
    */
  var encryptionDisabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The encryption key for the report's encrypted raw data. The KMS key ARN.
    */
  var encryptionKey: String
  
  /**
    * The type of build output artifact to create. Valid values are: `NONE` (default) and `ZIP`.
    */
  var packaging: js.UndefOr[String] = js.undefined
  
  /**
    * The path to the exported report's raw data results.
    */
  var path: js.UndefOr[String] = js.undefined
}
object ReportGroupExportConfigS3Destination {
  
  inline def apply(bucket: String, encryptionKey: String): ReportGroupExportConfigS3Destination = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], encryptionKey = encryptionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReportGroupExportConfigS3Destination]
  }
  
  extension [Self <: ReportGroupExportConfigS3Destination](x: Self) {
    
    inline def setBucket(value: String): Self = StObject.set(x, "bucket", value.asInstanceOf[js.Any])
    
    inline def setEncryptionDisabled(value: Boolean): Self = StObject.set(x, "encryptionDisabled", value.asInstanceOf[js.Any])
    
    inline def setEncryptionDisabledUndefined: Self = StObject.set(x, "encryptionDisabled", js.undefined)
    
    inline def setEncryptionKey(value: String): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    inline def setPackaging(value: String): Self = StObject.set(x, "packaging", value.asInstanceOf[js.Any])
    
    inline def setPackagingUndefined: Self = StObject.set(x, "packaging", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
