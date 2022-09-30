package typings.snapchatLensStudio

import typings.snapchatLensStudio.snapchatLensStudioStrings.enabled
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Base class for all object-based Event types in Lens Studio (ManipulateStartEvent, TapEvent, etc.). */
trait SceneObjectEvent
  extends StObject
     with SceneEvent[SceneObjectEvent] {
  
  /** Returns the SceneObject this Event is associated with. */
  def getSceneObject(): SceneObject
}
object SceneObjectEvent {
  
  inline def apply(
    bind: js.Function1[/* eventData */ Omit[SceneObjectEvent, enabled], Unit] => Unit,
    enabled: Boolean,
    getSceneObject: () => SceneObject,
    getTypeName: () => String,
    isOfType: String => Boolean
  ): SceneObjectEvent = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), enabled = enabled.asInstanceOf[js.Any], getSceneObject = js.Any.fromFunction0(getSceneObject), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[SceneObjectEvent]
  }
  
  extension [Self <: SceneObjectEvent](x: Self) {
    
    inline def setGetSceneObject(value: () => SceneObject): Self = StObject.set(x, "getSceneObject", js.Any.fromFunction0(value))
  }
}
