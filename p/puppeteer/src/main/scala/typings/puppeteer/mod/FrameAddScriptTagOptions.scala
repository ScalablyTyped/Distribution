package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FrameAddScriptTagOptions extends StObject {
  
  /**
    * JavaScript to be injected into the frame.
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the `id` of the script.
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Path to a JavaScript file to be injected into the frame.
    *
    * @remarks
    * If `path` is a relative path, it is resolved relative to the current
    * working directory (`process.cwd()` in Node.js).
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Sets the `type` of the script. Use `module` in order to load an ES2015 module.
    */
  var `type`: js.UndefOr[String] = js.undefined
  
  /**
    * URL of the script to be added.
    */
  var url: js.UndefOr[String] = js.undefined
}
object FrameAddScriptTagOptions {
  
  inline def apply(): FrameAddScriptTagOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FrameAddScriptTagOptions]
  }
  
  extension [Self <: FrameAddScriptTagOptions](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
