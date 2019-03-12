package typings
package reactDashNavigationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultHandler extends js.Object {
  var navigation: reactDashNavigationLib.reactDashNavigationMod.NavigationScreenProp[
    reactDashNavigationLib.reactDashNavigationMod.NavigationRoute[reactDashNavigationLib.reactDashNavigationMod.NavigationParams], 
    reactDashNavigationLib.reactDashNavigationMod.NavigationParams
  ]
  def defaultHandler(): scala.Unit
}

object Anon_DefaultHandler {
  @scala.inline
  def apply(
    defaultHandler: () => scala.Unit,
    navigation: reactDashNavigationLib.reactDashNavigationMod.NavigationScreenProp[
      reactDashNavigationLib.reactDashNavigationMod.NavigationRoute[reactDashNavigationLib.reactDashNavigationMod.NavigationParams], 
      reactDashNavigationLib.reactDashNavigationMod.NavigationParams
    ]
  ): Anon_DefaultHandler = {
    val __obj = js.Dynamic.literal(defaultHandler = js.Any.fromFunction0(defaultHandler), navigation = navigation)
  
    __obj.asInstanceOf[Anon_DefaultHandler]
  }
}

