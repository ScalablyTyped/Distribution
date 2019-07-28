package typings.atPulumiAws.servicediscoveryMod

import typings.atPulumiAws.servicediscoveryHttpNamespaceMod.HttpNamespaceArgs
import typings.atPulumiAws.servicediscoveryHttpNamespaceMod.HttpNamespaceState
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/servicediscovery", "HttpNamespace")
@js.native
class HttpNamespace protected ()
  extends typings.atPulumiAws.servicediscoveryHttpNamespaceMod.HttpNamespace {
  /**
    * Create a HttpNamespace resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: HttpNamespaceArgs) = this()
  def this(name: String, args: HttpNamespaceArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/servicediscovery", "HttpNamespace")
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
  def get(name: String, id: Input[ID]): typings.atPulumiAws.servicediscoveryHttpNamespaceMod.HttpNamespace = js.native
  def get(name: String, id: Input[ID], state: HttpNamespaceState): typings.atPulumiAws.servicediscoveryHttpNamespaceMod.HttpNamespace = js.native
  def get(name: String, id: Input[ID], state: HttpNamespaceState, opts: CustomResourceOptions): typings.atPulumiAws.servicediscoveryHttpNamespaceMod.HttpNamespace = js.native
  /**
    * Returns true if the given object is an instance of HttpNamespace.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicediscovery/httpNamespace.HttpNamespace */ Boolean = js.native
}

