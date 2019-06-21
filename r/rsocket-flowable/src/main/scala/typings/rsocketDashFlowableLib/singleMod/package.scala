package typings
package rsocketDashFlowableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object singleMod {
  type CancelCallback = js.Function0[js.UndefOr[scala.Nothing]]
  type Source[T] = js.Function1[/* subject */ IFutureSubject[T], js.UndefOr[scala.Nothing]]
}
