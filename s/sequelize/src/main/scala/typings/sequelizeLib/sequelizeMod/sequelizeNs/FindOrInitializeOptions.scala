package typings
package sequelizeLib.sequelizeMod.sequelizeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for Model.findOrInitialize method
  */
trait FindOrInitializeOptions[TAttributes]
  extends FindOptions[js.Any] {
  /**
    * Default values to use if building a new instance
    */
  var defaults: js.UndefOr[TAttributes] = js.undefined
}

object FindOrInitializeOptions {
  @scala.inline
  def apply[TAttributes](
    attributes: FindOptionsAttributesArray | sequelizeLib.Anon_Exclude = null,
    benchmark: js.UndefOr[scala.Boolean] = js.undefined,
    defaults: TAttributes = null,
    distinct: js.UndefOr[scala.Boolean] = js.undefined,
    group: java.lang.String | js.Array[java.lang.String] | js.Object = null,
    having: AnyWhereOptions = null,
    include: js.Array[(Model[_, _, _]) | IncludeOptions] = null,
    limit: scala.Int | scala.Double = null,
    lock: TransactionLockLevel | sequelizeLib.Anon_Level = null,
    logging: scala.Boolean | js.Function = null,
    offset: scala.Int | scala.Double = null,
    order: java.lang.String | col | literal | FindOptionsOrderArray | fn | (js.Array[java.lang.String | col | literal | FindOptionsOrderArray | fn]) = null,
    paranoid: js.UndefOr[scala.Boolean] = js.undefined,
    raw: js.UndefOr[scala.Boolean] = js.undefined,
    rejectOnEmpty: js.UndefOr[scala.Boolean] = js.undefined,
    searchPath: java.lang.String = null,
    subQuery: js.UndefOr[scala.Boolean] = js.undefined,
    transaction: Transaction = null,
    useMaster: js.UndefOr[scala.Boolean] = js.undefined,
    where: WhereOptions[js.Any] | where | fn | (js.Array[col | and | or | java.lang.String]) = null
  ): FindOrInitializeOptions[TAttributes] = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(benchmark)) __obj.updateDynamic("benchmark")(benchmark)
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (!js.isUndefined(distinct)) __obj.updateDynamic("distinct")(distinct)
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (having != null) __obj.updateDynamic("having")(having)
    if (include != null) __obj.updateDynamic("include")(include)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (lock != null) __obj.updateDynamic("lock")(lock.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (!js.isUndefined(paranoid)) __obj.updateDynamic("paranoid")(paranoid)
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw)
    if (!js.isUndefined(rejectOnEmpty)) __obj.updateDynamic("rejectOnEmpty")(rejectOnEmpty)
    if (searchPath != null) __obj.updateDynamic("searchPath")(searchPath)
    if (!js.isUndefined(subQuery)) __obj.updateDynamic("subQuery")(subQuery)
    if (transaction != null) __obj.updateDynamic("transaction")(transaction)
    if (!js.isUndefined(useMaster)) __obj.updateDynamic("useMaster")(useMaster)
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindOrInitializeOptions[TAttributes]]
  }
}

