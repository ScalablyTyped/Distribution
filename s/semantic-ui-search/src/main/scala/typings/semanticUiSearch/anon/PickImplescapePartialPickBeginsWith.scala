package typings.semanticUiSearch.anon

import typings.semanticUiSearch.SemanticUI.Search.RegExpSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.RegExpSettings._Impl, 'escape'> & std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.RegExpSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.RegExpSettings._Impl>> */
trait PickImplescapePartialPickBeginsWith
  extends StObject
     with Param {
  
  var beginsWith: js.UndefOr[String] = js.undefined
  
  var escape: js.RegExp
}
object PickImplescapePartialPickBeginsWith {
  
  inline def apply(escape: js.RegExp): PickImplescapePartialPickBeginsWith = {
    val __obj = js.Dynamic.literal(escape = escape.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplescapePartialPickBeginsWith]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickImplescapePartialPickBeginsWith] (val x: Self) extends AnyVal {
    
    inline def setBeginsWith(value: String): Self = StObject.set(x, "beginsWith", value.asInstanceOf[js.Any])
    
    inline def setBeginsWithUndefined: Self = StObject.set(x, "beginsWith", js.undefined)
    
    inline def setEscape(value: js.RegExp): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
  }
}
