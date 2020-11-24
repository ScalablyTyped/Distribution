package typings.promptSync.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Option extends js.Object {
  
  var ask: js.UndefOr[String] = js.native
  
  var autocomplete: js.UndefOr[AutoCompleteFunction] = js.native
  
  var echo: js.UndefOr[String] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object Option {
  
  @scala.inline
  def apply(): Option = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Option]
  }
  
  @scala.inline
  implicit class OptionOps[Self <: Option] (val x: Self) extends AnyVal {
    
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
    def setAsk(value: String): Self = this.set("ask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsk: Self = this.set("ask", js.undefined)
    
    @scala.inline
    def setAutocomplete(value: /* input */ String => js.Array[String]): Self = this.set("autocomplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAutocomplete: Self = this.set("autocomplete", js.undefined)
    
    @scala.inline
    def setEcho(value: String): Self = this.set("echo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEcho: Self = this.set("echo", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
