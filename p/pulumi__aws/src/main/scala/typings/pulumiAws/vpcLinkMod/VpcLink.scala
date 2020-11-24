package typings.pulumiAws.vpcLinkMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/aws/apigatewayv2/vpcLink", "VpcLink")
@js.native
class VpcLink protected () extends CustomResource {
  /**
    * Create a VpcLink resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: VpcLinkArgs) = this()
  def this(name: String, args: VpcLinkArgs, opts: CustomResourceOptions) = this()
  
  /**
    * The VPC Link ARN.
    */
  val arn: Output_[String] = js.native
  
  /**
    * The name of the VPC Link. Must be between 1 and 128 characters in length.
    */
  val name: Output_[String] = js.native
  
  /**
    * Security group IDs for the VPC Link.
    */
  val securityGroupIds: Output_[js.Array[String]] = js.native
  
  /**
    * Subnet IDs for the VPC Link.
    */
  val subnetIds: Output_[js.Array[String]] = js.native
  
  /**
    * A map of tags to assign to the VPC Link.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
}
/* static members */
@JSImport("@pulumi/aws/apigatewayv2/vpcLink", "VpcLink")
@js.native
object VpcLink extends js.Object {
  
  /**
    * Get an existing VpcLink resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): VpcLink = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): VpcLink = js.native
  def get(name: String, id: Input[ID], state: VpcLinkState): VpcLink = js.native
  def get(name: String, id: Input[ID], state: VpcLinkState, opts: CustomResourceOptions): VpcLink = js.native
  
  /**
    * Returns true if the given object is an instance of VpcLink.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigatewayv2/vpcLink.VpcLink */ Boolean = js.native
}
