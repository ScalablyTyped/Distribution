package typings.pulumiAws.outputMod.ssm

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResourceDataSyncS3Destination extends StObject {
  
  /**
    * Name of S3 bucket where the aggregated data is stored.
    */
  var bucketName: String
  
  /**
    * ARN of an encryption key for a destination in Amazon S3.
    */
  var kmsKeyArn: js.UndefOr[String] = js.undefined
  
  /**
    * Prefix for the bucket.
    */
  var prefix: js.UndefOr[String] = js.undefined
  
  /**
    * Region with the bucket targeted by the Resource Data Sync.
    */
  var region: String
  
  /**
    * A supported sync format. Only JsonSerDe is currently supported. Defaults to JsonSerDe.
    */
  var syncFormat: js.UndefOr[String] = js.undefined
}
object ResourceDataSyncS3Destination {
  
  @scala.inline
  def apply(bucketName: String, region: String): ResourceDataSyncS3Destination = {
    val __obj = js.Dynamic.literal(bucketName = bucketName.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceDataSyncS3Destination]
  }
  
  @scala.inline
  implicit class ResourceDataSyncS3DestinationMutableBuilder[Self <: ResourceDataSyncS3Destination] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyArn(value: String): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    @scala.inline
    def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncFormat(value: String): Self = StObject.set(x, "syncFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncFormatUndefined: Self = StObject.set(x, "syncFormat", js.undefined)
  }
}
