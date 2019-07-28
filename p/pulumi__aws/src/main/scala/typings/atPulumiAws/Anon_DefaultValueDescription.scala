package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultValueDescription extends js.Object {
  var defaultValue: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Anon_DefaultValueDescription {
  @scala.inline
  def apply(
    defaultValue: String = null,
    description: String = null,
    name: String = null,
    `type`: String = null
  ): Anon_DefaultValueDescription = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (description != null) __obj.updateDynamic("description")(description)
    if (name != null) __obj.updateDynamic("name")(name)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_DefaultValueDescription]
  }
}

