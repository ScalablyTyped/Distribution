package typings.reactNavigation

import typings.react.mod.Component
import typings.react.mod.Ref
import typings.reactNavigation.mod.NavigationFocusInjectedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnRefAnyComponent[T, P] extends js.Object {
  var onRef: js.UndefOr[Ref[Component[T with NavigationFocusInjectedProps[P], js.Object, _]]] = js.undefined
}

object AnonOnRefAnyComponent {
  @scala.inline
  def apply[T, P](onRef: Ref[Component[T with NavigationFocusInjectedProps[P], js.Object, _]] = null): AnonOnRefAnyComponent[T, P] = {
    val __obj = js.Dynamic.literal()
    if (onRef != null) __obj.updateDynamic("onRef")(onRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnRefAnyComponent[T, P]]
  }
}

