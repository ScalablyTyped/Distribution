package typings.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSource extends StObject {
  
  /**
    * The ARN for the S3 bucket containing the application code.
    */
  var bucketArn: String
  
  /**
    * The file key for the object containing the application code.
    */
  var fileKey: String
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSource {
  
  @scala.inline
  def apply(bucketArn: String, fileKey: String): ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSource = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any], fileKey = fileKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSource]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSourceMutableBuilder[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationReferenceDataSourceS3ReferenceDataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketArn(value: String): Self = StObject.set(x, "bucketArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileKey(value: String): Self = StObject.set(x, "fileKey", value.asInstanceOf[js.Any])
  }
}
