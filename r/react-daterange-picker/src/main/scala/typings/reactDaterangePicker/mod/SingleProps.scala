package typings.reactDaterangePicker.mod

import typings.moment.mod.Moment
import typings.reactDaterangePicker.reactDaterangePickerStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SingleProps[T]
  extends BaseProps[T]
     with Props[T] {
  
  var onSelect: js.UndefOr[js.Function1[/* value */ Moment, Unit]] = js.native
  
  var selectionType: js.UndefOr[single] = js.native
}
object SingleProps {
  
  @scala.inline
  def apply[T](): SingleProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SingleProps[T]]
  }
  
  @scala.inline
  implicit class SinglePropsOps[Self <: SingleProps[_], T] (val x: Self with SingleProps[T]) extends AnyVal {
    
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
    def setOnSelect(value: /* value */ Moment => Unit): Self = this.set("onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelect: Self = this.set("onSelect", js.undefined)
    
    @scala.inline
    def setSelectionType(value: single): Self = this.set("selectionType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionType: Self = this.set("selectionType", js.undefined)
  }
}
