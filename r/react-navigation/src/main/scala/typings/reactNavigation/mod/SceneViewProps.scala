package typings.reactNavigation.mod

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SceneViewProps extends StObject {
  
  var component: ComponentType[js.Object] = js.native
  
  var navigation: NavigationProp[_] = js.native
  
  var screenProps: js.Any = js.native
}
object SceneViewProps {
  
  @scala.inline
  def apply(component: ComponentType[js.Object], navigation: NavigationProp[_], screenProps: js.Any): SceneViewProps = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[SceneViewProps]
  }
  
  @scala.inline
  implicit class SceneViewPropsMutableBuilder[Self <: SceneViewProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: ComponentType[js.Object]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigation(value: NavigationProp[_]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenProps(value: js.Any): Self = StObject.set(x, "screenProps", value.asInstanceOf[js.Any])
  }
}
