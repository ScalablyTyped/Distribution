package typings.snapchatLensStudio

import typings.snapchatLensStudio.snapchatLensStudioStrings.enabled
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Triggered when new world tracking meshes are detected. Only available when a Device Tracking component is in the scene, and world mesh tracking is supported and enabled. */
trait WorldTrackingMeshesAddedEvent
  extends StObject
     with SceneEvent[WorldTrackingMeshesAddedEvent] {
  
  /** Returns an array of newly added Tracked Meshes. */
  def getMeshes(): js.Array[TrackedMesh]
}
object WorldTrackingMeshesAddedEvent {
  
  inline def apply(
    bind: js.Function1[/* eventData */ Omit[WorldTrackingMeshesAddedEvent, enabled], Unit] => Unit,
    enabled: Boolean,
    getMeshes: () => js.Array[TrackedMesh],
    getTypeName: () => String,
    isOfType: String => Boolean
  ): WorldTrackingMeshesAddedEvent = {
    val __obj = js.Dynamic.literal(bind = js.Any.fromFunction1(bind), enabled = enabled.asInstanceOf[js.Any], getMeshes = js.Any.fromFunction0(getMeshes), getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[WorldTrackingMeshesAddedEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorldTrackingMeshesAddedEvent] (val x: Self) extends AnyVal {
    
    inline def setGetMeshes(value: () => js.Array[TrackedMesh]): Self = StObject.set(x, "getMeshes", js.Any.fromFunction0(value))
  }
}
