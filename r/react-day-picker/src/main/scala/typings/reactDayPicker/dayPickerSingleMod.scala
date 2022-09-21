package typings.reactDayPicker

import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.reactDayPicker.dayPickerBaseMod.DayPickerBase
import typings.reactDayPicker.dayPickerContextMod.DayPickerContextValue
import typings.reactDayPicker.distDayPickerMod.DayPickerProps
import typings.reactDayPicker.eventHandlersMod.SelectSingleEventHandler
import typings.reactDayPicker.reactDayPickerStrings.single
import typings.reactDayPicker.typesModifiersMod.ActiveModifiers
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dayPickerSingleMod {
  
  @JSImport("react-day-picker/dist/types/DayPickerSingle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isDayPickerSingle(props: DayPickerContextValue): /* is react-day-picker.react-day-picker/dist/types/DayPickerSingle.DayPickerSingleProps */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDayPickerSingle")(props.asInstanceOf[js.Any]).asInstanceOf[/* is react-day-picker.react-day-picker/dist/types/DayPickerSingle.DayPickerSingleProps */ Boolean]
  inline def isDayPickerSingle(props: DayPickerProps): /* is react-day-picker.react-day-picker/dist/types/DayPickerSingle.DayPickerSingleProps */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDayPickerSingle")(props.asInstanceOf[js.Any]).asInstanceOf[/* is react-day-picker.react-day-picker/dist/types/DayPickerSingle.DayPickerSingleProps */ Boolean]
  
  trait DayPickerSingleProps
    extends StObject
       with DayPickerBase
       with DayPickerProps {
    
    var mode: single
    
    /** Event fired when a day is selected. */
    var onSelect: js.UndefOr[SelectSingleEventHandler] = js.undefined
    
    /** Make the selection required. */
    var required: js.UndefOr[Boolean] = js.undefined
    
    /** The selected day. */
    @JSName("selected")
    var selected_DayPickerSingleProps: js.UndefOr[js.Date] = js.undefined
  }
  object DayPickerSingleProps {
    
    inline def apply(): DayPickerSingleProps = {
      val __obj = js.Dynamic.literal(mode = "single")
      __obj.asInstanceOf[DayPickerSingleProps]
    }
    
    extension [Self <: DayPickerSingleProps](x: Self) {
      
      inline def setMode(value: single): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setOnSelect(
        value: (/* day */ js.UndefOr[js.Date], /* selectedDay */ js.Date, /* activeModifiers */ ActiveModifiers, /* e */ MouseEvent[Element, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onSelect", js.Any.fromFunction4(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setSelected(value: js.Date): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    }
  }
}
