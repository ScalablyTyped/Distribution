package typings.slickgrid.Slick.Editors

import typings.slickgrid.Slick.SlickData
import typings.slickgrid.Slick.ValidateResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Text[T /* <: SlickData */] extends Editor[T] {
  def getValue(): String
  def setValue(`val`: String): Unit
}

object Text {
  @scala.inline
  def apply[T](
    applyValue: (T, String) => Unit,
    destroy: () => Unit,
    focus: () => Unit,
    getValue: () => String,
    init: () => Unit,
    isValueChanged: () => Boolean,
    loadValue: T => Unit,
    serializeValue: () => js.Any,
    setValue: String => Unit,
    validate: () => ValidateResults
  ): Text[T] = {
    val __obj = js.Dynamic.literal(applyValue = js.Any.fromFunction2(applyValue), destroy = js.Any.fromFunction0(destroy), focus = js.Any.fromFunction0(focus), getValue = js.Any.fromFunction0(getValue), init = js.Any.fromFunction0(init), isValueChanged = js.Any.fromFunction0(isValueChanged), loadValue = js.Any.fromFunction1(loadValue), serializeValue = js.Any.fromFunction0(serializeValue), setValue = js.Any.fromFunction1(setValue), validate = js.Any.fromFunction0(validate))
    __obj.asInstanceOf[Text[T]]
  }
}

