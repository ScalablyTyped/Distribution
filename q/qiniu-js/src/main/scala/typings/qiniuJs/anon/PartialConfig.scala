package typings.qiniuJs.anon

import typings.qiniuJs.mod.Region_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<qiniu-js.qiniu-js.Config> */
@js.native
trait PartialConfig extends js.Object {
  var checkByMD5: js.UndefOr[Boolean] = js.native
  var concurrentRequestLimit: js.UndefOr[Double] = js.native
  var disableStatisticsReport: js.UndefOr[Boolean] = js.native
  var forceDirect: js.UndefOr[Boolean] = js.native
  var region: js.UndefOr[Region_ | String] = js.native
  var retryCount: js.UndefOr[Double] = js.native
  var uphost: js.UndefOr[String] = js.native
  var useCdnDomain: js.UndefOr[Boolean] = js.native
}

object PartialConfig {
  @scala.inline
  def apply(): PartialConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialConfig]
  }
  @scala.inline
  implicit class PartialConfigOps[Self <: PartialConfig] (val x: Self) extends AnyVal {
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
    def deleteCheckByMD5: Self = this.set("checkByMD5", js.undefined)
    @scala.inline
    def setConcurrentRequestLimit(value: Double): Self = this.set("concurrentRequestLimit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcurrentRequestLimit: Self = this.set("concurrentRequestLimit", js.undefined)
    @scala.inline
    def setDisableStatisticsReport(value: Boolean): Self = this.set("disableStatisticsReport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableStatisticsReport: Self = this.set("disableStatisticsReport", js.undefined)
    @scala.inline
    def setForceDirect(value: Boolean): Self = this.set("forceDirect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceDirect: Self = this.set("forceDirect", js.undefined)
    @scala.inline
    def setRegion(value: Region_ | String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    @scala.inline
    def setRetryCount(value: Double): Self = this.set("retryCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetryCount: Self = this.set("retryCount", js.undefined)
    @scala.inline
    def setUphost(value: String): Self = this.set("uphost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUphost: Self = this.set("uphost", js.undefined)
    @scala.inline
    def setUseCdnDomain(value: Boolean): Self = this.set("useCdnDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseCdnDomain: Self = this.set("useCdnDomain", js.undefined)
  }
  
}

