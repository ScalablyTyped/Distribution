package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIntegrationRequest extends StObject {
  
  // longer explanation for the integration
  var description: js.UndefOr[String] = js.undefined
  
  // Amazon DynamoDB details, must have one of aws_access_key or aws_role
  var dynamodb: js.UndefOr[DynamodbIntegration] = js.undefined
  
  // GCS details
  var gcs: js.UndefOr[GcsIntegration] = js.undefined
  
  // Amazon Kinesis details, must have one of aws_access_key or aws_role
  var kinesis: js.UndefOr[KinesisIntegration] = js.undefined
  
  // descriptive label
  var name: String
  
  // Amazon Redshift details
  var redshift: js.UndefOr[RedshiftIntegration] = js.undefined
  
  // Amazon S3 details, must have one of aws_access_key or aws_role
  var s3: js.UndefOr[S3Integration] = js.undefined
}
object CreateIntegrationRequest {
  
  inline def apply(name: String): CreateIntegrationRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIntegrationRequest]
  }
  
  extension [Self <: CreateIntegrationRequest](x: Self) {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDynamodb(value: DynamodbIntegration): Self = StObject.set(x, "dynamodb", value.asInstanceOf[js.Any])
    
    inline def setDynamodbUndefined: Self = StObject.set(x, "dynamodb", js.undefined)
    
    inline def setGcs(value: GcsIntegration): Self = StObject.set(x, "gcs", value.asInstanceOf[js.Any])
    
    inline def setGcsUndefined: Self = StObject.set(x, "gcs", js.undefined)
    
    inline def setKinesis(value: KinesisIntegration): Self = StObject.set(x, "kinesis", value.asInstanceOf[js.Any])
    
    inline def setKinesisUndefined: Self = StObject.set(x, "kinesis", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRedshift(value: RedshiftIntegration): Self = StObject.set(x, "redshift", value.asInstanceOf[js.Any])
    
    inline def setRedshiftUndefined: Self = StObject.set(x, "redshift", js.undefined)
    
    inline def setS3(value: S3Integration): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    inline def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
  }
}
