package typings.reactBootstrapTypeahead.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeaheadContainerProps[T /* <: TypeaheadModel */] extends js.Object {
  
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
  implicit class TypeaheadContainerPropsOps[Self <: TypeaheadContainerProps[_], T /* <: TypeaheadModel */] (val x: Self with TypeaheadContainerProps[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsFocused(value: Boolean): Self = this.set("isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedVarargs(value: T*): Self = this.set("selected", js.Array(value :_*))
    
    @scala.inline
    def setSelected(value: js.Array[T]): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowMenu(value: Boolean): Self = this.set("showMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShownResults(value: Double): Self = this.set("shownResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveIndex(value: Double): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveIndexNull: Self = this.set("activeIndex", null)
    
    @scala.inline
    def setActiveItem(value: T): Self = this.set("activeItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveItemNull: Self = this.set("activeItem", null)
    
    @scala.inline
    def setInitialItem(value: T): Self = this.set("initialItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialItemNull: Self = this.set("initialItem", null)
  }
}
