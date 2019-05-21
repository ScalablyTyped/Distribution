package typings
package reactDashTouchLib.reactDashTouchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DraggableProps extends js.Object {
  var children: DraggableCallback
  /**
    * An object that defines the initial position of the draggable component.
    * You can pass any of the following styles to it
    * and they'll be updated and passed back out in the callback with every animation tick.
    */
  var style: DraggableStyle
}

object DraggableProps {
  @scala.inline
  def apply(children: DraggableCallback, style: DraggableStyle): DraggableProps = {
    val __obj = js.Dynamic.literal(children = children, style = style)
  
    __obj.asInstanceOf[DraggableProps]
  }
}

