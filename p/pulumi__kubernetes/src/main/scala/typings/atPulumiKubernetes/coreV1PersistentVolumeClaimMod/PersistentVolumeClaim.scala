package typings.atPulumiKubernetes.coreV1PersistentVolumeClaimMod

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.v1
import typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns.PersistentVolumeClaimSpec
import typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns.PersistentVolumeClaimStatus
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ObjectMeta
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/core/v1/PersistentVolumeClaim", "PersistentVolumeClaim")
@js.native
class PersistentVolumeClaim protected () extends CustomResource {
  /**
    * Create a core.v1.PersistentVolumeClaim resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.coreNs.v1Ns.PersistentVolumeClaim) = this()
  def this(
    name: String,
    args: typings.atPulumiKubernetes.typesInputMod.coreNs.v1Ns.PersistentVolumeClaim,
    opts: CustomResourceOptions
  ) = this()
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: Output[v1] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: Output[typings.atPulumiKubernetes.atPulumiKubernetesStrings.PersistentVolumeClaim] = js.native
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#metadata
    */
  val metadata: Output[ObjectMeta] = js.native
  /**
    * Spec defines the desired characteristics of a volume requested by a pod author. More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
    */
  val spec: Output[PersistentVolumeClaimSpec] = js.native
  /**
    * Status represents the current information/status of a persistent volume claim. Read-only.
    * More info:
    * https://kubernetes.io/docs/concepts/storage/persistent-volumes#persistentvolumeclaims
    */
  val status: Output[PersistentVolumeClaimStatus] = js.native
}

/* static members */
@JSImport("@pulumi/kubernetes/core/v1/PersistentVolumeClaim", "PersistentVolumeClaim")
@js.native
object PersistentVolumeClaim extends js.Object {
  /**
    * Get the state of an existing `PersistentVolumeClaim` resource, as identified by `id`.
    * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
    * Kubernetes convention) the ID becomes `default/<name>`.
    *
    * Pulumi will keep track of this resource using `name` as the Pulumi ID.
    *
    * @param name _Unique_ name used to register this resource with Pulumi.
    * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
    * @param opts Uniquely specifies a CustomResource to select.
    */
  def get(name: String, id: Input[ID]): PersistentVolumeClaim = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): PersistentVolumeClaim = js.native
  /**
    * Returns true if the given object is an instance of PersistentVolumeClaim.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/core/v1/PersistentVolumeClaim.PersistentVolumeClaim */ Boolean = js.native
}

