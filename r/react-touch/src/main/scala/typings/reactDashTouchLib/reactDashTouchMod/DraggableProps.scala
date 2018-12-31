package typings
package reactDashTouchLib.reactDashTouchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DraggableProps extends js.Object {
  @JSName("children")
  var children_Original: DraggableCallback = js.native
  /**
    * An object that defines the initial position of the draggable component.
    * You can pass any of the following styles to it
    * and they'll be updated and passed back out in the callback with every animation tick.
    */
  var style: DraggableStyle = js.native
  def children(argument: DraggableCallbackArgument): reactLib.reactMod.Global.JSXNs.Element = js.native
}

