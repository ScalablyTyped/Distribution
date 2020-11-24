package typings.sendgrid.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cc extends js.Object {
  
  var bcc: js.Any = js.native
  
  var cc: js.Any = js.native
  
  var custom_args: js.Any = js.native
  
  var headers: js.Any = js.native
  
  var send_at: Double = js.native
  
  var subject: String = js.native
  
  var substitutions: js.Any = js.native
  
  var to: js.Any = js.native
}
object Cc {
  
  @scala.inline
  def apply(
    bcc: js.Any,
    cc: js.Any,
    custom_args: js.Any,
    headers: js.Any,
    send_at: Double,
    subject: String,
    substitutions: js.Any,
    to: js.Any
  ): Cc = {
    val __obj = js.Dynamic.literal(bcc = bcc.asInstanceOf[js.Any], cc = cc.asInstanceOf[js.Any], custom_args = custom_args.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], send_at = send_at.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], substitutions = substitutions.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cc]
  }
  
  @scala.inline
  implicit class CcOps[Self <: Cc] (val x: Self) extends AnyVal {
    
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
    def setBcc(value: js.Any): Self = this.set("bcc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCc(value: js.Any): Self = this.set("cc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_args(value: js.Any): Self = this.set("custom_args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: js.Any): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSend_at(value: Double): Self = this.set("send_at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubject(value: String): Self = this.set("subject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubstitutions(value: js.Any): Self = this.set("substitutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: js.Any): Self = this.set("to", value.asInstanceOf[js.Any])
  }
}
