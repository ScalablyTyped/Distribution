package typings
package reactDashLifecycleDashComponentLib.reactDashLifecycleDashComponentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecycleStateProps[P, S] extends js.Object {
  var component: reactLib.reactMod.ComponentClass[P, S]
}

object LifecycleStateProps {
  @scala.inline
  def apply[P, S](component: reactLib.reactMod.ComponentClass[P, S]): LifecycleStateProps[P, S] = {
    val __obj = js.Dynamic.literal(component = component)
  
    __obj.asInstanceOf[LifecycleStateProps[P, S]]
  }
}

