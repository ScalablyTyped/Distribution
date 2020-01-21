package typings.pulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object lambdaMixinsMod {
  type BaseCallbackFunctionArgs = typings.pulumiAws.utilsMod.Overwrite[
    typings.pulumiAws.lambdaFunctionMod.FunctionArgs, 
    typings.pulumiAws.AnonCodePathOptions
  ]
  type Callback[E, R] = js.Function3[
    /* event */ E, 
    /* context */ typings.pulumiAws.lambdaMixinsMod.Context, 
    /* callback */ js.Function2[/* error */ js.UndefOr[js.Any], /* result */ js.UndefOr[R], scala.Unit], 
    js.Promise[R] | scala.Unit
  ]
  type CallbackFactory[E, R] = js.Function0[typings.pulumiAws.lambdaMixinsMod.Callback[E, R]]
  type EventHandler[E, R] = (typings.pulumiAws.lambdaMixinsMod.Callback[E, R]) | typings.pulumiAws.lambdaFunctionMod.Function
}
