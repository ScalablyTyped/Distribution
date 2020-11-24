package typings.sequelize.mod

import typings.sequelize.anon.As
import typings.sequelize.anon.Exclude
import typings.sequelize.anon.Level
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options that are passed to any model creating a SELECT query
  *
  * A hash of options to describe the scope of the search
  */
@js.native
trait FindOptions[T]
  extends LoggingOptions
     with SearchPathOptions {
  
  /**
    * A list of the attributes that you want to select. To rename an attribute, you can pass an array, with
    * two elements - the first is the name of the attribute in the DB (or some kind of expression such as
    * `Sequelize.literal`, `Sequelize.fn` and so on), and the second is the name you want the attribute to
    * have in the returned instance
    */
  var attributes: js.UndefOr[FindOptionsAttributesArray | Exclude] = js.native
  
  /**
    * Apply DISTINCT(col) for FindAndCount(all)
    */
  var distinct: js.UndefOr[Boolean] = js.native
  
  /**
    * Group by. It is not mentioned in sequelize's JSDoc, but mentioned in docs.
    * https://github.com/sequelize/sequelize/blob/master/docs/docs/models-usage.md#user-content-manipulating-the-dataset-with-limit-offset-order-and-group
    */
  var group: js.UndefOr[String | js.Array[String] | js.Object] = js.native
  
  /**
    * having ?!?
    */
  var having: js.UndefOr[AnyWhereOptions] = js.native
  
  /**
    * A list of associations to eagerly load using a left join. Supported is either
    * `{ include: [ Model1, Model2, ...]}` or `{ include: [{ model: Model1, as: 'Alias' }]}`.
    * If your association are set up with an `as` (eg. `X.hasMany(Y, { as: 'Z }`, you need to specify Z in
    * the as attribute when eager loading Y).
    */
  var include: js.UndefOr[js.Array[(Model[_, _, _]) | IncludeOptions]] = js.native
  
  /**
    * Limit the results
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * Lock the selected rows. Possible options are transaction.LOCK.UPDATE and transaction.LOCK.SHARE.
    * Postgres also supports transaction.LOCK.KEY_SHARE, transaction.LOCK.NO_KEY_UPDATE and specific model
    * locks with joins. See [transaction.LOCK for an example](transaction#lock)
    */
  var lock: js.UndefOr[TransactionLockLevel | Level] = js.native
  
  /**
    * Skip the results;
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    * Specifies an ordering. If a string is provided, it will be escaped. Using an array, you can provide
    * several columns / functions to order by. Each element can be further wrapped in a two-element array. The
    * first element is the column / function to order by, the second is the direction. For example:
    * `order: [['name', 'DESC']]`. In this way the column will be escaped, but the direction will not.
    */
  var order: js.UndefOr[
    String | col | literal | FindOptionsOrderArray | fn | (js.Array[String | col | literal | FindOptionsOrderArray | fn])
  ] = js.native
  
  /**
    * If true, only non-deleted records will be returned. If false, both deleted and non-deleted records will
    * be returned. Only applies if `options.paranoid` is true for the model.
    */
  var paranoid: js.UndefOr[Boolean] = js.native
  
  /**
    * Return raw result. See sequelize.query for more information.
    */
  var raw: js.UndefOr[Boolean] = js.native
  
  /**
    * Throw EmptyResultError if a record is not found
    */
  var rejectOnEmpty: js.UndefOr[Boolean] = js.native
  
  /**
    * Prevents a subquery on the main table when using include
    */
  var subQuery: js.UndefOr[Boolean] = js.native
  
  /**
    * Force the query to use the write pool
    *
    * Defaults to false
    */
  var useMaster: js.UndefOr[Boolean] = js.native
  
  /**
    * A hash of attributes to describe your search. See above for examples.
    */
  var where: js.UndefOr[
    WhereOptions[T] | typings.sequelize.mod.where | fn | (js.Array[col | and | or | String])
  ] = js.native
}
object FindOptions {
  
  @scala.inline
  def apply[T](): FindOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindOptions[T]]
  }
  
  @scala.inline
  implicit class FindOptionsOps[Self <: FindOptions[_], T] (val x: Self with FindOptions[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttributesVarargs(value: (String | literal | (js.Tuple2[String | cast | fn | literal, String]) | fn | cast)*): Self = this.set("attributes", js.Array(value :_*))
    
    @scala.inline
    def setAttributes(value: FindOptionsAttributesArray | Exclude): Self = this.set("attributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributes: Self = this.set("attributes", js.undefined)
    
    @scala.inline
    def setDistinct(value: Boolean): Self = this.set("distinct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistinct: Self = this.set("distinct", js.undefined)
    
    @scala.inline
    def setGroupVarargs(value: String*): Self = this.set("group", js.Array(value :_*))
    
    @scala.inline
    def setGroup(value: String | js.Array[String] | js.Object): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    
    @scala.inline
    def setHaving(value: AnyWhereOptions): Self = this.set("having", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHaving: Self = this.set("having", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: ((Model[js.Any, js.Any, js.Any]) | IncludeOptions)*): Self = this.set("include", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: js.Array[(Model[_, _, _]) | IncludeOptions]): Self = this.set("include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude: Self = this.set("include", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setLock(value: TransactionLockLevel | Level): Self = this.set("lock", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLock: Self = this.set("lock", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOrderVarargs(
      value: (As | Double | FindOptionsOrderArray | (Model[js.Any, js.Any, js.Any]) | String | col | fn | literal)*
    ): Self = this.set("order", js.Array(value :_*))
    
    @scala.inline
    def setOrder(
      value: String | col | literal | FindOptionsOrderArray | fn | (js.Array[String | col | literal | FindOptionsOrderArray | fn])
    ): Self = this.set("order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    
    @scala.inline
    def setParanoid(value: Boolean): Self = this.set("paranoid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParanoid: Self = this.set("paranoid", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    
    @scala.inline
    def setRejectOnEmpty(value: Boolean): Self = this.set("rejectOnEmpty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejectOnEmpty: Self = this.set("rejectOnEmpty", js.undefined)
    
    @scala.inline
    def setSubQuery(value: Boolean): Self = this.set("subQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubQuery: Self = this.set("subQuery", js.undefined)
    
    @scala.inline
    def setUseMaster(value: Boolean): Self = this.set("useMaster", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseMaster: Self = this.set("useMaster", js.undefined)
    
    @scala.inline
    def setWhereVarargs(value: (col | and | or | String)*): Self = this.set("where", js.Array(value :_*))
    
    @scala.inline
    def setWhere(value: WhereOptions[T] | where | fn | (js.Array[col | and | or | String])): Self = this.set("where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhere: Self = this.set("where", js.undefined)
  }
}
