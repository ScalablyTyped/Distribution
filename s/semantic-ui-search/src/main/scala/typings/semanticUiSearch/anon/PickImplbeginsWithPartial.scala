package typings.semanticUiSearch.anon

import typings.semanticUiSearch.SemanticUI.Search.RegExpSettings.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-search.SemanticUI.Search.RegExpSettings._Impl, 'beginsWith'> & std.Partial<std.Pick<semantic-ui-search.SemanticUI.Search.RegExpSettings._Impl, keyof semantic-ui-search.SemanticUI.Search.RegExpSettings._Impl>> */
trait PickImplbeginsWithPartial
  extends StObject
     with Param {
  
  var beginsWith: String & js.UndefOr[String]
  
  var escape: js.UndefOr[js.RegExp] = js.undefined
}
object PickImplbeginsWithPartial {
  
  inline def apply(beginsWith: String & js.UndefOr[String]): PickImplbeginsWithPartial = {
    val __obj = js.Dynamic.literal(beginsWith = beginsWith.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplbeginsWithPartial]
  }
  
  extension [Self <: PickImplbeginsWithPartial](x: Self) {
    
    inline def setBeginsWith(value: String & js.UndefOr[String]): Self = StObject.set(x, "beginsWith", value.asInstanceOf[js.Any])
    
    inline def setEscape(value: js.RegExp): Self = StObject.set(x, "escape", value.asInstanceOf[js.Any])
    
    inline def setEscapeUndefined: Self = StObject.set(x, "escape", js.undefined)
  }
}
