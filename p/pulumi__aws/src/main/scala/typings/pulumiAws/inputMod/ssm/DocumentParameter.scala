package typings.pulumiAws.inputMod.ssm

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentParameter extends js.Object {
  var defaultValue: js.UndefOr[Input[String]] = js.native
  /**
    * The description of the document.
    */
  var description: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the document.
    */
  var name: js.UndefOr[Input[String]] = js.native
  var `type`: js.UndefOr[Input[String]] = js.native
}

object DocumentParameter {
  @scala.inline
  def apply(
    defaultValue: Input[String] = null,
    description: Input[String] = null,
    name: Input[String] = null,
    `type`: Input[String] = null
  ): DocumentParameter = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentParameter]
  }
}

