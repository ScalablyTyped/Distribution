package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options used for Model.update
  */
trait UpdateOptions
  extends FieldsOptions
     with LoggingOptions
     with ReturningOptions {
  /**
    * Run before / after bulk update hooks?
    *
    * Defaults to true
    */
  var hooks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Run before / after update hooks?. If true, this will execute a SELECT followed by individual UPDATEs.
    * A select is needed, because the row data needs to be passed to the hooks
    *
    * Defaults to false
    */
  var individualHooks: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * How many rows to update (only for mysql and mariadb)
    */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether or not to update the side effects of any virtual setters.
    *
    * Defaults to true
    */
  var sideEffects: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, the updatedAt timestamp will not be updated.
    */
  var silent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Transaction to run query under
    */
  var transaction: js.UndefOr[Transaction] = js.undefined
  /**
    * Options to describe the scope of the search.
    */
  var where: AnyWhereOptions
}

