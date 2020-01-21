package typings.reactNavigation

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.Ref
import typings.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOnRef[T /* <: ComponentClass[P, ComponentState] */] extends js.Object {
  var onRef: js.UndefOr[Ref[InstanceType[T]]] = js.undefined
}

object AnonOnRef {
  @scala.inline
  def apply[T /* <: ComponentClass[P, ComponentState] */](onRef: Ref[InstanceType[T]] = null): AnonOnRef[T] = {
    val __obj = js.Dynamic.literal()
    if (onRef != null) __obj.updateDynamic("onRef")(onRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOnRef[T]]
  }
}

