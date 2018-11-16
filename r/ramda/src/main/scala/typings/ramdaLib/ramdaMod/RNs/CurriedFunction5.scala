package typings
package ramdaLib.ramdaMod.RNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurriedFunction5[T1, T2, T3, T4, T5, R] extends js.Object {
  def apply(t1: T1): CurriedFunction4[T2, T3, T4, T5, R] = js.native
  def apply(t1: T1, t2: T2): CurriedFunction3[T3, T4, T5, R] = js.native
  def apply(t1: T1, t2: T2, t3: T3): CurriedFunction2[T4, T5, R] = js.native
  def apply(t1: T1, t2: T2, t3: T3, t4: T4): js.Function1[/* t5 */ T5, R] = js.native
  def apply(t1: T1, t2: T2, t3: T3, t4: T4, t5: T5): R = js.native
}

