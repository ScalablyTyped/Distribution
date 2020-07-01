package typings.slickgrid.Slick.Editors

import typings.slickgrid.Slick.SlickData
import typings.slickgrid.Slick.ValidateResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Editor[T /* <: SlickData */] extends js.Object {
  def applyValue(item: T, state: String): Unit
  def destroy(): Unit
  def focus(): Unit
  def init(): Unit
  def isValueChanged(): Boolean
  def loadValue(item: T): Unit
  def serializeValue(): js.Any
  def validate(): ValidateResults
}

object Editor {
  @scala.inline
  def apply[/* <: typings.slickgrid.Slick.SlickData */ T](
    applyValue: (T, String) => Unit,
    destroy: () => Unit,
    focus: () => Unit,
    init: () => Unit,
    isValueChanged: () => Boolean,
    loadValue: T => Unit,
    serializeValue: () => js.Any,
    validate: () => ValidateResults
  ): Editor[T] = {
    val __obj = js.Dynamic.literal(applyValue = js.Any.fromFunction2(applyValue), destroy = js.Any.fromFunction0(destroy), focus = js.Any.fromFunction0(focus), init = js.Any.fromFunction0(init), isValueChanged = js.Any.fromFunction0(isValueChanged), loadValue = js.Any.fromFunction1(loadValue), serializeValue = js.Any.fromFunction0(serializeValue), validate = js.Any.fromFunction0(validate))
    __obj.asInstanceOf[Editor[T]]
  }
}

