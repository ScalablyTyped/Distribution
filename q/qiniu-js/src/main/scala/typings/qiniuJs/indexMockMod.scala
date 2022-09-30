package typings.qiniuJs

import typings.qiniuJs.anon.PartialRequestOptions
import typings.qiniuJs.anon.PartialRequestOptionsmd5s
import typings.qiniuJs.apiMod.InitPartsData
import typings.qiniuJs.apiMod.UpHosts
import typings.qiniuJs.apiMod.UploadChunkData
import typings.qiniuJs.apiMod.UploadCompleteData
import typings.qiniuJs.baseMod.UploadInfo
import typings.qiniuJs.errorsMod.QiniuNetworkError
import typings.qiniuJs.errorsMod.QiniuRequestError
import typings.qiniuJs.helperMod.ResponseSuccess
import typings.qiniuJs.qiniuJsStrings.deleteUploadedChunks
import typings.qiniuJs.qiniuJsStrings.direct
import typings.qiniuJs.qiniuJsStrings.getUpHosts
import typings.qiniuJs.qiniuJsStrings.http
import typings.qiniuJs.qiniuJsStrings.https
import typings.qiniuJs.qiniuJsStrings.initUploadParts
import typings.qiniuJs.qiniuJsStrings.uploadChunk
import typings.qiniuJs.qiniuJsStrings.uploadComplete
import typings.std.FormData
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object indexMockMod {
  
  @JSImport("qiniu-js/esm/api/index.mock", "MockApi")
  @js.native
  open class MockApi () extends StObject {
    
    /* private */ var callInterceptor: Any = js.native
    
    def clearInterceptor(): Unit = js.native
    
    def deleteUploadedChunks(): ReturnType[
        js.Function3[
          /* token */ String, 
          /* key */ js.UndefOr[String | Null], 
          /* uploadinfo */ UploadInfo, 
          js.Promise[ResponseSuccess[Unit]]
        ]
      ] = js.native
    
    def direct(): ReturnType[
        js.Function3[
          /* url */ String, 
          /* data */ FormData, 
          /* options */ PartialRequestOptions, 
          js.Promise[UploadCompleteData]
        ]
      ] = js.native
    
    def getUpHosts(): ReturnType[
        js.Function3[
          /* accessKey */ String, 
          /* bucketName */ String, 
          /* protocol */ https | http, 
          js.Promise[UpHosts]
        ]
      ] = js.native
    
    def initUploadParts(): ReturnType[
        js.Function4[
          /* token */ String, 
          /* bucket */ String, 
          /* key */ js.UndefOr[String | Null], 
          /* uploadUrl */ String, 
          js.Promise[ResponseSuccess[InitPartsData]]
        ]
      ] = js.native
    
    /* private */ var interceptorMap: Any = js.native
    
    def setInterceptor(name: ApiName, interceptor: Any): Unit = js.native
    def setInterceptor(
      name: getUpHosts,
      interceptor: js.Function3[
          /* accessKey */ String, 
          /* bucketName */ String, 
          /* protocol */ https | http, 
          js.Promise[UpHosts]
        ]
    ): Unit = js.native
    @JSName("setInterceptor")
    def setInterceptor_deleteUploadedChunks(
      name: deleteUploadedChunks,
      interceptor: js.Function3[
          /* token */ String, 
          /* key */ js.UndefOr[String | Null], 
          /* uploadinfo */ UploadInfo, 
          js.Promise[ResponseSuccess[Unit]]
        ]
    ): Unit = js.native
    @JSName("setInterceptor")
    def setInterceptor_direct(
      name: direct,
      interceptor: js.Function3[
          /* url */ String, 
          /* data */ FormData, 
          /* options */ PartialRequestOptions, 
          js.Promise[UploadCompleteData]
        ]
    ): Unit = js.native
    @JSName("setInterceptor")
    def setInterceptor_initUploadParts(
      name: initUploadParts,
      interceptor: js.Function4[
          /* token */ String, 
          /* bucket */ String, 
          /* key */ js.UndefOr[String | Null], 
          /* uploadUrl */ String, 
          js.Promise[ResponseSuccess[InitPartsData]]
        ]
    ): Unit = js.native
    @JSName("setInterceptor")
    def setInterceptor_uploadChunk(
      name: uploadChunk,
      interceptor: js.Function5[
          /* token */ String, 
          /* key */ js.UndefOr[String | Null], 
          /* index */ Double, 
          /* uploadInfo */ UploadInfo, 
          /* options */ PartialRequestOptionsmd5s, 
          js.Promise[ResponseSuccess[UploadChunkData]]
        ]
    ): Unit = js.native
    @JSName("setInterceptor")
    def setInterceptor_uploadComplete(
      name: uploadComplete,
      interceptor: js.Function4[
          /* token */ String, 
          /* key */ js.UndefOr[String | Null], 
          /* uploadInfo */ UploadInfo, 
          /* options */ PartialRequestOptions, 
          js.Promise[ResponseSuccess[UploadCompleteData]]
        ]
    ): Unit = js.native
    
    def uploadChunk(): ReturnType[
        js.Function5[
          /* token */ String, 
          /* key */ js.UndefOr[String | Null], 
          /* index */ Double, 
          /* uploadInfo */ UploadInfo, 
          /* options */ PartialRequestOptionsmd5s, 
          js.Promise[ResponseSuccess[UploadChunkData]]
        ]
      ] = js.native
    
    def uploadComplete(): ReturnType[
        js.Function4[
          /* token */ String, 
          /* key */ js.UndefOr[String | Null], 
          /* uploadInfo */ UploadInfo, 
          /* options */ PartialRequestOptions, 
          js.Promise[ResponseSuccess[UploadCompleteData]]
        ]
      ] = js.native
  }
  
  object errorMap {
    
    @JSImport("qiniu-js/esm/api/index.mock", "errorMap")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("qiniu-js/esm/api/index.mock", "errorMap.expiredToken")
    @js.native
    def expiredToken: QiniuRequestError = js.native
    inline def expiredToken_=(x: QiniuRequestError): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("expiredToken")(x.asInstanceOf[js.Any])
    
    @JSImport("qiniu-js/esm/api/index.mock", "errorMap.gatewayUnavailable")
    @js.native
    def gatewayUnavailable: QiniuRequestError = js.native
    inline def gatewayUnavailable_=(x: QiniuRequestError): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gatewayUnavailable")(x.asInstanceOf[js.Any])
    
    @JSImport("qiniu-js/esm/api/index.mock", "errorMap.invalidParams")
    @js.native
    def invalidParams: QiniuRequestError = js.native
    inline def invalidParams_=(x: QiniuRequestError): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidParams")(x.asInstanceOf[js.Any])
    
    @JSImport("qiniu-js/esm/api/index.mock", "errorMap.invalidUploadId")
    @js.native
    def invalidUploadId: QiniuRequestError = js.native
    inline def invalidUploadId_=(x: QiniuRequestError): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("invalidUploadId")(x.asInstanceOf[js.Any])
    
    @JSImport("qiniu-js/esm/api/index.mock", "errorMap.networkError")
    @js.native
    def networkError: QiniuNetworkError = js.native
    inline def networkError_=(x: QiniuNetworkError): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("networkError")(x.asInstanceOf[js.Any])
    
    @JSImport("qiniu-js/esm/api/index.mock", "errorMap.serviceError")
    @js.native
    def serviceError: QiniuRequestError = js.native
    inline def serviceError_=(x: QiniuRequestError): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serviceError")(x.asInstanceOf[js.Any])
    
    @JSImport("qiniu-js/esm/api/index.mock", "errorMap.serviceTimeout")
    @js.native
    def serviceTimeout: QiniuRequestError = js.native
    inline def serviceTimeout_=(x: QiniuRequestError): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serviceTimeout")(x.asInstanceOf[js.Any])
    
    @JSImport("qiniu-js/esm/api/index.mock", "errorMap.serviceUnavailable")
    @js.native
    def serviceUnavailable: QiniuRequestError = js.native
    inline def serviceUnavailable_=(x: QiniuRequestError): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("serviceUnavailable")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.qiniuJs.qiniuJsStrings.direct
    - typings.qiniuJs.qiniuJsStrings.getUpHosts
    - typings.qiniuJs.qiniuJsStrings.uploadChunk
    - typings.qiniuJs.qiniuJsStrings.uploadComplete
    - typings.qiniuJs.qiniuJsStrings.initUploadParts
    - typings.qiniuJs.qiniuJsStrings.deleteUploadedChunks
  */
  trait ApiName extends StObject
  object ApiName {
    
    inline def deleteUploadedChunks: typings.qiniuJs.qiniuJsStrings.deleteUploadedChunks = "deleteUploadedChunks".asInstanceOf[typings.qiniuJs.qiniuJsStrings.deleteUploadedChunks]
    
    inline def direct: typings.qiniuJs.qiniuJsStrings.direct = "direct".asInstanceOf[typings.qiniuJs.qiniuJsStrings.direct]
    
    inline def getUpHosts: typings.qiniuJs.qiniuJsStrings.getUpHosts = "getUpHosts".asInstanceOf[typings.qiniuJs.qiniuJsStrings.getUpHosts]
    
    inline def initUploadParts: typings.qiniuJs.qiniuJsStrings.initUploadParts = "initUploadParts".asInstanceOf[typings.qiniuJs.qiniuJsStrings.initUploadParts]
    
    inline def uploadChunk: typings.qiniuJs.qiniuJsStrings.uploadChunk = "uploadChunk".asInstanceOf[typings.qiniuJs.qiniuJsStrings.uploadChunk]
    
    inline def uploadComplete: typings.qiniuJs.qiniuJsStrings.uploadComplete = "uploadComplete".asInstanceOf[typings.qiniuJs.qiniuJsStrings.uploadComplete]
  }
}
