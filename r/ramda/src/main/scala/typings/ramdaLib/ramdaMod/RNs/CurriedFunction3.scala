package typings
package ramdaLib.ramdaMod.RNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CurriedFunction3[T1, T2, T3, R] extends js.Object {
  def apply(t1: T1): CurriedFunction2[T2, T3, R] = js.native
  def apply(t1: T1, t2: T2): js.Function1[/* t3 */ T3, R] = js.native
  def apply(t1: T1, t2: T2, t3: T3): R = js.native
}

