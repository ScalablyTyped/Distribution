package typings.safeTimers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("safe-timers", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def clearInterval(interval: Interval): Unit = js.native
  
  def clearTimeout(timeout: Timeout): Unit = js.native
  
  val maxInterval: Double = js.native
  
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
}
