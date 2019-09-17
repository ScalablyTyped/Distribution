package typings.atReduxDashSagaCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type END = /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @redux-saga/core.@redux-saga/core/types.END */ js.Object
  type EffectMiddleware = js.Function1[
    /* next */ js.Function1[/* effect */ js.Any, Unit], 
    js.Function1[/* effect */ js.Any, Unit]
  ]
  type Subscribe[T] = js.Function1[/* cb */ js.Function1[/* input */ T | END, Unit], Unsubscribe]
  type Unsubscribe = js.Function0[Unit]
}
