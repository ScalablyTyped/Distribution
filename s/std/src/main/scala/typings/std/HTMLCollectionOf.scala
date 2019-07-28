package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLCollectionOf[T /* <: Element */] extends HTMLCollectionBase {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator_HTMLCollectionOf: js.Function0[IterableIterator[T]] = js.native
  def namedItem(name: java.lang.String): T | Null = js.native
}

