package typings.puppeteerCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameAddStyleTagOptions extends StObject {
  
  /**
    * Raw CSS content to be injected into the frame.
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * The path to a CSS file to be injected into the frame.
    * @remarks
    * If `path` is a relative path, it is resolved relative to the current
    * working directory (`process.cwd()` in Node.js).
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * the URL of the CSS file to be added.
    */
  var url: js.UndefOr[String] = js.undefined
}
object FrameAddStyleTagOptions {
  
  inline def apply(): FrameAddStyleTagOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrameAddStyleTagOptions]
  }
  
  extension [Self <: FrameAddStyleTagOptions](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
