package typings.protocolDashBuffersDashSchema.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schema extends js.Object {
  @JSName("package")
  var _package: Null | String
  var enums: js.Array[Enum]
  var `extends`: js.Array[Extend]
  var imports: js.Array[String]
  var messages: js.Array[Message]
  var options: Options
  var service: js.UndefOr[js.Array[Service]] = js.undefined
  var syntax: Double
}

object Schema {
  @scala.inline
  def apply(
    enums: js.Array[Enum],
    `extends`: js.Array[Extend],
    imports: js.Array[String],
    messages: js.Array[Message],
    options: Options,
    syntax: Double,
    _package: String = null,
    service: js.Array[Service] = null
  ): Schema = {
    val __obj = js.Dynamic.literal(enums = enums.asInstanceOf[js.Any], imports = imports.asInstanceOf[js.Any], messages = messages.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], syntax = syntax.asInstanceOf[js.Any])
    __obj.updateDynamic("extends")(`extends`.asInstanceOf[js.Any])
    if (_package != null) __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema]
  }
}

