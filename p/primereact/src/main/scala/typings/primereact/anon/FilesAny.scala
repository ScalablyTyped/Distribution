package typings.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilesAny extends StObject {
  
  var files: js.Any
}
object FilesAny {
  
  @scala.inline
  def apply(files: js.Any): FilesAny = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilesAny]
  }
  
  @scala.inline
  implicit class FilesAnyMutableBuilder[Self <: FilesAny] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFiles(value: js.Any): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
  }
}
