package typings.qiniuJs

import typings.qiniuJs.anon.Dist
import typings.qiniuJs.anon.PartialCompressOptions
import typings.qiniuJs.anon.PartialConfig
import typings.qiniuJs.anon.PartialExtra
import typings.qiniuJs.anon.PartialImageMogr2Options
import typings.qiniuJs.anon.PartialImageView2Options
import typings.qiniuJs.mod.ExtentInfo
import typings.qiniuJs.mod.Headers
import typings.qiniuJs.mod.ImageInfo_
import typings.qiniuJs.mod.ImageMogr2FopOptions
import typings.qiniuJs.mod.ImageView2FopOptions
import typings.qiniuJs.mod.Observable
import typings.qiniuJs.mod.Region_
import typings.qiniuJs.mod.WaterMarkFopOptions1
import typings.qiniuJs.mod.WaterMarkFopOptions2
import typings.qiniuJs.mod.WaterMarkOptions1
import typings.qiniuJs.mod.WaterMarkOptions2
import typings.std.Blob
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object qiniu {
    
    @JSGlobal("qiniu")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("qiniu.Region")
    @js.native
    object Region_ extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.qiniuJs.mod.Region_ & Double] = js.native
      
      /* 4 */ val as0: typings.qiniuJs.mod.Region_.as0 & Double = js.native
      
      /* 3 */ val na0: typings.qiniuJs.mod.Region_.na0 & Double = js.native
      
      /* 0 */ val z0: typings.qiniuJs.mod.Region_.z0 & Double = js.native
      
      /* 1 */ val z1: typings.qiniuJs.mod.Region_.z1 & Double = js.native
      
      /* 2 */ val z2: typings.qiniuJs.mod.Region_.z2 & Double = js.native
    }
    
    inline def compressImage(file: Blob, options: PartialCompressOptions): js.Promise[Dist] = (^.asInstanceOf[js.Dynamic].applyDynamic("compressImage")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Dist]]
    
    inline def createMkFileUrl(url: String, size: Double, key: String, putExtra: PartialExtra): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createMkFileUrl")(url.asInstanceOf[js.Any], size.asInstanceOf[js.Any], key.asInstanceOf[js.Any], putExtra.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def exif(key: String, domain: String): js.Promise[ExtentInfo] = (^.asInstanceOf[js.Dynamic].applyDynamic("exif")(key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ExtentInfo]]
    
    inline def filterParams(params: js.Any): js.Array[js.Tuple2[String, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterParams")(params.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Tuple2[String, js.Any]]]
    
    inline def getHeadersForChunkUpload(token: String): Headers = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeadersForChunkUpload")(token.asInstanceOf[js.Any]).asInstanceOf[Headers]
    
    inline def getHeadersForMkFile(token: String): Headers = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeadersForMkFile")(token.asInstanceOf[js.Any]).asInstanceOf[Headers]
    
    inline def getUploadUrl(config: PartialConfig, token: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUploadUrl")(config.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
    
    inline def imageInfo(key: String, domain: String): js.Promise[ImageInfo_] = (^.asInstanceOf[js.Dynamic].applyDynamic("imageInfo")(key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ImageInfo_]]
    
    inline def imageMogr2(optoins: PartialImageMogr2Options, key: String, domain: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("imageMogr2")(optoins.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def imageView2(options: PartialImageView2Options, key: String, domain: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("imageView2")(options.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def pipeline(
      fos: js.Array[
          WaterMarkFopOptions1 | WaterMarkFopOptions2 | ImageView2FopOptions | ImageMogr2FopOptions
        ],
      key: String,
      domain: String
    ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(fos.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[String]
    
    object region {
      
      @JSGlobal("qiniu.region.as0")
      @js.native
      val as0: Region_ = js.native
      
      @JSGlobal("qiniu.region.na0")
      @js.native
      val na0: Region_ = js.native
      
      @JSGlobal("qiniu.region.z0")
      @js.native
      val z0: Region_ = js.native
      
      @JSGlobal("qiniu.region.z1")
      @js.native
      val z1: Region_ = js.native
      
      @JSGlobal("qiniu.region.z2")
      @js.native
      val z2: Region_ = js.native
    }
    
    inline def upload(file: Blob, key: String, token: String, putExtra: PartialExtra, config: PartialConfig): Observable = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], token.asInstanceOf[js.Any], putExtra.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Observable]
    inline def upload(file: Blob, key: Null, token: String, putExtra: PartialExtra, config: PartialConfig): Observable = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], token.asInstanceOf[js.Any], putExtra.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Observable]
    inline def upload(file: Blob, key: Unit, token: String, putExtra: PartialExtra, config: PartialConfig): Observable = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], token.asInstanceOf[js.Any], putExtra.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Observable]
    
    inline def watermark(options: WaterMarkOptions1): String = ^.asInstanceOf[js.Dynamic].applyDynamic("watermark")(options.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def watermark(options: WaterMarkOptions1, key: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("watermark")(options.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def watermark(options: WaterMarkOptions1, key: String, domain: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("watermark")(options.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def watermark(options: WaterMarkOptions1, key: Unit, domain: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("watermark")(options.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def watermark(options: WaterMarkOptions2): String = ^.asInstanceOf[js.Dynamic].applyDynamic("watermark")(options.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def watermark(options: WaterMarkOptions2, key: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("watermark")(options.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def watermark(options: WaterMarkOptions2, key: String, domain: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("watermark")(options.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def watermark(options: WaterMarkOptions2, key: Unit, domain: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("watermark")(options.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
