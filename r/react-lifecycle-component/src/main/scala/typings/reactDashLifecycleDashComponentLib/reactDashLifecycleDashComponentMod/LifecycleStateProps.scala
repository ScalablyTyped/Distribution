package typings
package reactDashLifecycleDashComponentLib.reactDashLifecycleDashComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecycleStateProps[P, S] extends js.Object {
  var component: reactLib.reactMod.ReactNs.ComponentClass[P, S]
}

object LifecycleStateProps {
  @scala.inline
  def apply[P, S](component: reactLib.reactMod.ReactNs.ComponentClass[P, S]): LifecycleStateProps[P, S] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("component")(component)
    __obj.asInstanceOf[LifecycleStateProps[P, S]]
  }
}

