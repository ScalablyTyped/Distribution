package typings.sequelize.sequelizeMod

import typings.sequelize.Anon_Exclude
import typings.sequelize.Anon_Level
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for Model.findOrInitialize method
  */
trait FindOrInitializeOptions[TAttributes] extends FindOptions[TAttributes] {
  /**
    * Default values to use if building a new instance
    */
  var defaults: js.UndefOr[TAttributes] = js.undefined
}

object FindOrInitializeOptions {
  @scala.inline
  def apply[TAttributes](
    attributes: FindOptionsAttributesArray | Anon_Exclude = null,
    benchmark: js.UndefOr[Boolean] = js.undefined,
    defaults: TAttributes = null,
    distinct: js.UndefOr[Boolean] = js.undefined,
    group: String | js.Array[String] | js.Object = null,
    having: AnyWhereOptions = null,
    include: js.Array[(Model[_, _, _]) | IncludeOptions] = null,
    limit: Int | Double = null,
    lock: TransactionLockLevel | Anon_Level = null,
    logging: Boolean | js.Function = null,
    offset: Int | Double = null,
    order: String | col | literal | FindOptionsOrderArray | fn | (js.Array[String | col | literal | FindOptionsOrderArray | fn]) = null,
    paranoid: js.UndefOr[Boolean] = js.undefined,
    raw: js.UndefOr[Boolean] = js.undefined,
    rejectOnEmpty: js.UndefOr[Boolean] = js.undefined,
    searchPath: String = null,
    subQuery: js.UndefOr[Boolean] = js.undefined,
    transaction: Transaction = null,
    useMaster: js.UndefOr[Boolean] = js.undefined,
    where: WhereOptions[TAttributes] | where | fn | (js.Array[col | and | or | String]) = null
  ): FindOrInitializeOptions[TAttributes] = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(benchmark)) __obj.updateDynamic("benchmark")(benchmark.asInstanceOf[js.Any])
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (!js.isUndefined(distinct)) __obj.updateDynamic("distinct")(distinct.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (having != null) __obj.updateDynamic("having")(having.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (lock != null) __obj.updateDynamic("lock")(lock.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (!js.isUndefined(paranoid)) __obj.updateDynamic("paranoid")(paranoid.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectOnEmpty)) __obj.updateDynamic("rejectOnEmpty")(rejectOnEmpty.asInstanceOf[js.Any])
    if (searchPath != null) __obj.updateDynamic("searchPath")(searchPath.asInstanceOf[js.Any])
    if (!js.isUndefined(subQuery)) __obj.updateDynamic("subQuery")(subQuery.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    if (!js.isUndefined(useMaster)) __obj.updateDynamic("useMaster")(useMaster.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindOrInitializeOptions[TAttributes]]
  }
}

