package typings
package atPulumiKubernetesLib.coordinationV1Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/coordination/v1", "Lease")
@js.native
class Lease protected ()
  extends atPulumiKubernetesLib.coordinationV1LeaseMod.Lease {
  /**
    * Create a coordination.v1.Lease resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coordinationNs.v1Ns.Lease) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coordinationNs.v1Ns.Lease, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/kubernetes/coordination/v1", "Lease")
@js.native
object Lease extends js.Object {
  /**
    * Get the state of an existing `Lease` resource, as identified by `id`.
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.coordinationV1LeaseMod.Lease = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiKubernetesLib.coordinationV1LeaseMod.Lease = js.native
}

