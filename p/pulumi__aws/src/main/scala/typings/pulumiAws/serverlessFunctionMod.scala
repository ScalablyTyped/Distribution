package typings.pulumiAws

import typings.pulumiAws.anon.ExcludePackages
import typings.pulumiAws.iamMod.Role
import typings.pulumiAws.lambdaMixinsMod.Callback
import typings.pulumiAws.lambdaMixinsMod.CallbackFunctionArgs
import typings.pulumiAws.utilsMod.Overwrite
import typings.pulumiPulumi.mod.ComponentResource
import typings.pulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/serverless/function", JSImport.Namespace)
@js.native
object serverlessFunctionMod extends js.Object {
  @js.native
  class Function protected ()
    extends ComponentResource[js.Any] {
    /**
      * @param func Deprecated.  Pass the function as [options.func] or [options.factoryFunc] instead.
      */
    def this(name: String, options: FunctionOptions) = this()
    def this(name: String, options: FunctionOptions, func: Handler) = this()
    def this(name: String, options: FunctionOptions, func: js.UndefOr[scala.Nothing], opts: ResourceOptions) = this()
    def this(name: String, options: FunctionOptions, func: Handler, opts: ResourceOptions) = this()
    val lambda: typings.pulumiAws.lambdaMod.Function = js.native
    val options: FunctionOptions = js.native
    val role: js.UndefOr[Role] = js.native
  }
  
  type Context = typings.pulumiAws.lambdaMixinsMod.Context
  type FunctionOptions = Overwrite[CallbackFunctionArgs[js.Any, js.Any], ExcludePackages]
  type Handler = Callback[js.Any, js.Any]
  type HandlerFactory = js.Function0[Handler]
}

