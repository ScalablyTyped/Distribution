package typings.reactGeosuggest.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Styles extends js.Object {
  
  var input: js.UndefOr[Record[String, _]] = js.native
  
  var suggestItem: js.UndefOr[Record[String, _]] = js.native
  
  var suggests: js.UndefOr[Record[String, _]] = js.native
}
object Styles {
  
  @scala.inline
  def apply(): Styles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Styles]
  }
  
  @scala.inline
  implicit class StylesOps[Self <: Styles] (val x: Self) extends AnyVal {
    
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
    def setInput(value: Record[String, _]): Self = this.set("input", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    
    @scala.inline
    def setSuggestItem(value: Record[String, _]): Self = this.set("suggestItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestItem: Self = this.set("suggestItem", js.undefined)
    
    @scala.inline
    def setSuggests(value: Record[String, _]): Self = this.set("suggests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggests: Self = this.set("suggests", js.undefined)
  }
}
