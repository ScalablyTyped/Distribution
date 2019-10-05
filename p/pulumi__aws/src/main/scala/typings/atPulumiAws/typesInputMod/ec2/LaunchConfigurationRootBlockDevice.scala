package typings.atPulumiAws.typesInputMod.ec2

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchConfigurationRootBlockDevice extends js.Object {
  var deleteOnTermination: js.UndefOr[Input[Boolean]] = js.undefined
  var encrypted: js.UndefOr[Input[Boolean]] = js.undefined
  var iops: js.UndefOr[Input[Double]] = js.undefined
  var volumeSize: js.UndefOr[Input[Double]] = js.undefined
  var volumeType: js.UndefOr[Input[String]] = js.undefined
}

object LaunchConfigurationRootBlockDevice {
  @scala.inline
  def apply(
    deleteOnTermination: Input[Boolean] = null,
    encrypted: Input[Boolean] = null,
    iops: Input[Double] = null,
    volumeSize: Input[Double] = null,
    volumeType: Input[String] = null
  ): LaunchConfigurationRootBlockDevice = {
    val __obj = js.Dynamic.literal()
    if (deleteOnTermination != null) __obj.updateDynamic("deleteOnTermination")(deleteOnTermination.asInstanceOf[js.Any])
    if (encrypted != null) __obj.updateDynamic("encrypted")(encrypted.asInstanceOf[js.Any])
    if (iops != null) __obj.updateDynamic("iops")(iops.asInstanceOf[js.Any])
    if (volumeSize != null) __obj.updateDynamic("volumeSize")(volumeSize.asInstanceOf[js.Any])
    if (volumeType != null) __obj.updateDynamic("volumeType")(volumeType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchConfigurationRootBlockDevice]
  }
}

