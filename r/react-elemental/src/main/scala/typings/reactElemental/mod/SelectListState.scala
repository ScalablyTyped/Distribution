package typings.reactElemental.mod

import typings.reactElemental.anon.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectListState extends StObject {
  
  val highlightedIdx: Double | Null
  
  val isExpanded: Boolean
  
  val isFocused: Boolean
  
  val isHovered: Boolean
  
  val selectedOption: Value
}
object SelectListState {
  
  @scala.inline
  def apply(isExpanded: Boolean, isFocused: Boolean, isHovered: Boolean, selectedOption: Value): SelectListState = {
    val __obj = js.Dynamic.literal(isExpanded = isExpanded.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isHovered = isHovered.asInstanceOf[js.Any], selectedOption = selectedOption.asInstanceOf[js.Any], highlightedIdx = null)
    __obj.asInstanceOf[SelectListState]
  }
  
  @scala.inline
  implicit class SelectListStateMutableBuilder[Self <: SelectListState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHighlightedIdx(value: Double): Self = StObject.set(x, "highlightedIdx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedIdxNull: Self = StObject.set(x, "highlightedIdx", null)
    
    @scala.inline
    def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHovered(value: Boolean): Self = StObject.set(x, "isHovered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedOption(value: Value): Self = StObject.set(x, "selectedOption", value.asInstanceOf[js.Any])
  }
}
