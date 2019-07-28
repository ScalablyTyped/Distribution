package typings.rxjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object internalObservableGenerateMod {
  type ConditionFunc[S] = js.Function1[/* state */ S, Boolean]
  type IterateFunc[S] = js.Function1[/* state */ S, S]
  type ResultFunc[S, T] = js.Function1[/* state */ S, T]
}
