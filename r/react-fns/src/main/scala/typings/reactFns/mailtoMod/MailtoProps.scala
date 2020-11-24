package typings.reactFns.mailtoMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLAnchorElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MailtoProps extends HTMLAttributes[HTMLAnchorElement] {
  
  var bcc: js.UndefOr[js.Array[String]] = js.native
  
  var body: js.UndefOr[String] = js.native
  
  var cc: js.UndefOr[js.Array[String]] = js.native
  
  var email: String = js.native
  
  var subject: js.UndefOr[String] = js.native
}
object MailtoProps {
  
  @scala.inline
  def apply(email: String): MailtoProps = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any])
    __obj.asInstanceOf[MailtoProps]
  }
  
  @scala.inline
  implicit class MailtoPropsOps[Self <: MailtoProps] (val x: Self) extends AnyVal {
    
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
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBccVarargs(value: String*): Self = this.set("bcc", js.Array(value :_*))
    
    @scala.inline
    def setBcc(value: js.Array[String]): Self = this.set("bcc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBcc: Self = this.set("bcc", js.undefined)
    
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setCcVarargs(value: String*): Self = this.set("cc", js.Array(value :_*))
    
    @scala.inline
    def setCc(value: js.Array[String]): Self = this.set("cc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCc: Self = this.set("cc", js.undefined)
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubject: Self = this.set("subject", js.undefined)
  }
}
