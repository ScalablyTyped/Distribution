package typings.reactDayPicker

import typings.react.mod.Context
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactDayPicker.dayPickerBaseMod.DayPickerBase
import typings.reactDayPicker.dayPickerMultipleMod.DayPickerMultipleProps
import typings.reactDayPicker.eventHandlersMod.DayClickEventHandler
import typings.reactDayPicker.typesModifiersMod.ActiveModifiers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectMultipleContextMod {
  
  @JSImport("react-day-picker/dist/contexts/SelectMultiple/SelectMultipleContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-day-picker/dist/contexts/SelectMultiple/SelectMultipleContext", "SelectMultipleContext")
  @js.native
  val SelectMultipleContext: Context[js.UndefOr[SelectMultipleContextValue]] = js.native
  
  inline def SelectMultipleProvider(props: SelectMultipleProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectMultipleProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def SelectMultipleProviderInternal(hasInitialPropsChildren: SelectMultipleProviderInternalProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectMultipleProviderInternal")(hasInitialPropsChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait SelectMultipleContextValue extends StObject {
    
    /** The modifiers for the corresponding selection. */
    var modifiers: SelectMultipleModifiers
    
    /** Event handler to attach to the day button to enable the multiple select. */
    var onDayClick: js.UndefOr[DayClickEventHandler] = js.undefined
    
    /** The days that have been selected. */
    var selected: js.UndefOr[js.Array[js.Date]] = js.undefined
  }
  object SelectMultipleContextValue {
    
    inline def apply(modifiers: SelectMultipleModifiers): SelectMultipleContextValue = {
      val __obj = js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectMultipleContextValue]
    }
    
    extension [Self <: SelectMultipleContextValue](x: Self) {
      
      inline def setModifiers(value: SelectMultipleModifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setOnDayClick(
        value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ MouseEvent[typings.std.Element, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onDayClick", js.Any.fromFunction3(value))
      
      inline def setOnDayClickUndefined: Self = StObject.set(x, "onDayClick", js.undefined)
      
      inline def setSelected(value: js.Array[js.Date]): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      inline def setSelectedVarargs(value: js.Date*): Self = StObject.set(x, "selected", js.Array(value*))
    }
  }
  
  /* Inlined std.Pick<react-day-picker.react-day-picker/dist/types/Modifiers.Modifiers, react-day-picker.react-day-picker/dist/types/Modifiers.InternalModifier.Disabled> */
  trait SelectMultipleModifiers extends StObject {
    
    var disabled: js.UndefOr[Any] = js.undefined
  }
  object SelectMultipleModifiers {
    
    inline def apply(): SelectMultipleModifiers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectMultipleModifiers]
    }
    
    extension [Self <: SelectMultipleModifiers](x: Self) {
      
      inline def setDisabled(value: Any): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    }
  }
  
  trait SelectMultipleProviderInternalProps extends StObject {
    
    var children: ReactNode
    
    var initialProps: DayPickerMultipleProps
  }
  object SelectMultipleProviderInternalProps {
    
    inline def apply(initialProps: DayPickerMultipleProps): SelectMultipleProviderInternalProps = {
      val __obj = js.Dynamic.literal(initialProps = initialProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectMultipleProviderInternalProps]
    }
    
    extension [Self <: SelectMultipleProviderInternalProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInitialProps(value: DayPickerMultipleProps): Self = StObject.set(x, "initialProps", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectMultipleProviderProps extends StObject {
    
    var children: ReactNode
    
    var initialProps: DayPickerBase
  }
  object SelectMultipleProviderProps {
    
    inline def apply(initialProps: DayPickerBase): SelectMultipleProviderProps = {
      val __obj = js.Dynamic.literal(initialProps = initialProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectMultipleProviderProps]
    }
    
    extension [Self <: SelectMultipleProviderProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInitialProps(value: DayPickerBase): Self = StObject.set(x, "initialProps", value.asInstanceOf[js.Any])
    }
  }
}
