package typings.reactFns.smsMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmsProps extends HTMLAttributes[HTMLAnchorElement] {
  
  var body: js.UndefOr[String] = js.native
  
  var phone: String = js.native
}
object SmsProps {
  
  @scala.inline
  def apply(phone: String): SmsProps = {
    val __obj = js.Dynamic.literal(phone = phone.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsProps]
  }
  
  @scala.inline
  implicit class SmsPropsOps[Self <: SmsProps] (val x: Self) extends AnyVal {
    
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
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
  }
}
