package typings
package rsocketDashFlowableLib.singleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFutureSubject[T] extends js.Object {
  def onComplete(value: T): scala.Unit = js.native
  def onError(error: stdLib.Error): scala.Unit = js.native
  def onSubscribe(): scala.Unit = js.native
  def onSubscribe(cancel: CancelCallback): scala.Unit = js.native
}

