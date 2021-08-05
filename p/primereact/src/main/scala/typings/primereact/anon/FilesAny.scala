package typings.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilesAny extends StObject {
  
  var files: js.Any
}
object FilesAny {
  
  inline def apply(files: js.Any): FilesAny = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilesAny]
  }
  
  extension [Self <: FilesAny](x: Self) {
    
    inline def setFiles(value: js.Any): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
  }
}
