package typings
package atPulumiAwsLib.lambdaLambdaMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in @pulumi/aws.@pulumi/aws/utils.Diff<keyof @pulumi/aws.@pulumi/aws/lambda/function.FunctionArgs, keyof {  code? :never,   handler? :never,   role? :@pulumi/aws.@pulumi/aws/iam.Role,   policies? :std.Array<@pulumi/aws.@pulumi/aws/arn.ARN>,   runtime? :@pulumi/aws.@pulumi/aws/lambda/runtimes.Runtime,   codePathOptions? :@pulumi/pulumi.@pulumi/pulumi.runtime.CodePathOptions}> ]: @pulumi/aws.@pulumi/aws/lambda/function.FunctionArgs[P]}
- Lifted 6 members from Set(@pulumi/aws.@pulumi/aws/utils.Overwrite<@pulumi/aws.@pulumi/aws/lambda/function.FunctionArgs, {  code ? :never,   handler ? :never,   role ? :@pulumi/aws.@pulumi/aws/iam.Role,   policies ? :std.Array<@pulumi/aws.@pulumi/aws/arn.ARN>,   runtime ? :@pulumi/aws.@pulumi/aws/lambda/runtimes.Runtime,   codePathOptions ? :@pulumi/pulumi.@pulumi/pulumi.runtime.CodePathOptions}>) */ trait CallbackFunctionArgs[E, R] extends js.Object {
  /**
    * The Javascript callback to use as the entrypoint for the AWS Lambda out of.  Either
    * [callback] or [callbackFactory] must be provided.
    */
  var callback: js.UndefOr[Callback[E, R]] = js.undefined
  /**
    * The Javascript function instance that will be called to produce the callback function that is
    * the entrypoint for the AWS Lambda. Either [callback] or [callbackFactory] must be
    * provided.
    *
    * This form is useful when there is expensive initialization work that should only be executed
    * once.  The factory-function will be invoked once when the final AWS Lambda module is loaded.
    * It can run whatever code it needs, and will end by returning the actual function that Lambda
    * will call into each time the Lambda is invoked.
    */
  var callbackFactory: js.UndefOr[CallbackFactory[E, R]] = js.undefined
  /**
    * Not allowed when creating an aws.serverless.Function.  The [code] will be generated from the
    * passed in JavaScript callback.
    */
  var code: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * Options to control which paths/packages should be included or excluded in the zip file containing
    * the code for the AWS lambda.
    */
  var codePathOptions: js.UndefOr[atPulumiPulumiLib.runtimeClosureCodePathsMod.CodePathOptions] = js.undefined
  /**
    * Not allowed when creating an aws.serverless.Function.  The [code] will be generated from the
    * passed in JavaScript callback.
    */
  var handler: js.UndefOr[scala.Nothing] = js.undefined
  /**
    * A list of IAM policy ARNs to attach to the Function.  Will be used if [role] is not provide.
    * If neither [role] nor [policies] is provided, a default policy of [iam.AWSLambdaFullAccess]
    * will be used instead.
    */
  var policies: js.UndefOr[js.Array[atPulumiAwsLib.arnMod.ARN]] = js.undefined
  /**
    * A pre-created role to use for the Function. If not provided, [policies] will be used.
    */
  var role: js.UndefOr[atPulumiAwsLib.iamMod.Role] = js.undefined
  /**
    * The Lambda runtime to use.  If not provided, will default to [NodeJS8d10Runtime]
    */
  var runtime: js.UndefOr[atPulumiAwsLib.lambdaRuntimesMod.Runtime] = js.undefined
}

