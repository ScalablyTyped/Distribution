package typings.pulumiAws.resourceMod

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway/resource", "Resource")
@js.native
class Resource protected () extends CustomResource {
  /**
    * Create a Resource resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ResourceArgs) = this()
  def this(name: String, args: ResourceArgs, opts: CustomResourceOptions) = this()
  /**
    * The ID of the parent API resource
    */
  val parentId: Output_[String] = js.native
  /**
    * The complete path for this API resource, including all parent paths.
    */
  val path: Output_[String] = js.native
  /**
    * The last path segment of this API resource.
    */
  val pathPart: Output_[String] = js.native
  /**
    * The ID of the associated REST API
    */
  val restApi: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/apigateway/resource", "Resource")
@js.native
object Resource extends js.Object {
  /**
    * Get an existing Resource resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Resource = js.native
  def get(name: String, id: Input[ID], state: ResourceState): Resource = js.native
  def get(name: String, id: Input[ID], state: ResourceState, opts: CustomResourceOptions): Resource = js.native
  /**
    * Returns true if the given object is an instance of Resource.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/resource.Resource */ Boolean = js.native
}

