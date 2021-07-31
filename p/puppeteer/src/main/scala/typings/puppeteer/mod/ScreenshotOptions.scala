package typings.puppeteer.mod

import typings.puppeteer.puppeteerStrings.base64
import typings.puppeteer.puppeteerStrings.binary
import typings.puppeteer.puppeteerStrings.jpeg
import typings.puppeteer.puppeteerStrings.png
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScreenshotOptions extends StObject {
  
  /**
    * An object which specifies clipping region of the page.
    */
  var clip: js.UndefOr[BoundingBox] = js.undefined
  
  /**
    * The encoding of the image, can be either base64 or binary.
    * @default binary
    */
  var encoding: js.UndefOr[base64 | binary] = js.undefined
  
  /**
    * When true, takes a screenshot of the full scrollable page.
    * @default false
    */
  var fullPage: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Hides default white background and allows capturing screenshots with transparency.
    * @default false
    */
  var omitBackground: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The file path to save the image to. The screenshot type will be inferred from file extension.
    * If `path` is a relative path, then it is resolved relative to current working directory.
    * If no path is provided, the image won't be saved to the disk.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /** The quality of the image, between 0-100. Not applicable to png images. */
  var quality: js.UndefOr[Double] = js.undefined
  
  /**
    * The screenshot type.
    * @default png
    */
  var `type`: js.UndefOr[jpeg | png] = js.undefined
}
object ScreenshotOptions {
  
  @scala.inline
  def apply(): ScreenshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScreenshotOptions]
  }
  
  @scala.inline
  implicit class ScreenshotOptionsMutableBuilder[Self <: ScreenshotOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClip(value: BoundingBox): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
    
    @scala.inline
    def setEncoding(value: base64 | binary): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setFullPage(value: Boolean): Self = StObject.set(x, "fullPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullPageUndefined: Self = StObject.set(x, "fullPage", js.undefined)
    
    @scala.inline
    def setOmitBackground(value: Boolean): Self = StObject.set(x, "omitBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOmitBackgroundUndefined: Self = StObject.set(x, "omitBackground", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    
    @scala.inline
    def setType(value: jpeg | png): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
