package typings.pulumiAws.vpcLinkMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway/vpcLink", "VpcLink")
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
  val arn: Output_[String] = js.native
  /**
    * The description of the VPC link.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * The name used to label and identify the VPC link.
    */
  val name: Output_[String] = js.native
  /**
    * Key-value mapping of resource tags
    */
  val tags: Output_[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The list of network load balancer arns in the VPC targeted by the VPC link. Currently AWS only supports 1 target.
    */
  val targetArn: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/apigateway/vpcLink", "VpcLink")
@js.native
object VpcLink extends js.Object {
  /**
    * Get an existing VpcLink resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): VpcLink = js.native
  def get(name: String, id: Input[ID], state: VpcLinkState): VpcLink = js.native
  def get(name: String, id: Input[ID], state: VpcLinkState, opts: CustomResourceOptions): VpcLink = js.native
  /**
    * Returns true if the given object is an instance of VpcLink.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/apigateway/vpcLink.VpcLink */ Boolean = js.native
}

