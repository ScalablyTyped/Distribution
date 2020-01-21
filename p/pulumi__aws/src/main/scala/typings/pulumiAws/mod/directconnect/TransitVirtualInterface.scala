package typings.pulumiAws.mod.directconnect

import typings.pulumiAws.transitVirtualInterfaceMod.TransitVirtualInterfaceArgs
import typings.pulumiAws.transitVirtualInterfaceMod.TransitVirtualInterfaceState
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws", "directconnect.TransitVirtualInterface")
@js.native
class TransitVirtualInterface protected ()
  extends typings.pulumiAws.directconnectMod.TransitVirtualInterface {
  /**
    * Create a TransitVirtualInterface resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: TransitVirtualInterfaceArgs) = this()
  def this(name: String, args: TransitVirtualInterfaceArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws", "directconnect.TransitVirtualInterface")
@js.native
object TransitVirtualInterface extends js.Object {
  /**
    * Get an existing TransitVirtualInterface resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.pulumiAws.transitVirtualInterfaceMod.TransitVirtualInterface = js.native
  def get(name: String, id: Input[ID], state: TransitVirtualInterfaceState): typings.pulumiAws.transitVirtualInterfaceMod.TransitVirtualInterface = js.native
  def get(name: String, id: Input[ID], state: TransitVirtualInterfaceState, opts: CustomResourceOptions): typings.pulumiAws.transitVirtualInterfaceMod.TransitVirtualInterface = js.native
  /**
    * Returns true if the given object is an instance of TransitVirtualInterface.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/directconnect/transitVirtualInterface.TransitVirtualInterface */ Boolean = js.native
}

