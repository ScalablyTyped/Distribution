package typings.reactNavigationDrawer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitialRouteName extends StObject {
  
  var initialRouteName: js.UndefOr[String] = js.undefined
  
  var resetOnBlur: js.UndefOr[Boolean] = js.undefined
  
  var unmountInactiveRoutes: js.UndefOr[Boolean] = js.undefined
}
object InitialRouteName {
  
  @scala.inline
  def apply(): InitialRouteName = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InitialRouteName]
  }
  
  @scala.inline
  implicit class InitialRouteNameMutableBuilder[Self <: InitialRouteName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialRouteName(value: String): Self = StObject.set(x, "initialRouteName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialRouteNameUndefined: Self = StObject.set(x, "initialRouteName", js.undefined)
    
    @scala.inline
    def setResetOnBlur(value: Boolean): Self = StObject.set(x, "resetOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetOnBlurUndefined: Self = StObject.set(x, "resetOnBlur", js.undefined)
    
    @scala.inline
    def setUnmountInactiveRoutes(value: Boolean): Self = StObject.set(x, "unmountInactiveRoutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnmountInactiveRoutesUndefined: Self = StObject.set(x, "unmountInactiveRoutes", js.undefined)
  }
}
