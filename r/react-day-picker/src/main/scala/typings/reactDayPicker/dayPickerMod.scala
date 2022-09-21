package typings.reactDayPicker

import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import typings.reactDayPicker.dayPickerContextMod.DayPickerContextValue
import typings.reactDayPicker.dayPickerContextMod.DayPickerProviderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dayPickerMod {
  
  @JSImport("react-day-picker/dist/contexts/DayPicker", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-day-picker/dist/contexts/DayPicker", "DayPickerContext")
  @js.native
  val DayPickerContext: Context[js.UndefOr[DayPickerContextValue]] = js.native
  
  inline def DayPickerProvider(props: DayPickerProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("DayPickerProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def useDayPicker(): DayPickerContextValue = ^.asInstanceOf[js.Dynamic].applyDynamic("useDayPicker")().asInstanceOf[DayPickerContextValue]
}
