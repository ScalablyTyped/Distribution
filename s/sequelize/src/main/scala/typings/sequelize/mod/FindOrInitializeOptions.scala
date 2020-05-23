package typings.sequelize.mod

import typings.sequelize.anon.Exclude
import typings.sequelize.anon.Level
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
    attributes: FindOptionsAttributesArray | Exclude = null,
    benchmark: js.UndefOr[Boolean] = js.undefined,
    defaults: TAttributes = null,
    distinct: js.UndefOr[Boolean] = js.undefined,
    group: String | js.Array[String] | js.Object = null,
    having: AnyWhereOptions = null,
    include: js.Array[(Model[_, _, _]) | IncludeOptions] = null,
    limit: js.UndefOr[Double] = js.undefined,
    lock: TransactionLockLevel | Level = null,
    logging: Boolean | js.Function = null,
    offset: js.UndefOr[Double] = js.undefined,
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
    if (!js.isUndefined(benchmark)) __obj.updateDynamic("benchmark")(benchmark.get.asInstanceOf[js.Any])
    if (defaults != null) __obj.updateDynamic("defaults")(defaults.asInstanceOf[js.Any])
    if (!js.isUndefined(distinct)) __obj.updateDynamic("distinct")(distinct.get.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (having != null) __obj.updateDynamic("having")(having.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (lock != null) __obj.updateDynamic("lock")(lock.asInstanceOf[js.Any])
    if (logging != null) __obj.updateDynamic("logging")(logging.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset.get.asInstanceOf[js.Any])
    if (order != null) __obj.updateDynamic("order")(order.asInstanceOf[js.Any])
    if (!js.isUndefined(paranoid)) __obj.updateDynamic("paranoid")(paranoid.get.asInstanceOf[js.Any])
    if (!js.isUndefined(raw)) __obj.updateDynamic("raw")(raw.get.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectOnEmpty)) __obj.updateDynamic("rejectOnEmpty")(rejectOnEmpty.get.asInstanceOf[js.Any])
    if (searchPath != null) __obj.updateDynamic("searchPath")(searchPath.asInstanceOf[js.Any])
    if (!js.isUndefined(subQuery)) __obj.updateDynamic("subQuery")(subQuery.get.asInstanceOf[js.Any])
    if (transaction != null) __obj.updateDynamic("transaction")(transaction.asInstanceOf[js.Any])
    if (!js.isUndefined(useMaster)) __obj.updateDynamic("useMaster")(useMaster.get.asInstanceOf[js.Any])
    if (where != null) __obj.updateDynamic("where")(where.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindOrInitializeOptions[TAttributes]]
  }
}

