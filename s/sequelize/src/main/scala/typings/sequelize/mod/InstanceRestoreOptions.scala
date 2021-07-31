package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options used for Instance.restore method
  */
trait InstanceRestoreOptions extends StObject {
  
  /**
    * A function that gets executed while running the query to log the sql.
    */
  var logging: js.UndefOr[Boolean | js.Function] = js.undefined
  
  /**
    * Transaction to run query under
    */
  var transaction: js.UndefOr[Transaction] = js.undefined
}
object InstanceRestoreOptions {
  
  @scala.inline
  def apply(): InstanceRestoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceRestoreOptions]
  }
  
  @scala.inline
  implicit class InstanceRestoreOptionsMutableBuilder[Self <: InstanceRestoreOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLogging(value: Boolean | js.Function): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    @scala.inline
    def setTransaction(value: Transaction): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
