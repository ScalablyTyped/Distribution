package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilePropertyBag
  extends StObject
     with BlobPropertyBag {
  
  /* standard dom */
  var lastModified: js.UndefOr[Double] = js.undefined
}
object FilePropertyBag {
  
  inline def apply(): FilePropertyBag = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePropertyBag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilePropertyBag] (val x: Self) extends AnyVal {
    
    inline def setLastModified(value: Double): Self = StObject.set(x, "lastModified", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedUndefined: Self = StObject.set(x, "lastModified", js.undefined)
  }
}
