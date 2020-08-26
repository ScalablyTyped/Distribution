package typings.pulumiKubernetes.customResourceMod

import typings.pulumiKubernetes.outputMod.meta.v1.ObjectMeta
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/kubernetes/apiextensions/customResource", "CustomResource")
@js.native
class CustomResource protected ()
  extends typings.pulumiPulumi.mod.CustomResource {
  /**
    * Create a CustomResource resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: CustomResourceArgs) = this()
  def this(name: String, args: CustomResourceArgs, opts: CustomResourceOptions) = this()
  val __inputs: js.Any = js.native
  /**
    * APIVersion defines the versioned schema of this representation of an object. Servers should
    * convert recognized schemas to the latest internal value, and may reject unrecognized
    * values. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#resources
    */
  val apiVersion: Output_[String] = js.native
  /**
    * Kind is a string value representing the REST resource this object represents. Servers may
    * infer this from the endpoint the client submits requests to. Cannot be updated. In
    * CamelCase. More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#types-kinds
    */
  val kind: Output_[String] = js.native
  /**
    * Standard object metadata; More info:
    * https://git.k8s.io/community/contributors/devel/api-conventions.md#metadata.
    */
  val metadata: Output_[ObjectMeta] = js.native
  def getInputs(): CustomResourceArgs = js.native
}

/* static members */
@JSImport("@pulumi/kubernetes/apiextensions/customResource", "CustomResource")
@js.native
object CustomResource extends js.Object {
  /**
    * Get an existing CustomResource resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param opts Uniquely specifies a CustomResource to select.
    */
  def get(name: String, opts: CustomResourceGetOptions): CustomResource = js.native
}

