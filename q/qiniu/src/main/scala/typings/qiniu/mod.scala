package typings.qiniu

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.NodeJS.ReadableStream
import typings.qiniu.anon.Force
import typings.qiniu.mod.auth.digest.Mac
import typings.qiniu.mod.conf.Config
import typings.qiniu.mod.conf.Zone
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object auth {
    
    object digest {
      
      @JSImport("qiniu", "auth.digest.Mac")
      @js.native
      class Mac () extends StObject {
        def this(accessKey: String) = this()
        def this(accessKey: js.UndefOr[scala.Nothing], secretKey: String) = this()
        def this(accessKey: String, secretKey: String) = this()
        
        var accessKey: String = js.native
        
        var secretKey: String = js.native
      }
    }
  }
  
  object cdn {
    
    @JSImport("qiniu", "cdn.CdnManager")
    @js.native
    class CdnManager () extends StObject {
      def this(mac: Mac) = this()
      
      /**
        * 构建标准的基于时间戳的防盗链
        * @param domain  自定义域名，例如 http://img.abc.com
        * @param fileName 待访问的原始文件名，必须是utf8编码，不需要进行urlencode
        * @param query  业务自身的查询参数，必须是utf8编码，不需要进行urlencode, 例如 {aa:"23", attname:"11111111111111"}
        * @param encryptKey 时间戳防盗链的签名密钥，从七牛后台获取
        * @param deadline 链接的有效期时间戳，是以秒为单位的Unix时间戳
        * @return signedUrl  最终的带时间戳防盗链的url
        */
      def createTimestampAntiLeechUrl(domain: String, fileName: String, query: js.Any, encryptKey: String, deadline: Double): String = js.native
      
      /**
        * 获取域名带宽数据
        * @see http://developer.qiniu.com/article/fusion/api/traffic-bandwidth.html#batch-flux
        * @param startDate 开始日期，例如：2016-07-01
        * @param endDate 结束日期，例如：2016-07-03
        * @param granularity 粒度，取值：5min／hour／day
        * @param domains  域名列表 domain = ['obbid7qc6.qnssl.com','obbid7qc6.qnssl.com'];
        * @param callback callbackFunc(err, respBody, respInfo)
        */
      def getBandwidthData(
        startDate: String,
        endDate: String,
        granularity: String,
        domains: js.Array[String],
        callback: callback
      ): Unit = js.native
      
      /**
        * 获取域名日志下载链接
        * @see http://developer.qiniu.com/article/fusion/api/log.html
        *
        * @param domains 域名列表  如：['obbid7qc6.qnssl.com','7xkh68.com1.z0.glb.clouddn.com']
        * @param logDay logDay 如 2016-07-01
        * @param callback  callbackFunc(err, respBody, respInfo)
        */
      def getCdnLogList(domains: js.Array[String], logDay: String, callback: callback): Unit = js.native
      
      /**
        * 获取域名访问流量数据
        * @see http://developer.qiniu.com/article/fusion/api/traffic-bandwidth.html#batch-flux
        *
        * @param startDate 开始日期，例如：2016-07-01
        * @param endDate 结束日期，例如：2016-07-03
        * @param granularity 粒度，取值：5min／hour／day
        * @param domains  域名列表 domain = ['obbid7qc6.qnssl.com','obbid7qc6.qnssl.com'];
        * @param callback callbackFunc(err, respBody, respInfo)
        */
      def getFluxData(
        startDate: String,
        endDate: String,
        granularity: String,
        domains: js.Array[String],
        callback: callback
      ): Unit = js.native
      
      var mac: Mac = js.native
      
      /**
        * 预取文件链接
        * @see http://developer.qiniu.com/article/fusion/api/prefetch.html
        *
        * @param urls 预取urls  urls = ['http://obbid7qc6.qnssl.com/023','http://obbid7qc6.qnssl.com/025']
        * @param callback callbackFunc(err, respBody, respInfo)
        */
      def prefetchUrls(urls: js.Array[String], callback: callback): Unit = js.native
      
      /**
        * 刷新目录列表，每次最多不可以超过10个目录, 刷新目录需要额外开通权限，可以联系七牛技术支持处理
        * @see http://developer.qiniu.com/article/fusion/api/refresh.html
        *
        * @param dirs refreshDirs =  ['http://obbid7qc6.qnssl.com/wo/','http://obbid7qc6.qnssl.com/']
        * @param callback callbackFunc(err, respBody, respInfo)
        */
      def refreshDirs(dirs: js.Array[String], callback: callback): Unit = js.native
      
      /**
        * 刷新链接
        * @see http://developer.qiniu.com/article/fusion/api/refresh.html
        *
        * @param urls refreshUrls =  ['http://obbid7qc6.qnssl.com/023','http://obbid7qc6.qnssl.com/025']
        * @param callback callbackFunc(err, respBody, respInfo)
        */
      def refreshUrls(urls: js.Array[String], callback: callback): Unit = js.native
      
      /**
        * 刷新目录和链接
        * @param urls refreshUrls =  ['http://obbid7qc6.qnssl.com/023','http://obbid7qc6.qnssl.com/025']
        * @param dirs refreshDirs =  ['http://obbid7qc6.qnssl.com/wo/','http://obbid7qc6.qnssl.com/']
        * @param callback callbackFunc(err, respBody, respInfo)
        */
      def refreshUrlsAndDirs(urls: js.Array[String], dirs: js.Array[String], callback: callback): Unit = js.native
    }
  }
  
  object conf {
    
    @JSImport("qiniu", "conf")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("qiniu", "conf.ACCESS_KEY")
    @js.native
    def ACCESS_KEY: String = js.native
    @scala.inline
    def ACCESS_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACCESS_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("qiniu", "conf.BLOCK_SIZE")
    @js.native
    def BLOCK_SIZE: Double = js.native
    @scala.inline
    def BLOCK_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BLOCK_SIZE")(x.asInstanceOf[js.Any])
    
    @JSImport("qiniu", "conf.Config")
    @js.native
    class Config () extends ConfigOptions {
      def this(options: ConfigOptions) = this()
    }
    
    @JSImport("qiniu", "conf.FormMimeJson")
    @js.native
    def FormMimeJson: String = js.native
    @scala.inline
    def FormMimeJson_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FormMimeJson")(x.asInstanceOf[js.Any])
    
    @JSImport("qiniu", "conf.FormMimeRaw")
    @js.native
    def FormMimeRaw: String = js.native
    @scala.inline
    def FormMimeRaw_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FormMimeRaw")(x.asInstanceOf[js.Any])
    
    @JSImport("qiniu", "conf.FormMimeUrl")
    @js.native
    def FormMimeUrl: String = js.native
    @scala.inline
    def FormMimeUrl_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FormMimeUrl")(x.asInstanceOf[js.Any])
    
    @JSImport("qiniu", "conf.RPC_TIMEOUT")
    @js.native
    def RPC_TIMEOUT: Double = js.native
    @scala.inline
    def RPC_TIMEOUT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RPC_TIMEOUT")(x.asInstanceOf[js.Any])
    
    @JSImport("qiniu", "conf.RS_HOST")
    @js.native
    def RS_HOST: String = js.native
    @scala.inline
    def RS_HOST_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RS_HOST")(x.asInstanceOf[js.Any])
    
    @JSImport("qiniu", "conf.SECRET_KEY")
    @js.native
    def SECRET_KEY: String = js.native
    @scala.inline
    def SECRET_KEY_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SECRET_KEY")(x.asInstanceOf[js.Any])
    
    @JSImport("qiniu", "conf.USER_AGENT")
    @js.native
    def USER_AGENT: String = js.native
    @scala.inline
    def USER_AGENT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USER_AGENT")(x.asInstanceOf[js.Any])
    
    @JSImport("qiniu", "conf.Zone")
    @js.native
    class Zone protected () extends StObject {
      def this(
        srcUpHosts: js.UndefOr[js.Any],
        cdnUpHosts: js.UndefOr[js.Any],
        ioHost: js.UndefOr[String],
        rsHost: js.UndefOr[String],
        rsfHost: js.UndefOr[String],
        apiHost: js.UndefOr[String]
      ) = this()
      
      var apiHost: String = js.native
      
      var cdnUpHosts: js.Any = js.native
      
      var ioHost: String = js.native
      
      var rsHost: String = js.native
      
      var rsfHost: String = js.native
      
      var srcUpHosts: js.Any = js.native
    }
    
    @js.native
    trait ConfigOptions extends StObject {
      
      /**
        * @default true
        */
      var useCdnDomain: js.UndefOr[Boolean] = js.native
      
      /**
        * @default false
        */
      var useHttpsDomain: js.UndefOr[Boolean] = js.native
      
      /**
        * @default null
        */
      var zone: js.UndefOr[Zone] = js.native
      
      /**
        * @default -1
        */
      var zoneExpire: js.UndefOr[Double] = js.native
    }
    object ConfigOptions {
      
      @scala.inline
      def apply(): ConfigOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ConfigOptions]
      }
      
      @scala.inline
      implicit class ConfigOptionsMutableBuilder[Self <: ConfigOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setUseCdnDomain(value: Boolean): Self = StObject.set(x, "useCdnDomain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseCdnDomainUndefined: Self = StObject.set(x, "useCdnDomain", js.undefined)
        
        @scala.inline
        def setUseHttpsDomain(value: Boolean): Self = StObject.set(x, "useHttpsDomain", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseHttpsDomainUndefined: Self = StObject.set(x, "useHttpsDomain", js.undefined)
        
        @scala.inline
        def setZone(value: Zone): Self = StObject.set(x, "zone", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZoneExpire(value: Double): Self = StObject.set(x, "zoneExpire", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setZoneExpireUndefined: Self = StObject.set(x, "zoneExpire", js.undefined)
        
        @scala.inline
        def setZoneUndefined: Self = StObject.set(x, "zone", js.undefined)
      }
    }
  }
  
  object fop {
    
    @JSImport("qiniu", "fop.OperationManager")
    @js.native
    class OperationManager () extends StObject {
      def this(mac: Mac) = this()
      def this(mac: js.UndefOr[scala.Nothing], config: Config) = this()
      def this(mac: Mac, config: Config) = this()
      
      var config: Config = js.native
      
      var mac: Mac = js.native
      
      def pfop(
        bucket: String,
        key: String,
        fops: js.Array[String],
        pipeline: String,
        options: Null,
        callback: callback
      ): Unit = js.native
      /**
        * 发送持久化数据处理请求
        * @param bucket 空间名称
        * @param key 文件名称
        * @param fops 处理指令集合
        * @param pipeline 处理队列名称
        * @param options
        * @param callback
        */
      def pfop(
        bucket: String,
        key: String,
        fops: js.Array[String],
        pipeline: String,
        options: PfopOptions,
        callback: callback
      ): Unit = js.native
      
      /**
        * 查询持久化数据处理进度
        * @param persistentId pfop操作返回的持久化处理ID
        * @param callback
        */
      def prefop(persistentId: String, callback: callback): Unit = js.native
    }
    
    @js.native
    trait PfopOptions extends StObject {
      
      /**
        * 结果是否强制覆盖已有的同名文件
        */
      var force: js.UndefOr[Boolean] = js.native
      
      /**
        * 回调业务服务器，通知处理结果
        */
      var notifyURL: js.UndefOr[String] = js.native
    }
    object PfopOptions {
      
      @scala.inline
      def apply(): PfopOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PfopOptions]
      }
      
      @scala.inline
      implicit class PfopOptionsMutableBuilder[Self <: PfopOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
        
        @scala.inline
        def setNotifyURL(value: String): Self = StObject.set(x, "notifyURL", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setNotifyURLUndefined: Self = StObject.set(x, "notifyURL", js.undefined)
      }
    }
  }
  
  object formUp {
    
    @JSImport("qiniu", "form_up.FormUploader")
    @js.native
    class FormUploader () extends StObject {
      def this(config: Config) = this()
      
      var conf: Config = js.native
      
      def put(uploadToken: String, key: String, body: js.Any, putExtra: Null, callback: callback): Unit = js.native
      /**
        *
        * @param uploadToken
        * @param key
        * @param body
        * @param putExtra
        * @param callback
        */
      def put(uploadToken: String, key: String, body: js.Any, putExtra: PutExtra, callback: callback): Unit = js.native
      def put(uploadToken: String, key: Null, body: js.Any, putExtra: Null, callback: callback): Unit = js.native
      def put(uploadToken: String, key: Null, body: js.Any, putExtra: PutExtra, callback: callback): Unit = js.native
      
      def putFile(uploadToken: String, key: String, localFile: String, putExtra: Null, callback: callback): Unit = js.native
      /**
        * 上传本地文件
        * @param uploadToken 上传凭证
        * @param key 目标文件名
        * @param localFile 本地文件路径
        * @param putExtra 额外选项
        * @param callback
        */
      def putFile(uploadToken: String, key: String, localFile: String, putExtra: PutExtra, callback: callback): Unit = js.native
      def putFile(uploadToken: String, key: Null, localFile: String, putExtra: Null, callback: callback): Unit = js.native
      def putFile(uploadToken: String, key: Null, localFile: String, putExtra: PutExtra, callback: callback): Unit = js.native
      
      def putFileWithoutKey(uploadToken: String, localFile: String, putExtra: Null, callback: callback): Unit = js.native
      /**
        *
        * @param uploadToken
        * @param localFile
        * @param putExtra
        * @param callback
        */
      def putFileWithoutKey(uploadToken: String, localFile: String, putExtra: PutExtra, callback: callback): Unit = js.native
      
      def putStream(uploadToken: String, key: String, rsStream: ReadableStream, putExtra: Null, callback: callback): Unit = js.native
      /**
        *
        * @param uploadToken
        * @param key
        * @param rsStream
        * @param putExtra
        * @param callback
        */
      def putStream(uploadToken: String, key: String, rsStream: ReadableStream, putExtra: PutExtra, callback: callback): Unit = js.native
      def putStream(uploadToken: String, key: Null, rsStream: ReadableStream, putExtra: Null, callback: callback): Unit = js.native
      def putStream(uploadToken: String, key: Null, rsStream: ReadableStream, putExtra: PutExtra, callback: callback): Unit = js.native
      
      def putWithoutKey(uploadToken: String, body: js.Any, putExtra: Null, callback: callback): Unit = js.native
      /**
        *
        * @param uploadToken
        * @param body
        * @param putExtra
        * @param callback
        */
      def putWithoutKey(uploadToken: String, body: js.Any, putExtra: PutExtra, callback: callback): Unit = js.native
    }
    
    @JSImport("qiniu", "form_up.PutExtra")
    @js.native
    /**
      * 上传可选参数
      * @param fname 请求体中的文件的名称
      * @param params 额外参数设置，参数名称必须以x:开头
      * @param mimeType 指定文件的mimeType
      * @param crc32 指定文件的crc32值
      * @param checkCrc 指定是否检测文件的crc32值
      */
    class PutExtra () extends StObject {
      def this(fname: String) = this()
      def this(fname: js.UndefOr[scala.Nothing], params: js.Any) = this()
      def this(fname: String, params: js.Any) = this()
      def this(fname: js.UndefOr[scala.Nothing], params: js.UndefOr[scala.Nothing], mimeType: String) = this()
      def this(fname: js.UndefOr[scala.Nothing], params: js.Any, mimeType: String) = this()
      def this(fname: String, params: js.UndefOr[scala.Nothing], mimeType: String) = this()
      def this(fname: String, params: js.Any, mimeType: String) = this()
      def this(
        fname: js.UndefOr[scala.Nothing],
        params: js.UndefOr[scala.Nothing],
        mimeType: js.UndefOr[scala.Nothing],
        crc32: String
      ) = this()
      def this(
        fname: js.UndefOr[scala.Nothing],
        params: js.UndefOr[scala.Nothing],
        mimeType: String,
        crc32: String
      ) = this()
      def this(
        fname: js.UndefOr[scala.Nothing],
        params: js.Any,
        mimeType: js.UndefOr[scala.Nothing],
        crc32: String
      ) = this()
      def this(fname: js.UndefOr[scala.Nothing], params: js.Any, mimeType: String, crc32: String) = this()
      def this(
        fname: String,
        params: js.UndefOr[scala.Nothing],
        mimeType: js.UndefOr[scala.Nothing],
        crc32: String
      ) = this()
      def this(fname: String, params: js.UndefOr[scala.Nothing], mimeType: String, crc32: String) = this()
      def this(fname: String, params: js.Any, mimeType: js.UndefOr[scala.Nothing], crc32: String) = this()
      def this(fname: String, params: js.Any, mimeType: String, crc32: String) = this()
      def this(
        fname: js.UndefOr[scala.Nothing],
        params: js.UndefOr[scala.Nothing],
        mimeType: js.UndefOr[scala.Nothing],
        crc32: js.UndefOr[scala.Nothing],
        checkCrc: Boolean
      ) = this()
      def this(
        fname: js.UndefOr[scala.Nothing],
        params: js.UndefOr[scala.Nothing],
        mimeType: js.UndefOr[scala.Nothing],
        crc32: js.UndefOr[scala.Nothing],
        checkCrc: Double
      ) = this()
      def this(
        fname: js.UndefOr[scala.Nothing],
        params: js.UndefOr[scala.Nothing],
        mimeType: js.UndefOr[scala.Nothing],
        crc32: String,
        checkCrc: Boolean
      ) = this()
      def this(
        fname: js.UndefOr[scala.Nothing],
        params: js.UndefOr[scala.Nothing],
        mimeType: js.UndefOr[scala.Nothing],
        crc32: String,
        checkCrc: Double
      ) = this()
      def this(
        fname: js.UndefOr[scala.Nothing],
        params: js.UndefOr[scala.Nothing],
        mimeType: String,
        crc32: js.UndefOr[scala.Nothing],
        checkCrc: Boolean
      ) = this()
      def this(
        fname: js.UndefOr[scala.Nothing],
        params: js.UndefOr[scala.Nothing],
        mimeType: String,
        crc32: js.UndefOr[scala.Nothing],
        checkCrc: Double
      ) = this()
      def this(
        fname: js.UndefOr[scala.Nothing],
        params: js.UndefOr[scala.Nothing],
        mimeType: String,
        crc32: String,
        checkCrc: Boolean
      ) = this()
      def this(
        fname: js.UndefOr[scala.Nothing],
        params: js.UndefOr[scala.Nothing],
        mimeType: String,
        crc32: String,
        checkCrc: Double
      ) = this()
      def this(
        fname: js.UndefOr[scala.Nothing],
        params: js.Any,
        mimeType: js.UndefOr[scala.Nothing],
        crc32: js.UndefOr[scala.Nothing],
        checkCrc: Boolean
      ) = this()
      def this(
        fname: js.UndefOr[scala.Nothing],
        params: js.Any,
        mimeType: js.UndefOr[scala.Nothing],
        crc32: js.UndefOr[scala.Nothing],
        checkCrc: Double
      ) = this()
      def this(
        fname: js.UndefOr[scala.Nothing],
        params: js.Any,
        mimeType: js.UndefOr[scala.Nothing],
        crc32: String,
        checkCrc: Boolean
      ) = this()
      def this(
        fname: js.UndefOr[scala.Nothing],
        params: js.Any,
        mimeType: js.UndefOr[scala.Nothing],
        crc32: String,
        checkCrc: Double
      ) = this()
      def this(
        fname: js.UndefOr[scala.Nothing],
        params: js.Any,
        mimeType: String,
        crc32: js.UndefOr[scala.Nothing],
        checkCrc: Boolean
      ) = this()
      def this(
        fname: js.UndefOr[scala.Nothing],
        params: js.Any,
        mimeType: String,
        crc32: js.UndefOr[scala.Nothing],
        checkCrc: Double
      ) = this()
      def this(
        fname: js.UndefOr[scala.Nothing],
        params: js.Any,
        mimeType: String,
        crc32: String,
        checkCrc: Boolean
      ) = this()
      def this(
        fname: js.UndefOr[scala.Nothing],
        params: js.Any,
        mimeType: String,
        crc32: String,
        checkCrc: Double
      ) = this()
      def this(
        fname: String,
        params: js.UndefOr[scala.Nothing],
        mimeType: js.UndefOr[scala.Nothing],
        crc32: js.UndefOr[scala.Nothing],
        checkCrc: Boolean
      ) = this()
      def this(
        fname: String,
        params: js.UndefOr[scala.Nothing],
        mimeType: js.UndefOr[scala.Nothing],
        crc32: js.UndefOr[scala.Nothing],
        checkCrc: Double
      ) = this()
      def this(
        fname: String,
        params: js.UndefOr[scala.Nothing],
        mimeType: js.UndefOr[scala.Nothing],
        crc32: String,
        checkCrc: Boolean
      ) = this()
      def this(
        fname: String,
        params: js.UndefOr[scala.Nothing],
        mimeType: js.UndefOr[scala.Nothing],
        crc32: String,
        checkCrc: Double
      ) = this()
      def this(
        fname: String,
        params: js.UndefOr[scala.Nothing],
        mimeType: String,
        crc32: js.UndefOr[scala.Nothing],
        checkCrc: Boolean
      ) = this()
      def this(
        fname: String,
        params: js.UndefOr[scala.Nothing],
        mimeType: String,
        crc32: js.UndefOr[scala.Nothing],
        checkCrc: Double
      ) = this()
      def this(
        fname: String,
        params: js.UndefOr[scala.Nothing],
        mimeType: String,
        crc32: String,
        checkCrc: Boolean
      ) = this()
      def this(
        fname: String,
        params: js.UndefOr[scala.Nothing],
        mimeType: String,
        crc32: String,
        checkCrc: Double
      ) = this()
      def this(
        fname: String,
        params: js.Any,
        mimeType: js.UndefOr[scala.Nothing],
        crc32: js.UndefOr[scala.Nothing],
        checkCrc: Boolean
      ) = this()
      def this(
        fname: String,
        params: js.Any,
        mimeType: js.UndefOr[scala.Nothing],
        crc32: js.UndefOr[scala.Nothing],
        checkCrc: Double
      ) = this()
      def this(
        fname: String,
        params: js.Any,
        mimeType: js.UndefOr[scala.Nothing],
        crc32: String,
        checkCrc: Boolean
      ) = this()
      def this(
        fname: String,
        params: js.Any,
        mimeType: js.UndefOr[scala.Nothing],
        crc32: String,
        checkCrc: Double
      ) = this()
      def this(
        fname: String,
        params: js.Any,
        mimeType: String,
        crc32: js.UndefOr[scala.Nothing],
        checkCrc: Boolean
      ) = this()
      def this(
        fname: String,
        params: js.Any,
        mimeType: String,
        crc32: js.UndefOr[scala.Nothing],
        checkCrc: Double
      ) = this()
      def this(fname: String, params: js.Any, mimeType: String, crc32: String, checkCrc: Boolean) = this()
      def this(fname: String, params: js.Any, mimeType: String, crc32: String, checkCrc: Double) = this()
      
      /**
        * @default 0|false
        */
      var checkCrc: js.UndefOr[Double | Boolean] = js.native
      
      /**
        * @default null
        */
      var crc32: js.UndefOr[String] = js.native
      
      /**
        * @default ''
        */
      var fname: String = js.native
      
      /**
        * @default null
        */
      var mimeType: js.UndefOr[String] = js.native
      
      /**
        * @default {}
        */
      var params: js.Any = js.native
    }
  }
  
  object resumeUp {
    
    @JSImport("qiniu", "resume_up.PutExtra")
    @js.native
    /**
      * 上传可选参数
      * @param fname 请求体中的文件的名称
      * @param params 额外参数设置，参数名称必须以x:开头
      * @param mimeType 指定文件的mimeType
      * @param resumeRecordFile
      * @param progressCallback
      */
    class PutExtra () extends StObject {
      def this(fname: String) = this()
      def this(fname: js.UndefOr[scala.Nothing], params: js.Any) = this()
      def this(fname: String, params: js.Any) = this()
      def this(fname: js.UndefOr[scala.Nothing], params: js.UndefOr[scala.Nothing], mimeType: String) = this()
      def this(fname: js.UndefOr[scala.Nothing], params: js.Any, mimeType: String) = this()
      def this(fname: String, params: js.UndefOr[scala.Nothing], mimeType: String) = this()
      def this(fname: String, params: js.Any, mimeType: String) = this()
      def this(
        fname: js.UndefOr[scala.Nothing],
        params: js.UndefOr[scala.Nothing],
        mimeType: js.UndefOr[scala.Nothing],
        resumeRecordFile: String
      ) = this()
      def this(
        fname: js.UndefOr[scala.Nothing],
        params: js.UndefOr[scala.Nothing],
        mimeType: String,
        resumeRecordFile: String
      ) = this()
      def this(
        fname: js.UndefOr[scala.Nothing],
        params: js.Any,
        mimeType: js.UndefOr[scala.Nothing],
        resumeRecordFile: String
      ) = this()
      def this(fname: js.UndefOr[scala.Nothing], params: js.Any, mimeType: String, resumeRecordFile: String) = this()
      def this(
        fname: String,
        params: js.UndefOr[scala.Nothing],
        mimeType: js.UndefOr[scala.Nothing],
        resumeRecordFile: String
      ) = this()
      def this(fname: String, params: js.UndefOr[scala.Nothing], mimeType: String, resumeRecordFile: String) = this()
      def this(fname: String, params: js.Any, mimeType: js.UndefOr[scala.Nothing], resumeRecordFile: String) = this()
      def this(fname: String, params: js.Any, mimeType: String, resumeRecordFile: String) = this()
      def this(
        fname: js.UndefOr[scala.Nothing],
        params: js.UndefOr[scala.Nothing],
        mimeType: js.UndefOr[scala.Nothing],
        resumeRecordFile: js.UndefOr[scala.Nothing],
        progressCallback: js.Function1[/* data */ js.Any, Unit]
      ) = this()
      def this(
        fname: js.UndefOr[scala.Nothing],
        params: js.UndefOr[scala.Nothing],
        mimeType: js.UndefOr[scala.Nothing],
        resumeRecordFile: String,
        progressCallback: js.Function1[/* data */ js.Any, Unit]
      ) = this()
      def this(
        fname: js.UndefOr[scala.Nothing],
        params: js.UndefOr[scala.Nothing],
        mimeType: String,
        resumeRecordFile: js.UndefOr[scala.Nothing],
        progressCallback: js.Function1[/* data */ js.Any, Unit]
      ) = this()
      def this(
        fname: js.UndefOr[scala.Nothing],
        params: js.UndefOr[scala.Nothing],
        mimeType: String,
        resumeRecordFile: String,
        progressCallback: js.Function1[/* data */ js.Any, Unit]
      ) = this()
      def this(
        fname: js.UndefOr[scala.Nothing],
        params: js.Any,
        mimeType: js.UndefOr[scala.Nothing],
        resumeRecordFile: js.UndefOr[scala.Nothing],
        progressCallback: js.Function1[/* data */ js.Any, Unit]
      ) = this()
      def this(
        fname: js.UndefOr[scala.Nothing],
        params: js.Any,
        mimeType: js.UndefOr[scala.Nothing],
        resumeRecordFile: String,
        progressCallback: js.Function1[/* data */ js.Any, Unit]
      ) = this()
      def this(
        fname: js.UndefOr[scala.Nothing],
        params: js.Any,
        mimeType: String,
        resumeRecordFile: js.UndefOr[scala.Nothing],
        progressCallback: js.Function1[/* data */ js.Any, Unit]
      ) = this()
      def this(
        fname: js.UndefOr[scala.Nothing],
        params: js.Any,
        mimeType: String,
        resumeRecordFile: String,
        progressCallback: js.Function1[/* data */ js.Any, Unit]
      ) = this()
      def this(
        fname: String,
        params: js.UndefOr[scala.Nothing],
        mimeType: js.UndefOr[scala.Nothing],
        resumeRecordFile: js.UndefOr[scala.Nothing],
        progressCallback: js.Function1[/* data */ js.Any, Unit]
      ) = this()
      def this(
        fname: String,
        params: js.UndefOr[scala.Nothing],
        mimeType: js.UndefOr[scala.Nothing],
        resumeRecordFile: String,
        progressCallback: js.Function1[/* data */ js.Any, Unit]
      ) = this()
      def this(
        fname: String,
        params: js.UndefOr[scala.Nothing],
        mimeType: String,
        resumeRecordFile: js.UndefOr[scala.Nothing],
        progressCallback: js.Function1[/* data */ js.Any, Unit]
      ) = this()
      def this(
        fname: String,
        params: js.UndefOr[scala.Nothing],
        mimeType: String,
        resumeRecordFile: String,
        progressCallback: js.Function1[/* data */ js.Any, Unit]
      ) = this()
      def this(
        fname: String,
        params: js.Any,
        mimeType: js.UndefOr[scala.Nothing],
        resumeRecordFile: js.UndefOr[scala.Nothing],
        progressCallback: js.Function1[/* data */ js.Any, Unit]
      ) = this()
      def this(
        fname: String,
        params: js.Any,
        mimeType: js.UndefOr[scala.Nothing],
        resumeRecordFile: String,
        progressCallback: js.Function1[/* data */ js.Any, Unit]
      ) = this()
      def this(
        fname: String,
        params: js.Any,
        mimeType: String,
        resumeRecordFile: js.UndefOr[scala.Nothing],
        progressCallback: js.Function1[/* data */ js.Any, Unit]
      ) = this()
      def this(
        fname: String,
        params: js.Any,
        mimeType: String,
        resumeRecordFile: String,
        progressCallback: js.Function1[/* data */ js.Any, Unit]
      ) = this()
      
      /**
        * @default ''
        */
      var fname: String = js.native
      
      /**
        * @default null
        */
      var mimeType: js.UndefOr[String] = js.native
      
      /**
        * @default {}
        */
      var params: js.Any = js.native
    }
    
    @JSImport("qiniu", "resume_up.ResumeUploader")
    @js.native
    class ResumeUploader () extends StObject {
      def this(config: Config) = this()
      
      var config: Config = js.native
      
      def putFile(uploadToken: String, key: String, localFile: String, putExtra: Null, callback: callback): Unit = js.native
      /**
        *
        * @param uploadToken
        * @param key
        * @param localFile
        * @param putExtra
        * @param callback
        */
      def putFile(uploadToken: String, key: String, localFile: String, putExtra: PutExtra, callback: callback): Unit = js.native
      def putFile(uploadToken: String, key: Null, localFile: String, putExtra: Null, callback: callback): Unit = js.native
      def putFile(uploadToken: String, key: Null, localFile: String, putExtra: PutExtra, callback: callback): Unit = js.native
      
      def putFileWithoutKey(uploadToken: String, localFile: String, putExtra: Null, callback: callback): Unit = js.native
      /**
        *
        * @param uploadToken
        * @param localFile
        * @param putExtra
        * @param callback
        */
      def putFileWithoutKey(uploadToken: String, localFile: String, putExtra: PutExtra, callback: callback): Unit = js.native
      
      def putStream(
        uploadToken: String,
        key: String,
        rsStream: ReadableStream,
        rsStreamLen: Double,
        putExtra: Null,
        callback: callback
      ): Unit = js.native
      /**
        *
        * @param uploadToken
        * @param key
        * @param rsStream
        * @param rsStreamLen
        * @param putExtra
        * @param callback
        */
      def putStream(
        uploadToken: String,
        key: String,
        rsStream: ReadableStream,
        rsStreamLen: Double,
        putExtra: PutExtra,
        callback: callback
      ): Unit = js.native
      def putStream(
        uploadToken: String,
        key: Null,
        rsStream: ReadableStream,
        rsStreamLen: Double,
        putExtra: Null,
        callback: callback
      ): Unit = js.native
      def putStream(
        uploadToken: String,
        key: Null,
        rsStream: ReadableStream,
        rsStreamLen: Double,
        putExtra: PutExtra,
        callback: callback
      ): Unit = js.native
    }
  }
  
  object rpc {
    
    @JSImport("qiniu", "rpc.post")
    @js.native
    def post(requestURI: String, requestForm: String, headers: Null, callback: callback): Unit = js.native
    @JSImport("qiniu", "rpc.post")
    @js.native
    def post(requestURI: String, requestForm: String, headers: Headers, callback: callback): Unit = js.native
    @JSImport("qiniu", "rpc.post")
    @js.native
    def post(requestURI: String, requestForm: Null, headers: Null, callback: callback): Unit = js.native
    @JSImport("qiniu", "rpc.post")
    @js.native
    def post(requestURI: String, requestForm: Null, headers: Headers, callback: callback): Unit = js.native
    @JSImport("qiniu", "rpc.post")
    @js.native
    def post(requestURI: String, requestForm: Buffer, headers: Null, callback: callback): Unit = js.native
    /**
      *
      * @param requestURI
      * @param requestForm
      * @param headers
      * @param callback
      */
    @JSImport("qiniu", "rpc.post")
    @js.native
    def post(requestURI: String, requestForm: Buffer, headers: Headers, callback: callback): Unit = js.native
    @JSImport("qiniu", "rpc.post")
    @js.native
    def post(requestURI: String, requestForm: ReadableStream, headers: Null, callback: callback): Unit = js.native
    @JSImport("qiniu", "rpc.post")
    @js.native
    def post(requestURI: String, requestForm: ReadableStream, headers: Headers, callback: callback): Unit = js.native
    
    @JSImport("qiniu", "rpc.postMultipart")
    @js.native
    def postMultipart(requestURI: String, requestForm: String, callback: callback): Unit = js.native
    @JSImport("qiniu", "rpc.postMultipart")
    @js.native
    def postMultipart(requestURI: String, requestForm: Null, callback: callback): Unit = js.native
    /**
      *
      * @param requestURI
      * @param requestForm
      * @param callback
      */
    @JSImport("qiniu", "rpc.postMultipart")
    @js.native
    def postMultipart(requestURI: String, requestForm: Buffer, callback: callback): Unit = js.native
    @JSImport("qiniu", "rpc.postMultipart")
    @js.native
    def postMultipart(requestURI: String, requestForm: ReadableStream, callback: callback): Unit = js.native
    
    @JSImport("qiniu", "rpc.postWithForm")
    @js.native
    def postWithForm(requestURI: String, requestForm: String, token: String, callback: callback): Unit = js.native
    @JSImport("qiniu", "rpc.postWithForm")
    @js.native
    def postWithForm(requestURI: String, requestForm: String, token: Null, callback: callback): Unit = js.native
    @JSImport("qiniu", "rpc.postWithForm")
    @js.native
    def postWithForm(requestURI: String, requestForm: Null, token: String, callback: callback): Unit = js.native
    @JSImport("qiniu", "rpc.postWithForm")
    @js.native
    def postWithForm(requestURI: String, requestForm: Null, token: Null, callback: callback): Unit = js.native
    /**
      *
      * @param requestURI
      * @param requestForm
      * @param token
      * @param callback
      */
    @JSImport("qiniu", "rpc.postWithForm")
    @js.native
    def postWithForm(requestURI: String, requestForm: Buffer, token: String, callback: callback): Unit = js.native
    @JSImport("qiniu", "rpc.postWithForm")
    @js.native
    def postWithForm(requestURI: String, requestForm: Buffer, token: Null, callback: callback): Unit = js.native
    @JSImport("qiniu", "rpc.postWithForm")
    @js.native
    def postWithForm(requestURI: String, requestForm: ReadableStream, token: String, callback: callback): Unit = js.native
    @JSImport("qiniu", "rpc.postWithForm")
    @js.native
    def postWithForm(requestURI: String, requestForm: ReadableStream, token: Null, callback: callback): Unit = js.native
    
    /**
      *
      * @param requestURI
      * @param token
      * @param callback
      */
    @JSImport("qiniu", "rpc.postWithoutForm")
    @js.native
    def postWithoutForm(requestURI: String, token: String, callback: callback): Unit = js.native
    @JSImport("qiniu", "rpc.postWithoutForm")
    @js.native
    def postWithoutForm(requestURI: String, token: Null, callback: callback): Unit = js.native
    
    @js.native
    trait Headers extends StObject {
      
      var Connection: js.UndefOr[String] = js.native
      
      var `User-Agent`: js.UndefOr[String] = js.native
    }
    object Headers {
      
      @scala.inline
      def apply(): Headers = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Headers]
      }
      
      @scala.inline
      implicit class HeadersMutableBuilder[Self <: Headers] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setConnection(value: String): Self = StObject.set(x, "Connection", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setConnectionUndefined: Self = StObject.set(x, "Connection", js.undefined)
        
        @scala.inline
        def `setUser-Agent`(value: String): Self = StObject.set(x, "User-Agent", value.asInstanceOf[js.Any])
        
        @scala.inline
        def `setUser-AgentUndefined`: Self = StObject.set(x, "User-Agent", js.undefined)
      }
    }
  }
  
  object rs {
    
    @JSImport("qiniu", "rs.BucketManager")
    @js.native
    class BucketManager () extends StObject {
      def this(mac: Mac) = this()
      def this(mac: js.UndefOr[scala.Nothing], config: Config) = this()
      def this(mac: Mac, config: Config) = this()
      
      /**
        * 批量文件管理请求，支持stat，chgm，chtype，delete，copy，move
        * @param operations
        * @param callback
        */
      def batch(operations: js.Any, callback: callback): Unit = js.native
      
      /**
        * 修改文件的Headers
        * @see TODO
        *
        * @param bucket 空间名称
        * @param key 文件名称
        * @param headers Headers对象
        * @param callback
        */
      def changeHeaders(bucket: String, key: String, headers: StringDictionary[String], callback: callback): Unit = js.native
      
      /**
        * 修改文件的类型
        * @see https://developer.qiniu.com/kodo/api/1252/chgm
        *
        * @param bucket 空间名称
        * @param key 文件名称
        * @param newMime 新文件类型
        * @param callback
        */
      def changeMime(bucket: String, key: String, newMime: String, callback: callback): Unit = js.native
      
      /**
        * 修改文件的存储类型
        * @see https://developer.qiniu.com/kodo/api/3710/modify-the-file-type
        *
        * @param bucket 空间名称
        * @param key 文件名称
        * @param newType 0 表示标准存储；1 表示低频存储。
        * @param callback
        */
      def changeType(bucket: String, key: String, newType: Double, callback: callback): Unit = js.native
      
      var config: Config = js.native
      
      def copy(
        srcBucket: String,
        srcKey: String,
        destBucket: String,
        destKey: String,
        options: Null,
        callback: callback
      ): Unit = js.native
      /**
        * 复制文件
        * @see https://developer.qiniu.com/kodo/api/1254/copy
        *
        * @param srcBucket 源空间名称
        * @param srcKey 源文件名称
        * @param destBucket 目标空间名称
        * @param destKey 目标文件名称
        * @param options
        * @param callback
        */
      def copy(
        srcBucket: String,
        srcKey: String,
        destBucket: String,
        destKey: String,
        options: Force,
        callback: callback
      ): Unit = js.native
      
      /**
        * 删除资源
        * @see https://developer.qiniu.com/kodo/api/1257/delete
        *
        * @param bucket 空间名称
        * @param key 文件名称
        * @param callback
        */
      def delete(bucket: String, key: String, callback: callback): Unit = js.native
      
      /**
        * 更新文件的生命周期
        * @see https://developer.qiniu.com/kodo/api/1732/update-file-lifecycle
        *
        * @param bucket 空间名称
        * @param key 文件名称
        * @param days 有效期天数
        * @param callback
        */
      def deleteAfterDays(bucket: String, key: String, days: Double, callback: callback): Unit = js.native
      
      /**
        * 抓取资源
        * @see https://developer.qiniu.com/kodo/api/1263/fetch
        *
        * @param resUrl 资源链接
        * @param bucket 空间名称
        * @param key 文件名称
        * @param callback
        */
      def fetch(resUrl: String, bucket: String, key: String, callback: callback): Unit = js.native
      
      /**
        * 设置空间镜像源
        * @see https://developer.qiniu.com/kodo/api/1370/mirror
        *
        * @param bucket 空间名称
        * @param srcSiteUrl 镜像源地址
        * @param srcHost 镜像Host
        * @param callback
        */
      def image(bucket: String, srcSiteUrl: String, srcHost: String, callback: callback): Unit = js.native
      
      def listPrefix(bucket: String, options: Null, callback: callback): Unit = js.native
      /**
        * 获取指定前缀的文件列表
        * @see https://developer.qiniu.com/kodo/api/1284/list
        *
        * @param bucket 空间名称
        * @param options 列举操作的可选参数
        * @param callback
        */
      def listPrefix(bucket: String, options: ListPrefixOptions, callback: callback): Unit = js.native
      
      var mac: Mac = js.native
      
      def move(
        srcBucket: String,
        srcKey: String,
        destBucket: String,
        destKey: String,
        options: Null,
        callback: callback
      ): Unit = js.native
      /**
        * 移动或重命名文件，当bucketSrc==bucketDest相同的时候，就是重命名文件操作
        * @see https://developer.qiniu.com/kodo/api/1288/move
        *
        * @param srcBucket 源空间名称
        * @param srcKey 源文件名称
        * @param destBucket 目标空间名称
        * @param destKey 目标文件名称
        * @param options
        * @param callback
        */
      def move(
        srcBucket: String,
        srcKey: String,
        destBucket: String,
        destKey: String,
        options: Force,
        callback: callback
      ): Unit = js.native
      
      /**
        * 更新镜像副本
        * @see https://developer.qiniu.com/kodo/api/1293/prefetch
        *
        * @param bucket 空间名称
        * @param key 文件名称
        * @param callback
        */
      def prefetch(bucket: String, key: String, callback: callback): Unit = js.native
      
      /**
        * 获取私有空间的下载链接
        * @param domain 空间绑定的域名，比如以http或https开头
        * @param fileName 原始文件名
        * @param deadline 文件有效期时间戳（单位秒）
        */
      def privateDownloadUrl(domain: String, fileName: String, deadline: Double): String = js.native
      
      /**
        * 获取公开空间的下载链接
        * @param domain 空间绑定的域名，比如以http或https开头
        * @param fileName 原始文件名
        */
      def publicDownloadUrl(domain: String, fileName: String): String = js.native
      
      /**
        * 获取资源信息
        * @see https://developer.qiniu.com/kodo/api/1308/stat
        *
        * @param bucket 空间名称
        * @param key 文件名称
        * @param callback
        */
      def stat(bucket: String, key: String, callback: callback): Unit = js.native
      
      /**
        * 取消设置空间镜像源
        * @see https://developer.qiniu.com/kodo/api/1370/mirror
        *
        * @param bucket 空间名称
        * @param callback
        */
      def unimage(bucket: String, callback: callback): Unit = js.native
    }
    
    @JSImport("qiniu", "rs.PutPolicy")
    @js.native
    class PutPolicy () extends StObject {
      def this(options: PutPolicyOptions) = this()
      
      def getFlags(): js.Any = js.native
      
      def uploadToken(): String = js.native
      def uploadToken(mac: Mac): String = js.native
    }
    
    /**
      *
      * @param bucket
      * @param key
      * @param headers
      */
    @JSImport("qiniu", "rs.changeHeadersOp")
    @js.native
    def changeHeadersOp(bucket: String, key: String, headers: StringDictionary[String]): String = js.native
    
    /**
      *
      * @param bucket
      * @param key
      * @param newMime
      */
    @JSImport("qiniu", "rs.changeMimeOp")
    @js.native
    def changeMimeOp(bucket: String, key: String, newMime: String): String = js.native
    
    /**
      *
      * @param bucket
      * @param key
      * @param newType
      */
    @JSImport("qiniu", "rs.changeTypeOp")
    @js.native
    def changeTypeOp(bucket: String, key: String, newType: Double): String = js.native
    
    /**
      *
      * @param srcBucket
      * @param srcKey
      * @param destBucket
      * @param destKey
      * @param options
      */
    @JSImport("qiniu", "rs.copyOp")
    @js.native
    def copyOp(srcBucket: String, srcKey: String, destBucket: String, destKey: String): String = js.native
    @JSImport("qiniu", "rs.copyOp")
    @js.native
    def copyOp(srcBucket: String, srcKey: String, destBucket: String, destKey: String, options: Force): String = js.native
    
    /**
      *
      * @param bucket
      * @param key
      * @param days
      */
    @JSImport("qiniu", "rs.deleteAfterDaysOp")
    @js.native
    def deleteAfterDaysOp(bucket: String, key: String, days: Double): String = js.native
    
    /**
      *
      * @param bucket
      * @param key
      */
    @JSImport("qiniu", "rs.deleteOp")
    @js.native
    def deleteOp(bucket: String, key: String): String = js.native
    
    /**
      *
      * @param srcBucket
      * @param srcKey
      * @param destBucket
      * @param destKey
      * @param options
      */
    @JSImport("qiniu", "rs.moveOp")
    @js.native
    def moveOp(srcBucket: String, srcKey: String, destBucket: String, destKey: String): String = js.native
    @JSImport("qiniu", "rs.moveOp")
    @js.native
    def moveOp(srcBucket: String, srcKey: String, destBucket: String, destKey: String, options: Force): String = js.native
    
    /**
      *
      * @param bucket
      * @param key
      */
    @JSImport("qiniu", "rs.statOp")
    @js.native
    def statOp(bucket: String, key: String): String = js.native
    
    @js.native
    trait ListPrefixOptions extends StObject {
      
      /**
        * 指定目录分隔符
        */
      var delimiter: js.UndefOr[String] = js.native
      
      /**
        * 每次返回的最大列举文件数量
        */
      var limit: js.UndefOr[Double] = js.native
      
      /**
        * 上一次列举返回的位置标记
        */
      var marker: js.UndefOr[js.Any] = js.native
      
      /**
        * 列举的文件前缀
        */
      var prefix: js.UndefOr[String] = js.native
    }
    object ListPrefixOptions {
      
      @scala.inline
      def apply(): ListPrefixOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[ListPrefixOptions]
      }
      
      @scala.inline
      implicit class ListPrefixOptionsMutableBuilder[Self <: ListPrefixOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
        
        @scala.inline
        def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
        
        @scala.inline
        def setMarker(value: js.Any): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
        
        @scala.inline
        def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      }
    }
    
    @js.native
    trait PutPolicyOptions extends StObject {
      
      var callbackBody: js.UndefOr[String] = js.native
      
      var callbackBodyType: js.UndefOr[String] = js.native
      
      var callbackFetchKey: js.UndefOr[Double] = js.native
      
      var callbackHost: js.UndefOr[String] = js.native
      
      var callbackUrl: js.UndefOr[String] = js.native
      
      var deleteAfterDays: js.UndefOr[Double] = js.native
      
      var detectMime: js.UndefOr[Double] = js.native
      
      var endUser: js.UndefOr[String] = js.native
      
      var expires: js.UndefOr[Double] = js.native
      
      var fileType: js.UndefOr[Double] = js.native
      
      var fsizeLimit: js.UndefOr[Double] = js.native
      
      var fsizeMin: js.UndefOr[Double] = js.native
      
      var insertOnly: js.UndefOr[Double] = js.native
      
      var isPrefixalScope: js.UndefOr[Double] = js.native
      
      var mimeLimit: js.UndefOr[String] = js.native
      
      var persistentNotifyUrl: js.UndefOr[String] = js.native
      
      var persistentOps: js.UndefOr[String] = js.native
      
      var persistentPipeline: js.UndefOr[String] = js.native
      
      var returnBody: js.UndefOr[String] = js.native
      
      var returnUrl: js.UndefOr[String] = js.native
      
      var saveKey: js.UndefOr[String] = js.native
      
      var scope: js.UndefOr[String] = js.native
    }
    object PutPolicyOptions {
      
      @scala.inline
      def apply(): PutPolicyOptions = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[PutPolicyOptions]
      }
      
      @scala.inline
      implicit class PutPolicyOptionsMutableBuilder[Self <: PutPolicyOptions] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCallbackBody(value: String): Self = StObject.set(x, "callbackBody", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCallbackBodyType(value: String): Self = StObject.set(x, "callbackBodyType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCallbackBodyTypeUndefined: Self = StObject.set(x, "callbackBodyType", js.undefined)
        
        @scala.inline
        def setCallbackBodyUndefined: Self = StObject.set(x, "callbackBody", js.undefined)
        
        @scala.inline
        def setCallbackFetchKey(value: Double): Self = StObject.set(x, "callbackFetchKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCallbackFetchKeyUndefined: Self = StObject.set(x, "callbackFetchKey", js.undefined)
        
        @scala.inline
        def setCallbackHost(value: String): Self = StObject.set(x, "callbackHost", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCallbackHostUndefined: Self = StObject.set(x, "callbackHost", js.undefined)
        
        @scala.inline
        def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCallbackUrlUndefined: Self = StObject.set(x, "callbackUrl", js.undefined)
        
        @scala.inline
        def setDeleteAfterDays(value: Double): Self = StObject.set(x, "deleteAfterDays", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDeleteAfterDaysUndefined: Self = StObject.set(x, "deleteAfterDays", js.undefined)
        
        @scala.inline
        def setDetectMime(value: Double): Self = StObject.set(x, "detectMime", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setDetectMimeUndefined: Self = StObject.set(x, "detectMime", js.undefined)
        
        @scala.inline
        def setEndUser(value: String): Self = StObject.set(x, "endUser", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setEndUserUndefined: Self = StObject.set(x, "endUser", js.undefined)
        
        @scala.inline
        def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
        
        @scala.inline
        def setFileType(value: Double): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
        
        @scala.inline
        def setFsizeLimit(value: Double): Self = StObject.set(x, "fsizeLimit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFsizeLimitUndefined: Self = StObject.set(x, "fsizeLimit", js.undefined)
        
        @scala.inline
        def setFsizeMin(value: Double): Self = StObject.set(x, "fsizeMin", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFsizeMinUndefined: Self = StObject.set(x, "fsizeMin", js.undefined)
        
        @scala.inline
        def setInsertOnly(value: Double): Self = StObject.set(x, "insertOnly", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInsertOnlyUndefined: Self = StObject.set(x, "insertOnly", js.undefined)
        
        @scala.inline
        def setIsPrefixalScope(value: Double): Self = StObject.set(x, "isPrefixalScope", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsPrefixalScopeUndefined: Self = StObject.set(x, "isPrefixalScope", js.undefined)
        
        @scala.inline
        def setMimeLimit(value: String): Self = StObject.set(x, "mimeLimit", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMimeLimitUndefined: Self = StObject.set(x, "mimeLimit", js.undefined)
        
        @scala.inline
        def setPersistentNotifyUrl(value: String): Self = StObject.set(x, "persistentNotifyUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPersistentNotifyUrlUndefined: Self = StObject.set(x, "persistentNotifyUrl", js.undefined)
        
        @scala.inline
        def setPersistentOps(value: String): Self = StObject.set(x, "persistentOps", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPersistentOpsUndefined: Self = StObject.set(x, "persistentOps", js.undefined)
        
        @scala.inline
        def setPersistentPipeline(value: String): Self = StObject.set(x, "persistentPipeline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPersistentPipelineUndefined: Self = StObject.set(x, "persistentPipeline", js.undefined)
        
        @scala.inline
        def setReturnBody(value: String): Self = StObject.set(x, "returnBody", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReturnBodyUndefined: Self = StObject.set(x, "returnBody", js.undefined)
        
        @scala.inline
        def setReturnUrl(value: String): Self = StObject.set(x, "returnUrl", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReturnUrlUndefined: Self = StObject.set(x, "returnUrl", js.undefined)
        
        @scala.inline
        def setSaveKey(value: String): Self = StObject.set(x, "saveKey", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSaveKeyUndefined: Self = StObject.set(x, "saveKey", js.undefined)
        
        @scala.inline
        def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      }
    }
  }
  
  object util {
    
    @JSImport("qiniu", "util.base64ToUrlSafe")
    @js.native
    def base64ToUrlSafe(v: String): String = js.native
    
    @JSImport("qiniu", "util.encodedEntry")
    @js.native
    def encodedEntry(bucket: String): String = js.native
    @JSImport("qiniu", "util.encodedEntry")
    @js.native
    def encodedEntry(bucket: String, key: String): String = js.native
    
    /**
      * 创建AccessToken凭证
      * @param mac AK&SK对象
      * @param requestURI 请求URL
      * @param reqBody  请求Body，仅当请求的ContentType为application/x-www-form-urlencoded 时才需要传入该参数
      */
    @JSImport("qiniu", "util.generateAccessToken")
    @js.native
    def generateAccessToken(mac: Mac, requestURI: String): String = js.native
    @JSImport("qiniu", "util.generateAccessToken")
    @js.native
    def generateAccessToken(mac: Mac, requestURI: String, reqBody: String): String = js.native
    
    /**
      * 创建AccessToken凭证
      * @param mac            AK&SK对象
      * @param requestURI     请求URL
      * @param reqMethod      请求方法，例如 GET，POST
      * @param reqContentType 请求类型，例如 application/json 或者  application/x-www-form-urlencoded
      * @param reqBody        请求Body，仅当请求的 ContentType 为 application/json 或者 application/x-www-form-urlencoded 时才需要传入该参数
      */
    @JSImport("qiniu", "util.generateAccessTokenV2")
    @js.native
    def generateAccessTokenV2(mac: Mac, requestURI: String, reqMethod: String, reqContentType: String): String = js.native
    @JSImport("qiniu", "util.generateAccessTokenV2")
    @js.native
    def generateAccessTokenV2(mac: Mac, requestURI: String, reqMethod: String, reqContentType: String, reqBody: String): String = js.native
    
    @JSImport("qiniu", "util.getAKFromUptoken")
    @js.native
    def getAKFromUptoken(uploadToken: String): String = js.native
    
    @JSImport("qiniu", "util.getBucketFromUptoken")
    @js.native
    def getBucketFromUptoken(uploadToken: String): String = js.native
    
    @JSImport("qiniu", "util.hmacSha1")
    @js.native
    def hmacSha1(encodedFlags: String, secretKey: String): String = js.native
    @JSImport("qiniu", "util.hmacSha1")
    @js.native
    def hmacSha1(encodedFlags: String, secretKey: Buffer): String = js.native
    @JSImport("qiniu", "util.hmacSha1")
    @js.native
    def hmacSha1(encodedFlags: Buffer, secretKey: String): String = js.native
    @JSImport("qiniu", "util.hmacSha1")
    @js.native
    def hmacSha1(encodedFlags: Buffer, secretKey: Buffer): String = js.native
    
    /**
      * 校验七牛上传回调的Authorization
      * @param mac AK&SK对象
      * @param requestURI 回调的URL中的requestURI
      * @param reqBody 回调的URL中的requestURI 请求Body，仅当请求的ContentType为application/x-www-form-urlencoded时才需要传入该参数
      * @param callbackAuth 回调时请求的Authorization头部值
      */
    @JSImport("qiniu", "util.isQiniuCallback")
    @js.native
    def isQiniuCallback(mac: Mac, requestURI: String, reqBody: String, callbackAuth: String): Boolean = js.native
    @JSImport("qiniu", "util.isQiniuCallback")
    @js.native
    def isQiniuCallback(mac: Mac, requestURI: String, reqBody: Null, callbackAuth: String): Boolean = js.native
    
    @JSImport("qiniu", "util.isTimestampExpired")
    @js.native
    def isTimestampExpired(timestamp: Double): Boolean = js.native
    
    @JSImport("qiniu", "util.urlSafeBase64Decode")
    @js.native
    def urlSafeBase64Decode(fromStr: String): String = js.native
    
    @JSImport("qiniu", "util.urlSafeToBase64")
    @js.native
    def urlSafeToBase64(v: String): String = js.native
    
    @JSImport("qiniu", "util.urlsafeBase64Encode")
    @js.native
    def urlsafeBase64Encode(jsonFlags: String): String = js.native
  }
  
  object zone {
    
    //Southeast Asia
    @JSImport("qiniu", "zone.Zone_as0")
    @js.native
    val ZoneAs0: Zone = js.native
    
    //beimei
    @JSImport("qiniu", "zone.Zone_na0")
    @js.native
    val ZoneNa0: Zone = js.native
    
    //huadong
    @JSImport("qiniu", "zone.Zone_z0")
    @js.native
    val ZoneZ0: Zone = js.native
    
    //huabei
    @JSImport("qiniu", "zone.Zone_z1")
    @js.native
    val ZoneZ1: Zone = js.native
    
    //huanan
    @JSImport("qiniu", "zone.Zone_z2")
    @js.native
    val ZoneZ2: Zone = js.native
  }
  
  type callback = js.Function3[
    /* e */ js.UndefOr[Error], 
    /* respBody */ js.UndefOr[js.Any], 
    /* respInfo */ js.UndefOr[js.Any], 
    Unit
  ]
}
