package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for Model.restore
  */
@js.native
trait RestoreOptions extends LoggingOptions {
  
  /**
    * Run before / after bulk restore hooks?
    */
  var hooks: js.UndefOr[Boolean] = js.native
  
  /**
    * If set to true, restore will find all records within the where parameter and will execute before / after
    * bulkRestore hooks on each row
    */
  var individualHooks: js.UndefOr[Boolean] = js.native
  
  /**
    * How many rows to undelete
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * Transaction to run query under
    */
  var transaction: js.UndefOr[Transaction] = js.native
  
  /**
    * Filter the restore
    */
  var where: js.UndefOr[AnyWhereOptions] = js.native
}
object RestoreOptions {
  
  @scala.inline
  def apply(): RestoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RestoreOptions]
  }
  
  @scala.inline
  implicit class RestoreOptionsMutableBuilder[Self <: RestoreOptions] (val x: Self) extends AnyVal {
    
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
    def setTransaction(value: Transaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
    
    @scala.inline
    def setWhere(value: AnyWhereOptions): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
  }
}
