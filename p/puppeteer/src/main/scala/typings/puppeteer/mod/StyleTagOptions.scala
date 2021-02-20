package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleTagOptions extends StObject {
  
  /** Raw CSS content to be injected into frame. */
  var content: js.UndefOr[String] = js.native
  
  /** Path to the CSS file to be injected into frame. If `path` is a relative path, then it is resolved relative to current working directory. */
  var path: js.UndefOr[String] = js.native
  
  /** Url of the <link> tag. */
  var url: js.UndefOr[String] = js.native
}
object StyleTagOptions {
  
  @scala.inline
  def apply(): StyleTagOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StyleTagOptions]
  }
  
  @scala.inline
  implicit class StyleTagOptionsMutableBuilder[Self <: StyleTagOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
