package typings.puppeteerLottie.mod

import typings.lottieWeb.mod.CanvasRendererConfig
import typings.lottieWeb.mod.HTMLRendererConfig
import typings.lottieWeb.mod.SVGRendererConfig
import typings.puppeteer.mod.Browser
import typings.puppeteer.mod.LaunchOptions
import typings.puppeteerLottie.puppeteerLottieStrings.canvas
import typings.puppeteerLottie.puppeteerLottieStrings.html
import typings.puppeteerLottie.puppeteerLottieStrings.svg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration options
  */
@js.native
trait Options extends js.Object {
  
  /**
    * JSON exported animation data
    */
  var animationData: js.UndefOr[js.Object] = js.native
  
  /**
    * Optional puppeteer instance to reuse
    */
  var browser: js.UndefOr[Browser] = js.native
  
  /**
    * Window device scale factor
    * @default 1
    */
  var deviceScaleFactor: js.UndefOr[Double] = js.native
  
  /**
    * Optional ffmpeg settings for crf, profileVideo and preset values
    */
  var ffmpegOptions: js.UndefOr[FFmpegOptions] = js.native
  
  /**
    * Optional gifski settings (only for GIF outputs)
    */
  var gifskiOptions: js.UndefOr[js.Object] = js.native
  
  /**
    * Optional output height
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * Optionally injects arbitrary string content into the head, style, or body elements.
    */
  var inject: js.UndefOr[Inject] = js.native
  
  /**
    * JPEG quality for frames (does nothing if using png)
    * @default 90
    */
  var jpegQuality: js.UndefOr[Double] = js.native
  
  /**
    * Path or pattern to store result
    */
  var output: String = js.native
  
  /**
    * Relative path to the JSON file containing animation data
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * Optional puppeteer launch settings
    */
  var puppeteerOptions: js.UndefOr[LaunchOptions] = js.native
  
  /**
    * Set to true to disable console output
    */
  var quiet: js.UndefOr[Boolean] = js.native
  
  /**
    * Which lottie-web renderer to use
    * @default 'svg'
    */
  var renderer: js.UndefOr[svg | canvas | html] = js.native
  
  /**
    * Optional lottie renderer settings
    */
  var rendererSettings: js.UndefOr[SVGRendererConfig | CanvasRendererConfig | HTMLRendererConfig] = js.native
  
  /**
    * Optional JS
    * [CSS styles](https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Properties_Reference) to apply to the animation container
    */
  var style: js.UndefOr[js.Object] = js.native
  
  /**
    * Optional output width
    */
  var width: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(output: String): Options = {
    val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setOutput(value: String): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationData(value: js.Object): Self = this.set("animationData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimationData: Self = this.set("animationData", js.undefined)
    
    @scala.inline
    def setBrowser(value: Browser): Self = this.set("browser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBrowser: Self = this.set("browser", js.undefined)
    
    @scala.inline
    def setDeviceScaleFactor(value: Double): Self = this.set("deviceScaleFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeviceScaleFactor: Self = this.set("deviceScaleFactor", js.undefined)
    
    @scala.inline
    def setFfmpegOptions(value: FFmpegOptions): Self = this.set("ffmpegOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFfmpegOptions: Self = this.set("ffmpegOptions", js.undefined)
    
    @scala.inline
    def setGifskiOptions(value: js.Object): Self = this.set("gifskiOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGifskiOptions: Self = this.set("gifskiOptions", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setInject(value: Inject): Self = this.set("inject", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInject: Self = this.set("inject", js.undefined)
    
    @scala.inline
    def setJpegQuality(value: Double): Self = this.set("jpegQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJpegQuality: Self = this.set("jpegQuality", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPuppeteerOptions(value: LaunchOptions): Self = this.set("puppeteerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePuppeteerOptions: Self = this.set("puppeteerOptions", js.undefined)
    
    @scala.inline
    def setQuiet(value: Boolean): Self = this.set("quiet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuiet: Self = this.set("quiet", js.undefined)
    
    @scala.inline
    def setRenderer(value: svg | canvas | html): Self = this.set("renderer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderer: Self = this.set("renderer", js.undefined)
    
    @scala.inline
    def setRendererSettings(value: SVGRendererConfig | CanvasRendererConfig | HTMLRendererConfig): Self = this.set("rendererSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRendererSettings: Self = this.set("rendererSettings", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Object): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
