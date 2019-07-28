package typings.reactDashNavigation

import typings.react.reactMod.Component
import typings.react.reactMod.Ref
import typings.reactDashNavigation.reactDashNavigationMod.NavigationInjectedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnRefAny[T, P] extends js.Object {
  var onRef: js.UndefOr[Ref[Component[T with NavigationInjectedProps[P], js.Object, _]]] = js.undefined
}

object Anon_OnRefAny {
  @scala.inline
  def apply[T, P](onRef: Ref[Component[T with NavigationInjectedProps[P], js.Object, _]] = null): Anon_OnRefAny[T, P] = {
    val __obj = js.Dynamic.literal()
    if (onRef != null) __obj.updateDynamic("onRef")(onRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OnRefAny[T, P]]
  }
}

