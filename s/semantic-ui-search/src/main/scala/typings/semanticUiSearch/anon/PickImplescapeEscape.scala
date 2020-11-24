package typings.semanticUiSearch.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.RegExpSettings._Impl, 'escape'> */
@js.native
trait PickImplescapeEscape extends js.Object {
  
  var escape: RegExp = js.native
}
object PickImplescapeEscape {
  
  @scala.inline
  def apply(escape: RegExp): PickImplescapeEscape = {
    val __obj = js.Dynamic.literal(escape = escape.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplescapeEscape]
  }
  
  @scala.inline
  implicit class PickImplescapeEscapeOps[Self <: PickImplescapeEscape] (val x: Self) extends AnyVal {
    
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
    def setEscape(value: RegExp): Self = this.set("escape", value.asInstanceOf[js.Any])
  }
}
