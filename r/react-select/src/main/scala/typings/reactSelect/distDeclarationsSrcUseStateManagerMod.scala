package typings.reactSelect

import typings.reactSelect.distDeclarationsSrcSelectMod.PublicBaseSelectProps
import typings.reactSelect.distDeclarationsSrcTypesMod.GroupBase
import typings.reactSelect.distDeclarationsSrcTypesMod.PropsValue
import typings.reactSelect.reactSelectStrings.defaultInputValue
import typings.reactSelect.reactSelectStrings.defaultMenuIsOpen
import typings.reactSelect.reactSelectStrings.defaultValue
import typings.std.Omit
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcUseStateManagerMod {
  
  @JSImport("react-select/dist/declarations/src/useStateManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */, AdditionalProps](param0: (StateManagerProps[Option, IsMulti, Group]) & AdditionalProps): (PublicBaseSelectProps[Option, IsMulti, Group]) & (Omit[
    AdditionalProps, 
    defaultInputValue | defaultMenuIsOpen | defaultValue | StateManagedPropKeys
  ]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[(PublicBaseSelectProps[Option, IsMulti, Group]) & (Omit[
    AdditionalProps, 
    defaultInputValue | defaultMenuIsOpen | defaultValue | StateManagedPropKeys
  ])]
  
  type SelectPropsWithOptionalStateManagedProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] = (Omit[PublicBaseSelectProps[Option, IsMulti, Group], StateManagedPropKeys]) & (Partial[PublicBaseSelectProps[Option, IsMulti, Group]])
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactSelect.reactSelectStrings.inputValue
    - typings.reactSelect.reactSelectStrings.menuIsOpen
    - typings.reactSelect.reactSelectStrings.onChange
    - typings.reactSelect.reactSelectStrings.onInputChange
    - typings.reactSelect.reactSelectStrings.onMenuClose
    - typings.reactSelect.reactSelectStrings.onMenuOpen
    - typings.reactSelect.reactSelectStrings.value
  */
  trait StateManagedPropKeys extends StObject
  object StateManagedPropKeys {
    
    inline def inputValue: typings.reactSelect.reactSelectStrings.inputValue = "inputValue".asInstanceOf[typings.reactSelect.reactSelectStrings.inputValue]
    
    inline def menuIsOpen: typings.reactSelect.reactSelectStrings.menuIsOpen = "menuIsOpen".asInstanceOf[typings.reactSelect.reactSelectStrings.menuIsOpen]
    
    inline def onChange: typings.reactSelect.reactSelectStrings.onChange = "onChange".asInstanceOf[typings.reactSelect.reactSelectStrings.onChange]
    
    inline def onInputChange: typings.reactSelect.reactSelectStrings.onInputChange = "onInputChange".asInstanceOf[typings.reactSelect.reactSelectStrings.onInputChange]
    
    inline def onMenuClose: typings.reactSelect.reactSelectStrings.onMenuClose = "onMenuClose".asInstanceOf[typings.reactSelect.reactSelectStrings.onMenuClose]
    
    inline def onMenuOpen: typings.reactSelect.reactSelectStrings.onMenuOpen = "onMenuOpen".asInstanceOf[typings.reactSelect.reactSelectStrings.onMenuOpen]
    
    inline def value: typings.reactSelect.reactSelectStrings.value = "value".asInstanceOf[typings.reactSelect.reactSelectStrings.value]
  }
  
  trait StateManagerAdditionalProps[Option] extends StObject {
    
    var defaultInputValue: js.UndefOr[String] = js.undefined
    
    var defaultMenuIsOpen: js.UndefOr[Boolean] = js.undefined
    
    var defaultValue: js.UndefOr[PropsValue[Option]] = js.undefined
  }
  object StateManagerAdditionalProps {
    
    inline def apply[Option](): StateManagerAdditionalProps[Option] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StateManagerAdditionalProps[Option]]
    }
    
    extension [Self <: StateManagerAdditionalProps[?], Option](x: Self & StateManagerAdditionalProps[Option]) {
      
      inline def setDefaultInputValue(value: String): Self = StObject.set(x, "defaultInputValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultInputValueUndefined: Self = StObject.set(x, "defaultInputValue", js.undefined)
      
      inline def setDefaultMenuIsOpen(value: Boolean): Self = StObject.set(x, "defaultMenuIsOpen", value.asInstanceOf[js.Any])
      
      inline def setDefaultMenuIsOpenUndefined: Self = StObject.set(x, "defaultMenuIsOpen", js.undefined)
      
      inline def setDefaultValue(value: PropsValue[Option]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueNull: Self = StObject.set(x, "defaultValue", null)
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: Option*): Self = StObject.set(x, "defaultValue", js.Array(value*))
    }
  }
  
  type StateManagerProps[Option, IsMulti /* <: Boolean */, Group /* <: GroupBase[Option] */] = (SelectPropsWithOptionalStateManagedProps[Option, IsMulti, Group]) & StateManagerAdditionalProps[Option]
}
