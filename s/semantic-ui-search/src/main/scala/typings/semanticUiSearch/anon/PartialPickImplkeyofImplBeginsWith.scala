package typings.semanticUiSearch.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.RegExpSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.RegExpSettings._Impl>> */
@js.native
trait PartialPickImplkeyofImplBeginsWith extends StObject {
  
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
  implicit class PartialPickImplkeyofImplBeginsWithMutableBuilder[Self <: PartialPickImplkeyofImplBeginsWith] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginsWith(value: String): Self = StObject.set(x, "beginsWith", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeginsWithUndefined: Self = StObject.set(x, "beginsWith", js.undefined)
    
    @scala.inline
    def setEscape(value: RegExp): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
  }
}
