package typings.pulumiAws.resourcegroupsGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.resourcegroups.GroupResourceQuery
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupArgs extends js.Object {
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
  val resourceQuery: Input[GroupResourceQuery] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object GroupArgs {
  @scala.inline
  def apply(
    resourceQuery: Input[GroupResourceQuery],
    description: Input[String] = null,
    name: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): GroupArgs = {
    val __obj = js.Dynamic.literal(resourceQuery = resourceQuery.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupArgs]
  }
}

