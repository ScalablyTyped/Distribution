package typings
package reactDashRouterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_WrappedComponentRef[C /* <: reactLib.reactMod.ComponentType[_] */] extends js.Object {
  var wrappedComponentRef: js.UndefOr[reactLib.reactMod.Ref[stdLib.InstanceType[C]]] = js.undefined
}

object Anon_WrappedComponentRef {
  @scala.inline
  def apply[C /* <: reactLib.reactMod.ComponentType[_] */](wrappedComponentRef: reactLib.reactMod.Ref[stdLib.InstanceType[C]] = null): Anon_WrappedComponentRef[C] = {
    val __obj = js.Dynamic.literal()
    if (wrappedComponentRef != null) __obj.updateDynamic("wrappedComponentRef")(wrappedComponentRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_WrappedComponentRef[C]]
  }
}

