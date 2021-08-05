package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.kinesis.FirehoseDeliveryStreamElasticsearchConfiguration
import typings.pulumiAws.outputMod.kinesis.FirehoseDeliveryStreamExtendedS3Configuration
import typings.pulumiAws.outputMod.kinesis.FirehoseDeliveryStreamHttpEndpointConfiguration
import typings.pulumiAws.outputMod.kinesis.FirehoseDeliveryStreamKinesisSourceConfiguration
import typings.pulumiAws.outputMod.kinesis.FirehoseDeliveryStreamRedshiftConfiguration
import typings.pulumiAws.outputMod.kinesis.FirehoseDeliveryStreamS3Configuration
import typings.pulumiAws.outputMod.kinesis.FirehoseDeliveryStreamServerSideEncryption
import typings.pulumiAws.outputMod.kinesis.FirehoseDeliveryStreamSplunkConfiguration
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firehoseDeliveryStreamMod {
  
  @JSImport("@pulumi/aws/kinesis/firehoseDeliveryStream", "FirehoseDeliveryStream")
  @js.native
  class FirehoseDeliveryStream protected () extends CustomResource {
    /**
      * Create a FirehoseDeliveryStream resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: FirehoseDeliveryStreamArgs) = this()
    def this(name: String, args: FirehoseDeliveryStreamArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) specifying the Stream
      */
    val arn: Output_[String] = js.native
    
    /**
      * This is the destination to where the data is delivered. The only options are `s3` (Deprecated, use `extendedS3` instead), `extendedS3`, `redshift`, `elasticsearch`, `splunk`, and `httpEndpoint`.
      */
    val destination: Output_[String] = js.native
    
    val destinationId: Output_[String] = js.native
    
    /**
      * Configuration options if elasticsearch is the destination. More details are given below.
      */
    val elasticsearchConfiguration: Output_[js.UndefOr[FirehoseDeliveryStreamElasticsearchConfiguration]] = js.native
    
    /**
      * Enhanced configuration options for the s3 destination. More details are given below.
      */
    val extendedS3Configuration: Output_[js.UndefOr[FirehoseDeliveryStreamExtendedS3Configuration]] = js.native
    
    /**
      * Configuration options if httpEndpoint is the destination. requires the user to also specify a `s3Configuration` block.  More details are given below.
      */
    val httpEndpointConfiguration: Output_[js.UndefOr[FirehoseDeliveryStreamHttpEndpointConfiguration]] = js.native
    
    /**
      * Allows the ability to specify the kinesis stream that is used as the source of the firehose delivery stream.
      */
    val kinesisSourceConfiguration: Output_[js.UndefOr[FirehoseDeliveryStreamKinesisSourceConfiguration]] = js.native
    
    /**
      * A name to identify the stream. This is unique to the
      * AWS account and region the Stream is created in.
      */
    val name: Output_[String] = js.native
    
    /**
      * Configuration options if redshift is the destination.
      * Using `redshiftConfiguration` requires the user to also specify a
      * `s3Configuration` block. More details are given below.
      */
    val redshiftConfiguration: Output_[js.UndefOr[FirehoseDeliveryStreamRedshiftConfiguration]] = js.native
    
    /**
      * Required for non-S3 destinations. For S3 destination, use `extendedS3Configuration` instead. Configuration options for the s3 destination (or the intermediate bucket if the destination
      * is redshift). More details are given below.
      */
    val s3Configuration: Output_[js.UndefOr[FirehoseDeliveryStreamS3Configuration]] = js.native
    
    /**
      * Encrypt at rest options.
      * Server-side encryption should not be enabled when a kinesis stream is configured as the source of the firehose delivery stream.
      */
    val serverSideEncryption: Output_[js.UndefOr[FirehoseDeliveryStreamServerSideEncryption]] = js.native
    
    /**
      * Configuration options if splunk is the destination. More details are given below.
      */
    val splunkConfiguration: Output_[js.UndefOr[FirehoseDeliveryStreamSplunkConfiguration]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Specifies the table version for the output data schema. Defaults to `LATEST`.
      */
    val versionId: Output_[String] = js.native
  }
  /* static members */
  object FirehoseDeliveryStream {
    
    @JSImport("@pulumi/aws/kinesis/firehoseDeliveryStream", "FirehoseDeliveryStream")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing FirehoseDeliveryStream resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): FirehoseDeliveryStream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[FirehoseDeliveryStream]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): FirehoseDeliveryStream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[FirehoseDeliveryStream]
    inline def get(name: String, id: Input[ID], state: FirehoseDeliveryStreamState): FirehoseDeliveryStream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[FirehoseDeliveryStream]
    inline def get(name: String, id: Input[ID], state: FirehoseDeliveryStreamState, opts: CustomResourceOptions): FirehoseDeliveryStream = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[FirehoseDeliveryStream]
    
    /**
      * Returns true if the given object is an instance of FirehoseDeliveryStream.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kinesis/firehoseDeliveryStream.FirehoseDeliveryStream */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/kinesis/firehoseDeliveryStream.FirehoseDeliveryStream */ Boolean]
  }
  
  trait FirehoseDeliveryStreamArgs extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) specifying the Stream
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * This is the destination to where the data is delivered. The only options are `s3` (Deprecated, use `extendedS3` instead), `extendedS3`, `redshift`, `elasticsearch`, `splunk`, and `httpEndpoint`.
      */
    val destination: Input[String]
    
    val destinationId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration options if elasticsearch is the destination. More details are given below.
      */
    val elasticsearchConfiguration: js.UndefOr[
        Input[
          typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamElasticsearchConfiguration
        ]
      ] = js.undefined
    
    /**
      * Enhanced configuration options for the s3 destination. More details are given below.
      */
    val extendedS3Configuration: js.UndefOr[
        Input[typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamExtendedS3Configuration]
      ] = js.undefined
    
    /**
      * Configuration options if httpEndpoint is the destination. requires the user to also specify a `s3Configuration` block.  More details are given below.
      */
    val httpEndpointConfiguration: js.UndefOr[
        Input[
          typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamHttpEndpointConfiguration
        ]
      ] = js.undefined
    
    /**
      * Allows the ability to specify the kinesis stream that is used as the source of the firehose delivery stream.
      */
    val kinesisSourceConfiguration: js.UndefOr[
        Input[
          typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamKinesisSourceConfiguration
        ]
      ] = js.undefined
    
    /**
      * A name to identify the stream. This is unique to the
      * AWS account and region the Stream is created in.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration options if redshift is the destination.
      * Using `redshiftConfiguration` requires the user to also specify a
      * `s3Configuration` block. More details are given below.
      */
    val redshiftConfiguration: js.UndefOr[
        Input[typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamRedshiftConfiguration]
      ] = js.undefined
    
    /**
      * Required for non-S3 destinations. For S3 destination, use `extendedS3Configuration` instead. Configuration options for the s3 destination (or the intermediate bucket if the destination
      * is redshift). More details are given below.
      */
    val s3Configuration: js.UndefOr[Input[typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamS3Configuration]] = js.undefined
    
    /**
      * Encrypt at rest options.
      * Server-side encryption should not be enabled when a kinesis stream is configured as the source of the firehose delivery stream.
      */
    val serverSideEncryption: js.UndefOr[
        Input[typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamServerSideEncryption]
      ] = js.undefined
    
    /**
      * Configuration options if splunk is the destination. More details are given below.
      */
    val splunkConfiguration: js.UndefOr[
        Input[typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamSplunkConfiguration]
      ] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Specifies the table version for the output data schema. Defaults to `LATEST`.
      */
    val versionId: js.UndefOr[Input[String]] = js.undefined
  }
  object FirehoseDeliveryStreamArgs {
    
    inline def apply(destination: Input[String]): FirehoseDeliveryStreamArgs = {
      val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
      __obj.asInstanceOf[FirehoseDeliveryStreamArgs]
    }
    
    extension [Self <: FirehoseDeliveryStreamArgs](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setDestination(value: Input[String]): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setDestinationId(value: Input[String]): Self = StObject.set(x, "destinationId", value.asInstanceOf[js.Any])
      
      inline def setDestinationIdUndefined: Self = StObject.set(x, "destinationId", js.undefined)
      
      inline def setElasticsearchConfiguration(
        value: Input[
              typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamElasticsearchConfiguration
            ]
      ): Self = StObject.set(x, "elasticsearchConfiguration", value.asInstanceOf[js.Any])
      
      inline def setElasticsearchConfigurationUndefined: Self = StObject.set(x, "elasticsearchConfiguration", js.undefined)
      
      inline def setExtendedS3Configuration(value: Input[typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamExtendedS3Configuration]): Self = StObject.set(x, "extendedS3Configuration", value.asInstanceOf[js.Any])
      
      inline def setExtendedS3ConfigurationUndefined: Self = StObject.set(x, "extendedS3Configuration", js.undefined)
      
      inline def setHttpEndpointConfiguration(
        value: Input[
              typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamHttpEndpointConfiguration
            ]
      ): Self = StObject.set(x, "httpEndpointConfiguration", value.asInstanceOf[js.Any])
      
      inline def setHttpEndpointConfigurationUndefined: Self = StObject.set(x, "httpEndpointConfiguration", js.undefined)
      
      inline def setKinesisSourceConfiguration(
        value: Input[
              typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamKinesisSourceConfiguration
            ]
      ): Self = StObject.set(x, "kinesisSourceConfiguration", value.asInstanceOf[js.Any])
      
      inline def setKinesisSourceConfigurationUndefined: Self = StObject.set(x, "kinesisSourceConfiguration", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRedshiftConfiguration(value: Input[typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamRedshiftConfiguration]): Self = StObject.set(x, "redshiftConfiguration", value.asInstanceOf[js.Any])
      
      inline def setRedshiftConfigurationUndefined: Self = StObject.set(x, "redshiftConfiguration", js.undefined)
      
      inline def setS3Configuration(value: Input[typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamS3Configuration]): Self = StObject.set(x, "s3Configuration", value.asInstanceOf[js.Any])
      
      inline def setS3ConfigurationUndefined: Self = StObject.set(x, "s3Configuration", js.undefined)
      
      inline def setServerSideEncryption(value: Input[typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamServerSideEncryption]): Self = StObject.set(x, "serverSideEncryption", value.asInstanceOf[js.Any])
      
      inline def setServerSideEncryptionUndefined: Self = StObject.set(x, "serverSideEncryption", js.undefined)
      
      inline def setSplunkConfiguration(value: Input[typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamSplunkConfiguration]): Self = StObject.set(x, "splunkConfiguration", value.asInstanceOf[js.Any])
      
      inline def setSplunkConfigurationUndefined: Self = StObject.set(x, "splunkConfiguration", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVersionId(value: Input[String]): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
      
      inline def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
    }
  }
  
  trait FirehoseDeliveryStreamState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) specifying the Stream
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * This is the destination to where the data is delivered. The only options are `s3` (Deprecated, use `extendedS3` instead), `extendedS3`, `redshift`, `elasticsearch`, `splunk`, and `httpEndpoint`.
      */
    val destination: js.UndefOr[Input[String]] = js.undefined
    
    val destinationId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration options if elasticsearch is the destination. More details are given below.
      */
    val elasticsearchConfiguration: js.UndefOr[
        Input[
          typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamElasticsearchConfiguration
        ]
      ] = js.undefined
    
    /**
      * Enhanced configuration options for the s3 destination. More details are given below.
      */
    val extendedS3Configuration: js.UndefOr[
        Input[typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamExtendedS3Configuration]
      ] = js.undefined
    
    /**
      * Configuration options if httpEndpoint is the destination. requires the user to also specify a `s3Configuration` block.  More details are given below.
      */
    val httpEndpointConfiguration: js.UndefOr[
        Input[
          typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamHttpEndpointConfiguration
        ]
      ] = js.undefined
    
    /**
      * Allows the ability to specify the kinesis stream that is used as the source of the firehose delivery stream.
      */
    val kinesisSourceConfiguration: js.UndefOr[
        Input[
          typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamKinesisSourceConfiguration
        ]
      ] = js.undefined
    
    /**
      * A name to identify the stream. This is unique to the
      * AWS account and region the Stream is created in.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration options if redshift is the destination.
      * Using `redshiftConfiguration` requires the user to also specify a
      * `s3Configuration` block. More details are given below.
      */
    val redshiftConfiguration: js.UndefOr[
        Input[typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamRedshiftConfiguration]
      ] = js.undefined
    
    /**
      * Required for non-S3 destinations. For S3 destination, use `extendedS3Configuration` instead. Configuration options for the s3 destination (or the intermediate bucket if the destination
      * is redshift). More details are given below.
      */
    val s3Configuration: js.UndefOr[Input[typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamS3Configuration]] = js.undefined
    
    /**
      * Encrypt at rest options.
      * Server-side encryption should not be enabled when a kinesis stream is configured as the source of the firehose delivery stream.
      */
    val serverSideEncryption: js.UndefOr[
        Input[typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamServerSideEncryption]
      ] = js.undefined
    
    /**
      * Configuration options if splunk is the destination. More details are given below.
      */
    val splunkConfiguration: js.UndefOr[
        Input[typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamSplunkConfiguration]
      ] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Specifies the table version for the output data schema. Defaults to `LATEST`.
      */
    val versionId: js.UndefOr[Input[String]] = js.undefined
  }
  object FirehoseDeliveryStreamState {
    
    inline def apply(): FirehoseDeliveryStreamState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FirehoseDeliveryStreamState]
    }
    
    extension [Self <: FirehoseDeliveryStreamState](x: Self) {
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setDestination(value: Input[String]): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setDestinationId(value: Input[String]): Self = StObject.set(x, "destinationId", value.asInstanceOf[js.Any])
      
      inline def setDestinationIdUndefined: Self = StObject.set(x, "destinationId", js.undefined)
      
      inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
      
      inline def setElasticsearchConfiguration(
        value: Input[
              typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamElasticsearchConfiguration
            ]
      ): Self = StObject.set(x, "elasticsearchConfiguration", value.asInstanceOf[js.Any])
      
      inline def setElasticsearchConfigurationUndefined: Self = StObject.set(x, "elasticsearchConfiguration", js.undefined)
      
      inline def setExtendedS3Configuration(value: Input[typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamExtendedS3Configuration]): Self = StObject.set(x, "extendedS3Configuration", value.asInstanceOf[js.Any])
      
      inline def setExtendedS3ConfigurationUndefined: Self = StObject.set(x, "extendedS3Configuration", js.undefined)
      
      inline def setHttpEndpointConfiguration(
        value: Input[
              typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamHttpEndpointConfiguration
            ]
      ): Self = StObject.set(x, "httpEndpointConfiguration", value.asInstanceOf[js.Any])
      
      inline def setHttpEndpointConfigurationUndefined: Self = StObject.set(x, "httpEndpointConfiguration", js.undefined)
      
      inline def setKinesisSourceConfiguration(
        value: Input[
              typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamKinesisSourceConfiguration
            ]
      ): Self = StObject.set(x, "kinesisSourceConfiguration", value.asInstanceOf[js.Any])
      
      inline def setKinesisSourceConfigurationUndefined: Self = StObject.set(x, "kinesisSourceConfiguration", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRedshiftConfiguration(value: Input[typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamRedshiftConfiguration]): Self = StObject.set(x, "redshiftConfiguration", value.asInstanceOf[js.Any])
      
      inline def setRedshiftConfigurationUndefined: Self = StObject.set(x, "redshiftConfiguration", js.undefined)
      
      inline def setS3Configuration(value: Input[typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamS3Configuration]): Self = StObject.set(x, "s3Configuration", value.asInstanceOf[js.Any])
      
      inline def setS3ConfigurationUndefined: Self = StObject.set(x, "s3Configuration", js.undefined)
      
      inline def setServerSideEncryption(value: Input[typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamServerSideEncryption]): Self = StObject.set(x, "serverSideEncryption", value.asInstanceOf[js.Any])
      
      inline def setServerSideEncryptionUndefined: Self = StObject.set(x, "serverSideEncryption", js.undefined)
      
      inline def setSplunkConfiguration(value: Input[typings.pulumiAws.inputMod.kinesis.FirehoseDeliveryStreamSplunkConfiguration]): Self = StObject.set(x, "splunkConfiguration", value.asInstanceOf[js.Any])
      
      inline def setSplunkConfigurationUndefined: Self = StObject.set(x, "splunkConfiguration", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVersionId(value: Input[String]): Self = StObject.set(x, "versionId", value.asInstanceOf[js.Any])
      
      inline def setVersionIdUndefined: Self = StObject.set(x, "versionId", js.undefined)
    }
  }
}
