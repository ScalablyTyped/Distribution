package typings.reactTouch.mod

import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraggableProps extends js.Object {
  var children: DraggableCallback = js.native
  /**
    * An object that defines the initial position of the draggable component.
    * You can pass any of the following styles to it
    * and they'll be updated and passed back out in the callback with every animation tick.
    */
  var style: DraggableStyle = js.native
}

object DraggableProps {
  @scala.inline
  def apply(children: /* argument */ DraggableCallbackArgument => Element, style: DraggableStyle): DraggableProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[DraggableProps]
  }
  @scala.inline
  implicit class DraggablePropsOps[Self <: DraggableProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: /* argument */ DraggableCallbackArgument => Element): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setStyle(value: DraggableStyle): Self = this.set("style", value.asInstanceOf[js.Any])
  }
  
}

