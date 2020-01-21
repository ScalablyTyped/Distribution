package typings.reactDayPicker

import typings.reactDayPicker.commonMod.Modifier
import typings.reactDayPicker.commonMod.RangeModifier
import typings.std.Date
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-day-picker", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class default ()
    extends typings.reactDayPicker.dayPickerMod.default
  
  @js.native
  object DateUtils extends js.Object {
    def addDayToRange(day: Date, range: RangeModifier): RangeModifier = js.native
    def addMonths(d: Date, n: Double): Date = js.native
    def clone(d: Date): Date = js.native
    def isDate(d: Date): Boolean = js.native
    def isDayAfter(day1: Date, day2: Date): Boolean = js.native
    def isDayBefore(day1: Date, day2: Date): Boolean = js.native
    def isDayBetween(day: Date, begin: Date, end: Date): Boolean = js.native
    def isDayInRange(day: Date, range: RangeModifier): Boolean = js.native
    def isFutureDay(day: Date): Boolean = js.native
    def isPastDay(day: Date): Boolean = js.native
    def isSameDay(day1: Date, day2: Date): Boolean = js.native
    def isSameMonth(day1: Date, day2: Date): Boolean = js.native
  }
  
  @js.native
  object ModifiersUtils extends js.Object {
    def dayMatchesModifier(day: Date): Boolean = js.native
    def dayMatchesModifier(day: Date, modifier: js.Array[Modifier]): Boolean = js.native
    def dayMatchesModifier(day: Date, modifier: Modifier): Boolean = js.native
    def getModifiersForDay(day: Date, modifiers: Record[String, Modifier | js.Array[Modifier]]): js.Array[String] = js.native
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var DateUtils: AnonAddDayToRange = js.native
    var DayModifiers: typings.reactDayPicker.commonMod.DayModifiers = js.native
    var LocaleUtils: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LocaleUtils */ js.Any = js.native
    var Modifiers: typings.reactDayPicker.commonMod.Modifiers = js.native
    var ModifiersUtils: AnonDay = js.native
    var VERSION: String = js.native
  }
  
}

