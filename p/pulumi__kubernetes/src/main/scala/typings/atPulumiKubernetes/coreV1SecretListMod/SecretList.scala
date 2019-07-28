package typings.atPulumiKubernetes.coreV1SecretListMod

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.v1
import typings.atPulumiKubernetes.typesOutputMod.coreNs.v1Ns.Secret
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ListMeta
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/core/v1/SecretList", "SecretList")
@js.native
class SecretList protected () extends CustomResource {
  /**
    * Create a core.v1.SecretList resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.coreNs.v1Ns.SecretList) = this()
  def this(
    name: String,
    args: typings.atPulumiKubernetes.typesInputMod.coreNs.v1Ns.SecretList,
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
    * Items is a list of secret objects. More info:
    * https://kubernetes.io/docs/concepts/configuration/secret
    */
  val items: Output[js.Array[Secret]] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: Output[typings.atPulumiKubernetes.atPulumiKubernetesStrings.SecretList] = js.native
  /**
    * Standard list metadata. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val metadata: Output[ListMeta] = js.native
}

/* static members */
@JSImport("@pulumi/kubernetes/core/v1/SecretList", "SecretList")
@js.native
object SecretList extends js.Object {
  /**
    * Get the state of an existing `SecretList` resource, as identified by `id`.
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
  def get(name: String, id: Input[ID]): SecretList = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): SecretList = js.native
  /**
    * Returns true if the given object is an instance of SecretList.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/core/v1/SecretList.SecretList */ Boolean = js.native
}

