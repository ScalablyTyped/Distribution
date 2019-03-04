package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Iterable[T] extends js.Object {
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[Iterator[T]]
}

object Iterable {
  @scala.inline
  def apply[T](iterator: js.Function0[Iterator[T]]): Iterable[T] = {
    val __obj = js.Dynamic.literal(iterator = iterator)
  
    __obj.asInstanceOf[Iterable[T]]
  }
}

