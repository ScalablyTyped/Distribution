package typings.snapchatLensStudio

import typings.snapchatLensStudio.snapchatLensStudioStrings.enabled
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Triggered when the lens turns off. */
/** 
NOTE: Rewritten from type alias:
{{{
type TurnOffEvent = snapchat-lens-studio.SceneEvent<snapchat-lens-studio.TurnOffEvent>
}}}
to avoid circular code involving: 
- snapchat-lens-studio.TurnOffEvent
*/
trait TurnOffEvent
  extends StObject
     with SceneEvent[TurnOffEvent]
object TurnOffEvent {
  
  inline def apply(
    bind: js.Function1[/* eventData */ Omit[TurnOffEvent, enabled], Unit] => Unit,
    enabled: Boolean,
    getTypeName: () => String,
    isOfType: String => Boolean
  ): TurnOffEvent = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), enabled = enabled.asInstanceOf[js.Any], getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[TurnOffEvent]
  }
}
