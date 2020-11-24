package typings.reactNavigationStack.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnPageChangeCancel extends js.Object {
  
  def onPageChangeCancel(): Unit = js.native
  
  def onPageChangeConfirm(force: Boolean): Unit = js.native
  
  def onPageChangeStart(): Unit = js.native
}
object OnPageChangeCancel {
  
  @scala.inline
  def apply(
    onPageChangeCancel: () => Unit,
    onPageChangeConfirm: Boolean => Unit,
    onPageChangeStart: () => Unit
  ): OnPageChangeCancel = {
    val __obj = js.Dynamic.literal(onPageChangeCancel = js.Any.fromFunction0(onPageChangeCancel), onPageChangeConfirm = js.Any.fromFunction1(onPageChangeConfirm), onPageChangeStart = js.Any.fromFunction0(onPageChangeStart))
    __obj.asInstanceOf[OnPageChangeCancel]
  }
  
  @scala.inline
  implicit class OnPageChangeCancelOps[Self <: OnPageChangeCancel] (val x: Self) extends AnyVal {
    
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
    def setOnPageChangeCancel(value: () => Unit): Self = this.set("onPageChangeCancel", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnPageChangeConfirm(value: Boolean => Unit): Self = this.set("onPageChangeConfirm", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnPageChangeStart(value: () => Unit): Self = this.set("onPageChangeStart", js.Any.fromFunction0(value))
  }
}
