package typings.reactNavigation

import typings.react.mod.Component
import typings.react.mod.Ref
import typings.reactNavigation.mod.NavigationInjectedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnRefAny[T, P] extends js.Object {
  var onRef: js.UndefOr[Ref[Component[T with NavigationInjectedProps[P], js.Object, _]]] = js.undefined
}

object AnonOnRefAny {
  @scala.inline
  def apply[T, P](onRef: Ref[Component[T with NavigationInjectedProps[P], js.Object, _]] = null): AnonOnRefAny[T, P] = {
    val __obj = js.Dynamic.literal()
    if (onRef != null) __obj.updateDynamic("onRef")(onRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnRefAny[T, P]]
  }
}

