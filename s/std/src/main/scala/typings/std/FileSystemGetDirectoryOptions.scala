package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemGetDirectoryOptions extends StObject {
  
  /* standard dom */
  var create: js.UndefOr[scala.Boolean] = js.undefined
}
object FileSystemGetDirectoryOptions {
  
  inline def apply(): FileSystemGetDirectoryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemGetDirectoryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileSystemGetDirectoryOptions] (val x: Self) extends AnyVal {
    
    inline def setCreate(value: scala.Boolean): Self = StObject.set(x, "create", value.asInstanceOf[js.Any])
    
    inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
  }
}
