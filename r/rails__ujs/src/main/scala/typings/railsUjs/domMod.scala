package typings.railsUjs

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domMod {
  
  @JSImport("@rails/ujs/utils/dom", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def _empty(selector: String): js.Array[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("$")(selector.asInstanceOf[js.Any]).asInstanceOf[js.Array[Element]]
  
  inline def getData(element: Element, key: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getData")(element.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def matches(element: Element, selector: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def matches(element: Element, selector: SelectorObject): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matches")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def setData(element: Element, key: String, value: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setData")(element.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait SelectorObject extends StObject {
    
    var exclude: String
    
    var selector: String
  }
  object SelectorObject {
    
    inline def apply(exclude: String, selector: String): SelectorObject = {
      val __obj = js.Dynamic.literal(exclude = exclude.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectorObject]
    }
    
    extension [Self <: SelectorObject](x: Self) {
      
      inline def setExclude(value: String): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    }
  }
}
