package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PartitionKey extends js.Object {
  var partitionKey: js.UndefOr[java.lang.String] = js.undefined
  var roleArn: java.lang.String
  var streamName: java.lang.String
}

object Anon_PartitionKey {
  @scala.inline
  def apply(roleArn: java.lang.String, streamName: java.lang.String, partitionKey: java.lang.String = null): Anon_PartitionKey = {
    val __obj = js.Dynamic.literal(roleArn = roleArn, streamName = streamName)
    if (partitionKey != null) __obj.updateDynamic("partitionKey")(partitionKey)
    __obj.asInstanceOf[Anon_PartitionKey]
  }
}

