package typings.pulumiAws.ipGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.workspaces.IpGroupRule
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IpGroupState extends js.Object {
  /**
    * The description.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the IP group.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * One or more pairs specifying the IP group rule (in CIDR format) from which web requests originate.
    */
  val rules: js.UndefOr[Input[js.Array[Input[IpGroupRule]]]] = js.native
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
}

object IpGroupState {
  @scala.inline
  def apply(
    description: Input[String] = null,
    name: Input[String] = null,
    rules: Input[js.Array[Input[IpGroupRule]]] = null,
    tags: Input[StringDictionary[_]] = null
  ): IpGroupState = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (rules != null) __obj.updateDynamic("rules")(rules.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpGroupState]
  }
}

