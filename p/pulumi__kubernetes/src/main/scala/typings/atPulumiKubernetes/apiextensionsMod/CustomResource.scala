package typings.atPulumiKubernetes.apiextensionsMod

import typings.atPulumiKubernetes.apiextensionsCustomResourceMod.CustomResourceArgs
import typings.atPulumiKubernetes.apiextensionsCustomResourceMod.CustomResourceGetOptions
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/apiextensions", "CustomResource")
@js.native
class CustomResource protected ()
  extends typings.atPulumiKubernetes.apiextensionsCustomResourceMod.CustomResource {
  /**
    * Create a CustomResource resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: CustomResourceArgs) = this()
  def this(name: String, args: CustomResourceArgs, opts: CustomResourceOptions) = this()
}

/* static members */
@JSImport("@pulumi/kubernetes/apiextensions", "CustomResource")
@js.native
object CustomResource extends js.Object {
  /**
    * Get the state of an existing `CustomResource`, as identified by `id`.
    * Typically this ID  is of the form [namespace]/[name]; if [namespace] is omitted, then (per
    * Kubernetes convention) the ID becomes default/[name].
    *
    * Pulumi will keep track of this resource using `name` as the Pulumi ID.
    *
    * @param name _Unique_ name used to register this resource with Pulumi.
    * @param opts Uniquely specifies a CustomResource to select.
    */
  def get(name: String, opts: CustomResourceGetOptions): typings.atPulumiKubernetes.apiextensionsCustomResourceMod.CustomResource = js.native
}

