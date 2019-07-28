package typings.atPulumiAws.daxSubnetGroupMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubnetGroupArgs extends js.Object {
  /**
    * A description of the subnet group.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the subnet group.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * A list of VPC subnet IDs for the subnet group.
    */
  val subnetIds: Input[js.Array[Input[String]]]
}

object SubnetGroupArgs {
  @scala.inline
  def apply(
    subnetIds: Input[js.Array[Input[String]]],
    description: Input[String] = null,
    name: Input[String] = null
  ): SubnetGroupArgs = {
    val __obj = js.Dynamic.literal(subnetIds = subnetIds.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubnetGroupArgs]
  }
}

