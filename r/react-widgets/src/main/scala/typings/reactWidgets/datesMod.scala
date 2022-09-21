package typings.reactWidgets

import typings.dateArithmetic.mod.StartOfWeek
import typings.dateArithmetic.mod.Unit
import typings.reactWidgets.reactWidgetsStrings.week
import typings.std.Exclude
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object datesMod {
  
  @JSImport("react-widgets/cjs/dates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined {readonly month (date : std.Date): number, readonly month (date : std.Date, value : number): std.Date, readonly max (dates : ...std.Date): std.Date, readonly seconds (date : std.Date): number, readonly seconds (date : std.Date, value : number): std.Date, readonly eq (date : std.Date, date2 : std.Date): boolean, readonly eq (date : std.Date, date2 : std.Date, unit : date-arithmetic.date-arithmetic.Unit): boolean, readonly date (date : std.Date): number, readonly date (date : std.Date, value : number): std.Date, readonly gte (date : std.Date, date2 : std.Date): boolean, readonly gte (date : std.Date, date2 : std.Date, unit : date-arithmetic.date-arithmetic.Unit): boolean, readonly inRange (day : std.Date, min : std.Date, max : std.Date): boolean, readonly inRange (day : std.Date, min : std.Date, max : std.Date, unit : date-arithmetic.date-arithmetic.Unit): boolean, readonly subtract (date : std.Date, num : number, unit : date-arithmetic.date-arithmetic.Unit): std.Date, readonly min (dates : ...std.Date): std.Date, readonly year (date : std.Date): number, readonly year (date : std.Date, value : number): std.Date, readonly neq (date : std.Date, date2 : std.Date): boolean, readonly neq (date : std.Date, date2 : std.Date, unit : date-arithmetic.date-arithmetic.Unit): boolean, readonly startOf (date : std.Date, unit : 'week', firstOfWeek : date-arithmetic.date-arithmetic.StartOfWeek): std.Date, readonly startOf (date : std.Date, unit : std.Exclude<date-arithmetic.date-arithmetic.Unit, 'week'>): std.Date, readonly milliseconds (date : std.Date): number, readonly milliseconds (date : std.Date, value : number): std.Date, readonly lt (date : std.Date, date2 : std.Date): boolean, readonly lt (date : std.Date, date2 : std.Date, unit : date-arithmetic.date-arithmetic.Unit): boolean, readonly weekday (date : std.Date, value : std.Date): number, readonly weekday (date : std.Date, value : std.Date, firstOfWeek : date-arithmetic.date-arithmetic.StartOfWeek): std.Date, readonly minutes (date : std.Date): number, readonly minutes (date : std.Date, value : number): std.Date, readonly day (date : std.Date): number, readonly day (date : std.Date, value : number): std.Date, readonly diff (date1 : std.Date, date2 : std.Date, unit : date-arithmetic.date-arithmetic.Unit): number, readonly diff (date1 : std.Date, date2 : std.Date, unit : date-arithmetic.date-arithmetic.Unit, asFloat : boolean): number, readonly hours (date : std.Date): number, readonly hours (date : std.Date, value : number): std.Date, readonly endOf (date : std.Date, unit : 'week', firstOfWeek : date-arithmetic.date-arithmetic.StartOfWeek): std.Date, readonly endOf (date : std.Date, unit : std.Exclude<date-arithmetic.date-arithmetic.Unit, 'week'>): std.Date, readonly decade (date : std.Date): number, readonly decade (date : std.Date, value : number): std.Date, readonly lte (date : std.Date, date2 : std.Date): boolean, readonly lte (date : std.Date, date2 : std.Date, unit : date-arithmetic.date-arithmetic.Unit): boolean, readonly add (date : std.Date, num : number, unit : date-arithmetic.date-arithmetic.Unit): std.Date, readonly gt (date : std.Date, date2 : std.Date): boolean, readonly gt (date : std.Date, date2 : std.Date, unit : date-arithmetic.date-arithmetic.Unit): boolean, readonly century (date : std.Date): number, readonly century (date : std.Date, value : number): std.Date} & {merge (date : std.Date | null | undefined, time : std.Date | null | undefined, defaultDate : std.Date | undefined): std.Date | null} */
  object default {
    
    @JSImport("react-widgets/cjs/dates", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def add(date: js.Date, num: Double, unit: Unit): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("add")(date.asInstanceOf[js.Any], num.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    inline def century(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("century")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def century(date: js.Date, value: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("century")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    inline def date(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("date")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def date(date: js.Date, value: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("date")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    inline def day(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("day")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def day(date: js.Date, value: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("day")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    inline def decade(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("decade")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def decade(date: js.Date, value: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("decade")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    inline def diff(date1: js.Date, date2: js.Date, unit: Unit): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def diff(date1: js.Date, date2: js.Date, unit: Unit, asFloat: Boolean): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("diff")(date1.asInstanceOf[js.Any], date2.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], asFloat.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def endOf_week(date: js.Date, unit: week, firstOfWeek: StartOfWeek): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("endOf")(date.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], firstOfWeek.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    inline def endOf_week(date: js.Date, unit: Exclude[Unit, week]): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("endOf")(date.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    inline def eq_(date: js.Date, date2: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eq")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def eq_(date: js.Date, date2: js.Date, unit: Unit): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("eq")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def gt(date: js.Date, date2: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gt")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def gt(date: js.Date, date2: js.Date, unit: Unit): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gt")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def gte(date: js.Date, date2: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gte")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def gte(date: js.Date, date2: js.Date, unit: Unit): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("gte")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def hours(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("hours")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def hours(date: js.Date, value: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("hours")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    inline def inRange(day: js.Date, min: js.Date, max: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inRange")(day.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def inRange(day: js.Date, min: js.Date, max: js.Date, unit: Unit): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("inRange")(day.asInstanceOf[js.Any], min.asInstanceOf[js.Any], max.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def lt(date: js.Date, date2: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lt")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def lt(date: js.Date, date2: js.Date, unit: Unit): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lt")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def lte(date: js.Date, date2: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lte")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def lte(date: js.Date, date2: js.Date, unit: Unit): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lte")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def max(dates: js.Date*): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("max")(dates.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Date]
    
    inline def merge(): js.Date | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")().asInstanceOf[js.Date | Null]
    inline def merge(date: js.Date): js.Date | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(date.asInstanceOf[js.Any]).asInstanceOf[js.Date | Null]
    inline def merge(date: js.Date, time: js.Date): js.Date | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[js.Date | Null]
    inline def merge(date: js.Date, time: js.Date, defaultDate: js.Date): js.Date | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any], defaultDate.asInstanceOf[js.Any])).asInstanceOf[js.Date | Null]
    inline def merge(date: js.Date, time: Null, defaultDate: js.Date): js.Date | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any], defaultDate.asInstanceOf[js.Any])).asInstanceOf[js.Date | Null]
    inline def merge(date: js.Date, time: scala.Unit, defaultDate: js.Date): js.Date | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any], defaultDate.asInstanceOf[js.Any])).asInstanceOf[js.Date | Null]
    inline def merge(date: Null, time: js.Date): js.Date | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[js.Date | Null]
    inline def merge(date: Null, time: js.Date, defaultDate: js.Date): js.Date | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any], defaultDate.asInstanceOf[js.Any])).asInstanceOf[js.Date | Null]
    inline def merge(date: Null, time: Null, defaultDate: js.Date): js.Date | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any], defaultDate.asInstanceOf[js.Any])).asInstanceOf[js.Date | Null]
    inline def merge(date: Null, time: scala.Unit, defaultDate: js.Date): js.Date | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any], defaultDate.asInstanceOf[js.Any])).asInstanceOf[js.Date | Null]
    inline def merge(date: scala.Unit, time: js.Date): js.Date | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any])).asInstanceOf[js.Date | Null]
    inline def merge(date: scala.Unit, time: js.Date, defaultDate: js.Date): js.Date | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any], defaultDate.asInstanceOf[js.Any])).asInstanceOf[js.Date | Null]
    inline def merge(date: scala.Unit, time: Null, defaultDate: js.Date): js.Date | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any], defaultDate.asInstanceOf[js.Any])).asInstanceOf[js.Date | Null]
    inline def merge(date: scala.Unit, time: scala.Unit, defaultDate: js.Date): js.Date | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(date.asInstanceOf[js.Any], time.asInstanceOf[js.Any], defaultDate.asInstanceOf[js.Any])).asInstanceOf[js.Date | Null]
    
    inline def milliseconds(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("milliseconds")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def milliseconds(date: js.Date, value: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("milliseconds")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    inline def min(dates: js.Date*): js.Date = ^.asInstanceOf[js.Dynamic].applyDynamic("min")(dates.asInstanceOf[Seq[js.Any]]*).asInstanceOf[js.Date]
    
    inline def minutes(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("minutes")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def minutes(date: js.Date, value: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("minutes")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    inline def month(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("month")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def month(date: js.Date, value: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("month")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    inline def neq(date: js.Date, date2: js.Date): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("neq")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def neq(date: js.Date, date2: js.Date, unit: Unit): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("neq")(date.asInstanceOf[js.Any], date2.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def seconds(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("seconds")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def seconds(date: js.Date, value: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("seconds")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    inline def startOf_week(date: js.Date, unit: week, firstOfWeek: StartOfWeek): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("startOf")(date.asInstanceOf[js.Any], unit.asInstanceOf[js.Any], firstOfWeek.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    inline def startOf_week(date: js.Date, unit: Exclude[Unit, week]): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("startOf")(date.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    inline def subtract(date: js.Date, num: Double, unit: Unit): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("subtract")(date.asInstanceOf[js.Any], num.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    inline def weekday(date: js.Date, value: js.Date): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("weekday")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def weekday(date: js.Date, value: js.Date, firstOfWeek: StartOfWeek): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("weekday")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any], firstOfWeek.asInstanceOf[js.Any])).asInstanceOf[js.Date]
    
    inline def year(date: js.Date): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("year")(date.asInstanceOf[js.Any]).asInstanceOf[Double]
    inline def year(date: js.Date, value: Double): js.Date = (^.asInstanceOf[js.Dynamic].applyDynamic("year")(date.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Date]
  }
  
  @JSImport("react-widgets/cjs/dates", "isNullOrInvalid")
  @js.native
  def isNullOrInvalid: js.Function1[/* dte */ js.UndefOr[js.Date | Null], Boolean] = js.native
  inline def isNullOrInvalid_=(x: js.Function1[/* dte */ js.UndefOr[js.Date | Null], Boolean]): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isNullOrInvalid")(x.asInstanceOf[js.Any])
}
