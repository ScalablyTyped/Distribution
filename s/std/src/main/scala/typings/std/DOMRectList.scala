package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMRectList extends /* index */ NumberDictionary[DOMRect] {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[DOMRect]] = js.native
  val length: Double = js.native
  def item(index: Double): DOMRect | Null = js.native
}

@JSGlobal("DOMRectList")
@js.native
class DOMRectListCls () extends DOMRectList

@JSGlobal("DOMRectList")
@js.native
object DOMRectList extends Instantiable0[DOMRectList]

