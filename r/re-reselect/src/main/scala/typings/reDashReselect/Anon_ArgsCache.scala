package typings.reDashReselect

import typings.reDashReselect.reDashReselectMod.ICacheObject
import typings.reDashReselect.reDashReselectMod.OutputParametricSelector
import typings.reDashReselect.reDashReselectMod.ParametricKeySelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ArgsCache[S, P, R, C, D] extends js.Object {
  var cache: ICacheObject = js.native
  @JSName("keySelector")
  var keySelector_Original: ParametricKeySelector[S, P] = js.native
  def clearCache(): Unit = js.native
  def getMatchingSelector(state: S, props: P, args: js.Any*): OutputParametricSelector[S, P, R, C, D] = js.native
  def keySelector(state: S, props: P, args: js.Any*): js.Any = js.native
  def removeMatchingSelector(state: S, props: P, args: js.Any*): Unit = js.native
}

