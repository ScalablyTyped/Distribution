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
    
    inline def apply(): Byeaster = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Byeaster]
    }
    
    extension [Self <: Byeaster](x: Self) {
      
      inline def setByeaster(value: Double): Self = StObject.set(x, "byeaster", value.asInstanceOf[js.Any])
      
      inline def setByeasterNull: Self = StObject.set(x, "byeaster", null)
      
      inline def setByeasterUndefined: Self = StObject.set(x, "byeaster", js.undefined)
      
      inline def setByhour(value: Double | js.Array[Double]): Self = StObject.set(x, "byhour", value.asInstanceOf[js.Any])
      
      inline def setByhourNull: Self = StObject.set(x, "byhour", null)
      
      inline def setByhourUndefined: Self = StObject.set(x, "byhour", js.undefined)
      
      inline def setByhourVarargs(value: Double*): Self = StObject.set(x, "byhour", js.Array(value :_*))
      
      inline def setByminute(value: Double | js.Array[Double]): Self = StObject.set(x, "byminute", value.asInstanceOf[js.Any])
      
      inline def setByminuteNull: Self = StObject.set(x, "byminute", null)
      
      inline def setByminuteUndefined: Self = StObject.set(x, "byminute", js.undefined)
      
      inline def setByminuteVarargs(value: Double*): Self = StObject.set(x, "byminute", js.Array(value :_*))
      
      inline def setBymonth(value: Double | js.Array[Double]): Self = StObject.set(x, "bymonth", value.asInstanceOf[js.Any])
      
      inline def setBymonthNull: Self = StObject.set(x, "bymonth", null)
      
      inline def setBymonthUndefined: Self = StObject.set(x, "bymonth", js.undefined)
      
      inline def setBymonthVarargs(value: Double*): Self = StObject.set(x, "bymonth", js.Array(value :_*))
      
      inline def setBymonthday(value: Double | js.Array[Double]): Self = StObject.set(x, "bymonthday", value.asInstanceOf[js.Any])
      
      inline def setBymonthdayNull: Self = StObject.set(x, "bymonthday", null)
      
      inline def setBymonthdayUndefined: Self = StObject.set(x, "bymonthday", js.undefined)
      
      inline def setBymonthdayVarargs(value: Double*): Self = StObject.set(x, "bymonthday", js.Array(value :_*))
      
      inline def setBynmonthday(value: js.Array[Double]): Self = StObject.set(x, "bynmonthday", value.asInstanceOf[js.Any])
      
      inline def setBynmonthdayNull: Self = StObject.set(x, "bynmonthday", null)
      
      inline def setBynmonthdayUndefined: Self = StObject.set(x, "bynmonthday", js.undefined)
      
      inline def setBynmonthdayVarargs(value: Double*): Self = StObject.set(x, "bynmonthday", js.Array(value :_*))
      
      inline def setBynweekday(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "bynweekday", value.asInstanceOf[js.Any])
      
      inline def setBynweekdayNull: Self = StObject.set(x, "bynweekday", null)
      
      inline def setBynweekdayUndefined: Self = StObject.set(x, "bynweekday", js.undefined)
      
      inline def setBynweekdayVarargs(value: js.Array[Double]*): Self = StObject.set(x, "bynweekday", js.Array(value :_*))
      
      inline def setBysecond(value: Double | js.Array[Double]): Self = StObject.set(x, "bysecond", value.asInstanceOf[js.Any])
      
      inline def setBysecondNull: Self = StObject.set(x, "bysecond", null)
      
      inline def setBysecondUndefined: Self = StObject.set(x, "bysecond", js.undefined)
      
      inline def setBysecondVarargs(value: Double*): Self = StObject.set(x, "bysecond", js.Array(value :_*))
      
      inline def setBysetpos(value: Double | js.Array[Double]): Self = StObject.set(x, "bysetpos", value.asInstanceOf[js.Any])
      
      inline def setBysetposNull: Self = StObject.set(x, "bysetpos", null)
      
      inline def setBysetposUndefined: Self = StObject.set(x, "bysetpos", js.undefined)
      
      inline def setBysetposVarargs(value: Double*): Self = StObject.set(x, "bysetpos", js.Array(value :_*))
      
      inline def setByweekday(value: Double | Weekday | MO | TU | WE | TH | FR | SA | SU | js.Array[ByWeekday]): Self = StObject.set(x, "byweekday", value.asInstanceOf[js.Any])
      
      inline def setByweekdayNull: Self = StObject.set(x, "byweekday", null)
      
      inline def setByweekdayUndefined: Self = StObject.set(x, "byweekday", js.undefined)
      
      inline def setByweekdayVarargs(value: ByWeekday*): Self = StObject.set(x, "byweekday", js.Array(value :_*))
      
      inline def setByweekno(value: Double | js.Array[Double]): Self = StObject.set(x, "byweekno", value.asInstanceOf[js.Any])
      
      inline def setByweeknoNull: Self = StObject.set(x, "byweekno", null)
      
      inline def setByweeknoUndefined: Self = StObject.set(x, "byweekno", js.undefined)
      
      inline def setByweeknoVarargs(value: Double*): Self = StObject.set(x, "byweekno", js.Array(value :_*))
      
      inline def setByyearday(value: Double | js.Array[Double]): Self = StObject.set(x, "byyearday", value.asInstanceOf[js.Any])
      
      inline def setByyeardayNull: Self = StObject.set(x, "byyearday", null)
      
      inline def setByyeardayUndefined: Self = StObject.set(x, "byyearday", js.undefined)
      
      inline def setByyeardayVarargs(value: Double*): Self = StObject.set(x, "byyearday", js.Array(value :_*))
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountNull: Self = StObject.set(x, "count", null)
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setDtstart(value: Date): Self = StObject.set(x, "dtstart", value.asInstanceOf[js.Any])
      
      inline def setDtstartNull: Self = StObject.set(x, "dtstart", null)
      
      inline def setDtstartUndefined: Self = StObject.set(x, "dtstart", js.undefined)
      
      inline def setFreq(value: Frequency): Self = StObject.set(x, "freq", value.asInstanceOf[js.Any])
      
      inline def setFreqUndefined: Self = StObject.set(x, "freq", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setTzid(value: String): Self = StObject.set(x, "tzid", value.asInstanceOf[js.Any])
      
      inline def setTzidNull: Self = StObject.set(x, "tzid", null)
      
      inline def setTzidUndefined: Self = StObject.set(x, "tzid", js.undefined)
      
      inline def setUntil(value: Date): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
      
      inline def setUntilNull: Self = StObject.set(x, "until", null)
      
      inline def setUntilUndefined: Self = StObject.set(x, "until", js.undefined)
      
      inline def setWkst(value: Double | Weekday): Self = StObject.set(x, "wkst", value.asInstanceOf[js.Any])
      
      inline def setWkstNull: Self = StObject.set(x, "wkst", null)
      
      inline def setWkstUndefined: Self = StObject.set(x, "wkst", js.undefined)
    }
  }
  
  trait Div extends StObject {
    
    var div: Double
    
    var mod: Double
  }
  object Div {
    
    inline def apply(div: Double, mod: Double): Div = {
      val __obj = js.Dynamic.literal(div = div.asInstanceOf[js.Any], mod = mod.asInstanceOf[js.Any])
      __obj.asInstanceOf[Div]
    }
    
    extension [Self <: Div](x: Self) {
      
      inline def setDiv(value: Double): Self = StObject.set(x, "div", value.asInstanceOf[js.Any])
      
      inline def setMod(value: Double): Self = StObject.set(x, "mod", value.asInstanceOf[js.Any])
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
    
    inline def apply(
      exdatevals: js.Array[Date],
      exrulevals: js.Array[PartialOptions],
      rdatevals: js.Array[Date],
      rrulevals: js.Array[PartialOptions]
    ): Dtstart = {
      val __obj = js.Dynamic.literal(exdatevals = exdatevals.asInstanceOf[js.Any], exrulevals = exrulevals.asInstanceOf[js.Any], rdatevals = rdatevals.asInstanceOf[js.Any], rrulevals = rrulevals.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dtstart]
    }
    
    extension [Self <: Dtstart](x: Self) {
      
      inline def setDtstart(value: Date): Self = StObject.set(x, "dtstart", value.asInstanceOf[js.Any])
      
      inline def setDtstartNull: Self = StObject.set(x, "dtstart", null)
      
      inline def setDtstartUndefined: Self = StObject.set(x, "dtstart", js.undefined)
      
      inline def setExdatevals(value: js.Array[Date]): Self = StObject.set(x, "exdatevals", value.asInstanceOf[js.Any])
      
      inline def setExdatevalsVarargs(value: Date*): Self = StObject.set(x, "exdatevals", js.Array(value :_*))
      
      inline def setExrulevals(value: js.Array[PartialOptions]): Self = StObject.set(x, "exrulevals", value.asInstanceOf[js.Any])
      
      inline def setExrulevalsVarargs(value: PartialOptions*): Self = StObject.set(x, "exrulevals", js.Array(value :_*))
      
      inline def setRdatevals(value: js.Array[Date]): Self = StObject.set(x, "rdatevals", value.asInstanceOf[js.Any])
      
      inline def setRdatevalsVarargs(value: Date*): Self = StObject.set(x, "rdatevals", js.Array(value :_*))
      
      inline def setRrulevals(value: js.Array[PartialOptions]): Self = StObject.set(x, "rrulevals", value.asInstanceOf[js.Any])
      
      inline def setRrulevalsVarargs(value: PartialOptions*): Self = StObject.set(x, "rrulevals", js.Array(value :_*))
      
      inline def setTzid(value: String): Self = StObject.set(x, "tzid", value.asInstanceOf[js.Any])
      
      inline def setTzidNull: Self = StObject.set(x, "tzid", null)
      
      inline def setTzidUndefined: Self = StObject.set(x, "tzid", js.undefined)
    }
  }
  
  trait ParsedOptions extends StObject {
    
    var parsedOptions: typings.rrule.typesMod.ParsedOptions
  }
  object ParsedOptions {
    
    inline def apply(parsedOptions: typings.rrule.typesMod.ParsedOptions): ParsedOptions = {
      val __obj = js.Dynamic.literal(parsedOptions = parsedOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedOptions]
    }
    
    extension [Self <: ParsedOptions](x: Self) {
      
      inline def setParsedOptions(value: typings.rrule.typesMod.ParsedOptions): Self = StObject.set(x, "parsedOptions", value.asInstanceOf[js.Any])
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
    
    inline def apply(): PartialIterArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIterArgs]
    }
    
    extension [Self <: PartialIterArgs](x: Self) {
      
      inline def setAfter(value: Date): Self = StObject.set(x, "after", value.asInstanceOf[js.Any])
      
      inline def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      inline def setBefore(value: Date): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setDt(value: Date): Self = StObject.set(x, "dt", value.asInstanceOf[js.Any])
      
      inline def setDtUndefined: Self = StObject.set(x, "dt", js.undefined)
      
      inline def setInc(value: Boolean): Self = StObject.set(x, "inc", value.asInstanceOf[js.Any])
      
      inline def setIncUndefined: Self = StObject.set(x, "inc", js.undefined)
      
      inline def set_value(value: Date | js.Array[Date]): Self = StObject.set(x, "_value", value.asInstanceOf[js.Any])
      
      inline def set_valueNull: Self = StObject.set(x, "_value", null)
      
      inline def set_valueUndefined: Self = StObject.set(x, "_value", js.undefined)
      
      inline def set_valueVarargs(value: Date*): Self = StObject.set(x, "_value", js.Array(value :_*))
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
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    extension [Self <: PartialOptions](x: Self) {
      
      inline def setByeaster(value: Double): Self = StObject.set(x, "byeaster", value.asInstanceOf[js.Any])
      
      inline def setByeasterNull: Self = StObject.set(x, "byeaster", null)
      
      inline def setByeasterUndefined: Self = StObject.set(x, "byeaster", js.undefined)
      
      inline def setByhour(value: Double | js.Array[Double]): Self = StObject.set(x, "byhour", value.asInstanceOf[js.Any])
      
      inline def setByhourNull: Self = StObject.set(x, "byhour", null)
      
      inline def setByhourUndefined: Self = StObject.set(x, "byhour", js.undefined)
      
      inline def setByhourVarargs(value: Double*): Self = StObject.set(x, "byhour", js.Array(value :_*))
      
      inline def setByminute(value: Double | js.Array[Double]): Self = StObject.set(x, "byminute", value.asInstanceOf[js.Any])
      
      inline def setByminuteNull: Self = StObject.set(x, "byminute", null)
      
      inline def setByminuteUndefined: Self = StObject.set(x, "byminute", js.undefined)
      
      inline def setByminuteVarargs(value: Double*): Self = StObject.set(x, "byminute", js.Array(value :_*))
      
      inline def setBymonth(value: Double | js.Array[Double]): Self = StObject.set(x, "bymonth", value.asInstanceOf[js.Any])
      
      inline def setBymonthNull: Self = StObject.set(x, "bymonth", null)
      
      inline def setBymonthUndefined: Self = StObject.set(x, "bymonth", js.undefined)
      
      inline def setBymonthVarargs(value: Double*): Self = StObject.set(x, "bymonth", js.Array(value :_*))
      
      inline def setBymonthday(value: Double | js.Array[Double]): Self = StObject.set(x, "bymonthday", value.asInstanceOf[js.Any])
      
      inline def setBymonthdayNull: Self = StObject.set(x, "bymonthday", null)
      
      inline def setBymonthdayUndefined: Self = StObject.set(x, "bymonthday", js.undefined)
      
      inline def setBymonthdayVarargs(value: Double*): Self = StObject.set(x, "bymonthday", js.Array(value :_*))
      
      inline def setBynmonthday(value: js.Array[Double]): Self = StObject.set(x, "bynmonthday", value.asInstanceOf[js.Any])
      
      inline def setBynmonthdayNull: Self = StObject.set(x, "bynmonthday", null)
      
      inline def setBynmonthdayUndefined: Self = StObject.set(x, "bynmonthday", js.undefined)
      
      inline def setBynmonthdayVarargs(value: Double*): Self = StObject.set(x, "bynmonthday", js.Array(value :_*))
      
      inline def setBynweekday(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "bynweekday", value.asInstanceOf[js.Any])
      
      inline def setBynweekdayNull: Self = StObject.set(x, "bynweekday", null)
      
      inline def setBynweekdayUndefined: Self = StObject.set(x, "bynweekday", js.undefined)
      
      inline def setBynweekdayVarargs(value: js.Array[Double]*): Self = StObject.set(x, "bynweekday", js.Array(value :_*))
      
      inline def setBysecond(value: Double | js.Array[Double]): Self = StObject.set(x, "bysecond", value.asInstanceOf[js.Any])
      
      inline def setBysecondNull: Self = StObject.set(x, "bysecond", null)
      
      inline def setBysecondUndefined: Self = StObject.set(x, "bysecond", js.undefined)
      
      inline def setBysecondVarargs(value: Double*): Self = StObject.set(x, "bysecond", js.Array(value :_*))
      
      inline def setBysetpos(value: Double | js.Array[Double]): Self = StObject.set(x, "bysetpos", value.asInstanceOf[js.Any])
      
      inline def setBysetposNull: Self = StObject.set(x, "bysetpos", null)
      
      inline def setBysetposUndefined: Self = StObject.set(x, "bysetpos", js.undefined)
      
      inline def setBysetposVarargs(value: Double*): Self = StObject.set(x, "bysetpos", js.Array(value :_*))
      
      inline def setByweekday(value: ByWeekday | js.Array[ByWeekday]): Self = StObject.set(x, "byweekday", value.asInstanceOf[js.Any])
      
      inline def setByweekdayNull: Self = StObject.set(x, "byweekday", null)
      
      inline def setByweekdayUndefined: Self = StObject.set(x, "byweekday", js.undefined)
      
      inline def setByweekdayVarargs(value: ByWeekday*): Self = StObject.set(x, "byweekday", js.Array(value :_*))
      
      inline def setByweekno(value: Double | js.Array[Double]): Self = StObject.set(x, "byweekno", value.asInstanceOf[js.Any])
      
      inline def setByweeknoNull: Self = StObject.set(x, "byweekno", null)
      
      inline def setByweeknoUndefined: Self = StObject.set(x, "byweekno", js.undefined)
      
      inline def setByweeknoVarargs(value: Double*): Self = StObject.set(x, "byweekno", js.Array(value :_*))
      
      inline def setByyearday(value: Double | js.Array[Double]): Self = StObject.set(x, "byyearday", value.asInstanceOf[js.Any])
      
      inline def setByyeardayNull: Self = StObject.set(x, "byyearday", null)
      
      inline def setByyeardayUndefined: Self = StObject.set(x, "byyearday", js.undefined)
      
      inline def setByyeardayVarargs(value: Double*): Self = StObject.set(x, "byyearday", js.Array(value :_*))
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountNull: Self = StObject.set(x, "count", null)
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setDtstart(value: Date): Self = StObject.set(x, "dtstart", value.asInstanceOf[js.Any])
      
      inline def setDtstartNull: Self = StObject.set(x, "dtstart", null)
      
      inline def setDtstartUndefined: Self = StObject.set(x, "dtstart", js.undefined)
      
      inline def setFreq(value: Frequency): Self = StObject.set(x, "freq", value.asInstanceOf[js.Any])
      
      inline def setFreqUndefined: Self = StObject.set(x, "freq", js.undefined)
      
      inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
      
      inline def setTzid(value: String): Self = StObject.set(x, "tzid", value.asInstanceOf[js.Any])
      
      inline def setTzidNull: Self = StObject.set(x, "tzid", null)
      
      inline def setTzidUndefined: Self = StObject.set(x, "tzid", js.undefined)
      
      inline def setUntil(value: Date): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
      
      inline def setUntilNull: Self = StObject.set(x, "until", null)
      
      inline def setUntilUndefined: Self = StObject.set(x, "until", js.undefined)
      
      inline def setWkst(value: Weekday | Double): Self = StObject.set(x, "wkst", value.asInstanceOf[js.Any])
      
      inline def setWkstNull: Self = StObject.set(x, "wkst", null)
      
      inline def setWkstUndefined: Self = StObject.set(x, "wkst", js.undefined)
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
    
    inline def apply(): PartialRRuleStrOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialRRuleStrOptions]
    }
    
    extension [Self <: PartialRRuleStrOptions](x: Self) {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCompatible(value: Boolean): Self = StObject.set(x, "compatible", value.asInstanceOf[js.Any])
      
      inline def setCompatibleUndefined: Self = StObject.set(x, "compatible", js.undefined)
      
      inline def setDtstart(value: Date): Self = StObject.set(x, "dtstart", value.asInstanceOf[js.Any])
      
      inline def setDtstartNull: Self = StObject.set(x, "dtstart", null)
      
      inline def setDtstartUndefined: Self = StObject.set(x, "dtstart", js.undefined)
      
      inline def setForceset(value: Boolean): Self = StObject.set(x, "forceset", value.asInstanceOf[js.Any])
      
      inline def setForcesetUndefined: Self = StObject.set(x, "forceset", js.undefined)
      
      inline def setTzid(value: String): Self = StObject.set(x, "tzid", value.asInstanceOf[js.Any])
      
      inline def setTzidNull: Self = StObject.set(x, "tzid", null)
      
      inline def setTzidUndefined: Self = StObject.set(x, "tzid", js.undefined)
      
      inline def setUnfold(value: Boolean): Self = StObject.set(x, "unfold", value.asInstanceOf[js.Any])
      
      inline def setUnfoldUndefined: Self = StObject.set(x, "unfold", js.undefined)
    }
  }
  
  /* Inlined std.Pick<std.Date, 'getTime'> */
  trait PickDategetTime extends StObject {
    
    def getTime(): Double
    @JSName("getTime")
    var getTime_Original: js.Function0[Double]
  }
  object PickDategetTime {
    
    inline def apply(getTime: () => Double): PickDategetTime = {
      val __obj = js.Dynamic.literal(getTime = js.Any.fromFunction0(getTime))
      __obj.asInstanceOf[PickDategetTime]
    }
    
    extension [Self <: PickDategetTime](x: Self) {
      
      inline def setGetTime(value: () => Double): Self = StObject.set(x, "getTime", js.Any.fromFunction0(value))
    }
  }
}
