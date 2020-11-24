package typings.pulumiAws.outputMod.kinesisanalyticsv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation extends js.Object {
  
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
  implicit class ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocationOps[Self <: ApplicationApplicationConfigurationApplicationCodeConfigurationCodeContentS3ContentLocation] (val x: Self) extends AnyVal {
    
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
    def setBucketArn(value: String): Self = this.set("bucketArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileKey(value: String): Self = this.set("fileKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectVersion(value: String): Self = this.set("objectVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectVersion: Self = this.set("objectVersion", js.undefined)
  }
}
