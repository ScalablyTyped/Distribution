package typings.atPulumiAws.lambdaLambdaMixinsMod

import typings.atPulumiAws.Anon_CodePathOptions
import typings.atPulumiAws.arnMod.ARN
import typings.atPulumiAws.iamMod.Role
import typings.atPulumiAws.lambdaRuntimesMod.Runtime
import typings.atPulumiPulumi.runtimeClosureCodePathsMod.CodePathOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in @pulumi/aws.@pulumi/aws/utils.Diff<keyof @pulumi/aws.@pulumi/aws/lambda/function.FunctionArgs, keyof @pulumi/aws.Anon_CodePathOptions> ]: @pulumi/aws.@pulumi/aws/lambda/function.FunctionArgs[P]} */ @js.native
trait CallbackFunctionArgs[E, R] extends Anon_CodePathOptions {
  /**
    * The Javascript callback to use as the entrypoint for the AWS Lambda out of.  Either
    * [callback] or [callbackFactory] must be provided.
    */
  var callback: js.UndefOr[Callback[E, R]] = js.native
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
  var callbackFactory: js.UndefOr[CallbackFactory[E, R]] = js.native
}

object CallbackFunctionArgs {
  @scala.inline
  def apply[E, R](
    callback: (E, /* context */ Context, /* callback */ js.Function2[/* error */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], Unit]) => js.Promise[R] | Unit = null,
    callbackFactory: () => Callback[E, R] = null,
    codePathOptions: CodePathOptions = null,
    policies: js.Array[ARN] = null,
    role: Role = null,
    runtime: Runtime = null
  ): CallbackFunctionArgs[E, R] = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction3(callback))
    if (callbackFactory != null) __obj.updateDynamic("callbackFactory")(js.Any.fromFunction0(callbackFactory))
    if (codePathOptions != null) __obj.updateDynamic("codePathOptions")(codePathOptions.asInstanceOf[js.Any])
    if (policies != null) __obj.updateDynamic("policies")(policies.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    if (runtime != null) __obj.updateDynamic("runtime")(runtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbackFunctionArgs[E, R]]
  }
}

