package typings
package atReduxDashSagaCoreLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atReduxDashSagaCoreMod {
  type END = /* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias @redux-saga/core.@redux-saga/core.END */ js.Object
  type EffectMiddleware = js.Function1[
    /* next */ js.Function1[/* effect */ js.Any, scala.Unit], 
    js.Function1[/* effect */ js.Any, scala.Unit]
  ]
  type Subscribe[T] = js.Function1[/* cb */ js.Function1[/* input */ T | END, scala.Unit], Unsubscribe]
  type Unsubscribe = js.Function0[scala.Unit]
}
