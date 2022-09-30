package typings.snapchatLensStudio

import typings.snapchatLensStudio.snapchatLensStudioStrings.enabled
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This is the base class for all face tracking events. This event won’t actually get triggered itself, so use one of the child classes instead. */
trait FaceTrackingEvent
  extends StObject
     with SceneEvent[FaceTrackingEvent] {
  
  /** The index of the face this event is tracking. Change this value to control which face the event tracks. */
  var faceIndex: Double
}
object FaceTrackingEvent {
  
  inline def apply(
    bind: js.Function1[/* eventData */ Omit[FaceTrackingEvent, enabled], Unit] => Unit,
    enabled: Boolean,
    faceIndex: Double,
    getTypeName: () => String,
    isOfType: String => Boolean
  ): FaceTrackingEvent = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), enabled = enabled.asInstanceOf[js.Any], faceIndex = faceIndex.asInstanceOf[js.Any], getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[FaceTrackingEvent]
  }
  
  extension [Self <: FaceTrackingEvent](x: Self) {
    
    inline def setFaceIndex(value: Double): Self = StObject.set(x, "faceIndex", value.asInstanceOf[js.Any])
  }
}
