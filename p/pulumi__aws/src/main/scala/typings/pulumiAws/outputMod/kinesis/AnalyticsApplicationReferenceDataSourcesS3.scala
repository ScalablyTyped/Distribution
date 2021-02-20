package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsApplicationReferenceDataSourcesS3 extends StObject {
  
  /**
    * The S3 Bucket ARN.
    */
  var bucketArn: String = js.native
  
  /**
    * The File Key name containing reference data.
    */
  var fileKey: String = js.native
  
  /**
    * The ARN of the IAM Role used to send application messages.
    */
  var roleArn: String = js.native
}
object AnalyticsApplicationReferenceDataSourcesS3 {
  
  @scala.inline
  def apply(bucketArn: String, fileKey: String, roleArn: String): AnalyticsApplicationReferenceDataSourcesS3 = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any], fileKey = fileKey.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesS3]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationReferenceDataSourcesS3MutableBuilder[Self <: AnalyticsApplicationReferenceDataSourcesS3] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketArn(value: String): Self = StObject.set(x, "bucketArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileKey(value: String): Self = StObject.set(x, "fileKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
