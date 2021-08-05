package typings.reactNativeShare.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenReturn extends StObject {
  
  var app: js.UndefOr[String] = js.undefined
  
  var dismissedAction: js.UndefOr[Boolean] = js.undefined
}
object OpenReturn {
  
  inline def apply(): OpenReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OpenReturn]
  }
  
  extension [Self <: OpenReturn](x: Self) {
    
    inline def setApp(value: String): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
    
    inline def setAppUndefined: Self = StObject.set(x, "app", js.undefined)
    
    inline def setDismissedAction(value: Boolean): Self = StObject.set(x, "dismissedAction", value.asInstanceOf[js.Any])
    
    inline def setDismissedActionUndefined: Self = StObject.set(x, "dismissedAction", js.undefined)
  }
}
