package typings
package atPulumiKubernetesLib.autoscalingV2beta2HorizontalPodAutoscalerListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/autoscaling/v2beta2/HorizontalPodAutoscalerList", "HorizontalPodAutoscalerList")
@js.native
class HorizontalPodAutoscalerList protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a autoscaling.v2beta2.HorizontalPodAutoscalerList resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscalerList) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscalerList, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  val __inputs: js.Any = js.native
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`autoscaling/v2beta2`] = js.native
  /**
    * items is the list of horizontal pod autoscaler objects.
    */
  val items: atPulumiPulumiLib.outputMod.Output[
    js.Array[
      atPulumiKubernetesLib.typesOutputMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscaler
    ]
  ] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.HorizontalPodAutoscalerList] = js.native
  /**
    * metadata is the standard list metadata.
    */
  val metadata: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ListMeta] = js.native
  def getInputs(): atPulumiKubernetesLib.typesInputMod.autoscalingNs.v2beta2Ns.HorizontalPodAutoscalerList = js.native
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.autoscalingV2beta2HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerList = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiKubernetesLib.autoscalingV2beta2HorizontalPodAutoscalerListMod.HorizontalPodAutoscalerList = js.native
}

