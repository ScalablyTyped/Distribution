package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Stores a list of numeric indices directly on the GPU that specify which entries in a vertex list
  * are used for a `Shape`.
  */
trait IndexList extends StObject {
  
  /* private */ var _workaround: Null
}
object IndexList {
  
  inline def apply(_workaround: Null): IndexList = {
    val __obj = js.Dynamic.literal(_workaround = _workaround.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexList]
  }
  
  extension [Self <: IndexList](x: Self) {
    
    inline def set_workaround(value: Null): Self = StObject.set(x, "_workaround", value.asInstanceOf[js.Any])
  }
}
