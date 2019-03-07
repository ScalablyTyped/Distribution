package typings
package atPulumiCloudLib.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostPathVolume extends Volume {
  var kind: atPulumiCloudLib.atPulumiCloudLibStrings.HostPathVolume
  var path: java.lang.String
}

object HostPathVolume {
  @scala.inline
  def apply(kind: atPulumiCloudLib.atPulumiCloudLibStrings.HostPathVolume, path: java.lang.String): HostPathVolume = {
    val __obj = js.Dynamic.literal(kind = kind, path = path)
  
    __obj.asInstanceOf[HostPathVolume]
  }
}

