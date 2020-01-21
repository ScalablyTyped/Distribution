package typings.pulumiAws.subnetGroupMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubnetGroupArgs extends js.Object {
  /**
    * A description of the subnet group.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the subnet group.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A list of VPC subnet IDs for the subnet group.
    */
  val subnetIds: Input[js.Array[Input[String]]] = js.native
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

