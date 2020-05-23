package typings.slickgrid.Slick.Editors

import typings.slickgrid.Slick.Position
import typings.slickgrid.Slick.SlickData
import typings.slickgrid.Slick.ValidateResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Date[T /* <: SlickData */] extends Editor[T] {
  def hide(): Unit
  def position(position: Position): Unit
  def show(): Unit
}

object Date {
  @scala.inline
  def apply[T](
    applyValue: (T, String) => Unit,
    destroy: () => Unit,
    focus: () => Unit,
    hide: () => Unit,
    init: () => Unit,
    isValueChanged: () => Boolean,
    loadValue: T => Unit,
    position: Position => Unit,
    serializeValue: () => js.Any,
    show: () => Unit,
    validate: () => ValidateResults
  ): Date[T] = {
    val __obj = js.Dynamic.literal(applyValue = js.Any.fromFunction2(applyValue), destroy = js.Any.fromFunction0(destroy), focus = js.Any.fromFunction0(focus), hide = js.Any.fromFunction0(hide), init = js.Any.fromFunction0(init), isValueChanged = js.Any.fromFunction0(isValueChanged), loadValue = js.Any.fromFunction1(loadValue), position = js.Any.fromFunction1(position), serializeValue = js.Any.fromFunction0(serializeValue), show = js.Any.fromFunction0(show), validate = js.Any.fromFunction0(validate))
    __obj.asInstanceOf[Date[T]]
  }
}

