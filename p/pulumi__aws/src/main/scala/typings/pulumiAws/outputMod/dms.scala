package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dms {
  
  trait EndpointElasticsearchSettings extends StObject {
    
    /**
      * Endpoint for the Elasticsearch cluster.
      */
    var endpointUri: String
    
    /**
      * Maximum number of seconds for which DMS retries failed API requests to the Elasticsearch cluster. Defaults to `300`.
      */
    var errorRetryDuration: js.UndefOr[Double] = js.undefined
    
    /**
      * Maximum percentage of records that can fail to be written before a full load operation stops. Defaults to `10`.
      */
    var fullLoadErrorPercentage: js.UndefOr[Double] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of the IAM Role with permissions to write to the Elasticsearch cluster.
      */
    var serviceAccessRoleArn: String
  }
  object EndpointElasticsearchSettings {
    
    inline def apply(endpointUri: String, serviceAccessRoleArn: String): EndpointElasticsearchSettings = {
      val __obj = js.Dynamic.literal(endpointUri = endpointUri.asInstanceOf[js.Any], serviceAccessRoleArn = serviceAccessRoleArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointElasticsearchSettings]
    }
    
    extension [Self <: EndpointElasticsearchSettings](x: Self) {
      
      inline def setEndpointUri(value: String): Self = StObject.set(x, "endpointUri", value.asInstanceOf[js.Any])
      
      inline def setErrorRetryDuration(value: Double): Self = StObject.set(x, "errorRetryDuration", value.asInstanceOf[js.Any])
      
      inline def setErrorRetryDurationUndefined: Self = StObject.set(x, "errorRetryDuration", js.undefined)
      
      inline def setFullLoadErrorPercentage(value: Double): Self = StObject.set(x, "fullLoadErrorPercentage", value.asInstanceOf[js.Any])
      
      inline def setFullLoadErrorPercentageUndefined: Self = StObject.set(x, "fullLoadErrorPercentage", js.undefined)
      
      inline def setServiceAccessRoleArn(value: String): Self = StObject.set(x, "serviceAccessRoleArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait EndpointKafkaSettings extends StObject {
    
    /**
      * Kafka broker location. Specify in the form broker-hostname-or-ip:port.
      */
    var broker: String
    
    /**
      * Kafka topic for migration. Defaults to `kafka-default-topic`.
      */
    var topic: js.UndefOr[String] = js.undefined
  }
  object EndpointKafkaSettings {
    
    inline def apply(broker: String): EndpointKafkaSettings = {
      val __obj = js.Dynamic.literal(broker = broker.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointKafkaSettings]
    }
    
    extension [Self <: EndpointKafkaSettings](x: Self) {
      
      inline def setBroker(value: String): Self = StObject.set(x, "broker", value.asInstanceOf[js.Any])
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      inline def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    }
  }
  
  trait EndpointKinesisSettings extends StObject {
    
    /**
      * Output format for the records created. Defaults to `json`. Valid values are `json` and `jsonUnformatted` (a single line with no tab).
      */
    var messageFormat: js.UndefOr[String] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of the IAM Role with permissions to write to the Kinesis data stream.
      */
    var serviceAccessRoleArn: js.UndefOr[String] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of the Kinesis data stream.
      */
    var streamArn: js.UndefOr[String] = js.undefined
  }
  object EndpointKinesisSettings {
    
    inline def apply(): EndpointKinesisSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointKinesisSettings]
    }
    
    extension [Self <: EndpointKinesisSettings](x: Self) {
      
      inline def setMessageFormat(value: String): Self = StObject.set(x, "messageFormat", value.asInstanceOf[js.Any])
      
      inline def setMessageFormatUndefined: Self = StObject.set(x, "messageFormat", js.undefined)
      
      inline def setServiceAccessRoleArn(value: String): Self = StObject.set(x, "serviceAccessRoleArn", value.asInstanceOf[js.Any])
      
      inline def setServiceAccessRoleArnUndefined: Self = StObject.set(x, "serviceAccessRoleArn", js.undefined)
      
      inline def setStreamArn(value: String): Self = StObject.set(x, "streamArn", value.asInstanceOf[js.Any])
      
      inline def setStreamArnUndefined: Self = StObject.set(x, "streamArn", js.undefined)
    }
  }
  
  trait EndpointMongodbSettings extends StObject {
    
    /**
      * Authentication mechanism to access the MongoDB source endpoint. Defaults to `default`.
      */
    var authMechanism: js.UndefOr[String] = js.undefined
    
    /**
      * Authentication database name. Not used when `authType` is `no`. Defaults to `admin`.
      */
    var authSource: js.UndefOr[String] = js.undefined
    
    /**
      * Authentication type to access the MongoDB source endpoint. Defaults to `password`.
      */
    var authType: js.UndefOr[String] = js.undefined
    
    /**
      * Number of documents to preview to determine the document organization. Use this setting when `nestingLevel` is set to `one`. Defaults to `1000`.
      */
    var docsToInvestigate: js.UndefOr[String] = js.undefined
    
    /**
      * Document ID. Use this setting when `nestingLevel` is set to `none`. Defaults to `false`.
      */
    var extractDocId: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies either document or table mode. Defaults to `none`. Valid values are `one` (table mode) and `none` (document mode).
      */
    var nestingLevel: js.UndefOr[String] = js.undefined
  }
  object EndpointMongodbSettings {
    
    inline def apply(): EndpointMongodbSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointMongodbSettings]
    }
    
    extension [Self <: EndpointMongodbSettings](x: Self) {
      
      inline def setAuthMechanism(value: String): Self = StObject.set(x, "authMechanism", value.asInstanceOf[js.Any])
      
      inline def setAuthMechanismUndefined: Self = StObject.set(x, "authMechanism", js.undefined)
      
      inline def setAuthSource(value: String): Self = StObject.set(x, "authSource", value.asInstanceOf[js.Any])
      
      inline def setAuthSourceUndefined: Self = StObject.set(x, "authSource", js.undefined)
      
      inline def setAuthType(value: String): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
      
      inline def setAuthTypeUndefined: Self = StObject.set(x, "authType", js.undefined)
      
      inline def setDocsToInvestigate(value: String): Self = StObject.set(x, "docsToInvestigate", value.asInstanceOf[js.Any])
      
      inline def setDocsToInvestigateUndefined: Self = StObject.set(x, "docsToInvestigate", js.undefined)
      
      inline def setExtractDocId(value: String): Self = StObject.set(x, "extractDocId", value.asInstanceOf[js.Any])
      
      inline def setExtractDocIdUndefined: Self = StObject.set(x, "extractDocId", js.undefined)
      
      inline def setNestingLevel(value: String): Self = StObject.set(x, "nestingLevel", value.asInstanceOf[js.Any])
      
      inline def setNestingLevelUndefined: Self = StObject.set(x, "nestingLevel", js.undefined)
    }
  }
  
  trait EndpointS3Settings extends StObject {
    
    /**
      * S3 Bucket Object prefix.
      */
    var bucketFolder: js.UndefOr[String] = js.undefined
    
    /**
      * S3 Bucket name.
      */
    var bucketName: js.UndefOr[String] = js.undefined
    
    /**
      * Set to compress target files. Defaults to `NONE`. Valid values are `GZIP` and `NONE`.
      */
    var compressionType: js.UndefOr[String] = js.undefined
    
    /**
      * Delimiter used to separate columns in the source files. Defaults to `,`.
      */
    var csvDelimiter: js.UndefOr[String] = js.undefined
    
    /**
      * Delimiter used to separate rows in the source files. Defaults to `\n`.
      */
    var csvRowDelimiter: js.UndefOr[String] = js.undefined
    
    /**
      * JSON document that describes how AWS DMS should interpret the data.
      */
    var externalTableDefinition: js.UndefOr[String] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of the IAM Role with permissions to read from or write to the S3 Bucket.
      */
    var serviceAccessRoleArn: js.UndefOr[String] = js.undefined
  }
  object EndpointS3Settings {
    
    inline def apply(): EndpointS3Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointS3Settings]
    }
    
    extension [Self <: EndpointS3Settings](x: Self) {
      
      inline def setBucketFolder(value: String): Self = StObject.set(x, "bucketFolder", value.asInstanceOf[js.Any])
      
      inline def setBucketFolderUndefined: Self = StObject.set(x, "bucketFolder", js.undefined)
      
      inline def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
      
      inline def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
      
      inline def setCompressionType(value: String): Self = StObject.set(x, "compressionType", value.asInstanceOf[js.Any])
      
      inline def setCompressionTypeUndefined: Self = StObject.set(x, "compressionType", js.undefined)
      
      inline def setCsvDelimiter(value: String): Self = StObject.set(x, "csvDelimiter", value.asInstanceOf[js.Any])
      
      inline def setCsvDelimiterUndefined: Self = StObject.set(x, "csvDelimiter", js.undefined)
      
      inline def setCsvRowDelimiter(value: String): Self = StObject.set(x, "csvRowDelimiter", value.asInstanceOf[js.Any])
      
      inline def setCsvRowDelimiterUndefined: Self = StObject.set(x, "csvRowDelimiter", js.undefined)
      
      inline def setExternalTableDefinition(value: String): Self = StObject.set(x, "externalTableDefinition", value.asInstanceOf[js.Any])
      
      inline def setExternalTableDefinitionUndefined: Self = StObject.set(x, "externalTableDefinition", js.undefined)
      
      inline def setServiceAccessRoleArn(value: String): Self = StObject.set(x, "serviceAccessRoleArn", value.asInstanceOf[js.Any])
      
      inline def setServiceAccessRoleArnUndefined: Self = StObject.set(x, "serviceAccessRoleArn", js.undefined)
    }
  }
}
