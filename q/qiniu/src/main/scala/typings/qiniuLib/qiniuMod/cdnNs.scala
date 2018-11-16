package typings
package qiniuLib.qiniuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qiniu", "cdn")
@js.native
object cdnNs extends js.Object {
  @js.native
  class CdnManager () extends js.Object {
    def this(mac: qiniuLib.qiniuMod.authNs.digestNs.Mac) = this()
    var mac: qiniuLib.qiniuMod.authNs.digestNs.Mac = js.native
    /**
             * 构建标准的基于时间戳的防盗链
             * @param domain  自定义域名，例如 http://img.abc.com
             * @param fileName 待访问的原始文件名，必须是utf8编码，不需要进行urlencode
             * @param query  业务自身的查询参数，必须是utf8编码，不需要进行urlencode, 例如 {aa:"23", attname:"11111111111111"}
             * @param encryptKey 时间戳防盗链的签名密钥，从七牛后台获取
             * @param deadline 链接的有效期时间戳，是以秒为单位的Unix时间戳
             * @return signedUrl  最终的带时间戳防盗链的url
             */
    def createTimestampAntiLeechUrl(
      domain: java.lang.String,
      fileName: java.lang.String,
      query: js.Any,
      encryptKey: java.lang.String,
      deadline: scala.Double
    ): java.lang.String = js.native
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
      startDate: java.lang.String,
      endDate: java.lang.String,
      granularity: java.lang.String,
      domains: js.Array[java.lang.String],
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    /**
             * 获取域名日志下载链接
             * @see http://developer.qiniu.com/article/fusion/api/log.html
             *
             * @param domains 域名列表  如：['obbid7qc6.qnssl.com','7xkh68.com1.z0.glb.clouddn.com']
             * @param logDay logDay 如 2016-07-01
             * @param callback  callbackFunc(err, respBody, respInfo)
             */
    def getCdnLogList(
      domains: js.Array[java.lang.String],
      logDay: java.lang.String,
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
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
      startDate: java.lang.String,
      endDate: java.lang.String,
      granularity: java.lang.String,
      domains: js.Array[java.lang.String],
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
    /**
             * 预取文件链接
             * @see http://developer.qiniu.com/article/fusion/api/prefetch.html
             *
             * @param urls 预取urls  urls = ['http://obbid7qc6.qnssl.com/023','http://obbid7qc6.qnssl.com/025']
             * @param callback callbackFunc(err, respBody, respInfo)
             */
    def prefetchUrls(urls: js.Array[java.lang.String], callback: qiniuLib.qiniuMod.callback): scala.Unit = js.native
    /**
             * 刷新目录列表，每次最多不可以超过10个目录, 刷新目录需要额外开通权限，可以联系七牛技术支持处理
             * @see http://developer.qiniu.com/article/fusion/api/refresh.html
             *
             * @param dirs refreshDirs =  ['http://obbid7qc6.qnssl.com/wo/','http://obbid7qc6.qnssl.com/']
             * @param callback callbackFunc(err, respBody, respInfo)
             */
    def refreshDirs(dirs: js.Array[java.lang.String], callback: qiniuLib.qiniuMod.callback): scala.Unit = js.native
    /**
             * 刷新链接
             * @see http://developer.qiniu.com/article/fusion/api/refresh.html
             *
             * @param urls refreshUrls =  ['http://obbid7qc6.qnssl.com/023','http://obbid7qc6.qnssl.com/025']
             * @param callback callbackFunc(err, respBody, respInfo)
             */
    def refreshUrls(urls: js.Array[java.lang.String], callback: qiniuLib.qiniuMod.callback): scala.Unit = js.native
    /**
             * 刷新目录和链接
             * @param urls refreshUrls =  ['http://obbid7qc6.qnssl.com/023','http://obbid7qc6.qnssl.com/025']
             * @param dirs refreshDirs =  ['http://obbid7qc6.qnssl.com/wo/','http://obbid7qc6.qnssl.com/']
             * @param callback callbackFunc(err, respBody, respInfo)
             */
    def refreshUrlsAndDirs(
      urls: js.Array[java.lang.String],
      dirs: js.Array[java.lang.String],
      callback: qiniuLib.qiniuMod.callback
    ): scala.Unit = js.native
  }
  
}

