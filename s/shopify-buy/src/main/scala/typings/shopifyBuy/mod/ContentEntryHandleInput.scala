package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentEntryHandleInput extends StObject {
  
  var handle: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object ContentEntryHandleInput {
  
  inline def apply(): ContentEntryHandleInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContentEntryHandleInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentEntryHandleInput] (val x: Self) extends AnyVal {
    
    inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
    
    inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
