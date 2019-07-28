package typings.protocolDashBuffersDashSchema.typesMod

import typings.protocolDashBuffersDashSchema.Anon_From
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends js.Object {
  var map: Anon_From
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
    map: Anon_From,
    name: String,
    options: FieldOptions,
    repeated: Boolean,
    required: Boolean,
    tag: Double,
    `type`: String,
    oneof: String = null
  ): Field = {
    val __obj = js.Dynamic.literal(map = map, name = name, options = options, repeated = repeated, required = required, tag = tag)
    __obj.updateDynamic("type")(`type`)
    if (oneof != null) __obj.updateDynamic("oneof")(oneof)
    __obj.asInstanceOf[Field]
  }
}

