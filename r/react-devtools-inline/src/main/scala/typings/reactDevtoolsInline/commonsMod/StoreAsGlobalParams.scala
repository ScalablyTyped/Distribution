package typings.reactDevtoolsInline.commonsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoreAsGlobalParams
  extends StObject
     with ElementAndRendererID {
  
  var count: Double
  
  var path: js.Array[String | Double]
}
object StoreAsGlobalParams {
  
  inline def apply(count: Double, id: Double, path: js.Array[String | Double], rendererID: RendererID): StoreAsGlobalParams = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], rendererID = rendererID.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreAsGlobalParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StoreAsGlobalParams] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setPath(value: js.Array[String | Double]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: (String | Double)*): Self = StObject.set(x, "path", js.Array(value*))
  }
}
