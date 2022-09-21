package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemRemoveOptions extends StObject {
  
  /* standard dom */
  var recursive: js.UndefOr[scala.Boolean] = js.undefined
}
object FileSystemRemoveOptions {
  
  inline def apply(): FileSystemRemoveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemRemoveOptions]
  }
  
  extension [Self <: FileSystemRemoveOptions](x: Self) {
    
    inline def setRecursive(value: scala.Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
