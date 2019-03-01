package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationDescriptor[Params] extends js.Object {
  var key: java.lang.String
  var navigation: NavigationScreenProp[_, NavigationParams]
  var options: NavigationScreenOptions
  var state: NavigationLeafRoute[Params] | NavigationStateRoute[Params]
  def getComponent(): reactLib.reactMod.ReactNs.ComponentType[js.Object]
}

object NavigationDescriptor {
  @scala.inline
  def apply[Params](
    getComponent: js.Function0[reactLib.reactMod.ReactNs.ComponentType[js.Object]],
    key: java.lang.String,
    navigation: NavigationScreenProp[_, NavigationParams],
    options: NavigationScreenOptions,
    state: NavigationLeafRoute[Params] | NavigationStateRoute[Params]
  ): NavigationDescriptor[Params] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getComponent")(getComponent)
    __obj.updateDynamic("key")(key)
    __obj.updateDynamic("navigation")(navigation)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationDescriptor[Params]]
  }
}

