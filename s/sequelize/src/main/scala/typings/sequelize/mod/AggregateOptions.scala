package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options used for Model.aggregate
  */
trait AggregateOptions extends LoggingOptions {
  /**
    * The type of the result. If `field` is a field in this Model, the default will be the type of that field,
    * otherwise defaults to float.
    */
  var dataType: js.UndefOr[DataTypeAbstract | String] = js.undefined
  /**
    * Applies DISTINCT to the field being aggregated over
    */
  var distinct: js.UndefOr[Boolean] = js.undefined
  /**
    * When `true`, the first returned value of `aggregateFunction` is cast to `dataType` and returned.
    * If additional attributes are specified, along with `group` clauses, set `plain` to `false` to return all values of all returned rows.
    * Defaults to `true`
    */
  var plain: js.UndefOr[Boolean] = js.undefined
  /**
    * The transaction that the query should be executed under
    */
  var transaction: js.UndefOr[Transaction] = js.undefined
  /**
    * A hash of search attributes.
    */
  var where: js.UndefOr[AnyWhereOptions] = js.undefined
}

object AggregateOptions {
  @scala.inline
  def apply(
    benchmark: js.UndefOr[Boolean] = js.undefined,
    dataType: DataTypeAbstract | String = null,
    distinct: js.UndefOr[Boolean] = js.undefined,
    logging: Boolean | js.Function = null,
    plain: js.UndefOr[Boolean] = js.undefined,
    transaction: Transaction = null,
    where: AnyWhereOptions = null
  ): AggregateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(benchmark)) __obj.updateDynamic("benchmark")(benchmark.asInstanceOf[js.Any])
    if (dataType != null) __obj.updateDynamic("dataType")(dataType.asInstanceOf[js.Any])
    if (!js.isUndefined(distinct)) __obj.updateDynamic("distinct")(distinct.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (!js.isUndefined(plain)) __obj.updateDynamic("plain")(plain.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateOptions]
  }
}

