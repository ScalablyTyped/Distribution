package typings.qiniuJs

import org.scalablytyped.runtime.StringDictionary
import typings.qiniuJs.anon.Authorization
import typings.qiniuJs.anon.AuthorizationString
import typings.qiniuJs.baseMod.Progress
import typings.qiniuJs.loggerMod.default
import typings.qiniuJs.resumeMod.LocalInfo
import typings.std.Blob
import typings.std.BodyInit
import typings.std.File
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperMod {
  
  @JSImport("qiniu-js/esm/utils/helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("qiniu-js/esm/utils/helper", "MB")
  @js.native
  val MB: Double = js.native
  
  inline def computeMd5(data: Blob): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("computeMd5")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def createLocalKey(name: String, key: String, size: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createLocalKey")(name.asInstanceOf[js.Any], key.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def createLocalKey(name: String, key: Null, size: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createLocalKey")(name.asInstanceOf[js.Any], key.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def createLocalKey(name: String, key: Unit, size: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("createLocalKey")(name.asInstanceOf[js.Any], key.asInstanceOf[js.Any], size.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def createObjectURL(file: File): String = ^.asInstanceOf[js.Dynamic].applyDynamic("createObjectURL")(file.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def createXHR(): XMLHttpRequest = ^.asInstanceOf[js.Dynamic].applyDynamic("createXHR")().asInstanceOf[XMLHttpRequest]
  
  inline def getAuthHeaders(token: String): AuthorizationString = ^.asInstanceOf[js.Dynamic].applyDynamic("getAuthHeaders")(token.asInstanceOf[js.Any]).asInstanceOf[AuthorizationString]
  
  inline def getChunks(file: File, blockSize: Double): js.Array[Blob] = (^.asInstanceOf[js.Dynamic].applyDynamic("getChunks")(file.asInstanceOf[js.Any], blockSize.asInstanceOf[js.Any])).asInstanceOf[js.Array[Blob]]
  
  inline def getDomainFromUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDomainFromUrl")().asInstanceOf[String]
  inline def getDomainFromUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getDomainFromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getHeadersForChunkUpload(token: String): Authorization = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeadersForChunkUpload")(token.asInstanceOf[js.Any]).asInstanceOf[Authorization]
  
  inline def getHeadersForMkFile(token: String): Authorization = ^.asInstanceOf[js.Dynamic].applyDynamic("getHeadersForMkFile")(token.asInstanceOf[js.Any]).asInstanceOf[Authorization]
  
  inline def getLocalFileInfo(localKey: String, logger: default): LocalInfo | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getLocalFileInfo")(localKey.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[LocalInfo | Null]
  
  inline def getPortFromUrl(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPortFromUrl")().asInstanceOf[String]
  inline def getPortFromUrl(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPortFromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getPutPolicy(token: String): PutPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("getPutPolicy")(token.asInstanceOf[js.Any]).asInstanceOf[PutPolicy]
  
  inline def isCustomVarsValid(params: StringDictionary[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCustomVarsValid")(params.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isMetaDataValid(params: StringDictionary[String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isMetaDataValid")(params.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def readAsArrayBuffer(data: Blob): js.Promise[js.typedarray.ArrayBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("readAsArrayBuffer")(data.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.typedarray.ArrayBuffer]]
  
  inline def removeLocalFileInfo(localKey: String, logger: default): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("removeLocalFileInfo")(localKey.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def request[T](url: String, options: RequestOptions): Response[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("request")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Response[T]]
  
  inline def setLocalFileInfo(localKey: String, info: LocalInfo, logger: default): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setLocalFileInfo")(localKey.asInstanceOf[js.Any], info.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def sum(list: js.Array[Double]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(list.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  trait PutPolicy extends StObject {
    
    var assessKey: String
    
    var bucketName: String
    
    var scope: String
  }
  object PutPolicy {
    
    inline def apply(assessKey: String, bucketName: String, scope: String): PutPolicy = {
      val __obj = js.Dynamic.literal(assessKey = assessKey.asInstanceOf[js.Any], bucketName = bucketName.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutPolicy]
    }
    
    extension [Self <: PutPolicy](x: Self) {
      
      inline def setAssessKey(value: String): Self = StObject.set(x, "assessKey", value.asInstanceOf[js.Any])
      
      inline def setBucketName(value: String): Self = StObject.set(x, "bucketName", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestOptions extends StObject {
    
    var body: js.UndefOr[BodyInit | Null] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[String]] = js.undefined
    
    var method: String
    
    var onCreate: js.UndefOr[XHRHandler] = js.undefined
    
    var onProgress: js.UndefOr[js.Function1[/* data */ Progress, Unit]] = js.undefined
  }
  object RequestOptions {
    
    inline def apply(method: String): RequestOptions = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestOptions]
    }
    
    extension [Self <: RequestOptions](x: Self) {
      
      inline def setBody(value: BodyInit): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setOnCreate(value: /* xhr */ XMLHttpRequest => Unit): Self = StObject.set(x, "onCreate", js.Any.fromFunction1(value))
      
      inline def setOnCreateUndefined: Self = StObject.set(x, "onCreate", js.undefined)
      
      inline def setOnProgress(value: /* data */ Progress => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      inline def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
    }
  }
  
  type Response[T] = js.Promise[ResponseSuccess[T]]
  
  trait ResponseSuccess[T] extends StObject {
    
    var data: T
    
    var reqId: String
  }
  object ResponseSuccess {
    
    inline def apply[T](data: T, reqId: String): ResponseSuccess[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], reqId = reqId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponseSuccess[T]]
    }
    
    extension [Self <: ResponseSuccess[?], T](x: Self & ResponseSuccess[T]) {
      
      inline def setData(value: T): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setReqId(value: String): Self = StObject.set(x, "reqId", value.asInstanceOf[js.Any])
    }
  }
  
  type XHRHandler = js.Function1[/* xhr */ XMLHttpRequest, Unit]
}
