package typings.pulumiCloud.mod

import typings.pulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/cloud", "SharedVolume")
@js.native
class SharedVolumeCls protected ()
  extends typings.pulumiCloud.serviceMod.SharedVolume {
  /**
    * Construct a new Volume with the given unique name.
    *
    * @param name The unique name of the volume.
    * @param opts A bag of options that controls how this resource behaves.
    */
  def this(name: String) = this()
  def this(name: String, opts: ResourceOptions) = this()
}

