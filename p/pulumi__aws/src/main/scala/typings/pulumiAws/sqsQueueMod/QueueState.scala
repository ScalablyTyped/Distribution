package typings.pulumiAws.sqsQueueMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueState extends js.Object {
  /**
    * The ARN of the SQS queue
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Enables content-based deduplication for FIFO queues. For more information, see the [related documentation](http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/FIFO-queues.html#FIFO-queues-exactly-once-processing)
    */
  val contentBasedDeduplication: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The time in seconds that the delivery of all messages in the queue will be delayed. An integer from 0 to 900 (15 minutes). The default for this attribute is 0 seconds.
    */
  val delaySeconds: js.UndefOr[Input[Double]] = js.native
  /**
    * Boolean designating a FIFO queue. If not set, it defaults to `false` making it standard.
    */
  val fifoQueue: js.UndefOr[Input[Boolean]] = js.native
  /**
    * The length of time, in seconds, for which Amazon SQS can reuse a data key to encrypt or decrypt messages before calling AWS KMS again. An integer representing seconds, between 60 seconds (1 minute) and 86,400 seconds (24 hours). The default is 300 (5 minutes).
    */
  val kmsDataKeyReusePeriodSeconds: js.UndefOr[Input[Double]] = js.native
  /**
    * The ID of an AWS-managed customer master key (CMK) for Amazon SQS or a custom CMK. For more information, see [Key Terms](http://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/sqs-server-side-encryption.html#sqs-sse-key-terms).
    */
  val kmsMasterKeyId: js.UndefOr[Input[String]] = js.native
  /**
    * The limit of how many bytes a message can contain before Amazon SQS rejects it. An integer from 1024 bytes (1 KiB) up to 262144 bytes (256 KiB). The default for this attribute is 262144 (256 KiB).
    */
  val maxMessageSize: js.UndefOr[Input[Double]] = js.native
  /**
    * The number of seconds Amazon SQS retains a message. Integer representing seconds, from 60 (1 minute) to 1209600 (14 days). The default for this attribute is 345600 (4 days).
    */
  val messageRetentionSeconds: js.UndefOr[Input[Double]] = js.native
  /**
    * This is the human-readable name of the queue. If omitted, this provider will assign a random name.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
    */
  val namePrefix: js.UndefOr[Input[String]] = js.native
  val policy: js.UndefOr[Input[String]] = js.native
  /**
    * The time for which a ReceiveMessage call will wait for a message to arrive (long polling) before returning. An integer from 0 to 20 (seconds). The default for this attribute is 0, meaning that the call will return immediately.
    */
  val receiveWaitTimeSeconds: js.UndefOr[Input[Double]] = js.native
  /**
    * The JSON policy to set up the Dead Letter Queue, see [AWS docs](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/SQSDeadLetterQueue.html). **Note:** when specifying `maxReceiveCount`, you must specify it as an integer (`5`), and not a string (`"5"`).
    */
  val redrivePolicy: js.UndefOr[Input[String]] = js.native
  /**
    * A mapping of tags to assign to the queue.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The visibility timeout for the queue. An integer from 0 to 43200 (12 hours). The default for this attribute is 30. For more information about visibility timeout, see [AWS docs](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html).
    */
  val visibilityTimeoutSeconds: js.UndefOr[Input[Double]] = js.native
}

object QueueState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    contentBasedDeduplication: Input[Boolean] = null,
    delaySeconds: Input[Double] = null,
    fifoQueue: Input[Boolean] = null,
    kmsDataKeyReusePeriodSeconds: Input[Double] = null,
    kmsMasterKeyId: Input[String] = null,
    maxMessageSize: Input[Double] = null,
    messageRetentionSeconds: Input[Double] = null,
    name: Input[String] = null,
    namePrefix: Input[String] = null,
    policy: Input[String] = null,
    receiveWaitTimeSeconds: Input[Double] = null,
    redrivePolicy: Input[String] = null,
    tags: Input[StringDictionary[_]] = null,
    visibilityTimeoutSeconds: Input[Double] = null
  ): QueueState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (contentBasedDeduplication != null) __obj.updateDynamic("contentBasedDeduplication")(contentBasedDeduplication.asInstanceOf[js.Any])
    if (delaySeconds != null) __obj.updateDynamic("delaySeconds")(delaySeconds.asInstanceOf[js.Any])
    if (fifoQueue != null) __obj.updateDynamic("fifoQueue")(fifoQueue.asInstanceOf[js.Any])
    if (kmsDataKeyReusePeriodSeconds != null) __obj.updateDynamic("kmsDataKeyReusePeriodSeconds")(kmsDataKeyReusePeriodSeconds.asInstanceOf[js.Any])
    if (kmsMasterKeyId != null) __obj.updateDynamic("kmsMasterKeyId")(kmsMasterKeyId.asInstanceOf[js.Any])
    if (maxMessageSize != null) __obj.updateDynamic("maxMessageSize")(maxMessageSize.asInstanceOf[js.Any])
    if (messageRetentionSeconds != null) __obj.updateDynamic("messageRetentionSeconds")(messageRetentionSeconds.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (namePrefix != null) __obj.updateDynamic("namePrefix")(namePrefix.asInstanceOf[js.Any])
    if (policy != null) __obj.updateDynamic("policy")(policy.asInstanceOf[js.Any])
    if (receiveWaitTimeSeconds != null) __obj.updateDynamic("receiveWaitTimeSeconds")(receiveWaitTimeSeconds.asInstanceOf[js.Any])
    if (redrivePolicy != null) __obj.updateDynamic("redrivePolicy")(redrivePolicy.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (visibilityTimeoutSeconds != null) __obj.updateDynamic("visibilityTimeoutSeconds")(visibilityTimeoutSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueState]
  }
}

