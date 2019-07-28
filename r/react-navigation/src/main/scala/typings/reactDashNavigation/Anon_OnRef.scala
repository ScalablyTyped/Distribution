package typings.reactDashNavigation

import typings.react.reactMod.ComponentClass
import typings.react.reactMod.ComponentState
import typings.react.reactMod.Ref
import typings.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnRef[T /* <: ComponentClass[P, ComponentState] */] extends js.Object {
  var onRef: js.UndefOr[Ref[InstanceType[T]]] = js.undefined
}

object Anon_OnRef {
  @scala.inline
  def apply[T /* <: ComponentClass[P, ComponentState] */](onRef: Ref[InstanceType[T]] = null): Anon_OnRef[T] = {
    val __obj = js.Dynamic.literal()
    if (onRef != null) __obj.updateDynamic("onRef")(onRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OnRef[T]]
  }
}

