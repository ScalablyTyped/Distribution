package typings.atPulumiAws.typesOutputMod.ssmNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentParameter extends js.Object {
  var defaultValue: js.UndefOr[String] = js.undefined
  /**
    * The description of the document.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The name of the document.
    */
  var name: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
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
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DocumentParameter]
  }
}

