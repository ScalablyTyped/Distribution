package typings.snapchatLensStudio

import typings.snapchatLensStudio.snapchatLensStudioStrings.enabled
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** If a DeviceTracking component is present in the scene, this event is triggered when the tracking is restarted (typically when the Lens starts, or if the user taps the ground). */
trait SurfaceTrackingResetEvent
  extends StObject
     with SceneEvent[SurfaceTrackingResetEvent]
object SurfaceTrackingResetEvent {
  
  inline def apply(
    bind: js.Function1[/* eventData */ Omit[SurfaceTrackingResetEvent, enabled], Unit] => Unit,
    enabled: Boolean,
    getTypeName: () => String,
    isOfType: String => Boolean
  ): SurfaceTrackingResetEvent = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), enabled = enabled.asInstanceOf[js.Any], getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[SurfaceTrackingResetEvent]
  }
}
