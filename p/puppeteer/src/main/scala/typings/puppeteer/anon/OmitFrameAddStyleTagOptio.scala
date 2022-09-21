package typings.puppeteer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<puppeteer.puppeteer.FrameAddStyleTagOptions, 'url'> */
trait OmitFrameAddStyleTagOptio extends StObject {
  
  var content: js.UndefOr[String] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
}
object OmitFrameAddStyleTagOptio {
  
  inline def apply(): OmitFrameAddStyleTagOptio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmitFrameAddStyleTagOptio]
  }
  
  extension [Self <: OmitFrameAddStyleTagOptio](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
