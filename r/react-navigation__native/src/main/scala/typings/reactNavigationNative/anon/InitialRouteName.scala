package typings.reactNavigationNative.anon

import typings.reactNavigationCore.typesMod.PathConfigMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InitialRouteName extends StObject {
  
  var initialRouteName: js.UndefOr[String] = js.native
  
  var screens: PathConfigMap = js.native
}
object InitialRouteName {
  
  @scala.inline
  def apply(screens: PathConfigMap): InitialRouteName = {
    val __obj = js.Dynamic.literal(screens = screens.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitialRouteName]
  }
  
  @scala.inline
  implicit class InitialRouteNameMutableBuilder[Self <: InitialRouteName] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInitialRouteName(value: String): Self = StObject.set(x, "initialRouteName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialRouteNameUndefined: Self = StObject.set(x, "initialRouteName", js.undefined)
    
    @scala.inline
    def setScreens(value: PathConfigMap): Self = StObject.set(x, "screens", value.asInstanceOf[js.Any])
  }
}
