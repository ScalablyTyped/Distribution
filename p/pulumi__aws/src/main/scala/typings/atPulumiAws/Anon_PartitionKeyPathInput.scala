package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PartitionKeyPathInput extends js.Object {
  var partitionKeyPath: js.UndefOr[Input[String]] = js.undefined
}

object Anon_PartitionKeyPathInput {
  @scala.inline
  def apply(partitionKeyPath: Input[String] = null): Anon_PartitionKeyPathInput = {
    val __obj = js.Dynamic.literal()
    if (partitionKeyPath != null) __obj.updateDynamic("partitionKeyPath")(partitionKeyPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_PartitionKeyPathInput]
  }
}

