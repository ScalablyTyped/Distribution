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

object DestroyOptions {
  @scala.inline
  def apply(
    benchmark: js.UndefOr[scala.Boolean] = js.undefined,
    cascade: js.UndefOr[scala.Boolean] = js.undefined,
    force: js.UndefOr[scala.Boolean] = js.undefined,
    hooks: js.UndefOr[scala.Boolean] = js.undefined,
    individualHooks: js.UndefOr[scala.Boolean] = js.undefined,
    limit: scala.Int | scala.Double = null,
    logging: scala.Boolean | js.Function = null,
    searchPath: java.lang.String = null,
    transaction: Transaction = null,
    truncate: js.UndefOr[scala.Boolean] = js.undefined,
    where: AnyWhereOptions = null
  ): DestroyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(benchmark)) __obj.updateDynamic("benchmark")(benchmark)
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (!js.isUndefined(hooks)) __obj.updateDynamic("hooks")(hooks)
    if (!js.isUndefined(individualHooks)) __obj.updateDynamic("individualHooks")(individualHooks)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (searchPath != null) __obj.updateDynamic("searchPath")(searchPath)
    if (transaction != null) __obj.updateDynamic("transaction")(transaction)
    if (!js.isUndefined(truncate)) __obj.updateDynamic("truncate")(truncate)
    if (where != null) __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[DestroyOptions]
  }
}

