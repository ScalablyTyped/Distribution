package typings
package atPulumiKubernetesLib.networkingV1beta1IngressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/networking/v1beta1/Ingress", "Ingress")
@js.native
class Ingress protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a networking.v1beta1.Ingress resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.networkingNs.v1beta1Ns.Ingress) = this()
  def this(name: java.lang.String, args: atPulumiKubernetesLib.typesInputMod.networkingNs.v1beta1Ns.Ingress, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  val __inputs: js.Any = js.native
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: atPulumiPulumiLib.outputMod.Output[
    atPulumiKubernetesLib.atPulumiKubernetesLibStrings.`networkingDOTk8sDOTio/v1beta1`
  ] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.atPulumiKubernetesLibStrings.Ingress] = js.native
  /**
    * Standard object's metadata. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata
    */
  val metadata: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.metaNs.v1Ns.ObjectMeta] = js.native
  /**
    * Spec is the desired state of the Ingress. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
    */
  val spec: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.networkingNs.v1beta1Ns.IngressSpec] = js.native
  /**
    * Status is the current state of the Ingress. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#spec-and-status
    */
  val status: atPulumiPulumiLib.outputMod.Output[atPulumiKubernetesLib.typesOutputMod.networkingNs.v1beta1Ns.IngressStatus] = js.native
  def getInputs(): atPulumiKubernetesLib.typesInputMod.networkingNs.v1beta1Ns.Ingress = js.native
}

/* static members */
@JSImport("@pulumi/kubernetes/networking/v1beta1/Ingress", "Ingress")
@js.native
object Ingress extends js.Object {
  /**
    * Get the state of an existing `Ingress` resource, as identified by `id`.
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
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiKubernetesLib.networkingV1beta1IngressMod.Ingress = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiKubernetesLib.networkingV1beta1IngressMod.Ingress = js.native
}

