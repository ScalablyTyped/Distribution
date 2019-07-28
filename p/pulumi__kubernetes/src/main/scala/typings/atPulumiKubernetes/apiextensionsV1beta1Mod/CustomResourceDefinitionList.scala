package typings.atPulumiKubernetes.apiextensionsV1beta1Mod

import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/apiextensions/v1beta1", "CustomResourceDefinitionList")
@js.native
class CustomResourceDefinitionList protected ()
  extends typings.atPulumiKubernetes.apiextensionsV1beta1CustomResourceDefinitionListMod.CustomResourceDefinitionList {
  /**
    * Create a apiextensions.v1beta1.CustomResourceDefinitionList resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(
    name: String,
    args: typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionList
  ) = this()
  def this(
    name: String,
    args: typings.atPulumiKubernetes.typesInputMod.apiextensionsNs.v1beta1Ns.CustomResourceDefinitionList,
    opts: CustomResourceOptions
  ) = this()
}

/* static members */
@JSImport("@pulumi/kubernetes/apiextensions/v1beta1", "CustomResourceDefinitionList")
@js.native
object CustomResourceDefinitionList extends js.Object {
  /**
    * Get the state of an existing `CustomResourceDefinitionList` resource, as identified by `id`.
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
  def get(name: String, id: Input[ID]): typings.atPulumiKubernetes.apiextensionsV1beta1CustomResourceDefinitionListMod.CustomResourceDefinitionList = js.native
  def get(name: String, id: Input[ID], opts: CustomResourceOptions): typings.atPulumiKubernetes.apiextensionsV1beta1CustomResourceDefinitionListMod.CustomResourceDefinitionList = js.native
  /**
    * Returns true if the given object is an instance of CustomResourceDefinitionList.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/kubernetes.@pulumi/kubernetes/apiextensions/v1beta1/CustomResourceDefinitionList.CustomResourceDefinitionList */ Boolean = js.native
}

