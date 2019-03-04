package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddPrimaryKeyConstraintOptions extends AddConstraintOptions {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var `type`: sequelizeLib.sequelizeLibStrings.`primary key`
}

object AddPrimaryKeyConstraintOptions {
  @scala.inline
  def apply(`type`: sequelizeLib.sequelizeLibStrings.`primary key`, name: java.lang.String = null): AddPrimaryKeyConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[AddPrimaryKeyConstraintOptions]
  }
}

