package typings.atPulumiAws.kinesisGetStreamMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStreamResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Kinesis Stream (same as id).
    */
  val arn: String
  /**
    * The list of shard ids in the CLOSED state. See [Shard State][2] for more.
    */
  val closedShards: js.Array[String]
  /**
    * The approximate UNIX timestamp that the stream was created.
    */
  val creationTimestamp: Double
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * The name of the Kinesis Stream.
    */
  val name: String
  /**
    * The list of shard ids in the OPEN state. See [Shard State][2] for more.
    */
  val openShards: js.Array[String]
  /**
    * Length of time (in hours) data records are accessible after they are added to the stream.
    */
  val retentionPeriod: Double
  /**
    * A list of shard-level CloudWatch metrics which are enabled for the stream. See [Monitoring with CloudWatch][3] for more.
    */
  val shardLevelMetrics: js.Array[String]
  /**
    * The current status of the stream. The stream status is one of CREATING, DELETING, ACTIVE, or UPDATING.
    */
  val status: String
  /**
    * A mapping of tags to assigned to the stream.
    */
  val tags: StringDictionary[js.Any]
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
    val __obj = js.Dynamic.literal(arn = arn, closedShards = closedShards, creationTimestamp = creationTimestamp, id = id, name = name, openShards = openShards, retentionPeriod = retentionPeriod, shardLevelMetrics = shardLevelMetrics, status = status, tags = tags)
  
    __obj.asInstanceOf[GetStreamResult]
  }
}

