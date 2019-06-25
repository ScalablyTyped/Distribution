package typings
package ramdaLib.ramdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssocPartialOne[K /* <: java.lang.String */] extends js.Object {
  def apply[T](`val`: T): js.Function1[/* obj */ js.Any, (stdLib.Record[K, T]) with js.Any] = js.native
  def apply[T, U](`val`: T, obj: U): (stdLib.Record[K, T]) with U = js.native
}

