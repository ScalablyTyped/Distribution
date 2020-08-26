package typings.pulumiKubernetes.podDisruptionBudgetMod

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.outputMod.policy.v1beta1.PodDisruptionBudgetSpec
import typings.pulumiKubernetes.outputMod.policy.v1beta1.PodDisruptionBudgetStatus
import typings.pulumiKubernetes.pulumiKubernetesStrings.policySlashv1beta1
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/policy/v1beta1/podDisruptionBudget", "PodDisruptionBudget")
@js.native
class PodDisruptionBudget protected () extends CustomResource {
  /**
    * Create a PodDisruptionBudget resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: PodDisruptionBudgetArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: PodDisruptionBudgetArgs, opts: CustomResourceOptions) = this()
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: Output_[policySlashv1beta1] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: Output_[typings.pulumiKubernetes.pulumiKubernetesStrings.PodDisruptionBudget] = js.native
  val metadata: Output_[ObjectMeta] = js.native
  /**
    * Specification of the desired behavior of the PodDisruptionBudget.
    */
  val spec: Output_[PodDisruptionBudgetSpec] = js.native
  /**
    * Most recently observed status of the PodDisruptionBudget.
    */
  val status: Output_[PodDisruptionBudgetStatus] = js.native
}

/* static members */
@JSImport("@pulumi/kubernetes/policy/v1beta1/podDisruptionBudget", "PodDisruptionBudget")
@js.native
object PodDisruptionBudget extends js.Object {
  /**
    * Get an existing PodDisruptionBudget resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): PodDisruptionBudget = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): PodDisruptionBudget = js.native
  /**
    * Returns true if the given object is an instance of PodDisruptionBudget.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/policy/v1beta1/podDisruptionBudget.PodDisruptionBudget */ Boolean = js.native
}

