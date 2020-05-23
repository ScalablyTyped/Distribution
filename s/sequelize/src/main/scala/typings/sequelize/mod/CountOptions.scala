package typings.sequelize.mod

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
  var attributes: js.UndefOr[js.Array[String | (js.Tuple2[String, String])]] = js.undefined
  /**
    * Apply column on which COUNT() should be applied
    */
  var col: js.UndefOr[String] = js.undefined
  /**
    * Apply COUNT(DISTINCT(col))
    */
  var distinct: js.UndefOr[Boolean] = js.undefined
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
  var where: js.UndefOr[AnyWhereOptions | js.Array[String]] = js.undefined
}

object CountOptions {
  @scala.inline
  def apply(
    attributes: js.Array[String | (js.Tuple2[String, String])] = null,
    benchmark: js.UndefOr[Boolean] = js.undefined,
    col: String = null,
    distinct: js.UndefOr[Boolean] = js.undefined,
    group: js.Object = null,
    include: js.Array[(Model[_, _, _]) | IncludeOptions] = null,
    logging: Boolean | js.Function = null,
    searchPath: String = null,
    transaction: Transaction = null,
    where: AnyWhereOptions | js.Array[String] = null
  ): CountOptions = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(benchmark)) __obj.updateDynamic("benchmark")(benchmark.get.asInstanceOf[js.Any])
    if (col != null) __obj.updateDynamic("col")(col.asInstanceOf[js.Any])
    if (!js.isUndefined(distinct)) __obj.updateDynamic("distinct")(distinct.get.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (searchPath != null) __obj.updateDynamic("searchPath")(searchPath.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountOptions]
  }
}

