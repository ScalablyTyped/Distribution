package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePath
  extends StObject
     with ElementAndRendererID {
  
  var hookID: js.UndefOr[Double | Null] = js.undefined
  
  var path: js.Array[String | Double]
  
  var `type`: PathType
}
object DeletePath {
  
  inline def apply(id: Double, path: js.Array[String | Double], rendererID: RendererID, `type`: PathType): DeletePath = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], rendererID = rendererID.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeletePath] (val x: Self) extends AnyVal {
    
    inline def setHookID(value: Double): Self = StObject.set(x, "hookID", value.asInstanceOf[js.Any])
    
    inline def setHookIDNull: Self = StObject.set(x, "hookID", null)
    
    inline def setHookIDUndefined: Self = StObject.set(x, "hookID", js.undefined)
    
    inline def setPath(value: js.Array[String | Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value*))
    
    inline def setType(value: PathType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
