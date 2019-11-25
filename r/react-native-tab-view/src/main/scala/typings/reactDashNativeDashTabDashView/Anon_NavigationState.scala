package typings.reactDashNativeDashTabDashView

import typings.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod.NavigationState
import typings.reactDashNativeDashTabDashView.libTypescriptSrcTypesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NavigationState[T /* <: Route */] extends js.Object {
  var navigationState: NavigationState[T]
}

object Anon_NavigationState {
  @scala.inline
  def apply[T /* <: Route */](navigationState: NavigationState[T]): Anon_NavigationState[T] = {
    val __obj = js.Dynamic.literal(navigationState = navigationState.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_NavigationState[T]]
  }
}

