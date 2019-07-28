package typings.reactDashNavigation.reactDashNavigationMod

import typings.react.reactMod.ReactElement
import typings.reactDashNavigation.Anon_Focused
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NavigationDrawerScreenOptions extends js.Object {
  var drawerIcon: js.UndefOr[ReactElement | (js.Function1[/* options */ Anon_Focused, ReactElement | Null])] = js.undefined
  var drawerLabel: js.UndefOr[
    String | ReactElement | (js.Function1[/* options */ Anon_Focused, ReactElement | Null])
  ] = js.undefined
  var drawerLockMode: js.UndefOr[DrawerLockMode] = js.undefined
  var title: js.UndefOr[String] = js.undefined
}

object NavigationDrawerScreenOptions {
  @scala.inline
  def apply(
    drawerIcon: ReactElement | (js.Function1[/* options */ Anon_Focused, ReactElement | Null]) = null,
    drawerLabel: String | ReactElement | (js.Function1[/* options */ Anon_Focused, ReactElement | Null]) = null,
    drawerLockMode: DrawerLockMode = null,
    title: String = null
  ): NavigationDrawerScreenOptions = {
    val __obj = js.Dynamic.literal()
    if (drawerIcon != null) __obj.updateDynamic("drawerIcon")(drawerIcon.asInstanceOf[js.Any])
    if (drawerLabel != null) __obj.updateDynamic("drawerLabel")(drawerLabel.asInstanceOf[js.Any])
    if (drawerLockMode != null) __obj.updateDynamic("drawerLockMode")(drawerLockMode)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[NavigationDrawerScreenOptions]
  }
}

