package typings.qiniuJs

import typings.qiniuJs.helperMod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageMod {
  
  @JSImport("qiniu-js/esm/image", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def exif(key: String, domain: String): Response[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("exif")(key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[Response[Any]]
  
  inline def imageInfo(key: String, domain: String): Response[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("imageInfo")(key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[Response[Any]]
  
  inline def imageMogr2(op: ImageMogr2_): String = ^.asInstanceOf[js.Dynamic].applyDynamic("imageMogr2")(op.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def imageMogr2(op: ImageMogr2_, key: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("imageMogr2")(op.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def imageMogr2(op: ImageMogr2_, key: String, domain: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("imageMogr2")(op.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def imageMogr2(op: ImageMogr2_, key: Unit, domain: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("imageMogr2")(op.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def imageView2(op: ImageViewOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("imageView2")(op.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def imageView2(op: ImageViewOptions, key: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("imageView2")(op.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def imageView2(op: ImageViewOptions, key: String, domain: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("imageView2")(op.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def imageView2(op: ImageViewOptions, key: Unit, domain: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("imageView2")(op.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def pipeline(arr: js.Array[Pipeline_]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(arr.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def pipeline(arr: js.Array[Pipeline_], key: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(arr.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def pipeline(arr: js.Array[Pipeline_], key: String, domain: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(arr.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def pipeline(arr: js.Array[Pipeline_], key: Unit, domain: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(arr.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def watermark(op: ImageWatermark): String = ^.asInstanceOf[js.Dynamic].applyDynamic("watermark")(op.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def watermark(op: ImageWatermark, key: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("watermark")(op.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def watermark(op: ImageWatermark, key: String, domain: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("watermark")(op.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def watermark(op: ImageWatermark, key: Unit, domain: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("watermark")(op.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Entry extends StObject {
    
    var domain: String
    
    var key: String
  }
  object Entry {
    
    inline def apply(domain: String, key: String): Entry = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Entry]
    }
    
    extension [Self <: Entry](x: Self) {
      
      inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait ImageMogr2_ extends StObject {
    
    var `auto-orient`: js.UndefOr[Boolean] = js.undefined
    
    var blur: js.UndefOr[Double] = js.undefined
    
    var crop: js.UndefOr[Double] = js.undefined
    
    var format: js.UndefOr[Double] = js.undefined
    
    var gravity: js.UndefOr[Double] = js.undefined
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var rotate: js.UndefOr[Double] = js.undefined
    
    var strip: js.UndefOr[Boolean] = js.undefined
    
    var thumbnail: js.UndefOr[Double] = js.undefined
  }
  object ImageMogr2_ {
    
    inline def apply(): ImageMogr2_ = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImageMogr2_]
    }
    
    extension [Self <: ImageMogr2_](x: Self) {
      
      inline def `setAuto-orient`(value: Boolean): Self = StObject.set(x, "auto-orient", value.asInstanceOf[js.Any])
      
      inline def `setAuto-orientUndefined`: Self = StObject.set(x, "auto-orient", js.undefined)
      
      inline def setBlur(value: Double): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      inline def setCrop(value: Double): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
      
      inline def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
      
      inline def setFormat(value: Double): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setGravity(value: Double): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
      
      inline def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setStrip(value: Boolean): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
      
      inline def setStripUndefined: Self = StObject.set(x, "strip", js.undefined)
      
      inline def setThumbnail(value: Double): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    }
  }
  
  trait ImageViewOptions extends StObject {
    
    var format: js.UndefOr[String] = js.undefined
    
    var h: js.UndefOr[Double] = js.undefined
    
    var mode: Double
    
    var q: js.UndefOr[Double] = js.undefined
    
    var w: js.UndefOr[Double] = js.undefined
  }
  object ImageViewOptions {
    
    inline def apply(mode: Double): ImageViewOptions = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageViewOptions]
    }
    
    extension [Self <: ImageViewOptions](x: Self) {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setQ(value: Double): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
      
      inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    }
  }
  
  trait ImageWatermark extends StObject {
    
    var dissolve: js.UndefOr[Double] = js.undefined
    
    var dx: js.UndefOr[Double] = js.undefined
    
    var dy: js.UndefOr[Double] = js.undefined
    
    var fill: js.UndefOr[String] = js.undefined
    
    var font: js.UndefOr[String] = js.undefined
    
    var fontsize: js.UndefOr[Double] = js.undefined
    
    var gravity: js.UndefOr[String] = js.undefined
    
    var image: String
    
    var mode: Double
    
    var text: js.UndefOr[String] = js.undefined
  }
  object ImageWatermark {
    
    inline def apply(image: String, mode: Double): ImageWatermark = {
      val __obj = js.Dynamic.literal(image = image.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageWatermark]
    }
    
    extension [Self <: ImageWatermark](x: Self) {
      
      inline def setDissolve(value: Double): Self = StObject.set(x, "dissolve", value.asInstanceOf[js.Any])
      
      inline def setDissolveUndefined: Self = StObject.set(x, "dissolve", js.undefined)
      
      inline def setDx(value: Double): Self = StObject.set(x, "dx", value.asInstanceOf[js.Any])
      
      inline def setDxUndefined: Self = StObject.set(x, "dx", js.undefined)
      
      inline def setDy(value: Double): Self = StObject.set(x, "dy", value.asInstanceOf[js.Any])
      
      inline def setDyUndefined: Self = StObject.set(x, "dy", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setFontsize(value: Double): Self = StObject.set(x, "fontsize", value.asInstanceOf[js.Any])
      
      inline def setFontsizeUndefined: Self = StObject.set(x, "fontsize", js.undefined)
      
      inline def setGravity(value: String): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
      
      inline def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
      
      inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.qiniuJs.anon.ImageWatermarkfopwatermar
    - typings.qiniuJs.anon.ImageViewOptionsfopimageV
    - typings.qiniuJs.anon.ImageMogr2fopimageMogr2
  */
  trait Pipeline_ extends StObject
  object Pipeline_ {
    
    inline def ImageMogr2fopimageMogr2(): typings.qiniuJs.anon.ImageMogr2fopimageMogr2 = {
      val __obj = js.Dynamic.literal(fop = "imageMogr2")
      __obj.asInstanceOf[typings.qiniuJs.anon.ImageMogr2fopimageMogr2]
    }
    
    inline def ImageViewOptionsfopimageV(mode: Double): typings.qiniuJs.anon.ImageViewOptionsfopimageV = {
      val __obj = js.Dynamic.literal(fop = "imageView2", mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.qiniuJs.anon.ImageViewOptionsfopimageV]
    }
    
    inline def ImageWatermarkfopwatermar(image: String, mode: Double): typings.qiniuJs.anon.ImageWatermarkfopwatermar = {
      val __obj = js.Dynamic.literal(fop = "watermark", image = image.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.qiniuJs.anon.ImageWatermarkfopwatermar]
    }
  }
}
