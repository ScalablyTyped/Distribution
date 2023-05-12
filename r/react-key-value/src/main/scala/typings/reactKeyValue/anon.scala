package typings.reactKeyValue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait KeyItem extends StObject {
    
    var keyItem: String
    
    var valueItem: String
  }
  object KeyItem {
    
    inline def apply(keyItem: String, valueItem: String): KeyItem = {
      val __obj = js.Dynamic.literal(keyItem = keyItem.asInstanceOf[js.Any], valueItem = valueItem.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyItem] (val x: Self) extends AnyVal {
      
      inline def setKeyItem(value: String): Self = StObject.set(x, "keyItem", value.asInstanceOf[js.Any])
      
      inline def setValueItem(value: String): Self = StObject.set(x, "valueItem", value.asInstanceOf[js.Any])
    }
  }
}
