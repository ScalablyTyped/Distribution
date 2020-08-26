package typings.slickgrid.Slick.Editors

import typings.slickgrid.Slick.SlickData
import typings.slickgrid.Slick.ValidateResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Editor[T /* <: SlickData */] extends js.Object {
  def applyValue(item: T, state: String): Unit = js.native
  def destroy(): Unit = js.native
  def focus(): Unit = js.native
  def init(): Unit = js.native
  def isValueChanged(): Boolean = js.native
  def loadValue(item: T): Unit = js.native
  def serializeValue(): js.Any = js.native
  def validate(): ValidateResults = js.native
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
  @scala.inline
  implicit class EditorOps[Self <: Editor[_], /* <: typings.slickgrid.Slick.SlickData */ T] (val x: Self with Editor[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplyValue(value: (T, String) => Unit): Self = this.set("applyValue", js.Any.fromFunction2(value))
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def setFocus(value: () => Unit): Self = this.set("focus", js.Any.fromFunction0(value))
    @scala.inline
    def setInit(value: () => Unit): Self = this.set("init", js.Any.fromFunction0(value))
    @scala.inline
    def setIsValueChanged(value: () => Boolean): Self = this.set("isValueChanged", js.Any.fromFunction0(value))
    @scala.inline
    def setLoadValue(value: T => Unit): Self = this.set("loadValue", js.Any.fromFunction1(value))
    @scala.inline
    def setSerializeValue(value: () => js.Any): Self = this.set("serializeValue", js.Any.fromFunction0(value))
    @scala.inline
    def setValidate(value: () => ValidateResults): Self = this.set("validate", js.Any.fromFunction0(value))
  }
  
}

