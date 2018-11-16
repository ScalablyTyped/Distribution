package typings
package ramdaLib.ramdaMod.RNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurriedTypeGuard4[T1, T2, T3, T4, R /* <: T4 */] extends js.Object {
  def apply(t1: T1): CurriedTypeGuard3[T2, T3, T4, R] = js.native
  def apply(t1: T1, t2: T2): CurriedTypeGuard2[T3, T4, R] = js.native
  def apply(t1: T1, t2: T2, t3: T3): js.Function1[/* t4 */ T4, /* is R */scala.Boolean] = js.native
  def apply(t1: T1, t2: T2, t3: T3, t4: T4): /* is R */scala.Boolean = js.native
}

