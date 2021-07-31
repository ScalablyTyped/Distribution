package typings.prettyTime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(time: js.Array[Double]): String = ^.asInstanceOf[js.Dynamic].apply(time.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(time: js.Array[Double], smallest: Unit, digits: Double): String = (^.asInstanceOf[js.Dynamic].apply(time.asInstanceOf[js.Any], smallest.asInstanceOf[js.Any], digits.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(time: js.Array[Double], smallest: Increment): String = (^.asInstanceOf[js.Dynamic].apply(time.asInstanceOf[js.Any], smallest.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def apply(time: js.Array[Double], smallest: Increment, digits: Double): String = (^.asInstanceOf[js.Dynamic].apply(time.asInstanceOf[js.Any], smallest.asInstanceOf[js.Any], digits.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("pretty-time", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.prettyTime.prettyTimeStrings.ns
    - typings.prettyTime.prettyTimeStrings.nano
    - typings.prettyTime.prettyTimeStrings.nanosecond
    - typings.prettyTime.prettyTimeStrings.nanoseconds
    - typings.prettyTime.prettyTimeStrings.μs
    - typings.prettyTime.prettyTimeStrings.micro
    - typings.prettyTime.prettyTimeStrings.microsecond
    - typings.prettyTime.prettyTimeStrings.microseconds
    - typings.prettyTime.prettyTimeStrings.ms
    - typings.prettyTime.prettyTimeStrings.milli
    - typings.prettyTime.prettyTimeStrings.millisecond
    - typings.prettyTime.prettyTimeStrings.milliseconds
    - typings.prettyTime.prettyTimeStrings.s
    - typings.prettyTime.prettyTimeStrings.sec
    - typings.prettyTime.prettyTimeStrings.second
    - typings.prettyTime.prettyTimeStrings.seconds
    - typings.prettyTime.prettyTimeStrings.m
    - typings.prettyTime.prettyTimeStrings.min
    - typings.prettyTime.prettyTimeStrings.minute
    - typings.prettyTime.prettyTimeStrings.minutes
    - typings.prettyTime.prettyTimeStrings.h
    - typings.prettyTime.prettyTimeStrings.hr
    - typings.prettyTime.prettyTimeStrings.hour
    - typings.prettyTime.prettyTimeStrings.hours
    - typings.prettyTime.prettyTimeStrings.d
    - typings.prettyTime.prettyTimeStrings.day
    - typings.prettyTime.prettyTimeStrings.days
    - typings.prettyTime.prettyTimeStrings.w
    - typings.prettyTime.prettyTimeStrings.wk
    - typings.prettyTime.prettyTimeStrings.week
    - typings.prettyTime.prettyTimeStrings.weeks
  */
  trait Increment extends StObject
  object Increment {
    
    @scala.inline
    def d: typings.prettyTime.prettyTimeStrings.d = "d".asInstanceOf[typings.prettyTime.prettyTimeStrings.d]
    
    @scala.inline
    def day: typings.prettyTime.prettyTimeStrings.day = "day".asInstanceOf[typings.prettyTime.prettyTimeStrings.day]
    
    @scala.inline
    def days: typings.prettyTime.prettyTimeStrings.days = "days".asInstanceOf[typings.prettyTime.prettyTimeStrings.days]
    
    @scala.inline
    def h: typings.prettyTime.prettyTimeStrings.h = "h".asInstanceOf[typings.prettyTime.prettyTimeStrings.h]
    
    @scala.inline
    def hour: typings.prettyTime.prettyTimeStrings.hour = "hour".asInstanceOf[typings.prettyTime.prettyTimeStrings.hour]
    
    @scala.inline
    def hours: typings.prettyTime.prettyTimeStrings.hours = "hours".asInstanceOf[typings.prettyTime.prettyTimeStrings.hours]
    
    @scala.inline
    def hr: typings.prettyTime.prettyTimeStrings.hr = "hr".asInstanceOf[typings.prettyTime.prettyTimeStrings.hr]
    
    @scala.inline
    def m: typings.prettyTime.prettyTimeStrings.m = "m".asInstanceOf[typings.prettyTime.prettyTimeStrings.m]
    
    @scala.inline
    def micro: typings.prettyTime.prettyTimeStrings.micro = "micro".asInstanceOf[typings.prettyTime.prettyTimeStrings.micro]
    
    @scala.inline
    def microsecond: typings.prettyTime.prettyTimeStrings.microsecond = "microsecond".asInstanceOf[typings.prettyTime.prettyTimeStrings.microsecond]
    
    @scala.inline
    def microseconds: typings.prettyTime.prettyTimeStrings.microseconds = "microseconds".asInstanceOf[typings.prettyTime.prettyTimeStrings.microseconds]
    
    @scala.inline
    def milli: typings.prettyTime.prettyTimeStrings.milli = "milli".asInstanceOf[typings.prettyTime.prettyTimeStrings.milli]
    
    @scala.inline
    def millisecond: typings.prettyTime.prettyTimeStrings.millisecond = "millisecond".asInstanceOf[typings.prettyTime.prettyTimeStrings.millisecond]
    
    @scala.inline
    def milliseconds: typings.prettyTime.prettyTimeStrings.milliseconds = "milliseconds".asInstanceOf[typings.prettyTime.prettyTimeStrings.milliseconds]
    
    @scala.inline
    def min: typings.prettyTime.prettyTimeStrings.min = "min".asInstanceOf[typings.prettyTime.prettyTimeStrings.min]
    
    @scala.inline
    def minute: typings.prettyTime.prettyTimeStrings.minute = "minute".asInstanceOf[typings.prettyTime.prettyTimeStrings.minute]
    
    @scala.inline
    def minutes: typings.prettyTime.prettyTimeStrings.minutes = "minutes".asInstanceOf[typings.prettyTime.prettyTimeStrings.minutes]
    
    @scala.inline
    def ms: typings.prettyTime.prettyTimeStrings.ms = "ms".asInstanceOf[typings.prettyTime.prettyTimeStrings.ms]
    
    @scala.inline
    def nano: typings.prettyTime.prettyTimeStrings.nano = "nano".asInstanceOf[typings.prettyTime.prettyTimeStrings.nano]
    
    @scala.inline
    def nanosecond: typings.prettyTime.prettyTimeStrings.nanosecond = "nanosecond".asInstanceOf[typings.prettyTime.prettyTimeStrings.nanosecond]
    
    @scala.inline
    def nanoseconds: typings.prettyTime.prettyTimeStrings.nanoseconds = "nanoseconds".asInstanceOf[typings.prettyTime.prettyTimeStrings.nanoseconds]
    
    @scala.inline
    def ns: typings.prettyTime.prettyTimeStrings.ns = "ns".asInstanceOf[typings.prettyTime.prettyTimeStrings.ns]
    
    @scala.inline
    def s: typings.prettyTime.prettyTimeStrings.s = "s".asInstanceOf[typings.prettyTime.prettyTimeStrings.s]
    
    @scala.inline
    def sec: typings.prettyTime.prettyTimeStrings.sec = "sec".asInstanceOf[typings.prettyTime.prettyTimeStrings.sec]
    
    @scala.inline
    def second: typings.prettyTime.prettyTimeStrings.second = "second".asInstanceOf[typings.prettyTime.prettyTimeStrings.second]
    
    @scala.inline
    def seconds: typings.prettyTime.prettyTimeStrings.seconds = "seconds".asInstanceOf[typings.prettyTime.prettyTimeStrings.seconds]
    
    @scala.inline
    def w: typings.prettyTime.prettyTimeStrings.w = "w".asInstanceOf[typings.prettyTime.prettyTimeStrings.w]
    
    @scala.inline
    def week: typings.prettyTime.prettyTimeStrings.week = "week".asInstanceOf[typings.prettyTime.prettyTimeStrings.week]
    
    @scala.inline
    def weeks: typings.prettyTime.prettyTimeStrings.weeks = "weeks".asInstanceOf[typings.prettyTime.prettyTimeStrings.weeks]
    
    @scala.inline
    def wk: typings.prettyTime.prettyTimeStrings.wk = "wk".asInstanceOf[typings.prettyTime.prettyTimeStrings.wk]
    
    @scala.inline
    def μs: typings.prettyTime.prettyTimeStrings.μs = "\u03BCs".asInstanceOf[typings.prettyTime.prettyTimeStrings.μs]
  }
}
