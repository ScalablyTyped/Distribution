package typings.sequelize.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//
//  Instance
// ~~~~~~~~~~
//
//  https://github.com/sequelize/sequelize/blob/v3.4.1/lib/instance.js
//
/**
  * Options used for Instance.increment method
  */
@js.native
trait InstanceIncrementDecrementOptions extends js.Object {
  
  /**
    * The number to increment by
    *
    * Defaults to 1
    */
  var by: js.UndefOr[Double] = js.native
  
  /**
    * A function that gets executed while running the query to log the sql.
    */
  var logging: js.UndefOr[Boolean | js.Function] = js.native
  
  /**
    * Transaction to run query under
    */
  var transaction: js.UndefOr[Transaction] = js.native
  
  /**
    * A hash of attributes to describe your search. See above for examples.
    */
  var where: js.UndefOr[AnyWhereOptions | (js.Array[col | and | or | String])] = js.native
}
object InstanceIncrementDecrementOptions {
  
  @scala.inline
  def apply(): InstanceIncrementDecrementOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceIncrementDecrementOptions]
  }
  
  @scala.inline
  implicit class InstanceIncrementDecrementOptionsOps[Self <: InstanceIncrementDecrementOptions] (val x: Self) extends AnyVal {
    
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
    def setBy(value: Double): Self = this.set("by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBy: Self = this.set("by", js.undefined)
    
    @scala.inline
    def setLogging(value: Boolean | js.Function): Self = this.set("logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogging: Self = this.set("logging", js.undefined)
    
    @scala.inline
    def setTransaction(value: Transaction): Self = this.set("transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransaction: Self = this.set("transaction", js.undefined)
    
    @scala.inline
    def setWhereVarargs(value: (col | and | or | String)*): Self = this.set("where", js.Array(value :_*))
    
    @scala.inline
    def setWhere(value: AnyWhereOptions | (js.Array[col | and | or | String])): Self = this.set("where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWhere: Self = this.set("where", js.undefined)
  }
}
