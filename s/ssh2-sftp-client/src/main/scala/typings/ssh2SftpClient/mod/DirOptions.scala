package typings.ssh2SftpClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirOptions extends StObject {
  
  var filter: js.UndefOr[DirFilterFunction] = js.undefined
}
object DirOptions {
  
  inline def apply(): DirOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirOptions] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: (/* filePath */ String, /* isDirectory */ Boolean) => Boolean): Self = StObject.set(x, "filter", js.Any.fromFunction2(value))
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
