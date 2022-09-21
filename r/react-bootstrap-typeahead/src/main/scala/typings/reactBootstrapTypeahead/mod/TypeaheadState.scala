package typings.reactBootstrapTypeahead.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeaheadState[T /* <: TypeaheadModel */] extends StObject {
  
  var activeIndex: Double | Null
  
  var activeItem: T | Null
  
  var initialItem: T | Null
  
  var isFocused: Boolean
  
  var selected: js.Array[T]
  
  var showMenu: Boolean
  
  var shownResults: Double
  
  var text: String
}
object TypeaheadState {
  
  inline def apply[T /* <: TypeaheadModel */](isFocused: Boolean, selected: js.Array[T], showMenu: Boolean, shownResults: Double, text: String): TypeaheadState[T] = {
    val __obj = js.Dynamic.literal(isFocused = isFocused.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], showMenu = showMenu.asInstanceOf[js.Any], shownResults = shownResults.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], activeIndex = null, activeItem = null, initialItem = null)
    __obj.asInstanceOf[TypeaheadState[T]]
  }
  
  extension [Self <: TypeaheadState[?], T /* <: TypeaheadModel */](x: Self & TypeaheadState[T]) {
    
    inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    inline def setActiveIndexNull: Self = StObject.set(x, "activeIndex", null)
    
    inline def setActiveItem(value: T): Self = StObject.set(x, "activeItem", value.asInstanceOf[js.Any])
    
    inline def setActiveItemNull: Self = StObject.set(x, "activeItem", null)
    
    inline def setInitialItem(value: T): Self = StObject.set(x, "initialItem", value.asInstanceOf[js.Any])
    
    inline def setInitialItemNull: Self = StObject.set(x, "initialItem", null)
    
    inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    
    inline def setSelected(value: js.Array[T]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedVarargs(value: T*): Self = StObject.set(x, "selected", js.Array(value*))
    
    inline def setShowMenu(value: Boolean): Self = StObject.set(x, "showMenu", value.asInstanceOf[js.Any])
    
    inline def setShownResults(value: Double): Self = StObject.set(x, "shownResults", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
