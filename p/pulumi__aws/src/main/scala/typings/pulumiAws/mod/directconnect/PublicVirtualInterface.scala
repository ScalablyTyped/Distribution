package typings.pulumiAws.mod.directconnect

import typings.pulumiAws.publicVirtualInterfaceMod.PublicVirtualInterfaceArgs
import typings.pulumiAws.publicVirtualInterfaceMod.PublicVirtualInterfaceState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "directconnect.PublicVirtualInterface")
@js.native
class PublicVirtualInterface protected ()
  extends typings.pulumiAws.directconnectMod.PublicVirtualInterface {
  /**
    * Create a PublicVirtualInterface resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: PublicVirtualInterfaceArgs) = this()
  def this(name: String, args: PublicVirtualInterfaceArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "directconnect.PublicVirtualInterface")
@js.native
object PublicVirtualInterface extends js.Object {
  /**
    * Get an existing PublicVirtualInterface resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.publicVirtualInterfaceMod.PublicVirtualInterface = js.native
  def get(name: String, id: Input[ID], state: PublicVirtualInterfaceState): typings.pulumiAws.publicVirtualInterfaceMod.PublicVirtualInterface = js.native
  def get(name: String, id: Input[ID], state: PublicVirtualInterfaceState, opts: CustomResourceOptions): typings.pulumiAws.publicVirtualInterfaceMod.PublicVirtualInterface = js.native
  /**
    * Returns true if the given object is an instance of PublicVirtualInterface.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/publicVirtualInterface.PublicVirtualInterface */ Boolean = js.native
}

