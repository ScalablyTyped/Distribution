package typings.atPulumiAws

import typings.atPulumiAws.iamMod.Role
import typings.atPulumiAws.lambdaLambdaMixinsMod.Callback
import typings.atPulumiAws.lambdaLambdaMixinsMod.CallbackFunctionArgs
import typings.atPulumiAws.serverlessFunctionMod.FunctionOptions
import typings.atPulumiAws.serverlessFunctionMod.Handler
import typings.atPulumiAws.utilsMod.Overwrite
import typings.atPulumiPulumi.atPulumiPulumiMod.ComponentResource
import typings.atPulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/serverless/function", JSImport.Namespace)
@js.native
object serverlessFunctionMod extends js.Object {
  @js.native
  class Function protected () extends ComponentResource {
    /**
      * @param func Deprecated.  Pass the function as [options.func] or [options.factoryFunc] instead.
      */
    def this(name: String, options: FunctionOptions) = this()
    def this(name: String, options: FunctionOptions, func: Handler) = this()
    def this(name: String, options: FunctionOptions, func: Handler, opts: ResourceOptions) = this()
    val lambda: typings.atPulumiAws.lambdaMod.Function = js.native
    val options: FunctionOptions = js.native
    val role: js.UndefOr[Role] = js.native
  }
  
  type Context = typings.atPulumiAws.lambdaLambdaMixinsMod.Context
  type FunctionOptions = Overwrite[CallbackFunctionArgs[js.Any, js.Any], Anon_ExcludePackages]
  type Handler = Callback[js.Any, js.Any]
  type HandlerFactory = js.Function0[Handler]
}

