package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirehoseDeliveryStreamElasticsearchConfiguration extends js.Object {
  
  /**
    * Buffer incoming data for the specified period of time, in seconds between 60 to 900, before delivering it to the destination.  The default value is 300s.
    */
  var bufferingInterval: js.UndefOr[Input[Double]] = js.native
  
  /**
    * Buffer incoming data to the specified size, in MBs between 1 to 100, before delivering it to the destination.  The default value is 5MB.
    */
  var bufferingSize: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The CloudWatch Logging Options for the delivery stream. More details are given below
    */
  var cloudwatchLoggingOptions: js.UndefOr[Input[FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptions]] = js.native
  
  /**
    * The endpoint to use when communicating with the cluster. Conflicts with `domainArn`.
    */
  var clusterEndpoint: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN of the Amazon ES domain.  The IAM role must have permission for `DescribeElasticsearchDomain`, `DescribeElasticsearchDomains`, and `DescribeElasticsearchDomainConfig` after assuming `RoleARN`.  The pattern needs to be `arn:.*`. Conflicts with `clusterEndpoint`.
    */
  var domainArn: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Elasticsearch index name.
    */
  var indexName: Input[String] = js.native
  
  /**
    * The Elasticsearch index rotation period.  Index rotation appends a timestamp to the IndexName to facilitate expiration of old data.  Valid values are `NoRotation`, `OneHour`, `OneDay`, `OneWeek`, and `OneMonth`.  The default value is `OneDay`.
    */
  var indexRotationPeriod: js.UndefOr[Input[String]] = js.native
  
  /**
    * The data processing configuration.  More details are given below.
    */
  var processingConfiguration: js.UndefOr[Input[FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration]] = js.native
  
  /**
    * After an initial failure to deliver to Amazon Elasticsearch, the total amount of time, in seconds between 0 to 7200, during which Firehose re-attempts delivery (including the first attempt).  After this time has elapsed, the failed documents are written to Amazon S3.  The default value is 300s.  There will be no retry if the value is 0.
    */
  var retryDuration: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The ARN of the IAM role to be assumed by Firehose for calling the Amazon ES Configuration API and for indexing documents.  The pattern needs to be `arn:.*`.
    */
  var roleArn: Input[String] = js.native
  
  /**
    * Defines how documents should be delivered to Amazon S3.  Valid values are `FailedDocumentsOnly` and `AllDocuments`.  Default value is `FailedDocumentsOnly`.
    */
  var s3BackupMode: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Elasticsearch type name with maximum length of 100 characters.
    */
  var typeName: js.UndefOr[Input[String]] = js.native
  
  /**
    * The VPC configuration for the delivery stream to connect to Elastic Search associated with the VPC. More details are given below
    */
  var vpcConfig: js.UndefOr[Input[FirehoseDeliveryStreamElasticsearchConfigurationVpcConfig]] = js.native
}
object FirehoseDeliveryStreamElasticsearchConfiguration {
  
  @scala.inline
  def apply(indexName: Input[String], roleArn: Input[String]): FirehoseDeliveryStreamElasticsearchConfiguration = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamElasticsearchConfiguration]
  }
  
  @scala.inline
  implicit class FirehoseDeliveryStreamElasticsearchConfigurationOps[Self <: FirehoseDeliveryStreamElasticsearchConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIndexName(value: Input[String]): Self = this.set("indexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBufferingInterval(value: Input[Double]): Self = this.set("bufferingInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferingInterval: Self = this.set("bufferingInterval", js.undefined)
    
    @scala.inline
    def setBufferingSize(value: Input[Double]): Self = this.set("bufferingSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBufferingSize: Self = this.set("bufferingSize", js.undefined)
    
    @scala.inline
    def setCloudwatchLoggingOptions(value: Input[FirehoseDeliveryStreamElasticsearchConfigurationCloudwatchLoggingOptions]): Self = this.set("cloudwatchLoggingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudwatchLoggingOptions: Self = this.set("cloudwatchLoggingOptions", js.undefined)
    
    @scala.inline
    def setClusterEndpoint(value: Input[String]): Self = this.set("clusterEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterEndpoint: Self = this.set("clusterEndpoint", js.undefined)
    
    @scala.inline
    def setDomainArn(value: Input[String]): Self = this.set("domainArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainArn: Self = this.set("domainArn", js.undefined)
    
    @scala.inline
    def setIndexRotationPeriod(value: Input[String]): Self = this.set("indexRotationPeriod", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexRotationPeriod: Self = this.set("indexRotationPeriod", js.undefined)
    
    @scala.inline
    def setProcessingConfiguration(value: Input[FirehoseDeliveryStreamElasticsearchConfigurationProcessingConfiguration]): Self = this.set("processingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingConfiguration: Self = this.set("processingConfiguration", js.undefined)
    
    @scala.inline
    def setRetryDuration(value: Input[Double]): Self = this.set("retryDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryDuration: Self = this.set("retryDuration", js.undefined)
    
    @scala.inline
    def setS3BackupMode(value: Input[String]): Self = this.set("s3BackupMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3BackupMode: Self = this.set("s3BackupMode", js.undefined)
    
    @scala.inline
    def setTypeName(value: Input[String]): Self = this.set("typeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeName: Self = this.set("typeName", js.undefined)
    
    @scala.inline
    def setVpcConfig(value: Input[FirehoseDeliveryStreamElasticsearchConfigurationVpcConfig]): Self = this.set("vpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcConfig: Self = this.set("vpcConfig", js.undefined)
  }
}
