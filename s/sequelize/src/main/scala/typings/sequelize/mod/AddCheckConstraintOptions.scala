package typings.sequelize.mod

import typings.sequelize.sequelizeStrings.check
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddCheckConstraintOptions extends AddConstraintOptions {
  var name: js.UndefOr[String] = js.undefined
  var `type`: check
  var where: js.UndefOr[AnyWhereOptions] = js.undefined
}

object AddCheckConstraintOptions {
  @scala.inline
  def apply(`type`: check, name: String = null, where: AnyWhereOptions = null): AddCheckConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddCheckConstraintOptions]
  }
}

