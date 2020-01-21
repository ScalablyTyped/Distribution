package typings.pulumiAws.getFunctionMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.lambda.GetFunctionDeadLetterConfig
import typings.pulumiAws.outputMod.lambda.GetFunctionEnvironment
import typings.pulumiAws.outputMod.lambda.GetFunctionTracingConfig
import typings.pulumiAws.outputMod.lambda.GetFunctionVpcConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFunctionResult extends js.Object {
  /**
    * Unqualified (no `:QUALIFIER` or `:VERSION` suffix) Amazon Resource Name (ARN) identifying your Lambda Function. See also `qualifiedArn`.
    */
  val arn: String = js.native
  /**
    * Configure the function's *dead letter queue*.
    */
  val deadLetterConfig: GetFunctionDeadLetterConfig = js.native
  /**
    * Description of what your Lambda Function does.
    */
  val description: String = js.native
  /**
    * The Lambda environment's configuration settings.
    */
  val environment: GetFunctionEnvironment = js.native
  val functionName: String = js.native
  /**
    * The function entrypoint in your code.
    */
  val handler: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * The ARN to be used for invoking Lambda Function from API Gateway.
    */
  val invokeArn: String = js.native
  /**
    * The ARN for the KMS encryption key.
    */
  val kmsKeyArn: String = js.native
  /**
    * The date this resource was last modified.
    */
  val lastModified: String = js.native
  /**
    * A list of Lambda Layer ARNs attached to your Lambda Function.
    */
  val layers: js.Array[String] = js.native
  /**
    * Amount of memory in MB your Lambda Function can use at runtime.
    */
  val memorySize: Double = js.native
  /**
    * Qualified (`:QUALIFIER` or `:VERSION` suffix) Amazon Resource Name (ARN) identifying your Lambda Function. See also `arn`.
    */
  val qualifiedArn: String = js.native
  val qualifier: js.UndefOr[String] = js.native
  /**
    * The amount of reserved concurrent executions for this lambda function or `-1` if unreserved.
    */
  val reservedConcurrentExecutions: Double = js.native
  /**
    * IAM role attached to the Lambda Function.
    */
  val role: String = js.native
  /**
    * The runtime environment for the Lambda function..
    */
  val runtime: String = js.native
  /**
    * Base64-encoded representation of raw SHA-256 sum of the zip file.
    */
  val sourceCodeHash: String = js.native
  /**
    * The size in bytes of the function .zip file.
    */
  val sourceCodeSize: Double = js.native
  val tags: StringDictionary[js.Any] = js.native
  /**
    * The function execution time at which Lambda should terminate the function.
    */
  val timeout: Double = js.native
  /**
    * Tracing settings of the function.
    */
  val tracingConfig: GetFunctionTracingConfig = js.native
  /**
    * The version of the Lambda function.
    */
  val version: String = js.native
  /**
    * VPC configuration associated with your Lambda function.
    */
  val vpcConfig: GetFunctionVpcConfig = js.native
}

object GetFunctionResult {
  @scala.inline
  def apply(
    arn: String,
    deadLetterConfig: GetFunctionDeadLetterConfig,
    description: String,
    environment: GetFunctionEnvironment,
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
    tracingConfig: GetFunctionTracingConfig,
    version: String,
    vpcConfig: GetFunctionVpcConfig,
    qualifier: String = null
  ): GetFunctionResult = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], deadLetterConfig = deadLetterConfig.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], environment = environment.asInstanceOf[js.Any], functionName = functionName.asInstanceOf[js.Any], handler = handler.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invokeArn = invokeArn.asInstanceOf[js.Any], kmsKeyArn = kmsKeyArn.asInstanceOf[js.Any], lastModified = lastModified.asInstanceOf[js.Any], layers = layers.asInstanceOf[js.Any], memorySize = memorySize.asInstanceOf[js.Any], qualifiedArn = qualifiedArn.asInstanceOf[js.Any], reservedConcurrentExecutions = reservedConcurrentExecutions.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any], sourceCodeHash = sourceCodeHash.asInstanceOf[js.Any], sourceCodeSize = sourceCodeSize.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], tracingConfig = tracingConfig.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], vpcConfig = vpcConfig.asInstanceOf[js.Any])
    if (qualifier != null) __obj.updateDynamic("qualifier")(qualifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFunctionResult]
  }
}

