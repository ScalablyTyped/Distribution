package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PartitionKey extends js.Object {
  var partitionKey: js.UndefOr[String] = js.undefined
  var roleArn: String
  var streamName: String
}

object Anon_PartitionKey {
  @scala.inline
  def apply(roleArn: String, streamName: String, partitionKey: String = null): Anon_PartitionKey = {
    val __obj = js.Dynamic.literal(roleArn = roleArn, streamName = streamName)
    if (partitionKey != null) __obj.updateDynamic("partitionKey")(partitionKey)
    __obj.asInstanceOf[Anon_PartitionKey]
  }
}

