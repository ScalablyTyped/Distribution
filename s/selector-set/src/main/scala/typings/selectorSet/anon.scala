package typings.selectorSet

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Data[T] extends StObject {
    
    var data: T = js.native
    
    var selector: String = js.native
  }
  object Data {
    
    @scala.inline
    def apply[T](data: T, selector: String): Data[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data[T]]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data[_], T] (val x: Self with Data[T]) extends AnyVal {
      
      @scala.inline
      def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Elements[T] extends StObject {
    
    var data: T = js.native
    
    var elements: js.Array[Element] = js.native
    
    var selector: String = js.native
  }
  object Elements {
    
    @scala.inline
    def apply[T](data: T, elements: js.Array[Element], selector: String): Elements[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[Elements[T]]
    }
    
    @scala.inline
    implicit class ElementsMutableBuilder[Self <: Elements[_], T] (val x: Self with Elements[T]) extends AnyVal {
      
      @scala.inline
      def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElements(value: js.Array[Element]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementsVarargs(value: Element*): Self = StObject.set(x, "elements", js.Array(value :_*))
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    }
  }
}
