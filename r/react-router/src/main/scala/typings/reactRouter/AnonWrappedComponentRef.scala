package typings.reactRouter

import typings.react.mod.ComponentType
import typings.react.mod.Ref
import typings.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWrappedComponentRef[C /* <: ComponentType[_] */] extends js.Object {
  var wrappedComponentRef: js.UndefOr[Ref[InstanceType[C]]] = js.undefined
}

object AnonWrappedComponentRef {
  @scala.inline
  def apply[C /* <: ComponentType[_] */](wrappedComponentRef: Ref[InstanceType[C]] = null): AnonWrappedComponentRef[C] = {
    val __obj = js.Dynamic.literal()
    if (wrappedComponentRef != null) __obj.updateDynamic("wrappedComponentRef")(wrappedComponentRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWrappedComponentRef[C]]
  }
}

