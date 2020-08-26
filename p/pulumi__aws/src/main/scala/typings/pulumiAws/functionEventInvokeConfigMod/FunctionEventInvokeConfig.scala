package typings.pulumiAws.functionEventInvokeConfigMod

import typings.pulumiAws.outputMod.lambda.FunctionEventInvokeConfigDestinationConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lambda/functionEventInvokeConfig", "FunctionEventInvokeConfig")
@js.native
class FunctionEventInvokeConfig protected () extends CustomResource {
  /**
    * Create a FunctionEventInvokeConfig resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: FunctionEventInvokeConfigArgs) = this()
  def this(name: String, args: FunctionEventInvokeConfigArgs, opts: CustomResourceOptions) = this()
  /**
    * Configuration block with destination configuration. See below for details.
    */
  val destinationConfig: Output_[js.UndefOr[FunctionEventInvokeConfigDestinationConfig]] = js.native
  /**
    * Name or Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
    */
  val functionName: Output_[String] = js.native
  /**
    * Maximum age of a request that Lambda sends to a function for processing in seconds. Valid values between 60 and 21600.
    */
  val maximumEventAgeInSeconds: Output_[js.UndefOr[Double]] = js.native
  /**
    * Maximum number of times to retry when the function returns an error. Valid values between 0 and 2. Defaults to 2.
    */
  val maximumRetryAttempts: Output_[js.UndefOr[Double]] = js.native
  /**
    * Lambda Function published version, `$LATEST`, or Lambda Alias name.
    */
  val qualifier: Output_[js.UndefOr[String]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/lambda/functionEventInvokeConfig", "FunctionEventInvokeConfig")
@js.native
object FunctionEventInvokeConfig extends js.Object {
  /**
    * Get an existing FunctionEventInvokeConfig resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): FunctionEventInvokeConfig = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): FunctionEventInvokeConfig = js.native
  def get(name: String, id: Input[ID], state: FunctionEventInvokeConfigState): FunctionEventInvokeConfig = js.native
  def get(name: String, id: Input[ID], state: FunctionEventInvokeConfigState, opts: CustomResourceOptions): FunctionEventInvokeConfig = js.native
  /**
    * Returns true if the given object is an instance of FunctionEventInvokeConfig.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/functionEventInvokeConfig.FunctionEventInvokeConfig */ Boolean = js.native
}

