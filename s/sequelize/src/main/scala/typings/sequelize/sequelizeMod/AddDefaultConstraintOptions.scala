package typings.sequelize.sequelizeMod

import typings.sequelize.sequelizeStrings.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddDefaultConstraintOptions extends AddConstraintOptions {
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var `type`: default
}

object AddDefaultConstraintOptions {
  @scala.inline
  def apply(`type`: default, defaultValue: js.Any = null, name: String = null): AddDefaultConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddDefaultConstraintOptions]
  }
}

