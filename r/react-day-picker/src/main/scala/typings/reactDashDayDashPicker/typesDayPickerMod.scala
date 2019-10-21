package typings.reactDashDayDashPicker

import typings.react.reactMod.Component
import typings.reactDashDayDashPicker.typesDayPickerMod.DayPicker
import typings.reactDashDayDashPicker.typesPropsMod.DayPickerProps
import typings.std.Date
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-day-picker/types/DayPicker", JSImport.Namespace)
@js.native
object typesDayPickerMod extends js.Object {
  @js.native
  trait DayPicker
    extends Component[DayPickerProps, js.Any, js.Any] {
    val dayPicker: HTMLDivElement = js.native
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
    var DateUtils: Anon_AddDayToRange = js.native
    var DayModifiers: typings.reactDashDayDashPicker.typesCommonMod.DayModifiers = js.native
    var LocaleUtils: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any = js.native
    var Modifiers: typings.reactDashDayDashPicker.typesCommonMod.Modifiers = js.native
    var ModifiersUtils: Anon_Day = js.native
    var VERSION: String = js.native
  }
  
}

