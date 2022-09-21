package typings.rockset.apiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Source extends StObject {
  
  /**
    * configuration for ingestion from  a dynamodb table
    * @type {SourceDynamoDb}
    * @memberof Source
    */
  var dynamodb: js.UndefOr[SourceDynamoDb] = js.undefined
  
  /**
    * file upload details
    * @type {SourceFileUpload}
    * @memberof Source
    */
  var file_upload: js.UndefOr[SourceFileUpload] = js.undefined
  
  /**
    * format parameters for data from this source
    * @type {FormatParams}
    * @memberof Source
    */
  var format_params: js.UndefOr[FormatParams] = js.undefined
  
  /**
    * configuration for ingestion from GCS
    * @type {SourceGcs}
    * @memberof Source
    */
  var gcs: js.UndefOr[SourceGcs] = js.undefined
  
  /**
    * name of integration to use
    * @type {string}
    * @memberof Source
    */
  var integration_name: String
  
  /**
    * kafka collection identifier
    * @type {SourceKafka}
    * @memberof Source
    */
  var kafka: js.UndefOr[SourceKafka] = js.undefined
  
  /**
    * configuration for ingestion from kinesis stream
    * @type {SourceKinesis}
    * @memberof Source
    */
  var kinesis: js.UndefOr[SourceKinesis] = js.undefined
  
  /**
    * MongoDB collection details
    * @type {SourceMongoDb}
    * @memberof Source
    */
  var mongodb: js.UndefOr[SourceMongoDb] = js.undefined
  
  /**
    * configuration for ingestion from Redshift
    * @type {SourceRedshift}
    * @memberof Source
    */
  var redshift: js.UndefOr[SourceRedshift] = js.undefined
  
  /**
    * configuration for ingestion from S3
    * @type {SourceS3}
    * @memberof Source
    */
  var s3: js.UndefOr[SourceS3] = js.undefined
  
  /**
    * the ingest status of this source
    * @type {Status}
    * @memberof Source
    */
  var status: js.UndefOr[Status] = js.undefined
}
object Source {
  
  inline def apply(integration_name: String): Source = {
    val __obj = js.Dynamic.literal(integration_name = integration_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  extension [Self <: Source](x: Self) {
    
    inline def setDynamodb(value: SourceDynamoDb): Self = StObject.set(x, "dynamodb", value.asInstanceOf[js.Any])
    
    inline def setDynamodbUndefined: Self = StObject.set(x, "dynamodb", js.undefined)
    
    inline def setFile_upload(value: SourceFileUpload): Self = StObject.set(x, "file_upload", value.asInstanceOf[js.Any])
    
    inline def setFile_uploadUndefined: Self = StObject.set(x, "file_upload", js.undefined)
    
    inline def setFormat_params(value: FormatParams): Self = StObject.set(x, "format_params", value.asInstanceOf[js.Any])
    
    inline def setFormat_paramsUndefined: Self = StObject.set(x, "format_params", js.undefined)
    
    inline def setGcs(value: SourceGcs): Self = StObject.set(x, "gcs", value.asInstanceOf[js.Any])
    
    inline def setGcsUndefined: Self = StObject.set(x, "gcs", js.undefined)
    
    inline def setIntegration_name(value: String): Self = StObject.set(x, "integration_name", value.asInstanceOf[js.Any])
    
    inline def setKafka(value: SourceKafka): Self = StObject.set(x, "kafka", value.asInstanceOf[js.Any])
    
    inline def setKafkaUndefined: Self = StObject.set(x, "kafka", js.undefined)
    
    inline def setKinesis(value: SourceKinesis): Self = StObject.set(x, "kinesis", value.asInstanceOf[js.Any])
    
    inline def setKinesisUndefined: Self = StObject.set(x, "kinesis", js.undefined)
    
    inline def setMongodb(value: SourceMongoDb): Self = StObject.set(x, "mongodb", value.asInstanceOf[js.Any])
    
    inline def setMongodbUndefined: Self = StObject.set(x, "mongodb", js.undefined)
    
    inline def setRedshift(value: SourceRedshift): Self = StObject.set(x, "redshift", value.asInstanceOf[js.Any])
    
    inline def setRedshiftUndefined: Self = StObject.set(x, "redshift", js.undefined)
    
    inline def setS3(value: SourceS3): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    inline def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
