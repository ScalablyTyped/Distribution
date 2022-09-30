package typings.snapchatLensStudio

import typings.snapchatLensStudio.snapchatLensStudioStrings.enabled
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This event is triggered when the user taps on the screen. */
trait TapEvent
  extends StObject
     with SceneObjectEvent {
  
  /** Returns the normalized 2D screen position of the user’s tap. The normalized coordinates range from ([0-1], [0-1]), (0,0) being top-left and (1,1) being bottom-right. */
  def getTapPosition(): vec2
}
object TapEvent {
  
  inline def apply(
    bind: js.Function1[/* eventData */ Omit[SceneObjectEvent, enabled], Unit] => Unit,
    enabled: Boolean,
    getSceneObject: () => SceneObject,
    getTapPosition: () => vec2,
    getTypeName: () => String,
    isOfType: String => Boolean
  ): TapEvent = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), enabled = enabled.asInstanceOf[js.Any], getSceneObject = js.Any.fromFunction0(getSceneObject), getTapPosition = js.Any.fromFunction0(getTapPosition), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[TapEvent]
  }
  
  extension [Self <: TapEvent](x: Self) {
    
    inline def setGetTapPosition(value: () => vec2): Self = StObject.set(x, "getTapPosition", js.Any.fromFunction0(value))
  }
}
