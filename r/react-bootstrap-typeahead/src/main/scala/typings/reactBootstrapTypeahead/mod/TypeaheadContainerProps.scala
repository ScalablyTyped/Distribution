package typings.reactBootstrapTypeahead.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeaheadContainerProps[T /* <: TypeaheadModel */] extends StObject {
  
  var activeIndex: Double | Null = js.native
  
  var activeItem: T | Null = js.native
  
  var initialItem: T | Null = js.native
  
  var isFocused: Boolean = js.native
  
  var selected: js.Array[T] = js.native
  
  var showMenu: Boolean = js.native
  
  var shownResults: Double = js.native
  
  var text: String = js.native
}
object TypeaheadContainerProps {
  
  @scala.inline
  def apply[T /* <: TypeaheadModel */](isFocused: Boolean, selected: js.Array[T], showMenu: Boolean, shownResults: Double, text: String): TypeaheadContainerProps[T] = {
    val __obj = js.Dynamic.literal(isFocused = isFocused.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], showMenu = showMenu.asInstanceOf[js.Any], shownResults = shownResults.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeaheadContainerProps[T]]
  }
  
  @scala.inline
  implicit class TypeaheadContainerPropsMutableBuilder[Self <: TypeaheadContainerProps[_], T /* <: TypeaheadModel */] (val x: Self with TypeaheadContainerProps[T]) extends AnyVal {
    
    @scala.inline
    def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveIndexNull: Self = StObject.set(x, "activeIndex", null)
    
    @scala.inline
    def setActiveItem(value: T): Self = StObject.set(x, "activeItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveItemNull: Self = StObject.set(x, "activeItem", null)
    
    @scala.inline
    def setInitialItem(value: T): Self = StObject.set(x, "initialItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialItemNull: Self = StObject.set(x, "initialItem", null)
    
    @scala.inline
    def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: js.Array[T]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedVarargs(value: T*): Self = StObject.set(x, "selected", js.Array(value :_*))
    
    @scala.inline
    def setShowMenu(value: Boolean): Self = StObject.set(x, "showMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShownResults(value: Double): Self = StObject.set(x, "shownResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
