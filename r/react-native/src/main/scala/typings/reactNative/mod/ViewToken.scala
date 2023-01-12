package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewToken extends StObject {
  
  var index: Double | Null
  
  var isViewable: Boolean
  
  var item: Any
  
  var key: String
  
  var section: js.UndefOr[Any] = js.undefined
}
object ViewToken {
  
  inline def apply(isViewable: Boolean, item: Any, key: String): ViewToken = {
    val __obj = js.Dynamic.literal(isViewable = isViewable.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], index = null)
    __obj.asInstanceOf[ViewToken]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewToken] (val x: Self) extends AnyVal {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexNull: Self = StObject.set(x, "index", null)
    
    inline def setIsViewable(value: Boolean): Self = StObject.set(x, "isViewable", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setSection(value: Any): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
    
    inline def setSectionUndefined: Self = StObject.set(x, "section", js.undefined)
  }
}
