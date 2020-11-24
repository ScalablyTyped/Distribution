package typings.rmcPicker.pickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPickerProp extends js.Object {
  
  def computeChildIndex(arg: js.Any*): Double = js.native
  
  def doScrollingComplete(arg: js.Any*): Unit = js.native
  
  def select(arg: js.Any*): Unit = js.native
}
object IPickerProp {
  
  @scala.inline
  def apply(
    computeChildIndex: /* repeated */ js.Any => Double,
    doScrollingComplete: /* repeated */ js.Any => Unit,
    select: /* repeated */ js.Any => Unit
  ): IPickerProp = {
    val __obj = js.Dynamic.literal(computeChildIndex = js.Any.fromFunction1(computeChildIndex), doScrollingComplete = js.Any.fromFunction1(doScrollingComplete), select = js.Any.fromFunction1(select))
    __obj.asInstanceOf[IPickerProp]
  }
  
  @scala.inline
  implicit class IPickerPropOps[Self <: IPickerProp] (val x: Self) extends AnyVal {
    
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
    def setComputeChildIndex(value: /* repeated */ js.Any => Double): Self = this.set("computeChildIndex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDoScrollingComplete(value: /* repeated */ js.Any => Unit): Self = this.set("doScrollingComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSelect(value: /* repeated */ js.Any => Unit): Self = this.set("select", js.Any.fromFunction1(value))
  }
}
