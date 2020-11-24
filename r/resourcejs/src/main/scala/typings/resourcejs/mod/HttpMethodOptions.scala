package typings.resourcejs.mod

import typings.express.mod.NextFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HttpMethodOptions extends js.Object {
  
  var after: js.UndefOr[HttpHandler] = js.native
  
  var before: js.UndefOr[HttpHandler] = js.native
}
object HttpMethodOptions {
  
  @scala.inline
  def apply(): HttpMethodOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpMethodOptions]
  }
  
  @scala.inline
  implicit class HttpMethodOptionsOps[Self <: HttpMethodOptions] (val x: Self) extends AnyVal {
    
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
    def setAfter(value: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit): Self = this.set("after", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteAfter: Self = this.set("after", js.undefined)
    
    @scala.inline
    def setBefore(value: (/* req */ Request, /* res */ Response, /* next */ NextFunction) => Unit): Self = this.set("before", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteBefore: Self = this.set("before", js.undefined)
  }
}
