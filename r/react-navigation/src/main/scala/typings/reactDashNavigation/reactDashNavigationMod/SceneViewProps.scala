package typings.reactDashNavigation.reactDashNavigationMod

import typings.react.reactMod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SceneViewProps extends js.Object {
  var component: ComponentType[js.Object]
  var navigation: NavigationProp[_]
  var screenProps: js.Any
}

object SceneViewProps {
  @scala.inline
  def apply(component: ComponentType[js.Object], navigation: NavigationProp[_], screenProps: js.Any): SceneViewProps = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SceneViewProps]
  }
}

