package typings.reactNavigation.mod

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneViewProps extends StObject {
  
  var component: ComponentType[js.Object]
  
  var navigation: NavigationProp[Any]
  
  var screenProps: Any
}
object SceneViewProps {
  
  inline def apply(component: ComponentType[js.Object], navigation: NavigationProp[Any], screenProps: Any): SceneViewProps = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SceneViewProps] (val x: Self) extends AnyVal {
    
    inline def setComponent(value: ComponentType[js.Object]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setNavigation(value: NavigationProp[Any]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setScreenProps(value: Any): Self = StObject.set(x, "screenProps", value.asInstanceOf[js.Any])
  }
}
