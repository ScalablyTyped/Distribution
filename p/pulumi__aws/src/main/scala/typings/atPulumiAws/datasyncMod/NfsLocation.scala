package typings.atPulumiAws.datasyncMod

import typings.atPulumiAws.datasyncNfsLocationMod.NfsLocationArgs
import typings.atPulumiAws.datasyncNfsLocationMod.NfsLocationState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/datasync", "NfsLocation")
@js.native
class NfsLocation protected ()
  extends typings.atPulumiAws.datasyncNfsLocationMod.NfsLocation {
  /**
    * Create a NfsLocation resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: NfsLocationArgs) = this()
  def this(name: String, args: NfsLocationArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/datasync", "NfsLocation")
@js.native
object NfsLocation extends js.Object {
  /**
    * Get an existing NfsLocation resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.datasyncNfsLocationMod.NfsLocation = js.native
  def get(name: String, id: Input[ID], state: NfsLocationState): typings.atPulumiAws.datasyncNfsLocationMod.NfsLocation = js.native
  def get(name: String, id: Input[ID], state: NfsLocationState, opts: CustomResourceOptions): typings.atPulumiAws.datasyncNfsLocationMod.NfsLocation = js.native
  /**
    * Returns true if the given object is an instance of NfsLocation.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/nfsLocation.NfsLocation */ Boolean = js.native
}

