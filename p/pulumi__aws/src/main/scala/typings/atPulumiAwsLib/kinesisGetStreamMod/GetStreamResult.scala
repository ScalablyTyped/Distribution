package typings
package atPulumiAwsLib.kinesisGetStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStreamResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the Kinesis Stream (same as id).
    */
  val arn: java.lang.String
  /**
    * The list of shard ids in the CLOSED state. See [Shard State][2] for more.
    */
  val closedShards: js.Array[java.lang.String]
  /**
    * The approximate UNIX timestamp that the stream was created.
    */
  val creationTimestamp: scala.Double
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The name of the Kinesis Stream.
    */
  val name: java.lang.String
  /**
    * The list of shard ids in the OPEN state. See [Shard State][2] for more.
    */
  val openShards: js.Array[java.lang.String]
  /**
    * Length of time (in hours) data records are accessible after they are added to the stream.
    */
  val retentionPeriod: scala.Double
  /**
    * A list of shard-level CloudWatch metrics which are enabled for the stream. See [Monitoring with CloudWatch][3] for more.
    */
  val shardLevelMetrics: js.Array[java.lang.String]
  /**
    * The current status of the stream. The stream status is one of CREATING, DELETING, ACTIVE, or UPDATING.
    */
  val status: java.lang.String
  /**
    * A mapping of tags to assigned to the stream.
    */
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object GetStreamResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    closedShards: js.Array[java.lang.String],
    creationTimestamp: scala.Double,
    id: java.lang.String,
    name: java.lang.String,
    openShards: js.Array[java.lang.String],
    retentionPeriod: scala.Double,
    shardLevelMetrics: js.Array[java.lang.String],
    status: java.lang.String,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): GetStreamResult = {
    val __obj = js.Dynamic.literal(arn = arn, closedShards = closedShards, creationTimestamp = creationTimestamp, id = id, name = name, openShards = openShards, retentionPeriod = retentionPeriod, shardLevelMetrics = shardLevelMetrics, status = status, tags = tags)
  
    __obj.asInstanceOf[GetStreamResult]
  }
}

