package typings.pulumiAws.resourcegroupsGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.resourcegroups.GroupResourceQuery
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupState extends js.Object {
  /**
    * The ARN assigned by AWS for this resource group.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * A description of the resource group.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The resource group's name. A resource group name can have a maximum of 127 characters, including letters, numbers, hyphens, dots, and underscores. The name cannot start with `AWS` or `aws`.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A `resourceQuery` block. Resource queries are documented below.
    */
  val resourceQuery: js.UndefOr[Input[GroupResourceQuery]] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object GroupState {
  @scala.inline
  def apply(
    arn: Input[String] = null,
    description: Input[String] = null,
    name: Input[String] = null,
    resourceQuery: Input[GroupResourceQuery] = null,
    tags: Input[StringDictionary[_]] = null
  ): GroupState = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (resourceQuery != null) __obj.updateDynamic("resourceQuery")(resourceQuery.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupState]
  }
}

