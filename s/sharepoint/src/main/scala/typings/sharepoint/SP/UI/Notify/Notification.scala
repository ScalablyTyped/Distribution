package typings.sharepoint.SP.UI.Notify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Notification extends js.Object {
  
  def Hide(bNoAnimate: Boolean): Unit = js.native
  
  def Show(bNoAnimate: Boolean): Unit = js.native
  
  def get_id(): String = js.native
}
object Notification {
  
  @scala.inline
  def apply(Hide: Boolean => Unit, Show: Boolean => Unit, get_id: () => String): Notification = {
    val __obj = js.Dynamic.literal(Hide = js.Any.fromFunction1(Hide), Show = js.Any.fromFunction1(Show), get_id = js.Any.fromFunction0(get_id))
    __obj.asInstanceOf[Notification]
  }
  
  @scala.inline
  implicit class NotificationOps[Self <: Notification] (val x: Self) extends AnyVal {
    
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
    def setHide(value: Boolean => Unit): Self = this.set("Hide", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShow(value: Boolean => Unit): Self = this.set("Show", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGet_id(value: () => String): Self = this.set("get_id", js.Any.fromFunction0(value))
  }
}
