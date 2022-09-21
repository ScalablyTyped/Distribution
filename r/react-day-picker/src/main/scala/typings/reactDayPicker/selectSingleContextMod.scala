package typings.reactDayPicker

import typings.react.mod.Context
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactDayPicker.dayPickerBaseMod.DayPickerBase
import typings.reactDayPicker.dayPickerSingleMod.DayPickerSingleProps
import typings.reactDayPicker.eventHandlersMod.DayClickEventHandler
import typings.reactDayPicker.typesModifiersMod.ActiveModifiers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectSingleContextMod {
  
  @JSImport("react-day-picker/dist/contexts/SelectSingle/SelectSingleContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-day-picker/dist/contexts/SelectSingle/SelectSingleContext", "SelectSingleContext")
  @js.native
  val SelectSingleContext: Context[js.UndefOr[SelectSingleContextValue]] = js.native
  
  inline def SelectSingleProvider(props: SelectSingleProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SelectSingleProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait SelectSingleProviderInternal extends StObject {
    
    var children: ReactNode
    
    var initialProps: DayPickerSingleProps
  }
  object SelectSingleProviderInternal {
    
    @JSImport("react-day-picker/dist/contexts/SelectSingle/SelectSingleContext", "SelectSingleProviderInternal")
    @js.native
    def apply(hasInitialPropsChildren: SelectSingleProviderInternal): Element = js.native
    
    extension [Self <: SelectSingleProviderInternal](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInitialProps(value: DayPickerSingleProps): Self = StObject.set(x, "initialProps", value.asInstanceOf[js.Any])
    }
  }
  
  trait SelectSingleContextValue extends StObject {
    
    /** Event handler to attach to the day button to enable the single select. */
    var onDayClick: js.UndefOr[DayClickEventHandler] = js.undefined
    
    /** The day that has been selected. */
    var selected: js.UndefOr[js.Date] = js.undefined
  }
  object SelectSingleContextValue {
    
    inline def apply(): SelectSingleContextValue = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectSingleContextValue]
    }
    
    extension [Self <: SelectSingleContextValue](x: Self) {
      
      inline def setOnDayClick(
        value: (/* day */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ MouseEvent[typings.std.Element, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onDayClick", js.Any.fromFunction3(value))
      
      inline def setOnDayClickUndefined: Self = StObject.set(x, "onDayClick", js.undefined)
      
      inline def setSelected(value: js.Date): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
  
  trait SelectSingleProviderProps extends StObject {
    
    var children: ReactNode
    
    var initialProps: DayPickerBase
  }
  object SelectSingleProviderProps {
    
    inline def apply(initialProps: DayPickerBase): SelectSingleProviderProps = {
      val __obj = js.Dynamic.literal(initialProps = initialProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectSingleProviderProps]
    }
    
    extension [Self <: SelectSingleProviderProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setInitialProps(value: DayPickerBase): Self = StObject.set(x, "initialProps", value.asInstanceOf[js.Any])
    }
  }
}
