package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddDefaultConstraintOptions extends AddConstraintOptions {
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var `type`: sequelizeLib.sequelizeLibStrings.default
}

object AddDefaultConstraintOptions {
  @scala.inline
  def apply(
    `type`: sequelizeLib.sequelizeLibStrings.default,
    defaultValue: js.Any = null,
    name: java.lang.String = null
  ): AddDefaultConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[AddDefaultConstraintOptions]
  }
}

