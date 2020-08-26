package typings.pulumiAws.lambdaFunctionMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.arnMod.ARN
import typings.pulumiAws.iamMod.Role
import typings.pulumiAws.outputMod.lambda.FunctionDeadLetterConfig
import typings.pulumiAws.outputMod.lambda.FunctionEnvironment
import typings.pulumiAws.outputMod.lambda.FunctionFileSystemConfig
import typings.pulumiAws.outputMod.lambda.FunctionTracingConfig
import typings.pulumiAws.outputMod.lambda.FunctionVpcConfig
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.mod.asset.Archive
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/lambda/function", "Function")
@js.native
class Function protected () extends CustomResource {
  /**
    * Create a Function resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: FunctionArgs) = this()
  def this(name: String, args: FunctionArgs, opts: CustomResourceOptions) = this()
  /**
    * The Amazon Resource Name (ARN) of the Amazon EFS Access Point that provides access to the file system.
    */
  val arn: Output_[String] = js.native
  /**
    * The path to the function's deployment package within the local filesystem. If defined, The `s3_`-prefixed options cannot be used.
    */
  val code: Output_[js.UndefOr[Archive]] = js.native
  /**
    * Nested block to configure the function's *dead letter queue*. See details below.
    */
  val deadLetterConfig: Output_[js.UndefOr[FunctionDeadLetterConfig]] = js.native
  /**
    * Description of what your Lambda Function does.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * The Lambda environment's configuration settings. Fields documented below.
    */
  val environment: Output_[js.UndefOr[FunctionEnvironment]] = js.native
  /**
    * The connection settings for an EFS file system. Fields documented below. Before creating or updating Lambda functions with `fileSystemConfig`, EFS mount targets much be in available lifecycle state. Use `dependsOn` to explicitly declare this dependency. See [Using Amazon EFS with Lambda](https://docs.aws.amazon.com/lambda/latest/dg/services-efs.html).
    */
  val fileSystemConfig: Output_[js.UndefOr[FunctionFileSystemConfig]] = js.native
  /**
    * The function [entrypoint](https://docs.aws.amazon.com/lambda/latest/dg/walkthrough-custom-events-create-test-function.html) in your code.
    */
  val handler: Output_[String] = js.native
  /**
    * The ARN to be used for invoking Lambda Function from API Gateway - to be used in `aws.apigateway.Integration`'s `uri`
    */
  val invokeArn: Output_[String] = js.native
  /**
    * Amazon Resource Name (ARN) of the AWS Key Management Service (KMS) key that is used to encrypt environment variables. If this configuration is not provided when environment variables are in use, AWS Lambda uses a default service key. If this configuration is provided when environment variables are not in use, the AWS Lambda API does not save this configuration and this provider will show a perpetual difference of adding the key. To fix the perpetual difference, remove this configuration.
    */
  val kmsKeyArn: Output_[js.UndefOr[String]] = js.native
  /**
    * The date this resource was last modified.
    */
  val lastModified: Output_[String] = js.native
  /**
    * List of Lambda Layer Version ARNs (maximum of 5) to attach to your Lambda Function. See [Lambda Layers](https://docs.aws.amazon.com/lambda/latest/dg/configuration-layers.html)
    */
  val layers: Output_[js.UndefOr[js.Array[String]]] = js.native
  /**
    * Amount of memory in MB your Lambda Function can use at runtime. Defaults to `128`. See [Limits](https://docs.aws.amazon.com/lambda/latest/dg/limits.html)
    */
  val memorySize: Output_[js.UndefOr[Double]] = js.native
  /**
    * A unique name for your Lambda Function.
    */
  val name: Output_[String] = js.native
  /**
    * Whether to publish creation/change as new Lambda Function Version. Defaults to `false`.
    */
  val publish: Output_[js.UndefOr[Boolean]] = js.native
  /**
    * The Amazon Resource Name (ARN) identifying your Lambda Function Version
    * (if versioning is enabled via `publish = true`).
    */
  val qualifiedArn: Output_[String] = js.native
  /**
    * The amount of reserved concurrent executions for this lambda function. A value of `0` disables lambda from being triggered and `-1` removes any concurrency limitations. Defaults to Unreserved Concurrency Limits `-1`. See [Managing Concurrency](https://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html)
    */
  val reservedConcurrentExecutions: Output_[js.UndefOr[Double]] = js.native
  /**
    * IAM role attached to the Lambda Function. This governs both who / what can invoke your Lambda Function, as well as what resources our Lambda Function has access to. See [Lambda Permission Model](https://docs.aws.amazon.com/lambda/latest/dg/intro-permission-model.html) for more details.
    */
  val role: Output_[ARN] = js.native
  /**
    * Actual Role instance value for this Function.  Will only be set if this function was
    * created from [createFunction]
    */
  var roleInstance: js.UndefOr[Role] = js.native
  /**
    * See [Runtimes](https://docs.aws.amazon.com/lambda/latest/dg/API_CreateFunction.html#SSS-CreateFunction-request-Runtime) for valid values.
    */
  val runtime: Output_[String] = js.native
  /**
    * The S3 bucket location containing the function's deployment package. Conflicts with `filename`. This bucket must reside in the same AWS region where you are creating the Lambda function.
    */
  val s3Bucket: Output_[js.UndefOr[String]] = js.native
  /**
    * The S3 key of an object containing the function's deployment package. Conflicts with `filename`.
    */
  val s3Key: Output_[js.UndefOr[String]] = js.native
  /**
    * The object version containing the function's deployment package. Conflicts with `filename`.
    */
  val s3ObjectVersion: Output_[js.UndefOr[String]] = js.native
  /**
    * Used to trigger updates. Must be set to a base64-encoded SHA256 hash of the package file specified with either `filename` or `s3Key`. The usual way to set this is `filebase64sha256("file.zip")` (this provider 0.11.12 and later) or `base64sha256(file("file.zip"))` (this provider 0.11.11 and earlier), where "file.zip" is the local filename of the lambda function source archive.
    */
  val sourceCodeHash: Output_[String] = js.native
  /**
    * The size in bytes of the function .zip file.
    */
  val sourceCodeSize: Output_[Double] = js.native
  /**
    * A mapping of tags to assign to the object.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * The amount of time your Lambda Function has to run in seconds. Defaults to `3`. See [Limits](https://docs.aws.amazon.com/lambda/latest/dg/limits.html)
    */
  val timeout: Output_[js.UndefOr[Double]] = js.native
  val tracingConfig: Output_[FunctionTracingConfig] = js.native
  /**
    * Latest published version of your Lambda Function.
    */
  val version: Output_[String] = js.native
  /**
    * Provide this to allow your function to access your VPC. Fields documented below. See [Lambda in VPC](http://docs.aws.amazon.com/lambda/latest/dg/vpc.html)
    */
  val vpcConfig: Output_[js.UndefOr[FunctionVpcConfig]] = js.native
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Function = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Function = js.native
  def get(name: String, id: Input[ID], state: FunctionState): Function = js.native
  def get(name: String, id: Input[ID], state: FunctionState, opts: CustomResourceOptions): Function = js.native
  /**
    * Returns true if the given object is an instance of Function.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/lambda/function.Function */ Boolean = js.native
}

