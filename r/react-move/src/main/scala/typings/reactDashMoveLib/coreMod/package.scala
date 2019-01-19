package typings
package reactDashMoveLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object coreMod {
  type CustomInterpolator = js.Function1[/* t */ scala.Double, js.Any]
  type PlainObjectFunction = js.Function0[PlainObject]
  type TransitionFunction = js.Function0[Transition | js.Array[Transition]]
}
