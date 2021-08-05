package typings.reactNativeAutocompleteInput

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Index[T] extends StObject {
    
    var index: Double
    
    var item: T
  }
  object Index {
    
    inline def apply[T](index: Double, item: T): Index[T] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index[T]]
    }
    
    extension [Self <: Index[?], T](x: Self & Index[T]) {
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setItem(value: T): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
}
