package typings.pulumiKubernetes.v2beta2HorizontalPodAutoscalerMod

import typings.pulumiKubernetes.outputMod.autoscaling.v2beta2.HorizontalPodAutoscalerSpec
import typings.pulumiKubernetes.outputMod.autoscaling.v2beta2.HorizontalPodAutoscalerStatus
import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.autoscalingSlashv2beta2
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/autoscaling/v2beta2/horizontalPodAutoscaler", "HorizontalPodAutoscaler")
@js.native
class HorizontalPodAutoscaler protected () extends CustomResource {
  /**
    * Create a HorizontalPodAutoscaler resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: HorizontalPodAutoscalerArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: HorizontalPodAutoscalerArgs, opts: CustomResourceOptions) = this()
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: Output_[autoscalingSlashv2beta2] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: Output_[typings.pulumiKubernetes.pulumiKubernetesStrings.HorizontalPodAutoscaler] = js.native
  /**
    * metadata is the standard object metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: Output_[ObjectMeta] = js.native
  /**
    * spec is the specification for the behaviour of the autoscaler. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#spec-and-status.
    */
  val spec: Output_[HorizontalPodAutoscalerSpec] = js.native
  /**
    * status is the current information about the autoscaler.
    */
  val status: Output_[HorizontalPodAutoscalerStatus] = js.native
}

/* static members */
@JSImport("@pulumi/kubernetes/autoscaling/v2beta2/horizontalPodAutoscaler", "HorizontalPodAutoscaler")
@js.native
object HorizontalPodAutoscaler extends js.Object {
  /**
    * Get an existing HorizontalPodAutoscaler resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): HorizontalPodAutoscaler = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): HorizontalPodAutoscaler = js.native
  /**
    * Returns true if the given object is an instance of HorizontalPodAutoscaler.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/autoscaling/v2beta2/horizontalPodAutoscaler.HorizontalPodAutoscaler */ Boolean = js.native
}

