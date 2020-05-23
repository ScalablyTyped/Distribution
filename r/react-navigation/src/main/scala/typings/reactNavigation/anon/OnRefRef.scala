package typings.reactNavigation.anon

import typings.react.mod.Component
import typings.react.mod.Ref
import typings.reactNavigation.mod.NavigationInjectedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnRefRef[T, P] extends js.Object {
  var onRef: js.UndefOr[Ref[Component[T with NavigationInjectedProps[P], js.Object, _]]] = js.undefined
}

object OnRefRef {
  @scala.inline
  def apply[T, P](
    onRef: js.UndefOr[Null | (Ref[Component[T with NavigationInjectedProps[P], js.Object, _]])] = js.undefined
  ): OnRefRef[T, P] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(onRef)) __obj.updateDynamic("onRef")(onRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnRefRef[T, P]]
  }
}

