package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PartitionKeyRoleArn extends js.Object {
  var partitionKey: js.UndefOr[Input[String]] = js.undefined
  var roleArn: Input[String]
  var streamName: Input[String]
}

object Anon_PartitionKeyRoleArn {
  @scala.inline
  def apply(roleArn: Input[String], streamName: Input[String], partitionKey: Input[String] = null): Anon_PartitionKeyRoleArn = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], streamName = streamName.asInstanceOf[js.Any])
    if (partitionKey != null) __obj.updateDynamic("partitionKey")(partitionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PartitionKeyRoleArn]
  }
}

