package typings.slickgrid.Slick.Editors

import typings.slickgrid.Slick.SlickData
import typings.slickgrid.Slick.ValidateResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Integer[T /* <: SlickData */] extends Editor[T]

object Integer {
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
  ): Integer[T] = {
    val __obj = js.Dynamic.literal(applyValue = js.Any.fromFunction2(applyValue), destroy = js.Any.fromFunction0(destroy), focus = js.Any.fromFunction0(focus), init = js.Any.fromFunction0(init), isValueChanged = js.Any.fromFunction0(isValueChanged), loadValue = js.Any.fromFunction1(loadValue), serializeValue = js.Any.fromFunction0(serializeValue), validate = js.Any.fromFunction0(validate))
    __obj.asInstanceOf[Integer[T]]
  }
}

