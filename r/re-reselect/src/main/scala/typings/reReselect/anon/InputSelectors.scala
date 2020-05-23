package typings.reReselect.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InputSelectors[D, C, S] extends js.Object {
  var inputSelectors: D = js.native
  @JSName("keySelector")
  var keySelector_Original: typings.reReselect.mod.KeySelector[S] = js.native
  var resultFunc: C = js.native
  def keySelector(state: S, args: js.Any*): js.Any = js.native
}

