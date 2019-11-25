package typings.sequelize.sequelizeMod

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
  var hooks: js.UndefOr[Boolean] = js.undefined
  /**
    * If set to true, destroy will SELECT all records matching the where parameter and will execute before /
    * after destroy hooks on each row
    */
  var individualHooks: js.UndefOr[Boolean] = js.undefined
  /**
    * How many rows to delete
    */
  var limit: js.UndefOr[Double] = js.undefined
  /**
    * If set to true, dialects that support it will use TRUNCATE instead of DELETE FROM. If a table is
    * truncated the where and limit options are ignored
    */
  var truncate: js.UndefOr[Boolean] = js.undefined
  /**
    * Filter the destroy
    */
  var where: js.UndefOr[AnyWhereOptions] = js.undefined
}

object DestroyOptions {
  @scala.inline
  def apply(
    benchmark: js.UndefOr[Boolean] = js.undefined,
    cascade: js.UndefOr[Boolean] = js.undefined,
    force: js.UndefOr[Boolean] = js.undefined,
    hooks: js.UndefOr[Boolean] = js.undefined,
    individualHooks: js.UndefOr[Boolean] = js.undefined,
    limit: Int | Double = null,
    logging: Boolean | js.Function = null,
    searchPath: String = null,
    transaction: Transaction = null,
    truncate: js.UndefOr[Boolean] = js.undefined,
    where: AnyWhereOptions = null
  ): DestroyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(benchmark)) __obj.updateDynamic("benchmark")(benchmark.asInstanceOf[js.Any])
    if (!js.isUndefined(cascade)) __obj.updateDynamic("cascade")(cascade.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (!js.isUndefined(hooks)) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (!js.isUndefined(individualHooks)) __obj.updateDynamic("individualHooks")(individualHooks.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (searchPath != null) __obj.updateDynamic("searchPath")(searchPath.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    if (!js.isUndefined(truncate)) __obj.updateDynamic("truncate")(truncate.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[DestroyOptions]
  }
}

