package typings.reactBigCalendar.mod

import typings.dateArithmetic.mod.StartOfWeek
import typings.dateArithmetic.mod.Unit
import typings.propTypes.mod.Validator
import typings.reactBigCalendar.anon.FnCall
import typings.reactBigCalendar.anon.FnCallDateDate2Unit
import typings.reactBigCalendar.anon.FnCallDateUnitFirstOfWeek
import typings.reactBigCalendar.anon.FnCallDateValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DateLocalizerSpec extends StObject {
  
  var add: js.Function3[/* date */ js.Date, /* num */ Double, /* unit */ Unit, js.Date] = js.native
  
  def ceil(date: js.Date, unit: Unit): js.Date = js.native
  
  def continuesAfter(dateA: js.Date, dateB: js.Date, dateC: js.Date): Boolean = js.native
  
  def continuesPrior(dateA: js.Date, dateB: js.Date): Boolean = js.native
  
  def diff(dateA: js.Date, dateB: js.Date): Double = js.native
  def diff(dateA: js.Date, dateB: js.Date, unit: Unit): Double = js.native
  
  var endOf: FnCallDateUnitFirstOfWeek = js.native
  
  @JSName("eq")
  var eq_FDateLocalizerSpec: FnCallDateDate2Unit = js.native
  
  def firstOfWeek(culture: Culture): Double = js.native
  
  def firstVisibleDay(date: js.Date, localizer: Any): js.Date = js.native
  
  def format(value: FormatInput, format: String): String = js.native
  def format(value: FormatInput, format: String, culture: Culture): String = js.native
  
  var formats: Formats = js.native
  
  def getDstOffset(date: js.Date, dateB: js.Date): Double = js.native
  
  def getMinutesFromMidnight(date: js.Date): Double = js.native
  
  def getSlotDate(date: js.Date, minutesFromMidnight: Double, offset: Double): js.Date = js.native
  
  def getTimezoneOffset(date: js.Date): Double = js.native
  
  def getTotalMin(dateA: js.Date, dateB: js.Date): Double = js.native
  
  var gt: FnCallDateDate2Unit = js.native
  
  var gte: FnCallDateDate2Unit = js.native
  
  def inEventRange(event: Event, range: DateRange): Boolean = js.native
  
  var inRange: FnCall = js.native
  
  def isSameDate(dateA: js.Date, dateB: js.Date): Boolean = js.native
  
  def lastVisibleDay(date: js.Date, localizer: Any): js.Date = js.native
  
  var lt: FnCallDateDate2Unit = js.native
  
  var lte: FnCallDateDate2Unit = js.native
  
  var max: js.Function1[/* repeated */ js.Date, js.Date] = js.native
  
  def merge(date: js.Date, time: js.Date): js.Date | Null = js.native
  
  var min: js.Function1[/* repeated */ js.Date, js.Date] = js.native
  
  var minutes: FnCallDateValue = js.native
  
  var neq: FnCallDateDate2Unit = js.native
  
  var propType: js.UndefOr[Validator[Any]] = js.native
  
  def range(start: js.Date, end: js.Date): js.Array[js.Date] = js.native
  def range(start: js.Date, end: js.Date, unit: Unit): js.Array[js.Date] = js.native
  
  var segmentOffset: Double = js.native
  
  def sortEvents(eventA: Event, eventB: Event): Boolean = js.native
  
  def startAndEndAreDateOnly(dateA: js.Date, dateB: js.Date): Boolean = js.native
  
  var startOf: FnCallDateUnitFirstOfWeek = js.native
  
  var startOfWeek: StartOfWeek = js.native
  
  def visibleDays(date: js.Date, localizer: Any): js.Array[js.Date] = js.native
}
