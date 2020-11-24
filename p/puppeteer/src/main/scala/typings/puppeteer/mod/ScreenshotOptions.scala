package typings.puppeteer.mod

import typings.puppeteer.puppeteerStrings.base64
import typings.puppeteer.puppeteerStrings.binary
import typings.puppeteer.puppeteerStrings.jpeg
import typings.puppeteer.puppeteerStrings.png
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScreenshotOptions extends js.Object {
  
  /**
    * An object which specifies clipping region of the page.
    */
  var clip: js.UndefOr[BoundingBox] = js.native
  
  /**
    * The encoding of the image, can be either base64 or binary.
    * @default binary
    */
  var encoding: js.UndefOr[base64 | binary] = js.native
  
  /**
    * When true, takes a screenshot of the full scrollable page.
    * @default false
    */
  var fullPage: js.UndefOr[Boolean] = js.native
  
  /**
    * Hides default white background and allows capturing screenshots with transparency.
    * @default false
    */
  var omitBackground: js.UndefOr[Boolean] = js.native
  
  /**
    * The file path to save the image to. The screenshot type will be inferred from file extension.
    * If `path` is a relative path, then it is resolved relative to current working directory.
    * If no path is provided, the image won't be saved to the disk.
    */
  var path: js.UndefOr[String] = js.native
  
  /** The quality of the image, between 0-100. Not applicable to png images. */
  var quality: js.UndefOr[Double] = js.native
  
  /**
    * The screenshot type.
    * @default png
    */
  var `type`: js.UndefOr[jpeg | png] = js.native
}
object ScreenshotOptions {
  
  @scala.inline
  def apply(): ScreenshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScreenshotOptions]
  }
  
  @scala.inline
  implicit class ScreenshotOptionsOps[Self <: ScreenshotOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClip(value: BoundingBox): Self = this.set("clip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClip: Self = this.set("clip", js.undefined)
    
    @scala.inline
    def setEncoding(value: base64 | binary): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setFullPage(value: Boolean): Self = this.set("fullPage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullPage: Self = this.set("fullPage", js.undefined)
    
    @scala.inline
    def setOmitBackground(value: Boolean): Self = this.set("omitBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOmitBackground: Self = this.set("omitBackground", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setQuality(value: Double): Self = this.set("quality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuality: Self = this.set("quality", js.undefined)
    
    @scala.inline
    def setType(value: jpeg | png): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
