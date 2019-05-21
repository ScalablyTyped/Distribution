package typings
package reduxDashFormLib.libFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonFieldInputProps extends js.Object {
  var name: java.lang.String
  var onDragStart: EventHandler[reactLib.reactMod.DragEvent[_]]
  var onDrop: EventHandler[reactLib.reactMod.DragEvent[_]]
  var onFocus: EventHandler[reactLib.reactMod.FocusEvent[_]]
}

object CommonFieldInputProps {
  @scala.inline
  def apply(
    name: java.lang.String,
    onDragStart: EventHandler[reactLib.reactMod.DragEvent[_]],
    onDrop: EventHandler[reactLib.reactMod.DragEvent[_]],
    onFocus: EventHandler[reactLib.reactMod.FocusEvent[_]]
  ): CommonFieldInputProps = {
    val __obj = js.Dynamic.literal(name = name, onDragStart = onDragStart, onDrop = onDrop, onFocus = onFocus)
  
    __obj.asInstanceOf[CommonFieldInputProps]
  }
}

