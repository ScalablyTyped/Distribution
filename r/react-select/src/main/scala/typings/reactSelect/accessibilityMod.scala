package typings.reactSelect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accessibilityMod {
  
  @JSImport("react-select/src/accessibility", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def instructionsAriaMessage(event: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("instructionsAriaMessage")(event.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def instructionsAriaMessage(event: js.Any, context: InstructionsContext): String = (^.asInstanceOf[js.Dynamic].applyDynamic("instructionsAriaMessage")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def optionFocusAriaMessage(hasFocusedOptionGetOptionLabelOptions: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("optionFocusAriaMessage")(hasFocusedOptionGetOptionLabelOptions.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def resultsAriaMessage(hasInputValueScreenReaderMessage: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resultsAriaMessage")(hasInputValueScreenReaderMessage.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def valueEventAriaMessage(event: js.Any, context: ValueEventContext): String = (^.asInstanceOf[js.Dynamic].applyDynamic("valueEventAriaMessage")(event.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def valueFocusAriaMessage(hasFocusedValueGetOptionLabelSelectValue: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("valueFocusAriaMessage")(hasFocusedValueGetOptionLabelSelectValue.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait InstructionsContext extends StObject {
    
    var isMulti: js.UndefOr[Boolean] = js.undefined
    
    var isSearchable: js.UndefOr[Boolean] = js.undefined
    
    var label: js.UndefOr[String] = js.undefined
  }
  object InstructionsContext {
    
    inline def apply(): InstructionsContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstructionsContext]
    }
    
    extension [Self <: InstructionsContext](x: Self) {
      
      inline def setIsMulti(value: Boolean): Self = StObject.set(x, "isMulti", value.asInstanceOf[js.Any])
      
      inline def setIsMultiUndefined: Self = StObject.set(x, "isMulti", js.undefined)
      
      inline def setIsSearchable(value: Boolean): Self = StObject.set(x, "isSearchable", value.asInstanceOf[js.Any])
      
      inline def setIsSearchableUndefined: Self = StObject.set(x, "isSearchable", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
  
  trait ValueEventContext extends StObject {
    
    var value: String
  }
  object ValueEventContext {
    
    inline def apply(value: String): ValueEventContext = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueEventContext]
    }
    
    extension [Self <: ValueEventContext](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
