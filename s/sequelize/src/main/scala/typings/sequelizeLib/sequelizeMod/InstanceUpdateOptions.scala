package typings
package sequelizeLib.sequelizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options used for Instance.update method
  */
trait InstanceUpdateOptions
  extends InstanceSaveOptions
     with InstanceSetOptions {
  /**
    * A hash of attributes to describe your search. See above for examples.
    */
  var where: js.UndefOr[AnyWhereOptions | (js.Array[col | and | or | java.lang.String])] = js.undefined
}

object InstanceUpdateOptions {
  @scala.inline
  def apply(
    benchmark: js.UndefOr[scala.Boolean] = js.undefined,
    fields: js.Array[java.lang.String] = null,
    hooks: js.UndefOr[scala.Boolean] = js.undefined,
    logging: scala.Boolean | js.Function = null,
    raw: js.UndefOr[scala.Boolean] = js.undefined,
    reset: js.UndefOr[scala.Boolean] = js.undefined,
    returning: js.UndefOr[scala.Boolean] = js.undefined,
    searchPath: java.lang.String = null,
    silent: js.UndefOr[scala.Boolean] = js.undefined,
    transaction: Transaction = null,
    validate: js.UndefOr[scala.Boolean] = js.undefined,
    where: AnyWhereOptions | (js.Array[col | and | or | java.lang.String]) = null
  ): InstanceUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(benchmark)) __obj.updateDynamic("benchmark")(benchmark)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(hooks)) __obj.updateDynamic("hooks")(hooks)
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (!js.isUndefined(reset)) __obj.updateDynamic("reset")(reset)
    if (!js.isUndefined(returning)) __obj.updateDynamic("returning")(returning)
    if (searchPath != null) __obj.updateDynamic("searchPath")(searchPath)
    if (!js.isUndefined(silent)) __obj.updateDynamic("silent")(silent)
    if (transaction != null) __obj.updateDynamic("transaction")(transaction)
    if (!js.isUndefined(validate)) __obj.updateDynamic("validate")(validate)
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceUpdateOptions]
  }
}

