package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DedicatedMasterCountDedicatedMasterEnabled extends js.Object {
  var dedicatedMasterCount: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var dedicatedMasterEnabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var dedicatedMasterType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var instanceCount: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var instanceType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var zoneAwarenessEnabled: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

object Anon_DedicatedMasterCountDedicatedMasterEnabled {
  @scala.inline
  def apply(
    dedicatedMasterCount: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    dedicatedMasterEnabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null,
    dedicatedMasterType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    instanceCount: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    instanceType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    zoneAwarenessEnabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): Anon_DedicatedMasterCountDedicatedMasterEnabled = {
    val __obj = js.Dynamic.literal()
    if (dedicatedMasterCount != null) __obj.updateDynamic("dedicatedMasterCount")(dedicatedMasterCount.asInstanceOf[js.Any])
    if (dedicatedMasterEnabled != null) __obj.updateDynamic("dedicatedMasterEnabled")(dedicatedMasterEnabled.asInstanceOf[js.Any])
    if (dedicatedMasterType != null) __obj.updateDynamic("dedicatedMasterType")(dedicatedMasterType.asInstanceOf[js.Any])
    if (instanceCount != null) __obj.updateDynamic("instanceCount")(instanceCount.asInstanceOf[js.Any])
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType.asInstanceOf[js.Any])
    if (zoneAwarenessEnabled != null) __obj.updateDynamic("zoneAwarenessEnabled")(zoneAwarenessEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DedicatedMasterCountDedicatedMasterEnabled]
  }
}

