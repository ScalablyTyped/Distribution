package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DedicatedMasterCountDedicatedMasterEnabled extends js.Object {
  var dedicatedMasterCount: js.UndefOr[Input[Double]] = js.undefined
  var dedicatedMasterEnabled: js.UndefOr[Input[Boolean]] = js.undefined
  var dedicatedMasterType: js.UndefOr[Input[String]] = js.undefined
  var instanceCount: js.UndefOr[Input[Double]] = js.undefined
  var instanceType: js.UndefOr[Input[String]] = js.undefined
  var zoneAwarenessConfig: js.UndefOr[Input[Anon_AvailabilityZoneCountInput]] = js.undefined
  var zoneAwarenessEnabled: js.UndefOr[Input[Boolean]] = js.undefined
}

object Anon_DedicatedMasterCountDedicatedMasterEnabled {
  @scala.inline
  def apply(
    dedicatedMasterCount: Input[Double] = null,
    dedicatedMasterEnabled: Input[Boolean] = null,
    dedicatedMasterType: Input[String] = null,
    instanceCount: Input[Double] = null,
    instanceType: Input[String] = null,
    zoneAwarenessConfig: Input[Anon_AvailabilityZoneCountInput] = null,
    zoneAwarenessEnabled: Input[Boolean] = null
  ): Anon_DedicatedMasterCountDedicatedMasterEnabled = {
    val __obj = js.Dynamic.literal()
    if (dedicatedMasterCount != null) __obj.updateDynamic("dedicatedMasterCount")(dedicatedMasterCount.asInstanceOf[js.Any])
    if (dedicatedMasterEnabled != null) __obj.updateDynamic("dedicatedMasterEnabled")(dedicatedMasterEnabled.asInstanceOf[js.Any])
    if (dedicatedMasterType != null) __obj.updateDynamic("dedicatedMasterType")(dedicatedMasterType.asInstanceOf[js.Any])
    if (instanceCount != null) __obj.updateDynamic("instanceCount")(instanceCount.asInstanceOf[js.Any])
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType.asInstanceOf[js.Any])
    if (zoneAwarenessConfig != null) __obj.updateDynamic("zoneAwarenessConfig")(zoneAwarenessConfig.asInstanceOf[js.Any])
    if (zoneAwarenessEnabled != null) __obj.updateDynamic("zoneAwarenessEnabled")(zoneAwarenessEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DedicatedMasterCountDedicatedMasterEnabled]
  }
}

