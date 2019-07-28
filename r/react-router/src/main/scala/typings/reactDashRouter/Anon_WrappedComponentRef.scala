package typings.reactDashRouter

import typings.react.reactMod.ComponentType
import typings.react.reactMod.Ref
import typings.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_WrappedComponentRef[C /* <: ComponentType[_] */] extends js.Object {
  var wrappedComponentRef: js.UndefOr[Ref[InstanceType[C]]] = js.undefined
}

object Anon_WrappedComponentRef {
  @scala.inline
  def apply[C /* <: ComponentType[_] */](wrappedComponentRef: Ref[InstanceType[C]] = null): Anon_WrappedComponentRef[C] = {
    val __obj = js.Dynamic.literal()
    if (wrappedComponentRef != null) __obj.updateDynamic("wrappedComponentRef")(wrappedComponentRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_WrappedComponentRef[C]]
  }
}

