package typings.atPulumiAws.resourcegroupsGroupMod

import typings.atPulumiAws.typesInputMod.resourcegroupsNs.GroupResourceQuery
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupState extends js.Object {
  /**
    * The ARN assigned by AWS for this resource group.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * A description of the resource group.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * The resource group's name. A resource group name can have a maximum of 127 characters, including letters, numbers, hyphens, dots, and underscores. The name cannot start with `AWS` or `aws`.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * A `resourceQuery` block. Resource queries are documented below.
    */
  val resourceQuery: js.UndefOr[Input[GroupResourceQuery]] = js.undefined
}

object GroupState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    description: Input[String] = null,
    name: Input[String] = null,
    resourceQuery: Input[GroupResourceQuery] = null
  ): GroupState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resourceQuery != null) __obj.updateDynamic("resourceQuery")(resourceQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupState]
  }
}

