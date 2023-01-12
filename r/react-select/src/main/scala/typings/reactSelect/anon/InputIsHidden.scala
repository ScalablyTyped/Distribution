package typings.reactSelect.anon

import typings.reactSelect.distDeclarationsSrcSelectMod.Props
import typings.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputIsHidden extends StObject {
  
  var ariaSelection: (typings.reactSelect.distDeclarationsSrcAccessibilityMod.AriaSelection[Any, Boolean]) | Null
  
  var inputIsHidden: Unit
  
  var inputIsHiddenAfterUpdate: Unit
  
  var prevProps: Props[Any, Boolean, GroupBase[Any]]
  
  var prevWasFocused: Boolean
}
object InputIsHidden {
  
  inline def apply(
    inputIsHidden: Unit,
    inputIsHiddenAfterUpdate: Unit,
    prevProps: Props[Any, Boolean, GroupBase[Any]],
    prevWasFocused: Boolean
  ): InputIsHidden = {
    val __obj = js.Dynamic.literal(inputIsHidden = inputIsHidden.asInstanceOf[js.Any], inputIsHiddenAfterUpdate = inputIsHiddenAfterUpdate.asInstanceOf[js.Any], prevProps = prevProps.asInstanceOf[js.Any], prevWasFocused = prevWasFocused.asInstanceOf[js.Any], ariaSelection = null)
    __obj.asInstanceOf[InputIsHidden]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputIsHidden] (val x: Self) extends AnyVal {
    
    inline def setAriaSelection(value: typings.reactSelect.distDeclarationsSrcAccessibilityMod.AriaSelection[Any, Boolean]): Self = StObject.set(x, "ariaSelection", value.asInstanceOf[js.Any])
    
    inline def setAriaSelectionNull: Self = StObject.set(x, "ariaSelection", null)
    
    inline def setInputIsHidden(value: Unit): Self = StObject.set(x, "inputIsHidden", value.asInstanceOf[js.Any])
    
    inline def setInputIsHiddenAfterUpdate(value: Unit): Self = StObject.set(x, "inputIsHiddenAfterUpdate", value.asInstanceOf[js.Any])
    
    inline def setPrevProps(value: Props[Any, Boolean, GroupBase[Any]]): Self = StObject.set(x, "prevProps", value.asInstanceOf[js.Any])
    
    inline def setPrevWasFocused(value: Boolean): Self = StObject.set(x, "prevWasFocused", value.asInstanceOf[js.Any])
  }
}
