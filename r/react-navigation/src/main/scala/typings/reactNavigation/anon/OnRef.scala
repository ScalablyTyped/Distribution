package typings.reactNavigation.anon

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.Ref
import typings.reactNavigation.mod.NavigationInjectedProps
import typings.reactNavigation.mod.NavigationParams
import typings.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnRef[T /* <: ComponentClass[P, ComponentState] */, P /* <: NavigationInjectedProps[NavigationParams] */] extends js.Object {
  var onRef: js.UndefOr[Ref[InstanceType[T]]] = js.undefined
}

object OnRef {
  @scala.inline
  def apply[T, P](onRef: js.UndefOr[Null | Ref[InstanceType[T]]] = js.undefined): OnRef[T, P] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(onRef)) __obj.updateDynamic("onRef")(onRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnRef[T, P]]
  }
}

