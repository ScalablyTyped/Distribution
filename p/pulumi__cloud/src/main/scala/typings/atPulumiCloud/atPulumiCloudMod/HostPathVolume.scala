package typings.atPulumiCloud.atPulumiCloudMod

import typings.atPulumiCloud.serviceMod.HostPathVolume
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/cloud", "HostPathVolume")
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

