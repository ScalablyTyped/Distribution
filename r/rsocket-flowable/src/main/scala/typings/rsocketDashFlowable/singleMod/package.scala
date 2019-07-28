package typings.rsocketDashFlowable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object singleMod {
  type CancelCallback = js.Function0[Unit]
  type Source[T] = js.Function1[/* subject */ IFutureSubject[T], Unit]
}
