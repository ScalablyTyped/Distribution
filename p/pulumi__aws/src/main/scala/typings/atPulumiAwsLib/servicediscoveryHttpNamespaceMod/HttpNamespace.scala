package typings
package atPulumiAwsLib.servicediscoveryHttpNamespaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/servicediscovery/httpNamespace", "HttpNamespace")
@js.native
class HttpNamespace protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a HttpNamespace resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: HttpNamespaceArgs) = this()
  def this(name: java.lang.String, args: HttpNamespaceArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN that Amazon Route 53 assigns to the namespace when you create it.
    */
  val arn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * The description that you specify for the namespace when you create it.
    */
  val description: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The name of the http namespace.
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/servicediscovery/httpNamespace", "HttpNamespace")
@js.native
object HttpNamespace extends js.Object {
  /**
    * Get an existing HttpNamespace resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.servicediscoveryHttpNamespaceMod.HttpNamespace = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.servicediscoveryHttpNamespaceMod.HttpNamespaceState
  ): atPulumiAwsLib.servicediscoveryHttpNamespaceMod.HttpNamespace = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.servicediscoveryHttpNamespaceMod.HttpNamespaceState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.servicediscoveryHttpNamespaceMod.HttpNamespace = js.native
}

