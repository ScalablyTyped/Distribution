package typings.pulumiKubernetes.extensionsMod.v1beta1

import typings.pulumiKubernetes.v1beta1DeploymentMod.DeploymentArgs
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/extensions", "v1beta1.Deployment")
@js.native
class Deployment protected ()
  extends typings.pulumiKubernetes.extensionsV1beta1Mod.Deployment {
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
}

/* static members */
@JSImport("@pulumi/kubernetes/extensions", "v1beta1.Deployment")
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
  def get(name: String, id: Input[ID]): typings.pulumiKubernetes.v1beta1DeploymentMod.Deployment = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.pulumiKubernetes.v1beta1DeploymentMod.Deployment = js.native
  /**
    * Returns true if the given object is an instance of Deployment.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/extensions/v1beta1/deployment.Deployment */ Boolean = js.native
}

