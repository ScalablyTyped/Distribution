package typings.atPulumiCloud.atPulumiCloudMod

import typings.atPulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/cloud", "SharedVolume")
@js.native
class SharedVolumeCls protected ()
  extends typings.atPulumiCloud.serviceMod.SharedVolume {
  /**
    * Construct a new Volume with the given unique name.
    *
    * @param name The unique name of the volume.
    * @param opts A bag of options that controls how this resource behaves.
    */
  def this(name: String) = this()
  def this(name: String, opts: ResourceOptions) = this()
  /* CompleteClass */
  override var kind: typings.atPulumiCloud.atPulumiCloudStrings.SharedVolume = js.native
  /* CompleteClass */
  override var name: String = js.native
}

