package typings.simpleDiff

import typings.simpleDiff.mod.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait NewPath extends StObject {
    
    var newPath: Path
    
    var oldPath: Path
  }
  object NewPath {
    
    inline def apply(newPath: Path, oldPath: Path): NewPath = {
      val __obj = js.Dynamic.literal(newPath = newPath.asInstanceOf[js.Any], oldPath = oldPath.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewPath]
    }
    
    extension [Self <: NewPath](x: Self) {
      
      inline def setNewPath(value: Path): Self = StObject.set(x, "newPath", value.asInstanceOf[js.Any])
      
      inline def setNewPathVarargs(value: (String | Double)*): Self = StObject.set(x, "newPath", js.Array(value :_*))
      
      inline def setOldPath(value: Path): Self = StObject.set(x, "oldPath", value.asInstanceOf[js.Any])
      
      inline def setOldPathVarargs(value: (String | Double)*): Self = StObject.set(x, "oldPath", js.Array(value :_*))
    }
  }
}
