package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DedicatedMasterCount extends js.Object {
  var dedicatedMasterCount: js.UndefOr[scala.Double] = js.undefined
  var dedicatedMasterEnabled: js.UndefOr[scala.Boolean] = js.undefined
  var dedicatedMasterType: js.UndefOr[java.lang.String] = js.undefined
  var instanceCount: js.UndefOr[scala.Double] = js.undefined
  var instanceType: js.UndefOr[java.lang.String] = js.undefined
  var zoneAwarenessEnabled: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_DedicatedMasterCount {
  @scala.inline
  def apply(
    dedicatedMasterCount: scala.Int | scala.Double = null,
    dedicatedMasterEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    dedicatedMasterType: java.lang.String = null,
    instanceCount: scala.Int | scala.Double = null,
    instanceType: java.lang.String = null,
    zoneAwarenessEnabled: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_DedicatedMasterCount = {
    val __obj = js.Dynamic.literal()
    if (dedicatedMasterCount != null) __obj.updateDynamic("dedicatedMasterCount")(dedicatedMasterCount.asInstanceOf[js.Any])
    if (!js.isUndefined(dedicatedMasterEnabled)) __obj.updateDynamic("dedicatedMasterEnabled")(dedicatedMasterEnabled)
    if (dedicatedMasterType != null) __obj.updateDynamic("dedicatedMasterType")(dedicatedMasterType)
    if (instanceCount != null) __obj.updateDynamic("instanceCount")(instanceCount.asInstanceOf[js.Any])
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType)
    if (!js.isUndefined(zoneAwarenessEnabled)) __obj.updateDynamic("zoneAwarenessEnabled")(zoneAwarenessEnabled)
    __obj.asInstanceOf[Anon_DedicatedMasterCount]
  }
}

