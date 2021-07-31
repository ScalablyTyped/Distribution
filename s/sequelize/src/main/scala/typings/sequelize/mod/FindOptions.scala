package typings.sequelize.mod

import typings.sequelize.anon.As
import typings.sequelize.anon.Exclude
import typings.sequelize.anon.Level
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options that are passed to any model creating a SELECT query
  *
  * A hash of options to describe the scope of the search
  */
trait FindOptions[T]
  extends StObject
     with LoggingOptions
     with SearchPathOptions {
  
  /**
    * A list of the attributes that you want to select. To rename an attribute, you can pass an array, with
    * two elements - the first is the name of the attribute in the DB (or some kind of expression such as
    * `Sequelize.literal`, `Sequelize.fn` and so on), and the second is the name you want the attribute to
    * have in the returned instance
    */
  var attributes: js.UndefOr[FindOptionsAttributesArray | Exclude] = js.undefined
  
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
  var include: js.UndefOr[js.Array[(Model[js.Any, js.Any, js.Any]) | IncludeOptions]] = js.undefined
  
  /**
    * Limit the results
    */
  var limit: js.UndefOr[Double] = js.undefined
  
  /**
    * Lock the selected rows. Possible options are transaction.LOCK.UPDATE and transaction.LOCK.SHARE.
    * Postgres also supports transaction.LOCK.KEY_SHARE, transaction.LOCK.NO_KEY_UPDATE and specific model
    * locks with joins. See [transaction.LOCK for an example](transaction#lock)
    */
  var lock: js.UndefOr[TransactionLockLevel | Level] = js.undefined
  
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
    WhereOptions[T] | typings.sequelize.mod.where | fn | (js.Array[col | and | or | String])
  ] = js.undefined
}
object FindOptions {
  
  @scala.inline
  def apply[T](): FindOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOptions[T]]
  }
  
  @scala.inline
  implicit class FindOptionsMutableBuilder[Self <: FindOptions[?], T] (val x: Self & FindOptions[T]) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: FindOptionsAttributesArray | Exclude): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    @scala.inline
    def setAttributesVarargs(value: (String | literal | (js.Tuple2[String | cast | fn | literal, String]) | fn | cast)*): Self = StObject.set(x, "attributes", js.Array(value :_*))
    
    @scala.inline
    def setDistinct(value: Boolean): Self = StObject.set(x, "distinct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistinctUndefined: Self = StObject.set(x, "distinct", js.undefined)
    
    @scala.inline
    def setGroup(value: String | js.Array[String] | js.Object): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    @scala.inline
    def setGroupVarargs(value: String*): Self = StObject.set(x, "group", js.Array(value :_*))
    
    @scala.inline
    def setHaving(value: AnyWhereOptions): Self = StObject.set(x, "having", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHavingUndefined: Self = StObject.set(x, "having", js.undefined)
    
    @scala.inline
    def setInclude(value: js.Array[(Model[js.Any, js.Any, js.Any]) | IncludeOptions]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: ((Model[js.Any, js.Any, js.Any]) | IncludeOptions)*): Self = StObject.set(x, "include", js.Array(value :_*))
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setLock(value: TransactionLockLevel | Level): Self = StObject.set(x, "lock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockUndefined: Self = StObject.set(x, "lock", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    @scala.inline
    def setOrder(
      value: String | col | literal | FindOptionsOrderArray | fn | (js.Array[String | col | literal | FindOptionsOrderArray | fn])
    ): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setOrderVarargs(
      value: (As | Double | FindOptionsOrderArray | (Model[js.Any, js.Any, js.Any]) | String | col | fn | literal)*
    ): Self = StObject.set(x, "order", js.Array(value :_*))
    
    @scala.inline
    def setParanoid(value: Boolean): Self = StObject.set(x, "paranoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParanoidUndefined: Self = StObject.set(x, "paranoid", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    @scala.inline
    def setRejectOnEmpty(value: Boolean): Self = StObject.set(x, "rejectOnEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRejectOnEmptyUndefined: Self = StObject.set(x, "rejectOnEmpty", js.undefined)
    
    @scala.inline
    def setSubQuery(value: Boolean): Self = StObject.set(x, "subQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubQueryUndefined: Self = StObject.set(x, "subQuery", js.undefined)
    
    @scala.inline
    def setUseMaster(value: Boolean): Self = StObject.set(x, "useMaster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseMasterUndefined: Self = StObject.set(x, "useMaster", js.undefined)
    
    @scala.inline
    def setWhere(value: WhereOptions[T] | where | fn | (js.Array[col | and | or | String])): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
    
    @scala.inline
    def setWhereVarargs(value: (col | and | or | String)*): Self = StObject.set(x, "where", js.Array(value :_*))
  }
}
