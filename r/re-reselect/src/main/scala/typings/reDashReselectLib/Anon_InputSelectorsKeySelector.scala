package typings
package reDashReselectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_InputSelectorsKeySelector[D, C, S, P] extends js.Object {
  var inputSelectors: D = js.native
  @JSName("keySelector")
  var keySelector_Original: reDashReselectLib.reDashReselectMod.ParametricKeySelector[S, P] = js.native
  var resultFunc: C = js.native
  def keySelector(state: S, props: P, args: js.Any*): js.Any = js.native
}

