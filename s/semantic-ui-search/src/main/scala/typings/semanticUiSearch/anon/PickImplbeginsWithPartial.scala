package typings.semanticUiSearch.anon

import typings.semanticUiSearch.SemanticUI.Search.RegExpSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.RegExpSettings._Impl, 'beginsWith'> & std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.RegExpSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.RegExpSettings._Impl>> */
trait PickImplbeginsWithPartial
  extends StObject
     with Param {
  
  var beginsWith: String
  
  var escape: js.UndefOr[js.RegExp] = js.undefined
}
object PickImplbeginsWithPartial {
  
  inline def apply(beginsWith: String): PickImplbeginsWithPartial = {
    val __obj = js.Dynamic.literal(beginsWith = beginsWith.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplbeginsWithPartial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PickImplbeginsWithPartial] (val x: Self) extends AnyVal {
    
    inline def setBeginsWith(value: String): Self = StObject.set(x, "beginsWith", value.asInstanceOf[js.Any])
    
    inline def setEscape(value: js.RegExp): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
    
    inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
  }
}
