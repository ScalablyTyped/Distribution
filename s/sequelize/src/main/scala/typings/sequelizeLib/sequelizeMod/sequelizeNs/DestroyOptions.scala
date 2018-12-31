package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options used for Model.destroy
  */
trait DestroyOptions extends TruncateOptions {
  /**
    * Run before / after bulk destroy hooks?
    */
  var hooks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If set to true, destroy will SELECT all records matching the where parameter and will execute before /
    * after destroy hooks on each row
    */
  var individualHooks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * How many rows to delete
    */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /**
    * If set to true, dialects that support it will use TRUNCATE instead of DELETE FROM. If a table is
    * truncated the where and limit options are ignored
    */
  var truncate: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Filter the destroy
    */
  var where: js.UndefOr[AnyWhereOptions] = js.undefined
}

