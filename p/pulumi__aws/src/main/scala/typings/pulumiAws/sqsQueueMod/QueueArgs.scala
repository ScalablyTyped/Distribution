package typings.pulumiAws.sqsQueueMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueArgs extends js.Object {
  
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
  
  /**
    * The JSON policy for the SQS queue.
    */
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
    * A map of tags to assign to the queue.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  
  /**
    * The visibility timeout for the queue. An integer from 0 to 43200 (12 hours). The default for this attribute is 30. For more information about visibility timeout, see [AWS docs](https://docs.aws.amazon.com/AWSSimpleQueueService/latest/SQSDeveloperGuide/AboutVT.html).
    */
  val visibilityTimeoutSeconds: js.UndefOr[Input[Double]] = js.native
}
object QueueArgs {
  
  @scala.inline
  def apply(): QueueArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueArgs]
  }
  
  @scala.inline
  implicit class QueueArgsOps[Self <: QueueArgs] (val x: Self) extends AnyVal {
    
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
    def setContentBasedDeduplication(value: Input[Boolean]): Self = this.set("contentBasedDeduplication", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentBasedDeduplication: Self = this.set("contentBasedDeduplication", js.undefined)
    
    @scala.inline
    def setDelaySeconds(value: Input[Double]): Self = this.set("delaySeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelaySeconds: Self = this.set("delaySeconds", js.undefined)
    
    @scala.inline
    def setFifoQueue(value: Input[Boolean]): Self = this.set("fifoQueue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFifoQueue: Self = this.set("fifoQueue", js.undefined)
    
    @scala.inline
    def setKmsDataKeyReusePeriodSeconds(value: Input[Double]): Self = this.set("kmsDataKeyReusePeriodSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsDataKeyReusePeriodSeconds: Self = this.set("kmsDataKeyReusePeriodSeconds", js.undefined)
    
    @scala.inline
    def setKmsMasterKeyId(value: Input[String]): Self = this.set("kmsMasterKeyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKmsMasterKeyId: Self = this.set("kmsMasterKeyId", js.undefined)
    
    @scala.inline
    def setMaxMessageSize(value: Input[Double]): Self = this.set("maxMessageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxMessageSize: Self = this.set("maxMessageSize", js.undefined)
    
    @scala.inline
    def setMessageRetentionSeconds(value: Input[Double]): Self = this.set("messageRetentionSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessageRetentionSeconds: Self = this.set("messageRetentionSeconds", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNamePrefix(value: Input[String]): Self = this.set("namePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamePrefix: Self = this.set("namePrefix", js.undefined)
    
    @scala.inline
    def setPolicy(value: Input[String]): Self = this.set("policy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolicy: Self = this.set("policy", js.undefined)
    
    @scala.inline
    def setReceiveWaitTimeSeconds(value: Input[Double]): Self = this.set("receiveWaitTimeSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReceiveWaitTimeSeconds: Self = this.set("receiveWaitTimeSeconds", js.undefined)
    
    @scala.inline
    def setRedrivePolicy(value: Input[String]): Self = this.set("redrivePolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedrivePolicy: Self = this.set("redrivePolicy", js.undefined)
    
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setVisibilityTimeoutSeconds(value: Input[Double]): Self = this.set("visibilityTimeoutSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisibilityTimeoutSeconds: Self = this.set("visibilityTimeoutSeconds", js.undefined)
  }
}
