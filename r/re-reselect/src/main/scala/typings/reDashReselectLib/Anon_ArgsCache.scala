package typings
package reDashReselectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArgsCache[C, R, P, S, D] extends js.Object {
  var cache: reDashReselectLib.reDashReselectMod.ICacheObject = js.native
  @JSName("keySelector")
  var keySelector_Original: reDashReselectLib.reDashReselectMod.ParametricKeySelector[S, P] = js.native
  def clearCache(): scala.Unit = js.native
  def getMatchingSelector(state: S, props: P, args: js.Any*): reDashReselectLib.reDashReselectMod.OutputParametricSelector[S, P, R, C, D] = js.native
  def keySelector(state: S, props: P, args: js.Any*): js.Any = js.native
  def removeMatchingSelector(state: S, props: P, args: js.Any*): scala.Unit = js.native
}

