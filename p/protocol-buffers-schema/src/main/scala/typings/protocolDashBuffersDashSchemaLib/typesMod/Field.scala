package typings
package protocolDashBuffersDashSchemaLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Field extends js.Object {
  var map: protocolDashBuffersDashSchemaLib.Anon_From
  var name: java.lang.String
  var oneof: scala.Null | java.lang.String
  var options: FieldOptions
  var repeated: scala.Boolean
  var required: scala.Boolean
  var tag: scala.Double
  var `type`: java.lang.String
}

object Field {
  @scala.inline
  def apply(
    map: protocolDashBuffersDashSchemaLib.Anon_From,
    name: java.lang.String,
    options: FieldOptions,
    repeated: scala.Boolean,
    required: scala.Boolean,
    tag: scala.Double,
    `type`: java.lang.String,
    oneof: java.lang.String = null
  ): Field = {
    val __obj = js.Dynamic.literal(map = map, name = name, options = options, repeated = repeated, required = required, tag = tag)
    __obj.updateDynamic("type")(`type`)
    if (oneof != null) __obj.updateDynamic("oneof")(oneof)
    __obj.asInstanceOf[Field]
  }
}

