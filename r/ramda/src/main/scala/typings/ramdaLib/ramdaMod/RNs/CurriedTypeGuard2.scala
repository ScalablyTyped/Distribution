package typings
package ramdaLib.ramdaMod.RNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// @see https://gist.github.com/donnut/fd56232da58d25ceecf1, comment by @albrow
@js.native
trait CurriedTypeGuard2[T1, T2, R /* <: T2 */] extends js.Object {
  def apply(t1: T1): js.Function1[/* t2 */ T2, /* is R */ scala.Boolean] = js.native
  def apply(t1: T1, t2: T2): /* is R */ scala.Boolean = js.native
}

