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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Dictkey extends /* key */ StringDictionary[String] {
    
    var creation_time: String = js.native
  }
  object Dictkey {
    
    @scala.inline
    def apply(creation_time: String): Dictkey = {
      val __obj = js.Dynamic.literal(creation_time = creation_time.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreation_time(value: String): Self = StObject.set(x, "creation_time", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Dist extends StObject {
    
    var dist: Blob = js.native
    
    // 压缩后的图片宽度
    var height: Double = js.native
    
    // 压缩后输出的 blob 对象，或原始的 file，具体看下面的 options 配置
    var width: Double = js.native
  }
  object Dist {
    
    @scala.inline
    def apply(dist: Blob, height: Double, width: Double): Dist = {
      val __obj = js.Dynamic.literal(dist = dist.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dist]
    }
    
    @scala.inline
    implicit class DistMutableBuilder[Self <: Dist] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDist(value: Blob): Self = StObject.set(x, "dist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Loaded extends StObject {
    
    var loaded: Double = js.native
    
    // 本次上传的总量控制信息，单位为字节，注意这里的 total 跟文件大小并不一致。
    var percent: Double = js.native
    
    // 已上传大小，单位为字节。
    var total: Double = js.native
  }
  object Loaded {
    
    @scala.inline
    def apply(loaded: Double, percent: Double, total: Double): Loaded = {
      val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Loaded]
    }
    
    @scala.inline
    implicit class LoadedMutableBuilder[Self <: Loaded] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<qiniu-js.qiniu-js.CompressOptions> */
  @js.native
  trait PartialCompressOptions extends StObject {
    
    var maxHeight: js.UndefOr[Double] = js.native
    
    var maxWidh: js.UndefOr[Double] = js.native
    
    var noCompressIfLarger: js.UndefOr[Boolean] = js.native
    
    var quality: js.UndefOr[Double] = js.native
  }
  object PartialCompressOptions {
    
    @scala.inline
    def apply(): PartialCompressOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialCompressOptions]
    }
    
    @scala.inline
    implicit class PartialCompressOptionsMutableBuilder[Self <: PartialCompressOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxHeight(value: Double): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidh(value: Double): Self = StObject.set(x, "maxWidh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidhUndefined: Self = StObject.set(x, "maxWidh", js.undefined)
      
      @scala.inline
      def setNoCompressIfLarger(value: Boolean): Self = StObject.set(x, "noCompressIfLarger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoCompressIfLargerUndefined: Self = StObject.set(x, "noCompressIfLarger", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
    }
  }
  
  /* Inlined std.Partial<qiniu-js.qiniu-js.Config> */
  @js.native
  trait PartialConfig extends StObject {
    
    var checkByMD5: js.UndefOr[Boolean] = js.native
    
    var concurrentRequestLimit: js.UndefOr[Double] = js.native
    
    var disableStatisticsReport: js.UndefOr[Boolean] = js.native
    
    var forceDirect: js.UndefOr[Boolean] = js.native
    
    var region: js.UndefOr[Region_ | String] = js.native
    
    var retryCount: js.UndefOr[Double] = js.native
    
    var uphost: js.UndefOr[String] = js.native
    
    var useCdnDomain: js.UndefOr[Boolean] = js.native
  }
  object PartialConfig {
    
    @scala.inline
    def apply(): PartialConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialConfig]
    }
    
    @scala.inline
    implicit class PartialConfigMutableBuilder[Self <: PartialConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckByMD5(value: Boolean): Self = StObject.set(x, "checkByMD5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckByMD5Undefined: Self = StObject.set(x, "checkByMD5", js.undefined)
      
      @scala.inline
      def setConcurrentRequestLimit(value: Double): Self = StObject.set(x, "concurrentRequestLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrentRequestLimitUndefined: Self = StObject.set(x, "concurrentRequestLimit", js.undefined)
      
      @scala.inline
      def setDisableStatisticsReport(value: Boolean): Self = StObject.set(x, "disableStatisticsReport", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableStatisticsReportUndefined: Self = StObject.set(x, "disableStatisticsReport", js.undefined)
      
      @scala.inline
      def setForceDirect(value: Boolean): Self = StObject.set(x, "forceDirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceDirectUndefined: Self = StObject.set(x, "forceDirect", js.undefined)
      
      @scala.inline
      def setRegion(value: Region_ | String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setRetryCount(value: Double): Self = StObject.set(x, "retryCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRetryCountUndefined: Self = StObject.set(x, "retryCount", js.undefined)
      
      @scala.inline
      def setUphost(value: String): Self = StObject.set(x, "uphost", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUphostUndefined: Self = StObject.set(x, "uphost", js.undefined)
      
      @scala.inline
      def setUseCdnDomain(value: Boolean): Self = StObject.set(x, "useCdnDomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCdnDomainUndefined: Self = StObject.set(x, "useCdnDomain", js.undefined)
    }
  }
  
  /* Inlined std.Partial<qiniu-js.qiniu-js.Extra> */
  @js.native
  trait PartialExtra extends StObject {
    
    var fname: js.UndefOr[String] = js.native
    
    var mimeType: js.UndefOr[js.Array[String] | Null] = js.native
    
    var params: js.UndefOr[js.Any] = js.native
  }
  object PartialExtra {
    
    @scala.inline
    def apply(): PartialExtra = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialExtra]
    }
    
    @scala.inline
    implicit class PartialExtraMutableBuilder[Self <: PartialExtra] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFname(value: String): Self = StObject.set(x, "fname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFnameUndefined: Self = StObject.set(x, "fname", js.undefined)
      
      @scala.inline
      def setMimeType(value: js.Array[String]): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMimeTypeNull: Self = StObject.set(x, "mimeType", null)
      
      @scala.inline
      def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      @scala.inline
      def setMimeTypeVarargs(value: String*): Self = StObject.set(x, "mimeType", js.Array(value :_*))
      
      @scala.inline
      def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    }
  }
  
  /* Inlined std.Partial<qiniu-js.qiniu-js.ImageMogr2Options> */
  @js.native
  trait PartialImageMogr2Options extends StObject {
    
    var `auto-orient`: js.UndefOr[Boolean] = js.native
    
    var blur: js.UndefOr[String] = js.native
    
    var crop: js.UndefOr[String] = js.native
    
    var format: js.UndefOr[String] = js.native
    
    var gravity: js.UndefOr[String] = js.native
    
    var quality: js.UndefOr[Double] = js.native
    
    var rotate: js.UndefOr[Double] = js.native
    
    var strip: js.UndefOr[Boolean] = js.native
    
    var thumbnail: js.UndefOr[String] = js.native
  }
  object PartialImageMogr2Options {
    
    @scala.inline
    def apply(): PartialImageMogr2Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialImageMogr2Options]
    }
    
    @scala.inline
    implicit class PartialImageMogr2OptionsMutableBuilder[Self <: PartialImageMogr2Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAuto-orient`(value: Boolean): Self = StObject.set(x, "auto-orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAuto-orientUndefined`: Self = StObject.set(x, "auto-orient", js.undefined)
      
      @scala.inline
      def setBlur(value: String): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
      
      @scala.inline
      def setCrop(value: String): Self = StObject.set(x, "crop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCropUndefined: Self = StObject.set(x, "crop", js.undefined)
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setGravity(value: String): Self = StObject.set(x, "gravity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGravityUndefined: Self = StObject.set(x, "gravity", js.undefined)
      
      @scala.inline
      def setQuality(value: Double): Self = StObject.set(x, "quality", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQualityUndefined: Self = StObject.set(x, "quality", js.undefined)
      
      @scala.inline
      def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setStrip(value: Boolean): Self = StObject.set(x, "strip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStripUndefined: Self = StObject.set(x, "strip", js.undefined)
      
      @scala.inline
      def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
    }
  }
  
  /* Inlined std.Partial<qiniu-js.qiniu-js.ImageView2Options> */
  @js.native
  trait PartialImageView2Options extends StObject {
    
    var format: js.UndefOr[jpg | gif | png | webp | String] = js.native
    
    var h: js.UndefOr[Double] = js.native
    
    var mode: js.UndefOr[`0` | `1` | `2` | `3` | `4` | `5`] = js.native
    
    var q: js.UndefOr[Double] = js.native
    
    var w: js.UndefOr[Double] = js.native
  }
  object PartialImageView2Options {
    
    @scala.inline
    def apply(): PartialImageView2Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialImageView2Options]
    }
    
    @scala.inline
    implicit class PartialImageView2OptionsMutableBuilder[Self <: PartialImageView2Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: jpg | gif | png | webp | String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      @scala.inline
      def setH(value: Double): Self = StObject.set(x, "h", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHUndefined: Self = StObject.set(x, "h", js.undefined)
      
      @scala.inline
      def setMode(value: `0` | `1` | `2` | `3` | `4` | `5`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setQ(value: Double): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQUndefined: Self = StObject.set(x, "q", js.undefined)
      
      @scala.inline
      def setW(value: Double): Self = StObject.set(x, "w", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWUndefined: Self = StObject.set(x, "w", js.undefined)
    }
  }
  
  @js.native
  trait Type extends StObject {
    
    var `type`: Double = js.native
    
    var `val`: String = js.native
  }
  object Type {
    
    @scala.inline
    def apply(`type`: Double, `val`: String): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVal(value: String): Self = StObject.set(x, "val", value.asInstanceOf[js.Any])
    }
  }
}
