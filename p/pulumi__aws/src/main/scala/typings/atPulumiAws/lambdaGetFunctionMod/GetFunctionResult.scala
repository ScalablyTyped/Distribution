package typings.atPulumiAws.lambdaGetFunctionMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_KeyVariablesString
import typings.atPulumiAws.Anon_Mode
import typings.atPulumiAws.Anon_SecurityGroupIdsSubnetIds
import typings.atPulumiAws.Anon_TargetArn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFunctionResult extends js.Object {
  /**
    * Unqualified (no `:QUALIFIER` or `:VERSION` suffix) Amazon Resource Name (ARN) identifying your Lambda Function. See also `qualified_arn`.
    */
  val arn: String
  /**
    * Configure the function's *dead letter queue*.
    */
  val deadLetterConfig: Anon_TargetArn
  /**
    * Description of what your Lambda Function does.
    */
  val description: String
  /**
    * The Lambda environment's configuration settings.
    */
  val environment: Anon_KeyVariablesString
  val functionName: String
  /**
    * The function entrypoint in your code.
    */
  val handler: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * The ARN to be used for invoking Lambda Function from API Gateway.
    */
  val invokeArn: String
  /**
    * The ARN for the KMS encryption key.
    */
  val kmsKeyArn: String
  /**
    * The date this resource was last modified.
    */
  val lastModified: String
  /**
    * A list of Lambda Layer ARNs attached to your Lambda Function.
    */
  val layers: js.Array[String]
  /**
    * Amount of memory in MB your Lambda Function can use at runtime.
    */
  val memorySize: Double
  /**
    * Qualified (`:QUALIFIER` or `:VERSION` suffix) Amazon Resource Name (ARN) identifying your Lambda Function. See also `arn`.
    */
  val qualifiedArn: String
  val qualifier: js.UndefOr[String] = js.undefined
  /**
    * The amount of reserved concurrent executions for this lambda function or `-1` if unreserved.
    */
  val reservedConcurrentExecutions: Double
  /**
    * IAM role attached to the Lambda Function.
    */
  val role: String
  /**
    * The runtime environment for the Lambda function..
    */
  val runtime: String
  /**
    * Base64-encoded representation of raw SHA-256 sum of the zip file.
    */
  val sourceCodeHash: String
  /**
    * The size in bytes of the function .zip file.
    */
  val sourceCodeSize: Double
  val tags: StringDictionary[js.Any]
  /**
    * The function execution time at which Lambda should terminate the function.
    */
  val timeout: Double
  /**
    * Tracing settings of the function.
    */
  val tracingConfig: Anon_Mode
  /**
    * The version of the Lambda function.
    */
  val version: String
  /**
    * VPC configuration associated with your Lambda function.
    */
  val vpcConfig: Anon_SecurityGroupIdsSubnetIds
}

object GetFunctionResult {
  @scala.inline
  def apply(
    arn: String,
    deadLetterConfig: Anon_TargetArn,
    description: String,
    environment: Anon_KeyVariablesString,
    functionName: String,
    handler: String,
    id: String,
    invokeArn: String,
    kmsKeyArn: String,
    lastModified: String,
    layers: js.Array[String],
    memorySize: Double,
    qualifiedArn: String,
    reservedConcurrentExecutions: Double,
    role: String,
    runtime: String,
    sourceCodeHash: String,
    sourceCodeSize: Double,
    tags: StringDictionary[js.Any],
    timeout: Double,
    tracingConfig: Anon_Mode,
    version: String,
    vpcConfig: Anon_SecurityGroupIdsSubnetIds,
    qualifier: String = null
  ): GetFunctionResult = {
    val __obj = js.Dynamic.literal(arn = arn, deadLetterConfig = deadLetterConfig, description = description, environment = environment, functionName = functionName, handler = handler, id = id, invokeArn = invokeArn, kmsKeyArn = kmsKeyArn, lastModified = lastModified, layers = layers, memorySize = memorySize, qualifiedArn = qualifiedArn, reservedConcurrentExecutions = reservedConcurrentExecutions, role = role, runtime = runtime, sourceCodeHash = sourceCodeHash, sourceCodeSize = sourceCodeSize, tags = tags, timeout = timeout, tracingConfig = tracingConfig, version = version, vpcConfig = vpcConfig)
    if (qualifier != null) __obj.updateDynamic("qualifier")(qualifier)
    __obj.asInstanceOf[GetFunctionResult]
  }
}

