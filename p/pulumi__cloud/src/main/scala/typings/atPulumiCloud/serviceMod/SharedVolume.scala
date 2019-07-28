package typings.atPulumiCloud.serviceMod

import typings.atPulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedVolume extends Volume {
  var kind: typings.atPulumiCloud.atPulumiCloudStrings.SharedVolume
  var name: String
}

@JSImport("@pulumi/cloud/service", "SharedVolume")
@js.native
class SharedVolumeCls protected () extends SharedVolume {
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

object SharedVolume {
  @scala.inline
  def apply(kind: typings.atPulumiCloud.atPulumiCloudStrings.SharedVolume, name: String): SharedVolume = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
  
    __obj.asInstanceOf[SharedVolume]
  }
}

