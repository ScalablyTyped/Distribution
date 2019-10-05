package typings.reactDashNavigation.reactDashNavigationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation", "createNavigator")
@js.native
object createNavigator extends js.Object {
  def apply[S, Options](view: NavigationView[Options, S], router: NavigationRouter[S, Options]): js.Any = js.native
  def apply[S, Options](view: NavigationView[Options, S], router: NavigationRouter[S, Options], navigatorConfig: js.Object): js.Any = js.native
  def apply[S, Options](
    view: NavigationView[Options, S],
    router: NavigationRouter[S, Options],
    navigatorConfig: js.Object,
    navigatorType: NavigatorType
  ): js.Any = js.native
  def apply[S, Options](
    view: NavigationView[Options, S],
    router: NavigationRouter[S, Options],
    navigatorConfig: Null,
    navigatorType: NavigatorType
  ): js.Any = js.native
}

