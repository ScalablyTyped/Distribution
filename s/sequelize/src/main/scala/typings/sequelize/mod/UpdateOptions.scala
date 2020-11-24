package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options used for Model.update
  */
@js.native
trait UpdateOptions
  extends FieldsOptions
     with LoggingOptions
     with ReturningOptions {
  
  /**
    * Run before / after bulk update hooks?
    *
    * Defaults to true
    */
  var hooks: js.UndefOr[Boolean] = js.native
  
  /**
    * Run before / after update hooks?. If true, this will execute a SELECT followed by individual UPDATEs.
    * A select is needed, because the row data needs to be passed to the hooks
    *
    * Defaults to false
    */
  var individualHooks: js.UndefOr[Boolean] = js.native
  
  /**
    * How many rows to update (only for mysql and mariadb)
    */
  var limit: js.UndefOr[Double] = js.native
  
  /**
    * Whether or not to update the side effects of any virtual setters.
    *
    * Defaults to true
    */
  var sideEffects: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, the updatedAt timestamp will not be updated.
    */
  var silent: js.UndefOr[Boolean] = js.native
  
  /**
    * Transaction to run query under
    */
  var transaction: js.UndefOr[Transaction] = js.native
  
  /**
    * Options to describe the scope of the search.
    */
  var where: AnyWhereOptions = js.native
}
object UpdateOptions {
  
  @scala.inline
  def apply(where: AnyWhereOptions): UpdateOptions = {
    val __obj = js.Dynamic.literal(where = where.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateOptions]
  }
  
  @scala.inline
  implicit class UpdateOptionsOps[Self <: UpdateOptions] (val x: Self) extends AnyVal {
    
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
    def setWhere(value: AnyWhereOptions): Self = this.set("where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHooks(value: Boolean): Self = this.set("hooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHooks: Self = this.set("hooks", js.undefined)
    
    @scala.inline
    def setIndividualHooks(value: Boolean): Self = this.set("individualHooks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndividualHooks: Self = this.set("individualHooks", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setSideEffects(value: Boolean): Self = this.set("sideEffects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSideEffects: Self = this.set("sideEffects", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
    
    @scala.inline
    def setTransaction(value: Transaction): Self = this.set("transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransaction: Self = this.set("transaction", js.undefined)
  }
}
