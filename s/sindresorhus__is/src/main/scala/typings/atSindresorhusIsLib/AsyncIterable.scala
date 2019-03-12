package typings
package atSindresorhusIsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncIterable[T] extends js.Object {
  @JSName(org.scalablytyped.runtime.Symbol.asyncIterator)
  var asyncIterator: js.Function0[AsyncIterator[T]]
}

object AsyncIterable {
  @scala.inline
  def apply[T](asyncIterator: () => AsyncIterator[T]): AsyncIterable[T] = {
    val __obj = js.Dynamic.literal(asyncIterator = js.Any.fromFunction0(asyncIterator))
  
    __obj.asInstanceOf[AsyncIterable[T]]
  }
}

