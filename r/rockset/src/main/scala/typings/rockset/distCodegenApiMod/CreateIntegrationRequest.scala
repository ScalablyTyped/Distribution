package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIntegrationRequest extends StObject {
  
  /**
    * longer explanation for the integration
    * @type {string}
    * @memberof CreateIntegrationRequest
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Amazon DynamoDB details, must have one of aws_access_key or aws_role
    * @type {DynamodbIntegration}
    * @memberof CreateIntegrationRequest
    */
  var dynamodb: js.UndefOr[DynamodbIntegration] = js.undefined
  
  /**
    * GCS details
    * @type {GcsIntegration}
    * @memberof CreateIntegrationRequest
    */
  var gcs: js.UndefOr[GcsIntegration] = js.undefined
  
  /**
    *
    * @type {KafkaIntegration}
    * @memberof CreateIntegrationRequest
    */
  var kafka: js.UndefOr[KafkaIntegration] = js.undefined
  
  /**
    * Amazon Kinesis details, must have one of aws_access_key or aws_role
    * @type {KinesisIntegration}
    * @memberof CreateIntegrationRequest
    */
  var kinesis: js.UndefOr[KinesisIntegration] = js.undefined
  
  /**
    * MongoDb details
    * @type {MongoDbIntegration}
    * @memberof CreateIntegrationRequest
    */
  var mongodb: js.UndefOr[MongoDbIntegration] = js.undefined
  
  /**
    * descriptive label
    * @type {string}
    * @memberof CreateIntegrationRequest
    */
  var name: String
  
  /**
    * Amazon Redshift details
    * @type {RedshiftIntegration}
    * @memberof CreateIntegrationRequest
    */
  var redshift: js.UndefOr[RedshiftIntegration] = js.undefined
  
  /**
    * Amazon S3 details, must have one of aws_access_key or aws_role
    * @type {S3Integration}
    * @memberof CreateIntegrationRequest
    */
  var s3: js.UndefOr[S3Integration] = js.undefined
  
  /**
    *
    * @type {SegmentIntegration}
    * @memberof CreateIntegrationRequest
    */
  var segment: js.UndefOr[SegmentIntegration] = js.undefined
}
object CreateIntegrationRequest {
  
  inline def apply(name: String): CreateIntegrationRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIntegrationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateIntegrationRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDynamodb(value: DynamodbIntegration): Self = StObject.set(x, "dynamodb", value.asInstanceOf[js.Any])
    
    inline def setDynamodbUndefined: Self = StObject.set(x, "dynamodb", js.undefined)
    
    inline def setGcs(value: GcsIntegration): Self = StObject.set(x, "gcs", value.asInstanceOf[js.Any])
    
    inline def setGcsUndefined: Self = StObject.set(x, "gcs", js.undefined)
    
    inline def setKafka(value: KafkaIntegration): Self = StObject.set(x, "kafka", value.asInstanceOf[js.Any])
    
    inline def setKafkaUndefined: Self = StObject.set(x, "kafka", js.undefined)
    
    inline def setKinesis(value: KinesisIntegration): Self = StObject.set(x, "kinesis", value.asInstanceOf[js.Any])
    
    inline def setKinesisUndefined: Self = StObject.set(x, "kinesis", js.undefined)
    
    inline def setMongodb(value: MongoDbIntegration): Self = StObject.set(x, "mongodb", value.asInstanceOf[js.Any])
    
    inline def setMongodbUndefined: Self = StObject.set(x, "mongodb", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRedshift(value: RedshiftIntegration): Self = StObject.set(x, "redshift", value.asInstanceOf[js.Any])
    
    inline def setRedshiftUndefined: Self = StObject.set(x, "redshift", js.undefined)
    
    inline def setS3(value: S3Integration): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    inline def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
    
    inline def setSegment(value: SegmentIntegration): Self = StObject.set(x, "segment", value.asInstanceOf[js.Any])
    
    inline def setSegmentUndefined: Self = StObject.set(x, "segment", js.undefined)
  }
}
