package typings.pulumiAws.firehoseDeliveryStreamMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamElasticsearchConfiguration
import typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamExtendedS3Configuration
import typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamHttpEndpointConfiguration
import typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamKinesisSourceConfiguration
import typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamRedshiftConfiguration
import typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamS3Configuration
import typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamServerSideEncryption
import typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamSplunkConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FirehoseDeliveryStreamArgs extends js.Object {
  
  /**
    * The Amazon Resource Name (ARN) specifying the Stream
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * This is the destination to where the data is delivered. The only options are `s3` (Deprecated, use `extendedS3` instead), `extendedS3`, `redshift`, `elasticsearch`, `splunk`, and `httpEndpoint`.
    */
  val destination: Input[String] = js.native
  
  val destinationId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Configuration options if elasticsearch is the destination. More details are given below.
    */
  val elasticsearchConfiguration: js.UndefOr[Input[FirehoseDeliveryStreamElasticsearchConfiguration]] = js.native
  
  /**
    * Enhanced configuration options for the s3 destination. More details are given below.
    */
  val extendedS3Configuration: js.UndefOr[Input[FirehoseDeliveryStreamExtendedS3Configuration]] = js.native
  
  /**
    * Configuration options if httpEndpoint is the destination. requires the user to also specify a `s3Configuration` block.  More details are given below.
    */
  val httpEndpointConfiguration: js.UndefOr[Input[FirehoseDeliveryStreamHttpEndpointConfiguration]] = js.native
  
  /**
    * Allows the ability to specify the kinesis stream that is used as the source of the firehose delivery stream.
    */
  val kinesisSourceConfiguration: js.UndefOr[Input[FirehoseDeliveryStreamKinesisSourceConfiguration]] = js.native
  
  /**
    * A name to identify the stream. This is unique to the
    * AWS account and region the Stream is created in.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Configuration options if redshift is the destination.
    * Using `redshiftConfiguration` requires the user to also specify a
    * `s3Configuration` block. More details are given below.
    */
  val redshiftConfiguration: js.UndefOr[Input[FirehoseDeliveryStreamRedshiftConfiguration]] = js.native
  
  /**
    * Required for non-S3 destinations. For S3 destination, use `extendedS3Configuration` instead. Configuration options for the s3 destination (or the intermediate bucket if the destination
    * is redshift). More details are given below.
    */
  val s3Configuration: js.UndefOr[Input[FirehoseDeliveryStreamS3Configuration]] = js.native
  
  /**
    * Encrypt at rest options.
    * Server-side encryption should not be enabled when a kinesis stream is configured as the source of the firehose delivery stream.
    */
  val serverSideEncryption: js.UndefOr[Input[FirehoseDeliveryStreamServerSideEncryption]] = js.native
  
  /**
    * Configuration options if splunk is the destination. More details are given below.
    */
  val splunkConfiguration: js.UndefOr[Input[FirehoseDeliveryStreamSplunkConfiguration]] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * Specifies the table version for the output data schema. Defaults to `LATEST`.
    */
  val versionId: js.UndefOr[Input[String]] = js.native
}
object FirehoseDeliveryStreamArgs {
  
  @scala.inline
  def apply(destination: Input[String]): FirehoseDeliveryStreamArgs = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamArgs]
  }
  
  @scala.inline
  implicit class FirehoseDeliveryStreamArgsOps[Self <: FirehoseDeliveryStreamArgs] (val x: Self) extends AnyVal {
    
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
    def setDestination(value: Input[String]): Self = this.set("destination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setDestinationId(value: Input[String]): Self = this.set("destinationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDestinationId: Self = this.set("destinationId", js.undefined)
    
    @scala.inline
    def setElasticsearchConfiguration(value: Input[FirehoseDeliveryStreamElasticsearchConfiguration]): Self = this.set("elasticsearchConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElasticsearchConfiguration: Self = this.set("elasticsearchConfiguration", js.undefined)
    
    @scala.inline
    def setExtendedS3Configuration(value: Input[FirehoseDeliveryStreamExtendedS3Configuration]): Self = this.set("extendedS3Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtendedS3Configuration: Self = this.set("extendedS3Configuration", js.undefined)
    
    @scala.inline
    def setHttpEndpointConfiguration(value: Input[FirehoseDeliveryStreamHttpEndpointConfiguration]): Self = this.set("httpEndpointConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpEndpointConfiguration: Self = this.set("httpEndpointConfiguration", js.undefined)
    
    @scala.inline
    def setKinesisSourceConfiguration(value: Input[FirehoseDeliveryStreamKinesisSourceConfiguration]): Self = this.set("kinesisSourceConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisSourceConfiguration: Self = this.set("kinesisSourceConfiguration", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setRedshiftConfiguration(value: Input[FirehoseDeliveryStreamRedshiftConfiguration]): Self = this.set("redshiftConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedshiftConfiguration: Self = this.set("redshiftConfiguration", js.undefined)
    
    @scala.inline
    def setS3Configuration(value: Input[FirehoseDeliveryStreamS3Configuration]): Self = this.set("s3Configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3Configuration: Self = this.set("s3Configuration", js.undefined)
    
    @scala.inline
    def setServerSideEncryption(value: Input[FirehoseDeliveryStreamServerSideEncryption]): Self = this.set("serverSideEncryption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerSideEncryption: Self = this.set("serverSideEncryption", js.undefined)
    
    @scala.inline
    def setSplunkConfiguration(value: Input[FirehoseDeliveryStreamSplunkConfiguration]): Self = this.set("splunkConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSplunkConfiguration: Self = this.set("splunkConfiguration", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setVersionId(value: Input[String]): Self = this.set("versionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionId: Self = this.set("versionId", js.undefined)
  }
}
