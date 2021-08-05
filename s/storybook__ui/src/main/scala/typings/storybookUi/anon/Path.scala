package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path extends StObject {
  
  var path: js.Array[String]
  
  var refId: String
}
object Path {
  
  inline def apply(path: js.Array[String], refId: String): Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], refId = refId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
  
  extension [Self <: Path](x: Self) {
    
    inline def setPath(value: js.Array[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathVarargs(value: String*): Self = StObject.set(x, "path", js.Array(value :_*))
    
    inline def setRefId(value: String): Self = StObject.set(x, "refId", value.asInstanceOf[js.Any])
  }
}
