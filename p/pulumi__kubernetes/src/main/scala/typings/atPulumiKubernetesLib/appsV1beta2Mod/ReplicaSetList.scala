package typings
package atPulumiKubernetesLib.appsV1beta2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/apps/v1beta2", "ReplicaSetList")
@js.native
class ReplicaSetList protected ()
  extends atPulumiKubernetesLib.appsV1beta2ReplicaSetListMod.ReplicaSetList {
  /**
    * Create a apps.v1beta2.ReplicaSetList resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.ReplicaSetList) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.appsNs.v1beta2Ns.ReplicaSetList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/kubernetes/apps/v1beta2", "ReplicaSetList")
@js.native
object ReplicaSetList extends js.Object {
  /**
    * Get the state of an existing `ReplicaSetList` resource, as identified by `id`.
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.appsV1beta2ReplicaSetListMod.ReplicaSetList = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiKubernetesLib.appsV1beta2ReplicaSetListMod.ReplicaSetList = js.native
}

