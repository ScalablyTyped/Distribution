package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object serverlessFunctionMod {
  import typings.atPulumiAws.Anon_ExcludePackages
  import typings.atPulumiAws.lambdaLambdaMixinsMod.Callback
  import typings.atPulumiAws.lambdaLambdaMixinsMod.CallbackFunctionArgs
  import typings.atPulumiAws.utilsMod.Overwrite

  type Context = typings.atPulumiAws.lambdaLambdaMixinsMod.Context
  type FunctionOptions = Overwrite[CallbackFunctionArgs[js.Any, js.Any], Anon_ExcludePackages]
  type Handler = Callback[js.Any, js.Any]
  type HandlerFactory = js.Function0[Handler]
}
