package typings.atPulumiAws.kinesisGetStreamMod

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
    * The list of shard ids in the CLOSED state. See [Shard State][2] for more.
    */
  val closedShards: js.Array[String] = js.native
  /**
    * The approximate UNIX timestamp that the stream was created.
    */
  val creationTimestamp: Double = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The name of the Kinesis Stream.
    */
  val name: String = js.native
  /**
    * The list of shard ids in the OPEN state. See [Shard State][2] for more.
    */
  val openShards: js.Array[String] = js.native
  /**
    * Length of time (in hours) data records are accessible after they are added to the stream.
    */
  val retentionPeriod: Double = js.native
  /**
    * A list of shard-level CloudWatch metrics which are enabled for the stream. See [Monitoring with CloudWatch][3] for more.
    */
  val shardLevelMetrics: js.Array[String] = js.native
  /**
    * The current status of the stream. The stream status is one of CREATING, DELETING, ACTIVE, or UPDATING.
    */
  val status: String = js.native
  /**
    * A mapping of tags to assigned to the stream.
    */
  val tags: StringDictionary[js.Any] = js.native
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
    tags: StringDictionary[js.Any]
  ): GetStreamResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], closedShards = closedShards.asInstanceOf[js.Any], creationTimestamp = creationTimestamp.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], openShards = openShards.asInstanceOf[js.Any], retentionPeriod = retentionPeriod.asInstanceOf[js.Any], shardLevelMetrics = shardLevelMetrics.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetStreamResult]
  }
}

