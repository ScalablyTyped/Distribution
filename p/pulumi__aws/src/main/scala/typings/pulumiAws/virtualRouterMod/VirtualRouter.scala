package typings.pulumiAws.virtualRouterMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.appmesh.VirtualRouterSpec
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/appmesh/virtualRouter", "VirtualRouter")
@js.native
class VirtualRouter protected () extends CustomResource {
  /**
    * Create a VirtualRouter resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VirtualRouterArgs) = this()
  def this(name: String, args: VirtualRouterArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ARN of the virtual router.
    */
  val arn: Output_[String] = js.native
  
  /**
    * The creation date of the virtual router.
    */
  val createdDate: Output_[String] = js.native
  
  /**
    * The last update date of the virtual router.
    */
  val lastUpdatedDate: Output_[String] = js.native
  
  /**
    * The name of the service mesh in which to create the virtual router. Must be between 1 and 255 characters in length.
    */
  val meshName: Output_[String] = js.native
  
  /**
    * The AWS account ID of the service mesh's owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
    */
  val meshOwner: Output_[String] = js.native
  
  /**
    * The name to use for the virtual router. Must be between 1 and 255 characters in length.
    */
  val name: Output_[String] = js.native
  
  /**
    * The resource owner's AWS account ID.
    */
  val resourceOwner: Output_[String] = js.native
  
  /**
    * The virtual router specification to apply.
    */
  val spec: Output_[VirtualRouterSpec] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/appmesh/virtualRouter", "VirtualRouter")
@js.native
object VirtualRouter extends js.Object {
  
  /**
    * Get an existing VirtualRouter resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): VirtualRouter = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): VirtualRouter = js.native
  def get(name: String, id: Input[ID], state: VirtualRouterState): VirtualRouter = js.native
  def get(name: String, id: Input[ID], state: VirtualRouterState, opts: CustomResourceOptions): VirtualRouter = js.native
  
  /**
    * Returns true if the given object is an instance of VirtualRouter.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/virtualRouter.VirtualRouter */ Boolean = js.native
}
