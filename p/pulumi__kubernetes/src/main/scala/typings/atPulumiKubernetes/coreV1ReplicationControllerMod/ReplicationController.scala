package typings.atPulumiKubernetes.coreV1ReplicationControllerMod

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.v1
import typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns.ReplicationControllerSpec
import typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns.ReplicationControllerStatus
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ObjectMeta
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/core/v1/ReplicationController", "ReplicationController")
@js.native
class ReplicationController protected () extends CustomResource {
  /**
    * Create a core.v1.ReplicationController resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.coreNs.v1Ns.ReplicationController) = this()
  def this(
    name: String,
    args: typings.atPulumiKubernetes.typesInputMod.coreNs.v1Ns.ReplicationController,
    opts: CustomResourceOptions
  ) = this()
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: Output[v1] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: Output[typings.atPulumiKubernetes.atPulumiKubernetesStrings.ReplicationController] = js.native
  /**
    * If the Labels of a ReplicationController are empty, they are defaulted to be the same as
    * the Pod(s) that the replication controller manages. Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
    */
  val metadata: Output[ObjectMeta] = js.native
  /**
    * Spec defines the specification of the desired behavior of the replication controller. More
    * info: https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
    */
  val spec: Output[ReplicationControllerSpec] = js.native
  /**
    * Status is the most recently observed status of the replication controller. This data may be
    * out of date by some window of time. Populated by the system. Read-only. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
    */
  val status: Output[ReplicationControllerStatus] = js.native
}

/* static members */
@JSImport("@pulumi/kubernetes/core/v1/ReplicationController", "ReplicationController")
@js.native
object ReplicationController extends js.Object {
  /**
    * Get the state of an existing `ReplicationController` resource, as identified by `id`.
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
  def get(name: String, id: Input[ID]): ReplicationController = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): ReplicationController = js.native
  /**
    * Returns true if the given object is an instance of ReplicationController.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/core/v1/ReplicationController.ReplicationController */ Boolean = js.native
}

