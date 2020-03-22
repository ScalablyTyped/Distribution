package typings.qiniuJs

import typings.qiniuJs.mod.Region_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<qiniu-js.qiniu-js.Config> */
trait PartialConfig extends js.Object {
  var checkByMD5: js.UndefOr[Boolean] = js.undefined
  var concurrentRequestLimit: js.UndefOr[Double] = js.undefined
  var disableStatisticsReport: js.UndefOr[Boolean] = js.undefined
  var forceDirect: js.UndefOr[Boolean] = js.undefined
  var region: js.UndefOr[Region_ | String] = js.undefined
  var retryCount: js.UndefOr[Double] = js.undefined
  var uphost: js.UndefOr[String] = js.undefined
  var useCdnDomain: js.UndefOr[Boolean] = js.undefined
}

object PartialConfig {
  @scala.inline
  def apply(
    checkByMD5: js.UndefOr[Boolean] = js.undefined,
    concurrentRequestLimit: Int | Double = null,
    disableStatisticsReport: js.UndefOr[Boolean] = js.undefined,
    forceDirect: js.UndefOr[Boolean] = js.undefined,
    region: Region_ | String = null,
    retryCount: Int | Double = null,
    uphost: String = null,
    useCdnDomain: js.UndefOr[Boolean] = js.undefined
  ): PartialConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checkByMD5)) __obj.updateDynamic("checkByMD5")(checkByMD5.asInstanceOf[js.Any])
    if (concurrentRequestLimit != null) __obj.updateDynamic("concurrentRequestLimit")(concurrentRequestLimit.asInstanceOf[js.Any])
    if (!js.isUndefined(disableStatisticsReport)) __obj.updateDynamic("disableStatisticsReport")(disableStatisticsReport.asInstanceOf[js.Any])
    if (!js.isUndefined(forceDirect)) __obj.updateDynamic("forceDirect")(forceDirect.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (retryCount != null) __obj.updateDynamic("retryCount")(retryCount.asInstanceOf[js.Any])
    if (uphost != null) __obj.updateDynamic("uphost")(uphost.asInstanceOf[js.Any])
    if (!js.isUndefined(useCdnDomain)) __obj.updateDynamic("useCdnDomain")(useCdnDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialConfig]
  }
}

