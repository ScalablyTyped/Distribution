package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetcherOptions extends StObject {
  
  /** A download host to be used. Defaults to `https://storage.googleapis.com`. */
  var host: js.UndefOr[String] = js.native
  
  /** A path for the downloads folder. Defaults to `<root>/.local-chromium`, where `<root>` is puppeteer's package root. */
  var path: js.UndefOr[String] = js.native
  
  /** Possible values are: `mac`, `win32`, `win64`, `linux`. Defaults to the current platform. */
  var platform: js.UndefOr[Platform] = js.native
  
  /**
    * @default 'chrome'
    */
  var product: js.UndefOr[Product_] = js.native
}
object FetcherOptions {
  
  @scala.inline
  def apply(): FetcherOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetcherOptions]
  }
  
  @scala.inline
  implicit class FetcherOptionsMutableBuilder[Self <: FetcherOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    
    @scala.inline
    def setProduct(value: Product_): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
  }
}
