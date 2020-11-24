package typings.serveHandler.mod

import typings.node.httpMod.ServerResponse
import typings.serveHandler.anon.FnCall
import typings.serveHandler.anon.Typeoflstat
import typings.serveHandler.anon.Typeofreaddir
import typings.serveHandler.anon.Typeofrealpath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Methods extends js.Object {
  
  var createReadStream: js.UndefOr[FnCall] = js.native
  
  var lstat: js.UndefOr[Typeoflstat] = js.native
  
  var readdir: js.UndefOr[Typeofreaddir] = js.native
  
  var realpath: js.UndefOr[Typeofrealpath] = js.native
  
  var sendError: js.UndefOr[SendErrorHandler] = js.native
}
object Methods {
  
  @scala.inline
  def apply(): Methods = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Methods]
  }
  
  @scala.inline
  implicit class MethodsOps[Self <: Methods] (val x: Self) extends AnyVal {
    
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
    def setCreateReadStream(value: FnCall): Self = this.set("createReadStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreateReadStream: Self = this.set("createReadStream", js.undefined)
    
    @scala.inline
    def setLstat(value: Typeoflstat): Self = this.set("lstat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLstat: Self = this.set("lstat", js.undefined)
    
    @scala.inline
    def setReaddir(value: Typeofreaddir): Self = this.set("readdir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReaddir: Self = this.set("readdir", js.undefined)
    
    @scala.inline
    def setRealpath(value: Typeofrealpath): Self = this.set("realpath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRealpath: Self = this.set("realpath", js.undefined)
    
    @scala.inline
    def setSendError(
      value: (/* absolutePath */ js.UndefOr[String], /* response */ js.UndefOr[ServerResponse], /* acceptsJSON */ js.UndefOr[Boolean], /* current */ js.UndefOr[String], /* handlers */ js.UndefOr[Methods], /* config */ js.UndefOr[Config], /* spec */ js.UndefOr[js.Any]) => js.Promise[Unit]
    ): Self = this.set("sendError", js.Any.fromFunction7(value))
    
    @scala.inline
    def deleteSendError: Self = this.set("sendError", js.undefined)
  }
}
