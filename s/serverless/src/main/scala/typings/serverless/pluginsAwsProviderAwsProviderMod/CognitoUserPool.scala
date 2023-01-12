package typings.serverless.pluginsAwsProviderAwsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CognitoUserPool extends StObject {
  
  var existing: js.UndefOr[Boolean] = js.undefined
  
  var pool: String
  
  var trigger: String
}
object CognitoUserPool {
  
  inline def apply(pool: String, trigger: String): CognitoUserPool = {
    val __obj = js.Dynamic.literal(pool = pool.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.asInstanceOf[CognitoUserPool]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CognitoUserPool] (val x: Self) extends AnyVal {
    
    inline def setExisting(value: Boolean): Self = StObject.set(x, "existing", value.asInstanceOf[js.Any])
    
    inline def setExistingUndefined: Self = StObject.set(x, "existing", js.undefined)
    
    inline def setPool(value: String): Self = StObject.set(x, "pool", value.asInstanceOf[js.Any])
    
    inline def setTrigger(value: String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
  }
}
