package typings.reactNavigation.anon

import typings.react.mod.Component
import typings.react.mod.Ref
import typings.reactNavigation.mod.NavigationFocusInjectedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1`[T, P] extends js.Object {
  var onRef: js.UndefOr[Ref[Component[T with NavigationFocusInjectedProps[P], js.Object, _]]] = js.undefined
}

object `1` {
  @scala.inline
  def apply[T, P](
    onRef: js.UndefOr[Null | (Ref[Component[T with NavigationFocusInjectedProps[P], js.Object, _]])] = js.undefined
  ): `1`[T, P] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(onRef)) __obj.updateDynamic("onRef")(onRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[`1`[T, P]]
  }
}

