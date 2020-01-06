package typings.atPulumiAws.elasticacheSubnetGroupMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubnetGroupState extends js.Object {
  /**
    * Description for the cache subnet group. Defaults to "Managed by Pulumi".
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Name for the cache subnet group. Elasticache converts this name to lowercase.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * List of VPC Subnet IDs for the cache subnet group
    */
  val subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}

object SubnetGroupState {
  @scala.inline
  def apply(
    description: Input[String] = null,
    name: Input[String] = null,
    subnetIds: Input[js.Array[Input[String]]] = null
  ): SubnetGroupState = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (subnetIds != null) __obj.updateDynamic("subnetIds")(subnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubnetGroupState]
  }
}

