package typings.atPulumiKubernetes.coordinationV1LeaseMod

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`coordinationDOTk8sDOTio/v1`
import typings.atPulumiKubernetes.typesOutputMod.coordinationNs.v1Ns.LeaseSpec
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ObjectMeta
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/coordination/v1/Lease", "Lease")
@js.native
class Lease protected () extends CustomResource {
  /**
    * Create a coordination.v1.Lease resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.coordinationNs.v1Ns.Lease) = this()
  def this(
    name: String,
    args: typings.atPulumiKubernetes.typesInputMod.coordinationNs.v1Ns.Lease,
    opts: CustomResourceOptions
  ) = this()
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: Output[`coordinationDOTk8sDOTio/v1`] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: Output[typings.atPulumiKubernetes.atPulumiKubernetesStrings.Lease] = js.native
  /**
    * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
    */
  val metadata: Output[ObjectMeta] = js.native
  /**
    * Specification of the Lease. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
    */
  val spec: Output[LeaseSpec] = js.native
}

/* static members */
@JSImport("@pulumi/kubernetes/coordination/v1/Lease", "Lease")
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
  def get(name: String, id: Input[ID]): Lease = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): Lease = js.native
  /**
    * Returns true if the given object is an instance of Lease.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/coordination/v1/Lease.Lease */ Boolean = js.native
}

