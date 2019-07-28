package typings.atPulumiKubernetes.appsV1beta2DeploymentMod

import typings.atPulumiKubernetes.atPulumiKubernetesStrings.`apps/v1beta2`
import typings.atPulumiKubernetes.typesOutputMod.appsNs.v1beta2Ns.DeploymentSpec
import typings.atPulumiKubernetes.typesOutputMod.appsNs.v1beta2Ns.DeploymentStatus
import typings.atPulumiKubernetes.typesOutputMod.metaNs.v1Ns.ObjectMeta
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/apps/v1beta2/Deployment", "Deployment")
@js.native
class Deployment protected () extends CustomResource {
  /**
    * Create a apps.v1beta2.Deployment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta2Ns.Deployment) = this()
  def this(
    name: String,
    args: typings.atPulumiKubernetes.typesInputMod.appsNs.v1beta2Ns.Deployment,
    opts: CustomResourceOptions
  ) = this()
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: Output[`apps/v1beta2`] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: Output[typings.atPulumiKubernetes.atPulumiKubernetesStrings.Deployment] = js.native
  /**
    * Standard object metadata.
    */
  val metadata: Output[ObjectMeta] = js.native
  /**
    * Specification of the desired behavior of the Deployment.
    */
  val spec: Output[DeploymentSpec] = js.native
  /**
    * Most recently observed status of the Deployment.
    */
  val status: Output[DeploymentStatus] = js.native
}

/* static members */
@JSImport("@pulumi/kubernetes/apps/v1beta2/Deployment", "Deployment")
@js.native
object Deployment extends js.Object {
  /**
    * Get the state of an existing `Deployment` resource, as identified by `id`.
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
  def get(name: String, id: Input[ID]): Deployment = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): Deployment = js.native
  /**
    * Returns true if the given object is an instance of Deployment.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apps/v1beta2/Deployment.Deployment */ Boolean = js.native
}

