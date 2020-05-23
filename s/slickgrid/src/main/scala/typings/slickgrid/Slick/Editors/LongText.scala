package typings.slickgrid.Slick.Editors

import typings.slickgrid.DOMEvent
import typings.slickgrid.Slick.Position
import typings.slickgrid.Slick.SlickData
import typings.slickgrid.Slick.ValidateResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LongText[T /* <: SlickData */] extends Editor[T] {
  def cancel(): Unit
  def handleKeyDown(e: DOMEvent): Unit
  def hide(): Unit
  def position(position: Position): Unit
  def save(): Unit
  def show(): Unit
}

object LongText {
  @scala.inline
  def apply[T](
    applyValue: (T, String) => Unit,
    cancel: () => Unit,
    destroy: () => Unit,
    focus: () => Unit,
    handleKeyDown: DOMEvent => Unit,
    hide: () => Unit,
    init: () => Unit,
    isValueChanged: () => Boolean,
    loadValue: T => Unit,
    position: Position => Unit,
    save: () => Unit,
    serializeValue: () => js.Any,
    show: () => Unit,
    validate: () => ValidateResults
  ): LongText[T] = {
    val __obj = js.Dynamic.literal(applyValue = js.Any.fromFunction2(applyValue), cancel = js.Any.fromFunction0(cancel), destroy = js.Any.fromFunction0(destroy), focus = js.Any.fromFunction0(focus), handleKeyDown = js.Any.fromFunction1(handleKeyDown), hide = js.Any.fromFunction0(hide), init = js.Any.fromFunction0(init), isValueChanged = js.Any.fromFunction0(isValueChanged), loadValue = js.Any.fromFunction1(loadValue), position = js.Any.fromFunction1(position), save = js.Any.fromFunction0(save), serializeValue = js.Any.fromFunction0(serializeValue), show = js.Any.fromFunction0(show), validate = js.Any.fromFunction0(validate))
    __obj.asInstanceOf[LongText[T]]
  }
}

