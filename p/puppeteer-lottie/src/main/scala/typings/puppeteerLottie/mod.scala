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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Renders the given Lottie animation via Puppeteer.
    *
    * You must pass either `path` or `animationData` to specify the Lottie animation.
    * @async
    */
  inline def apply(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[js.Promise[Unit]]
  inline def apply(opts: Options): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("puppeteer-lottie", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Optional ffmpeg settings
    */
  trait FFmpegOptions extends StObject {
    
    var crf: js.UndefOr[Double] = js.undefined
    
    var preset: js.UndefOr[
        ultrafast | superfast | veryfast | faster | fast | medium | slow | slower | veryslow | placebo
      ] = js.undefined
    
    var profileVideo: js.UndefOr[baseline | main | high | high10 | high422 | high444] = js.undefined
  }
  object FFmpegOptions {
    
    inline def apply(): FFmpegOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FFmpegOptions]
    }
    
    extension [Self <: FFmpegOptions](x: Self) {
      
      inline def setCrf(value: Double): Self = StObject.set(x, "crf", value.asInstanceOf[js.Any])
      
      inline def setCrfUndefined: Self = StObject.set(x, "crf", js.undefined)
      
      inline def setPreset(
        value: ultrafast | superfast | veryfast | faster | fast | medium | slow | slower | veryslow | placebo
      ): Self = StObject.set(x, "preset", value.asInstanceOf[js.Any])
      
      inline def setPresetUndefined: Self = StObject.set(x, "preset", js.undefined)
      
      inline def setProfileVideo(value: baseline | main | high | high10 | high422 | high444): Self = StObject.set(x, "profileVideo", value.asInstanceOf[js.Any])
      
      inline def setProfileVideoUndefined: Self = StObject.set(x, "profileVideo", js.undefined)
    }
  }
  
  trait GifskiOptions extends StObject {
    
    /**
      * Lower quality, but faster encode
      */
    var fast: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Resize to max this height if width is set. Note that aspect ratio is not preserved.
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * If true, looping is disabled
      */
    var once: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 1-100, but useful range is 50-100. Recommended to set to 100.
      */
    var quality: js.UndefOr[Double] = js.undefined
    
    /**
      * Resize to max this width if set
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object GifskiOptions {
    
    inline def apply(): GifskiOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GifskiOptions]
    }
    
    extension [Self <: GifskiOptions](x: Self) {
      
      inline def setFast(value: Boolean): Self = StObject.set(x, "fast", value.asInstanceOf[js.Any])
      
      inline def setFastUndefined: Self = StObject.set(x, "fast", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait Inject extends StObject {
    
    /**
      * Optionally injected into the document <body>
      */
    var body: js.UndefOr[String] = js.undefined
    
    /**
      *  Optionally injected into the document <head>
      */
    var head: js.UndefOr[String] = js.undefined
    
    /**
      * Optionally injected into a <style> tag within the document <head>
      */
    var style: js.UndefOr[String] = js.undefined
  }
  object Inject {
    
    inline def apply(): Inject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Inject]
    }
    
    extension [Self <: Inject](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHead(value: String): Self = StObject.set(x, "head", value.asInstanceOf[js.Any])
      
      inline def setHeadUndefined: Self = StObject.set(x, "head", js.undefined)
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /**
    * Configuration options
    */
  trait Options extends StObject {
    
    /**
      * JSON exported animation data
      */
    var animationData: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Optional puppeteer instance to reuse
      */
    var browser: js.UndefOr[Browser] = js.undefined
    
    /**
      * Window device scale factor
      * @default 1
      */
    var deviceScaleFactor: js.UndefOr[Double] = js.undefined
    
    /**
      * Optional ffmpeg settings for crf, profileVideo and preset values
      */
    var ffmpegOptions: js.UndefOr[FFmpegOptions] = js.undefined
    
    /**
      * Optional gifski settings (only for GIF outputs)
      */
    var gifskiOptions: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Optional output height
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /**
      * Optionally injects arbitrary string content into the head, style, or body elements.
      */
    var inject: js.UndefOr[Inject] = js.undefined
    
    /**
      * JPEG quality for frames (does nothing if using png)
      * @default 90
      */
    var jpegQuality: js.UndefOr[Double] = js.undefined
    
    /**
      * Path or pattern to store result
      */
    var output: String
    
    /**
      * Relative path to the JSON file containing animation data
      */
    var path: js.UndefOr[String] = js.undefined
    
    /**
      * Optional puppeteer launch settings
      */
    var puppeteerOptions: js.UndefOr[LaunchOptions] = js.undefined
    
    /**
      * Set to true to disable console output
      */
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Which lottie-web renderer to use
      * @default 'svg'
      */
    var renderer: js.UndefOr[svg | canvas | html] = js.undefined
    
    /**
      * Optional lottie renderer settings
      */
    var rendererSettings: js.UndefOr[SVGRendererConfig | CanvasRendererConfig | HTMLRendererConfig] = js.undefined
    
    /**
      * Optional JS
      * [CSS styles](https://developer.mozilla.org/en-US/docs/Web/CSS/CSS_Properties_Reference) to apply to the animation container
      */
    var style: js.UndefOr[js.Object] = js.undefined
    
    /**
      * Optional output width
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(output: String): Options = {
      val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAnimationData(value: js.Object): Self = StObject.set(x, "animationData", value.asInstanceOf[js.Any])
      
      inline def setAnimationDataUndefined: Self = StObject.set(x, "animationData", js.undefined)
      
      inline def setBrowser(value: Browser): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      inline def setDeviceScaleFactor(value: Double): Self = StObject.set(x, "deviceScaleFactor", value.asInstanceOf[js.Any])
      
      inline def setDeviceScaleFactorUndefined: Self = StObject.set(x, "deviceScaleFactor", js.undefined)
      
      inline def setFfmpegOptions(value: FFmpegOptions): Self = StObject.set(x, "ffmpegOptions", value.asInstanceOf[js.Any])
      
      inline def setFfmpegOptionsUndefined: Self = StObject.set(x, "ffmpegOptions", js.undefined)
      
      inline def setGifskiOptions(value: js.Object): Self = StObject.set(x, "gifskiOptions", value.asInstanceOf[js.Any])
      
      inline def setGifskiOptionsUndefined: Self = StObject.set(x, "gifskiOptions", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setInject(value: Inject): Self = StObject.set(x, "inject", value.asInstanceOf[js.Any])
      
      inline def setInjectUndefined: Self = StObject.set(x, "inject", js.undefined)
      
      inline def setJpegQuality(value: Double): Self = StObject.set(x, "jpegQuality", value.asInstanceOf[js.Any])
      
      inline def setJpegQualityUndefined: Self = StObject.set(x, "jpegQuality", js.undefined)
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPuppeteerOptions(value: LaunchOptions): Self = StObject.set(x, "puppeteerOptions", value.asInstanceOf[js.Any])
      
      inline def setPuppeteerOptionsUndefined: Self = StObject.set(x, "puppeteerOptions", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setRenderer(value: svg | canvas | html): Self = StObject.set(x, "renderer", value.asInstanceOf[js.Any])
      
      inline def setRendererSettings(value: SVGRendererConfig | CanvasRendererConfig | HTMLRendererConfig): Self = StObject.set(x, "rendererSettings", value.asInstanceOf[js.Any])
      
      inline def setRendererSettingsUndefined: Self = StObject.set(x, "rendererSettings", js.undefined)
      
      inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
      
      inline def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
