package typings.qiniuJs

import typings.qiniuJs.anon.Authorization
import typings.qiniuJs.anon.PartialExtra
import typings.qiniuJs.esmApiMod.UploadCompleteData
import typings.qiniuJs.esmApiMod.UploadUrlConfig
import typings.qiniuJs.esmErrorsMod.QiniuErrorName
import typings.qiniuJs.esmImageMod.ImageMogr2_
import typings.qiniuJs.esmImageMod.ImageWatermark
import typings.qiniuJs.esmImageMod.Pipeline_
import typings.qiniuJs.esmUploadBaseMod.Config
import typings.qiniuJs.esmUploadBaseMod.UploadInfo
import typings.qiniuJs.esmUploadBaseMod.UploadProgress
import typings.qiniuJs.esmUtilsHelperMod.ResponseSuccess
import typings.qiniuJs.esmUtilsMod.Observable
import typings.qiniuJs.qiniuJsStrings.`cn-east-2`
import typings.std.File
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("qiniu-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("qiniu-js", "QiniuError")
  @js.native
  open class QiniuError protected ()
    extends typings.qiniuJs.esmErrorsMod.QiniuError {
    def this(name: QiniuErrorName, message: String) = this()
  }
  
  @JSImport("qiniu-js", "QiniuErrorName")
  @js.native
  object QiniuErrorName extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.qiniuJs.esmErrorsMod.QiniuErrorName & String] = js.native
    
    /* "FileReaderReadFailed" */ val FileReaderReadFailed: typings.qiniuJs.esmErrorsMod.QiniuErrorName.FileReaderReadFailed & String = js.native
    
    /* "GetCanvasContextFailed" */ val GetCanvasContextFailed: typings.qiniuJs.esmErrorsMod.QiniuErrorName.GetCanvasContextFailed & String = js.native
    
    /* "InvalidCacheData" */ val InvalidCacheData: typings.qiniuJs.esmErrorsMod.QiniuErrorName.InvalidCacheData & String = js.native
    
    /* "InvalidChunkSize" */ val InvalidChunkSize: typings.qiniuJs.esmErrorsMod.QiniuErrorName.InvalidChunkSize & String = js.native
    
    /* "InvalidCustomVars" */ val InvalidCustomVars: typings.qiniuJs.esmErrorsMod.QiniuErrorName.InvalidCustomVars & String = js.native
    
    /* "InvalidFile" */ val InvalidFile: typings.qiniuJs.esmErrorsMod.QiniuErrorName.InvalidFile & String = js.native
    
    /* "InvalidMetadata" */ val InvalidMetadata: typings.qiniuJs.esmErrorsMod.QiniuErrorName.InvalidMetadata & String = js.native
    
    /* "InvalidProgressEventTarget" */ val InvalidProgressEventTarget: typings.qiniuJs.esmErrorsMod.QiniuErrorName.InvalidProgressEventTarget & String = js.native
    
    /* "InvalidToken" */ val InvalidToken: typings.qiniuJs.esmErrorsMod.QiniuErrorName.InvalidToken & String = js.native
    
    /* "NotAvailableUploadHost" */ val NotAvailableUploadHost: typings.qiniuJs.esmErrorsMod.QiniuErrorName.NotAvailableUploadHost & String = js.native
    
    /* "NotAvailableXMLHttpRequest" */ val NotAvailableXMLHttpRequest: typings.qiniuJs.esmErrorsMod.QiniuErrorName.NotAvailableXMLHttpRequest & String = js.native
    
    /* "ReadCacheFailed" */ val ReadCacheFailed: typings.qiniuJs.esmErrorsMod.QiniuErrorName.ReadCacheFailed & String = js.native
    
    /* "RemoveCacheFailed" */ val RemoveCacheFailed: typings.qiniuJs.esmErrorsMod.QiniuErrorName.RemoveCacheFailed & String = js.native
    
    /* "RequestError" */ val RequestError: typings.qiniuJs.esmErrorsMod.QiniuErrorName.RequestError & String = js.native
    
    /* "UnsupportedFileType" */ val UnsupportedFileType: typings.qiniuJs.esmErrorsMod.QiniuErrorName.UnsupportedFileType & String = js.native
    
    /* "WriteCacheFailed" */ val WriteCacheFailed: typings.qiniuJs.esmErrorsMod.QiniuErrorName.WriteCacheFailed & String = js.native
  }
  
  @JSImport("qiniu-js", "QiniuNetworkError")
  @js.native
  open class QiniuNetworkError protected ()
    extends typings.qiniuJs.esmErrorsMod.QiniuNetworkError {
    def this(message: String) = this()
    def this(message: String, reqId: String) = this()
  }
  
  @JSImport("qiniu-js", "QiniuRequestError")
  @js.native
  open class QiniuRequestError protected ()
    extends typings.qiniuJs.esmErrorsMod.QiniuRequestError {
    def this(code: Double, reqId: String, message: String) = this()
    def this(code: Double, reqId: String, message: String, data: Any) = this()
  }
  
  inline def deleteUploadedChunks(token: String, key: String, uploadinfo: UploadInfo): js.Promise[ResponseSuccess[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteUploadedChunks")(token.asInstanceOf[js.Any], key.asInstanceOf[js.Any], uploadinfo.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseSuccess[Unit]]]
  inline def deleteUploadedChunks(token: String, key: Null, uploadinfo: UploadInfo): js.Promise[ResponseSuccess[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteUploadedChunks")(token.asInstanceOf[js.Any], key.asInstanceOf[js.Any], uploadinfo.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseSuccess[Unit]]]
  inline def deleteUploadedChunks(token: String, key: Unit, uploadinfo: UploadInfo): js.Promise[ResponseSuccess[Unit]] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteUploadedChunks")(token.asInstanceOf[js.Any], key.asInstanceOf[js.Any], uploadinfo.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseSuccess[Unit]]]
  
  inline def exif(key: String, domain: String): js.Promise[ResponseSuccess[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("exif")(key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseSuccess[Any]]]
  
  inline def getHeadersForChunkUpload(token: String): Authorization = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeadersForChunkUpload")(token.asInstanceOf[js.Any]).asInstanceOf[Authorization]
  
  inline def getHeadersForMkFile(token: String): Authorization = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeadersForMkFile")(token.asInstanceOf[js.Any]).asInstanceOf[Authorization]
  
  inline def getUploadUrl(_config: UploadUrlConfig, token: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUploadUrl")(_config.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def imageInfo(key: String, domain: String): js.Promise[ResponseSuccess[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("imageInfo")(key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseSuccess[Any]]]
  
  inline def imageMogr2(op: ImageMogr2_): String = ^.asInstanceOf[js.Dynamic].applyDynamic("imageMogr2")(op.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def imageMogr2(op: ImageMogr2_, key: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("imageMogr2")(op.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def imageMogr2(op: ImageMogr2_, key: String, domain: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("imageMogr2")(op.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def imageMogr2(op: ImageMogr2_, key: Unit, domain: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("imageMogr2")(op.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def pipeline(arr: js.Array[Pipeline_]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(arr.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def pipeline(arr: js.Array[Pipeline_], key: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(arr.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def pipeline(arr: js.Array[Pipeline_], key: String, domain: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(arr.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def pipeline(arr: js.Array[Pipeline_], key: Unit, domain: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("pipeline")(arr.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[String]
  
  object region {
    
    @JSImport("qiniu-js", "region.as0")
    @js.native
    val as0: typings.qiniuJs.qiniuJsStrings.as0 = js.native
    
    @JSImport("qiniu-js", "region.cnEast2")
    @js.native
    val cnEast2: `cn-east-2` = js.native
    
    @JSImport("qiniu-js", "region.na0")
    @js.native
    val na0: typings.qiniuJs.qiniuJsStrings.na0 = js.native
    
    @JSImport("qiniu-js", "region.z0")
    @js.native
    val z0: typings.qiniuJs.qiniuJsStrings.z0 = js.native
    
    @JSImport("qiniu-js", "region.z1")
    @js.native
    val z1: typings.qiniuJs.qiniuJsStrings.z1 = js.native
    
    @JSImport("qiniu-js", "region.z2")
    @js.native
    val z2: typings.qiniuJs.qiniuJsStrings.z2 = js.native
  }
  
  inline def upload(file: File, key: String, token: String): Observable[
    UploadProgress, 
    typings.qiniuJs.esmErrorsMod.QiniuError | typings.qiniuJs.esmErrorsMod.QiniuRequestError | typings.qiniuJs.esmErrorsMod.QiniuNetworkError, 
    UploadCompleteData
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Observable[
    UploadProgress, 
    typings.qiniuJs.esmErrorsMod.QiniuError | typings.qiniuJs.esmErrorsMod.QiniuRequestError | typings.qiniuJs.esmErrorsMod.QiniuNetworkError, 
    UploadCompleteData
  ]]
  inline def upload(file: File, key: String, token: String, putExtra: Unit, config: Config): Observable[
    UploadProgress, 
    typings.qiniuJs.esmErrorsMod.QiniuError | typings.qiniuJs.esmErrorsMod.QiniuRequestError | typings.qiniuJs.esmErrorsMod.QiniuNetworkError, 
    UploadCompleteData
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], token.asInstanceOf[js.Any], putExtra.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Observable[
    UploadProgress, 
    typings.qiniuJs.esmErrorsMod.QiniuError | typings.qiniuJs.esmErrorsMod.QiniuRequestError | typings.qiniuJs.esmErrorsMod.QiniuNetworkError, 
    UploadCompleteData
  ]]
  inline def upload(file: File, key: String, token: String, putExtra: PartialExtra): Observable[
    UploadProgress, 
    typings.qiniuJs.esmErrorsMod.QiniuError | typings.qiniuJs.esmErrorsMod.QiniuRequestError | typings.qiniuJs.esmErrorsMod.QiniuNetworkError, 
    UploadCompleteData
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], token.asInstanceOf[js.Any], putExtra.asInstanceOf[js.Any])).asInstanceOf[Observable[
    UploadProgress, 
    typings.qiniuJs.esmErrorsMod.QiniuError | typings.qiniuJs.esmErrorsMod.QiniuRequestError | typings.qiniuJs.esmErrorsMod.QiniuNetworkError, 
    UploadCompleteData
  ]]
  inline def upload(file: File, key: String, token: String, putExtra: PartialExtra, config: Config): Observable[
    UploadProgress, 
    typings.qiniuJs.esmErrorsMod.QiniuError | typings.qiniuJs.esmErrorsMod.QiniuRequestError | typings.qiniuJs.esmErrorsMod.QiniuNetworkError, 
    UploadCompleteData
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], token.asInstanceOf[js.Any], putExtra.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Observable[
    UploadProgress, 
    typings.qiniuJs.esmErrorsMod.QiniuError | typings.qiniuJs.esmErrorsMod.QiniuRequestError | typings.qiniuJs.esmErrorsMod.QiniuNetworkError, 
    UploadCompleteData
  ]]
  inline def upload(file: File, key: Null, token: String): Observable[
    UploadProgress, 
    typings.qiniuJs.esmErrorsMod.QiniuError | typings.qiniuJs.esmErrorsMod.QiniuRequestError | typings.qiniuJs.esmErrorsMod.QiniuNetworkError, 
    UploadCompleteData
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Observable[
    UploadProgress, 
    typings.qiniuJs.esmErrorsMod.QiniuError | typings.qiniuJs.esmErrorsMod.QiniuRequestError | typings.qiniuJs.esmErrorsMod.QiniuNetworkError, 
    UploadCompleteData
  ]]
  inline def upload(file: File, key: Null, token: String, putExtra: Unit, config: Config): Observable[
    UploadProgress, 
    typings.qiniuJs.esmErrorsMod.QiniuError | typings.qiniuJs.esmErrorsMod.QiniuRequestError | typings.qiniuJs.esmErrorsMod.QiniuNetworkError, 
    UploadCompleteData
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], token.asInstanceOf[js.Any], putExtra.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Observable[
    UploadProgress, 
    typings.qiniuJs.esmErrorsMod.QiniuError | typings.qiniuJs.esmErrorsMod.QiniuRequestError | typings.qiniuJs.esmErrorsMod.QiniuNetworkError, 
    UploadCompleteData
  ]]
  inline def upload(file: File, key: Null, token: String, putExtra: PartialExtra): Observable[
    UploadProgress, 
    typings.qiniuJs.esmErrorsMod.QiniuError | typings.qiniuJs.esmErrorsMod.QiniuRequestError | typings.qiniuJs.esmErrorsMod.QiniuNetworkError, 
    UploadCompleteData
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], token.asInstanceOf[js.Any], putExtra.asInstanceOf[js.Any])).asInstanceOf[Observable[
    UploadProgress, 
    typings.qiniuJs.esmErrorsMod.QiniuError | typings.qiniuJs.esmErrorsMod.QiniuRequestError | typings.qiniuJs.esmErrorsMod.QiniuNetworkError, 
    UploadCompleteData
  ]]
  inline def upload(file: File, key: Null, token: String, putExtra: PartialExtra, config: Config): Observable[
    UploadProgress, 
    typings.qiniuJs.esmErrorsMod.QiniuError | typings.qiniuJs.esmErrorsMod.QiniuRequestError | typings.qiniuJs.esmErrorsMod.QiniuNetworkError, 
    UploadCompleteData
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], token.asInstanceOf[js.Any], putExtra.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Observable[
    UploadProgress, 
    typings.qiniuJs.esmErrorsMod.QiniuError | typings.qiniuJs.esmErrorsMod.QiniuRequestError | typings.qiniuJs.esmErrorsMod.QiniuNetworkError, 
    UploadCompleteData
  ]]
  inline def upload(file: File, key: Unit, token: String): Observable[
    UploadProgress, 
    typings.qiniuJs.esmErrorsMod.QiniuError | typings.qiniuJs.esmErrorsMod.QiniuRequestError | typings.qiniuJs.esmErrorsMod.QiniuNetworkError, 
    UploadCompleteData
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Observable[
    UploadProgress, 
    typings.qiniuJs.esmErrorsMod.QiniuError | typings.qiniuJs.esmErrorsMod.QiniuRequestError | typings.qiniuJs.esmErrorsMod.QiniuNetworkError, 
    UploadCompleteData
  ]]
  inline def upload(file: File, key: Unit, token: String, putExtra: Unit, config: Config): Observable[
    UploadProgress, 
    typings.qiniuJs.esmErrorsMod.QiniuError | typings.qiniuJs.esmErrorsMod.QiniuRequestError | typings.qiniuJs.esmErrorsMod.QiniuNetworkError, 
    UploadCompleteData
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], token.asInstanceOf[js.Any], putExtra.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Observable[
    UploadProgress, 
    typings.qiniuJs.esmErrorsMod.QiniuError | typings.qiniuJs.esmErrorsMod.QiniuRequestError | typings.qiniuJs.esmErrorsMod.QiniuNetworkError, 
    UploadCompleteData
  ]]
  inline def upload(file: File, key: Unit, token: String, putExtra: PartialExtra): Observable[
    UploadProgress, 
    typings.qiniuJs.esmErrorsMod.QiniuError | typings.qiniuJs.esmErrorsMod.QiniuRequestError | typings.qiniuJs.esmErrorsMod.QiniuNetworkError, 
    UploadCompleteData
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], token.asInstanceOf[js.Any], putExtra.asInstanceOf[js.Any])).asInstanceOf[Observable[
    UploadProgress, 
    typings.qiniuJs.esmErrorsMod.QiniuError | typings.qiniuJs.esmErrorsMod.QiniuRequestError | typings.qiniuJs.esmErrorsMod.QiniuNetworkError, 
    UploadCompleteData
  ]]
  inline def upload(file: File, key: Unit, token: String, putExtra: PartialExtra, config: Config): Observable[
    UploadProgress, 
    typings.qiniuJs.esmErrorsMod.QiniuError | typings.qiniuJs.esmErrorsMod.QiniuRequestError | typings.qiniuJs.esmErrorsMod.QiniuNetworkError, 
    UploadCompleteData
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("upload")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], token.asInstanceOf[js.Any], putExtra.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[Observable[
    UploadProgress, 
    typings.qiniuJs.esmErrorsMod.QiniuError | typings.qiniuJs.esmErrorsMod.QiniuRequestError | typings.qiniuJs.esmErrorsMod.QiniuNetworkError, 
    UploadCompleteData
  ]]
  
  inline def urlSafeBase64Decode(v: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("urlSafeBase64Decode")(v.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def urlSafeBase64Encode(v: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("urlSafeBase64Encode")(v.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def watermark(op: ImageWatermark): String = ^.asInstanceOf[js.Dynamic].applyDynamic("watermark")(op.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def watermark(op: ImageWatermark, key: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("watermark")(op.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def watermark(op: ImageWatermark, key: String, domain: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("watermark")(op.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def watermark(op: ImageWatermark, key: Unit, domain: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("watermark")(op.asInstanceOf[js.Any], key.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[String]
}
