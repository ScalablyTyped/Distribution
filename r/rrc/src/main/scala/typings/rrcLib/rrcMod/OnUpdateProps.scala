package typings
package rrcLib.rrcMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnUpdateProps extends js.Object {
  @JSName("call")
  var call_Original: OnUpdateCall = js.native
  var immediate: js.UndefOr[scala.Boolean] = js.native
  def call(location: historyLib.historyMod.Location[historyLib.historyMod.LocationState]): scala.Unit = js.native
}

