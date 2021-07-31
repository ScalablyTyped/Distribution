package typings.reactBootstrapTypeahead.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactBootstrapTypeahead.mod.TypeaheadContainerProps because var conflicts: selected. Inlined activeIndex, activeItem, initialItem, isFocused, showMenu, shownResults, text */ trait AllTypeaheadOwnAndInjectedProps[T /* <: TypeaheadModel */]
  extends StObject
     with TypeaheadProps[T] {
  
  var activeIndex: Double | Null
  
  var activeItem: T | Null
  
  var initialItem: T | Null
  
  var isFocused: Boolean
  
  var showMenu: Boolean
  
  var shownResults: Double
  
  var text: String
}
object AllTypeaheadOwnAndInjectedProps {
  
  @scala.inline
  def apply[T /* <: TypeaheadModel */](isFocused: Boolean, options: js.Array[T], showMenu: Boolean, shownResults: Double, text: String): AllTypeaheadOwnAndInjectedProps[T] = {
    val __obj = js.Dynamic.literal(isFocused = isFocused.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], showMenu = showMenu.asInstanceOf[js.Any], shownResults = shownResults.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], activeIndex = null, activeItem = null, initialItem = null)
    __obj.asInstanceOf[AllTypeaheadOwnAndInjectedProps[T]]
  }
  
  @scala.inline
  implicit class AllTypeaheadOwnAndInjectedPropsMutableBuilder[Self <: AllTypeaheadOwnAndInjectedProps[?], T /* <: TypeaheadModel */] (val x: Self & AllTypeaheadOwnAndInjectedProps[T]) extends AnyVal {
    
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
    def setShowMenu(value: Boolean): Self = StObject.set(x, "showMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShownResults(value: Double): Self = StObject.set(x, "shownResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
