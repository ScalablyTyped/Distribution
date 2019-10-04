package typings.atPulumiKubernetes.storageV1beta1CSINodeMod

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`storageDOTk8sDOTio/v1beta1`
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ObjectMeta
import typings.atPulumiKubernetes.typesOutputMod.storageNs.v1beta1Ns.CSINodeSpec
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/storage/v1beta1/CSINode", "CSINode")
@js.native
class CSINode protected () extends CustomResource {
  /**
    * Create a storage.v1beta1.CSINode resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.storageNs.v1beta1Ns.CSINode) = this()
  def this(
    name: String,
    args: typings.atPulumiKubernetes.typesInputMod.storageNs.v1beta1Ns.CSINode,
    opts: CustomResourceOptions
  ) = this()
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: Output[`storageDOTk8sDOTio/v1beta1`] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: Output[typings.atPulumiKubernetes.atPulumiKubernetesStrings.CSINode] = js.native
  /**
    * metadata.name must be the Kubernetes node name.
    */
  val metadata: Output[ObjectMeta] = js.native
  /**
    * spec is the specification of CSINode
    */
  val spec: Output[CSINodeSpec] = js.native
}

/* static members */
@JSImport("@pulumi/kubernetes/storage/v1beta1/CSINode", "CSINode")
@js.native
object CSINode extends js.Object {
  /**
    * Get the state of an existing `CSINode` resource, as identified by `id`.
    * The ID is of the form `[namespace]/<name>`; if `namespace` is omitted, then (per
    * Kubernetes convention) the ID becomes `default/<name>`.
    *
    * Pulumi will keep track of this resource using `name` as the Pulumi ID.
    *
    * @param name _Unique_ name used to register this resource with Pulumi.
    * @param id An ID for the Kubernetes resource to retrieve. Takes the form `[namespace]/<name>`.
    * @param opts Uniquely specifies a CustomResource to select.
    */
  def get(name: String, id: Input[ID]): CSINode = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): CSINode = js.native
  /**
    * Returns true if the given object is an instance of CSINode.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/storage/v1beta1/CSINode.CSINode */ Boolean = js.native
}

