package typings
package atPulumiAwsLib.lambdaFunctionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionArgs extends js.Object {
  /**
    * The path to the function's deployment package within the local filesystem. If defined, The `s3_`-prefixed options cannot be used.
    */
  val code: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.atPulumiPulumiMod.assetNs.Archive]
  ] = js.undefined
  /**
    * Nested block to configure the function's *dead letter queue*. See details below.
    */
  val deadLetterConfig: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_TargetArnInput]] = js.undefined
  /**
    * Description of what your Lambda Function does.
    */
  val description: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The Lambda environment's configuration settings. Fields documented below.
    */
  val environment: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_KeyVariablesInput]] = js.undefined
  /**
    * The function [entrypoint][3] in your code.
    */
  val handler: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The ARN for the KMS encryption key.
    */
  val kmsKeyArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * List of Lambda Layer Version ARNs (maximum of 5) to attach to your Lambda Function. See [Lambda Layers][10]
    */
  val layers: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  /**
    * Amount of memory in MB your Lambda Function can use at runtime. Defaults to `128`. See [Limits][5]
    */
  val memorySize: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * A unique name for your Lambda Function.
    */
  val name: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Whether to publish creation/change as new Lambda Function Version. Defaults to `false`.
    */
  val publish: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  /**
    * The amount of reserved concurrent executions for this lambda function. Defaults to Unreserved Concurrency Limits. See [Managing Concurrency][9]
    */
  val reservedConcurrentExecutions: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * IAM role attached to the Lambda Function. This governs both who / what can invoke your Lambda Function, as well as what resources our Lambda Function has access to. See [Lambda Permission Model][4] for more details.
    */
  val role: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.arnMod.ARN]
  /**
    * See [Runtimes][6] for valid values.
    */
  val runtime: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The S3 bucket location containing the function's deployment package. Conflicts with `filename`. This bucket must reside in the same AWS region where you are creating the Lambda function.
    */
  val s3Bucket: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The S3 key of an object containing the function's deployment package. Conflicts with `filename`.
    */
  val s3Key: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The object version containing the function's deployment package. Conflicts with `filename`.
    */
  val s3ObjectVersion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Used to trigger updates. Must be set to a base64-encoded SHA256 hash of the package file specified with either `filename` or `s3_key`. The usual way to set this is `${base64sha256(file("file.zip"))}`, where "file.zip" is the local filename of the lambda function source archive.
    */
  val sourceCodeHash: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * A mapping of tags to assign to the object.
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * The amount of time your Lambda Function has to run in seconds. Defaults to `3`. See [Limits][5]
    */
  val timeout: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  val tracingConfig: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_ModeInput]] = js.undefined
  /**
    * Provide this to allow your function to access your VPC. Fields documented below. See [Lambda in VPC][7]
    */
  val vpcConfig: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_SecurityGroupIdsSubnetIdsVpcIdArrayInput]
  ] = js.undefined
}

