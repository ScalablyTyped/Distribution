package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FontFaceSource extends StObject {
  
  /** [MDN Reference](https://developer.mozilla.org/docs/Web/API/Document/fonts) */
  /* standard dom */
  val fonts: FontFaceSet
}
object FontFaceSource {
  
  inline def apply(fonts: FontFaceSet): FontFaceSource = {
    val __obj = js.Dynamic.literal(fonts = fonts.asInstanceOf[js.Any])
    __obj.asInstanceOf[FontFaceSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FontFaceSource] (val x: Self) extends AnyVal {
    
    inline def setFonts(value: FontFaceSet): Self = StObject.set(x, "fonts", value.asInstanceOf[js.Any])
  }
}
