package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
trait InstanceIncrementDecrementOptions extends StObject {
  
  /**
    * The number to increment by
    *
    * Defaults to 1
    */
  var by: js.UndefOr[Double] = js.undefined
  
  /**
    * A function that gets executed while running the query to log the sql.
    */
  var logging: js.UndefOr[Boolean | js.Function] = js.undefined
  
  /**
    * Transaction to run query under
    */
  var transaction: js.UndefOr[Transaction] = js.undefined
  
  /**
    * A hash of attributes to describe your search. See above for examples.
    */
  var where: js.UndefOr[AnyWhereOptions | (js.Array[col | and | or | String])] = js.undefined
}
object InstanceIncrementDecrementOptions {
  
  @scala.inline
  def apply(): InstanceIncrementDecrementOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceIncrementDecrementOptions]
  }
  
  @scala.inline
  implicit class InstanceIncrementDecrementOptionsMutableBuilder[Self <: InstanceIncrementDecrementOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBy(value: Double): Self = StObject.set(x, "by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setByUndefined: Self = StObject.set(x, "by", js.undefined)
    
    @scala.inline
    def setLogging(value: Boolean | js.Function): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    @scala.inline
    def setTransaction(value: Transaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
    
    @scala.inline
    def setWhere(value: AnyWhereOptions | (js.Array[col | and | or | String])): Self = StObject.set(x, "where", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhereUndefined: Self = StObject.set(x, "where", js.undefined)
    
    @scala.inline
    def setWhereVarargs(value: (col | and | or | String)*): Self = StObject.set(x, "where", js.Array(value :_*))
  }
}
