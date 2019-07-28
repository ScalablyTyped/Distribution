package typings.atPulumiAws.servicediscoveryMod

import typings.atPulumiAws.servicediscoveryPrivateDnsNamespaceMod.PrivateDnsNamespaceArgs
import typings.atPulumiAws.servicediscoveryPrivateDnsNamespaceMod.PrivateDnsNamespaceState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/servicediscovery", "PrivateDnsNamespace")
@js.native
class PrivateDnsNamespace protected ()
  extends typings.atPulumiAws.servicediscoveryPrivateDnsNamespaceMod.PrivateDnsNamespace {
  /**
    * Create a PrivateDnsNamespace resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: PrivateDnsNamespaceArgs) = this()
  def this(name: String, args: PrivateDnsNamespaceArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/servicediscovery", "PrivateDnsNamespace")
@js.native
object PrivateDnsNamespace extends js.Object {
  /**
    * Get an existing PrivateDnsNamespace resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): typings.atPulumiAws.servicediscoveryPrivateDnsNamespaceMod.PrivateDnsNamespace = js.native
  def get(name: String, id: Input[ID], state: PrivateDnsNamespaceState): typings.atPulumiAws.servicediscoveryPrivateDnsNamespaceMod.PrivateDnsNamespace = js.native
  def get(name: String, id: Input[ID], state: PrivateDnsNamespaceState, opts: CustomResourceOptions): typings.atPulumiAws.servicediscoveryPrivateDnsNamespaceMod.PrivateDnsNamespace = js.native
  /**
    * Returns true if the given object is an instance of PrivateDnsNamespace.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicediscovery/privateDnsNamespace.PrivateDnsNamespace */ Boolean = js.native
}

