package typings.snapchatLensStudio

import typings.snapchatLensStudio.snapchatLensStudioStrings.enabled
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Triggered every frame. */
trait UpdateEvent
  extends StObject
     with SceneEvent[UpdateEvent] {
  
  /** Returns the time elapsed ( seconds: in) between the current frame and previous frame. */
  def getDeltaTime(): Double
}
object UpdateEvent {
  
  inline def apply(
    bind: js.Function1[/* eventData */ Omit[UpdateEvent, enabled], Unit] => Unit,
    enabled: Boolean,
    getDeltaTime: () => Double,
    getTypeName: () => String,
    isOfType: String => Boolean
  ): UpdateEvent = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), enabled = enabled.asInstanceOf[js.Any], getDeltaTime = js.Any.fromFunction0(getDeltaTime), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[UpdateEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateEvent] (val x: Self) extends AnyVal {
    
    inline def setGetDeltaTime(value: () => Double): Self = StObject.set(x, "getDeltaTime", js.Any.fromFunction0(value))
  }
}
