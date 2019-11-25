package typings.sequelize.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options used for Instance.save method
  */
trait InstanceSaveOptions
  extends FieldsOptions
     with LoggingOptions
     with ReturningOptions
     with SearchPathOptions {
  var hooks: js.UndefOr[Boolean] = js.undefined
  /**
    * If true, the updatedAt timestamp will not be updated.
    *
    * Defaults to false
    */
  var silent: js.UndefOr[Boolean] = js.undefined
}

object InstanceSaveOptions {
  @scala.inline
  def apply(
    benchmark: js.UndefOr[Boolean] = js.undefined,
    fields: js.Array[String] = null,
    hooks: js.UndefOr[Boolean] = js.undefined,
    logging: Boolean | js.Function = null,
    returning: js.UndefOr[Boolean] = js.undefined,
    searchPath: String = null,
    silent: js.UndefOr[Boolean] = js.undefined,
    transaction: Transaction = null,
    validate: js.UndefOr[Boolean] = js.undefined
  ): InstanceSaveOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(benchmark)) __obj.updateDynamic("benchmark")(benchmark.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (!js.isUndefined(hooks)) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (!js.isUndefined(returning)) __obj.updateDynamic("returning")(returning.asInstanceOf[js.Any])
    if (searchPath != null) __obj.updateDynamic("searchPath")(searchPath.asInstanceOf[js.Any])
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceSaveOptions]
  }
}

