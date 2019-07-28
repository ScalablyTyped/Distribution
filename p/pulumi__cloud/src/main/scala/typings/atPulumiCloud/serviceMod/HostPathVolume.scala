package typings.atPulumiCloud.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostPathVolume extends Volume {
  var kind: typings.atPulumiCloud.atPulumiCloudStrings.HostPathVolume
  var path: String
}

@JSImport("@pulumi/cloud/service", "HostPathVolume")
@js.native
class HostPathVolumeCls protected () extends HostPathVolume {
  /**
    * Construct a new Volume with the given unique name.
    */
  def this(path: String) = this()
  /* CompleteClass */
  override var kind: typings.atPulumiCloud.atPulumiCloudStrings.HostPathVolume = js.native
  /* CompleteClass */
  override var path: String = js.native
}

object HostPathVolume {
  @scala.inline
  def apply(kind: typings.atPulumiCloud.atPulumiCloudStrings.HostPathVolume, path: String): HostPathVolume = {
    val __obj = js.Dynamic.literal(kind = kind, path = path)
  
    __obj.asInstanceOf[HostPathVolume]
  }
}

