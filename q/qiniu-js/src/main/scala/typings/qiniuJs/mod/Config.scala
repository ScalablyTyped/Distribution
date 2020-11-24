package typings.qiniuJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
   // 分片上传的并发请求量 默认3
  var checkByMD5: Boolean = js.native
  
   // 上传自动重试次 默认3
  var concurrentRequestLimit: Double = js.native
  
   // 上传 host，类型为 string， 如果设定该参数则优先使用该参数作为上传地址
  var disableStatisticsReport: Boolean = js.native
  
   // 是否开启 MD5 校验，为布尔值；在断点续传时，开启 MD5 校验会将已上传的分片与当前分片进行 MD5 值比对，若不一致，则重传该分片，避免使用错误的分片。读取分片内容并计算 MD5 需要花费一定的时间，因此会稍微增加断点续传时的耗时，默认为 false，不开启。
  var forceDirect: Boolean = js.native
  
   // 是否使用CDN域名 默认false
  var region: Region_ | String = js.native
  
   // 是否不允许上报日志 默认false
  var retryCount: Double = js.native
  
   // 区域
  var uphost: String = js.native
  
  var useCdnDomain: Boolean = js.native
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
  
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCheckByMD5(value: Boolean): Self = this.set("checkByMD5", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcurrentRequestLimit(value: Double): Self = this.set("concurrentRequestLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableStatisticsReport(value: Boolean): Self = this.set("disableStatisticsReport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForceDirect(value: Boolean): Self = this.set("forceDirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: Region_ | String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryCount(value: Double): Self = this.set("retryCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUphost(value: String): Self = this.set("uphost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseCdnDomain(value: Boolean): Self = this.set("useCdnDomain", value.asInstanceOf[js.Any])
  }
}
