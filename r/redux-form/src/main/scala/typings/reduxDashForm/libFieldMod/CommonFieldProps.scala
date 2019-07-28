package typings.reduxDashForm.libFieldMod

import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.DragEvent
import typings.react.reactMod.FocusEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonFieldProps extends CommonFieldInputProps {
  var onBlur: EventWithDataHandler[FocusEvent[_]]
  var onChange: EventWithDataHandler[ChangeEvent[_]]
}

object CommonFieldProps {
  @scala.inline
  def apply(
    name: String,
    onBlur: EventWithDataHandler[FocusEvent[_]],
    onChange: EventWithDataHandler[ChangeEvent[_]],
    onDragStart: EventHandler[DragEvent[_]],
    onDrop: EventHandler[DragEvent[_]],
    onFocus: EventHandler[FocusEvent[_]]
  ): CommonFieldProps = {
    val __obj = js.Dynamic.literal(name = name, onBlur = onBlur, onChange = onChange, onDragStart = onDragStart, onDrop = onDrop, onFocus = onFocus)
  
    __obj.asInstanceOf[CommonFieldProps]
  }
}

