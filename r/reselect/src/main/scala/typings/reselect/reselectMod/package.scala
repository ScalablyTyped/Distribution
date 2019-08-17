package typings.reselect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reselectMod {
  import typings.reselect.Anon_Recomputations

  type OutputParametricSelector[S, P, R, C] = (ParametricSelector[S, P, R]) with Anon_Recomputations[C]
  type OutputSelector[S, R, C] = (Selector[S, R]) with Anon_Recomputations[C]
  type ParametricSelector[S, P, R] = js.Function3[/* state */ S, /* props */ P, /* repeated */ js.Any, R]
  type Selector[S, R] = js.Function1[/* state */ S, R]
}
