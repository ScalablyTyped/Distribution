package typings
package sequelizeLib.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Through options for Include Options
  */
trait IncludeThroughOptions extends js.Object {
  /**
    * A list of attributes to select from the join model for belongsToMany relations
    */
  var attributes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Filter on the join model for belongsToMany relations
    */
  var where: js.UndefOr[AnyWhereOptions] = js.undefined
}

object IncludeThroughOptions {
  @scala.inline
  def apply(attributes: js.Array[java.lang.String] = null, where: AnyWhereOptions = null): IncludeThroughOptions = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (where != null) __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[IncludeThroughOptions]
  }
}

