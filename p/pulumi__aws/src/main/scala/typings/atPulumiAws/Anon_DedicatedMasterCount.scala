package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DedicatedMasterCount extends js.Object {
  var dedicatedMasterCount: js.UndefOr[Double] = js.undefined
  var dedicatedMasterEnabled: js.UndefOr[Boolean] = js.undefined
  var dedicatedMasterType: js.UndefOr[String] = js.undefined
  var instanceCount: js.UndefOr[Double] = js.undefined
  var instanceType: js.UndefOr[String] = js.undefined
  var zoneAwarenessConfig: js.UndefOr[Anon_AvailabilityZoneCount] = js.undefined
  var zoneAwarenessEnabled: js.UndefOr[Boolean] = js.undefined
}

object Anon_DedicatedMasterCount {
  @scala.inline
  def apply(
    dedicatedMasterCount: Int | Double = null,
    dedicatedMasterEnabled: js.UndefOr[Boolean] = js.undefined,
    dedicatedMasterType: String = null,
    instanceCount: Int | Double = null,
    instanceType: String = null,
    zoneAwarenessConfig: Anon_AvailabilityZoneCount = null,
    zoneAwarenessEnabled: js.UndefOr[Boolean] = js.undefined
  ): Anon_DedicatedMasterCount = {
    val __obj = js.Dynamic.literal()
    if (dedicatedMasterCount != null) __obj.updateDynamic("dedicatedMasterCount")(dedicatedMasterCount.asInstanceOf[js.Any])
    if (!js.isUndefined(dedicatedMasterEnabled)) __obj.updateDynamic("dedicatedMasterEnabled")(dedicatedMasterEnabled)
    if (dedicatedMasterType != null) __obj.updateDynamic("dedicatedMasterType")(dedicatedMasterType)
    if (instanceCount != null) __obj.updateDynamic("instanceCount")(instanceCount.asInstanceOf[js.Any])
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType)
    if (zoneAwarenessConfig != null) __obj.updateDynamic("zoneAwarenessConfig")(zoneAwarenessConfig)
    if (!js.isUndefined(zoneAwarenessEnabled)) __obj.updateDynamic("zoneAwarenessEnabled")(zoneAwarenessEnabled)
    __obj.asInstanceOf[Anon_DedicatedMasterCount]
  }
}

