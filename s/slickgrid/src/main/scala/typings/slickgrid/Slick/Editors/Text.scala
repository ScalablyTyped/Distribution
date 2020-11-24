package typings.slickgrid.Slick.Editors

import typings.slickgrid.Slick.SlickData
import typings.slickgrid.Slick.ValidateResults
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Text[T /* <: SlickData */] extends Editor[T] {
  
  def getValue(): String = js.native
  
  def setValue(`val`: String): Unit = js.native
}
object Text {
  
  @scala.inline
  def apply[T /* <: SlickData */](
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
  
  @scala.inline
  implicit class TextOps[Self <: Text[_], T /* <: SlickData */] (val x: Self with Text[T]) extends AnyVal {
    
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
    def setGetValue(value: () => String): Self = this.set("getValue", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetValue(value: String => Unit): Self = this.set("setValue", js.Any.fromFunction1(value))
  }
}
