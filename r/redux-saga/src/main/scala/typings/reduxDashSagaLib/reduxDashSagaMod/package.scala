package typings
package reduxDashSagaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reduxDashSagaMod {
  type Emit[T] = js.Function1[/* input */ T, scala.Unit]
  type Logger = js.Function2[/* level */ java.lang.String, /* repeated */ js.Any, scala.Unit]
  type Predicate[T] = js.Function1[/* arg */ T, scala.Boolean]
  type SagaIterator = nodeLib.IterableIterator[
    reduxDashSagaLib.effectsMod.Effect | js.Array[reduxDashSagaLib.effectsMod.Effect]
  ]
}
