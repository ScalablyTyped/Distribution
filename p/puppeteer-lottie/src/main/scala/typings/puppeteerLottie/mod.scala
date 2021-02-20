package typings.puppeteerLottie

import typings.lottieWeb.mod.CanvasRendererConfig
import typings.lottieWeb.mod.HTMLRendererConfig
import typings.lottieWeb.mod.SVGRendererConfig
import typings.puppeteer.mod.Browser
import typings.puppeteer.mod.LaunchOptions
import typings.puppeteerLottie.puppeteerLottieStrings.baseline
import typings.puppeteerLottie.puppeteerLottieStrings.canvas
import typings.puppeteerLottie.puppeteerLottieStrings.fast
import typings.puppeteerLottie.puppeteerLottieStrings.faster
import typings.puppeteerLottie.puppeteerLottieStrings.high
import typings.puppeteerLottie.puppeteerLottieStrings.high10
import typings.puppeteerLottie.puppeteerLottieStrings.high422
import typings.puppeteerLottie.puppeteerLottieStrings.high444
import typings.puppeteerLottie.puppeteerLottieStrings.html
import typings.puppeteerLottie.puppeteerLottieStrings.main
import typings.puppeteerLottie.puppeteerLottieStrings.medium
import typings.puppeteerLottie.puppeteerLottieStrings.placebo
import typings.puppeteerLottie.puppeteerLottieStrings.slow
import typings.puppeteerLottie.puppeteerLottieStrings.slower
import typings.puppeteerLottie.puppeteerLottieStrings.superfast
import typings.puppeteerLottie.puppeteerLottieStrings.svg
import typings.puppeteerLottie.puppeteerLottieStrings.ultrafast
import typings.puppeteerLottie.puppeteerLottieStrings.veryfast
import typings.puppeteerLottie.puppeteerLottieStrings.veryslow
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Renders the given Lottie animation via Puppeteer.
    *
    * You must pass either `path` or `animationData` to specify the Lottie animation.
    * @async
    */
  @JSImport("puppeteer-lottie", JSImport.Namespace)
  @js.native
  def apply(): js.Promise[Unit] = js.native
  @JSImport("puppeteer-lottie", JSImport.Namespace)
  @js.native
  def apply(opts: Options): js.Promise[Unit] = js.native
  
  /**
    * Optional ffmpeg settings
    */
  @js.native
  trait FFmpegOptions extends StObject {
    
    var crf: js.UndefOr[Double] = js.native
    
    var preset: js.UndefOr[
        ultrafast | superfast | veryfast | faster | fast | medium | slow | slower | veryslow | placebo
      ] = js.native
    
    var profileVideo: js.UndefOr[baseline | main | high | high10 | high422 | high444] = js.native
  }
  object FFmpegOptions {
    
    @scala.inline
    def apply(): FFmpegOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FFmpegOptions]
    }
    
    @scala.inline
    implicit class FFmpegOptionsMutableBuilder[Self <: FFmpegOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCrf(value: Double): Self = StObject.set(x, "crf", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrfUndefined: Self = StObject.set(x, "crf", js.undefined)
      
      @scala.inline
      def setPreset(
        value: ultrafast | superfast | veryfast | faster | fast | medium | slow | slower | veryslow | placebo
      ): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
      
      @scala.inline
      def setProfileVideo(value: baseline | main | high | high10 | high422 | high444): Self = StObject.set(x, "profileVideo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfileVideoUndefined: Self = StObject.set(x, "profileVideo", js.undefined)
    }
  }
  
  @js.native
  trait GifskiOptions extends StObject {
    
    /**
      * Lower quality, but faster encode
      */
    var fast: js.UndefOr[Boolean] = js.native
    
    /**
      * Resize to max this height if width is set. Note that aspect ratio is not preserved.
      */
    var height: js.UndefOr[Double] = js.native
    
    /**
      * If true, looping is disabled
      */
    var once: js.UndefOr[Boolean] = js.native
    
    /**
      * 1-100, but useful range is 50-100. Recommended to set to 100.
      */
    var quality: js.UndefOr[Double] = js.native
    
    /**
      * Resize to max this width if set
      */
    var width: js.UndefOr[Double] = js.native
  }
  object GifskiOptions {
    
    @scala.inline
    def apply(): GifskiOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GifskiOptions]
    }
    
    @scala.inline
    implicit class GifskiOptionsMutableBuilder[Self <: GifskiOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFast(value: Boolean): Self = StObject.set(x, "fast", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFastUndefined: Self = StObject.set(x, "fast", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait Inject extends StObject {
    
    /**
      * Optionally injected into the document <body>
      */
    var body: js.UndefOr[String] = js.native
    
    /**
      *  Optionally injected into the document <head>
      */
    var head: js.UndefOr[String] = js.native
    
    /**
      * Optionally injected into a <style> tag within the document <head>
      */
    var style: js.UndefOr[String] = js.native
  }
  object Inject {
    
    @scala.inline
    def apply(): Inject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Inject]
    }
    
    @scala.inline
    implicit class InjectMutableBuilder[Self <: Inject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setHead(value: String): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
      
      @scala.inline
      def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /**
    * Configuration options
    */
  @js.native
  trait Options extends StObject {
    
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
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimationData(value: js.Object): Self = StObject.set(x, "animationData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationDataUndefined: Self = StObject.set(x, "animationData", js.undefined)
      
      @scala.inline
      def setBrowser(value: Browser): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      @scala.inline
      def setDeviceScaleFactor(value: Double): Self = StObject.set(x, "deviceScaleFactor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceScaleFactorUndefined: Self = StObject.set(x, "deviceScaleFactor", js.undefined)
      
      @scala.inline
      def setFfmpegOptions(value: FFmpegOptions): Self = StObject.set(x, "ffmpegOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFfmpegOptionsUndefined: Self = StObject.set(x, "ffmpegOptions", js.undefined)
      
      @scala.inline
      def setGifskiOptions(value: js.Object): Self = StObject.set(x, "gifskiOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGifskiOptionsUndefined: Self = StObject.set(x, "gifskiOptions", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setInject(value: Inject): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
      
      @scala.inline
      def setJpegQuality(value: Double): Self = StObject.set(x, "jpegQuality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJpegQualityUndefined: Self = StObject.set(x, "jpegQuality", js.undefined)
      
      @scala.inline
      def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      @scala.inline
      def setPuppeteerOptions(value: LaunchOptions): Self = StObject.set(x, "puppeteerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPuppeteerOptionsUndefined: Self = StObject.set(x, "puppeteerOptions", js.undefined)
      
      @scala.inline
      def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      @scala.inline
      def setRenderer(value: svg | canvas | html): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRendererSettings(value: SVGRendererConfig | CanvasRendererConfig | HTMLRendererConfig): Self = StObject.set(x, "rendererSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRendererSettingsUndefined: Self = StObject.set(x, "rendererSettings", js.undefined)
      
      @scala.inline
      def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
