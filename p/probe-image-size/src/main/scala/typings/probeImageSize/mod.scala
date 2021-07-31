package typings.probeImageSize

import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.probeImageSize.probeImageSizeStrings.ECONTENT
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(source: String): js.Promise[ProbeResult] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ProbeResult]]
  @scala.inline
  def apply(source: String, callback: ProbeCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(source: String, opts: ProbeOptions): js.Promise[ProbeResult] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProbeResult]]
  /**
    * Get image size without full download. Supported image types: JPG, GIF, PNG, WebP, BMP, TIFF, SVG, PSD.
    */
  @scala.inline
  def apply(source: String, opts: ProbeOptions, callback: ProbeCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(source: ReadableStream): js.Promise[ProbeResult] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ProbeResult]]
  @scala.inline
  def apply(source: ReadableStream, callback: ProbeCallback): Unit = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("probe-image-size", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def sync(data: Buffer): ProbeResult | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(data.asInstanceOf[js.Any]).asInstanceOf[ProbeResult | Null]
  
  type ProbeCallback = js.Function2[/* err */ ProbeError | Null, /* result */ ProbeResult, Unit]
  
  trait ProbeError
    extends StObject
       with Error {
    
    var code: js.UndefOr[ECONTENT] = js.undefined
    
    var status: js.UndefOr[Double] = js.undefined
  }
  object ProbeError {
    
    @scala.inline
    def apply(message: String, name: String): ProbeError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProbeError]
    }
    
    @scala.inline
    implicit class ProbeErrorMutableBuilder[Self <: ProbeError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: ECONTENT): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  trait ProbeOptions extends StObject {
    
    var retries: js.UndefOr[Double] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object ProbeOptions {
    
    @scala.inline
    def apply(): ProbeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProbeOptions]
    }
    
    @scala.inline
    implicit class ProbeOptionsMutableBuilder[Self <: ProbeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRetries(value: Double): Self = StObject.set(x, "retries", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetriesUndefined: Self = StObject.set(x, "retries", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait ProbeResult extends StObject {
    
    var hUnits: String
    
    var height: Double
    
    var length: Double
    
    var mime: String
    
    var `type`: String
    
    var url: String
    
    var wUnits: String
    
    var width: Double
  }
  object ProbeResult {
    
    @scala.inline
    def apply(
      hUnits: String,
      height: Double,
      length: Double,
      mime: String,
      `type`: String,
      url: String,
      wUnits: String,
      width: Double
    ): ProbeResult = {
      val __obj = js.Dynamic.literal(hUnits = hUnits.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], mime = mime.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], wUnits = wUnits.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProbeResult]
    }
    
    @scala.inline
    implicit class ProbeResultMutableBuilder[Self <: ProbeResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHUnits(value: String): Self = StObject.set(x, "hUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWUnits(value: String): Self = StObject.set(x, "wUnits", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
