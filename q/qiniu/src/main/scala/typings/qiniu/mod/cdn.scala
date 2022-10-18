package typings.qiniu.mod

import typings.qiniu.mod.auth.digest.Mac
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cdn {
  
  @JSImport("qiniu", "cdn.CdnManager")
  @js.native
  open class CdnManager () extends StObject {
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
    def createTimestampAntiLeechUrl(domain: String, fileName: String, query: Any, encryptKey: String, deadline: Double): String = js.native
    
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
