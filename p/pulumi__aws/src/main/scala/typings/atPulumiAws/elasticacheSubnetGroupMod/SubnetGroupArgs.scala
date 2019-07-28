package typings.atPulumiAws.elasticacheSubnetGroupMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubnetGroupArgs extends js.Object {
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * Name for the cache subnet group. Elasticache converts this name to lowercase.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * List of VPC Subnet IDs for the cache subnet group
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

