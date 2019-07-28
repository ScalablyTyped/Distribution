package typings.atPulumiKubernetes.policyV1beta1PodDisruptionBudgetMod

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`policy/v1beta1`
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ObjectMeta
import typings.atPulumiKubernetes.typesOutputMod.policyNs.v1beta1Ns.PodDisruptionBudgetSpec
import typings.atPulumiKubernetes.typesOutputMod.policyNs.v1beta1Ns.PodDisruptionBudgetStatus
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/policy/v1beta1/PodDisruptionBudget", "PodDisruptionBudget")
@js.native
class PodDisruptionBudget protected () extends CustomResource {
  /**
    * Create a policy.v1beta1.PodDisruptionBudget resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(
    name: String,
    args: typings.atPulumiKubernetes.typesInputMod.policyNs.v1beta1Ns.PodDisruptionBudget
  ) = this()
  def this(
    name: String,
    args: typings.atPulumiKubernetes.typesInputMod.policyNs.v1beta1Ns.PodDisruptionBudget,
    opts: CustomResourceOptions
  ) = this()
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: Output[`policy/v1beta1`] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: Output[typings.atPulumiKubernetes.atPulumiKubernetesStrings.PodDisruptionBudget] = js.native
  val metadata: Output[ObjectMeta] = js.native
  /**
    * Specification of the desired behavior of the PodDisruptionBudget.
    */
  val spec: Output[PodDisruptionBudgetSpec] = js.native
  /**
    * Most recently observed status of the PodDisruptionBudget.
    */
  val status: Output[PodDisruptionBudgetStatus] = js.native
}

/* static members */
@JSImport("@pulumi/kubernetes/policy/v1beta1/PodDisruptionBudget", "PodDisruptionBudget")
@js.native
object PodDisruptionBudget extends js.Object {
  /**
    * Get the state of an existing `PodDisruptionBudget` resource, as identified by `id`.
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
  def get(name: String, id: Input[ID]): PodDisruptionBudget = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): PodDisruptionBudget = js.native
  /**
    * Returns true if the given object is an instance of PodDisruptionBudget.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/policy/v1beta1/PodDisruptionBudget.PodDisruptionBudget */ Boolean = js.native
}

