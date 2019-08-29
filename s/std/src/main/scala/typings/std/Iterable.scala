package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Iterable[T] extends js.Object {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[Iterator[T, _, js.UndefOr[scala.Nothing]]] = js.native
}

