package typings
package reactDashNavigationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnRef[T /* <: reactLib.reactMod.ReactNs.ComponentClass[P, reactLib.reactMod.ReactNs.ComponentState] */] extends js.Object {
  var onRef: js.UndefOr[reactLib.reactMod.ReactNs.Ref[stdLib.InstanceType[T]]] = js.undefined
}

object Anon_OnRef {
  @scala.inline
  def apply[T /* <: reactLib.reactMod.ReactNs.ComponentClass[P, reactLib.reactMod.ReactNs.ComponentState] */](onRef: reactLib.reactMod.ReactNs.Ref[stdLib.InstanceType[T]] = null): Anon_OnRef[T] = {
    val __obj = js.Dynamic.literal()
    if (onRef != null) __obj.updateDynamic("onRef")(onRef.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OnRef[T]]
  }
}

