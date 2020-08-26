package typings.protocolBuffersSchema.typesMod

import typings.protocolBuffersSchema.anon.From
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Field extends js.Object {
  var map: From = js.native
  var name: String = js.native
  var oneof: Null | String = js.native
  var options: FieldOptions = js.native
  var repeated: Boolean = js.native
  var required: Boolean = js.native
  var tag: Double = js.native
  var `type`: String = js.native
}

object Field {
  @scala.inline
  def apply(
    map: From,
    name: String,
    options: FieldOptions,
    repeated: Boolean,
    required: Boolean,
    tag: Double,
    `type`: String
  ): Field = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], repeated = repeated.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
  @scala.inline
  implicit class FieldOps[Self <: Field] (val x: Self) extends AnyVal {
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
    def setMap(value: From): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: FieldOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepeated(value: Boolean): Self = this.set("repeated", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: Double): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setOneof(value: String): Self = this.set("oneof", value.asInstanceOf[js.Any])
    @scala.inline
    def setOneofNull: Self = this.set("oneof", null)
  }
  
}

