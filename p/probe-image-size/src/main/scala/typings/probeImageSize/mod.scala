package typings.probeImageSize

import org.scalablytyped.runtime.Instantiable3
import typings.needle.mod.NeedleOptions
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Transform
import typings.probeImageSize.probeImageSizeStrings.ECONTENT
import typings.std.ReadableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Get image size without full download. Supported image types: JPG, GIF, PNG, WebP, BMP, TIFF, SVG, PSD.
    */
  inline def apply(source: String): js.Promise[ProbeResult] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ProbeResult]]
  inline def apply(source: String, opts: NeedleOptions): js.Promise[ProbeResult] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProbeResult]]
  inline def apply(source: ReadableStream[Any]): js.Promise[ProbeResult] = ^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ProbeResult]]
  inline def apply(source: ReadableStream[Any], keepOpen: Boolean): js.Promise[ProbeResult] = (^.asInstanceOf[js.Dynamic].apply(source.asInstanceOf[js.Any], keepOpen.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ProbeResult]]
  
  @JSImport("probe-image-size", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("probe-image-size", "Error")
  @js.native
  open class Error protected ()
    extends StObject
       with typings.std.Error {
    def this(message: String) = this()
    def this(message: String, code: ECONTENT) = this()
    def this(message: String, code: Null, statusCode: Double) = this()
    def this(message: String, code: Unit, statusCode: Double) = this()
    def this(message: String, code: ECONTENT, statusCode: Double) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  @JSImport("probe-image-size", "Error")
  @js.native
  val Error: Instantiable3[
    /* message */ String, 
    /* code */ js.UndefOr[ECONTENT | Null], 
    /* statusCode */ js.UndefOr[Double], 
    js.Error
  ] = js.native
  
  @JSImport("probe-image-size", "parsers")
  @js.native
  val parsers: Parsers_ = js.native
  
  inline def sync(data: Buffer): ProbeResult | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(data.asInstanceOf[js.Any]).asInstanceOf[ProbeResult | Null]
  
  /* Rewritten from type alias, can be one of: 
    - typings.probeImageSize.probeImageSizeInts.`1`
    - typings.probeImageSize.probeImageSizeInts.`2`
    - typings.probeImageSize.probeImageSizeInts.`3`
    - typings.probeImageSize.probeImageSizeInts.`4`
    - typings.probeImageSize.probeImageSizeInts.`5`
    - typings.probeImageSize.probeImageSizeInts.`6`
    - typings.probeImageSize.probeImageSizeInts.`7`
    - typings.probeImageSize.probeImageSizeInts.`8`
  */
  trait Orientation extends StObject
  object Orientation {
    
    inline def `1`: typings.probeImageSize.probeImageSizeInts.`1` = 1.asInstanceOf[typings.probeImageSize.probeImageSizeInts.`1`]
    
    inline def `2`: typings.probeImageSize.probeImageSizeInts.`2` = 2.asInstanceOf[typings.probeImageSize.probeImageSizeInts.`2`]
    
    inline def `3`: typings.probeImageSize.probeImageSizeInts.`3` = 3.asInstanceOf[typings.probeImageSize.probeImageSizeInts.`3`]
    
    inline def `4`: typings.probeImageSize.probeImageSizeInts.`4` = 4.asInstanceOf[typings.probeImageSize.probeImageSizeInts.`4`]
    
    inline def `5`: typings.probeImageSize.probeImageSizeInts.`5` = 5.asInstanceOf[typings.probeImageSize.probeImageSizeInts.`5`]
    
    inline def `6`: typings.probeImageSize.probeImageSizeInts.`6` = 6.asInstanceOf[typings.probeImageSize.probeImageSizeInts.`6`]
    
    inline def `7`: typings.probeImageSize.probeImageSizeInts.`7` = 7.asInstanceOf[typings.probeImageSize.probeImageSizeInts.`7`]
    
    inline def `8`: typings.probeImageSize.probeImageSizeInts.`8` = 8.asInstanceOf[typings.probeImageSize.probeImageSizeInts.`8`]
  }
  
  type Parser = js.Function0[ParserStream]
  
  // tslint:disable-next-line:no-empty-interface
  type ParserStream = Transform
  
  trait Parsers_ extends StObject {
    
    def avif(): ParserStream
    @JSName("avif")
    var avif_Original: Parser
    
    def bmp(): ParserStream
    @JSName("bmp")
    var bmp_Original: Parser
    
    def gif(): ParserStream
    @JSName("gif")
    var gif_Original: Parser
    
    def ico(): ParserStream
    @JSName("ico")
    var ico_Original: Parser
    
    def jpeg(): ParserStream
    @JSName("jpeg")
    var jpeg_Original: Parser
    
    def png(): ParserStream
    @JSName("png")
    var png_Original: Parser
    
    def psd(): ParserStream
    @JSName("psd")
    var psd_Original: Parser
    
    def svg(): ParserStream
    @JSName("svg")
    var svg_Original: Parser
    
    def tiff(): ParserStream
    @JSName("tiff")
    var tiff_Original: Parser
    
    def webp(): ParserStream
    @JSName("webp")
    var webp_Original: Parser
  }
  object Parsers_ {
    
    inline def apply(
      avif: () => ParserStream,
      bmp: () => ParserStream,
      gif: () => ParserStream,
      ico: () => ParserStream,
      jpeg: () => ParserStream,
      png: () => ParserStream,
      psd: () => ParserStream,
      svg: () => ParserStream,
      tiff: () => ParserStream,
      webp: () => ParserStream
    ): Parsers_ = {
      val __obj = js.Dynamic.literal(avif = js.Any.fromFunction0(avif), bmp = js.Any.fromFunction0(bmp), gif = js.Any.fromFunction0(gif), ico = js.Any.fromFunction0(ico), jpeg = js.Any.fromFunction0(jpeg), png = js.Any.fromFunction0(png), psd = js.Any.fromFunction0(psd), svg = js.Any.fromFunction0(svg), tiff = js.Any.fromFunction0(tiff), webp = js.Any.fromFunction0(webp))
      __obj.asInstanceOf[Parsers_]
    }
    
    extension [Self <: Parsers_](x: Self) {
      
      inline def setAvif(value: () => ParserStream): Self = StObject.set(x, "avif", js.Any.fromFunction0(value))
      
      inline def setBmp(value: () => ParserStream): Self = StObject.set(x, "bmp", js.Any.fromFunction0(value))
      
      inline def setGif(value: () => ParserStream): Self = StObject.set(x, "gif", js.Any.fromFunction0(value))
      
      inline def setIco(value: () => ParserStream): Self = StObject.set(x, "ico", js.Any.fromFunction0(value))
      
      inline def setJpeg(value: () => ParserStream): Self = StObject.set(x, "jpeg", js.Any.fromFunction0(value))
      
      inline def setPng(value: () => ParserStream): Self = StObject.set(x, "png", js.Any.fromFunction0(value))
      
      inline def setPsd(value: () => ParserStream): Self = StObject.set(x, "psd", js.Any.fromFunction0(value))
      
      inline def setSvg(value: () => ParserStream): Self = StObject.set(x, "svg", js.Any.fromFunction0(value))
      
      inline def setTiff(value: () => ParserStream): Self = StObject.set(x, "tiff", js.Any.fromFunction0(value))
      
      inline def setWebp(value: () => ParserStream): Self = StObject.set(x, "webp", js.Any.fromFunction0(value))
    }
  }
  
  type ProbeError = js.Error
  
  trait ProbeResult extends StObject {
    
    var hUnits: String
    
    var height: Double
    
    var length: Double
    
    var mime: String
    
    var orientation: js.UndefOr[Orientation] = js.undefined
    
    var `type`: String
    
    var url: String
    
    var variants: js.UndefOr[js.Array[Variant]] = js.undefined
    
    var wUnits: String
    
    var width: Double
  }
  object ProbeResult {
    
    inline def apply(
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
    
    extension [Self <: ProbeResult](x: Self) {
      
      inline def setHUnits(value: String): Self = StObject.set(x, "hUnits", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setMime(value: String): Self = StObject.set(x, "mime", value.asInstanceOf[js.Any])
      
      inline def setOrientation(value: Orientation): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      inline def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVariants(value: js.Array[Variant]): Self = StObject.set(x, "variants", value.asInstanceOf[js.Any])
      
      inline def setVariantsUndefined: Self = StObject.set(x, "variants", js.undefined)
      
      inline def setVariantsVarargs(value: Variant*): Self = StObject.set(x, "variants", js.Array(value*))
      
      inline def setWUnits(value: String): Self = StObject.set(x, "wUnits", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Variant extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Variant {
    
    inline def apply(height: Double, width: Double): Variant = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Variant]
    }
    
    extension [Self <: Variant](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
