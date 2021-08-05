package typings.selectorSet

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data[T] extends StObject {
    
    var data: T
    
    var selector: String
  }
  object Data {
    
    inline def apply[T](data: T, selector: String): Data[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data[T]]
    }
    
    extension [Self <: Data[?], T](x: Self & Data[T]) {
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    }
  }
  
  trait Elements[T] extends StObject {
    
    var data: T
    
    var elements: js.Array[Element]
    
    var selector: String
  }
  object Elements {
    
    inline def apply[T](data: T, elements: js.Array[Element], selector: String): Elements[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[Elements[T]]
    }
    
    extension [Self <: Elements[?], T](x: Self & Elements[T]) {
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setElements(value: js.Array[Element]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      inline def setElementsVarargs(value: Element*): Self = StObject.set(x, "elements", js.Array(value :_*))
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    }
  }
}
