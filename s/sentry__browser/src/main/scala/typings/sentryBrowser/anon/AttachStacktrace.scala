package typings.sentryBrowser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AttachStacktrace extends js.Object {
  
  var attachStacktrace: js.UndefOr[Boolean] = js.native
  
  var rejection: js.UndefOr[Boolean] = js.native
}
object AttachStacktrace {
  
  @scala.inline
  def apply(): AttachStacktrace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachStacktrace]
  }
  
  @scala.inline
  implicit class AttachStacktraceOps[Self <: AttachStacktrace] (val x: Self) extends AnyVal {
    
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
    def setAttachStacktrace(value: Boolean): Self = this.set("attachStacktrace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachStacktrace: Self = this.set("attachStacktrace", js.undefined)
    
    @scala.inline
    def setRejection(value: Boolean): Self = this.set("rejection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRejection: Self = this.set("rejection", js.undefined)
  }
}
