package typings
package atPulumiCloudLib.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostPathVolume extends Volume {
  var path: java.lang.String
}

object HostPathVolume {
  @scala.inline
  def apply(kind: VolumeKind, path: java.lang.String): HostPathVolume = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[HostPathVolume]
  }
}

