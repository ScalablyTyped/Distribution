package typings
package sequelizeLib.sequelizeMod.sequelizeNs

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
  var attributes: js.UndefOr[FindOptionsAttributesArray | sequelizeLib.Anon_Exclude] = js.undefined
  /**
    * Apply DISTINCT(col) for FindAndCount(all)
    */
  var distinct: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Group by. It is not mentioned in sequelize's JSDoc, but mentioned in docs.
    * https://github.com/sequelize/sequelize/blob/master/docs/docs/models-usage.md#user-content-manipulating-the-dataset-with-limit-offset-order-and-group
    */
  var group: js.UndefOr[java.lang.String | js.Array[java.lang.String] | js.Object] = js.undefined
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
  var include: js.UndefOr[js.Array[(Model[_, _]) | IncludeOptions]] = js.undefined
  /**
    * Limit the results
    */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /**
    * Lock the selected rows. Possible options are transaction.LOCK.UPDATE and transaction.LOCK.SHARE.
    * Postgres also supports transaction.LOCK.KEY_SHARE, transaction.LOCK.NO_KEY_UPDATE and specific model
    * locks with joins. See [transaction.LOCK for an example](transaction#lock)
    */
  var lock: js.UndefOr[TransactionLockLevel | sequelizeLib.Anon_Level] = js.undefined
  /**
    * Skip the results;
    */
  var offset: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specifies an ordering. If a string is provided, it will be escaped. Using an array, you can provide
    * several columns / functions to order by. Each element can be further wrapped in a two-element array. The
    * first element is the column / function to order by, the second is the direction. For example:
    * `order: [['name', 'DESC']]`. In this way the column will be escaped, but the direction will not.
    */
  var order: js.UndefOr[
    java.lang.String | col | literal | FindOptionsOrderArray | fn | (js.Array[java.lang.String | col | literal | FindOptionsOrderArray | fn])
  ] = js.undefined
  /**
    * If true, only non-deleted records will be returned. If false, both deleted and non-deleted records will
    * be returned. Only applies if `options.paranoid` is true for the model.
    */
  var paranoid: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Return raw result. See sequelize.query for more information.
    */
  var raw: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Throw EmptyResultError if a record is not found
    */
  var rejectOnEmpty: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Prevents a subquery on the main table when using include
    */
  var subQuery: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Force the query to use the write pool
    *
    * Defaults to false
    */
  var useMaster: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A hash of attributes to describe your search. See above for examples.
    */
  var where: js.UndefOr[WhereOptions[T] | where | fn | (js.Array[col | and | or | java.lang.String])] = js.undefined
}

