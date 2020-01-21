package typings.sequelize.mod

import typings.sequelize.sequelizeStrings.`primary key`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddPrimaryKeyConstraintOptions extends AddConstraintOptions {
  var name: js.UndefOr[String] = js.undefined
  var `type`: `primary key`
}

object AddPrimaryKeyConstraintOptions {
  @scala.inline
  def apply(`type`: `primary key`, name: String = null): AddPrimaryKeyConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddPrimaryKeyConstraintOptions]
  }
}

