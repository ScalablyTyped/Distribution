package typings
package atPulumiCloudLib.atPulumiCloudMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/cloud", "SharedVolume")
@js.native
class SharedVolumeCls protected ()
  extends atPulumiCloudLib.serviceMod.SharedVolume {
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

