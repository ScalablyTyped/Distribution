package typings.qiniuJs

import org.scalablytyped.runtime.StringDictionary
import typings.qiniuJs.anon.PartialExtra
import typings.qiniuJs.esmErrorsMod.QiniuError
import typings.qiniuJs.esmLoggerMod.LogLevel
import typings.qiniuJs.esmUploadHostsMod.Host
import typings.qiniuJs.esmUploadHostsMod.HostPool
import typings.qiniuJs.esmUtilsHelperMod.ResponseSuccess
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
import typings.std.File
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmUploadBaseMod {
  
  /* note: abstract class */ @JSImport("qiniu-js/esm/upload/base", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Base {
    def this(
      options: UploadOptions,
      handlers: UploadHandlers,
      hostPool: HostPool,
      logger: typings.qiniuJs.esmLoggerMod.default
    ) = this()
  }
  
  @JSImport("qiniu-js/esm/upload/base", "DEFAULT_CHUNK_SIZE")
  @js.native
  val DEFAULT_CHUNK_SIZE: /* 4 */ Double = js.native
  
  @JSImport("qiniu-js/esm/upload/base", "FREEZE_CODE_LIST")
  @js.native
  val FREEZE_CODE_LIST: js.Array[Double] = js.native
  
  @JSImport("qiniu-js/esm/upload/base", "RETRY_CODE_LIST")
  @js.native
  val RETRY_CODE_LIST: js.Array[Double] = js.native
  
  @js.native
  trait Base extends StObject {
    
    /* protected */ var aborted: Boolean = js.native
    
    def addXhr(xhr: XMLHttpRequest): Unit = js.native
    
    /* protected */ var assessKey: String = js.native
    
    /* protected */ var bucketName: String = js.native
    
    /* private */ var checkAndFreezeHost: Any = js.native
    
    /* protected */ def checkAndUnfreezeHost(): Unit = js.native
    
    /* protected */ def checkAndUpdateUploadHost(): js.Promise[Unit] = js.native
    
    /* private */ var clear: Any = js.native
    
    /* protected */ var config: InternalConfig = js.native
    
    /* protected */ var file: File = js.native
    
    def getProgressInfoItem(loaded: Double, size: Double): ProgressCompose = js.native
    def getProgressInfoItem(loaded: Double, size: Double, fromCache: Boolean): ProgressCompose = js.native
    
    /* private */ var handleError: Any = js.native
    
    /* protected */ var hostPool: HostPool = js.native
    
    /* protected */ var key: js.UndefOr[String | Null] = js.native
    
    /* protected */ var logger: typings.qiniuJs.esmLoggerMod.default = js.native
    
    /* protected */ def onComplete(res: Any): Unit = js.native
    
    /* protected */ def onData(data: UploadProgress): Unit = js.native
    
    /* protected */ def onError(err: QiniuError): Unit = js.native
    
    /* protected */ var progress: UploadProgress = js.native
    
    /* protected */ var putExtra: Extra = js.native
    
    /**
      * @returns Promise 返回结果与上传最终状态无关，状态信息请通过 [Subscriber] 获取。
      * @description 上传文件，状态信息请通过 [Subscriber] 获取。
      */
    def putFile(): js.Promise[Unit] = js.native
    
    /* protected */ var retryCount: Double = js.native
    
    /**
      * @returns utils.Response<any>
      * @description 子类通过该方法实现具体的任务处理
      */
    /* protected */ def run(): js.Promise[ResponseSuccess[Any]] = js.native
    
    /* private */ var sendLog: Any = js.native
    
    def stop(): Unit = js.native
    
    /* protected */ var token: String = js.native
    
    /* protected */ var uploadAt: Double = js.native
    
    /* protected */ var uploadHost: js.UndefOr[Host] = js.native
    
    /* protected */ var xhrList: js.Array[XMLHttpRequest] = js.native
  }
  
  /* Inlined parent std.Partial<std.Omit<qiniu-js.qiniu-js/esm/upload/base.InternalConfig, 'upprotocol' | 'uphost'>> */
  trait Config extends StObject {
    
    var checkByMD5: js.UndefOr[Boolean] = js.undefined
    
    var checkByServer: js.UndefOr[Boolean] = js.undefined
    
    var chunkSize: js.UndefOr[Double] = js.undefined
    
    var concurrentRequestLimit: js.UndefOr[Double] = js.undefined
    
    var debugLogLevel: js.UndefOr[LogLevel] = js.undefined
    
    var disableStatisticsReport: js.UndefOr[Boolean] = js.undefined
    
    var forceDirect: js.UndefOr[Boolean] = js.undefined
    
    var region: js.UndefOr[z0 | z2 | na0 | as0 | z1 | `cn-east-2`] = js.undefined
    
    var retryCount: js.UndefOr[Double] = js.undefined
    
    /** 自定义上传域名 */
    var uphost: js.UndefOr[js.Array[String] | String] = js.undefined
    
    /** 上传域名协议 */
    var upprotocol: js.UndefOr[https | http | httpsColon | httpColon] = js.undefined
    
    var useCdnDomain: js.UndefOr[Boolean] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setCheckByMD5(value: Boolean): Self = StObject.set(x, "checkByMD5", value.asInstanceOf[js.Any])
      
      inline def setCheckByMD5Undefined: Self = StObject.set(x, "checkByMD5", js.undefined)
      
      inline def setCheckByServer(value: Boolean): Self = StObject.set(x, "checkByServer", value.asInstanceOf[js.Any])
      
      inline def setCheckByServerUndefined: Self = StObject.set(x, "checkByServer", js.undefined)
      
      inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      inline def setChunkSizeUndefined: Self = StObject.set(x, "chunkSize", js.undefined)
      
      inline def setConcurrentRequestLimit(value: Double): Self = StObject.set(x, "concurrentRequestLimit", value.asInstanceOf[js.Any])
      
      inline def setConcurrentRequestLimitUndefined: Self = StObject.set(x, "concurrentRequestLimit", js.undefined)
      
      inline def setDebugLogLevel(value: LogLevel): Self = StObject.set(x, "debugLogLevel", value.asInstanceOf[js.Any])
      
      inline def setDebugLogLevelUndefined: Self = StObject.set(x, "debugLogLevel", js.undefined)
      
      inline def setDisableStatisticsReport(value: Boolean): Self = StObject.set(x, "disableStatisticsReport", value.asInstanceOf[js.Any])
      
      inline def setDisableStatisticsReportUndefined: Self = StObject.set(x, "disableStatisticsReport", js.undefined)
      
      inline def setForceDirect(value: Boolean): Self = StObject.set(x, "forceDirect", value.asInstanceOf[js.Any])
      
      inline def setForceDirectUndefined: Self = StObject.set(x, "forceDirect", js.undefined)
      
      inline def setRegion(value: z0 | z2 | na0 | as0 | z1 | `cn-east-2`): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setRetryCount(value: Double): Self = StObject.set(x, "retryCount", value.asInstanceOf[js.Any])
      
      inline def setRetryCountUndefined: Self = StObject.set(x, "retryCount", js.undefined)
      
      inline def setUphost(value: js.Array[String] | String): Self = StObject.set(x, "uphost", value.asInstanceOf[js.Any])
      
      inline def setUphostUndefined: Self = StObject.set(x, "uphost", js.undefined)
      
      inline def setUphostVarargs(value: String*): Self = StObject.set(x, "uphost", js.Array(value*))
      
      inline def setUpprotocol(value: https | http | httpsColon | httpColon): Self = StObject.set(x, "upprotocol", value.asInstanceOf[js.Any])
      
      inline def setUpprotocolUndefined: Self = StObject.set(x, "upprotocol", js.undefined)
      
      inline def setUseCdnDomain(value: Boolean): Self = StObject.set(x, "useCdnDomain", value.asInstanceOf[js.Any])
      
      inline def setUseCdnDomainUndefined: Self = StObject.set(x, "useCdnDomain", js.undefined)
    }
  }
  
  trait Extra extends StObject {
    
    /** 用来放置自定义变量 */
    var customVars: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /** 文件原文件名 */
    var fname: String
    
    /** 自定义元信息 */
    var metadata: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /** 文件类型设置 */
    var mimeType: js.UndefOr[String] = js.undefined
  }
  object Extra {
    
    inline def apply(fname: String): Extra = {
      val __obj = js.Dynamic.literal(fname = fname.asInstanceOf[js.Any])
      __obj.asInstanceOf[Extra]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Extra] (val x: Self) extends AnyVal {
      
      inline def setCustomVars(value: StringDictionary[String]): Self = StObject.set(x, "customVars", value.asInstanceOf[js.Any])
      
      inline def setCustomVarsUndefined: Self = StObject.set(x, "customVars", js.undefined)
      
      inline def setFname(value: String): Self = StObject.set(x, "fname", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: StringDictionary[String]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataUndefined: Self = StObject.set(x, "metadata", js.undefined)
      
      inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
    }
  }
  
  trait InternalConfig extends StObject {
    
    /** 是否对分片进行 md5校验 */
    var checkByMD5: Boolean
    
    /** 是否开启服务端校验 */
    var checkByServer: Boolean
    
    /** 分片大小，单位为 MB */
    var chunkSize: Double
    
    /** 自定义分片上传并发请求量 */
    var concurrentRequestLimit: Double
    
    /** 设置调试日志输出模式，默认 `OFF`，不输出任何日志 */
    var debugLogLevel: js.UndefOr[LogLevel] = js.undefined
    
    /** 是否禁止统计日志上报 */
    var disableStatisticsReport: Boolean
    
    /** 强制直传 */
    var forceDirect: Boolean
    
    /** 上传区域 */
    var region: js.UndefOr[z0 | z2 | na0 | as0 | z1 | `cn-east-2`] = js.undefined
    
    /** 上传失败后重试次数 */
    var retryCount: Double
    
    /** 自定义上传域名 */
    var uphost: js.Array[String]
    
    /** 上传域名协议 */
    var upprotocol: https | http
    
    /** 是否开启 cdn 加速 */
    var useCdnDomain: Boolean
  }
  object InternalConfig {
    
    inline def apply(
      checkByMD5: Boolean,
      checkByServer: Boolean,
      chunkSize: Double,
      concurrentRequestLimit: Double,
      disableStatisticsReport: Boolean,
      forceDirect: Boolean,
      retryCount: Double,
      uphost: js.Array[String],
      upprotocol: https | http,
      useCdnDomain: Boolean
    ): InternalConfig = {
      val __obj = js.Dynamic.literal(checkByMD5 = checkByMD5.asInstanceOf[js.Any], checkByServer = checkByServer.asInstanceOf[js.Any], chunkSize = chunkSize.asInstanceOf[js.Any], concurrentRequestLimit = concurrentRequestLimit.asInstanceOf[js.Any], disableStatisticsReport = disableStatisticsReport.asInstanceOf[js.Any], forceDirect = forceDirect.asInstanceOf[js.Any], retryCount = retryCount.asInstanceOf[js.Any], uphost = uphost.asInstanceOf[js.Any], upprotocol = upprotocol.asInstanceOf[js.Any], useCdnDomain = useCdnDomain.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalConfig]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InternalConfig] (val x: Self) extends AnyVal {
      
      inline def setCheckByMD5(value: Boolean): Self = StObject.set(x, "checkByMD5", value.asInstanceOf[js.Any])
      
      inline def setCheckByServer(value: Boolean): Self = StObject.set(x, "checkByServer", value.asInstanceOf[js.Any])
      
      inline def setChunkSize(value: Double): Self = StObject.set(x, "chunkSize", value.asInstanceOf[js.Any])
      
      inline def setConcurrentRequestLimit(value: Double): Self = StObject.set(x, "concurrentRequestLimit", value.asInstanceOf[js.Any])
      
      inline def setDebugLogLevel(value: LogLevel): Self = StObject.set(x, "debugLogLevel", value.asInstanceOf[js.Any])
      
      inline def setDebugLogLevelUndefined: Self = StObject.set(x, "debugLogLevel", js.undefined)
      
      inline def setDisableStatisticsReport(value: Boolean): Self = StObject.set(x, "disableStatisticsReport", value.asInstanceOf[js.Any])
      
      inline def setForceDirect(value: Boolean): Self = StObject.set(x, "forceDirect", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: z0 | z2 | na0 | as0 | z1 | `cn-east-2`): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setRetryCount(value: Double): Self = StObject.set(x, "retryCount", value.asInstanceOf[js.Any])
      
      inline def setUphost(value: js.Array[String]): Self = StObject.set(x, "uphost", value.asInstanceOf[js.Any])
      
      inline def setUphostVarargs(value: String*): Self = StObject.set(x, "uphost", js.Array(value*))
      
      inline def setUpprotocol(value: https | http): Self = StObject.set(x, "upprotocol", value.asInstanceOf[js.Any])
      
      inline def setUseCdnDomain(value: Boolean): Self = StObject.set(x, "useCdnDomain", value.asInstanceOf[js.Any])
    }
  }
  
  trait Progress extends StObject {
    
    var loaded: Double
    
    var total: Double
  }
  object Progress {
    
    inline def apply(loaded: Double, total: Double): Progress = {
      val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Progress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Progress] (val x: Self) extends AnyVal {
      
      inline def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProgressCompose extends StObject {
    
    var fromCache: js.UndefOr[Boolean] = js.undefined
    
    var loaded: Double
    
    var percent: Double
    
    var size: Double
  }
  object ProgressCompose {
    
    inline def apply(loaded: Double, percent: Double, size: Double): ProgressCompose = {
      val __obj = js.Dynamic.literal(loaded = loaded.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProgressCompose]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProgressCompose] (val x: Self) extends AnyVal {
      
      inline def setFromCache(value: Boolean): Self = StObject.set(x, "fromCache", value.asInstanceOf[js.Any])
      
      inline def setFromCacheUndefined: Self = StObject.set(x, "fromCache", js.undefined)
      
      inline def setLoaded(value: Double): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      inline def setPercent(value: Double): Self = StObject.set(x, "percent", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait UploadHandlers extends StObject {
    
    def onComplete(res: Any): Unit
    
    def onData(data: UploadProgress): Unit
    
    def onError(err: QiniuError): Unit
  }
  object UploadHandlers {
    
    inline def apply(onComplete: Any => Unit, onData: UploadProgress => Unit, onError: QiniuError => Unit): UploadHandlers = {
      val __obj = js.Dynamic.literal(onComplete = js.Any.fromFunction1(onComplete), onData = js.Any.fromFunction1(onData), onError = js.Any.fromFunction1(onError))
      __obj.asInstanceOf[UploadHandlers]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UploadHandlers] (val x: Self) extends AnyVal {
      
      inline def setOnComplete(value: Any => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      inline def setOnData(value: UploadProgress => Unit): Self = StObject.set(x, "onData", js.Any.fromFunction1(value))
      
      inline def setOnError(value: QiniuError => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
    }
  }
  
  trait UploadInfo extends StObject {
    
    var id: String
    
    var url: String
  }
  object UploadInfo {
    
    inline def apply(id: String, url: String): UploadInfo = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UploadInfo] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait UploadOptions extends StObject {
    
    var config: InternalConfig
    
    var file: File
    
    var key: js.UndefOr[String | Null] = js.undefined
    
    var putExtra: js.UndefOr[PartialExtra] = js.undefined
    
    var token: String
  }
  object UploadOptions {
    
    inline def apply(config: InternalConfig, file: File, token: String): UploadOptions = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UploadOptions] (val x: Self) extends AnyVal {
      
      inline def setConfig(value: InternalConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyNull: Self = StObject.set(x, "key", null)
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setPutExtra(value: PartialExtra): Self = StObject.set(x, "putExtra", value.asInstanceOf[js.Any])
      
      inline def setPutExtraUndefined: Self = StObject.set(x, "putExtra", js.undefined)
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  trait UploadProgress extends StObject {
    
    var chunks: js.UndefOr[js.Array[ProgressCompose]] = js.undefined
    
    var total: ProgressCompose
    
    var uploadInfo: js.UndefOr[UploadInfo] = js.undefined
  }
  object UploadProgress {
    
    inline def apply(total: ProgressCompose): UploadProgress = {
      val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[UploadProgress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UploadProgress] (val x: Self) extends AnyVal {
      
      inline def setChunks(value: js.Array[ProgressCompose]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
      
      inline def setChunksUndefined: Self = StObject.set(x, "chunks", js.undefined)
      
      inline def setChunksVarargs(value: ProgressCompose*): Self = StObject.set(x, "chunks", js.Array(value*))
      
      inline def setTotal(value: ProgressCompose): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setUploadInfo(value: UploadInfo): Self = StObject.set(x, "uploadInfo", value.asInstanceOf[js.Any])
      
      inline def setUploadInfoUndefined: Self = StObject.set(x, "uploadInfo", js.undefined)
    }
  }
  
  type XHRHandler = js.Function1[/* xhr */ XMLHttpRequest, Unit]
}
