package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait HTMLCollectionOf[T /* <: Element */] extends HTMLCollectionBase {
  @JSName(ScalablyTyped.runtime.Symbol.iterator)
  var iterator_HTMLCollectionOf: js.Function0[IterableIterator[T]]
  def namedItem(name: java.lang.String): T | scala.Null
}

