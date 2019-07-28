package typings.atPulumiAws.ebsMod

import typings.atPulumiAws.ebsVolumeMod.VolumeArgs
import typings.atPulumiAws.ebsVolumeMod.VolumeState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ebs", "Volume")
@js.native
class Volume protected ()
  extends typings.atPulumiAws.ebsVolumeMod.Volume {
  /**
    * Create a Volume resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VolumeArgs) = this()
  def this(name: String, args: VolumeArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/ebs", "Volume")
@js.native
object Volume extends js.Object {
  /**
    * Get an existing Volume resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.ebsVolumeMod.Volume = js.native
  def get(name: String, id: Input[ID], state: VolumeState): typings.atPulumiAws.ebsVolumeMod.Volume = js.native
  def get(name: String, id: Input[ID], state: VolumeState, opts: CustomResourceOptions): typings.atPulumiAws.ebsVolumeMod.Volume = js.native
  /**
    * Returns true if the given object is an instance of Volume.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ebs/volume.Volume */ Boolean = js.native
}

