package typings
package reselectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reselectMod {
  type OutputParametricSelector[S, P, R, C] = (ParametricSelector[S, P, R]) with reselectLib.Anon_Recomputations[C]
  type OutputSelector[S, R, C] = (Selector[S, R]) with reselectLib.Anon_Recomputations[C]
  type ParametricSelector[S, P, R] = js.Function3[/* state */ S, /* props */ P, /* repeated */js.Any, R]
  type Selector[S, R] = js.Function1[/* state */ S, R]
}
