package typings
package atPulumiAwsLib.servicediscoveryPublicDnsNamespaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/servicediscovery/publicDnsNamespace", "PublicDnsNamespace")
@js.native
class PublicDnsNamespace protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a PublicDnsNamespace resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: PublicDnsNamespaceArgs) = this()
  def this(name: java.lang.String, args: PublicDnsNamespaceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN that Amazon Route 53 assigns to the namespace when you create it.
    */
  val arn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The description that you specify for the namespace when you create it.
    */
  val description: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The ID for the hosted zone that Amazon Route 53 creates when you create a namespace.
    */
  val hostedZone: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The name of the namespace.
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/servicediscovery/publicDnsNamespace", "PublicDnsNamespace")
@js.native
object PublicDnsNamespace extends js.Object {
  /**
    * Get an existing PublicDnsNamespace resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.servicediscoveryPublicDnsNamespaceMod.PublicDnsNamespace = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.servicediscoveryPublicDnsNamespaceMod.PublicDnsNamespaceState
  ): atPulumiAwsLib.servicediscoveryPublicDnsNamespaceMod.PublicDnsNamespace = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.servicediscoveryPublicDnsNamespaceMod.PublicDnsNamespaceState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.servicediscoveryPublicDnsNamespaceMod.PublicDnsNamespace = js.native
}

