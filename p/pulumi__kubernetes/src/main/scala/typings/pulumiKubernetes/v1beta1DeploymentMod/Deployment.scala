package typings.pulumiKubernetes.v1beta1DeploymentMod

import typings.pulumiKubernetes.outputMod.extensions.v1beta1.DeploymentSpec
import typings.pulumiKubernetes.outputMod.extensions.v1beta1.DeploymentStatus
import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.extensionsSlashv1beta1
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/extensions/v1beta1/deployment", "Deployment")
@js.native
class Deployment protected () extends CustomResource {
  /**
    * Create a Deployment resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  /** @deprecated extensions/v1beta1/Deployment is deprecated by apps/v1/Deployment and not supported by Kubernetes v1.16+ clusters. */
  def this(name: String) = this()
  def this(name: String, args: DeploymentArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: DeploymentArgs, opts: CustomResourceOptions) = this()
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: Output_[extensionsSlashv1beta1] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: Output_[typings.pulumiKubernetes.pulumiKubernetesStrings.Deployment] = js.native
  /**
    * Standard object metadata.
    */
  val metadata: Output_[ObjectMeta] = js.native
  /**
    * Specification of the desired behavior of the Deployment.
    */
  val spec: Output_[DeploymentSpec] = js.native
  /**
    * Most recently observed status of the Deployment.
    */
  val status: Output_[DeploymentStatus] = js.native
}

/* static members */
@JSImport("@pulumi/kubernetes/extensions/v1beta1/deployment", "Deployment")
@js.native
object Deployment extends js.Object {
  /**
    * Get an existing Deployment resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Deployment = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): Deployment = js.native
  /**
    * Returns true if the given object is an instance of Deployment.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/deployment.Deployment */ Boolean = js.native
}

