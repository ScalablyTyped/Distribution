package typings.reactNavigation.mod

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SceneViewProps extends StObject {
  
  var component: ComponentType[js.Object]
  
  var navigation: NavigationProp[js.Any]
  
  var screenProps: js.Any
}
object SceneViewProps {
  
  inline def apply(component: ComponentType[js.Object], navigation: NavigationProp[js.Any], screenProps: js.Any): SceneViewProps = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewProps]
  }
  
  extension [Self <: SceneViewProps](x: Self) {
    
    inline def setComponent(value: ComponentType[js.Object]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setNavigation(value: NavigationProp[js.Any]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setScreenProps(value: js.Any): Self = StObject.set(x, "screenProps", value.asInstanceOf[js.Any])
  }
}
