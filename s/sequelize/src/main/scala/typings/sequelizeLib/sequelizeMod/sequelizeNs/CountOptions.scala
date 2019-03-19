package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for Model.count method
  */
trait CountOptions
  extends LoggingOptions
     with SearchPathOptions {
  /**
    * Used in conjustion with `group`
    */
  var attributes: js.UndefOr[js.Array[java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])]] = js.undefined
  /**
    * Apply column on which COUNT() should be applied
    */
  var col: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Apply COUNT(DISTINCT(col))
    */
  var distinct: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * For creating complex counts. Will return multiple rows as needed.
    *
    * TODO: Check?
    */
  var group: js.UndefOr[js.Object] = js.undefined
  /**
    * Include options. See `find` for details
    */
  var include: js.UndefOr[js.Array[(Model[_, _, _]) | IncludeOptions]] = js.undefined
  /**
    * A hash of search attributes.
    */
  var where: js.UndefOr[AnyWhereOptions | js.Array[java.lang.String]] = js.undefined
}

object CountOptions {
  @scala.inline
  def apply(
    attributes: js.Array[java.lang.String | (js.Tuple2[java.lang.String, java.lang.String])] = null,
    benchmark: js.UndefOr[scala.Boolean] = js.undefined,
    col: java.lang.String = null,
    distinct: js.UndefOr[scala.Boolean] = js.undefined,
    group: js.Object = null,
    include: js.Array[(Model[_, _, _]) | IncludeOptions] = null,
    logging: scala.Boolean | js.Function = null,
    searchPath: java.lang.String = null,
    transaction: Transaction = null,
    where: AnyWhereOptions | js.Array[java.lang.String] = null
  ): CountOptions = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (!js.isUndefined(benchmark)) __obj.updateDynamic("benchmark")(benchmark)
    if (col != null) __obj.updateDynamic("col")(col)
    if (!js.isUndefined(distinct)) __obj.updateDynamic("distinct")(distinct)
    if (group != null) __obj.updateDynamic("group")(group)
    if (include != null) __obj.updateDynamic("include")(include)
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (searchPath != null) __obj.updateDynamic("searchPath")(searchPath)
    if (transaction != null) __obj.updateDynamic("transaction")(transaction)
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountOptions]
  }
}

