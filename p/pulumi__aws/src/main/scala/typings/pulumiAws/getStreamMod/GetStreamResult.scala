package typings.pulumiAws.getStreamMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetStreamResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Kinesis Stream (same as id).
    */
  val arn: String = js.native
  /**
    * The list of shard ids in the CLOSED state. See [Shard State](https://docs.aws.amazon.com/streams/latest/dev/kinesis-using-sdk-java-after-resharding.html#kinesis-using-sdk-java-resharding-data-routing) for more.
    */
  val closedShards: js.Array[String] = js.native
  /**
    * The approximate UNIX timestamp that the stream was created.
    */
  val creationTimestamp: Double = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The name of the Kinesis Stream.
    */
  val name: String = js.native
  /**
    * The list of shard ids in the OPEN state. See [Shard State](https://docs.aws.amazon.com/streams/latest/dev/kinesis-using-sdk-java-after-resharding.html#kinesis-using-sdk-java-resharding-data-routing) for more.
    */
  val openShards: js.Array[String] = js.native
  /**
    * Length of time (in hours) data records are accessible after they are added to the stream.
    */
  val retentionPeriod: Double = js.native
  /**
    * A list of shard-level CloudWatch metrics which are enabled for the stream. See [Monitoring with CloudWatch](https://docs.aws.amazon.com/streams/latest/dev/monitoring-with-cloudwatch.html) for more.
    */
  val shardLevelMetrics: js.Array[String] = js.native
  /**
    * The current status of the stream. The stream status is one of CREATING, DELETING, ACTIVE, or UPDATING.
    */
  val status: String = js.native
  /**
    * A map of tags to assigned to the stream.
    */
  val tags: StringDictionary[String] = js.native
}

object GetStreamResult {
  @scala.inline
  def apply(
    arn: String,
    closedShards: js.Array[String],
    creationTimestamp: Double,
    id: String,
    name: String,
    openShards: js.Array[String],
    retentionPeriod: Double,
    shardLevelMetrics: js.Array[String],
    status: String,
    tags: StringDictionary[String]
  ): GetStreamResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], closedShards = closedShards.asInstanceOf[js.Any], creationTimestamp = creationTimestamp.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], openShards = openShards.asInstanceOf[js.Any], retentionPeriod = retentionPeriod.asInstanceOf[js.Any], shardLevelMetrics = shardLevelMetrics.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStreamResult]
  }
  @scala.inline
  implicit class GetStreamResultOps[Self <: GetStreamResult] (val x: Self) extends AnyVal {
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
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setClosedShardsVarargs(value: String*): Self = this.set("closedShards", js.Array(value :_*))
    @scala.inline
    def setClosedShards(value: js.Array[String]): Self = this.set("closedShards", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreationTimestamp(value: Double): Self = this.set("creationTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOpenShardsVarargs(value: String*): Self = this.set("openShards", js.Array(value :_*))
    @scala.inline
    def setOpenShards(value: js.Array[String]): Self = this.set("openShards", value.asInstanceOf[js.Any])
    @scala.inline
    def setRetentionPeriod(value: Double): Self = this.set("retentionPeriod", value.asInstanceOf[js.Any])
    @scala.inline
    def setShardLevelMetricsVarargs(value: String*): Self = this.set("shardLevelMetrics", js.Array(value :_*))
    @scala.inline
    def setShardLevelMetrics(value: js.Array[String]): Self = this.set("shardLevelMetrics", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
  }
  
}

