package typings.pulumiAws.lambdaMixinsMod

import typings.pulumiAws.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in @pulumi/aws.@pulumi/aws/utils.Diff<keyof @pulumi/aws.@pulumi/aws/lambda/function.FunctionArgs, keyof @pulumi/aws.anon.Code> ]: @pulumi/aws.@pulumi/aws/lambda/function.FunctionArgs[P]} */ @js.native
trait CallbackFunctionArgs[E, R] extends Code {
  
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
  def apply[E, R](): CallbackFunctionArgs[E, R] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallbackFunctionArgs[E, R]]
  }
  
  @scala.inline
  implicit class CallbackFunctionArgsOps[Self <: CallbackFunctionArgs[_, _], E, R] (val x: Self with (CallbackFunctionArgs[E, R])) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCallback(
      value: (E, /* context */ Context, /* callback */ js.Function2[/* error */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], Unit]) => js.Promise[R] | Unit
    ): Self = this.set("callback", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setCallbackFactory(value: () => Callback[E, R]): Self = this.set("callbackFactory", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCallbackFactory: Self = this.set("callbackFactory", js.undefined)
  }
}
