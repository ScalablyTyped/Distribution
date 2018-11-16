package typings
package ramdaLib.ramdaMod.RNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurriedFunction6[T1, T2, T3, T4, T5, T6, R] extends js.Object {
  def apply(t1: T1): CurriedFunction5[T2, T3, T4, T5, T6, R] = js.native
  def apply(t1: T1, t2: T2): CurriedFunction4[T3, T4, T5, T6, R] = js.native
  def apply(t1: T1, t2: T2, t3: T3): CurriedFunction3[T4, T5, T6, R] = js.native
  def apply(t1: T1, t2: T2, t3: T3, t4: T4): CurriedFunction2[T5, T6, R] = js.native
  def apply(t1: T1, t2: T2, t3: T3, t4: T4, t5: T5): js.Function1[/* t6 */ T6, R] = js.native
  def apply(t1: T1, t2: T2, t3: T3, t4: T4, t5: T5, t6: T6): R = js.native
}

