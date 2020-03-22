package typings.storybookComponents.propDefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropDef extends js.Object {
  var defaultValue: js.UndefOr[PropDefaultValue] = js.native
  var description: js.UndefOr[String] = js.native
  var jsDocTags: js.UndefOr[JsDocTags] = js.native
  var name: String = js.native
  var required: Boolean = js.native
  var `type`: PropType = js.native
}

object PropDef {
  @scala.inline
  def apply(
    name: String,
    required: Boolean,
    `type`: PropType,
    defaultValue: PropDefaultValue = null,
    description: String = null,
    jsDocTags: JsDocTags = null
  ): PropDef = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (jsDocTags != null) __obj.updateDynamic("jsDocTags")(jsDocTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropDef]
  }
}

