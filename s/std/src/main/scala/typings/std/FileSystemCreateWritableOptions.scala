package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileSystemCreateWritableOptions extends StObject {
  
  /* standard dom */
  var keepExistingData: js.UndefOr[scala.Boolean] = js.undefined
}
object FileSystemCreateWritableOptions {
  
  inline def apply(): FileSystemCreateWritableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileSystemCreateWritableOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileSystemCreateWritableOptions] (val x: Self) extends AnyVal {
    
    inline def setKeepExistingData(value: scala.Boolean): Self = StObject.set(x, "keepExistingData", value.asInstanceOf[js.Any])
    
    inline def setKeepExistingDataUndefined: Self = StObject.set(x, "keepExistingData", js.undefined)
  }
}
