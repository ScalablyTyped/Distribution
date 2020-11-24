package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options used for Model.aggregate
  */
@js.native
trait AggregateOptions extends LoggingOptions {
  
  /**
    * The type of the result. If `field` is a field in this Model, the default will be the type of that field,
    * otherwise defaults to float.
    */
  var dataType: js.UndefOr[DataTypeAbstract | String] = js.native
  
  /**
    * Applies DISTINCT to the field being aggregated over
    */
  var distinct: js.UndefOr[Boolean] = js.native
  
  /**
    * When `true`, the first returned value of `aggregateFunction` is cast to `dataType` and returned.
    * If additional attributes are specified, along with `group` clauses, set `plain` to `false` to return all values of all returned rows.
    * Defaults to `true`
    */
  var plain: js.UndefOr[Boolean] = js.native
  
  /**
    * The transaction that the query should be executed under
    */
  var transaction: js.UndefOr[Transaction] = js.native
  
  /**
    * A hash of search attributes.
    */
  var where: js.UndefOr[AnyWhereOptions] = js.native
}
object AggregateOptions {
  
  @scala.inline
  def apply(): AggregateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregateOptions]
  }
  
  @scala.inline
  implicit class AggregateOptionsOps[Self <: AggregateOptions] (val x: Self) extends AnyVal {
    
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
    def setDataType(value: DataTypeAbstract | String): Self = this.set("dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    
    @scala.inline
    def setDistinct(value: Boolean): Self = this.set("distinct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistinct: Self = this.set("distinct", js.undefined)
    
    @scala.inline
    def setPlain(value: Boolean): Self = this.set("plain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlain: Self = this.set("plain", js.undefined)
    
    @scala.inline
    def setTransaction(value: Transaction): Self = this.set("transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransaction: Self = this.set("transaction", js.undefined)
    
    @scala.inline
    def setWhere(value: AnyWhereOptions): Self = this.set("where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhere: Self = this.set("where", js.undefined)
  }
}
