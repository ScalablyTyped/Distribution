package typings
package atPulumiAwsLib.servicediscoveryPrivateDnsNamespaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/servicediscovery/privateDnsNamespace", "PrivateDnsNamespace")
@js.native
class PrivateDnsNamespace protected ()
  extends atPulumiPulumiLib.pulumiMod.CustomResource {
  /**
    * Create a PrivateDnsNamespace resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: PrivateDnsNamespaceArgs) = this()
  def this(name: java.lang.String, args: PrivateDnsNamespaceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN that Amazon Route 53 assigns to the namespace when you create it.
    */
  val arn: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The description that you specify for the namespace when you create it.
    */
  val description: atPulumiPulumiLib.pulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The ID for the hosted zone that Amazon Route 53 creates when you create a namespace.
    */
  val hostedZone: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The name of the namespace.
    */
  val name: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
  /**
    * The ID of VPC that you want to associate the namespace with.
    */
  val vpc: atPulumiPulumiLib.pulumiMod.Output[java.lang.String] = js.native
}

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
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.servicediscoveryPrivateDnsNamespaceMod.PrivateDnsNamespace = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.servicediscoveryPrivateDnsNamespaceMod.PrivateDnsNamespaceState
  ): atPulumiAwsLib.servicediscoveryPrivateDnsNamespaceMod.PrivateDnsNamespace = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.servicediscoveryPrivateDnsNamespaceMod.PrivateDnsNamespaceState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.servicediscoveryPrivateDnsNamespaceMod.PrivateDnsNamespace = js.native
}

