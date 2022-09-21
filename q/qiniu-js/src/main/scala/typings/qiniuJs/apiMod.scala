package typings.qiniuJs

import typings.qiniuJs.anon.PartialRequestOptions
import typings.qiniuJs.anon.PartialRequestOptionsmd5s
import typings.qiniuJs.anon.Up
import typings.qiniuJs.baseMod.UploadInfo
import typings.qiniuJs.helperMod.Response
import typings.qiniuJs.qiniuJsStrings.`cn-east-2`
import typings.qiniuJs.qiniuJsStrings.as0
import typings.qiniuJs.qiniuJsStrings.http
import typings.qiniuJs.qiniuJsStrings.httpColon
import typings.qiniuJs.qiniuJsStrings.https
import typings.qiniuJs.qiniuJsStrings.httpsColon
import typings.qiniuJs.qiniuJsStrings.na0
import typings.qiniuJs.qiniuJsStrings.z0
import typings.qiniuJs.qiniuJsStrings.z1
import typings.qiniuJs.qiniuJsStrings.z2
import typings.std.FormData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiMod {
  
  @JSImport("qiniu-js/esm/api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def deleteUploadedChunks(token: String, key: String, uploadinfo: UploadInfo): Response[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteUploadedChunks")(token.asInstanceOf[js.Any], key.asInstanceOf[js.Any], uploadinfo.asInstanceOf[js.Any])).asInstanceOf[Response[Unit]]
  inline def deleteUploadedChunks(token: String, key: Null, uploadinfo: UploadInfo): Response[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteUploadedChunks")(token.asInstanceOf[js.Any], key.asInstanceOf[js.Any], uploadinfo.asInstanceOf[js.Any])).asInstanceOf[Response[Unit]]
  inline def deleteUploadedChunks(token: String, key: Unit, uploadinfo: UploadInfo): Response[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteUploadedChunks")(token.asInstanceOf[js.Any], key.asInstanceOf[js.Any], uploadinfo.asInstanceOf[js.Any])).asInstanceOf[Response[Unit]]
  
  inline def direct(url: String, data: FormData, options: PartialRequestOptions): js.Promise[UploadCompleteData] = (^.asInstanceOf[js.Dynamic].applyDynamic("direct")(url.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UploadCompleteData]]
  
  inline def getUpHosts(accessKey: String, bucketName: String, protocol: https | http): js.Promise[UpHosts] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUpHosts")(accessKey.asInstanceOf[js.Any], bucketName.asInstanceOf[js.Any], protocol.asInstanceOf[js.Any])).asInstanceOf[js.Promise[UpHosts]]
  
  inline def getUploadUrl(_config: UploadUrlConfig, token: String): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getUploadUrl")(_config.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  inline def initUploadParts(token: String, bucket: String, key: String, uploadUrl: String): Response[InitPartsData] = (^.asInstanceOf[js.Dynamic].applyDynamic("initUploadParts")(token.asInstanceOf[js.Any], bucket.asInstanceOf[js.Any], key.asInstanceOf[js.Any], uploadUrl.asInstanceOf[js.Any])).asInstanceOf[Response[InitPartsData]]
  inline def initUploadParts(token: String, bucket: String, key: Null, uploadUrl: String): Response[InitPartsData] = (^.asInstanceOf[js.Dynamic].applyDynamic("initUploadParts")(token.asInstanceOf[js.Any], bucket.asInstanceOf[js.Any], key.asInstanceOf[js.Any], uploadUrl.asInstanceOf[js.Any])).asInstanceOf[Response[InitPartsData]]
  inline def initUploadParts(token: String, bucket: String, key: Unit, uploadUrl: String): Response[InitPartsData] = (^.asInstanceOf[js.Dynamic].applyDynamic("initUploadParts")(token.asInstanceOf[js.Any], bucket.asInstanceOf[js.Any], key.asInstanceOf[js.Any], uploadUrl.asInstanceOf[js.Any])).asInstanceOf[Response[InitPartsData]]
  
  inline def uploadChunk(
    token: String,
    key: String,
    index: Double,
    uploadInfo: UploadInfo,
    options: PartialRequestOptionsmd5s
  ): Response[UploadChunkData] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadChunk")(token.asInstanceOf[js.Any], key.asInstanceOf[js.Any], index.asInstanceOf[js.Any], uploadInfo.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Response[UploadChunkData]]
  inline def uploadChunk(
    token: String,
    key: Null,
    index: Double,
    uploadInfo: UploadInfo,
    options: PartialRequestOptionsmd5s
  ): Response[UploadChunkData] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadChunk")(token.asInstanceOf[js.Any], key.asInstanceOf[js.Any], index.asInstanceOf[js.Any], uploadInfo.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Response[UploadChunkData]]
  inline def uploadChunk(
    token: String,
    key: Unit,
    index: Double,
    uploadInfo: UploadInfo,
    options: PartialRequestOptionsmd5s
  ): Response[UploadChunkData] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadChunk")(token.asInstanceOf[js.Any], key.asInstanceOf[js.Any], index.asInstanceOf[js.Any], uploadInfo.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Response[UploadChunkData]]
  
  inline def uploadComplete(token: String, key: String, uploadInfo: UploadInfo, options: PartialRequestOptions): Response[UploadCompleteData] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadComplete")(token.asInstanceOf[js.Any], key.asInstanceOf[js.Any], uploadInfo.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Response[UploadCompleteData]]
  inline def uploadComplete(token: String, key: Null, uploadInfo: UploadInfo, options: PartialRequestOptions): Response[UploadCompleteData] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadComplete")(token.asInstanceOf[js.Any], key.asInstanceOf[js.Any], uploadInfo.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Response[UploadCompleteData]]
  inline def uploadComplete(token: String, key: Unit, uploadInfo: UploadInfo, options: PartialRequestOptions): Response[UploadCompleteData] = (^.asInstanceOf[js.Dynamic].applyDynamic("uploadComplete")(token.asInstanceOf[js.Any], key.asInstanceOf[js.Any], uploadInfo.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Response[UploadCompleteData]]
  
  trait InitPartsData extends StObject {
    
    /** uploadId 的过期时间 */
    var expireAt: Double
    
    /** 该文件的上传 id， 后续该文件其他各个块的上传，已上传块的废弃，已上传块的合成文件，都需要该 id */
    var uploadId: String
  }
  object InitPartsData {
    
    inline def apply(expireAt: Double, uploadId: String): InitPartsData = {
      val __obj = js.Dynamic.literal(expireAt = expireAt.asInstanceOf[js.Any], uploadId = uploadId.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitPartsData]
    }
    
    extension [Self <: InitPartsData](x: Self) {
      
      inline def setExpireAt(value: Double): Self = StObject.set(x, "expireAt", value.asInstanceOf[js.Any])
      
      inline def setUploadId(value: String): Self = StObject.set(x, "uploadId", value.asInstanceOf[js.Any])
    }
  }
  
  trait UpHosts extends StObject {
    
    var data: Up
  }
  object UpHosts {
    
    inline def apply(data: Up): UpHosts = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[UpHosts]
    }
    
    extension [Self <: UpHosts](x: Self) {
      
      inline def setData(value: Up): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait UploadChunkData extends StObject {
    
    var etag: String
    
    var md5: String
  }
  object UploadChunkData {
    
    inline def apply(etag: String, md5: String): UploadChunkData = {
      val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], md5 = md5.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadChunkData]
    }
    
    extension [Self <: UploadChunkData](x: Self) {
      
      inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
      
      inline def setMd5(value: String): Self = StObject.set(x, "md5", value.asInstanceOf[js.Any])
    }
  }
  
  type UploadCompleteData = Any
  
  /* Inlined std.Partial<std.Pick<qiniu-js.qiniu-js/esm/upload.Config, 'upprotocol' | 'uphost' | 'region' | 'useCdnDomain'>> */
  trait UploadUrlConfig extends StObject {
    
    var region: js.UndefOr[z0 | z2 | na0 | as0 | z1 | `cn-east-2`] = js.undefined
    
    var uphost: js.UndefOr[js.Array[String] | String] = js.undefined
    
    var upprotocol: js.UndefOr[https | http | httpsColon | httpColon] = js.undefined
    
    var useCdnDomain: js.UndefOr[Boolean] = js.undefined
  }
  object UploadUrlConfig {
    
    inline def apply(): UploadUrlConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UploadUrlConfig]
    }
    
    extension [Self <: UploadUrlConfig](x: Self) {
      
      inline def setRegion(value: z0 | z2 | na0 | as0 | z1 | `cn-east-2`): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setUphost(value: js.Array[String] | String): Self = StObject.set(x, "uphost", value.asInstanceOf[js.Any])
      
      inline def setUphostUndefined: Self = StObject.set(x, "uphost", js.undefined)
      
      inline def setUphostVarargs(value: String*): Self = StObject.set(x, "uphost", js.Array(value*))
      
      inline def setUpprotocol(value: https | http | httpsColon | httpColon): Self = StObject.set(x, "upprotocol", value.asInstanceOf[js.Any])
      
      inline def setUpprotocolUndefined: Self = StObject.set(x, "upprotocol", js.undefined)
      
      inline def setUseCdnDomain(value: Boolean): Self = StObject.set(x, "useCdnDomain", value.asInstanceOf[js.Any])
      
      inline def setUseCdnDomainUndefined: Self = StObject.set(x, "useCdnDomain", js.undefined)
    }
  }
}
