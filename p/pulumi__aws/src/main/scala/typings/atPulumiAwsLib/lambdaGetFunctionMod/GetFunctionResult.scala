package typings
package atPulumiAwsLib.lambdaGetFunctionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFunctionResult extends js.Object {
  /**
    * The Amazon Resource Name (ARN) identifying your Lambda Function.
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
  val environment: atPulumiAwsLib.Anon_Variables
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
    * Amount of memory in MB your Lambda Function can use at runtime.
    */
  val memorySize: scala.Double
  /**
    * The Amazon Resource Name (ARN) identifying your Lambda Function Version
    */
  val qualifiedArn: java.lang.String
  /**
    * The amount of reserved concurrent executions for this lambda function.
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
  val vpcConfig: atPulumiAwsLib.Anon_VpcIdSecurityGroupIds
}

