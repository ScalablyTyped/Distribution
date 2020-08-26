package typings.pulumiAws.environmentEC2Mod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloud9/environmentEC2", "EnvironmentEC2")
@js.native
class EnvironmentEC2 protected () extends CustomResource {
  /**
    * Create a EnvironmentEC2 resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: EnvironmentEC2Args) = this()
  def this(name: String, args: EnvironmentEC2Args, opts: CustomResourceOptions) = this()
  /**
    * The ARN of the environment.
    */
  val arn: Output_[String] = js.native
  /**
    * The number of minutes until the running instance is shut down after the environment has last been used.
    */
  val automaticStopTimeMinutes: Output_[js.UndefOr[Double]] = js.native
  /**
    * The description of the environment.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * The type of instance to connect to the environment, e.g. `t2.micro`.
    */
  val instanceType: Output_[String] = js.native
  /**
    * The name of the environment.
    */
  val name: Output_[String] = js.native
  /**
    * The ARN of the environment owner. This can be ARN of any AWS IAM principal. Defaults to the environment's creator.
    */
  val ownerArn: Output_[String] = js.native
  /**
    * The ID of the subnet in Amazon VPC that AWS Cloud9 will use to communicate with the Amazon EC2 instance.
    */
  val subnetId: Output_[js.UndefOr[String]] = js.native
  /**
    * Key-value map of resource tags
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * The type of the environment (e.g. `ssh` or `ec2`)
    */
  val `type`: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/cloud9/environmentEC2", "EnvironmentEC2")
@js.native
object EnvironmentEC2 extends js.Object {
  /**
    * Get an existing EnvironmentEC2 resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): EnvironmentEC2 = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): EnvironmentEC2 = js.native
  def get(name: String, id: Input[ID], state: EnvironmentEC2State): EnvironmentEC2 = js.native
  def get(name: String, id: Input[ID], state: EnvironmentEC2State, opts: CustomResourceOptions): EnvironmentEC2 = js.native
  /**
    * Returns true if the given object is an instance of EnvironmentEC2.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloud9/environmentEC2.EnvironmentEC2 */ Boolean = js.native
}

