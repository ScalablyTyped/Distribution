package typings
package atPulumiAwsLib.cloud9EnvironmentEC2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/cloud9/environmentEC2", "EnvironmentEC2")
@js.native
class EnvironmentEC2 protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a EnvironmentEC2 resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: EnvironmentEC2Args) = this()
  def this(name: java.lang.String, args: EnvironmentEC2Args, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN of the environment.
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The number of minutes until the running instance is shut down after the environment has last been used.
    */
  val automaticStopTimeMinutes: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * The description of the environment.
    */
  val description: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The type of instance to connect to the environment, e.g. `t2.micro`.
    */
  val instanceType: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The name of the environment.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ARN of the environment owner. This can be ARN of any AWS IAM principal. Defaults to the environment's creator.
    */
  val ownerArn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ID of the subnet in Amazon VPC that AWS Cloud9 will use to communicate with the Amazon EC2 instance.
    */
  val subnetId: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The type of the environment (e.g. `ssh` or `ec2`)
    */
  val `type`: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
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
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.cloud9EnvironmentEC2Mod.EnvironmentEC2 = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloud9EnvironmentEC2Mod.EnvironmentEC2State
  ): atPulumiAwsLib.cloud9EnvironmentEC2Mod.EnvironmentEC2 = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.cloud9EnvironmentEC2Mod.EnvironmentEC2State,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.cloud9EnvironmentEC2Mod.EnvironmentEC2 = js.native
  /**
    * Returns true if the given object is an instance of EnvironmentEC2.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/cloud9/environmentEC2.EnvironmentEC2 */ scala.Boolean = js.native
}

