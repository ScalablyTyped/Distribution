package typings.rcNotification.anon

import typings.rcNotification.notificationMod.HolderReadyCallback
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  var holderCallback: js.UndefOr[HolderReadyCallback] = js.native
  
  var props: NoticePropskeyReactText = js.native
}
object Props {
  
  @scala.inline
  def apply(props: NoticePropskeyReactText): Props = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
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
    def setProps(value: NoticePropskeyReactText): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHolderCallback(value: (/* div */ HTMLDivElement, /* noticeProps */ NoticePropskeyKey) => Unit): Self = this.set("holderCallback", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteHolderCallback: Self = this.set("holderCallback", js.undefined)
  }
}
