package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options used for Model.aggregate
  */
trait AggregateOptions
  extends StObject
     with LoggingOptions {
  
  /**
    * The type of the result. If `field` is a field in this Model, the default will be the type of that field,
    * otherwise defaults to float.
    */
  var dataType: js.UndefOr[DataTypeAbstract | String] = js.undefined
  
  /**
    * Applies DISTINCT to the field being aggregated over
    */
  var distinct: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `true`, the first returned value of `aggregateFunction` is cast to `dataType` and returned.
    * If additional attributes are specified, along with `group` clauses, set `plain` to `false` to return all values of all returned rows.
    * Defaults to `true`
    */
  var plain: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The transaction that the query should be executed under
    */
  var transaction: js.UndefOr[Transaction] = js.undefined
  
  /**
    * A hash of search attributes.
    */
  var where: js.UndefOr[AnyWhereOptions] = js.undefined
}
object AggregateOptions {
  
  @scala.inline
  def apply(): AggregateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateOptions]
  }
  
  @scala.inline
  implicit class AggregateOptionsMutableBuilder[Self <: AggregateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataType(value: DataTypeAbstract | String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    @scala.inline
    def setDistinct(value: Boolean): Self = StObject.set(x, "distinct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistinctUndefined: Self = StObject.set(x, "distinct", js.undefined)
    
    @scala.inline
    def setPlain(value: Boolean): Self = StObject.set(x, "plain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlainUndefined: Self = StObject.set(x, "plain", js.undefined)
    
    @scala.inline
    def setTransaction(value: Transaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
    
    @scala.inline
    def setWhere(value: AnyWhereOptions): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
  }
}
