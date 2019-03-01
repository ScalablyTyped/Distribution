package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncIterable[T] extends js.Object {
  @JSName(org.scalablytyped.runtime.Symbol.asyncIterator)
  var asyncIterator: js.Function0[AsyncIterator[T]]
}

object AsyncIterable {
  @scala.inline
  def apply[T](asyncIterator: js.Function0[AsyncIterator[T]]): AsyncIterable[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("asyncIterator")(asyncIterator)
    __obj.asInstanceOf[AsyncIterable[T]]
  }
}

