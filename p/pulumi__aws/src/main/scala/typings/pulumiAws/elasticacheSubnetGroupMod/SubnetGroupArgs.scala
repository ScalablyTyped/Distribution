package typings.pulumiAws.elasticacheSubnetGroupMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubnetGroupArgs extends js.Object {
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

