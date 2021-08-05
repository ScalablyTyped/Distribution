package typings.storybookUi.anon

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Title extends StObject {
  
  var id: String
  
  var left: String | Element
  
  def onClick(): Unit
  
  var right: Element
  
  var title: String
}
object Title {
  
  inline def apply(id: String, left: String | Element, onClick: () => Unit, right: Element, title: String): Title = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), right = right.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Title]
  }
  
  extension [Self <: Title](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: String | Element): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
    
    inline def setRight(value: Element): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
