package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EbsEnabledIops extends js.Object {
  var ebsEnabled: Input[Boolean]
  var iops: js.UndefOr[Input[Double]] = js.undefined
  var volumeSize: js.UndefOr[Input[Double]] = js.undefined
  var volumeType: js.UndefOr[Input[String]] = js.undefined
}

object Anon_EbsEnabledIops {
  @scala.inline
  def apply(
    ebsEnabled: Input[Boolean],
    iops: Input[Double] = null,
    volumeSize: Input[Double] = null,
    volumeType: Input[String] = null
  ): Anon_EbsEnabledIops = {
    val __obj = js.Dynamic.literal(ebsEnabled = ebsEnabled.asInstanceOf[js.Any])
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (volumeSize != null) __obj.updateDynamic("volumeSize")(volumeSize.asInstanceOf[js.Any])
    if (volumeType != null) __obj.updateDynamic("volumeType")(volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EbsEnabledIops]
  }
}

