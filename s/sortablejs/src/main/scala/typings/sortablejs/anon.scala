package typings.sortablejs

import typings.sortablejs.mod.Sortable
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Get extends StObject {
    
    def get(sortable: Sortable): js.Array[String] = js.native
    
    def set(sortable: Sortable): Unit = js.native
  }
  object Get {
    
    @scala.inline
    def apply(get: Sortable => js.Array[String], set: Sortable => Unit): Get = {
      val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), set = js.Any.fromFunction1(set))
      __obj.asInstanceOf[Get]
    }
    
    @scala.inline
    implicit class GetMutableBuilder[Self <: Get] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGet(value: Sortable => js.Array[String]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSet(value: Sortable => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait Index extends StObject {
    
    var index: Double = js.native
    
    var multiDragElement: HTMLElement = js.native
  }
  object Index {
    
    @scala.inline
    def apply(index: Double, multiDragElement: HTMLElement): Index = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], multiDragElement = multiDragElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index]
    }
    
    @scala.inline
    implicit class IndexMutableBuilder[Self <: Index] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiDragElement(value: HTMLElement): Self = StObject.set(x, "multiDragElement", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait X extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object X {
    
    @scala.inline
    def apply(x: Double, y: Double): X = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[X]
    }
    
    @scala.inline
    implicit class XMutableBuilder[Self <: X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
}
