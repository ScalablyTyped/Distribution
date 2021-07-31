package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.sqsMixinsMod.QueueEventHandler
import typings.pulumiAws.sqsMixinsMod.QueueEventSubscription
import typings.pulumiAws.sqsMixinsMod.QueueEventSubscriptionArgs
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.ComponentResourceOptions
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sqsQueueMod {
  
  @JSImport("@pulumi/aws/sqs/queue", "Queue")
  @js.native
  class Queue protected () extends CustomResource {
    /**
      * Create a Queue resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: QueueArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: QueueArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the SQS queue
      */
    val arn: Output_[String] = js.native
    
    /**
      * Enables content-based deduplication for FIFO queues. For more information, see the [related documentation](http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing)
      */
    val contentBasedDeduplication: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The time in seconds that the delivery of all messages in the queue will be delayed. An integer from 0 to 900 (15 minutes). The default for this attribute is 0 seconds.
      */
    val delaySeconds: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * Boolean designating a FIFO queue. If not set, it defaults to `false` making it standard.
      */
    val fifoQueue: Output_[js.UndefOr[Boolean]] = js.native
    
    /**
      * The length of time, in seconds, for which Amazon SQS can reuse a data key to encrypt or decrypt messages before calling AWS KMS again. An integer representing seconds, between 60 seconds (1 minute) and 86,400 seconds (24 hours). The default is 300 (5 minutes).
      */
    val kmsDataKeyReusePeriodSeconds: Output_[Double] = js.native
    
    /**
      * The ID of an AWS-managed customer master key (CMK) for Amazon SQS or a custom CMK. For more information, see [Key Terms](http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms).
      */
    val kmsMasterKeyId: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The limit of how many bytes a message can contain before Amazon SQS rejects it. An integer from 1024 bytes (1 KiB) up to 262144 bytes (256 KiB). The default for this attribute is 262144 (256 KiB).
      */
    val maxMessageSize: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The number of seconds Amazon SQS retains a message. Integer representing seconds, from 60 (1 minute) to 1209600 (14 days). The default for this attribute is 345600 (4 days).
      */
    val messageRetentionSeconds: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * This is the human-readable name of the queue. If omitted, this provider will assign a random name.
      */
    val name: Output_[String] = js.native
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Creates a new subscription to events fired from this Queue to the handler provided, along
      * with options to control the behavior of the subscription.
      */
    def onEvent(name: String, handler: QueueEventHandler): QueueEventSubscription = js.native
    def onEvent(name: String, handler: QueueEventHandler, args: Unit, opts: ComponentResourceOptions): QueueEventSubscription = js.native
    def onEvent(name: String, handler: QueueEventHandler, args: QueueEventSubscriptionArgs): QueueEventSubscription = js.native
    def onEvent(
      name: String,
      handler: QueueEventHandler,
      args: QueueEventSubscriptionArgs,
      opts: ComponentResourceOptions
    ): QueueEventSubscription = js.native
    
    /**
      * The JSON policy for the SQS queue.
      */
    val policy: Output_[String] = js.native
    
    /**
      * The time for which a ReceiveMessage call will wait for a message to arrive (long polling) before returning. An integer from 0 to 20 (seconds). The default for this attribute is 0, meaning that the call will return immediately.
      */
    val receiveWaitTimeSeconds: Output_[js.UndefOr[Double]] = js.native
    
    /**
      * The JSON policy to set up the Dead Letter Queue, see [AWS docs](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html). **Note:** when specifying `maxReceiveCount`, you must specify it as an integer (`5`), and not a string (`"5"`).
      */
    val redrivePolicy: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A map of tags to assign to the queue.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The visibility timeout for the queue. An integer from 0 to 43200 (12 hours). The default for this attribute is 30. For more information about visibility timeout, see [AWS docs](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html).
      */
    val visibilityTimeoutSeconds: Output_[js.UndefOr[Double]] = js.native
  }
  /* static members */
  object Queue {
    
    @JSImport("@pulumi/aws/sqs/queue", "Queue")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Queue resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): Queue = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Queue]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Queue = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Queue]
    @scala.inline
    def get(name: String, id: Input[ID], state: QueueState): Queue = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Queue]
    @scala.inline
    def get(name: String, id: Input[ID], state: QueueState, opts: CustomResourceOptions): Queue = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Queue]
    
    /**
      * Returns true if the given object is an instance of Queue.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sqs/queue.Queue */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/sqs/queue.Queue */ Boolean]
  }
  
  trait QueueArgs extends StObject {
    
    /**
      * Enables content-based deduplication for FIFO queues. For more information, see the [related documentation](http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing)
      */
    val contentBasedDeduplication: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The time in seconds that the delivery of all messages in the queue will be delayed. An integer from 0 to 900 (15 minutes). The default for this attribute is 0 seconds.
      */
    val delaySeconds: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Boolean designating a FIFO queue. If not set, it defaults to `false` making it standard.
      */
    val fifoQueue: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The length of time, in seconds, for which Amazon SQS can reuse a data key to encrypt or decrypt messages before calling AWS KMS again. An integer representing seconds, between 60 seconds (1 minute) and 86,400 seconds (24 hours). The default is 300 (5 minutes).
      */
    val kmsDataKeyReusePeriodSeconds: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The ID of an AWS-managed customer master key (CMK) for Amazon SQS or a custom CMK. For more information, see [Key Terms](http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms).
      */
    val kmsMasterKeyId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The limit of how many bytes a message can contain before Amazon SQS rejects it. An integer from 1024 bytes (1 KiB) up to 262144 bytes (256 KiB). The default for this attribute is 262144 (256 KiB).
      */
    val maxMessageSize: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The number of seconds Amazon SQS retains a message. Integer representing seconds, from 60 (1 minute) to 1209600 (14 days). The default for this attribute is 345600 (4 days).
      */
    val messageRetentionSeconds: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * This is the human-readable name of the queue. If omitted, this provider will assign a random name.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The JSON policy for the SQS queue.
      */
    val policy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The time for which a ReceiveMessage call will wait for a message to arrive (long polling) before returning. An integer from 0 to 20 (seconds). The default for this attribute is 0, meaning that the call will return immediately.
      */
    val receiveWaitTimeSeconds: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The JSON policy to set up the Dead Letter Queue, see [AWS docs](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html). **Note:** when specifying `maxReceiveCount`, you must specify it as an integer (`5`), and not a string (`"5"`).
      */
    val redrivePolicy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the queue.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The visibility timeout for the queue. An integer from 0 to 43200 (12 hours). The default for this attribute is 30. For more information about visibility timeout, see [AWS docs](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html).
      */
    val visibilityTimeoutSeconds: js.UndefOr[Input[Double]] = js.undefined
  }
  object QueueArgs {
    
    @scala.inline
    def apply(): QueueArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueueArgs]
    }
    
    @scala.inline
    implicit class QueueArgsMutableBuilder[Self <: QueueArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentBasedDeduplication(value: Input[Boolean]): Self = StObject.set(x, "contentBasedDeduplication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentBasedDeduplicationUndefined: Self = StObject.set(x, "contentBasedDeduplication", js.undefined)
      
      @scala.inline
      def setDelaySeconds(value: Input[Double]): Self = StObject.set(x, "delaySeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelaySecondsUndefined: Self = StObject.set(x, "delaySeconds", js.undefined)
      
      @scala.inline
      def setFifoQueue(value: Input[Boolean]): Self = StObject.set(x, "fifoQueue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFifoQueueUndefined: Self = StObject.set(x, "fifoQueue", js.undefined)
      
      @scala.inline
      def setKmsDataKeyReusePeriodSeconds(value: Input[Double]): Self = StObject.set(x, "kmsDataKeyReusePeriodSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsDataKeyReusePeriodSecondsUndefined: Self = StObject.set(x, "kmsDataKeyReusePeriodSeconds", js.undefined)
      
      @scala.inline
      def setKmsMasterKeyId(value: Input[String]): Self = StObject.set(x, "kmsMasterKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsMasterKeyIdUndefined: Self = StObject.set(x, "kmsMasterKeyId", js.undefined)
      
      @scala.inline
      def setMaxMessageSize(value: Input[Double]): Self = StObject.set(x, "maxMessageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxMessageSizeUndefined: Self = StObject.set(x, "maxMessageSize", js.undefined)
      
      @scala.inline
      def setMessageRetentionSeconds(value: Input[Double]): Self = StObject.set(x, "messageRetentionSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageRetentionSecondsUndefined: Self = StObject.set(x, "messageRetentionSeconds", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      @scala.inline
      def setReceiveWaitTimeSeconds(value: Input[Double]): Self = StObject.set(x, "receiveWaitTimeSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceiveWaitTimeSecondsUndefined: Self = StObject.set(x, "receiveWaitTimeSeconds", js.undefined)
      
      @scala.inline
      def setRedrivePolicy(value: Input[String]): Self = StObject.set(x, "redrivePolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedrivePolicyUndefined: Self = StObject.set(x, "redrivePolicy", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVisibilityTimeoutSeconds(value: Input[Double]): Self = StObject.set(x, "visibilityTimeoutSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibilityTimeoutSecondsUndefined: Self = StObject.set(x, "visibilityTimeoutSeconds", js.undefined)
    }
  }
  
  trait QueueState extends StObject {
    
    /**
      * The ARN of the SQS queue
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Enables content-based deduplication for FIFO queues. For more information, see the [related documentation](http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing)
      */
    val contentBasedDeduplication: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The time in seconds that the delivery of all messages in the queue will be delayed. An integer from 0 to 900 (15 minutes). The default for this attribute is 0 seconds.
      */
    val delaySeconds: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Boolean designating a FIFO queue. If not set, it defaults to `false` making it standard.
      */
    val fifoQueue: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The length of time, in seconds, for which Amazon SQS can reuse a data key to encrypt or decrypt messages before calling AWS KMS again. An integer representing seconds, between 60 seconds (1 minute) and 86,400 seconds (24 hours). The default is 300 (5 minutes).
      */
    val kmsDataKeyReusePeriodSeconds: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The ID of an AWS-managed customer master key (CMK) for Amazon SQS or a custom CMK. For more information, see [Key Terms](http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms).
      */
    val kmsMasterKeyId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The limit of how many bytes a message can contain before Amazon SQS rejects it. An integer from 1024 bytes (1 KiB) up to 262144 bytes (256 KiB). The default for this attribute is 262144 (256 KiB).
      */
    val maxMessageSize: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The number of seconds Amazon SQS retains a message. Integer representing seconds, from 60 (1 minute) to 1209600 (14 days). The default for this attribute is 345600 (4 days).
      */
    val messageRetentionSeconds: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * This is the human-readable name of the queue. If omitted, this provider will assign a random name.
      */
    val name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
      */
    val namePrefix: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The JSON policy for the SQS queue.
      */
    val policy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The time for which a ReceiveMessage call will wait for a message to arrive (long polling) before returning. An integer from 0 to 20 (seconds). The default for this attribute is 0, meaning that the call will return immediately.
      */
    val receiveWaitTimeSeconds: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The JSON policy to set up the Dead Letter Queue, see [AWS docs](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html). **Note:** when specifying `maxReceiveCount`, you must specify it as an integer (`5`), and not a string (`"5"`).
      */
    val redrivePolicy: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A map of tags to assign to the queue.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * The visibility timeout for the queue. An integer from 0 to 43200 (12 hours). The default for this attribute is 30. For more information about visibility timeout, see [AWS docs](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html).
      */
    val visibilityTimeoutSeconds: js.UndefOr[Input[Double]] = js.undefined
  }
  object QueueState {
    
    @scala.inline
    def apply(): QueueState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueueState]
    }
    
    @scala.inline
    implicit class QueueStateMutableBuilder[Self <: QueueState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setContentBasedDeduplication(value: Input[Boolean]): Self = StObject.set(x, "contentBasedDeduplication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentBasedDeduplicationUndefined: Self = StObject.set(x, "contentBasedDeduplication", js.undefined)
      
      @scala.inline
      def setDelaySeconds(value: Input[Double]): Self = StObject.set(x, "delaySeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelaySecondsUndefined: Self = StObject.set(x, "delaySeconds", js.undefined)
      
      @scala.inline
      def setFifoQueue(value: Input[Boolean]): Self = StObject.set(x, "fifoQueue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFifoQueueUndefined: Self = StObject.set(x, "fifoQueue", js.undefined)
      
      @scala.inline
      def setKmsDataKeyReusePeriodSeconds(value: Input[Double]): Self = StObject.set(x, "kmsDataKeyReusePeriodSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsDataKeyReusePeriodSecondsUndefined: Self = StObject.set(x, "kmsDataKeyReusePeriodSeconds", js.undefined)
      
      @scala.inline
      def setKmsMasterKeyId(value: Input[String]): Self = StObject.set(x, "kmsMasterKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsMasterKeyIdUndefined: Self = StObject.set(x, "kmsMasterKeyId", js.undefined)
      
      @scala.inline
      def setMaxMessageSize(value: Input[Double]): Self = StObject.set(x, "maxMessageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxMessageSizeUndefined: Self = StObject.set(x, "maxMessageSize", js.undefined)
      
      @scala.inline
      def setMessageRetentionSeconds(value: Input[Double]): Self = StObject.set(x, "messageRetentionSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageRetentionSecondsUndefined: Self = StObject.set(x, "messageRetentionSeconds", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamePrefixUndefined: Self = StObject.set(x, "namePrefix", js.undefined)
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setPolicy(value: Input[String]): Self = StObject.set(x, "policy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPolicyUndefined: Self = StObject.set(x, "policy", js.undefined)
      
      @scala.inline
      def setReceiveWaitTimeSeconds(value: Input[Double]): Self = StObject.set(x, "receiveWaitTimeSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceiveWaitTimeSecondsUndefined: Self = StObject.set(x, "receiveWaitTimeSeconds", js.undefined)
      
      @scala.inline
      def setRedrivePolicy(value: Input[String]): Self = StObject.set(x, "redrivePolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedrivePolicyUndefined: Self = StObject.set(x, "redrivePolicy", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVisibilityTimeoutSeconds(value: Input[Double]): Self = StObject.set(x, "visibilityTimeoutSeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibilityTimeoutSecondsUndefined: Self = StObject.set(x, "visibilityTimeoutSeconds", js.undefined)
    }
  }
}
