package typings
package atPulumiCloudLib.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedVolume extends Volume {
  var kind: atPulumiCloudLib.atPulumiCloudLibStrings.SharedVolume
  var name: java.lang.String
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
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, opts: atPulumiPulumiLib.resourceMod.ResourceOptions) = this()
  /* CompleteClass */
  override var kind: atPulumiCloudLib.atPulumiCloudLibStrings.SharedVolume = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
}

object SharedVolume {
  @scala.inline
  def apply(kind: atPulumiCloudLib.atPulumiCloudLibStrings.SharedVolume, name: java.lang.String): SharedVolume = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
  
    __obj.asInstanceOf[SharedVolume]
  }
}

