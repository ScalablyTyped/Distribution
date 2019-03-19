package typings
package atPulumiKubernetesLib.networkingV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/networking/v1", "NetworkPolicy")
@js.native
class NetworkPolicy protected ()
  extends atPulumiKubernetesLib.networkingV1NetworkPolicyMod.NetworkPolicy {
  /**
    * Create a networking.v1.NetworkPolicy resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.networkingNs.v1Ns.NetworkPolicy) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.networkingNs.v1Ns.NetworkPolicy, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/kubernetes/networking/v1", "NetworkPolicy")
@js.native
object NetworkPolicy extends js.Object {
  /**
    * Get the state of an existing `NetworkPolicy` resource, as identified by `id`.
    * Typically this ID  is of the form <namespace>/<name>; if <namespace> is omitted, then (per
    * Kubernetes convention) the ID becomes default/<name>.
    *
    * Pulumi will keep track of this resource using `name` as the Pulumi ID.
    *
    * @param name _Unique_ name used to register this resource with Pulumi.
    * @param id An ID for the Kubernetes resource to retrieve. Takes the form
    *  <namespace>/<name> or <name>.
    * @param opts Uniquely specifies a CustomResource to select.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.networkingV1NetworkPolicyMod.NetworkPolicy = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiKubernetesLib.networkingV1NetworkPolicyMod.NetworkPolicy = js.native
}

