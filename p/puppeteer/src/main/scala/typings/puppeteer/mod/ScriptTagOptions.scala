package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScriptTagOptions extends StObject {
  
  /** Raw JavaScript content to be injected into frame. */
  var content: js.UndefOr[String] = js.native
  
  /** Path to the JavaScript file to be injected into frame. If `path` is a relative path, then it is resolved relative to current working directory. */
  var path: js.UndefOr[String] = js.native
  
  /** Script type. Use 'module' in order to load a Javascript ES6 module. */
  var `type`: js.UndefOr[String] = js.native
  
  /** Url of a script to be added. */
  var url: js.UndefOr[String] = js.native
}
object ScriptTagOptions {
  
  @scala.inline
  def apply(): ScriptTagOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScriptTagOptions]
  }
  
  @scala.inline
  implicit class ScriptTagOptionsMutableBuilder[Self <: ScriptTagOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
