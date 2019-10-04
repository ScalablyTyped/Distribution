package typings.atPulumiAws.lambdaAliasMod

import typings.atPulumiAws.typesOutputMod.lambdaNs.AliasRoutingConfig
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lambda/alias", "Alias")
@js.native
class Alias protected () extends CustomResource {
  /**
    * Create a Alias resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: AliasArgs) = this()
  def this(name: String, args: AliasArgs, opts: CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name (ARN) identifying your Lambda function alias.
    */
  val arn: Output[String] = js.native
  /**
    * Description of the alias.
    */
  val description: Output[js.UndefOr[String]] = js.native
  /**
    * The function ARN of the Lambda function for which you want to create an alias.
    */
  val functionName: Output[String] = js.native
  /**
    * Lambda function version for which you are creating the alias. Pattern: `(\$LATEST|[0-9]+)`.
    */
  val functionVersion: Output[String] = js.native
  /**
    * The ARN to be used for invoking Lambda Function from API Gateway - to be used in [`aws.apigateway.Integration`](https://www.terraform.io/docs/providers/aws/r/api_gateway_integration.html)'s `uri`
    */
  val invokeArn: Output[String] = js.native
  /**
    * Name for the alias you are creating. Pattern: `(?!^[0-9]+$)([a-zA-Z0-9-_]+)`
    */
  val name: Output[String] = js.native
  /**
    * The Lambda alias' route configuration settings. Fields documented below
    */
  val routingConfig: Output[js.UndefOr[AliasRoutingConfig]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/lambda/alias", "Alias")
@js.native
object Alias extends js.Object {
  /**
    * Get an existing Alias resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: String, id: Input[ID]): Alias = js.native
  def get(name: String, id: Input[ID], state: AliasState): Alias = js.native
  def get(name: String, id: Input[ID], state: AliasState, opts: CustomResourceOptions): Alias = js.native
  /**
    * Returns true if the given object is an instance of Alias.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/alias.Alias */ Boolean = js.native
}

