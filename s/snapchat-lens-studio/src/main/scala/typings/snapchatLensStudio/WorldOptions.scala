package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Holds settings for world mesh tracking in DeviceTracking component. Accessible through DeviceTracking.worldOptions. */
trait WorldOptions
  extends StObject
     with ScriptObject {
  
  /** Enables or disables world mesh classification gathering. */
  var enableWorldMeshesClassificationTracking: Boolean
  
  /** Enables or disables the generation of world meshes. */
  var enableWorldMeshesTracking: Boolean
}
object WorldOptions {
  
  inline def apply(
    enableWorldMeshesClassificationTracking: Boolean,
    enableWorldMeshesTracking: Boolean,
    getTypeName: () => String,
    isOfType: String => Boolean
  ): WorldOptions = {
    val __obj = js.Dynamic.literal(enableWorldMeshesClassificationTracking = enableWorldMeshesClassificationTracking.asInstanceOf[js.Any], enableWorldMeshesTracking = enableWorldMeshesTracking.asInstanceOf[js.Any], getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType))
    __obj.asInstanceOf[WorldOptions]
  }
  
  extension [Self <: WorldOptions](x: Self) {
    
    inline def setEnableWorldMeshesClassificationTracking(value: Boolean): Self = StObject.set(x, "enableWorldMeshesClassificationTracking", value.asInstanceOf[js.Any])
    
    inline def setEnableWorldMeshesTracking(value: Boolean): Self = StObject.set(x, "enableWorldMeshesTracking", value.asInstanceOf[js.Any])
  }
}
