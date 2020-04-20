package typings.reduxForm.fieldMod

import typings.react.mod.ChangeEvent
import typings.react.mod.DragEvent
import typings.react.mod.FocusEvent
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
    onBlur: (/* event */ js.UndefOr[FocusEvent[_]], /* newValue */ js.UndefOr[js.Any], /* previousValue */ js.UndefOr[js.Any], /* name */ js.UndefOr[String]) => Unit,
    onChange: (/* event */ js.UndefOr[ChangeEvent[_]], /* newValue */ js.UndefOr[js.Any], /* previousValue */ js.UndefOr[js.Any], /* name */ js.UndefOr[String]) => Unit,
    onDragStart: (DragEvent[_], /* name */ js.UndefOr[String]) => Unit,
    onDrop: (DragEvent[_], /* name */ js.UndefOr[String]) => Unit,
    onFocus: (FocusEvent[_], /* name */ js.UndefOr[String]) => Unit
  ): CommonFieldProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onBlur = js.Any.fromFunction4(onBlur), onChange = js.Any.fromFunction4(onChange), onDragStart = js.Any.fromFunction2(onDragStart), onDrop = js.Any.fromFunction2(onDrop), onFocus = js.Any.fromFunction2(onFocus))
    __obj.asInstanceOf[CommonFieldProps]
  }
}

