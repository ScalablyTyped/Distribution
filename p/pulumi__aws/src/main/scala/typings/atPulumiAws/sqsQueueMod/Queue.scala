package typings.atPulumiAws.sqsQueueMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.sqsSqsMixinsMod.QueueEventHandler
import typings.atPulumiAws.sqsSqsMixinsMod.QueueEventSubscription
import typings.atPulumiAws.sqsSqsMixinsMod.QueueEventSubscriptionArgs
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.ComponentResourceOptions
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def this(name: String, args: QueueArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the SQS queue
    */
  val arn: Output[String] = js.native
  /**
    * Enables content-based deduplication for FIFO queues. For more information, see the [related documentation](http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing)
    */
  val contentBasedDeduplication: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The time in seconds that the delivery of all messages in the queue will be delayed. An integer from 0 to 900 (15 minutes). The default for this attribute is 0 seconds.
    */
  val delaySeconds: Output[js.UndefOr[Double]] = js.native
  /**
    * Boolean designating a FIFO queue. If not set, it defaults to `false` making it standard.
    */
  val fifoQueue: Output[js.UndefOr[Boolean]] = js.native
  /**
    * The length of time, in seconds, for which Amazon SQS can reuse a data key to encrypt or decrypt messages before calling AWS KMS again. An integer representing seconds, between 60 seconds (1 minute) and 86,400 seconds (24 hours). The default is 300 (5 minutes).
    */
  val kmsDataKeyReusePeriodSeconds: Output[Double] = js.native
  /**
    * The ID of an AWS-managed customer master key (CMK) for Amazon SQS or a custom CMK. For more information, see [Key Terms](http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms).
    */
  val kmsMasterKeyId: Output[js.UndefOr[String]] = js.native
  /**
    * The limit of how many bytes a message can contain before Amazon SQS rejects it. An integer from 1024 bytes (1 KiB) up to 262144 bytes (256 KiB). The default for this attribute is 262144 (256 KiB).
    */
  val maxMessageSize: Output[js.UndefOr[Double]] = js.native
  /**
    * The number of seconds Amazon SQS retains a message. Integer representing seconds, from 60 (1 minute) to 1209600 (14 days). The default for this attribute is 345600 (4 days).
    */
  val messageRetentionSeconds: Output[js.UndefOr[Double]] = js.native
  /**
    * This is the human-readable name of the queue. If omitted, this provider will assign a random name.
    */
  val name: Output[String] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: Output[js.UndefOr[String]] = js.native
  /**
    * The JSON policy for the SQS queue.
    */
  val policy: Output[String] = js.native
  /**
    * The time for which a ReceiveMessage call will wait for a message to arrive (long polling) before returning. An integer from 0 to 20 (seconds). The default for this attribute is 0, meaning that the call will return immediately.
    */
  val receiveWaitTimeSeconds: Output[js.UndefOr[Double]] = js.native
  /**
    * The JSON policy to set up the Dead Letter Queue, see [AWS docs](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html). **Note:** when specifying `maxReceiveCount`, you must specify it as an integer (`5`), and not a string (`"5"`).
    */
  val redrivePolicy: Output[js.UndefOr[String]] = js.native
  /**
    * A mapping of tags to assign to the queue.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The visibility timeout for the queue. An integer from 0 to 43200 (12 hours). The default for this attribute is 30. For more information about visibility timeout, see [AWS docs](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html).
    */
  val visibilityTimeoutSeconds: Output[js.UndefOr[Double]] = js.native
  /**
    * Creates a new subscription to events fired from this Queue to the handler provided, along
    * with options to control the behavior of the subscription.
    */
  def onEvent(name: String, handler: QueueEventHandler): QueueEventSubscription = js.native
  def onEvent(name: String, handler: QueueEventHandler, args: QueueEventSubscriptionArgs): QueueEventSubscription = js.native
  def onEvent(
    name: String,
    handler: QueueEventHandler,
    args: QueueEventSubscriptionArgs,
    opts: ComponentResourceOptions
  ): QueueEventSubscription = js.native
}

/* static members */
@JSImport("@pulumi/aws/sqs/queue", "Queue")
@js.native
object Queue extends js.Object {
  /**
    * Get an existing Queue resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Queue = js.native
  def get(name: String, id: Input[ID], state: QueueState): Queue = js.native
  def get(name: String, id: Input[ID], state: QueueState, opts: CustomResourceOptions): Queue = js.native
  /**
    * Returns true if the given object is an instance of Queue.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/sqs/queue.Queue */ Boolean = js.native
}

