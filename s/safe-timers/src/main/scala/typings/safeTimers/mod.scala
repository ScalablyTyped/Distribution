package typings.safeTimers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("safe-timers", "Interval")
  @js.native
  class Interval () extends StObject {
    
    /**
      * Cancels interval.
      */
    def clear(): Unit = js.native
  }
  
  @JSImport("safe-timers", "Timeout")
  @js.native
  class Timeout () extends StObject {
    
    /**
      * Cancels timeout.
      */
    def clear(): Unit = js.native
  }
  
  @JSImport("safe-timers", "clearInterval")
  @js.native
  def clearInterval(interval: Interval): Unit = js.native
  
  @JSImport("safe-timers", "clearTimeout")
  @js.native
  def clearTimeout(timeout: Timeout): Unit = js.native
  
  @JSImport("safe-timers", "maxInterval")
  @js.native
  val maxInterval: Double = js.native
  
  @JSImport("safe-timers", "setInterval")
  @js.native
  def setInterval[T /* <: js.Array[_] */](
    callback: js.Function1[/* args */ T, Unit],
    interval: Double,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): Interval = js.native
  
  @JSImport("safe-timers", "setTimeout")
  @js.native
  def setTimeout[T /* <: js.Array[_] */](
    callback: js.Function1[/* args */ T, Unit],
    interval: Double,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): Timeout = js.native
  
  @JSImport("safe-timers", "setTimeoutAt")
  @js.native
  def setTimeoutAt[T /* <: js.Array[_] */](
    callback: js.Function1[/* args */ T, Unit],
    timestamp: Double,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): Timeout = js.native
}
