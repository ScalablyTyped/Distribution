package typings.pulumiAws.virtualGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.appmesh.VirtualGatewaySpec
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/appmesh/virtualGateway", "VirtualGateway")
@js.native
class VirtualGateway protected () extends CustomResource {
  /**
    * Create a VirtualGateway resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VirtualGatewayArgs) = this()
  def this(name: String, args: VirtualGatewayArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The ARN of the virtual gateway.
    */
  val arn: Output_[String] = js.native
  
  /**
    * The creation date of the virtual gateway.
    */
  val createdDate: Output_[String] = js.native
  
  /**
    * The last update date of the virtual gateway.
    */
  val lastUpdatedDate: Output_[String] = js.native
  
  /**
    * The name of the service mesh in which to create the virtual gateway. Must be between 1 and 255 characters in length.
    */
  val meshName: Output_[String] = js.native
  
  /**
    * The AWS account ID of the service mesh's owner. Defaults to the account ID the [AWS provider](https://www.terraform.io/docs/providers/aws/index.html) is currently connected to.
    */
  val meshOwner: Output_[String] = js.native
  
  /**
    * The name to use for the virtual gateway. Must be between 1 and 255 characters in length.
    */
  val name: Output_[String] = js.native
  
  /**
    * The resource owner's AWS account ID.
    */
  val resourceOwner: Output_[String] = js.native
  
  /**
    * The virtual gateway specification to apply.
    */
  val spec: Output_[VirtualGatewaySpec] = js.native
  
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/appmesh/virtualGateway", "VirtualGateway")
@js.native
object VirtualGateway extends js.Object {
  
  /**
    * Get an existing VirtualGateway resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): VirtualGateway = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): VirtualGateway = js.native
  def get(name: String, id: Input[ID], state: VirtualGatewayState): VirtualGateway = js.native
  def get(name: String, id: Input[ID], state: VirtualGatewayState, opts: CustomResourceOptions): VirtualGateway = js.native
  
  /**
    * Returns true if the given object is an instance of VirtualGateway.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/appmesh/virtualGateway.VirtualGateway */ Boolean = js.native
}
