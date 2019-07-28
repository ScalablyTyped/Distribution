package typings.sequelize.sequelizeMod

import typings.sequelize.Anon_Exclude
import typings.sequelize.Anon_Level
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options that are passed to any model creating a SELECT query
  *
  * A hash of options to describe the scope of the search
  */
trait FindOptions[T]
  extends LoggingOptions
     with SearchPathOptions {
  /**
    * A list of the attributes that you want to select. To rename an attribute, you can pass an array, with
    * two elements - the first is the name of the attribute in the DB (or some kind of expression such as
    * `Sequelize.literal`, `Sequelize.fn` and so on), and the second is the name you want the attribute to
    * have in the returned instance
    */
  var attributes: js.UndefOr[FindOptionsAttributesArray | Anon_Exclude] = js.undefined
  /**
    * Apply DISTINCT(col) for FindAndCount(all)
    */
  var distinct: js.UndefOr[Boolean] = js.undefined
  /**
    * Group by. It is not mentioned in sequelize's JSDoc, but mentioned in docs.
    * https://github.com/sequelize/sequelize/blob/master/docs/docs/models-usage.md#user-content-manipulating-the-dataset-with-limit-offset-order-and-group
    */
  var group: js.UndefOr[String | js.Array[String] | js.Object] = js.undefined
  /**
    * having ?!?
    */
  var having: js.UndefOr[AnyWhereOptions] = js.undefined
  /**
    * A list of associations to eagerly load using a left join. Supported is either
    * `{ include: [ Model1, Model2, ...]}` or `{ include: [{ model: Model1, as: 'Alias' }]}`.
    * If your association are set up with an `as` (eg. `X.hasMany(Y, { as: 'Z }`, you need to specify Z in
    * the as attribute when eager loading Y).
    */
  var include: js.UndefOr[js.Array[(Model[_, _, _]) | IncludeOptions]] = js.undefined
  /**
    * Limit the results
    */
  var limit: js.UndefOr[Double] = js.undefined
  /**
    * Lock the selected rows. Possible options are transaction.LOCK.UPDATE and transaction.LOCK.SHARE.
    * Postgres also supports transaction.LOCK.KEY_SHARE, transaction.LOCK.NO_KEY_UPDATE and specific model
    * locks with joins. See [transaction.LOCK for an example](transaction#lock)
    */
  var lock: js.UndefOr[TransactionLockLevel | Anon_Level] = js.undefined
  /**
    * Skip the results;
    */
  var offset: js.UndefOr[Double] = js.undefined
  /**
    * Specifies an ordering. If a string is provided, it will be escaped. Using an array, you can provide
    * several columns / functions to order by. Each element can be further wrapped in a two-element array. The
    * first element is the column / function to order by, the second is the direction. For example:
    * `order: [['name', 'DESC']]`. In this way the column will be escaped, but the direction will not.
    */
  var order: js.UndefOr[
    String | col | literal | FindOptionsOrderArray | fn | (js.Array[String | col | literal | FindOptionsOrderArray | fn])
  ] = js.undefined
  /**
    * If true, only non-deleted records will be returned. If false, both deleted and non-deleted records will
    * be returned. Only applies if `options.paranoid` is true for the model.
    */
  var paranoid: js.UndefOr[Boolean] = js.undefined
  /**
    * Return raw result. See sequelize.query for more information.
    */
  var raw: js.UndefOr[Boolean] = js.undefined
  /**
    * Throw EmptyResultError if a record is not found
    */
  var rejectOnEmpty: js.UndefOr[Boolean] = js.undefined
  /**
    * Prevents a subquery on the main table when using include
    */
  var subQuery: js.UndefOr[Boolean] = js.undefined
  /**
    * Force the query to use the write pool
    *
    * Defaults to false
    */
  var useMaster: js.UndefOr[Boolean] = js.undefined
  /**
    * A hash of attributes to describe your search. See above for examples.
    */
  var where: js.UndefOr[
    WhereOptions[T] | typings.sequelize.sequelizeMod.where | fn | (js.Array[col | and | or | String])
  ] = js.undefined
}

object FindOptions {
  @scala.inline
  def apply[T](
    attributes: FindOptionsAttributesArray | Anon_Exclude = null,
    benchmark: js.UndefOr[Boolean] = js.undefined,
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
    where: WhereOptions[T] | where | fn | (js.Array[col | and | or | String]) = null
  ): FindOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (!js.isUndefined(benchmark)) __obj.updateDynamic("benchmark")(benchmark)
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
    __obj.asInstanceOf[FindOptions[T]]
  }
}

