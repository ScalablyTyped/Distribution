package typings.reactNativeBackgroundTimer

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-native-background-timer", JSImport.Default)
  @js.native
  val default: BackgroundTimer = js.native
  
  /*~ You can declare properties of the module using const, let, or var */
  @js.native
  trait BackgroundTimer extends StObject {
    
    def backgroundClockMethod(callback: js.Function0[Unit], delay: Double): Unit = js.native
    
    def clearInterval(intervalId: IntervalId): Unit = js.native
    
    def clearTimeout(timeoutId: TimeoutId): Unit = js.native
    
    def runBackgroundTimer(callback: js.Function0[Unit], delay: Double): Unit = js.native
    
    def setInterval(callback: js.Function0[Unit], timeout: Double): IntervalId = js.native
    
    def setTimeout(callback: js.Function0[Unit], timeout: Double): TimeoutId = js.native
    
    def start(): js.Any = js.native
    def start(delay: Double): js.Any = js.native
    
    def stop(): Unit = js.native
    
    def stopBackgroundTimer(): Unit = js.native
  }
  
  type IntervalId = Double
  
  type TimeoutId = Double
  
  type _To = BackgroundTimer
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: BackgroundTimer = default
}
