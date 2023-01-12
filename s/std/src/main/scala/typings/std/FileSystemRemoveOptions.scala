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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileSystemRemoveOptions] (val x: Self) extends AnyVal {
    
    inline def setRecursive(value: scala.Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
