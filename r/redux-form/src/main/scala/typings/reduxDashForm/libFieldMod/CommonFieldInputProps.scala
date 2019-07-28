package typings.reduxDashForm.libFieldMod

import typings.react.reactMod.DragEvent
import typings.react.reactMod.FocusEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonFieldInputProps extends js.Object {
  var name: String
  var onDragStart: EventHandler[DragEvent[_]]
  var onDrop: EventHandler[DragEvent[_]]
  var onFocus: EventHandler[FocusEvent[_]]
}

object CommonFieldInputProps {
  @scala.inline
  def apply(
    name: String,
    onDragStart: EventHandler[DragEvent[_]],
    onDrop: EventHandler[DragEvent[_]],
    onFocus: EventHandler[FocusEvent[_]]
  ): CommonFieldInputProps = {
    val __obj = js.Dynamic.literal(name = name, onDragStart = onDragStart, onDrop = onDrop, onFocus = onFocus)
  
    __obj.asInstanceOf[CommonFieldInputProps]
  }
}

