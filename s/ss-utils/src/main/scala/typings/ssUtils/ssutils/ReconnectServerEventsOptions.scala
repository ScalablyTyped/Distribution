package typings.ssUtils.ssutils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReconnectServerEventsOptions extends js.Object {
  
  var errorArgs: js.UndefOr[js.Array[_]] = js.native
  
  var onerror: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  
  var onmessage: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  
  var url: js.UndefOr[String] = js.native
}
object ReconnectServerEventsOptions {
  
  @scala.inline
  def apply(): ReconnectServerEventsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReconnectServerEventsOptions]
  }
  
  @scala.inline
  implicit class ReconnectServerEventsOptionsOps[Self <: ReconnectServerEventsOptions] (val x: Self) extends AnyVal {
    
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
    def setErrorArgsVarargs(value: js.Any*): Self = this.set("errorArgs", js.Array(value :_*))
    
    @scala.inline
    def setErrorArgs(value: js.Array[_]): Self = this.set("errorArgs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorArgs: Self = this.set("errorArgs", js.undefined)
    
    @scala.inline
    def setOnerror(value: /* repeated */ js.Any => Unit): Self = this.set("onerror", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnerror: Self = this.set("onerror", js.undefined)
    
    @scala.inline
    def setOnmessage(value: /* repeated */ js.Any => Unit): Self = this.set("onmessage", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnmessage: Self = this.set("onmessage", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
  }
}
