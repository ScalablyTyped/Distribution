package typings.atPulumiAws.datasyncMod

import typings.atPulumiAws.datasyncEfsLocationMod.EfsLocationArgs
import typings.atPulumiAws.datasyncEfsLocationMod.EfsLocationState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/datasync", "EfsLocation")
@js.native
class EfsLocation protected ()
  extends typings.atPulumiAws.datasyncEfsLocationMod.EfsLocation {
  /**
    * Create a EfsLocation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: EfsLocationArgs) = this()
  def this(name: String, args: EfsLocationArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/datasync", "EfsLocation")
@js.native
object EfsLocation extends js.Object {
  /**
    * Get an existing EfsLocation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.datasyncEfsLocationMod.EfsLocation = js.native
  def get(name: String, id: Input[ID], state: EfsLocationState): typings.atPulumiAws.datasyncEfsLocationMod.EfsLocation = js.native
  def get(name: String, id: Input[ID], state: EfsLocationState, opts: CustomResourceOptions): typings.atPulumiAws.datasyncEfsLocationMod.EfsLocation = js.native
  /**
    * Returns true if the given object is an instance of EfsLocation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/efsLocation.EfsLocation */ Boolean = js.native
}

