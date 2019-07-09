package typings
package rsocketDashFlowableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object singleMod {
  type CancelCallback = js.Function0[scala.Unit]
  type Source[T] = js.Function1[/* subject */ IFutureSubject[T], scala.Unit]
}
