package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Integration extends StObject {
  
  // ISO-8601 date
  var created_at: js.UndefOr[String] = js.undefined
  
  // email of user who created the integration
  var created_by: String
  
  // longer explanation for the integration
  var description: js.UndefOr[String] = js.undefined
  
  // Amazon DynamoDB details, must have one of aws_access_key or aws_role
  var dynamodb: js.UndefOr[DynamodbIntegration] = js.undefined
  
  // GCS details
  var gcs: js.UndefOr[GcsIntegration] = js.undefined
  
  // Amazon Kinesis details, must have one of aws_access_key or aws_role
  var kinesis: js.UndefOr[KinesisIntegration] = js.undefined
  
  // descriptive label and unique identifier
  var name: String
  
  // Amazon Redshift details
  var redshift: js.UndefOr[RedshiftIntegration] = js.undefined
  
  // Amazon S3 details, must have one of aws_access_key or aws_role
  var s3: js.UndefOr[S3Integration] = js.undefined
}
object Integration {
  
  @scala.inline
  def apply(created_by: String, name: String): Integration = {
    val __obj = js.Dynamic.literal(created_by = created_by.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Integration]
  }
  
  @scala.inline
  implicit class IntegrationMutableBuilder[Self <: Integration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    @scala.inline
    def setCreated_by(value: String): Self = StObject.set(x, "created_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setDynamodb(value: DynamodbIntegration): Self = StObject.set(x, "dynamodb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDynamodbUndefined: Self = StObject.set(x, "dynamodb", js.undefined)
    
    @scala.inline
    def setGcs(value: GcsIntegration): Self = StObject.set(x, "gcs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGcsUndefined: Self = StObject.set(x, "gcs", js.undefined)
    
    @scala.inline
    def setKinesis(value: KinesisIntegration): Self = StObject.set(x, "kinesis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisUndefined: Self = StObject.set(x, "kinesis", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedshift(value: RedshiftIntegration): Self = StObject.set(x, "redshift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedshiftUndefined: Self = StObject.set(x, "redshift", js.undefined)
    
    @scala.inline
    def setS3(value: S3Integration): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
  }
}
