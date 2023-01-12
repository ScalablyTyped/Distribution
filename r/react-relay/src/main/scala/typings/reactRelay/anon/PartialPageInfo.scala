package typings.reactRelay.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<relay-runtime.relay-runtime.PageInfo> */
trait PartialPageInfo extends StObject {
  
  var endCursor: js.UndefOr[String | Null] = js.undefined
  
  var hasNextPage: js.UndefOr[Boolean] = js.undefined
  
  var hasPreviousPage: js.UndefOr[Boolean] = js.undefined
  
  var startCursor: js.UndefOr[String | Null] = js.undefined
}
object PartialPageInfo {
  
  inline def apply(): PartialPageInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPageInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialPageInfo] (val x: Self) extends AnyVal {
    
    inline def setEndCursor(value: String): Self = StObject.set(x, "endCursor", value.asInstanceOf[js.Any])
    
    inline def setEndCursorNull: Self = StObject.set(x, "endCursor", null)
    
    inline def setEndCursorUndefined: Self = StObject.set(x, "endCursor", js.undefined)
    
    inline def setHasNextPage(value: Boolean): Self = StObject.set(x, "hasNextPage", value.asInstanceOf[js.Any])
    
    inline def setHasNextPageUndefined: Self = StObject.set(x, "hasNextPage", js.undefined)
    
    inline def setHasPreviousPage(value: Boolean): Self = StObject.set(x, "hasPreviousPage", value.asInstanceOf[js.Any])
    
    inline def setHasPreviousPageUndefined: Self = StObject.set(x, "hasPreviousPage", js.undefined)
    
    inline def setStartCursor(value: String): Self = StObject.set(x, "startCursor", value.asInstanceOf[js.Any])
    
    inline def setStartCursorNull: Self = StObject.set(x, "startCursor", null)
    
    inline def setStartCursorUndefined: Self = StObject.set(x, "startCursor", js.undefined)
  }
}
