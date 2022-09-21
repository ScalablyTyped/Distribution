package typings.safeTimers

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("safe-timers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("safe-timers", "Interval")
  @js.native
  open class Interval () extends StObject {
    
    /**
      * Cancels interval.
      */
    def clear(): Unit = js.native
  }
  
  @JSImport("safe-timers", "Timeout")
  @js.native
  open class Timeout () extends StObject {
    
    /**
      * Cancels timeout.
      */
    def clear(): Unit = js.native
  }
  
  inline def clearInterval(interval: Interval): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearInterval")(interval.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clearTimeout(timeout: Timeout): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearTimeout")(timeout.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("safe-timers", "maxInterval")
  @js.native
  val maxInterval: Double = js.native
  
  inline def setInterval[T /* <: js.Array[Any] */](
    callback: js.Function1[/* args */ T, Unit],
    interval: Double,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): Interval = (^.asInstanceOf[js.Dynamic].applyDynamic("setInterval")(callback.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Interval]
  
  inline def setTimeout[T /* <: js.Array[Any] */](
    callback: js.Function1[/* args */ T, Unit],
    interval: Double,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): Timeout = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(callback.asInstanceOf[js.Any], interval.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Timeout]
  
  inline def setTimeoutAt[T /* <: js.Array[Any] */](
    callback: js.Function1[/* args */ T, Unit],
    timestamp: Double,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type T is not an array type */ args: T
  ): Timeout = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeoutAt")(callback.asInstanceOf[js.Any], timestamp.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Timeout]
}
