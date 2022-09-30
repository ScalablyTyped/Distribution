package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenamePath
  extends StObject
     with ElementAndRendererID {
  
  var hookID: js.UndefOr[Double | Null] = js.undefined
  
  var newPath: js.Array[String | Double]
  
  var oldPath: js.Array[String | Double]
  
  var `type`: PathType
}
object RenamePath {
  
  inline def apply(
    id: Double,
    newPath: js.Array[String | Double],
    oldPath: js.Array[String | Double],
    rendererID: RendererID,
    `type`: PathType
  ): RenamePath = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], newPath = newPath.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any], rendererID = rendererID.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenamePath]
  }
  
  extension [Self <: RenamePath](x: Self) {
    
    inline def setHookID(value: Double): Self = StObject.set(x, "hookID", value.asInstanceOf[js.Any])
    
    inline def setHookIDNull: Self = StObject.set(x, "hookID", null)
    
    inline def setHookIDUndefined: Self = StObject.set(x, "hookID", js.undefined)
    
    inline def setNewPath(value: js.Array[String | Double]): Self = StObject.set(x, "newPath", value.asInstanceOf[js.Any])
    
    inline def setNewPathVarargs(value: (String | Double)*): Self = StObject.set(x, "newPath", js.Array(value*))
    
    inline def setOldPath(value: js.Array[String | Double]): Self = StObject.set(x, "oldPath", value.asInstanceOf[js.Any])
    
    inline def setOldPathVarargs(value: (String | Double)*): Self = StObject.set(x, "oldPath", js.Array(value*))
    
    inline def setType(value: PathType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
