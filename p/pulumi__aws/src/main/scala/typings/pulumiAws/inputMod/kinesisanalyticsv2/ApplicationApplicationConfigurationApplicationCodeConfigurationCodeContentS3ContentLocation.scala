package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation extends StObject {
  
  /**
    * The ARN for the S3 bucket containing the application code.
    */
  var bucketArn: Input[String]
  
  /**
    * The file key for the object containing the application code.
    */
  var fileKey: Input[String]
  
  /**
    * The version of the object containing the application code.
    */
  var objectVersion: js.UndefOr[Input[String]] = js.undefined
}
object ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation {
  
  inline def apply(bucketArn: Input[String], fileKey: Input[String]): ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any], fileKey = fileKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation]
  }
  
  extension [Self <: ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation](x: Self) {
    
    inline def setBucketArn(value: Input[String]): Self = StObject.set(x, "bucketArn", value.asInstanceOf[js.Any])
    
    inline def setFileKey(value: Input[String]): Self = StObject.set(x, "fileKey", value.asInstanceOf[js.Any])
    
    inline def setObjectVersion(value: Input[String]): Self = StObject.set(x, "objectVersion", value.asInstanceOf[js.Any])
    
    inline def setObjectVersionUndefined: Self = StObject.set(x, "objectVersion", js.undefined)
  }
}
