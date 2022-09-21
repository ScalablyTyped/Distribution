package typings.sentryUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Path extends StObject {
  
  var path: String
  
  var stack: js.Array[Name]
}
object Path {
  
  inline def apply(path: String, stack: js.Array[Name]): Path = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[Path]
  }
  
  extension [Self <: Path](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setStack(value: js.Array[Name]): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackVarargs(value: Name*): Self = StObject.set(x, "stack", js.Array(value*))
  }
}
