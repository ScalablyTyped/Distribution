package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeListOf[TNode /* <: Node */] extends NodeList {
  @JSName(js.Symbol.iterator)
  var iterator_NodeListOf: js.Function0[IterableIterator[TNode]] = js.native
}

