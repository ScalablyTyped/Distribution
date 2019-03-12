package typings
package ramdaLib.ramdaMod.RNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Functor[T] extends js.Object {
  def map[U](fn: js.Function1[/* t */ T, U]): Functor[U]
}

object Functor {
  @scala.inline
  def apply[T](map: js.Function1[/* t */ T, js.Any] => Functor[js.Any]): Functor[T] = {
    val __obj = js.Dynamic.literal(map = js.Any.fromFunction1(map))
  
    __obj.asInstanceOf[Functor[T]]
  }
}

