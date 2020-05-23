package typings.std

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HTMLCollectionOf[T /* <: Element */] extends /* n */ NumberDictionary[T] {
  @JSName(js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[T]] = js.native
  def item(index: Double): T | Null = js.native
  def namedItem(name: java.lang.String): T | Null = js.native
}

