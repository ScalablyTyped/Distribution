package typings.snapchatLensStudio

import typings.snapchatLensStudio.snapchatLensStudioStrings.enabled
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Triggered when some world tracking meshes are no longer detected. Only available when a Device Tracking component is in the scene, and world mesh tracking is supported and enabled. */
trait WorldTrackingMeshesRemovedEvent
  extends StObject
     with SceneEvent[WorldTrackingMeshesRemovedEvent] {
  
  /** Returns an array of TrackedMeshes that are no longer detected. */
  def getMeshes(): js.Array[TrackedMesh]
}
object WorldTrackingMeshesRemovedEvent {
  
  inline def apply(
    bind: js.Function1[/* eventData */ Omit[WorldTrackingMeshesRemovedEvent, enabled], Unit] => Unit,
    enabled: Boolean,
    getMeshes: () => js.Array[TrackedMesh],
    getTypeName: () => String,
    isOfType: String => Boolean
  ): WorldTrackingMeshesRemovedEvent = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), enabled = enabled.asInstanceOf[js.Any], getMeshes = js.Any.fromFunction0(getMeshes), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[WorldTrackingMeshesRemovedEvent]
  }
  
  extension [Self <: WorldTrackingMeshesRemovedEvent](x: Self) {
    
    inline def setGetMeshes(value: () => js.Array[TrackedMesh]): Self = StObject.set(x, "getMeshes", js.Any.fromFunction0(value))
  }
}
