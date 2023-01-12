package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides information about a TrackedMesh surface hit during a raycast. Is returned in an array when calling DeviceTracking.hitTestWorldMesh() or DeviceTracking.raycastWorldMesh(). */
trait TrackedMeshHitTestResult
  extends StObject
     with ScriptObject {
  
  /** Returns the classification of the mesh face at the intersection point. The classification values are: * 0: None * 1: Wall * 2: Floor * 3: Ceiling * 4: Table * 5: Seat * 6: Window * 7: Door */
  var classification: Double
  
  /** Returns the TrackedMesh that was hit. */
  var mesh: TrackedMesh
  
  /** Returns the world space normal direction of the intersection point. */
  var normal: vec3
  
  /** Returns the world space position of the intersection point. */
  var position: vec3
}
object TrackedMeshHitTestResult {
  
  inline def apply(
    classification: Double,
    getTypeName: () => String,
    isOfType: String => Boolean,
    mesh: TrackedMesh,
    normal: vec3,
    position: vec3
  ): TrackedMeshHitTestResult = {
    val __obj = js.Dynamic.literal(classification = classification.asInstanceOf[js.Any], getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), mesh = mesh.asInstanceOf[js.Any], normal = normal.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrackedMeshHitTestResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrackedMeshHitTestResult] (val x: Self) extends AnyVal {
    
    inline def setClassification(value: Double): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setMesh(value: TrackedMesh): Self = StObject.set(x, "mesh", value.asInstanceOf[js.Any])
    
    inline def setNormal(value: vec3): Self = StObject.set(x, "normal", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: vec3): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
