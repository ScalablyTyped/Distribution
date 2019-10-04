package typings.atPulumiAws.typesInputMod.ssmNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentParameter extends js.Object {
  var defaultValue: js.UndefOr[Input[String]] = js.undefined
  /**
    * The description of the document.
    */
  var description: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the document.
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  var `type`: js.UndefOr[Input[String]] = js.undefined
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

