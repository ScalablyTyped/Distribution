package typings.rrule

import typings.rrule.weekdayMod.Weekday
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("rrule/dist/esm/src/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait Frequency extends StObject
  @JSImport("rrule/dist/esm/src/types", "Frequency")
  @js.native
  object Frequency extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Frequency & Double] = js.native
    
    @js.native
    sealed trait DAILY
      extends StObject
         with Frequency
    /* 3 */ val DAILY: typings.rrule.typesMod.Frequency.DAILY & Double = js.native
    
    @js.native
    sealed trait HOURLY
      extends StObject
         with Frequency
    /* 4 */ val HOURLY: typings.rrule.typesMod.Frequency.HOURLY & Double = js.native
    
    @js.native
    sealed trait MINUTELY
      extends StObject
         with Frequency
    /* 5 */ val MINUTELY: typings.rrule.typesMod.Frequency.MINUTELY & Double = js.native
    
    @js.native
    sealed trait MONTHLY
      extends StObject
         with Frequency
    /* 1 */ val MONTHLY: typings.rrule.typesMod.Frequency.MONTHLY & Double = js.native
    
    @js.native
    sealed trait SECONDLY
      extends StObject
         with Frequency
    /* 6 */ val SECONDLY: typings.rrule.typesMod.Frequency.SECONDLY & Double = js.native
    
    @js.native
    sealed trait WEEKLY
      extends StObject
         with Frequency
    /* 2 */ val WEEKLY: typings.rrule.typesMod.Frequency.WEEKLY & Double = js.native
    
    @js.native
    sealed trait YEARLY
      extends StObject
         with Frequency
    /* 0 */ val YEARLY: typings.rrule.typesMod.Frequency.YEARLY & Double = js.native
  }
  
  @scala.inline
  def freqIsDailyOrGreater(freq: Frequency): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("freqIsDailyOrGreater")(freq.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.rrule.weekdayMod.WeekdayStr
    - scala.Double
    - typings.rrule.weekdayMod.Weekday
  */
  type ByWeekday = _ByWeekday | Double
  
  type IterResultType[M /* <: QueryMethodTypes */] = Date | Null | js.Array[Date]
  
  trait Options extends StObject {
    
    var byeaster: Double | Null
    
    var byhour: Double | js.Array[Double] | Null
    
    var byminute: Double | js.Array[Double] | Null
    
    var bymonth: Double | js.Array[Double] | Null
    
    var bymonthday: Double | js.Array[Double] | Null
    
    var bynmonthday: js.Array[Double] | Null
    
    var bynweekday: js.Array[js.Array[Double]] | Null
    
    var bysecond: Double | js.Array[Double] | Null
    
    var bysetpos: Double | js.Array[Double] | Null
    
    var byweekday: ByWeekday | js.Array[ByWeekday] | Null
    
    var byweekno: Double | js.Array[Double] | Null
    
    var byyearday: Double | js.Array[Double] | Null
    
    var count: Double | Null
    
    var dtstart: Date | Null
    
    var freq: Frequency
    
    var interval: Double
    
    var tzid: String | Null
    
    var until: Date | Null
    
    var wkst: Weekday | Double | Null
  }
  object Options {
    
    @scala.inline
    def apply(freq: Frequency, interval: Double): Options = {
      val __obj = js.Dynamic.literal(freq = freq.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], byeaster = null, byhour = null, byminute = null, bymonth = null, bymonthday = null, bynmonthday = null, bynweekday = null, bysecond = null, bysetpos = null, byweekday = null, byweekno = null, byyearday = null, count = null, dtstart = null, tzid = null, until = null, wkst = null)
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setByeaster(value: Double): Self = StObject.set(x, "byeaster", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByeasterNull: Self = StObject.set(x, "byeaster", null)
      
      @scala.inline
      def setByhour(value: Double | js.Array[Double]): Self = StObject.set(x, "byhour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByhourNull: Self = StObject.set(x, "byhour", null)
      
      @scala.inline
      def setByhourVarargs(value: Double*): Self = StObject.set(x, "byhour", js.Array(value :_*))
      
      @scala.inline
      def setByminute(value: Double | js.Array[Double]): Self = StObject.set(x, "byminute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByminuteNull: Self = StObject.set(x, "byminute", null)
      
      @scala.inline
      def setByminuteVarargs(value: Double*): Self = StObject.set(x, "byminute", js.Array(value :_*))
      
      @scala.inline
      def setBymonth(value: Double | js.Array[Double]): Self = StObject.set(x, "bymonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBymonthNull: Self = StObject.set(x, "bymonth", null)
      
      @scala.inline
      def setBymonthVarargs(value: Double*): Self = StObject.set(x, "bymonth", js.Array(value :_*))
      
      @scala.inline
      def setBymonthday(value: Double | js.Array[Double]): Self = StObject.set(x, "bymonthday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBymonthdayNull: Self = StObject.set(x, "bymonthday", null)
      
      @scala.inline
      def setBymonthdayVarargs(value: Double*): Self = StObject.set(x, "bymonthday", js.Array(value :_*))
      
      @scala.inline
      def setBynmonthday(value: js.Array[Double]): Self = StObject.set(x, "bynmonthday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBynmonthdayNull: Self = StObject.set(x, "bynmonthday", null)
      
      @scala.inline
      def setBynmonthdayVarargs(value: Double*): Self = StObject.set(x, "bynmonthday", js.Array(value :_*))
      
      @scala.inline
      def setBynweekday(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "bynweekday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBynweekdayNull: Self = StObject.set(x, "bynweekday", null)
      
      @scala.inline
      def setBynweekdayVarargs(value: js.Array[Double]*): Self = StObject.set(x, "bynweekday", js.Array(value :_*))
      
      @scala.inline
      def setBysecond(value: Double | js.Array[Double]): Self = StObject.set(x, "bysecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBysecondNull: Self = StObject.set(x, "bysecond", null)
      
      @scala.inline
      def setBysecondVarargs(value: Double*): Self = StObject.set(x, "bysecond", js.Array(value :_*))
      
      @scala.inline
      def setBysetpos(value: Double | js.Array[Double]): Self = StObject.set(x, "bysetpos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBysetposNull: Self = StObject.set(x, "bysetpos", null)
      
      @scala.inline
      def setBysetposVarargs(value: Double*): Self = StObject.set(x, "bysetpos", js.Array(value :_*))
      
      @scala.inline
      def setByweekday(value: ByWeekday | js.Array[ByWeekday]): Self = StObject.set(x, "byweekday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByweekdayNull: Self = StObject.set(x, "byweekday", null)
      
      @scala.inline
      def setByweekdayVarargs(value: ByWeekday*): Self = StObject.set(x, "byweekday", js.Array(value :_*))
      
      @scala.inline
      def setByweekno(value: Double | js.Array[Double]): Self = StObject.set(x, "byweekno", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByweeknoNull: Self = StObject.set(x, "byweekno", null)
      
      @scala.inline
      def setByweeknoVarargs(value: Double*): Self = StObject.set(x, "byweekno", js.Array(value :_*))
      
      @scala.inline
      def setByyearday(value: Double | js.Array[Double]): Self = StObject.set(x, "byyearday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByyeardayNull: Self = StObject.set(x, "byyearday", null)
      
      @scala.inline
      def setByyeardayVarargs(value: Double*): Self = StObject.set(x, "byyearday", js.Array(value :_*))
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountNull: Self = StObject.set(x, "count", null)
      
      @scala.inline
      def setDtstart(value: Date): Self = StObject.set(x, "dtstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDtstartNull: Self = StObject.set(x, "dtstart", null)
      
      @scala.inline
      def setFreq(value: Frequency): Self = StObject.set(x, "freq", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTzid(value: String): Self = StObject.set(x, "tzid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTzidNull: Self = StObject.set(x, "tzid", null)
      
      @scala.inline
      def setUntil(value: Date): Self = StObject.set(x, "until", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUntilNull: Self = StObject.set(x, "until", null)
      
      @scala.inline
      def setWkst(value: Weekday | Double): Self = StObject.set(x, "wkst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWkstNull: Self = StObject.set(x, "wkst", null)
    }
  }
  
  trait ParsedOptions
    extends StObject
       with Options {
    
    @JSName("byhour")
    var byhour_ParsedOptions: js.Array[Double]
    
    @JSName("byminute")
    var byminute_ParsedOptions: js.Array[Double]
    
    @JSName("bymonth")
    var bymonth_ParsedOptions: js.Array[Double]
    
    @JSName("bymonthday")
    var bymonthday_ParsedOptions: js.Array[Double]
    
    @JSName("bynmonthday")
    var bynmonthday_ParsedOptions: js.Array[Double]
    
    @JSName("bysecond")
    var bysecond_ParsedOptions: js.Array[Double]
    
    @JSName("bysetpos")
    var bysetpos_ParsedOptions: js.Array[Double]
    
    @JSName("byweekday")
    var byweekday_ParsedOptions: js.Array[Double]
    
    @JSName("byweekno")
    var byweekno_ParsedOptions: js.Array[Double]
    
    @JSName("byyearday")
    var byyearday_ParsedOptions: js.Array[Double]
    
    @JSName("dtstart")
    var dtstart_ParsedOptions: Date
    
    @JSName("wkst")
    var wkst_ParsedOptions: Double
  }
  object ParsedOptions {
    
    @scala.inline
    def apply(
      byhour: js.Array[Double],
      byminute: js.Array[Double],
      bymonth: js.Array[Double],
      bymonthday: js.Array[Double],
      bynmonthday: js.Array[Double],
      bysecond: js.Array[Double],
      bysetpos: js.Array[Double],
      byweekday: js.Array[Double],
      byweekno: js.Array[Double],
      byyearday: js.Array[Double],
      dtstart: Date,
      freq: Frequency,
      interval: Double,
      wkst: Double
    ): ParsedOptions = {
      val __obj = js.Dynamic.literal(byhour = byhour.asInstanceOf[js.Any], byminute = byminute.asInstanceOf[js.Any], bymonth = bymonth.asInstanceOf[js.Any], bymonthday = bymonthday.asInstanceOf[js.Any], bynmonthday = bynmonthday.asInstanceOf[js.Any], bysecond = bysecond.asInstanceOf[js.Any], bysetpos = bysetpos.asInstanceOf[js.Any], byweekday = byweekday.asInstanceOf[js.Any], byweekno = byweekno.asInstanceOf[js.Any], byyearday = byyearday.asInstanceOf[js.Any], dtstart = dtstart.asInstanceOf[js.Any], freq = freq.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], wkst = wkst.asInstanceOf[js.Any], byeaster = null, bynweekday = null, count = null, tzid = null, until = null)
      __obj.asInstanceOf[ParsedOptions]
    }
    
    @scala.inline
    implicit class ParsedOptionsMutableBuilder[Self <: ParsedOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setByhour(value: js.Array[Double]): Self = StObject.set(x, "byhour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByhourVarargs(value: Double*): Self = StObject.set(x, "byhour", js.Array(value :_*))
      
      @scala.inline
      def setByminute(value: js.Array[Double]): Self = StObject.set(x, "byminute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByminuteVarargs(value: Double*): Self = StObject.set(x, "byminute", js.Array(value :_*))
      
      @scala.inline
      def setBymonth(value: js.Array[Double]): Self = StObject.set(x, "bymonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBymonthVarargs(value: Double*): Self = StObject.set(x, "bymonth", js.Array(value :_*))
      
      @scala.inline
      def setBymonthday(value: js.Array[Double]): Self = StObject.set(x, "bymonthday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBymonthdayVarargs(value: Double*): Self = StObject.set(x, "bymonthday", js.Array(value :_*))
      
      @scala.inline
      def setBynmonthday(value: js.Array[Double]): Self = StObject.set(x, "bynmonthday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBynmonthdayVarargs(value: Double*): Self = StObject.set(x, "bynmonthday", js.Array(value :_*))
      
      @scala.inline
      def setBysecond(value: js.Array[Double]): Self = StObject.set(x, "bysecond", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBysecondVarargs(value: Double*): Self = StObject.set(x, "bysecond", js.Array(value :_*))
      
      @scala.inline
      def setBysetpos(value: js.Array[Double]): Self = StObject.set(x, "bysetpos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBysetposVarargs(value: Double*): Self = StObject.set(x, "bysetpos", js.Array(value :_*))
      
      @scala.inline
      def setByweekday(value: js.Array[Double]): Self = StObject.set(x, "byweekday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByweekdayVarargs(value: Double*): Self = StObject.set(x, "byweekday", js.Array(value :_*))
      
      @scala.inline
      def setByweekno(value: js.Array[Double]): Self = StObject.set(x, "byweekno", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByweeknoVarargs(value: Double*): Self = StObject.set(x, "byweekno", js.Array(value :_*))
      
      @scala.inline
      def setByyearday(value: js.Array[Double]): Self = StObject.set(x, "byyearday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setByyeardayVarargs(value: Double*): Self = StObject.set(x, "byyearday", js.Array(value :_*))
      
      @scala.inline
      def setDtstart(value: Date): Self = StObject.set(x, "dtstart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWkst(value: Double): Self = StObject.set(x, "wkst", value.asInstanceOf[js.Any])
    }
  }
  
  /* keyof rrule.rrule/dist/esm/src/types.QueryMethods */ /* Rewritten from type alias, can be one of: 
    - typings.rrule.rruleStrings.all
    - typings.rrule.rruleStrings.between
    - typings.rrule.rruleStrings.before
    - typings.rrule.rruleStrings.after
  */
  trait QueryMethodTypes extends StObject
  
  trait QueryMethods extends StObject {
    
    def after(date: Date, inc: Boolean): Date
    
    def all(): js.Array[Date]
    
    def before(date: Date, inc: Boolean): Date
    
    def between(after: Date, before: Date, inc: Boolean): js.Array[Date]
  }
  object QueryMethods {
    
    @scala.inline
    def apply(
      after: (Date, Boolean) => Date,
      all: () => js.Array[Date],
      before: (Date, Boolean) => Date,
      between: (Date, Date, Boolean) => js.Array[Date]
    ): QueryMethods = {
      val __obj = js.Dynamic.literal(after = js.Any.fromFunction2(after), all = js.Any.fromFunction0(all), before = js.Any.fromFunction2(before), between = js.Any.fromFunction3(between))
      __obj.asInstanceOf[QueryMethods]
    }
    
    @scala.inline
    implicit class QueryMethodsMutableBuilder[Self <: QueryMethods] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(value: (Date, Boolean) => Date): Self = StObject.set(x, "after", js.Any.fromFunction2(value))
      
      @scala.inline
      def setAll(value: () => js.Array[Date]): Self = StObject.set(x, "all", js.Any.fromFunction0(value))
      
      @scala.inline
      def setBefore(value: (Date, Boolean) => Date): Self = StObject.set(x, "before", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBetween(value: (Date, Date, Boolean) => js.Array[Date]): Self = StObject.set(x, "between", js.Any.fromFunction3(value))
    }
  }
  
  trait _ByWeekday extends StObject
}
