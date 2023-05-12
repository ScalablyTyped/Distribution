package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PageInfo extends StObject {
  
  var endCursor: js.UndefOr[String] = js.undefined
  
  var hasNextPage: Boolean
  
  var hasPreviousPage: Boolean
  
  var startCursor: js.UndefOr[String] = js.undefined
}
object PageInfo {
  
  inline def apply(hasNextPage: Boolean, hasPreviousPage: Boolean): PageInfo = {
    val __obj = js.Dynamic.literal(hasNextPage = hasNextPage.asInstanceOf[js.Any], hasPreviousPage = hasPreviousPage.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PageInfo] (val x: Self) extends AnyVal {
    
    inline def setEndCursor(value: String): Self = StObject.set(x, "endCursor", value.asInstanceOf[js.Any])
    
    inline def setEndCursorUndefined: Self = StObject.set(x, "endCursor", js.undefined)
    
    inline def setHasNextPage(value: Boolean): Self = StObject.set(x, "hasNextPage", value.asInstanceOf[js.Any])
    
    inline def setHasPreviousPage(value: Boolean): Self = StObject.set(x, "hasPreviousPage", value.asInstanceOf[js.Any])
    
    inline def setStartCursor(value: String): Self = StObject.set(x, "startCursor", value.asInstanceOf[js.Any])
    
    inline def setStartCursorUndefined: Self = StObject.set(x, "startCursor", js.undefined)
  }
}
