package typings
package atPulumiCloudLib.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostPathVolume extends Volume {
  var kind: atPulumiCloudLib.atPulumiCloudLibStrings.HostPathVolume
  var path: java.lang.String
}

@JSImport("@pulumi/cloud/service", "HostPathVolume")
@js.native
class HostPathVolumeCls protected () extends HostPathVolume {
  /**
    * Construct a new Volume with the given unique name.
    */
  def this(path: java.lang.String) = this()
  /* CompleteClass */
  override var kind: atPulumiCloudLib.atPulumiCloudLibStrings.HostPathVolume = js.native
  /* CompleteClass */
  override var path: java.lang.String = js.native
}

object HostPathVolume {
  @scala.inline
  def apply(kind: atPulumiCloudLib.atPulumiCloudLibStrings.HostPathVolume, path: java.lang.String): HostPathVolume = {
    val __obj = js.Dynamic.literal(kind = kind, path = path)
  
    __obj.asInstanceOf[HostPathVolume]
  }
}

