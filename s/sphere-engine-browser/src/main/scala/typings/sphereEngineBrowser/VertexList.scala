package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stores vertex data for a `Shape` directly on the GPU.
  */
trait VertexList extends StObject {
  
  /* private */ var _workaround: Null
}
object VertexList {
  
  inline def apply(_workaround: Null): VertexList = {
    val __obj = js.Dynamic.literal(_workaround = _workaround.asInstanceOf[js.Any])
    __obj.asInstanceOf[VertexList]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VertexList] (val x: Self) extends AnyVal {
    
    inline def set_workaround(value: Null): Self = StObject.set(x, "_workaround", value.asInstanceOf[js.Any])
  }
}
