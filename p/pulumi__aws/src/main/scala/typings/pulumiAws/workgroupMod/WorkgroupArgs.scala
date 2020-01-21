package typings.pulumiAws.workgroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.athena.WorkgroupConfiguration
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkgroupArgs extends js.Object {
  /**
    * Configuration block with various settings for the workgroup. Documented below.
    */
  val configuration: js.UndefOr[Input[WorkgroupConfiguration]] = js.native
  /**
    * Description of the workgroup.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the workgroup.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * State of the workgroup. Valid values are `DISABLED` or `ENABLED`. Defaults to `ENABLED`.
    */
  val state: js.UndefOr[Input[String]] = js.native
  /**
    * Key-value mapping of resource tags for the workgroup.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object WorkgroupArgs {
  @scala.inline
  def apply(
    configuration: Input[WorkgroupConfiguration] = null,
    description: Input[String] = null,
    name: Input[String] = null,
    state: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): WorkgroupArgs = {
    val __obj = js.Dynamic.literal()
    if (configuration != null) __obj.updateDynamic("configuration")(configuration.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (state != null) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkgroupArgs]
  }
}

