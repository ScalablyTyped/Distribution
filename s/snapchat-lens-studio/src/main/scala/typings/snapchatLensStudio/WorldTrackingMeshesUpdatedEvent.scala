package typings.snapchatLensStudio

import typings.snapchatLensStudio.snapchatLensStudioStrings.enabled
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Triggered when world tracking meshes are updated. Only available when a Device Tracking component is in the scene, and world mesh tracking is supported and enabled. */
trait WorldTrackingMeshesUpdatedEvent
  extends StObject
     with SceneEvent[WorldTrackingMeshesUpdatedEvent] {
  
  /** Returns an array of TrackedMeshes that were updated. */
  def getMeshes(): js.Array[TrackedMesh]
}
object WorldTrackingMeshesUpdatedEvent {
  
  inline def apply(
    bind: js.Function1[/* eventData */ Omit[WorldTrackingMeshesUpdatedEvent, enabled], Unit] => Unit,
    enabled: Boolean,
    getMeshes: () => js.Array[TrackedMesh],
    getTypeName: () => String,
    isOfType: String => Boolean
  ): WorldTrackingMeshesUpdatedEvent = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), enabled = enabled.asInstanceOf[js.Any], getMeshes = js.Any.fromFunction0(getMeshes), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[WorldTrackingMeshesUpdatedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorldTrackingMeshesUpdatedEvent] (val x: Self) extends AnyVal {
    
    inline def setGetMeshes(value: () => js.Array[TrackedMesh]): Self = StObject.set(x, "getMeshes", js.Any.fromFunction0(value))
  }
}
