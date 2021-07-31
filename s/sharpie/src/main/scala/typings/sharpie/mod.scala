package typings.sharpie

import org.scalablytyped.runtime.StringDictionary
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.RequestHandler
import typings.node.Buffer
import typings.qs.mod.ParsedQs
import typings.sharp.mod.Sharp
import typings.sharp.mod.SharpOptions
import typings.sharpie.anon.Assignment
import typings.sharpie.sharpieBooleans.`false`
import typings.sharpie.sharpieBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * A simple express middleware for resizing images using sharp and pipes.
    */
  @scala.inline
  def apply(defaults: SharpieOptions): RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs] = ^.asInstanceOf[js.Dynamic].apply(defaults.asInstanceOf[js.Any]).asInstanceOf[RequestHandler[ParamsDictionary, js.Any, js.Any, ParsedQs]]
  
  @JSImport("sharpie", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sharpie", "formats")
  @js.native
  val formats: SharpieFormats = js.native
  
  @scala.inline
  def sharp(): Sharp = ^.asInstanceOf[js.Dynamic].applyDynamic("sharp")().asInstanceOf[Sharp]
  @scala.inline
  def sharp(input: String): Sharp = ^.asInstanceOf[js.Dynamic].applyDynamic("sharp")(input.asInstanceOf[js.Any]).asInstanceOf[Sharp]
  @scala.inline
  def sharp(input: String, options: SharpOptions): Sharp = (^.asInstanceOf[js.Dynamic].applyDynamic("sharp")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Sharp]
  @scala.inline
  def sharp(input: Unit, options: SharpOptions): Sharp = (^.asInstanceOf[js.Dynamic].applyDynamic("sharp")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Sharp]
  @scala.inline
  def sharp(input: Buffer): Sharp = ^.asInstanceOf[js.Dynamic].applyDynamic("sharp")(input.asInstanceOf[js.Any]).asInstanceOf[Sharp]
  @scala.inline
  def sharp(input: Buffer, options: SharpOptions): Sharp = (^.asInstanceOf[js.Dynamic].applyDynamic("sharp")(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Sharp]
  @scala.inline
  def sharp(options: SharpOptions): Sharp = ^.asInstanceOf[js.Dynamic].applyDynamic("sharp")(options.asInstanceOf[js.Any]).asInstanceOf[Sharp]
  
  trait SharpieFormats extends StObject {
    
    var dst: StringDictionary[`true`]
    
    var src: StringDictionary[`true`]
  }
  object SharpieFormats {
    
    @scala.inline
    def apply(dst: StringDictionary[`true`], src: StringDictionary[`true`]): SharpieFormats = {
      val __obj = js.Dynamic.literal(dst = dst.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[SharpieFormats]
    }
    
    @scala.inline
    implicit class SharpieFormatsMutableBuilder[Self <: SharpieFormats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDst(value: StringDictionary[`true`]): Self = StObject.set(x, "dst", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrc(value: StringDictionary[`true`]): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
    }
  }
  
  trait SharpieOptions extends StObject {
    
    /** @default false */
    var bg: js.UndefOr[String | Boolean] = js.undefined
    
    /** @default 'center' */
    var crop: js.UndefOr[String] = js.undefined
    
    /** @default false */
    var fg: js.UndefOr[String | Boolean] = js.undefined
    
    /** @default false */
    var flatten: js.UndefOr[Boolean] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    /**
      * whitelist hostnames that sharpie can proxy
      * @default false
      */
    var hostnames: js.UndefOr[
        `false` | js.Array[String] | StringDictionary[Boolean] | (js.Function1[/* hostname */ String, Boolean])
      ] = js.undefined
    
    /**
      * Since version 3.4 it is possible to use imagemagick to convert to ico file format
      */
    var im: js.UndefOr[String] = js.undefined
    
    /** @default undefined */
    var mean: js.UndefOr[String] = js.undefined
    
    /** @default 'url' */
    var param: js.UndefOr[String] = js.undefined
    
    /** @default 90 */
    var q: js.UndefOr[Double] = js.undefined
    
    /** @default 'xMinYMin' */
    var ratio: js.UndefOr[String] = js.undefined
    
    /** @default 'w:2048,h:2048,max' */
    var rs: js.UndefOr[String] = js.undefined
    
    var signs: js.UndefOr[Assignment] = js.undefined
    
    /**
      * the sizes of the favicon in ico format, separated by a comma
      * @defautl '64,32,16'
      */
    var sizes: js.UndefOr[String] = js.undefined
    
    /** @default false */
    var style: js.UndefOr[Boolean] = js.undefined
  }
  object SharpieOptions {
    
    @scala.inline
    def apply(): SharpieOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharpieOptions]
    }
    
    @scala.inline
    implicit class SharpieOptionsMutableBuilder[Self <: SharpieOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBg(value: String | Boolean): Self = StObject.set(x, "bg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBgUndefined: Self = StObject.set(x, "bg", js.undefined)
      
      @scala.inline
      def setCrop(value: String): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
      
      @scala.inline
      def setFg(value: String | Boolean): Self = StObject.set(x, "fg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFgUndefined: Self = StObject.set(x, "fg", js.undefined)
      
      @scala.inline
      def setFlatten(value: Boolean): Self = StObject.set(x, "flatten", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlattenUndefined: Self = StObject.set(x, "flatten", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setHostnames(
        value: `false` | js.Array[String] | StringDictionary[Boolean] | (js.Function1[/* hostname */ String, Boolean])
      ): Self = StObject.set(x, "hostnames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostnamesFunction1(value: /* hostname */ String => Boolean): Self = StObject.set(x, "hostnames", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHostnamesUndefined: Self = StObject.set(x, "hostnames", js.undefined)
      
      @scala.inline
      def setHostnamesVarargs(value: String*): Self = StObject.set(x, "hostnames", js.Array(value :_*))
      
      @scala.inline
      def setIm(value: String): Self = StObject.set(x, "im", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImUndefined: Self = StObject.set(x, "im", js.undefined)
      
      @scala.inline
      def setMean(value: String): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMeanUndefined: Self = StObject.set(x, "mean", js.undefined)
      
      @scala.inline
      def setParam(value: String): Self = StObject.set(x, "param", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamUndefined: Self = StObject.set(x, "param", js.undefined)
      
      @scala.inline
      def setQ(value: Double): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQUndefined: Self = StObject.set(x, "q", js.undefined)
      
      @scala.inline
      def setRatio(value: String): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
      
      @scala.inline
      def setRs(value: String): Self = StObject.set(x, "rs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRsUndefined: Self = StObject.set(x, "rs", js.undefined)
      
      @scala.inline
      def setSigns(value: Assignment): Self = StObject.set(x, "signs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignsUndefined: Self = StObject.set(x, "signs", js.undefined)
      
      @scala.inline
      def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      @scala.inline
      def setStyle(value: Boolean): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
