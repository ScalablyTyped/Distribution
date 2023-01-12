package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationPreloadState extends StObject {
  
  /* standard dom */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  
  /* standard dom */
  var headerValue: js.UndefOr[java.lang.String] = js.undefined
}
object NavigationPreloadState {
  
  inline def apply(): NavigationPreloadState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationPreloadState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationPreloadState] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: scala.Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setHeaderValue(value: java.lang.String): Self = StObject.set(x, "headerValue", value.asInstanceOf[js.Any])
    
    inline def setHeaderValueUndefined: Self = StObject.set(x, "headerValue", js.undefined)
  }
}
