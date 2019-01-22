package typings
package atReduxDashSagaCoreLib.effectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CpsCallback[R] extends js.Object {
  var cancel: js.UndefOr[js.Function0[scala.Unit]] = js.native
  def apply(error: js.Any, result: R): scala.Unit = js.native
}

