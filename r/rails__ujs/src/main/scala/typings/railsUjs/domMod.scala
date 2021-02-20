package typings.railsUjs

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domMod {
  
  @JSImport("@rails/ujs/utils/dom", "$")
  @js.native
  def _empty(selector: String): js.Array[Element] = js.native
  
  @JSImport("@rails/ujs/utils/dom", "getData")
  @js.native
  def getData(element: Element, key: String): js.Any = js.native
  
  @JSImport("@rails/ujs/utils/dom", "matches")
  @js.native
  def matches(element: Element, selector: String): Boolean = js.native
  @JSImport("@rails/ujs/utils/dom", "matches")
  @js.native
  def matches(element: Element, selector: SelectorObject): Boolean = js.native
  
  @JSImport("@rails/ujs/utils/dom", "setData")
  @js.native
  def setData(element: Element, key: String, value: js.Any): Unit = js.native
  
  @js.native
  trait SelectorObject extends StObject {
    
    var exclude: String = js.native
    
    var selector: String = js.native
  }
  object SelectorObject {
    
    @scala.inline
    def apply(exclude: String, selector: String): SelectorObject = {
      val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectorObject]
    }
    
    @scala.inline
    implicit class SelectorObjectMutableBuilder[Self <: SelectorObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExclude(value: String): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    }
  }
}
