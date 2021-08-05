package typings.qiniuJs

import org.scalablytyped.runtime.StringDictionary
import typings.qiniuJs.mod.Region_
import typings.qiniuJs.qiniuJsNumbers.`0`
import typings.qiniuJs.qiniuJsNumbers.`1`
import typings.qiniuJs.qiniuJsNumbers.`2`
import typings.qiniuJs.qiniuJsNumbers.`3`
import typings.qiniuJs.qiniuJsNumbers.`4`
import typings.qiniuJs.qiniuJsNumbers.`5`
import typings.qiniuJs.qiniuJsStrings.gif
import typings.qiniuJs.qiniuJsStrings.jpg
import typings.qiniuJs.qiniuJsStrings.png
import typings.qiniuJs.qiniuJsStrings.webp
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[String] {
    
    var creation_time: String
  }
  object Dictkey {
    
    inline def apply(creation_time: String): Dictkey = {
      val __obj = js.Dynamic.literal(creation_time = creation_time.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    extension [Self <: Dictkey](x: Self) {
      
      inline def setCreation_time(value: String): Self = StObject.set(x, "creation_time", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dist extends StObject {
    
    var dist: Blob
    
    // 压缩后的图片宽度
    var height: Double
    
    // 压缩后输出的 blob 对象，或原始的 file，具体看下面的 options 配置
    var width: Double
  }
  object Dist {
    
    inline def apply(dist: Blob, height: Double, width: Double): Dist = {
      val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dist]
    }
    
    extension [Self <: Dist](x: Self) {
      
      inline def setDist(value: Blob): Self = StObject.set(x, "dist", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Loaded extends StObject {
    
    var loaded: Double
    
    // 本次上传的总量控制信息，单位为字节，注意这里的 total 跟文件大小并不一致。
    var percent: Double
    
    // 已上传大小，单位为字节。
    var total: Double
  }
  object Loaded {
    
    inline def apply(loaded: Double, percent: Double, total: Double): Loaded = {
      val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Loaded]
    }
    
    extension [Self <: Loaded](x: Self) {
      
      inline def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<qiniu-js.qiniu-js.CompressOptions> */
  trait PartialCompressOptions extends StObject {
    
    var maxHeight: js.UndefOr[Double] = js.undefined
    
    var maxWidh: js.UndefOr[Double] = js.undefined
    
    var noCompressIfLarger: js.UndefOr[Boolean] = js.undefined
    
    var quality: js.UndefOr[Double] = js.undefined
  }
  object PartialCompressOptions {
    
    inline def apply(): PartialCompressOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialCompressOptions]
    }
    
    extension [Self <: PartialCompressOptions](x: Self) {
      
      inline def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxWidh(value: Double): Self = StObject.set(x, "maxWidh", value.asInstanceOf[js.Any])
      
      inline def setMaxWidhUndefined: Self = StObject.set(x, "maxWidh", js.undefined)
      
      inline def setNoCompressIfLarger(value: Boolean): Self = StObject.set(x, "noCompressIfLarger", value.asInstanceOf[js.Any])
      
      inline def setNoCompressIfLargerUndefined: Self = StObject.set(x, "noCompressIfLarger", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    }
  }
  
  /* Inlined std.Partial<qiniu-js.qiniu-js.Config> */
  trait PartialConfig extends StObject {
    
    var checkByMD5: js.UndefOr[Boolean] = js.undefined
    
    var concurrentRequestLimit: js.UndefOr[Double] = js.undefined
    
    var disableStatisticsReport: js.UndefOr[Boolean] = js.undefined
    
    var forceDirect: js.UndefOr[Boolean] = js.undefined
    
    var region: js.UndefOr[Region_ | String] = js.undefined
    
    var retryCount: js.UndefOr[Double] = js.undefined
    
    var uphost: js.UndefOr[String] = js.undefined
    
    var useCdnDomain: js.UndefOr[Boolean] = js.undefined
  }
  object PartialConfig {
    
    inline def apply(): PartialConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConfig]
    }
    
    extension [Self <: PartialConfig](x: Self) {
      
      inline def setCheckByMD5(value: Boolean): Self = StObject.set(x, "checkByMD5", value.asInstanceOf[js.Any])
      
      inline def setCheckByMD5Undefined: Self = StObject.set(x, "checkByMD5", js.undefined)
      
      inline def setConcurrentRequestLimit(value: Double): Self = StObject.set(x, "concurrentRequestLimit", value.asInstanceOf[js.Any])
      
      inline def setConcurrentRequestLimitUndefined: Self = StObject.set(x, "concurrentRequestLimit", js.undefined)
      
      inline def setDisableStatisticsReport(value: Boolean): Self = StObject.set(x, "disableStatisticsReport", value.asInstanceOf[js.Any])
      
      inline def setDisableStatisticsReportUndefined: Self = StObject.set(x, "disableStatisticsReport", js.undefined)
      
      inline def setForceDirect(value: Boolean): Self = StObject.set(x, "forceDirect", value.asInstanceOf[js.Any])
      
      inline def setForceDirectUndefined: Self = StObject.set(x, "forceDirect", js.undefined)
      
      inline def setRegion(value: Region_ | String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setRetryCount(value: Double): Self = StObject.set(x, "retryCount", value.asInstanceOf[js.Any])
      
      inline def setRetryCountUndefined: Self = StObject.set(x, "retryCount", js.undefined)
      
      inline def setUphost(value: String): Self = StObject.set(x, "uphost", value.asInstanceOf[js.Any])
      
      inline def setUphostUndefined: Self = StObject.set(x, "uphost", js.undefined)
      
      inline def setUseCdnDomain(value: Boolean): Self = StObject.set(x, "useCdnDomain", value.asInstanceOf[js.Any])
      
      inline def setUseCdnDomainUndefined: Self = StObject.set(x, "useCdnDomain", js.undefined)
    }
  }
  
  /* Inlined std.Partial<qiniu-js.qiniu-js.Extra> */
  trait PartialExtra extends StObject {
    
    var fname: js.UndefOr[String] = js.undefined
    
    var mimeType: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    var params: js.UndefOr[js.Any] = js.undefined
  }
  object PartialExtra {
    
    inline def apply(): PartialExtra = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialExtra]
    }
    
    extension [Self <: PartialExtra](x: Self) {
      
      inline def setFname(value: String): Self = StObject.set(x, "fname", value.asInstanceOf[js.Any])
      
      inline def setFnameUndefined: Self = StObject.set(x, "fname", js.undefined)
      
      inline def setMimeType(value: js.Array[String]): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
      
      inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      inline def setMimeTypeVarargs(value: String*): Self = StObject.set(x, "mimeType", js.Array(value :_*))
      
      inline def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    }
  }
  
  /* Inlined std.Partial<qiniu-js.qiniu-js.ImageMogr2Options> */
  trait PartialImageMogr2Options extends StObject {
    
    var `auto-orient`: js.UndefOr[Boolean] = js.undefined
    
    var blur: js.UndefOr[String] = js.undefined
    
    var crop: js.UndefOr[String] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
    
    var gravity: js.UndefOr[String] = js.undefined
    
    var quality: js.UndefOr[Double] = js.undefined
    
    var rotate: js.UndefOr[Double] = js.undefined
    
    var strip: js.UndefOr[Boolean] = js.undefined
    
    var thumbnail: js.UndefOr[String] = js.undefined
  }
  object PartialImageMogr2Options {
    
    inline def apply(): PartialImageMogr2Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialImageMogr2Options]
    }
    
    extension [Self <: PartialImageMogr2Options](x: Self) {
      
      inline def `setAuto-orient`(value: Boolean): Self = StObject.set(x, "auto-orient", value.asInstanceOf[js.Any])
      
      inline def `setAuto-orientUndefined`: Self = StObject.set(x, "auto-orient", js.undefined)
      
      inline def setBlur(value: String): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      inline def setCrop(value: String): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
      
      inline def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setGravity(value: String): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
      
      inline def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
      
      inline def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      inline def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setStrip(value: Boolean): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
      
      inline def setStripUndefined: Self = StObject.set(x, "strip", js.undefined)
      
      inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    }
  }
  
  /* Inlined std.Partial<qiniu-js.qiniu-js.ImageView2Options> */
  trait PartialImageView2Options extends StObject {
    
    var format: js.UndefOr[jpg | gif | png | webp | String] = js.undefined
    
    var h: js.UndefOr[Double] = js.undefined
    
    var mode: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5`] = js.undefined
    
    var q: js.UndefOr[Double] = js.undefined
    
    var w: js.UndefOr[Double] = js.undefined
  }
  object PartialImageView2Options {
    
    inline def apply(): PartialImageView2Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialImageView2Options]
    }
    
    extension [Self <: PartialImageView2Options](x: Self) {
      
      inline def setFormat(value: jpg | gif | png | webp | String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      inline def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      inline def setMode(value: `0` | `1` | `2` | `3` | `4` | `5`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setQ(value: Double): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
      
      inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
      
      inline def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      inline def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    }
  }
  
  trait Type extends StObject {
    
    var `type`: Double
    
    var `val`: String
  }
  object Type {
    
    inline def apply(`type`: Double, `val`: String): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    }
  }
}
