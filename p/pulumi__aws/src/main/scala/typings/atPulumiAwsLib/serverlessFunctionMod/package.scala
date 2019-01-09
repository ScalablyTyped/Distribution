package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object serverlessFunctionMod {
  type Context = atPulumiAwsLib.lambdaLambdaMixinsMod.Context
  type FunctionOptions = atPulumiAwsLib.utilsMod.Overwrite[
    atPulumiAwsLib.lambdaLambdaMixinsMod.CallbackFunctionArgs[js.Any, js.Any], 
    atPulumiAwsLib.Anon_ExcludePackages
  ]
  type Handler = atPulumiAwsLib.lambdaLambdaMixinsMod.Callback[js.Any, js.Any]
  type HandlerFactory = js.Function0[Handler]
}
