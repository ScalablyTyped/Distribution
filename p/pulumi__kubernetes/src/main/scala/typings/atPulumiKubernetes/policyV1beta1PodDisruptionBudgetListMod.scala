package typings.atPulumiKubernetes

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.policySlashv1beta1
import typings.atPulumiKubernetes.typesOutputMod.meta.v1.ListMeta
import typings.atPulumiKubernetes.typesOutputMod.policy.v1beta1.PodDisruptionBudget
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/policy/v1beta1/PodDisruptionBudgetList", JSImport.Namespace)
@js.native
object policyV1beta1PodDisruptionBudgetListMod extends js.Object {
  @js.native
  class PodDisruptionBudgetList protected () extends CustomResource {
    /**
      * Create a policy.v1beta1.PodDisruptionBudgetList resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.policy.v1beta1.PodDisruptionBudgetList
    ) = this()
    def this(
      name: String,
      args: typings.atPulumiKubernetes.typesInputMod.policy.v1beta1.PodDisruptionBudgetList,
      opts: CustomResourceOptions
    ) = this()
    /**
      * APIVersion defines the versioned schema of this representation of an object. Servers should
      * convert recognized schemas to the latest internal value, and may reject unrecognized
      * values. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
      */
    val apiVersion: Output[policySlashv1beta1] = js.native
    val items: Output[js.Array[PodDisruptionBudget]] = js.native
    /**
      * Kind is a string value representing the REST resource this object represents. Servers may
      * infer this from the endpoint the client submits requests to. Cannot be updated. In
      * CamelCase. More info:
      * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
      */
    val kind: Output[typings.atPulumiKubernetes.atPulumiKubernetesStrings.PodDisruptionBudgetList] = js.native
    val metadata: Output[ListMeta] = js.native
  }
  
  /* static members */
  @js.native
  object PodDisruptionBudgetList extends js.Object {
    /**
      * Get the state of an existing `PodDisruptionBudgetList` resource, as identified by `id`.
      * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
      * Kubernetes convention) the ID becomes `default/<name>`.
      *
      * Pulumi will keep track of this resource using `name` as the Pulumi ID.
      *
      * @param name _Unique_ name used to register this resource with Pulumi.
      * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
      * @param opts Uniquely specifies a CustomResource to select.
      */
    def get(name: String, id: Input[ID]): PodDisruptionBudgetList = js.native
    def get(name: String, id: Input[ID], opts: CustomResourceOptions): PodDisruptionBudgetList = js.native
    /**
      * Returns true if the given object is an instance of PodDisruptionBudgetList.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/policy/v1beta1/PodDisruptionBudgetList.PodDisruptionBudgetList */ Boolean = js.native
  }
  
}

