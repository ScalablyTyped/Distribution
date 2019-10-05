package typings.prettyDashTime

import typings.prettyDashTime.prettyDashTimeMod.Increment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pretty-time", JSImport.Namespace)
@js.native
object prettyDashTimeMod extends js.Object {
  /* Rewritten from type alias, can be one of: 
    - typings.prettyDashTime.prettyDashTimeStrings.ns
    - typings.prettyDashTime.prettyDashTimeStrings.nano
    - typings.prettyDashTime.prettyDashTimeStrings.nanosecond
    - typings.prettyDashTime.prettyDashTimeStrings.nanoseconds
    - typings.prettyDashTime.prettyDashTimeStrings.BACKSLASHu03BCs
    - typings.prettyDashTime.prettyDashTimeStrings.micro
    - typings.prettyDashTime.prettyDashTimeStrings.microsecond
    - typings.prettyDashTime.prettyDashTimeStrings.microseconds
    - typings.prettyDashTime.prettyDashTimeStrings.ms
    - typings.prettyDashTime.prettyDashTimeStrings.milli
    - typings.prettyDashTime.prettyDashTimeStrings.millisecond
    - typings.prettyDashTime.prettyDashTimeStrings.milliseconds
    - typings.prettyDashTime.prettyDashTimeStrings.s
    - typings.prettyDashTime.prettyDashTimeStrings.sec
    - typings.prettyDashTime.prettyDashTimeStrings.second
    - typings.prettyDashTime.prettyDashTimeStrings.seconds
    - typings.prettyDashTime.prettyDashTimeStrings.m
    - typings.prettyDashTime.prettyDashTimeStrings.min
    - typings.prettyDashTime.prettyDashTimeStrings.minute
    - typings.prettyDashTime.prettyDashTimeStrings.minutes
    - typings.prettyDashTime.prettyDashTimeStrings.h
    - typings.prettyDashTime.prettyDashTimeStrings.hr
    - typings.prettyDashTime.prettyDashTimeStrings.hour
    - typings.prettyDashTime.prettyDashTimeStrings.hours
    - typings.prettyDashTime.prettyDashTimeStrings.d
    - typings.prettyDashTime.prettyDashTimeStrings.day
    - typings.prettyDashTime.prettyDashTimeStrings.days
    - typings.prettyDashTime.prettyDashTimeStrings.w
    - typings.prettyDashTime.prettyDashTimeStrings.wk
    - typings.prettyDashTime.prettyDashTimeStrings.week
    - typings.prettyDashTime.prettyDashTimeStrings.weeks
  */
  trait Increment extends js.Object
  
  def apply(time: js.Array[Double]): String = js.native
  def apply(time: js.Array[Double], smallest: Increment): String = js.native
  def apply(time: js.Array[Double], smallest: Increment, digits: Double): String = js.native
}

