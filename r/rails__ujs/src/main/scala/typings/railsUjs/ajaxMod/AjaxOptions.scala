package typings.railsUjs.ajaxMod

import typings.std.BodyInit
import typings.std.Document
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AjaxOptions extends js.Object {
  
  var accept: js.UndefOr[String] = js.native
  
  var beforeSend: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* options */ this.type, Unit]] = js.native
  
  var complete: js.UndefOr[js.Function2[/* xhr */ XMLHttpRequest, /* statusText */ String, Unit]] = js.native
  
  var crossDomain: js.UndefOr[Boolean] = js.native
  
  var data: js.UndefOr[Document | BodyInit | Null] = js.native
  
  var dataType: js.UndefOr[String] = js.native
  
  var error: js.UndefOr[
    js.Function3[/* response */ js.Any, /* statusText */ String, /* xhr */ XMLHttpRequest, Unit]
  ] = js.native
  
  var success: js.UndefOr[
    js.Function3[/* response */ js.Any, /* statusText */ String, /* xhr */ XMLHttpRequest, Unit]
  ] = js.native
  
  var `type`: String = js.native
  
  var url: String = js.native
  
  var withCredentials: js.UndefOr[Boolean] = js.native
}
object AjaxOptions {
  
  @scala.inline
  def apply(`type`: String, url: String): AjaxOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxOptions]
  }
  
  @scala.inline
  implicit class AjaxOptionsOps[Self <: AjaxOptions] (val x: Self) extends AnyVal {
    
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
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccept(value: String): Self = this.set("accept", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccept: Self = this.set("accept", js.undefined)
    
    @scala.inline
    def setBeforeSend(value: (/* xhr */ XMLHttpRequest, AjaxOptions) => Unit): Self = this.set("beforeSend", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforeSend: Self = this.set("beforeSend", js.undefined)
    
    @scala.inline
    def setComplete(value: (/* xhr */ XMLHttpRequest, /* statusText */ String) => Unit): Self = this.set("complete", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setCrossDomain(value: Boolean): Self = this.set("crossDomain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCrossDomain: Self = this.set("crossDomain", js.undefined)
    
    @scala.inline
    def setData(value: Document | BodyInit): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDataNull: Self = this.set("data", null)
    
    @scala.inline
    def setDataType(value: String): Self = this.set("dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    
    @scala.inline
    def setError(value: (/* response */ js.Any, /* statusText */ String, /* xhr */ XMLHttpRequest) => Unit): Self = this.set("error", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setSuccess(value: (/* response */ js.Any, /* statusText */ String, /* xhr */ XMLHttpRequest) => Unit): Self = this.set("success", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
}
