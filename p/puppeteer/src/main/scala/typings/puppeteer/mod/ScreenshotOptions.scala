package typings.puppeteer.mod

import typings.puppeteer.puppeteerStrings.base64
import typings.puppeteer.puppeteerStrings.binary
import typings.puppeteer.puppeteerStrings.jpeg
import typings.puppeteer.puppeteerStrings.png
import typings.puppeteer.puppeteerStrings.webp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenshotOptions extends StObject {
  
  /**
    * Capture the screenshot beyond the viewport.
    * @defaultValue `true`
    */
  var captureBeyondViewport: js.UndefOr[Boolean] = js.undefined
  
  /**
    * An object which specifies the clipping region of the page.
    */
  var clip: js.UndefOr[ScreenshotClip] = js.undefined
  
  /**
    * Encoding of the image.
    * @defaultValue `binary`
    */
  var encoding: js.UndefOr[base64 | binary] = js.undefined
  
  /**
    * Capture the screenshot from the surface, rather than the view.
    * @defaultValue `true`
    */
  var fromSurface: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When `true`, takes a screenshot of the full page.
    * @defaultValue `false`
    */
  var fullPage: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Hides default white background and allows capturing screenshots with transparency.
    * @defaultValue `false`
    */
  var omitBackground: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The file path to save the image to. The screenshot type will be inferred
    * from file extension. If path is a relative path, then it is resolved
    * relative to current working directory. If no path is provided, the image
    * won't be saved to the disk.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Quality of the image, between 0-100. Not applicable to `png` images.
    */
  var quality: js.UndefOr[Double] = js.undefined
  
  /**
    * @defaultValue `png`
    */
  var `type`: js.UndefOr[png | jpeg | webp] = js.undefined
}
object ScreenshotOptions {
  
  inline def apply(): ScreenshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScreenshotOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScreenshotOptions] (val x: Self) extends AnyVal {
    
    inline def setCaptureBeyondViewport(value: Boolean): Self = StObject.set(x, "captureBeyondViewport", value.asInstanceOf[js.Any])
    
    inline def setCaptureBeyondViewportUndefined: Self = StObject.set(x, "captureBeyondViewport", js.undefined)
    
    inline def setClip(value: ScreenshotClip): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    inline def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    inline def setEncoding(value: base64 | binary): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    inline def setFromSurface(value: Boolean): Self = StObject.set(x, "fromSurface", value.asInstanceOf[js.Any])
    
    inline def setFromSurfaceUndefined: Self = StObject.set(x, "fromSurface", js.undefined)
    
    inline def setFullPage(value: Boolean): Self = StObject.set(x, "fullPage", value.asInstanceOf[js.Any])
    
    inline def setFullPageUndefined: Self = StObject.set(x, "fullPage", js.undefined)
    
    inline def setOmitBackground(value: Boolean): Self = StObject.set(x, "omitBackground", value.asInstanceOf[js.Any])
    
    inline def setOmitBackgroundUndefined: Self = StObject.set(x, "omitBackground", js.undefined)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    inline def setType(value: png | jpeg | webp): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
