package typings.atPulumiKubernetes.autoscalingV2beta2HorizontalPodAutoscalerListMod

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`autoscaling/v2beta2`
import typings.atPulumiKubernetes.typesOutputMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscaler
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ListMeta
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/autoscaling/v2beta2/HorizontalPodAutoscalerList", "HorizontalPodAutoscalerList")
@js.native
class HorizontalPodAutoscalerList protected () extends CustomResource {
  /**
    * Create a autoscaling.v2beta2.HorizontalPodAutoscalerList resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(
    name: String,
    args: typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscalerList
  ) = this()
  def this(
    name: String,
    args: typings.atPulumiKubernetes.typesInputMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscalerList,
    opts: CustomResourceOptions
  ) = this()
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: Output[`autoscaling/v2beta2`] = js.native
  /**
    * items is the list of horizontal pod autoscaler objects.
    */
  val items: Output[js.Array[HorizontalPodAutoscaler]] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: Output[typings.atPulumiKubernetes.atPulumiKubernetesStrings.HorizontalPodAutoscalerList] = js.native
  /**
    * metadata is the standard list metadata.
    */
  val metadata: Output[ListMeta] = js.native
}

/* static members */
@JSImport("@pulumi/kubernetes/autoscaling/v2beta2/HorizontalPodAutoscalerList", "HorizontalPodAutoscalerList")
@js.native
object HorizontalPodAutoscalerList extends js.Object {
  /**
    * Get the state of an existing `HorizontalPodAutoscalerList` resource, as identified by `id`.
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
  def get(name: String, id: Input[ID]): HorizontalPodAutoscalerList = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): HorizontalPodAutoscalerList = js.native
  /**
    * Returns true if the given object is an instance of HorizontalPodAutoscalerList.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v2beta2/HorizontalPodAutoscalerList.HorizontalPodAutoscalerList */ Boolean = js.native
}

