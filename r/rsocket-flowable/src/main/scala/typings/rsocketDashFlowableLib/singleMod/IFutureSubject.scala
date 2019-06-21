package typings
package rsocketDashFlowableLib.singleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFutureSubject[T] extends js.Object {
  def onComplete(value: T): js.UndefOr[scala.Nothing] = js.native
  def onError(error: stdLib.Error): js.UndefOr[scala.Nothing] = js.native
  def onSubscribe(): js.UndefOr[scala.Nothing] = js.native
  def onSubscribe(cancel: CancelCallback): js.UndefOr[scala.Nothing] = js.native
}

