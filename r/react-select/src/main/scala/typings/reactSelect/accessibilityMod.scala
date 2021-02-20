package typings.reactSelect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object accessibilityMod {
  
  @JSImport("react-select/src/accessibility", "instructionsAriaMessage")
  @js.native
  def instructionsAriaMessage(event: js.Any): String = js.native
  @JSImport("react-select/src/accessibility", "instructionsAriaMessage")
  @js.native
  def instructionsAriaMessage(event: js.Any, context: InstructionsContext): String = js.native
  
  @JSImport("react-select/src/accessibility", "optionFocusAriaMessage")
  @js.native
  def optionFocusAriaMessage(hasFocusedOptionGetOptionLabelOptions: js.Any): String = js.native
  
  @JSImport("react-select/src/accessibility", "resultsAriaMessage")
  @js.native
  def resultsAriaMessage(hasInputValueScreenReaderMessage: js.Any): String = js.native
  
  @JSImport("react-select/src/accessibility", "valueEventAriaMessage")
  @js.native
  def valueEventAriaMessage(event: js.Any, context: ValueEventContext): String = js.native
  
  @JSImport("react-select/src/accessibility", "valueFocusAriaMessage")
  @js.native
  def valueFocusAriaMessage(hasFocusedValueGetOptionLabelSelectValue: js.Any): String = js.native
  
  @js.native
  trait InstructionsContext extends StObject {
    
    var isMulti: js.UndefOr[Boolean] = js.native
    
    var isSearchable: js.UndefOr[Boolean] = js.native
    
    var label: js.UndefOr[String] = js.native
  }
  object InstructionsContext {
    
    @scala.inline
    def apply(): InstructionsContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstructionsContext]
    }
    
    @scala.inline
    implicit class InstructionsContextMutableBuilder[Self <: InstructionsContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsMulti(value: Boolean): Self = StObject.set(x, "isMulti", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsMultiUndefined: Self = StObject.set(x, "isMulti", js.undefined)
      
      @scala.inline
      def setIsSearchable(value: Boolean): Self = StObject.set(x, "isSearchable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSearchableUndefined: Self = StObject.set(x, "isSearchable", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    }
  }
  
  @js.native
  trait ValueEventContext extends StObject {
    
    var value: String = js.native
  }
  object ValueEventContext {
    
    @scala.inline
    def apply(value: String): ValueEventContext = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValueEventContext]
    }
    
    @scala.inline
    implicit class ValueEventContextMutableBuilder[Self <: ValueEventContext] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
