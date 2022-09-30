package typings.snapchatLensStudio

import typings.snapchatLensStudio.snapchatLensStudioStrings.enabled
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An event that gets triggered after a delay. */
trait DelayedCallbackEvent
  extends StObject
     with SceneEvent[DelayedCallbackEvent] {
  
  /** Returns the total delay time in seconds set on the event. */
  def getDelayTime(): Double
  
  /** Returns the current time in seconds left in the event’s delay. */
  def getTimeLeft(): Double
  
  /** Calling this will cause the event to trigger in time seconds. */
  def reset(time: Double): Unit
}
object DelayedCallbackEvent {
  
  inline def apply(
    bind: js.Function1[/* eventData */ Omit[DelayedCallbackEvent, enabled], Unit] => Unit,
    enabled: Boolean,
    getDelayTime: () => Double,
    getTimeLeft: () => Double,
    getTypeName: () => String,
    isOfType: String => Boolean,
    reset: Double => Unit
  ): DelayedCallbackEvent = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), enabled = enabled.asInstanceOf[js.Any], getDelayTime = js.Any.fromFunction0(getDelayTime), getTimeLeft = js.Any.fromFunction0(getTimeLeft), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), reset = js.Any.fromFunction1(reset))
    __obj.asInstanceOf[DelayedCallbackEvent]
  }
  
  extension [Self <: DelayedCallbackEvent](x: Self) {
    
    inline def setGetDelayTime(value: () => Double): Self = StObject.set(x, "getDelayTime", js.Any.fromFunction0(value))
    
    inline def setGetTimeLeft(value: () => Double): Self = StObject.set(x, "getTimeLeft", js.Any.fromFunction0(value))
    
    inline def setReset(value: Double => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
  }
}
