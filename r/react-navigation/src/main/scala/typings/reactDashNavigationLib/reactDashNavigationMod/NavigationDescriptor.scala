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

