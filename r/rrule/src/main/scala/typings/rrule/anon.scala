package typings.rrule

import typings.rrule.rruleStrings.FR
import typings.rrule.rruleStrings.MO
import typings.rrule.rruleStrings.SA
import typings.rrule.rruleStrings.SU
import typings.rrule.rruleStrings.TH
import typings.rrule.rruleStrings.TU
import typings.rrule.rruleStrings.WE
import typings.rrule.typesMod.ByWeekday
import typings.rrule.typesMod.Frequency
import typings.rrule.weekdayMod.Weekday
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Byeaster extends StObject {
    
    var byeaster: js.UndefOr[Double | Null] = js.undefined
    
    var byhour: js.UndefOr[Double | js.Array[Double] | Null] = js.undefined
    
    var byminute: js.UndefOr[Double | js.Array[Double] | Null] = js.undefined
    
    var bymonth: js.UndefOr[Double | js.Array[Double] | Null] = js.undefined
    
    var bymonthday: js.UndefOr[Double | js.Array[Double] | Null] = js.undefined
    
    var bynmonthday: js.UndefOr[js.Array[Double] | Null] = js.undefined
    
    var bynweekday: js.UndefOr[js.Array[js.Array[Double]] | Null] = js.undefined
    
    var bysecond: js.UndefOr[Double | js.Array[Double] | Null] = js.undefined
    
    var bysetpos: js.UndefOr[Double | js.Array[Double] | Null] = js.undefined
    
    var byweekday: js.UndefOr[Double | Weekday | MO | TU | WE | TH | FR | SA | SU | js.Array[ByWeekday] | Null] = js.undefined
    
    var byweekno: js.UndefOr[Double | js.Array[Double] | Null] = js.undefined
    
    var byyearday: js.UndefOr[Double | js.Array[Double] | Null] = js.undefined
    
    var count: js.UndefOr[Double | Null] = js.undefined
    
    var dtstart: js.UndefOr[Date | Null] = js.undefined
    
    var freq: js.UndefOr[Frequency] = js.undefined
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var tzid: js.UndefOr[String | Null] = js.undefined
    
    var until: js.UndefOr[Date | Null] = js.undefined
    
    var wkst: js.UndefOr[Double | Weekday | Null] = js.undefined
  }
  object Byeaster {
    
    @scala.inline
    def apply(): Byeaster = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Byeaster]
    }
    
    @scala.inline
    implicit class ByeasterMutableBuilder[Self <: Byeaster] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setByeaster(value: Double): Self = StObject.set(x, "byeaster", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByeasterNull: Self = StObject.set(x, "byeaster", null)
      
      @scala.inline
      def setByeasterUndefined: Self = StObject.set(x, "byeaster", js.undefined)
      
      @scala.inline
      def setByhour(value: Double | js.Array[Double]): Self = StObject.set(x, "byhour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByhourNull: Self = StObject.set(x, "byhour", null)
      
      @scala.inline
      def setByhourUndefined: Self = StObject.set(x, "byhour", js.undefined)
      
      @scala.inline
      def setByhourVarargs(value: Double*): Self = StObject.set(x, "byhour", js.Array(value :_*))
      
      @scala.inline
      def setByminute(value: Double | js.Array[Double]): Self = StObject.set(x, "byminute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByminuteNull: Self = StObject.set(x, "byminute", null)
      
      @scala.inline
      def setByminuteUndefined: Self = StObject.set(x, "byminute", js.undefined)
      
      @scala.inline
      def setByminuteVarargs(value: Double*): Self = StObject.set(x, "byminute", js.Array(value :_*))
      
      @scala.inline
      def setBymonth(value: Double | js.Array[Double]): Self = StObject.set(x, "bymonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBymonthNull: Self = StObject.set(x, "bymonth", null)
      
      @scala.inline
      def setBymonthUndefined: Self = StObject.set(x, "bymonth", js.undefined)
      
      @scala.inline
      def setBymonthVarargs(value: Double*): Self = StObject.set(x, "bymonth", js.Array(value :_*))
      
      @scala.inline
      def setBymonthday(value: Double | js.Array[Double]): Self = StObject.set(x, "bymonthday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBymonthdayNull: Self = StObject.set(x, "bymonthday", null)
      
      @scala.inline
      def setBymonthdayUndefined: Self = StObject.set(x, "bymonthday", js.undefined)
      
      @scala.inline
      def setBymonthdayVarargs(value: Double*): Self = StObject.set(x, "bymonthday", js.Array(value :_*))
      
      @scala.inline
      def setBynmonthday(value: js.Array[Double]): Self = StObject.set(x, "bynmonthday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBynmonthdayNull: Self = StObject.set(x, "bynmonthday", null)
      
      @scala.inline
      def setBynmonthdayUndefined: Self = StObject.set(x, "bynmonthday", js.undefined)
      
      @scala.inline
      def setBynmonthdayVarargs(value: Double*): Self = StObject.set(x, "bynmonthday", js.Array(value :_*))
      
      @scala.inline
      def setBynweekday(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "bynweekday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBynweekdayNull: Self = StObject.set(x, "bynweekday", null)
      
      @scala.inline
      def setBynweekdayUndefined: Self = StObject.set(x, "bynweekday", js.undefined)
      
      @scala.inline
      def setBynweekdayVarargs(value: js.Array[Double]*): Self = StObject.set(x, "bynweekday", js.Array(value :_*))
      
      @scala.inline
      def setBysecond(value: Double | js.Array[Double]): Self = StObject.set(x, "bysecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBysecondNull: Self = StObject.set(x, "bysecond", null)
      
      @scala.inline
      def setBysecondUndefined: Self = StObject.set(x, "bysecond", js.undefined)
      
      @scala.inline
      def setBysecondVarargs(value: Double*): Self = StObject.set(x, "bysecond", js.Array(value :_*))
      
      @scala.inline
      def setBysetpos(value: Double | js.Array[Double]): Self = StObject.set(x, "bysetpos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBysetposNull: Self = StObject.set(x, "bysetpos", null)
      
      @scala.inline
      def setBysetposUndefined: Self = StObject.set(x, "bysetpos", js.undefined)
      
      @scala.inline
      def setBysetposVarargs(value: Double*): Self = StObject.set(x, "bysetpos", js.Array(value :_*))
      
      @scala.inline
      def setByweekday(value: Double | Weekday | MO | TU | WE | TH | FR | SA | SU | js.Array[ByWeekday]): Self = StObject.set(x, "byweekday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByweekdayNull: Self = StObject.set(x, "byweekday", null)
      
      @scala.inline
      def setByweekdayUndefined: Self = StObject.set(x, "byweekday", js.undefined)
      
      @scala.inline
      def setByweekdayVarargs(value: ByWeekday*): Self = StObject.set(x, "byweekday", js.Array(value :_*))
      
      @scala.inline
      def setByweekno(value: Double | js.Array[Double]): Self = StObject.set(x, "byweekno", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByweeknoNull: Self = StObject.set(x, "byweekno", null)
      
      @scala.inline
      def setByweeknoUndefined: Self = StObject.set(x, "byweekno", js.undefined)
      
      @scala.inline
      def setByweeknoVarargs(value: Double*): Self = StObject.set(x, "byweekno", js.Array(value :_*))
      
      @scala.inline
      def setByyearday(value: Double | js.Array[Double]): Self = StObject.set(x, "byyearday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByyeardayNull: Self = StObject.set(x, "byyearday", null)
      
      @scala.inline
      def setByyeardayUndefined: Self = StObject.set(x, "byyearday", js.undefined)
      
      @scala.inline
      def setByyeardayVarargs(value: Double*): Self = StObject.set(x, "byyearday", js.Array(value :_*))
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountNull: Self = StObject.set(x, "count", null)
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setDtstart(value: Date): Self = StObject.set(x, "dtstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDtstartNull: Self = StObject.set(x, "dtstart", null)
      
      @scala.inline
      def setDtstartUndefined: Self = StObject.set(x, "dtstart", js.undefined)
      
      @scala.inline
      def setFreq(value: Frequency): Self = StObject.set(x, "freq", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreqUndefined: Self = StObject.set(x, "freq", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setTzid(value: String): Self = StObject.set(x, "tzid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTzidNull: Self = StObject.set(x, "tzid", null)
      
      @scala.inline
      def setTzidUndefined: Self = StObject.set(x, "tzid", js.undefined)
      
      @scala.inline
      def setUntil(value: Date): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUntilNull: Self = StObject.set(x, "until", null)
      
      @scala.inline
      def setUntilUndefined: Self = StObject.set(x, "until", js.undefined)
      
      @scala.inline
      def setWkst(value: Double | Weekday): Self = StObject.set(x, "wkst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWkstNull: Self = StObject.set(x, "wkst", null)
      
      @scala.inline
      def setWkstUndefined: Self = StObject.set(x, "wkst", js.undefined)
    }
  }
  
  trait Div extends StObject {
    
    var div: Double
    
    var mod: Double
  }
  object Div {
    
    @scala.inline
    def apply(div: Double, mod: Double): Div = {
      val __obj = js.Dynamic.literal(div = div.asInstanceOf[js.Any], mod = mod.asInstanceOf[js.Any])
      __obj.asInstanceOf[Div]
    }
    
    @scala.inline
    implicit class DivMutableBuilder[Self <: Div] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDiv(value: Double): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMod(value: Double): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dtstart extends StObject {
    
    var dtstart: js.UndefOr[Date | Null] = js.undefined
    
    var exdatevals: js.Array[Date]
    
    var exrulevals: js.Array[PartialOptions]
    
    var rdatevals: js.Array[Date]
    
    var rrulevals: js.Array[PartialOptions]
    
    var tzid: js.UndefOr[String | Null] = js.undefined
  }
  object Dtstart {
    
    @scala.inline
    def apply(
      exdatevals: js.Array[Date],
      exrulevals: js.Array[PartialOptions],
      rdatevals: js.Array[Date],
      rrulevals: js.Array[PartialOptions]
    ): Dtstart = {
      val __obj = js.Dynamic.literal(exdatevals = exdatevals.asInstanceOf[js.Any], exrulevals = exrulevals.asInstanceOf[js.Any], rdatevals = rdatevals.asInstanceOf[js.Any], rrulevals = rrulevals.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dtstart]
    }
    
    @scala.inline
    implicit class DtstartMutableBuilder[Self <: Dtstart] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDtstart(value: Date): Self = StObject.set(x, "dtstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDtstartNull: Self = StObject.set(x, "dtstart", null)
      
      @scala.inline
      def setDtstartUndefined: Self = StObject.set(x, "dtstart", js.undefined)
      
      @scala.inline
      def setExdatevals(value: js.Array[Date]): Self = StObject.set(x, "exdatevals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExdatevalsVarargs(value: Date*): Self = StObject.set(x, "exdatevals", js.Array(value :_*))
      
      @scala.inline
      def setExrulevals(value: js.Array[PartialOptions]): Self = StObject.set(x, "exrulevals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExrulevalsVarargs(value: PartialOptions*): Self = StObject.set(x, "exrulevals", js.Array(value :_*))
      
      @scala.inline
      def setRdatevals(value: js.Array[Date]): Self = StObject.set(x, "rdatevals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRdatevalsVarargs(value: Date*): Self = StObject.set(x, "rdatevals", js.Array(value :_*))
      
      @scala.inline
      def setRrulevals(value: js.Array[PartialOptions]): Self = StObject.set(x, "rrulevals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRrulevalsVarargs(value: PartialOptions*): Self = StObject.set(x, "rrulevals", js.Array(value :_*))
      
      @scala.inline
      def setTzid(value: String): Self = StObject.set(x, "tzid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTzidNull: Self = StObject.set(x, "tzid", null)
      
      @scala.inline
      def setTzidUndefined: Self = StObject.set(x, "tzid", js.undefined)
    }
  }
  
  trait ParsedOptions extends StObject {
    
    var parsedOptions: typings.rrule.typesMod.ParsedOptions
  }
  object ParsedOptions {
    
    @scala.inline
    def apply(parsedOptions: typings.rrule.typesMod.ParsedOptions): ParsedOptions = {
      val __obj = js.Dynamic.literal(parsedOptions = parsedOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedOptions]
    }
    
    @scala.inline
    implicit class ParsedOptionsMutableBuilder[Self <: ParsedOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParsedOptions(value: typings.rrule.typesMod.ParsedOptions): Self = StObject.set(x, "parsedOptions", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<rrule.rrule/dist/esm/src/iterresult.IterArgs> */
  trait PartialIterArgs extends StObject {
    
    var _value: js.UndefOr[Date | js.Array[Date] | Null] = js.undefined
    
    var after: js.UndefOr[Date] = js.undefined
    
    var before: js.UndefOr[Date] = js.undefined
    
    var dt: js.UndefOr[Date] = js.undefined
    
    var inc: js.UndefOr[Boolean] = js.undefined
  }
  object PartialIterArgs {
    
    @scala.inline
    def apply(): PartialIterArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIterArgs]
    }
    
    @scala.inline
    implicit class PartialIterArgsMutableBuilder[Self <: PartialIterArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(value: Date): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      @scala.inline
      def setBefore(value: Date): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      @scala.inline
      def setDt(value: Date): Self = StObject.set(x, "dt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDtUndefined: Self = StObject.set(x, "dt", js.undefined)
      
      @scala.inline
      def setInc(value: Boolean): Self = StObject.set(x, "inc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncUndefined: Self = StObject.set(x, "inc", js.undefined)
      
      @scala.inline
      def set_value(value: Date | js.Array[Date]): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_valueNull: Self = StObject.set(x, "_value", null)
      
      @scala.inline
      def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
      
      @scala.inline
      def set_valueVarargs(value: Date*): Self = StObject.set(x, "_value", js.Array(value :_*))
    }
  }
  
  /* Inlined std.Partial<rrule.rrule/dist/esm/src/types.Options> */
  trait PartialOptions extends StObject {
    
    var byeaster: js.UndefOr[Double | Null] = js.undefined
    
    var byhour: js.UndefOr[Double | js.Array[Double] | Null] = js.undefined
    
    var byminute: js.UndefOr[Double | js.Array[Double] | Null] = js.undefined
    
    var bymonth: js.UndefOr[Double | js.Array[Double] | Null] = js.undefined
    
    var bymonthday: js.UndefOr[Double | js.Array[Double] | Null] = js.undefined
    
    var bynmonthday: js.UndefOr[js.Array[Double] | Null] = js.undefined
    
    var bynweekday: js.UndefOr[js.Array[js.Array[Double]] | Null] = js.undefined
    
    var bysecond: js.UndefOr[Double | js.Array[Double] | Null] = js.undefined
    
    var bysetpos: js.UndefOr[Double | js.Array[Double] | Null] = js.undefined
    
    var byweekday: js.UndefOr[ByWeekday | js.Array[ByWeekday] | Null] = js.undefined
    
    var byweekno: js.UndefOr[Double | js.Array[Double] | Null] = js.undefined
    
    var byyearday: js.UndefOr[Double | js.Array[Double] | Null] = js.undefined
    
    var count: js.UndefOr[Double | Null] = js.undefined
    
    var dtstart: js.UndefOr[Date | Null] = js.undefined
    
    var freq: js.UndefOr[Frequency] = js.undefined
    
    var interval: js.UndefOr[Double] = js.undefined
    
    var tzid: js.UndefOr[String | Null] = js.undefined
    
    var until: js.UndefOr[Date | Null] = js.undefined
    
    var wkst: js.UndefOr[Weekday | Double | Null] = js.undefined
  }
  object PartialOptions {
    
    @scala.inline
    def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    @scala.inline
    implicit class PartialOptionsMutableBuilder[Self <: PartialOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setByeaster(value: Double): Self = StObject.set(x, "byeaster", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByeasterNull: Self = StObject.set(x, "byeaster", null)
      
      @scala.inline
      def setByeasterUndefined: Self = StObject.set(x, "byeaster", js.undefined)
      
      @scala.inline
      def setByhour(value: Double | js.Array[Double]): Self = StObject.set(x, "byhour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByhourNull: Self = StObject.set(x, "byhour", null)
      
      @scala.inline
      def setByhourUndefined: Self = StObject.set(x, "byhour", js.undefined)
      
      @scala.inline
      def setByhourVarargs(value: Double*): Self = StObject.set(x, "byhour", js.Array(value :_*))
      
      @scala.inline
      def setByminute(value: Double | js.Array[Double]): Self = StObject.set(x, "byminute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByminuteNull: Self = StObject.set(x, "byminute", null)
      
      @scala.inline
      def setByminuteUndefined: Self = StObject.set(x, "byminute", js.undefined)
      
      @scala.inline
      def setByminuteVarargs(value: Double*): Self = StObject.set(x, "byminute", js.Array(value :_*))
      
      @scala.inline
      def setBymonth(value: Double | js.Array[Double]): Self = StObject.set(x, "bymonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBymonthNull: Self = StObject.set(x, "bymonth", null)
      
      @scala.inline
      def setBymonthUndefined: Self = StObject.set(x, "bymonth", js.undefined)
      
      @scala.inline
      def setBymonthVarargs(value: Double*): Self = StObject.set(x, "bymonth", js.Array(value :_*))
      
      @scala.inline
      def setBymonthday(value: Double | js.Array[Double]): Self = StObject.set(x, "bymonthday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBymonthdayNull: Self = StObject.set(x, "bymonthday", null)
      
      @scala.inline
      def setBymonthdayUndefined: Self = StObject.set(x, "bymonthday", js.undefined)
      
      @scala.inline
      def setBymonthdayVarargs(value: Double*): Self = StObject.set(x, "bymonthday", js.Array(value :_*))
      
      @scala.inline
      def setBynmonthday(value: js.Array[Double]): Self = StObject.set(x, "bynmonthday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBynmonthdayNull: Self = StObject.set(x, "bynmonthday", null)
      
      @scala.inline
      def setBynmonthdayUndefined: Self = StObject.set(x, "bynmonthday", js.undefined)
      
      @scala.inline
      def setBynmonthdayVarargs(value: Double*): Self = StObject.set(x, "bynmonthday", js.Array(value :_*))
      
      @scala.inline
      def setBynweekday(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "bynweekday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBynweekdayNull: Self = StObject.set(x, "bynweekday", null)
      
      @scala.inline
      def setBynweekdayUndefined: Self = StObject.set(x, "bynweekday", js.undefined)
      
      @scala.inline
      def setBynweekdayVarargs(value: js.Array[Double]*): Self = StObject.set(x, "bynweekday", js.Array(value :_*))
      
      @scala.inline
      def setBysecond(value: Double | js.Array[Double]): Self = StObject.set(x, "bysecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBysecondNull: Self = StObject.set(x, "bysecond", null)
      
      @scala.inline
      def setBysecondUndefined: Self = StObject.set(x, "bysecond", js.undefined)
      
      @scala.inline
      def setBysecondVarargs(value: Double*): Self = StObject.set(x, "bysecond", js.Array(value :_*))
      
      @scala.inline
      def setBysetpos(value: Double | js.Array[Double]): Self = StObject.set(x, "bysetpos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBysetposNull: Self = StObject.set(x, "bysetpos", null)
      
      @scala.inline
      def setBysetposUndefined: Self = StObject.set(x, "bysetpos", js.undefined)
      
      @scala.inline
      def setBysetposVarargs(value: Double*): Self = StObject.set(x, "bysetpos", js.Array(value :_*))
      
      @scala.inline
      def setByweekday(value: ByWeekday | js.Array[ByWeekday]): Self = StObject.set(x, "byweekday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByweekdayNull: Self = StObject.set(x, "byweekday", null)
      
      @scala.inline
      def setByweekdayUndefined: Self = StObject.set(x, "byweekday", js.undefined)
      
      @scala.inline
      def setByweekdayVarargs(value: ByWeekday*): Self = StObject.set(x, "byweekday", js.Array(value :_*))
      
      @scala.inline
      def setByweekno(value: Double | js.Array[Double]): Self = StObject.set(x, "byweekno", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByweeknoNull: Self = StObject.set(x, "byweekno", null)
      
      @scala.inline
      def setByweeknoUndefined: Self = StObject.set(x, "byweekno", js.undefined)
      
      @scala.inline
      def setByweeknoVarargs(value: Double*): Self = StObject.set(x, "byweekno", js.Array(value :_*))
      
      @scala.inline
      def setByyearday(value: Double | js.Array[Double]): Self = StObject.set(x, "byyearday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByyeardayNull: Self = StObject.set(x, "byyearday", null)
      
      @scala.inline
      def setByyeardayUndefined: Self = StObject.set(x, "byyearday", js.undefined)
      
      @scala.inline
      def setByyeardayVarargs(value: Double*): Self = StObject.set(x, "byyearday", js.Array(value :_*))
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountNull: Self = StObject.set(x, "count", null)
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setDtstart(value: Date): Self = StObject.set(x, "dtstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDtstartNull: Self = StObject.set(x, "dtstart", null)
      
      @scala.inline
      def setDtstartUndefined: Self = StObject.set(x, "dtstart", js.undefined)
      
      @scala.inline
      def setFreq(value: Frequency): Self = StObject.set(x, "freq", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFreqUndefined: Self = StObject.set(x, "freq", js.undefined)
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      @scala.inline
      def setTzid(value: String): Self = StObject.set(x, "tzid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTzidNull: Self = StObject.set(x, "tzid", null)
      
      @scala.inline
      def setTzidUndefined: Self = StObject.set(x, "tzid", js.undefined)
      
      @scala.inline
      def setUntil(value: Date): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUntilNull: Self = StObject.set(x, "until", null)
      
      @scala.inline
      def setUntilUndefined: Self = StObject.set(x, "until", js.undefined)
      
      @scala.inline
      def setWkst(value: Weekday | Double): Self = StObject.set(x, "wkst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWkstNull: Self = StObject.set(x, "wkst", null)
      
      @scala.inline
      def setWkstUndefined: Self = StObject.set(x, "wkst", js.undefined)
    }
  }
  
  /* Inlined std.Partial<rrule.rrule/dist/esm/src/rrulestr.RRuleStrOptions> */
  trait PartialRRuleStrOptions extends StObject {
    
    var cache: js.UndefOr[Boolean] = js.undefined
    
    var compatible: js.UndefOr[Boolean] = js.undefined
    
    var dtstart: js.UndefOr[Date | Null] = js.undefined
    
    var forceset: js.UndefOr[Boolean] = js.undefined
    
    var tzid: js.UndefOr[String | Null] = js.undefined
    
    var unfold: js.UndefOr[Boolean] = js.undefined
  }
  object PartialRRuleStrOptions {
    
    @scala.inline
    def apply(): PartialRRuleStrOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRRuleStrOptions]
    }
    
    @scala.inline
    implicit class PartialRRuleStrOptionsMutableBuilder[Self <: PartialRRuleStrOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setCompatible(value: Boolean): Self = StObject.set(x, "compatible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompatibleUndefined: Self = StObject.set(x, "compatible", js.undefined)
      
      @scala.inline
      def setDtstart(value: Date): Self = StObject.set(x, "dtstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDtstartNull: Self = StObject.set(x, "dtstart", null)
      
      @scala.inline
      def setDtstartUndefined: Self = StObject.set(x, "dtstart", js.undefined)
      
      @scala.inline
      def setForceset(value: Boolean): Self = StObject.set(x, "forceset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForcesetUndefined: Self = StObject.set(x, "forceset", js.undefined)
      
      @scala.inline
      def setTzid(value: String): Self = StObject.set(x, "tzid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTzidNull: Self = StObject.set(x, "tzid", null)
      
      @scala.inline
      def setTzidUndefined: Self = StObject.set(x, "tzid", js.undefined)
      
      @scala.inline
      def setUnfold(value: Boolean): Self = StObject.set(x, "unfold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnfoldUndefined: Self = StObject.set(x, "unfold", js.undefined)
    }
  }
  
  /* Inlined std.Pick<std.Date, 'getTime'> */
  trait PickDategetTime extends StObject {
    
    def getTime(): Double
    @JSName("getTime")
    var getTime_Original: js.Function0[Double]
  }
  object PickDategetTime {
    
    @scala.inline
    def apply(getTime: () => Double): PickDategetTime = {
      val __obj = js.Dynamic.literal(getTime = js.Any.fromFunction0(getTime))
      __obj.asInstanceOf[PickDategetTime]
    }
    
    @scala.inline
    implicit class PickDategetTimeMutableBuilder[Self <: PickDategetTime] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetTime(value: () => Double): Self = StObject.set(x, "getTime", js.Any.fromFunction0(value))
    }
  }
}
