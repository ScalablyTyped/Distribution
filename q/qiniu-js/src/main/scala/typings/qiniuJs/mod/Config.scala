package typings.qiniuJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
   // 分片上传的并发请求量 默认3
  var checkByMD5: Boolean
   // 上传自动重试次 默认3
  var concurrentRequestLimit: Double
   // 上传 host，类型为 string， 如果设定该参数则优先使用该参数作为上传地址
  var disableStatisticsReport: Boolean
   // 是否开启 MD5 校验，为布尔值；在断点续传时，开启 MD5 校验会将已上传的分片与当前分片进行 MD5 值比对，若不一致，则重传该分片，避免使用错误的分片。读取分片内容并计算 MD5 需要花费一定的时间，因此会稍微增加断点续传时的耗时，默认为 false，不开启。
  var forceDirect: Boolean
   // 是否使用CDN域名 默认false
  var region: Region_ | String
   // 是否不允许上报日志 默认false
  var retryCount: Double
   // 区域
  var uphost: String
  var useCdnDomain: Boolean
}

object Config {
  @scala.inline
  def apply(
    checkByMD5: Boolean,
    concurrentRequestLimit: Double,
    disableStatisticsReport: Boolean,
    forceDirect: Boolean,
    region: Region_ | String,
    retryCount: Double,
    uphost: String,
    useCdnDomain: Boolean
  ): Config = {
    val __obj = js.Dynamic.literal(checkByMD5 = checkByMD5.asInstanceOf[js.Any], concurrentRequestLimit = concurrentRequestLimit.asInstanceOf[js.Any], disableStatisticsReport = disableStatisticsReport.asInstanceOf[js.Any], forceDirect = forceDirect.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], retryCount = retryCount.asInstanceOf[js.Any], uphost = uphost.asInstanceOf[js.Any], useCdnDomain = useCdnDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

