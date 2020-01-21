package typings.pulumiAws.providerMod

import typings.pulumiPulumi.mod.ProviderResource
import typings.pulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/provider", "Provider")
@js.native
class Provider protected () extends ProviderResource {
  /**
    * Create a Provider resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ProviderArgs) = this()
  def this(name: String, args: ProviderArgs, opts: ResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/aws/provider", "Provider")
@js.native
object Provider extends js.Object {
  /**
    * Returns true if the given object is an instance of Provider.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/provider.Provider */ Boolean = js.native
}

