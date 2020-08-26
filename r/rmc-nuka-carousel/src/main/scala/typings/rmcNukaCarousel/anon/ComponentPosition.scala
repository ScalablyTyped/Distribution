package typings.rmcNukaCarousel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComponentPosition extends js.Object {
  var component: InstantiableForceUpdate = js.native
  var position: String = js.native
}

object ComponentPosition {
  @scala.inline
  def apply(component: InstantiableForceUpdate, position: String): ComponentPosition = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentPosition]
  }
  @scala.inline
  implicit class ComponentPositionOps[Self <: ComponentPosition] (val x: Self) extends AnyVal {
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
    def setComponent(value: InstantiableForceUpdate): Self = this.set("component", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
  }
  
}

