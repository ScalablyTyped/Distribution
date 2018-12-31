package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for Model.restore
  */
trait RestoreOptions extends LoggingOptions {
  /**
    * Run before / after bulk restore hooks?
    */
  var hooks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If set to true, restore will find all records within the where parameter and will execute before / after
    * bulkRestore hooks on each row
    */
  var individualHooks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * How many rows to undelete
    */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /**
    * Transaction to run query under
    */
  var transaction: js.UndefOr[Transaction] = js.undefined
  /**
    * Filter the restore
    */
  var where: js.UndefOr[AnyWhereOptions] = js.undefined
}

