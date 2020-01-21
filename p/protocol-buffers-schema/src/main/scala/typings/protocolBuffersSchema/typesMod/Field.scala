package typings.protocolBuffersSchema.typesMod

import typings.protocolBuffersSchema.AnonFrom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends js.Object {
  var map: AnonFrom
  var name: String
  var oneof: Null | String
  var options: FieldOptions
  var repeated: Boolean
  var required: Boolean
  var tag: Double
  var `type`: String
}

object Field {
  @scala.inline
  def apply(
    map: AnonFrom,
    name: String,
    options: FieldOptions,
    repeated: Boolean,
    required: Boolean,
    tag: Double,
    `type`: String,
    oneof: String = null
  ): Field = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], repeated = repeated.asInstanceOf[js.Any], required = required.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (oneof != null) __obj.updateDynamic("oneof")(oneof.asInstanceOf[js.Any])
    __obj.asInstanceOf[Field]
  }
}

