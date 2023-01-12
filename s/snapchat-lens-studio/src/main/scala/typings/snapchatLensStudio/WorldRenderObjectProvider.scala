package typings.snapchatLensStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provider for RenderMesh data representing the estimated shape of real world objects generated from depth information. Only available when world mesh tracking is supported and enabled. Lens Studio
  * v3.2+
  */
trait WorldRenderObjectProvider
  extends StObject
     with ScriptObject {
  
  /** Enable or disable world mesh tracking. */
  var enableWorldMeshesTracking: Boolean
  
  /** Returns the number of faces of the mesh. */
  var faceCount: Double
  
  /** Mesh classification format being used. */
  var meshClassificationFormat: MeshClassificationFormat
  
  /** Enable or disable normal direction usage. */
  var useNormals: Boolean
  
  /** Returns the number of vertices of the mesh. */
  var vertexCount: Double
}
object WorldRenderObjectProvider {
  
  inline def apply(
    enableWorldMeshesTracking: Boolean,
    faceCount: Double,
    getTypeName: () => String,
    isOfType: String => Boolean,
    meshClassificationFormat: MeshClassificationFormat,
    useNormals: Boolean,
    vertexCount: Double
  ): WorldRenderObjectProvider = {
    val __obj = js.Dynamic.literal(enableWorldMeshesTracking = enableWorldMeshesTracking.asInstanceOf[js.Any], faceCount = faceCount.asInstanceOf[js.Any], getTypeName = js.Any.fromFunction0(getTypeName), isOfType = js.Any.fromFunction1(isOfType), meshClassificationFormat = meshClassificationFormat.asInstanceOf[js.Any], useNormals = useNormals.asInstanceOf[js.Any], vertexCount = vertexCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorldRenderObjectProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorldRenderObjectProvider] (val x: Self) extends AnyVal {
    
    inline def setEnableWorldMeshesTracking(value: Boolean): Self = StObject.set(x, "enableWorldMeshesTracking", value.asInstanceOf[js.Any])
    
    inline def setFaceCount(value: Double): Self = StObject.set(x, "faceCount", value.asInstanceOf[js.Any])
    
    inline def setMeshClassificationFormat(value: MeshClassificationFormat): Self = StObject.set(x, "meshClassificationFormat", value.asInstanceOf[js.Any])
    
    inline def setUseNormals(value: Boolean): Self = StObject.set(x, "useNormals", value.asInstanceOf[js.Any])
    
    inline def setVertexCount(value: Double): Self = StObject.set(x, "vertexCount", value.asInstanceOf[js.Any])
  }
}
