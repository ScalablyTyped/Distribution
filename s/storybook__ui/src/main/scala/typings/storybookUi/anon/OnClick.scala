package typings.storybookUi.anon

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnClick extends StObject {
  
  var id: String
  
  var left: Element
  
  def onClick(): js.Promise[Unit]
  
  var title: String
}
object OnClick {
  
  inline def apply(id: String, left: Element, onClick: () => js.Promise[Unit], title: String): OnClick = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], onClick = js.Any.fromFunction0(onClick), title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnClick]
  }
  
  extension [Self <: OnClick](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: Element): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: () => js.Promise[Unit]): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
