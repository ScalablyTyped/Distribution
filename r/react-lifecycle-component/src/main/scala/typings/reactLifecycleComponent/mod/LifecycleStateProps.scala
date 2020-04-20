package typings.reactLifecycleComponent.mod

import typings.react.mod.ComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecycleStateProps[P, S] extends js.Object {
  var component: ComponentClass[P, S]
}

object LifecycleStateProps {
  @scala.inline
  def apply[P, S](component: ComponentClass[P, S]): LifecycleStateProps[P, S] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleStateProps[P, S]]
  }
}

