package typings.pulumiAws.internetGatewayMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ec2/internetGateway", "InternetGateway")
@js.native
class InternetGateway protected () extends CustomResource {
  /**
    * Create a InternetGateway resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: InternetGatewayArgs) = this()
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: InternetGatewayArgs, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the Internet Gateway.
    */
  val arn: Output_[String] = js.native
  /**
    * The ID of the AWS account that owns the internet gateway.
    */
  val ownerId: Output_[String] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * The VPC ID to create in.
    */
  val vpcId: Output_[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ec2/internetGateway", "InternetGateway")
@js.native
object InternetGateway extends js.Object {
  /**
    * Get an existing InternetGateway resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): InternetGateway = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): InternetGateway = js.native
  def get(name: String, id: Input[ID], state: InternetGatewayState): InternetGateway = js.native
  def get(name: String, id: Input[ID], state: InternetGatewayState, opts: CustomResourceOptions): InternetGateway = js.native
  /**
    * Returns true if the given object is an instance of InternetGateway.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ec2/internetGateway.InternetGateway */ Boolean = js.native
}

