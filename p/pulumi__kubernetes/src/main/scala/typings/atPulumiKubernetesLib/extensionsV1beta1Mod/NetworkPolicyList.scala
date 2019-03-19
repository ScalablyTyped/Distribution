package typings
package atPulumiKubernetesLib.extensionsV1beta1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/extensions/v1beta1", "NetworkPolicyList")
@js.native
class NetworkPolicyList protected ()
  extends atPulumiKubernetesLib.extensionsV1beta1NetworkPolicyListMod.NetworkPolicyList {
  /**
    * Create a extensions.v1beta1.NetworkPolicyList resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.NetworkPolicyList) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.extensionsNs.v1beta1Ns.NetworkPolicyList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/kubernetes/extensions/v1beta1", "NetworkPolicyList")
@js.native
object NetworkPolicyList extends js.Object {
  /**
    * Get the state of an existing `NetworkPolicyList` resource, as identified by `id`.
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.extensionsV1beta1NetworkPolicyListMod.NetworkPolicyList = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiKubernetesLib.extensionsV1beta1NetworkPolicyListMod.NetworkPolicyList = js.native
}

