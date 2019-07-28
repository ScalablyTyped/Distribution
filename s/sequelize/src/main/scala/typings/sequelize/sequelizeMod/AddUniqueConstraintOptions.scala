package typings.sequelize.sequelizeMod

import typings.sequelize.sequelizeStrings.unique
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddUniqueConstraintOptions extends AddConstraintOptions {
  var name: js.UndefOr[String] = js.undefined
  var `type`: unique
}

object AddUniqueConstraintOptions {
  @scala.inline
  def apply(`type`: unique, name: String = null): AddUniqueConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[AddUniqueConstraintOptions]
  }
}

