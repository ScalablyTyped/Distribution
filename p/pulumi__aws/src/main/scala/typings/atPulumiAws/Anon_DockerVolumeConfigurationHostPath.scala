package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DockerVolumeConfigurationHostPath extends js.Object {
  var dockerVolumeConfiguration: js.UndefOr[Input[Anon_AutoprovisionDriver]] = js.undefined
  var hostPath: js.UndefOr[Input[String]] = js.undefined
  var name: Input[String]
}

object Anon_DockerVolumeConfigurationHostPath {
  @scala.inline
  def apply(
    name: Input[String],
    dockerVolumeConfiguration: Input[Anon_AutoprovisionDriver] = null,
    hostPath: Input[String] = null
  ): Anon_DockerVolumeConfigurationHostPath = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (dockerVolumeConfiguration != null) __obj.updateDynamic("dockerVolumeConfiguration")(dockerVolumeConfiguration.asInstanceOf[js.Any])
    if (hostPath != null) __obj.updateDynamic("hostPath")(hostPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DockerVolumeConfigurationHostPath]
  }
}

