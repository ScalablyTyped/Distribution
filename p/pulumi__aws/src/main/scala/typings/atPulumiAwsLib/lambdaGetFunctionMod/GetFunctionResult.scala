package typings
package atPulumiAwsLib.lambdaGetFunctionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFunctionResult extends js.Object {
  /**
    * Unqualified (no `:QUALIFIER` or `:VERSION` suffix) Amazon Resource Name (ARN) identifying your Lambda Function. See also `qualified_arn`.
    */
  val arn: java.lang.String
  /**
    * Configure the function's *dead letter queue*.
    */
  val deadLetterConfig: atPulumiAwsLib.Anon_TargetArn
  /**
    * Description of what your Lambda Function does.
    */
  val description: java.lang.String
  /**
    * The Lambda environment's configuration settings.
    */
  val environment: atPulumiAwsLib.Anon_KeyVariablesString
  val functionName: java.lang.String
  /**
    * The function entrypoint in your code.
    */
  val handler: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  /**
    * The ARN to be used for invoking Lambda Function from API Gateway.
    */
  val invokeArn: java.lang.String
  /**
    * The ARN for the KMS encryption key.
    */
  val kmsKeyArn: java.lang.String
  /**
    * The date this resource was last modified.
    */
  val lastModified: java.lang.String
  /**
    * A list of Lambda Layer ARNs attached to your Lambda Function.
    */
  val layers: js.Array[java.lang.String]
  /**
    * Amount of memory in MB your Lambda Function can use at runtime.
    */
  val memorySize: scala.Double
  /**
    * Qualified (`:QUALIFIER` or `:VERSION` suffix) Amazon Resource Name (ARN) identifying your Lambda Function. See also `arn`.
    */
  val qualifiedArn: java.lang.String
  val qualifier: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The amount of reserved concurrent executions for this lambda function or `-1` if unreserved.
    */
  val reservedConcurrentExecutions: scala.Double
  /**
    * IAM role attached to the Lambda Function.
    */
  val role: java.lang.String
  /**
    * The runtime environment for the Lambda function..
    */
  val runtime: java.lang.String
  /**
    * Base64-encoded representation of raw SHA-256 sum of the zip file.
    */
  val sourceCodeHash: java.lang.String
  /**
    * The size in bytes of the function .zip file.
    */
  val sourceCodeSize: scala.Double
  val tags: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * The function execution time at which Lambda should terminate the function.
    */
  val timeout: scala.Double
  /**
    * Tracing settings of the function.
    */
  val tracingConfig: atPulumiAwsLib.Anon_Mode
  /**
    * The version of the Lambda function.
    */
  val version: java.lang.String
  /**
    * VPC configuration associated with your Lambda function.
    */
  val vpcConfig: atPulumiAwsLib.Anon_SecurityGroupIdsSubnetIds
}

object GetFunctionResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    deadLetterConfig: atPulumiAwsLib.Anon_TargetArn,
    description: java.lang.String,
    environment: atPulumiAwsLib.Anon_KeyVariablesString,
    functionName: java.lang.String,
    handler: java.lang.String,
    id: java.lang.String,
    invokeArn: java.lang.String,
    kmsKeyArn: java.lang.String,
    lastModified: java.lang.String,
    layers: js.Array[java.lang.String],
    memorySize: scala.Double,
    qualifiedArn: java.lang.String,
    reservedConcurrentExecutions: scala.Double,
    role: java.lang.String,
    runtime: java.lang.String,
    sourceCodeHash: java.lang.String,
    sourceCodeSize: scala.Double,
    tags: org.scalablytyped.runtime.StringDictionary[js.Any],
    timeout: scala.Double,
    tracingConfig: atPulumiAwsLib.Anon_Mode,
    version: java.lang.String,
    vpcConfig: atPulumiAwsLib.Anon_SecurityGroupIdsSubnetIds,
    qualifier: java.lang.String = null
  ): GetFunctionResult = {
    val __obj = js.Dynamic.literal(arn = arn, deadLetterConfig = deadLetterConfig, description = description, environment = environment, functionName = functionName, handler = handler, id = id, invokeArn = invokeArn, kmsKeyArn = kmsKeyArn, lastModified = lastModified, layers = layers, memorySize = memorySize, qualifiedArn = qualifiedArn, reservedConcurrentExecutions = reservedConcurrentExecutions, role = role, runtime = runtime, sourceCodeHash = sourceCodeHash, sourceCodeSize = sourceCodeSize, tags = tags, timeout = timeout, tracingConfig = tracingConfig, version = version, vpcConfig = vpcConfig)
    if (qualifier != null) __obj.updateDynamic("qualifier")(qualifier)
    __obj.asInstanceOf[GetFunctionResult]
  }
}

