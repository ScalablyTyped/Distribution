package typings.atPulumiAws.servicediscoveryPrivateDnsNamespaceMod

import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/servicediscovery/privateDnsNamespace", "PrivateDnsNamespace")
@js.native
class PrivateDnsNamespace protected () extends CustomResource {
  /**
    * Create a PrivateDnsNamespace resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: PrivateDnsNamespaceArgs) = this()
  def this(name: String, args: PrivateDnsNamespaceArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN that Amazon Route 53 assigns to the namespace when you create it.
    */
  val arn: Output[String] = js.native
  /**
    * The description that you specify for the namespace when you create it.
    */
  val description: Output[js.UndefOr[String]] = js.native
  /**
    * The ID for the hosted zone that Amazon Route 53 creates when you create a namespace.
    */
  val hostedZone: Output[String] = js.native
  /**
    * The name of the namespace.
    */
  val name: Output[String] = js.native
  /**
    * The ID of VPC that you want to associate the namespace with.
    */
  val vpc: Output[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/servicediscovery/privateDnsNamespace", "PrivateDnsNamespace")
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
  def get(name: String, id: Input[ID]): PrivateDnsNamespace = js.native
  def get(name: String, id: Input[ID], state: PrivateDnsNamespaceState): PrivateDnsNamespace = js.native
  def get(name: String, id: Input[ID], state: PrivateDnsNamespaceState, opts: CustomResourceOptions): PrivateDnsNamespace = js.native
  /**
    * Returns true if the given object is an instance of PrivateDnsNamespace.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicediscovery/privateDnsNamespace.PrivateDnsNamespace */ Boolean = js.native
}

