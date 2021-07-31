package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options used for Model.update
  */
trait UpdateOptions
  extends StObject
     with FieldsOptions
     with LoggingOptions
     with ReturningOptions {
  
  /**
    * Run before / after bulk update hooks?
    *
    * Defaults to true
    */
  var hooks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Run before / after update hooks?. If true, this will execute a SELECT followed by individual UPDATEs.
    * A select is needed, because the row data needs to be passed to the hooks
    *
    * Defaults to false
    */
  var individualHooks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * How many rows to update (only for mysql and mariadb)
    */
  var limit: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether or not to update the side effects of any virtual setters.
    *
    * Defaults to true
    */
  var sideEffects: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, the updatedAt timestamp will not be updated.
    */
  var silent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Transaction to run query under
    */
  var transaction: js.UndefOr[Transaction] = js.undefined
  
  /**
    * Options to describe the scope of the search.
    */
  var where: AnyWhereOptions
}
object UpdateOptions {
  
  @scala.inline
  def apply(where: AnyWhereOptions): UpdateOptions = {
    val __obj = js.Dynamic.literal(where = where.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOptions]
  }
  
  @scala.inline
  implicit class UpdateOptionsMutableBuilder[Self <: UpdateOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHooks(value: Boolean): Self = StObject.set(x, "hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHooksUndefined: Self = StObject.set(x, "hooks", js.undefined)
    
    @scala.inline
    def setIndividualHooks(value: Boolean): Self = StObject.set(x, "individualHooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndividualHooksUndefined: Self = StObject.set(x, "individualHooks", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setSideEffects(value: Boolean): Self = StObject.set(x, "sideEffects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideEffectsUndefined: Self = StObject.set(x, "sideEffects", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = StObject.set(x, "silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSilentUndefined: Self = StObject.set(x, "silent", js.undefined)
    
    @scala.inline
    def setTransaction(value: Transaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
    
    @scala.inline
    def setWhere(value: AnyWhereOptions): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
  }
}
