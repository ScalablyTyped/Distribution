package typings
package reduxDashFormLib.libFieldMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonFieldProps extends CommonFieldInputProps {
  var onBlur: EventWithDataHandler[reactLib.reactMod.FocusEvent[_]]
  var onChange: EventWithDataHandler[reactLib.reactMod.ChangeEvent[_]]
}

object CommonFieldProps {
  @scala.inline
  def apply(
    name: java.lang.String,
    onBlur: EventWithDataHandler[reactLib.reactMod.FocusEvent[_]],
    onChange: EventWithDataHandler[reactLib.reactMod.ChangeEvent[_]],
    onDragStart: EventHandler[reactLib.reactMod.DragEvent[_]],
    onDrop: EventHandler[reactLib.reactMod.DragEvent[_]],
    onFocus: EventHandler[reactLib.reactMod.FocusEvent[_]]
  ): CommonFieldProps = {
    val __obj = js.Dynamic.literal(name = name, onBlur = onBlur, onChange = onChange, onDragStart = onDragStart, onDrop = onDrop, onFocus = onFocus)
  
    __obj.asInstanceOf[CommonFieldProps]
  }
}

