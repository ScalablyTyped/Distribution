package typings.reactNavigation

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.Ref
import typings.reactNavigation.mod.NavigationFocusInjectedProps
import typings.reactNavigation.mod.NavigationParams
import typings.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon0[T /* <: ComponentClass[P, ComponentState] */, P /* <: NavigationFocusInjectedProps[NavigationParams] */] extends js.Object {
  var onRef: js.UndefOr[Ref[InstanceType[T]]] = js.undefined
}

object Anon0 {
  @scala.inline
  def apply[T /* <: ComponentClass[P, ComponentState] */, P /* <: NavigationFocusInjectedProps[NavigationParams] */](onRef: Ref[InstanceType[T]] = null): Anon0[T, P] = {
    val __obj = js.Dynamic.literal()
    if (onRef != null) __obj.updateDynamic("onRef")(onRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon0[T, P]]
  }
}

