package typings.reactDayPicker

import typings.react.mod.Component
import typings.reactDayPicker.propsMod.DayPickerProps
import typings.std.Date
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-day-picker/types/DayPicker", JSImport.Namespace)
@js.native
object dayPickerMod extends js.Object {
  @js.native
  trait DayPicker
    extends Component[DayPickerProps, js.Any, js.Any] {
    var dayPicker: HTMLDivElement = js.native
    def focus(): Unit = js.native
    def showMonth(month: Date): Unit = js.native
    def showNextMonth(): Unit = js.native
    def showNextYear(): Unit = js.native
    def showPreviousMonth(): Unit = js.native
    def showPreviousYear(): Unit = js.native
  }
  
  @js.native
  class default () extends DayPicker
  
  /* static members */
  @js.native
  object default extends js.Object {
    var DateUtils: typings.reactDayPicker.dateUtilsMod.DateUtils = js.native
    var DayModifiers: typings.reactDayPicker.modifiersMod.DayModifiers = js.native
    var LocaleUtils: typings.reactDayPicker.localeUtilsMod.LocaleUtils = js.native
    var Modifiers: typings.reactDayPicker.modifiersMod.Modifiers = js.native
    var ModifiersUtils: typings.reactDayPicker.modifiersMod.ModifiersUtils = js.native
    var VERSION: String = js.native
  }
  
}

