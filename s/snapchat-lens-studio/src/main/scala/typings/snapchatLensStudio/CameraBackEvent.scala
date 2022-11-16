package typings.snapchatLensStudio

import typings.snapchatLensStudio.snapchatLensStudioStrings.enabled
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Triggered when the device’s back facing camera becomes active. */
/** 
NOTE: Rewritten from type alias:
{{{
type CameraBackEvent = snapchat-lens-studio.SceneEvent<snapchat-lens-studio.CameraBackEvent>
}}}
to avoid circular code involving: 
- snapchat-lens-studio.CameraBackEvent
*/
trait CameraBackEvent
  extends StObject
     with SceneEvent[CameraBackEvent]
object CameraBackEvent {
  
  inline def apply(
    bind: js.Function1[/* eventData */ Omit[CameraBackEvent, enabled], Unit] => Unit,
    enabled: Boolean,
    getTypeName: () => String,
    isOfType: String => Boolean
  ): CameraBackEvent = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), enabled = enabled.asInstanceOf[js.Any], getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[CameraBackEvent]
  }
}
