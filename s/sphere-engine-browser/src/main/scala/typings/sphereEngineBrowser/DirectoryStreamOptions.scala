package typings.sphereEngineBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Specifies options for creating a new `DirectoryStream`.
  */
trait DirectoryStreamOptions extends StObject {
  
  /**
    * `true` to enable recursive enumeration. In this mode, the directory stream will list files
    * from all subdirectories, at any depth. Only file entries will be yielded in this case.
    * @default false
    */
  var recursive: js.UndefOr[Boolean] = js.undefined
}
object DirectoryStreamOptions {
  
  inline def apply(): DirectoryStreamOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectoryStreamOptions]
  }
  
  extension [Self <: DirectoryStreamOptions](x: Self) {
    
    inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
    
    inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
  }
}
