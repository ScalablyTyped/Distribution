package typings
package protocolDashBuffersDashSchemaLib.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schema extends js.Object {
  var enums: js.Array[Enum]
  var `extends`: js.Array[Extend]
  var imports: js.Array[java.lang.String]
  var messages: js.Array[Message]
  var options: Options
  var `package`: scala.Null | java.lang.String
  var service: js.UndefOr[js.Array[Service]] = js.undefined
  var syntax: scala.Double
}

object Schema {
  @scala.inline
  def apply(
    enums: js.Array[Enum],
    `extends`: js.Array[Extend],
    imports: js.Array[java.lang.String],
    messages: js.Array[Message],
    options: Options,
    syntax: scala.Double,
    `package`: java.lang.String = null,
    service: js.Array[Service] = null
  ): Schema = {
    val __obj = js.Dynamic.literal(enums = enums, imports = imports, messages = messages, options = options, syntax = syntax)
    __obj.updateDynamic("extends")(`extends`)
    if (`package` != null) __obj.updateDynamic("package")(`package`)
    if (service != null) __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[Schema]
  }
}

