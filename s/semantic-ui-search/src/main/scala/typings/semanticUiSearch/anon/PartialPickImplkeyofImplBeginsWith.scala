package typings.semanticUiSearch.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.RegExpSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.RegExpSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplBeginsWith extends js.Object {
  
  var beginsWith: js.UndefOr[String] = js.native
  
  var escape: js.UndefOr[RegExp] = js.native
}
object PartialPickImplkeyofImplBeginsWith {
  
  @scala.inline
  def apply(): PartialPickImplkeyofImplBeginsWith = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickImplkeyofImplBeginsWith]
  }
  
  @scala.inline
  implicit class PartialPickImplkeyofImplBeginsWithOps[Self <: PartialPickImplkeyofImplBeginsWith] (val x: Self) extends AnyVal {
    
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
    def setBeginsWith(value: String): Self = this.set("beginsWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBeginsWith: Self = this.set("beginsWith", js.undefined)
    
    @scala.inline
    def setEscape(value: RegExp): Self = this.set("escape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscape: Self = this.set("escape", js.undefined)
  }
}
