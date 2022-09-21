package typings.reactDayPicker

import typings.react.mod.global.JSX.Element
import typings.reactDayPicker.dayPickerDefaultMod.DayPickerDefaultProps
import typings.reactDayPicker.dayPickerMultipleMod.DayPickerMultipleProps
import typings.reactDayPicker.dayPickerRangeMod.DayPickerRangeProps
import typings.reactDayPicker.dayPickerSingleMod.DayPickerSingleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDayPickerMod {
  
  @JSImport("react-day-picker/dist/DayPicker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DayPicker(props: DayPickerDefaultProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DayPicker")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  inline def DayPicker(props: DayPickerMultipleProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DayPicker")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  inline def DayPicker(props: DayPickerRangeProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DayPicker")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  inline def DayPicker(props: DayPickerSingleProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DayPicker")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactDayPicker.dayPickerDefaultMod.DayPickerDefaultProps
    - typings.reactDayPicker.dayPickerSingleMod.DayPickerSingleProps
    - typings.reactDayPicker.dayPickerMultipleMod.DayPickerMultipleProps
    - typings.reactDayPicker.dayPickerRangeMod.DayPickerRangeProps
  */
  trait DayPickerProps extends StObject
  object DayPickerProps {
    
    inline def DayPickerDefaultProps(): typings.reactDayPicker.dayPickerDefaultMod.DayPickerDefaultProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.reactDayPicker.dayPickerDefaultMod.DayPickerDefaultProps]
    }
    
    inline def DayPickerMultipleProps(): typings.reactDayPicker.dayPickerMultipleMod.DayPickerMultipleProps = {
      val __obj = js.Dynamic.literal(mode = "multiple")
      __obj.asInstanceOf[typings.reactDayPicker.dayPickerMultipleMod.DayPickerMultipleProps]
    }
    
    inline def DayPickerRangeProps(): typings.reactDayPicker.dayPickerRangeMod.DayPickerRangeProps = {
      val __obj = js.Dynamic.literal(mode = "range")
      __obj.asInstanceOf[typings.reactDayPicker.dayPickerRangeMod.DayPickerRangeProps]
    }
    
    inline def DayPickerSingleProps(): typings.reactDayPicker.dayPickerSingleMod.DayPickerSingleProps = {
      val __obj = js.Dynamic.literal(mode = "single")
      __obj.asInstanceOf[typings.reactDayPicker.dayPickerSingleMod.DayPickerSingleProps]
    }
  }
}
