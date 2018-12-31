package typings
package atPulumiPulumiLib.pulumiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/pulumi", "ProviderResource")
@js.native
abstract class ProviderResource protected ()
  extends atPulumiPulumiLib.resourceMod.ProviderResource {
  /**
    * Creates and registers a new provider resource for a particular package.
    *
    * @param pkg The package associated with this provider.
    * @param name The _unique_ name of the provider.
    * @param props The configuration to use for this provider.
    * @param opts A bag of options that control this provider's behavior.
    */
  def this(pkg: java.lang.String, name: java.lang.String) = this()
  def this(pkg: java.lang.String, name: java.lang.String, props: atPulumiPulumiLib.resourceMod.Inputs) = this()
  def this(pkg: java.lang.String, name: java.lang.String, props: atPulumiPulumiLib.resourceMod.Inputs, opts: atPulumiPulumiLib.resourceMod.ResourceOptions) = this()
}

