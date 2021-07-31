package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dms {
  
  trait EndpointElasticsearchSettings extends StObject {
    
    /**
      * Endpoint for the Elasticsearch cluster.
      */
    var endpointUri: Input[String]
    
    /**
      * Maximum number of seconds for which DMS retries failed API requests to the Elasticsearch cluster. Defaults to `300`.
      */
    var errorRetryDuration: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Maximum percentage of records that can fail to be written before a full load operation stops. Defaults to `10`.
      */
    var fullLoadErrorPercentage: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of the IAM Role with permissions to write to the Elasticsearch cluster.
      */
    var serviceAccessRoleArn: Input[String]
  }
  object EndpointElasticsearchSettings {
    
    @scala.inline
    def apply(endpointUri: Input[String], serviceAccessRoleArn: Input[String]): EndpointElasticsearchSettings = {
      val __obj = js.Dynamic.literal(endpointUri = endpointUri.asInstanceOf[js.Any], serviceAccessRoleArn = serviceAccessRoleArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointElasticsearchSettings]
    }
    
    @scala.inline
    implicit class EndpointElasticsearchSettingsMutableBuilder[Self <: EndpointElasticsearchSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEndpointUri(value: Input[String]): Self = StObject.set(x, "endpointUri", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorRetryDuration(value: Input[Double]): Self = StObject.set(x, "errorRetryDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorRetryDurationUndefined: Self = StObject.set(x, "errorRetryDuration", js.undefined)
      
      @scala.inline
      def setFullLoadErrorPercentage(value: Input[Double]): Self = StObject.set(x, "fullLoadErrorPercentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFullLoadErrorPercentageUndefined: Self = StObject.set(x, "fullLoadErrorPercentage", js.undefined)
      
      @scala.inline
      def setServiceAccessRoleArn(value: Input[String]): Self = StObject.set(x, "serviceAccessRoleArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait EndpointKafkaSettings extends StObject {
    
    /**
      * Kafka broker location. Specify in the form broker-hostname-or-ip:port.
      */
    var broker: Input[String]
    
    /**
      * Kafka topic for migration. Defaults to `kafka-default-topic`.
      */
    var topic: js.UndefOr[Input[String]] = js.undefined
  }
  object EndpointKafkaSettings {
    
    @scala.inline
    def apply(broker: Input[String]): EndpointKafkaSettings = {
      val __obj = js.Dynamic.literal(broker = broker.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndpointKafkaSettings]
    }
    
    @scala.inline
    implicit class EndpointKafkaSettingsMutableBuilder[Self <: EndpointKafkaSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBroker(value: Input[String]): Self = StObject.set(x, "broker", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopic(value: Input[String]): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTopicUndefined: Self = StObject.set(x, "topic", js.undefined)
    }
  }
  
  trait EndpointKinesisSettings extends StObject {
    
    /**
      * Output format for the records created. Defaults to `json`. Valid values are `json` and `jsonUnformatted` (a single line with no tab).
      */
    var messageFormat: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of the IAM Role with permissions to write to the Kinesis data stream.
      */
    var serviceAccessRoleArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of the Kinesis data stream.
      */
    var streamArn: js.UndefOr[Input[String]] = js.undefined
  }
  object EndpointKinesisSettings {
    
    @scala.inline
    def apply(): EndpointKinesisSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointKinesisSettings]
    }
    
    @scala.inline
    implicit class EndpointKinesisSettingsMutableBuilder[Self <: EndpointKinesisSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessageFormat(value: Input[String]): Self = StObject.set(x, "messageFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageFormatUndefined: Self = StObject.set(x, "messageFormat", js.undefined)
      
      @scala.inline
      def setServiceAccessRoleArn(value: Input[String]): Self = StObject.set(x, "serviceAccessRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceAccessRoleArnUndefined: Self = StObject.set(x, "serviceAccessRoleArn", js.undefined)
      
      @scala.inline
      def setStreamArn(value: Input[String]): Self = StObject.set(x, "streamArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStreamArnUndefined: Self = StObject.set(x, "streamArn", js.undefined)
    }
  }
  
  trait EndpointMongodbSettings extends StObject {
    
    /**
      * Authentication mechanism to access the MongoDB source endpoint. Defaults to `default`.
      */
    var authMechanism: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Authentication database name. Not used when `authType` is `no`. Defaults to `admin`.
      */
    var authSource: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Authentication type to access the MongoDB source endpoint. Defaults to `password`.
      */
    var authType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Number of documents to preview to determine the document organization. Use this setting when `nestingLevel` is set to `one`. Defaults to `1000`.
      */
    var docsToInvestigate: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Document ID. Use this setting when `nestingLevel` is set to `none`. Defaults to `false`.
      */
    var extractDocId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Specifies either document or table mode. Defaults to `none`. Valid values are `one` (table mode) and `none` (document mode).
      */
    var nestingLevel: js.UndefOr[Input[String]] = js.undefined
  }
  object EndpointMongodbSettings {
    
    @scala.inline
    def apply(): EndpointMongodbSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointMongodbSettings]
    }
    
    @scala.inline
    implicit class EndpointMongodbSettingsMutableBuilder[Self <: EndpointMongodbSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthMechanism(value: Input[String]): Self = StObject.set(x, "authMechanism", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthMechanismUndefined: Self = StObject.set(x, "authMechanism", js.undefined)
      
      @scala.inline
      def setAuthSource(value: Input[String]): Self = StObject.set(x, "authSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthSourceUndefined: Self = StObject.set(x, "authSource", js.undefined)
      
      @scala.inline
      def setAuthType(value: Input[String]): Self = StObject.set(x, "authType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthTypeUndefined: Self = StObject.set(x, "authType", js.undefined)
      
      @scala.inline
      def setDocsToInvestigate(value: Input[String]): Self = StObject.set(x, "docsToInvestigate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocsToInvestigateUndefined: Self = StObject.set(x, "docsToInvestigate", js.undefined)
      
      @scala.inline
      def setExtractDocId(value: Input[String]): Self = StObject.set(x, "extractDocId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtractDocIdUndefined: Self = StObject.set(x, "extractDocId", js.undefined)
      
      @scala.inline
      def setNestingLevel(value: Input[String]): Self = StObject.set(x, "nestingLevel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNestingLevelUndefined: Self = StObject.set(x, "nestingLevel", js.undefined)
    }
  }
  
  trait EndpointS3Settings extends StObject {
    
    /**
      * S3 Bucket Object prefix.
      */
    var bucketFolder: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * S3 Bucket name.
      */
    var bucketName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Set to compress target files. Defaults to `NONE`. Valid values are `GZIP` and `NONE`.
      */
    var compressionType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Delimiter used to separate columns in the source files. Defaults to `,`.
      */
    var csvDelimiter: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Delimiter used to separate rows in the source files. Defaults to `\n`.
      */
    var csvRowDelimiter: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * JSON document that describes how AWS DMS should interpret the data.
      */
    var externalTableDefinition: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of the IAM Role with permissions to read from or write to the S3 Bucket.
      */
    var serviceAccessRoleArn: js.UndefOr[Input[String]] = js.undefined
  }
  object EndpointS3Settings {
    
    @scala.inline
    def apply(): EndpointS3Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EndpointS3Settings]
    }
    
    @scala.inline
    implicit class EndpointS3SettingsMutableBuilder[Self <: EndpointS3Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBucketFolder(value: Input[String]): Self = StObject.set(x, "bucketFolder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketFolderUndefined: Self = StObject.set(x, "bucketFolder", js.undefined)
      
      @scala.inline
      def setBucketName(value: Input[String]): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBucketNameUndefined: Self = StObject.set(x, "bucketName", js.undefined)
      
      @scala.inline
      def setCompressionType(value: Input[String]): Self = StObject.set(x, "compressionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionTypeUndefined: Self = StObject.set(x, "compressionType", js.undefined)
      
      @scala.inline
      def setCsvDelimiter(value: Input[String]): Self = StObject.set(x, "csvDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsvDelimiterUndefined: Self = StObject.set(x, "csvDelimiter", js.undefined)
      
      @scala.inline
      def setCsvRowDelimiter(value: Input[String]): Self = StObject.set(x, "csvRowDelimiter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCsvRowDelimiterUndefined: Self = StObject.set(x, "csvRowDelimiter", js.undefined)
      
      @scala.inline
      def setExternalTableDefinition(value: Input[String]): Self = StObject.set(x, "externalTableDefinition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalTableDefinitionUndefined: Self = StObject.set(x, "externalTableDefinition", js.undefined)
      
      @scala.inline
      def setServiceAccessRoleArn(value: Input[String]): Self = StObject.set(x, "serviceAccessRoleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceAccessRoleArnUndefined: Self = StObject.set(x, "serviceAccessRoleArn", js.undefined)
    }
  }
}
