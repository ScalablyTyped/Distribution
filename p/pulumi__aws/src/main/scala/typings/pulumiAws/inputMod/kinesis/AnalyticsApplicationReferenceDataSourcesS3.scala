package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationReferenceDataSourcesS3 extends StObject {
  
  /**
    * The S3 Bucket ARN.
    */
  var bucketArn: Input[String]
  
  /**
    * The File Key name containing reference data.
    */
  var fileKey: Input[String]
  
  /**
    * The ARN of the IAM Role used to send application messages.
    */
  var roleArn: Input[String]
}
object AnalyticsApplicationReferenceDataSourcesS3 {
  
  inline def apply(bucketArn: Input[String], fileKey: Input[String], roleArn: Input[String]): AnalyticsApplicationReferenceDataSourcesS3 = {
    val __obj = js.Dynamic.literal(bucketArn = bucketArn.asInstanceOf[js.Any], fileKey = fileKey.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationReferenceDataSourcesS3]
  }
  
  extension [Self <: AnalyticsApplicationReferenceDataSourcesS3](x: Self) {
    
    inline def setBucketArn(value: Input[String]): Self = StObject.set(x, "bucketArn", value.asInstanceOf[js.Any])
    
    inline def setFileKey(value: Input[String]): Self = StObject.set(x, "fileKey", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
  }
}
