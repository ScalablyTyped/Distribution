package typings.pulumiAws.inputMod.ssm

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceDataSyncS3Destination extends StObject {
  
  /**
    * Name of S3 bucket where the aggregated data is stored.
    */
  var bucketName: Input[String]
  
  /**
    * ARN of an encryption key for a destination in Amazon S3.
    */
  var kmsKeyArn: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Prefix for the bucket.
    */
  var prefix: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Region with the bucket targeted by the Resource Data Sync.
    */
  var region: Input[String]
  
  /**
    * A supported sync format. Only JsonSerDe is currently supported. Defaults to JsonSerDe.
    */
  var syncFormat: js.UndefOr[Input[String]] = js.undefined
}
object ResourceDataSyncS3Destination {
  
  inline def apply(bucketName: Input[String], region: Input[String]): ResourceDataSyncS3Destination = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDataSyncS3Destination]
  }
  
  extension [Self <: ResourceDataSyncS3Destination](x: Self) {
    
    inline def setBucketName(value: Input[String]): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArn(value: Input[String]): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
    
    inline def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
    
    inline def setPrefix(value: Input[String]): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setRegion(value: Input[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setSyncFormat(value: Input[String]): Self = StObject.set(x, "syncFormat", value.asInstanceOf[js.Any])
    
    inline def setSyncFormatUndefined: Self = StObject.set(x, "syncFormat", js.undefined)
  }
}
