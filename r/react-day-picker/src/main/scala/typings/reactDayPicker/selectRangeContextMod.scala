package typings.reactDayPicker

import typings.react.mod.Context
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactDayPicker.dayPickerBaseMod.DayPickerBase
import typings.reactDayPicker.dayPickerRangeMod.DayPickerRangeProps
import typings.reactDayPicker.eventHandlersMod.DayClickEventHandler
import typings.reactDayPicker.matchersMod.DateRange
import typings.reactDayPicker.typesModifiersMod.ActiveModifiers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectRangeContextMod {
  
  @JSImport("react-day-picker/dist/contexts/SelectRange/SelectRangeContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-day-picker/dist/contexts/SelectRange/SelectRangeContext", "SelectRangeContext")
  @js.native
  val SelectRangeContext: Context[js.UndefOr[SelectRangeContextValue]] = js.native
  
  inline def SelectRangeProvider(props: SelectRangeProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectRangeProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def SelectRangeProviderInternal(hasInitialPropsChildren: SelectRangeProviderInternalProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectRangeProviderInternal")(hasInitialPropsChildren.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait SelectRangeContextValue extends StObject {
    
    /** The modifiers for the corresponding selection. */
    var modifiers: SelectRangeModifiers
    
    /** Event handler to attach to the day button to enable the range select. */
    var onDayClick: js.UndefOr[DayClickEventHandler] = js.undefined
    
    /** The range of days that has been selected. */
    var selected: js.UndefOr[DateRange] = js.undefined
  }
  object SelectRangeContextValue {
    
    inline def apply(modifiers: SelectRangeModifiers): SelectRangeContextValue = {
      val __obj = js.Dynamic.literal(modifiers = modifiers.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectRangeContextValue]
    }
    
    extension [Self <: SelectRangeContextValue](x: Self) {
      
      inline def setModifiers(value: SelectRangeModifiers): Self = StObject.set(x, "modifiers", value.asInstanceOf[js.Any])
      
      inline def setOnDayClick(
        value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ MouseEvent[typings.std.Element, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onDayClick", js.Any.fromFunction3(value))
      
      inline def setOnDayClickUndefined: Self = StObject.set(x, "onDayClick", js.undefined)
      
      inline def setSelected(value: DateRange): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
  
  /* Inlined std.Pick<react-day-picker.react-day-picker/dist/types/Modifiers.Modifiers, react-day-picker.react-day-picker/dist/types/Modifiers.InternalModifier.Disabled | react-day-picker.react-day-picker/dist/types/Modifiers.InternalModifier.RangeEnd | react-day-picker.react-day-picker/dist/types/Modifiers.InternalModifier.RangeMiddle | react-day-picker.react-day-picker/dist/types/Modifiers.InternalModifier.RangeStart> */
  trait SelectRangeModifiers extends StObject {
    
    var disabled: js.UndefOr[Any] = js.undefined
    
    var range_end: js.UndefOr[Any] = js.undefined
    
    var range_middle: js.UndefOr[Any] = js.undefined
    
    var range_start: js.UndefOr[Any] = js.undefined
  }
  object SelectRangeModifiers {
    
    inline def apply(): SelectRangeModifiers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectRangeModifiers]
    }
    
    extension [Self <: SelectRangeModifiers](x: Self) {
      
      inline def setDisabled(value: Any): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setRange_end(value: Any): Self = StObject.set(x, "range_end", value.asInstanceOf[js.Any])
      
      inline def setRange_endUndefined: Self = StObject.set(x, "range_end", js.undefined)
      
      inline def setRange_middle(value: Any): Self = StObject.set(x, "range_middle", value.asInstanceOf[js.Any])
      
      inline def setRange_middleUndefined: Self = StObject.set(x, "range_middle", js.undefined)
      
      inline def setRange_start(value: Any): Self = StObject.set(x, "range_start", value.asInstanceOf[js.Any])
      
      inline def setRange_startUndefined: Self = StObject.set(x, "range_start", js.undefined)
    }
  }
  
  trait SelectRangeProviderInternalProps extends StObject {
    
    var children: ReactNode
    
    var initialProps: DayPickerRangeProps
  }
  object SelectRangeProviderInternalProps {
    
    inline def apply(initialProps: DayPickerRangeProps): SelectRangeProviderInternalProps = {
      val __obj = js.Dynamic.literal(initialProps = initialProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectRangeProviderInternalProps]
    }
    
    extension [Self <: SelectRangeProviderInternalProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInitialProps(value: DayPickerRangeProps): Self = StObject.set(x, "initialProps", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectRangeProviderProps extends StObject {
    
    var children: ReactNode
    
    var initialProps: DayPickerBase
  }
  object SelectRangeProviderProps {
    
    inline def apply(initialProps: DayPickerBase): SelectRangeProviderProps = {
      val __obj = js.Dynamic.literal(initialProps = initialProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectRangeProviderProps]
    }
    
    extension [Self <: SelectRangeProviderProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInitialProps(value: DayPickerBase): Self = StObject.set(x, "initialProps", value.asInstanceOf[js.Any])
    }
  }
}
