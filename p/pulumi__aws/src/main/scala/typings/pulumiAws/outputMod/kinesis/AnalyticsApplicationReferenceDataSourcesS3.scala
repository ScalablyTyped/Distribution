package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationReferenceDataSourcesS3 extends StObject {
  
  /**
    * The S3 Bucket ARN.
    */
  var bucketArn: String
  
  /**
    * The File Key name containing reference data.
    */
  var fileKey: String
  
  /**
    * The ARN of the IAM Role used to send application messages.
    */
  var roleArn: String
}
object AnalyticsApplicationReferenceDataSourcesS3 {
  
  inline def apply(bucketArn: String, fileKey: String, roleArn: String): AnalyticsApplicationReferenceDataSourcesS3 = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any], fileKey = fileKey.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesS3]
  }
  
  extension [Self <: AnalyticsApplicationReferenceDataSourcesS3](x: Self) {
    
    inline def setBucketArn(value: String): Self = StObject.set(x, "bucketArn", value.asInstanceOf[js.Any])
    
    inline def setFileKey(value: String): Self = StObject.set(x, "fileKey", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
