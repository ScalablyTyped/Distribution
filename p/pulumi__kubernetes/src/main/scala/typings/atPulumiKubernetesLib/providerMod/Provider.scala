package typings
package atPulumiKubernetesLib.providerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/provider", "Provider")
@js.native
class Provider protected ()
  extends atPulumiPulumiLib.pulumiMod.ProviderResource {
  /**
       * Create a Provider resource with the given unique name, arguments, and options.
       *
       * @param name The _unique_ name of the resource.
       * @param args The arguments to use to populate this resource's properties.
       * @param opts A bag of options that control this resource's behavior.
       */
  def this(name: java.lang.String, args: ProviderArgs) = this()
  /**
       * Create a Provider resource with the given unique name, arguments, and options.
       *
       * @param name The _unique_ name of the resource.
       * @param args The arguments to use to populate this resource's properties.
       * @param opts A bag of options that control this resource's behavior.
       */
  def this(name: java.lang.String, args: ProviderArgs, opts: atPulumiPulumiLib.resourceMod.ResourceOptions) = this()
}

