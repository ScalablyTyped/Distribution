package typings.reactNavigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-navigation", "createNavigator")
@js.native
object createNavigator extends js.Object {
  def apply[S, Options](view: NavigationView[Options, S, _], router: NavigationRouter[S, Options]): NavigationNavigator[Options, NavigationProp[NavigationState]] = js.native
  def apply[S, Options](
    view: NavigationView[Options, S, _],
    router: NavigationRouter[S, Options],
    navigatorConfig: js.UndefOr[scala.Nothing],
    navigatorType: NavigatorType
  ): NavigationNavigator[Options, NavigationProp[NavigationState]] = js.native
  def apply[S, Options](
    view: NavigationView[Options, S, _],
    router: NavigationRouter[S, Options],
    navigatorConfig: js.Object
  ): NavigationNavigator[Options, NavigationProp[NavigationState]] = js.native
  def apply[S, Options](
    view: NavigationView[Options, S, _],
    router: NavigationRouter[S, Options],
    navigatorConfig: js.Object,
    navigatorType: NavigatorType
  ): NavigationNavigator[Options, NavigationProp[NavigationState]] = js.native
}

