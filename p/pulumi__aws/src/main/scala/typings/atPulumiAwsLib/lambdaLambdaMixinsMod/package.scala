package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lambdaLambdaMixinsMod {
  type BaseCallbackFunctionArgs = atPulumiAwsLib.utilsMod.Overwrite[atPulumiAwsLib.lambdaFunctionMod.FunctionArgs, atPulumiAwsLib.Anon_Role]
  type Callback[E, R] = js.Function3[
    /* event */ E, 
    /* context */ Context, 
    /* callback */ js.Function2[/* error */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], scala.Unit], 
    js.Promise[R] | scala.Unit
  ]
  type CallbackFactory[E, R] = js.Function0[Callback[E, R]]
  type EventHandler[E, R] = (Callback[E, R]) | atPulumiAwsLib.lambdaLambdaMixinsMod.lambdaFunctionMod.Function
}
