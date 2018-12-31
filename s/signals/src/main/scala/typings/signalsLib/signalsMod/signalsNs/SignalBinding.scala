package typings
package signalsLib.signalsMod.signalsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignalBinding[T] extends js.Object {
  var active: scala.Boolean = js.native
  var context: js.Any = js.native
  var params: js.Any = js.native
  def detach(): js.Function = js.native
  def execute(): js.Any = js.native
  def execute(paramsArr: js.Array[_]): js.Any = js.native
  def getListener(): js.Function1[/* repeated */ T, scala.Unit] = js.native
  def getSignal(): Signal[T] = js.native
  def isBound(): scala.Boolean = js.native
  def isOnce(): scala.Boolean = js.native
}

