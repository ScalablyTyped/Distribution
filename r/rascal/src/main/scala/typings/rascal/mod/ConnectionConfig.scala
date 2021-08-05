package typings.rascal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectionConfig
  extends StObject
     with ConnectionAttributes {
  
  var management: js.UndefOr[ConnectionAttributes] = js.undefined
  
  var retry: js.UndefOr[RetryConfig] = js.undefined
}
object ConnectionConfig {
  
  inline def apply(): ConnectionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionConfig]
  }
  
  extension [Self <: ConnectionConfig](x: Self) {
    
    inline def setManagement(value: ConnectionAttributes): Self = StObject.set(x, "management", value.asInstanceOf[js.Any])
    
    inline def setManagementUndefined: Self = StObject.set(x, "management", js.undefined)
    
    inline def setRetry(value: RetryConfig): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
    
    inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
  }
}
