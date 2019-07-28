package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DockerVolumeConfiguration extends js.Object {
  var dockerVolumeConfiguration: js.UndefOr[Anon_Autoprovision] = js.undefined
  var hostPath: js.UndefOr[String] = js.undefined
  var name: String
}

object Anon_DockerVolumeConfiguration {
  @scala.inline
  def apply(name: String, dockerVolumeConfiguration: Anon_Autoprovision = null, hostPath: String = null): Anon_DockerVolumeConfiguration = {
    val __obj = js.Dynamic.literal(name = name)
    if (dockerVolumeConfiguration != null) __obj.updateDynamic("dockerVolumeConfiguration")(dockerVolumeConfiguration)
    if (hostPath != null) __obj.updateDynamic("hostPath")(hostPath)
    __obj.asInstanceOf[Anon_DockerVolumeConfiguration]
  }
}

