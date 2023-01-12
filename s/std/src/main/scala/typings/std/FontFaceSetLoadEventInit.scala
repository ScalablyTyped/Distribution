package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFaceSetLoadEventInit
  extends StObject
     with EventInit {
  
  /* standard dom */
  var fontfaces: js.UndefOr[js.Array[FontFace]] = js.undefined
}
object FontFaceSetLoadEventInit {
  
  inline def apply(): FontFaceSetLoadEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FontFaceSetLoadEventInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontFaceSetLoadEventInit] (val x: Self) extends AnyVal {
    
    inline def setFontfaces(value: js.Array[FontFace]): Self = StObject.set(x, "fontfaces", value.asInstanceOf[js.Any])
    
    inline def setFontfacesUndefined: Self = StObject.set(x, "fontfaces", js.undefined)
    
    inline def setFontfacesVarargs(value: FontFace*): Self = StObject.set(x, "fontfaces", js.Array(value*))
  }
}
