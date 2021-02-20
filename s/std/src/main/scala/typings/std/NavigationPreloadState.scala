package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NavigationPreloadState extends StObject {
  
  var enabled: js.UndefOr[scala.Boolean] = js.native
  
  var headerValue: js.UndefOr[java.lang.String] = js.native
}
object NavigationPreloadState {
  
  @scala.inline
  def apply(): NavigationPreloadState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigationPreloadState]
  }
  
  @scala.inline
  implicit class NavigationPreloadStateMutableBuilder[Self <: NavigationPreloadState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: scala.Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setHeaderValue(value: java.lang.String): Self = StObject.set(x, "headerValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderValueUndefined: Self = StObject.set(x, "headerValue", js.undefined)
  }
}
