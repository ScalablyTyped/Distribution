package typings
package sequelizeLib.sequelizeMod.sequelizeNs

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

