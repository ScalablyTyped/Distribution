package typings
package atPulumiKubernetesLib.coordinationV1LeaseListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/coordination/v1/LeaseList", "LeaseList")
@js.native
class LeaseList protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a coordination.v1.LeaseList resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coordinationNs.v1Ns.LeaseList) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.coordinationNs.v1Ns.LeaseList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  val __inputs: js.Any = js.native
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`coordinationDOTk8sDOTio/v1`] = js.native
  /**
    * Items is a list of schema objects.
    */
  val items: atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiKubernetesLib.typesOutputMod.coordinationNs.v1Ns.Lease]] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.LeaseList] = js.native
  /**
    * Standard list metadata. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
    */
  val metadata: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getInputs(): atPulumiKubernetesLib.typesInputMod.coordinationNs.v1Ns.LeaseList = js.native
}

/* static members */
@JSImport("@pulumi/kubernetes/coordination/v1/LeaseList", "LeaseList")
@js.native
object LeaseList extends js.Object {
  /**
    * Get the state of an existing `LeaseList` resource, as identified by `id`.
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.coordinationV1LeaseListMod.LeaseList = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiKubernetesLib.coordinationV1LeaseListMod.LeaseList = js.native
}

