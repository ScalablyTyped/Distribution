package typings.pulumiAws.streamMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamState extends js.Object {
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
  implicit class StreamStateOps[Self <: StreamState] (val x: Self) extends AnyVal {
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setEncryptionType(value: Input[String]): Self = this.set("encryptionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptionType: Self = this.set("encryptionType", js.undefined)
    @scala.inline
    def setEnforceConsumerDeletion(value: Input[Boolean]): Self = this.set("enforceConsumerDeletion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnforceConsumerDeletion: Self = this.set("enforceConsumerDeletion", js.undefined)
    @scala.inline
    def setKmsKeyId(value: Input[String]): Self = this.set("kmsKeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKmsKeyId: Self = this.set("kmsKeyId", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setRetentionPeriod(value: Input[Double]): Self = this.set("retentionPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetentionPeriod: Self = this.set("retentionPeriod", js.undefined)
    @scala.inline
    def setShardCount(value: Input[Double]): Self = this.set("shardCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShardCount: Self = this.set("shardCount", js.undefined)
    @scala.inline
    def setShardLevelMetricsVarargs(value: Input[String]*): Self = this.set("shardLevelMetrics", js.Array(value :_*))
    @scala.inline
    def setShardLevelMetrics(value: Input[js.Array[Input[String]]]): Self = this.set("shardLevelMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShardLevelMetrics: Self = this.set("shardLevelMetrics", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

