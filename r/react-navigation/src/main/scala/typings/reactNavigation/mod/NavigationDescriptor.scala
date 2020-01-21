package typings.reactNavigation.mod

import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationDescriptor[Params, Options, NavigationScreenPropType] extends js.Object {
  var key: String
  var navigation: NavigationScreenPropType
  var options: Options
  var state: NavigationLeafRoute[Params] | NavigationStateRoute[Params]
  def getComponent(): ComponentType[js.Object]
}

object NavigationDescriptor {
  @scala.inline
  def apply[Params, Options, NavigationScreenPropType](
    getComponent: () => ComponentType[js.Object],
    key: String,
    navigation: NavigationScreenPropType,
    options: Options,
    state: NavigationLeafRoute[Params] | NavigationStateRoute[Params]
  ): NavigationDescriptor[Params, Options, NavigationScreenPropType] = {
    val __obj = js.Dynamic.literal(getComponent = js.Any.fromFunction0(getComponent), key = key.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NavigationDescriptor[Params, Options, NavigationScreenPropType]]
  }
}

