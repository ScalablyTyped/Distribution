package typings.pulumiKubernetes.validatingWebhookConfigurationListMod

import typings.pulumiKubernetes.outputMod.admissionregistration.v1beta1.ValidatingWebhookConfiguration
import typings.pulumiKubernetes.outputMod.meta.v1.ListMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.admissionregistrationDotk8sDotioSlashv1beta1
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/kubernetes/admissionregistration/v1beta1/validatingWebhookConfigurationList", "ValidatingWebhookConfigurationList")
@js.native
class ValidatingWebhookConfigurationList protected () extends CustomResource {
  /**
    * Create a ValidatingWebhookConfigurationList resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: ValidatingWebhookConfigurationListArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: ValidatingWebhookConfigurationListArgs, opts: CustomResourceOptions) = this()
  
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: Output_[admissionregistrationDotk8sDotioSlashv1beta1] = js.native
  
  /**
    * List of ValidatingWebhookConfiguration.
    */
  val items: Output_[js.Array[ValidatingWebhookConfiguration]] = js.native
  
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: Output_[
    typings.pulumiKubernetes.pulumiKubernetesStrings.ValidatingWebhookConfigurationList
  ] = js.native
  
  /**
    * Standard list metadata. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val metadata: Output_[ListMeta] = js.native
}
/* static members */
@JSImport("@pulumi/kubernetes/admissionregistration/v1beta1/validatingWebhookConfigurationList", "ValidatingWebhookConfigurationList")
@js.native
object ValidatingWebhookConfigurationList extends js.Object {
  
  /**
    * Get an existing ValidatingWebhookConfigurationList resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): ValidatingWebhookConfigurationList = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): ValidatingWebhookConfigurationList = js.native
  
  /**
    * Returns true if the given object is an instance of ValidatingWebhookConfigurationList.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/validatingWebhookConfigurationList.ValidatingWebhookConfigurationList */ Boolean = js.native
}
