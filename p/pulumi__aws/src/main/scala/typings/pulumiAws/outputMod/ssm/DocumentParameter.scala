package typings.pulumiAws.outputMod.ssm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DocumentParameter extends js.Object {
  var defaultValue: js.UndefOr[String] = js.native
  /**
    * The description of the document.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The name of the document.
    */
  var name: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
}

object DocumentParameter {
  @scala.inline
  def apply(
    defaultValue: String = null,
    description: String = null,
    name: String = null,
    `type`: String = null
  ): DocumentParameter = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentParameter]
  }
}

