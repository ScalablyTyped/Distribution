package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddUniqueConstraintOptions extends AddConstraintOptions {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var `type`: sequelizeLib.sequelizeLibStrings.unique
}

object AddUniqueConstraintOptions {
  @scala.inline
  def apply(`type`: sequelizeLib.sequelizeLibStrings.unique, name: java.lang.String = null): AddUniqueConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[AddUniqueConstraintOptions]
  }
}

