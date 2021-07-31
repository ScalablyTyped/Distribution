package typings.semanticUiSearch.anon

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.RegExpSettings._Impl, 'escape'> */
trait PickImplescapeEscape extends StObject {
  
  var escape: RegExp
}
object PickImplescapeEscape {
  
  @scala.inline
  def apply(escape: RegExp): PickImplescapeEscape = {
    val __obj = js.Dynamic.literal(escape = escape.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplescapeEscape]
  }
  
  @scala.inline
  implicit class PickImplescapeEscapeMutableBuilder[Self <: PickImplescapeEscape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEscape(value: RegExp): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
  }
}
