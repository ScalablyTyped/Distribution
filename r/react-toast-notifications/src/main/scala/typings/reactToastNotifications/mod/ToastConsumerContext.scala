package typings.reactToastNotifications.mod

import typings.react.mod.ReactNode
import typings.reactToastNotifications.anon.Appearance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToastConsumerContext extends js.Object {
  
  var add: AddToast = js.native
  
  var remove: RemoveToast = js.native
  
  var toasts: js.Array[Appearance] = js.native
}
object ToastConsumerContext {
  
  @scala.inline
  def apply(
    add: (/* content */ ReactNode, /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Unit,
    remove: (/* id */ String, /* callback */ js.UndefOr[js.Function0[Unit]]) => Unit,
    toasts: js.Array[Appearance]
  ): ToastConsumerContext = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction3(add), remove = js.Any.fromFunction2(remove), toasts = toasts.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToastConsumerContext]
  }
  
  @scala.inline
  implicit class ToastConsumerContextOps[Self <: ToastConsumerContext] (val x: Self) extends AnyVal {
    
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
    def setAdd(
      value: (/* content */ ReactNode, /* options */ js.UndefOr[Options], /* callback */ js.UndefOr[js.Function1[/* id */ String, Unit]]) => Unit
    ): Self = this.set("add", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRemove(value: (/* id */ String, /* callback */ js.UndefOr[js.Function0[Unit]]) => Unit): Self = this.set("remove", js.Any.fromFunction2(value))
    
    @scala.inline
    def setToastsVarargs(value: Appearance*): Self = this.set("toasts", js.Array(value :_*))
    
    @scala.inline
    def setToasts(value: js.Array[Appearance]): Self = this.set("toasts", value.asInstanceOf[js.Any])
  }
}
