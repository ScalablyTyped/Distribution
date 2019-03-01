package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DockerVolumeConfiguration extends js.Object {
  var dockerVolumeConfiguration: js.UndefOr[Anon_Autoprovision] = js.undefined
  var hostPath: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
}

object Anon_DockerVolumeConfiguration {
  @scala.inline
  def apply(
    name: java.lang.String,
    dockerVolumeConfiguration: Anon_Autoprovision = null,
    hostPath: java.lang.String = null
  ): Anon_DockerVolumeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (dockerVolumeConfiguration != null) __obj.updateDynamic("dockerVolumeConfiguration")(dockerVolumeConfiguration)
    if (hostPath != null) __obj.updateDynamic("hostPath")(hostPath)
    __obj.asInstanceOf[Anon_DockerVolumeConfiguration]
  }
}

