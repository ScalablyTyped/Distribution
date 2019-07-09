package typings
package atPulumiKubernetesLib.nodeV1beta1RuntimeClassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/node/v1beta1/RuntimeClass", "RuntimeClass")
@js.native
class RuntimeClass protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a node.v1beta1.RuntimeClass resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.nodeNs.v1beta1Ns.RuntimeClass) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.nodeNs.v1beta1Ns.RuntimeClass, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`nodeDOTk8sDOTio/v1beta1`] = js.native
  /**
    * Handler specifies the underlying runtime and configuration that the CRI implementation will
    * use to handle pods of this class. The possible values are specific to the node & CRI
    * configuration.  It is assumed that all handlers are available on every node, and handlers
    * of the same name are equivalent on every node. For example, a handler called "runc" might
    * specify that the runc OCI runtime (using native Linux containers) will be used to run the
    * containers in a pod. The Handler must conform to the DNS Label (RFC 1123) requirements, and
    * is immutable.
    */
  val handler: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.RuntimeClass] = js.native
  /**
    * More info: https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
    */
  val metadata: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
}

/* static members */
@JSImport("@pulumi/kubernetes/node/v1beta1/RuntimeClass", "RuntimeClass")
@js.native
object RuntimeClass extends js.Object {
  /**
    * Get the state of an existing `RuntimeClass` resource, as identified by `id`.
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.nodeV1beta1RuntimeClassMod.RuntimeClass = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiKubernetesLib.nodeV1beta1RuntimeClassMod.RuntimeClass = js.native
  /**
    * Returns true if the given object is an instance of RuntimeClass.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/node/v1beta1/RuntimeClass.RuntimeClass */ scala.Boolean = js.native
}

