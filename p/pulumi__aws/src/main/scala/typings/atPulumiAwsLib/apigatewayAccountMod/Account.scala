package typings
package atPulumiAwsLib.apigatewayAccountMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/apigateway/account", "Account")
@js.native
class Account protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Account resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: AccountArgs) = this()
  def this(name: java.lang.String, args: AccountArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The ARN of an IAM role for CloudWatch (to allow logging & monitoring).
    * See more [in AWS Docs](https://docs.aws.amazon.com/apigateway/latest/developerguide/how-to-stage-settings.html#how-to-stage-settings-console).
    * Logging & monitoring can be enabled/disabled and otherwise tuned on the API Gateway Stage level.
    */
  val cloudwatchRoleArn: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Account-Level throttle settings. See exported fields below.
    */
  val throttleSettings: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiAwsLib.Anon_BurstLimit] = js.native
}

/* static members */
@JSImport("@pulumi/aws/apigateway/account", "Account")
@js.native
object Account extends js.Object {
  /**
    * Get an existing Account resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.apigatewayAccountMod.Account = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayAccountMod.AccountState
  ): atPulumiAwsLib.apigatewayAccountMod.Account = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.apigatewayAccountMod.AccountState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.apigatewayAccountMod.Account = js.native
}

