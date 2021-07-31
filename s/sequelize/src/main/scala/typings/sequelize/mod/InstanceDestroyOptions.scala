package typings.sequelize.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options used for Instance.destroy method
  */
trait InstanceDestroyOptions extends StObject {
  
  /**
    * If set to true, paranoid models will actually be deleted
    */
  var force: js.UndefOr[Boolean] = js.undefined
  
  /**
    * A function that gets executed while running the query to log the sql.
    */
  var logging: js.UndefOr[Boolean | js.Function] = js.undefined
  
  /**
    * Transaction to run the query in
    */
  var transaction: js.UndefOr[Transaction] = js.undefined
}
object InstanceDestroyOptions {
  
  @scala.inline
  def apply(): InstanceDestroyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceDestroyOptions]
  }
  
  @scala.inline
  implicit class InstanceDestroyOptionsMutableBuilder[Self <: InstanceDestroyOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
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
