package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for Model.bulkCreate method
  */
trait BulkCreateOptions
  extends FieldsOptions
     with LoggingOptions
     with SearchPathOptions
     with ReturningOptions {
  /**
    * Run before / after bulk create hooks?
    */
  var hooks: js.UndefOr[Boolean] = js.undefined
  /**
    * Ignore duplicate values for primary keys? (not supported by postgres)
    *
    * Defaults to false
    */
  var ignoreDuplicates: js.UndefOr[Boolean] = js.undefined
  /**
    * Run before / after create hooks for each individual Instance? BulkCreate hooks will still be run if
    * options.hooks is true.
    */
  var individualHooks: js.UndefOr[Boolean] = js.undefined
  /**
    * Fields to update if row key already exists (on duplicate key update)? (only supported by mysql &
    * mariadb). By default, all fields are updated.
    */
  var updateOnDuplicate: js.UndefOr[js.Array[String]] = js.undefined
}

object BulkCreateOptions {
  @scala.inline
  def apply(
    benchmark: js.UndefOr[Boolean] = js.undefined,
    fields: js.Array[String] = null,
    hooks: js.UndefOr[Boolean] = js.undefined,
    ignoreDuplicates: js.UndefOr[Boolean] = js.undefined,
    individualHooks: js.UndefOr[Boolean] = js.undefined,
    logging: Boolean | js.Function = null,
    returning: js.UndefOr[Boolean] = js.undefined,
    searchPath: String = null,
    transaction: Transaction = null,
    updateOnDuplicate: js.Array[String] = null,
    validate: js.UndefOr[Boolean] = js.undefined
  ): BulkCreateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(benchmark)) __obj.updateDynamic("benchmark")(benchmark.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(hooks)) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreDuplicates)) __obj.updateDynamic("ignoreDuplicates")(ignoreDuplicates.asInstanceOf[js.Any])
    if (!js.isUndefined(individualHooks)) __obj.updateDynamic("individualHooks")(individualHooks.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (!js.isUndefined(returning)) __obj.updateDynamic("returning")(returning.asInstanceOf[js.Any])
    if (searchPath != null) __obj.updateDynamic("searchPath")(searchPath.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    if (updateOnDuplicate != null) __obj.updateDynamic("updateOnDuplicate")(updateOnDuplicate.asInstanceOf[js.Any])
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[BulkCreateOptions]
  }
}

