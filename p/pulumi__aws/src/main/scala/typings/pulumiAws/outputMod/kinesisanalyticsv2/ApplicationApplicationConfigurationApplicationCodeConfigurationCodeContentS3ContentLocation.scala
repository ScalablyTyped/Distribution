package typings.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation extends StObject {
  
  /**
    * The ARN for the S3 bucket containing the application code.
    */
  var bucketArn: String
  
  /**
    * The file key for the object containing the application code.
    */
  var fileKey: String
  
  /**
    * The version of the object containing the application code.
    */
  var objectVersion: js.UndefOr[String] = js.undefined
}
object ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation {
  
  inline def apply(bucketArn: String, fileKey: String): ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any], fileKey = fileKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation]
  }
  
  extension [Self <: ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation](x: Self) {
    
    inline def setBucketArn(value: String): Self = StObject.set(x, "bucketArn", value.asInstanceOf[js.Any])
    
    inline def setFileKey(value: String): Self = StObject.set(x, "fileKey", value.asInstanceOf[js.Any])
    
    inline def setObjectVersion(value: String): Self = StObject.set(x, "objectVersion", value.asInstanceOf[js.Any])
    
    inline def setObjectVersionUndefined: Self = StObject.set(x, "objectVersion", js.undefined)
  }
}
