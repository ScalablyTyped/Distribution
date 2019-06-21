package typings
package rsocketDashFlowableLib.singleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Single[T] extends js.Object {
  def flatMap[R](fn: js.Function1[/* data */ T, Single[R]]): Single[R] = js.native
  /**
    * Return a new Single that resolves to the value of this Single applied to
    * the given mapping function.
    */
  def map[R](fn: js.Function1[/* data */ T, R]): Single[R] = js.native
  def subscribe(): scala.Unit = js.native
  def subscribe(partialSubscriber: stdLib.Partial[IFutureSubscriber[T]]): scala.Unit = js.native
  def `then`(): scala.Unit = js.native
  def `then`(successFn: js.Function1[/* data */ T, scala.Unit]): scala.Unit = js.native
  def `then`(
    successFn: js.Function1[/* data */ T, scala.Unit],
    errorFn: js.Function1[/* error */ stdLib.Error, scala.Unit]
  ): scala.Unit = js.native
}

