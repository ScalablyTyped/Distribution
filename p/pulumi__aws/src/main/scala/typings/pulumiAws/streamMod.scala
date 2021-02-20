package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.kinesisMixinsMod.StreamEventHandler
import typings.pulumiAws.kinesisMixinsMod.StreamEventSubscription
import typings.pulumiAws.kinesisMixinsMod.StreamEventSubscriptionArgs
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object streamMod {
  
  @JSImport("@pulumi/aws/kinesis/stream", "Stream")
  @js.native
  class Stream protected () extends CustomResource {
    /**
      * Create a Stream resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: StreamArgs) = this()
    def this(name: String, args: StreamArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The Amazon Resource Name (ARN) specifying the Stream (same as `id`)
      */
    val arn: Output_[String] = js.native
    
    /**
      * The encryption type to use. The only acceptable values are `NONE` or `KMS`. The default value is `NONE`.
      */
    val encryptionType: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A boolean that indicates all registered consumers should be deregistered from the stream so that the stream can be destroyed without error. The default value is `false`.
      */
    val enforceConsumerDeletion: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The GUID for the customer-managed KMS key to use for encryption. You can also use a Kinesis-owned master key by specifying the alias `alias/aws/kinesis`.
      */
    val kmsKeyId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A name to identify the stream. This is unique to the AWS account and region the Stream is created in.
      */
    val name: Output_[String] = js.native
    
    /**
      * Creates a new subscription to events fired from this Stream to the handler provided, along
      * with options to control the behavior of the subscription.
      */
    def onEvent(name: String, handler: StreamEventHandler, args: StreamEventSubscriptionArgs): StreamEventSubscription = js.native
    def onEvent(
      name: String,
      handler: StreamEventHandler,
      args: StreamEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ): StreamEventSubscription = js.native
    
    /**
      * Length of time data records are accessible after they are added to the stream. The maximum value of a stream's retention period is 168 hours. Minimum value is 24. Default is 24.
      */
    val retentionPeriod: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The number of shards that the stream will use.
      * Amazon has guidelines for specifying the Stream size that should be referenced when creating a Kinesis stream. See [Amazon Kinesis Streams](https://docs.aws.amazon.com/kinesis/latest/dev/amazon-kinesis-streams.html) for more.
      */
    val shardCount: Output_[Double] = js.native
    
    /**
      * A list of shard-level CloudWatch metrics which can be enabled for the stream. See [Monitoring with CloudWatch](https://docs.aws.amazon.com/streams/latest/dev/monitoring-with-cloudwatch.html) for more. Note that the value ALL should not be used; instead you should provide an explicit list of metrics you wish to enable.
      */
    val shardLevelMetrics: Output_[js.UndefOr[js.Array[String]]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  }
  /* static members */
  object Stream {
    
    /**
      * Get an existing Stream resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/kinesis/stream", "Stream.get")
    @js.native
    def get(name: String, id: Input[ID]): Stream = js.native
    @JSImport("@pulumi/aws/kinesis/stream", "Stream.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Stream = js.native
    @JSImport("@pulumi/aws/kinesis/stream", "Stream.get")
    @js.native
    def get(name: String, id: Input[ID], state: StreamState): Stream = js.native
    @JSImport("@pulumi/aws/kinesis/stream", "Stream.get")
    @js.native
    def get(name: String, id: Input[ID], state: StreamState, opts: CustomResourceOptions): Stream = js.native
    
    /**
      * Returns true if the given object is an instance of Stream.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/kinesis/stream", "Stream.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/kinesis/stream.Stream */ Boolean = js.native
  }
  
  @js.native
  trait StreamArgs extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) specifying the Stream (same as `id`)
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The encryption type to use. The only acceptable values are `NONE` or `KMS`. The default value is `NONE`.
      */
    val encryptionType: js.UndefOr[Input[String]] = js.native
    
    /**
      * A boolean that indicates all registered consumers should be deregistered from the stream so that the stream can be destroyed without error. The default value is `false`.
      */
    val enforceConsumerDeletion: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The GUID for the customer-managed KMS key to use for encryption. You can also use a Kinesis-owned master key by specifying the alias `alias/aws/kinesis`.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A name to identify the stream. This is unique to the AWS account and region the Stream is created in.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Length of time data records are accessible after they are added to the stream. The maximum value of a stream's retention period is 168 hours. Minimum value is 24. Default is 24.
      */
    val retentionPeriod: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The number of shards that the stream will use.
      * Amazon has guidelines for specifying the Stream size that should be referenced when creating a Kinesis stream. See [Amazon Kinesis Streams](https://docs.aws.amazon.com/kinesis/latest/dev/amazon-kinesis-streams.html) for more.
      */
    val shardCount: Input[Double] = js.native
    
    /**
      * A list of shard-level CloudWatch metrics which can be enabled for the stream. See [Monitoring with CloudWatch](https://docs.aws.amazon.com/streams/latest/dev/monitoring-with-cloudwatch.html) for more. Note that the value ALL should not be used; instead you should provide an explicit list of metrics you wish to enable.
      */
    val shardLevelMetrics: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object StreamArgs {
    
    @scala.inline
    def apply(shardCount: Input[Double]): StreamArgs = {
      val __obj = js.Dynamic.literal(shardCount = shardCount.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamArgs]
    }
    
    @scala.inline
    implicit class StreamArgsMutableBuilder[Self <: StreamArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setEncryptionType(value: Input[String]): Self = StObject.set(x, "encryptionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionTypeUndefined: Self = StObject.set(x, "encryptionType", js.undefined)
      
      @scala.inline
      def setEnforceConsumerDeletion(value: Input[Boolean]): Self = StObject.set(x, "enforceConsumerDeletion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnforceConsumerDeletionUndefined: Self = StObject.set(x, "enforceConsumerDeletion", js.undefined)
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRetentionPeriod(value: Input[Double]): Self = StObject.set(x, "retentionPeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetentionPeriodUndefined: Self = StObject.set(x, "retentionPeriod", js.undefined)
      
      @scala.inline
      def setShardCount(value: Input[Double]): Self = StObject.set(x, "shardCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShardLevelMetrics(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "shardLevelMetrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShardLevelMetricsUndefined: Self = StObject.set(x, "shardLevelMetrics", js.undefined)
      
      @scala.inline
      def setShardLevelMetricsVarargs(value: Input[String]*): Self = StObject.set(x, "shardLevelMetrics", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait StreamState extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) specifying the Stream (same as `id`)
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The encryption type to use. The only acceptable values are `NONE` or `KMS`. The default value is `NONE`.
      */
    val encryptionType: js.UndefOr[Input[String]] = js.native
    
    /**
      * A boolean that indicates all registered consumers should be deregistered from the stream so that the stream can be destroyed without error. The default value is `false`.
      */
    val enforceConsumerDeletion: js.UndefOr[Input[Boolean]] = js.native
    
    /**
      * The GUID for the customer-managed KMS key to use for encryption. You can also use a Kinesis-owned master key by specifying the alias `alias/aws/kinesis`.
      */
    val kmsKeyId: js.UndefOr[Input[String]] = js.native
    
    /**
      * A name to identify the stream. This is unique to the AWS account and region the Stream is created in.
      */
    val name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Length of time data records are accessible after they are added to the stream. The maximum value of a stream's retention period is 168 hours. Minimum value is 24. Default is 24.
      */
    val retentionPeriod: js.UndefOr[Input[Double]] = js.native
    
    /**
      * The number of shards that the stream will use.
      * Amazon has guidelines for specifying the Stream size that should be referenced when creating a Kinesis stream. See [Amazon Kinesis Streams](https://docs.aws.amazon.com/kinesis/latest/dev/amazon-kinesis-streams.html) for more.
      */
    val shardCount: js.UndefOr[Input[Double]] = js.native
    
    /**
      * A list of shard-level CloudWatch metrics which can be enabled for the stream. See [Monitoring with CloudWatch](https://docs.aws.amazon.com/streams/latest/dev/monitoring-with-cloudwatch.html) for more. Note that the value ALL should not be used; instead you should provide an explicit list of metrics you wish to enable.
      */
    val shardLevelMetrics: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  }
  object StreamState {
    
    @scala.inline
    def apply(): StreamState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StreamState]
    }
    
    @scala.inline
    implicit class StreamStateMutableBuilder[Self <: StreamState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setEncryptionType(value: Input[String]): Self = StObject.set(x, "encryptionType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionTypeUndefined: Self = StObject.set(x, "encryptionType", js.undefined)
      
      @scala.inline
      def setEnforceConsumerDeletion(value: Input[Boolean]): Self = StObject.set(x, "enforceConsumerDeletion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnforceConsumerDeletionUndefined: Self = StObject.set(x, "enforceConsumerDeletion", js.undefined)
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRetentionPeriod(value: Input[Double]): Self = StObject.set(x, "retentionPeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetentionPeriodUndefined: Self = StObject.set(x, "retentionPeriod", js.undefined)
      
      @scala.inline
      def setShardCount(value: Input[Double]): Self = StObject.set(x, "shardCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShardCountUndefined: Self = StObject.set(x, "shardCount", js.undefined)
      
      @scala.inline
      def setShardLevelMetrics(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "shardLevelMetrics", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShardLevelMetricsUndefined: Self = StObject.set(x, "shardLevelMetrics", js.undefined)
      
      @scala.inline
      def setShardLevelMetricsVarargs(value: Input[String]*): Self = StObject.set(x, "shardLevelMetrics", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
}
