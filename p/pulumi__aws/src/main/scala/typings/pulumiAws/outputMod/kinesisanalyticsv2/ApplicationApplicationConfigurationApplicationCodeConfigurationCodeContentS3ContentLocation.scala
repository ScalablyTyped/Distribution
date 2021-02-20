package typings.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation extends StObject {
  
  /**
    * The ARN for the S3 bucket containing the application code.
    */
  var bucketArn: String = js.native
  
  /**
    * The file key for the object containing the application code.
    */
  var fileKey: String = js.native
  
  /**
    * The version of the object containing the application code.
    */
  var objectVersion: js.UndefOr[String] = js.native
}
object ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation {
  
  @scala.inline
  def apply(bucketArn: String, fileKey: String): ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any], fileKey = fileKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationMutableBuilder[Self <: ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketArn(value: String): Self = StObject.set(x, "bucketArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileKey(value: String): Self = StObject.set(x, "fileKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectVersion(value: String): Self = StObject.set(x, "objectVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectVersionUndefined: Self = StObject.set(x, "objectVersion", js.undefined)
  }
}
