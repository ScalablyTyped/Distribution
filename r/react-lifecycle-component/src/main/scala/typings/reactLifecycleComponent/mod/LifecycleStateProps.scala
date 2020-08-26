package typings.reactLifecycleComponent.mod

import typings.react.mod.ComponentClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecycleStateProps[P, S] extends js.Object {
  var component: ComponentClass[P, S] = js.native
}

object LifecycleStateProps {
  @scala.inline
  def apply[P, S](component: ComponentClass[P, S]): LifecycleStateProps[P, S] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleStateProps[P, S]]
  }
  @scala.inline
  implicit class LifecycleStatePropsOps[Self <: LifecycleStateProps[_, _], P, S] (val x: Self with (LifecycleStateProps[P, S])) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setComponent(value: ComponentClass[P, S]): Self = this.set("component", value.asInstanceOf[js.Any])
  }
  
}

