package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirehoseDeliveryStreamElasticsearchConfiguration extends StObject {
  
  /**
    * Buffer incoming data for the specified period of time, in seconds between 60 to 900, before delivering it to the destination.  The default value is 300s.
    */
  var bufferingInterval: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * Buffer incoming data to the specified size, in MBs between 1 to 100, before delivering it to the destination.  The default value is 5MB.
    */
  var bufferingSize: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * The CloudWatch Logging Options for the delivery stream. More details are given below
    */
  var cloudwatchLoggingOptions: js.UndefOr[Input[FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptions]] = js.undefined
  
  /**
    * The endpoint to use when communicating with the cluster. Conflicts with `domainArn`.
    */
  var clusterEndpoint: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The ARN of the Amazon ES domain.  The IAM role must have permission for `DescribeElasticsearchDomain`, `DescribeElasticsearchDomains`, and `DescribeElasticsearchDomainConfig` after assuming `RoleARN`.  The pattern needs to be `arn:.*`. Conflicts with `clusterEndpoint`.
    */
  var domainArn: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The Elasticsearch index name.
    */
  var indexName: Input[String]
  
  /**
    * The Elasticsearch index rotation period.  Index rotation appends a timestamp to the IndexName to facilitate expiration of old data.  Valid values are `NoRotation`, `OneHour`, `OneDay`, `OneWeek`, and `OneMonth`.  The default value is `OneDay`.
    */
  var indexRotationPeriod: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The data processing configuration.  More details are given below.
    */
  var processingConfiguration: js.UndefOr[Input[FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration]] = js.undefined
  
  /**
    * After an initial failure to deliver to Amazon Elasticsearch, the total amount of time, in seconds between 0 to 7200, during which Firehose re-attempts delivery (including the first attempt).  After this time has elapsed, the failed documents are written to Amazon S3.  The default value is 300s.  There will be no retry if the value is 0.
    */
  var retryDuration: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * The ARN of the IAM role to be assumed by Firehose for calling the Amazon ES Configuration API and for indexing documents.  The pattern needs to be `arn:.*`.
    */
  var roleArn: Input[String]
  
  /**
    * Defines how documents should be delivered to Amazon S3.  Valid values are `FailedDocumentsOnly` and `AllDocuments`.  Default value is `FailedDocumentsOnly`.
    */
  var s3BackupMode: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The Elasticsearch type name with maximum length of 100 characters.
    */
  var typeName: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The VPC configuration for the delivery stream to connect to Elastic Search associated with the VPC. More details are given below
    */
  var vpcConfig: js.UndefOr[Input[FirehoseDeliveryStreamElasticsearchConfigurationVpcConfig]] = js.undefined
}
object FirehoseDeliveryStreamElasticsearchConfiguration {
  
  @scala.inline
  def apply(indexName: Input[String], roleArn: Input[String]): FirehoseDeliveryStreamElasticsearchConfiguration = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamElasticsearchConfiguration]
  }
  
  @scala.inline
  implicit class FirehoseDeliveryStreamElasticsearchConfigurationMutableBuilder[Self <: FirehoseDeliveryStreamElasticsearchConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBufferingInterval(value: Input[Double]): Self = StObject.set(x, "bufferingInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferingIntervalUndefined: Self = StObject.set(x, "bufferingInterval", js.undefined)
    
    @scala.inline
    def setBufferingSize(value: Input[Double]): Self = StObject.set(x, "bufferingSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferingSizeUndefined: Self = StObject.set(x, "bufferingSize", js.undefined)
    
    @scala.inline
    def setCloudwatchLoggingOptions(value: Input[FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptions]): Self = StObject.set(x, "cloudwatchLoggingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudwatchLoggingOptionsUndefined: Self = StObject.set(x, "cloudwatchLoggingOptions", js.undefined)
    
    @scala.inline
    def setClusterEndpoint(value: Input[String]): Self = StObject.set(x, "clusterEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterEndpointUndefined: Self = StObject.set(x, "clusterEndpoint", js.undefined)
    
    @scala.inline
    def setDomainArn(value: Input[String]): Self = StObject.set(x, "domainArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainArnUndefined: Self = StObject.set(x, "domainArn", js.undefined)
    
    @scala.inline
    def setIndexName(value: Input[String]): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexRotationPeriod(value: Input[String]): Self = StObject.set(x, "indexRotationPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexRotationPeriodUndefined: Self = StObject.set(x, "indexRotationPeriod", js.undefined)
    
    @scala.inline
    def setProcessingConfiguration(value: Input[FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration]): Self = StObject.set(x, "processingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingConfigurationUndefined: Self = StObject.set(x, "processingConfiguration", js.undefined)
    
    @scala.inline
    def setRetryDuration(value: Input[Double]): Self = StObject.set(x, "retryDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryDurationUndefined: Self = StObject.set(x, "retryDuration", js.undefined)
    
    @scala.inline
    def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BackupMode(value: Input[String]): Self = StObject.set(x, "s3BackupMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BackupModeUndefined: Self = StObject.set(x, "s3BackupMode", js.undefined)
    
    @scala.inline
    def setTypeName(value: Input[String]): Self = StObject.set(x, "typeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNameUndefined: Self = StObject.set(x, "typeName", js.undefined)
    
    @scala.inline
    def setVpcConfig(value: Input[FirehoseDeliveryStreamElasticsearchConfigurationVpcConfig]): Self = StObject.set(x, "vpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfigUndefined: Self = StObject.set(x, "vpcConfig", js.undefined)
  }
}
