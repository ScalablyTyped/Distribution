package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EbsEnabledIops extends js.Object {
  var ebsEnabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean]
  var iops: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var volumeSize: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var volumeType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_EbsEnabledIops {
  @scala.inline
  def apply(
    ebsEnabled: atPulumiPulumiLib.outputMod.Input[scala.Boolean],
    iops: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    volumeSize: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    volumeType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_EbsEnabledIops = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ebsEnabled")(ebsEnabled.asInstanceOf[js.Any])
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (volumeSize != null) __obj.updateDynamic("volumeSize")(volumeSize.asInstanceOf[js.Any])
    if (volumeType != null) __obj.updateDynamic("volumeType")(volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EbsEnabledIops]
  }
}

