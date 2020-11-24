package typings.reactToastify.typesMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Toast extends js.Object {
  
  var content: ToastContent = js.native
  
  var props: ToastProps = js.native
}
object Toast {
  
  @scala.inline
  def apply(props: ToastProps): Toast = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[Toast]
  }
  
  @scala.inline
  implicit class ToastOps[Self <: Toast] (val x: Self) extends AnyVal {
    
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
    def setProps(value: ToastProps): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentFunction1(value: /* props */ ToastContentProps => ReactNode): Self = this.set("content", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContent(value: ToastContent): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
  }
}
