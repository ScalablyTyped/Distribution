package typings.pulumiAws.lambdaAliasMod

import typings.pulumiAws.outputMod.lambda.AliasRoutingConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  val arn: Output_[String] = js.native
  
  /**
    * Description of the alias.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Lambda Function name or ARN.
    */
  val functionName: Output_[String] = js.native
  
  /**
    * Lambda function version for which you are creating the alias. Pattern: `(\$LATEST|[0-9]+)`.
    */
  val functionVersion: Output_[String] = js.native
  
  /**
    * The ARN to be used for invoking Lambda Function from API Gateway - to be used in `aws.apigateway.Integration`'s `uri`
    */
  val invokeArn: Output_[String] = js.native
  
  /**
    * Name for the alias you are creating. Pattern: `(?!^[0-9]+$)([a-zA-Z0-9-_]+)`
    */
  val name: Output_[String] = js.native
  
  /**
    * The Lambda alias' route configuration settings. Fields documented below
    */
  val routingConfig: Output_[js.UndefOr[AliasRoutingConfig]] = js.native
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Alias = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Alias = js.native
  def get(name: String, id: Input[ID], state: AliasState): Alias = js.native
  def get(name: String, id: Input[ID], state: AliasState, opts: CustomResourceOptions): Alias = js.native
  
  /**
    * Returns true if the given object is an instance of Alias.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/alias.Alias */ Boolean = js.native
}
