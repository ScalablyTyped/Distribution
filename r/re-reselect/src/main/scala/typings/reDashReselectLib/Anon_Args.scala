package typings
package reDashReselectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Args[S, R, C, D] extends js.Object {
  var cache: reDashReselectLib.reDashReselectMod.ICacheObject = js.native
  @JSName("keySelector")
  var keySelector_Original: reDashReselectLib.reDashReselectMod.KeySelector[S] = js.native
  def clearCache(): scala.Unit = js.native
  def getMatchingSelector(state: S, args: js.Any*): reDashReselectLib.reDashReselectMod.OutputSelector[S, R, C, D] = js.native
  def keySelector(state: S, args: js.Any*): js.Any = js.native
  def removeMatchingSelector(state: S, args: js.Any*): scala.Unit = js.native
}

