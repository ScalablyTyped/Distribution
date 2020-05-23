package typings.reReselect.anon

import typings.reReselect.mod.ICacheObject
import typings.reReselect.mod.OutputSelector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cache[S, R, C, D] extends js.Object {
  var cache: ICacheObject = js.native
  @JSName("keySelector")
  var keySelector_Original: typings.reReselect.mod.KeySelector[S] = js.native
  def clearCache(): Unit = js.native
  def getMatchingSelector(state: S, args: js.Any*): OutputSelector[S, R, C, D] = js.native
  def keySelector(state: S, args: js.Any*): js.Any = js.native
  def removeMatchingSelector(state: S, args: js.Any*): Unit = js.native
}

