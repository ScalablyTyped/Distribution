package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddCheckConstraintOptions extends AddConstraintOptions {
  var name: js.UndefOr[java.lang.String] = js.undefined
  var `type`: sequelizeLib.sequelizeLibStrings.check
  var where: js.UndefOr[AnyWhereOptions] = js.undefined
}

object AddCheckConstraintOptions {
  @scala.inline
  def apply(
    `type`: sequelizeLib.sequelizeLibStrings.check,
    name: java.lang.String = null,
    where: AnyWhereOptions = null
  ): AddCheckConstraintOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (name != null) __obj.updateDynamic("name")(name)
    if (where != null) __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[AddCheckConstraintOptions]
  }
}

