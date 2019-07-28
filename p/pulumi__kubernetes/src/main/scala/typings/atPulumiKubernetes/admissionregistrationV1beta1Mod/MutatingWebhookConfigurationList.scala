package typings.atPulumiKubernetes.admissionregistrationV1beta1Mod

import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/admissionregistration/v1beta1", "MutatingWebhookConfigurationList")
@js.native
class MutatingWebhookConfigurationList protected ()
  extends typings.atPulumiKubernetes.admissionregistrationV1beta1MutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList {
  /**
    * Create a admissionregistration.v1beta1.MutatingWebhookConfigurationList resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(
    name: String,
    args: typings.atPulumiKubernetes.typesInputMod.admissionregistrationNs.v1beta1Ns.MutatingWebhookConfigurationList
  ) = this()
  def this(
    name: String,
    args: typings.atPulumiKubernetes.typesInputMod.admissionregistrationNs.v1beta1Ns.MutatingWebhookConfigurationList,
    opts: CustomResourceOptions
  ) = this()
}

/* static members */
@JSImport("@pulumi/kubernetes/admissionregistration/v1beta1", "MutatingWebhookConfigurationList")
@js.native
object MutatingWebhookConfigurationList extends js.Object {
  /**
    * Get the state of an existing `MutatingWebhookConfigurationList` resource, as identified by `id`.
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
  def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.admissionregistrationV1beta1MutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.admissionregistrationV1beta1MutatingWebhookConfigurationListMod.MutatingWebhookConfigurationList = js.native
  /**
    * Returns true if the given object is an instance of MutatingWebhookConfigurationList.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/admissionregistration/v1beta1/MutatingWebhookConfigurationList.MutatingWebhookConfigurationList */ Boolean = js.native
}

