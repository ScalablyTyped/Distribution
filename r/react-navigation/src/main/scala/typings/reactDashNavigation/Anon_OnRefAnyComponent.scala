package typings.reactDashNavigation

import typings.react.reactMod.Component
import typings.react.reactMod.Ref
import typings.reactDashNavigation.reactDashNavigationMod.NavigationFocusInjectedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnRefAnyComponent[T, P] extends js.Object {
  var onRef: js.UndefOr[Ref[Component[T with NavigationFocusInjectedProps[P], js.Object, _]]] = js.undefined
}

object Anon_OnRefAnyComponent {
  @scala.inline
  def apply[T, P](onRef: Ref[Component[T with NavigationFocusInjectedProps[P], js.Object, _]] = null): Anon_OnRefAnyComponent[T, P] = {
    val __obj = js.Dynamic.literal()
    if (onRef != null) __obj.updateDynamic("onRef")(onRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OnRefAnyComponent[T, P]]
  }
}

