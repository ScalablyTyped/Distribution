package typings.sequelize.mod

import typings.sequelize.sequelizeStrings.unique_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddUniqueConstraintOptions extends AddConstraintOptions {
  var name: js.UndefOr[String] = js.undefined
  var `type`: unique_
}

object AddUniqueConstraintOptions {
  @scala.inline
  def apply(`type`: unique_, name: String = null): AddUniqueConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddUniqueConstraintOptions]
  }
}

