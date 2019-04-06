package typings
package atPulumiAwsLib.lambdaFunctionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lambda/function", "Function")
@js.native
class Function protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Function resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: FunctionArgs) = this()
  def this(name: java.lang.String, args: FunctionArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name (ARN) identifying your Lambda Function.
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The path to the function's deployment package within the local filesystem. If defined, The `s3_`-prefixed options cannot be used.
    */
  val code: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiPulumiLib.atPulumiPulumiMod.assetNs.Archive]] = js.native
  /**
    * Nested block to configure the function's *dead letter queue*. See details below.
    */
  val deadLetterConfig: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_TargetArn]] = js.native
  /**
    * Description of what your Lambda Function does.
    */
  val description: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The Lambda environment's configuration settings. Fields documented below.
    */
  val environment: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_KeyVariables]] = js.native
  /**
    * The function [entrypoint][3] in your code.
    */
  val handler: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ARN to be used for invoking Lambda Function from API Gateway - to be used in [`aws_api_gateway_integration`](https://www.terraform.io/docs/providers/aws/r/api_gateway_integration.html)'s `uri`
    */
  val invokeArn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The ARN for the KMS encryption key.
    */
  val kmsKeyArn: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The date this resource was last modified.
    */
  val lastModified: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * List of Lambda Layer Version ARNs (maximum of 5) to attach to your Lambda Function. See [Lambda Layers][10]
    */
  val layers: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[java.lang.String]]] = js.native
  /**
    * Amount of memory in MB your Lambda Function can use at runtime. Defaults to `128`. See [Limits][5]
    */
  val memorySize: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * A unique name for your Lambda Function.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Whether to publish creation/change as new Lambda Function Version. Defaults to `false`.
    */
  val publish: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Boolean]] = js.native
  /**
    * The Amazon Resource Name (ARN) identifying your Lambda Function Version
    * (if versioning is enabled via `publish = true`).
    */
  val qualifiedArn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The amount of reserved concurrent executions for this lambda function. A value of `0` disables lambda from being triggered and `-1` removes any concurrency limitations. Defaults to Unreserved Concurrency Limits `-1`. See [Managing Concurrency][9]
    */
  val reservedConcurrentExecutions: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * IAM role attached to the Lambda Function. This governs both who / what can invoke your Lambda Function, as well as what resources our Lambda Function has access to. See [Lambda Permission Model][4] for more details.
    */
  val role: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.arnMod.ARN] = js.native
  var roleInstance: js.UndefOr[atPulumiAwsLib.iamMod.Role] = js.native
  /**
    * See [Runtimes][6] for valid values.
    */
  val runtime: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The S3 bucket location containing the function's deployment package. Conflicts with `filename`. This bucket must reside in the same AWS region where you are creating the Lambda function.
    */
  val s3Bucket: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The S3 key of an object containing the function's deployment package. Conflicts with `filename`.
    */
  val s3Key: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * The object version containing the function's deployment package. Conflicts with `filename`.
    */
  val s3ObjectVersion: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Used to trigger updates. Must be set to a base64-encoded SHA256 hash of the package file specified with either `filename` or `s3_key`. The usual way to set this is `${base64sha256(file("file.zip"))}`, where "file.zip" is the local filename of the lambda function source archive.
    */
  val sourceCodeHash: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The size in bytes of the function .zip file.
    */
  val sourceCodeSize: atPulumiPulumiLib.outputMod.Output[scala.Double] = js.native
  /**
    * A mapping of tags to assign to the object.
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * The amount of time your Lambda Function has to run in seconds. Defaults to `3`. See [Limits][5]
    */
  val timeout: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Double]] = js.native
  val tracingConfig: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_Mode] = js.native
  /**
    * Latest published version of your Lambda Function.
    */
  val version: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Provide this to allow your function to access your VPC. Fields documented below. See [Lambda in VPC][7]
    */
  val vpcConfig: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_SecurityGroupIdsSubnetIds]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/lambda/function", "Function")
@js.native
object Function extends js.Object {
  /**
    * Get an existing Function resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.lambdaFunctionMod.Function = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.lambdaFunctionMod.FunctionState
  ): atPulumiAwsLib.lambdaFunctionMod.Function = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.lambdaFunctionMod.FunctionState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.lambdaFunctionMod.Function = js.native
}

