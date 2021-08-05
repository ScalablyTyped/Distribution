package typings.semanticUiSticky.anon

import typings.semanticUiSticky.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-sticky.SemanticUI.StickySettings._Impl, 'scrollContext'> */
trait PickImplscrollContext extends StObject {
  
  var scrollContext: String | JQuery
}
object PickImplscrollContext {
  
  inline def apply(scrollContext: String | JQuery): PickImplscrollContext = {
    val __obj = js.Dynamic.literal(scrollContext = scrollContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplscrollContext]
  }
  
  extension [Self <: PickImplscrollContext](x: Self) {
    
    inline def setScrollContext(value: String | JQuery): Self = StObject.set(x, "scrollContext", value.asInstanceOf[js.Any])
  }
}
