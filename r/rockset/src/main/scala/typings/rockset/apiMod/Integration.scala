package typings.rockset.apiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Integration extends StObject {
  
  /**
    * ISO-8601 date
    * @type {string}
    * @memberof Integration
    */
  var created_at: js.UndefOr[String] = js.undefined
  
  /**
    * email of user who created the integration
    * @type {string}
    * @memberof Integration
    */
  var created_by: String
  
  /**
    * longer explanation for the integration
    * @type {string}
    * @memberof Integration
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Amazon DynamoDB details, must have one of aws_access_key or aws_role
    * @type {DynamodbIntegration}
    * @memberof Integration
    */
  var dynamodb: js.UndefOr[DynamodbIntegration] = js.undefined
  
  /**
    * GCS details
    * @type {GcsIntegration}
    * @memberof Integration
    */
  var gcs: js.UndefOr[GcsIntegration] = js.undefined
  
  /**
    * Kafka details
    * @type {KafkaIntegration}
    * @memberof Integration
    */
  var kafka: js.UndefOr[KafkaIntegration] = js.undefined
  
  /**
    * Amazon Kinesis details, must have one of aws_access_key or aws_role
    * @type {KinesisIntegration}
    * @memberof Integration
    */
  var kinesis: js.UndefOr[KinesisIntegration] = js.undefined
  
  /**
    * MongoDb details
    * @type {MongoDbIntegration}
    * @memberof Integration
    */
  var mongodb: js.UndefOr[MongoDbIntegration] = js.undefined
  
  /**
    * descriptive label and unique identifier
    * @type {string}
    * @memberof Integration
    */
  var name: String
  
  /**
    * Amazon Redshift details
    * @type {RedshiftIntegration}
    * @memberof Integration
    */
  var redshift: js.UndefOr[RedshiftIntegration] = js.undefined
  
  /**
    * Amazon S3 details, must have one of aws_access_key or aws_role
    * @type {S3Integration}
    * @memberof Integration
    */
  var s3: js.UndefOr[S3Integration] = js.undefined
  
  /**
    * Segment details
    * @type {SegmentIntegration}
    * @memberof Integration
    */
  var segment: js.UndefOr[SegmentIntegration] = js.undefined
}
object Integration {
  
  inline def apply(created_by: String, name: String): Integration = {
    val __obj = js.Dynamic.literal(created_by = created_by.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Integration]
  }
  
  extension [Self <: Integration](x: Self) {
    
    inline def setCreated_at(value: String): Self = StObject.set(x, "created_at", value.asInstanceOf[js.Any])
    
    inline def setCreated_atUndefined: Self = StObject.set(x, "created_at", js.undefined)
    
    inline def setCreated_by(value: String): Self = StObject.set(x, "created_by", value.asInstanceOf[js.Any])
    
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
