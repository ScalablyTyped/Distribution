package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StyleTagOptions extends StObject {
  
  /** Raw CSS content to be injected into frame. */
  var content: js.UndefOr[String] = js.undefined
  
  /** Path to the CSS file to be injected into frame. If `path` is a relative path, then it is resolved relative to current working directory. */
  var path: js.UndefOr[String] = js.undefined
  
  /** Url of the <link> tag. */
  var url: js.UndefOr[String] = js.undefined
}
object StyleTagOptions {
  
  inline def apply(): StyleTagOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleTagOptions]
  }
  
  extension [Self <: StyleTagOptions](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
