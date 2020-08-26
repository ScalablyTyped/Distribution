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
  def apply(name: String, required: Boolean, `type`: PropType): PropDef = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropDef]
  }
  @scala.inline
  implicit class PropDefOps[Self <: PropDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: PropType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultValue(value: PropDefaultValue): Self = this.set("defaultValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultValue: Self = this.set("defaultValue", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setJsDocTags(value: JsDocTags): Self = this.set("jsDocTags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJsDocTags: Self = this.set("jsDocTags", js.undefined)
  }
  
}

