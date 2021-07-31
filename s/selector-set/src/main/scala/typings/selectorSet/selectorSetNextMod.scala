package typings.selectorSet

import typings.selectorSet.anon.Data
import typings.selectorSet.anon.Elements
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectorSetNextMod {
  
  @JSImport("selector-set/selector-set.next", JSImport.Default)
  @js.native
  class default[T] ()
    extends StObject
       with SelectorSet[T]
  
  trait ISelectorSetIndex extends StObject {
    
    def element(el: Element): js.Array[String] | Unit
    
    var name: String
    
    def selector(selector: String): String | Unit
  }
  object ISelectorSetIndex {
    
    @scala.inline
    def apply(element: Element => js.Array[String] | Unit, name: String, selector: String => String | Unit): ISelectorSetIndex = {
      val __obj = js.Dynamic.literal(element = js.Any.fromFunction1(element), name = name.asInstanceOf[js.Any], selector = js.Any.fromFunction1(selector))
      __obj.asInstanceOf[ISelectorSetIndex]
    }
    
    @scala.inline
    implicit class ISelectorSetIndexMutableBuilder[Self <: ISelectorSetIndex] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setElement(value: Element => js.Array[String] | Unit): Self = StObject.set(x, "element", js.Any.fromFunction1(value))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelector(value: String => String | Unit): Self = StObject.set(x, "selector", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait SelectorSet[T] extends StObject {
    
    def add(selector: String, data: T): Unit = js.native
    
    var indexes: js.Array[ISelectorSetIndex] = js.native
    
    def logDefaultIndexUsed(hasSelectorData: Data[T]): Unit = js.native
    
    def matches(el: Element): js.Array[Data[T]] = js.native
    
    def matchesSelector(el: Element, selector: String): Boolean = js.native
    
    def queryAll(context: Element): js.Array[Elements[T]] = js.native
    
    def querySelectorAll(selectors: String, context: Element): js.Array[Element] = js.native
    
    def remove(selector: String): Unit = js.native
    def remove(selector: String, data: T): Unit = js.native
    
    var size: Double = js.native
  }
}
