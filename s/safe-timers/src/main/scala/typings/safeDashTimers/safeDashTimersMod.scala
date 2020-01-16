package typings.safeDashTimers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("safe-timers", JSImport.Namespace)
@js.native
object safeDashTimersMod extends js.Object {
  @js.native
  class Interval () extends js.Object {
    /**
      * Cancels interval.
      */
    def clear(): Unit = js.native
  }
  
  @js.native
  class Timeout () extends js.Object {
    /**
      * Cancels timeout.
      */
    def clear(): Unit = js.native
  }
  
  val maxInterval: Double = js.native
  def clearInterval(interval: Interval): Unit = js.native
  def clearTimeout(timeout: Timeout): Unit = js.native
  def setInterval[T /* <: js.Array[_] */](
    callback: js.Function1[/* args */ T, Unit],
    interval: Double,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): Interval = js.native
  def setTimeout[T /* <: js.Array[_] */](
    callback: js.Function1[/* args */ T, Unit],
    interval: Double,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): Timeout = js.native
  def setTimeoutAt[T /* <: js.Array[_] */](
    callback: js.Function1[/* args */ T, Unit],
    timestamp: Double,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): Timeout = js.native
}

