package typings.signals.signalsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SignalBinding[T] extends js.Object {
  var active: Boolean = js.native
  var context: js.Any = js.native
  var params: js.Any = js.native
  def detach(): js.Function = js.native
  def execute(): js.Any = js.native
  def execute(paramsArr: js.Array[_]): js.Any = js.native
  def getListener(): js.Function1[/* repeated */ T, Unit] = js.native
  def getSignal(): Signal[T] = js.native
  def isBound(): Boolean = js.native
  def isOnce(): Boolean = js.native
}

