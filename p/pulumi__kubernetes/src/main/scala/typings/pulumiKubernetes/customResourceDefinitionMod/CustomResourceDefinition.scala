package typings.pulumiKubernetes.customResourceDefinitionMod

import typings.pulumiKubernetes.outputMod.apiextensions.v1beta1.CustomResourceDefinitionSpec
import typings.pulumiKubernetes.outputMod.apiextensions.v1beta1.CustomResourceDefinitionStatus
import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiKubernetes.pulumiKubernetesStrings.apiextensionsDotk8sDotioSlashv1beta1
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/apiextensions/v1beta1/customResourceDefinition", "CustomResourceDefinition")
@js.native
class CustomResourceDefinition protected () extends CustomResource {
  /**
    * Create a CustomResourceDefinition resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: CustomResourceDefinitionArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: CustomResourceDefinitionArgs, opts: CustomResourceOptions) = this()
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
    */
  val apiVersion: Output_[apiextensionsDotk8sDotioSlashv1beta1] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
    */
  val kind: Output_[typings.pulumiKubernetes.pulumiKubernetesStrings.CustomResourceDefinition] = js.native
  val metadata: Output_[ObjectMeta] = js.native
  /**
    * spec describes how the user wants the resources to appear
    */
  val spec: Output_[CustomResourceDefinitionSpec] = js.native
  /**
    * status indicates the actual state of the CustomResourceDefinition
    */
  val status: Output_[CustomResourceDefinitionStatus] = js.native
}

/* static members */
@JSImport("@pulumi/kubernetes/apiextensions/v1beta1/customResourceDefinition", "CustomResourceDefinition")
@js.native
object CustomResourceDefinition extends js.Object {
  /**
    * Get an existing CustomResourceDefinition resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): CustomResourceDefinition = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): CustomResourceDefinition = js.native
  /**
    * Returns true if the given object is an instance of CustomResourceDefinition.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiextensions/v1beta1/customResourceDefinition.CustomResourceDefinition */ Boolean = js.native
}

