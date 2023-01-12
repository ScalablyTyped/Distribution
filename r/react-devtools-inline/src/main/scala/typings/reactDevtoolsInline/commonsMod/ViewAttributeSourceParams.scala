package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewAttributeSourceParams
  extends StObject
     with ElementAndRendererID {
  
  var path: js.Array[String | Double]
}
object ViewAttributeSourceParams {
  
  inline def apply(id: Double, path: js.Array[String | Double], rendererID: RendererID): ViewAttributeSourceParams = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], rendererID = rendererID.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewAttributeSourceParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewAttributeSourceParams] (val x: Self) extends AnyVal {
    
    inline def setPath(value: js.Array[String | Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value*))
  }
}
