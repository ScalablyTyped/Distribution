package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CognitoUserPool extends StObject {
  
  var existing: js.UndefOr[Boolean] = js.undefined
  
  var pool: String
  
  var trigger: String
}
object CognitoUserPool {
  
  @scala.inline
  def apply(pool: String, trigger: String): CognitoUserPool = {
    val __obj = js.Dynamic.literal(pool = pool.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[CognitoUserPool]
  }
  
  @scala.inline
  implicit class CognitoUserPoolMutableBuilder[Self <: CognitoUserPool] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExisting(value: Boolean): Self = StObject.set(x, "existing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExistingUndefined: Self = StObject.set(x, "existing", js.undefined)
    
    @scala.inline
    def setPool(value: String): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
  }
}
