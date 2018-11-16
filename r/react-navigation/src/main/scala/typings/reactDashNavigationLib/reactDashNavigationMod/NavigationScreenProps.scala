package typings
package reactDashNavigationLib.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait NavigationScreenProps[Params, Options] extends js.Object {
  var navigation: NavigationScreenProp[NavigationRoute[Params], Params]
  var navigationOptions: js.UndefOr[NavigationScreenConfig[Options]] = js.undefined
  var screenProps: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.undefined
}

