package typings.sequelize.mod

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
  var hooks: js.UndefOr[Boolean] = js.undefined
  /**
    * Run before / after update hooks?. If true, this will execute a SELECT followed by individual UPDATEs.
    * A select is needed, because the row data needs to be passed to the hooks
    *
    * Defaults to false
    */
  var individualHooks: js.UndefOr[Boolean] = js.undefined
  /**
    * How many rows to update (only for mysql and mariadb)
    */
  var limit: js.UndefOr[Double] = js.undefined
  /**
    * Whether or not to update the side effects of any virtual setters.
    *
    * Defaults to true
    */
  var sideEffects: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, the updatedAt timestamp will not be updated.
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  /**
    * Transaction to run query under
    */
  var transaction: js.UndefOr[Transaction] = js.undefined
  /**
    * Options to describe the scope of the search.
    */
  var where: AnyWhereOptions
}

object UpdateOptions {
  @scala.inline
  def apply(
    where: AnyWhereOptions,
    benchmark: js.UndefOr[Boolean] = js.undefined,
    fields: js.Array[String] = null,
    hooks: js.UndefOr[Boolean] = js.undefined,
    individualHooks: js.UndefOr[Boolean] = js.undefined,
    limit: js.UndefOr[Double] = js.undefined,
    logging: Boolean | js.Function = null,
    returning: js.UndefOr[Boolean] = js.undefined,
    sideEffects: js.UndefOr[Boolean] = js.undefined,
    silent: js.UndefOr[Boolean] = js.undefined,
    transaction: Transaction = null,
    validate: js.UndefOr[Boolean] = js.undefined
  ): UpdateOptions = {
    val __obj = js.Dynamic.literal(where = where.asInstanceOf[js.Any])
    if (!js.isUndefined(benchmark)) __obj.updateDynamic("benchmark")(benchmark.get.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(hooks)) __obj.updateDynamic("hooks")(hooks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(individualHooks)) __obj.updateDynamic("individualHooks")(individualHooks.get.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (!js.isUndefined(returning)) __obj.updateDynamic("returning")(returning.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sideEffects)) __obj.updateDynamic("sideEffects")(sideEffects.get.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.get.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOptions]
  }
}

