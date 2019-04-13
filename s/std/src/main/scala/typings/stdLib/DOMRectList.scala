package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DOMRectList
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[DOMRect] {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[DOMRect]] = js.native
  val length: scala.Double = js.native
  def item(index: scala.Double): DOMRect | scala.Null = js.native
}

@JSGlobal("DOMRectList")
@js.native
class DOMRectListCls () extends DOMRectList

@JSGlobal("DOMRectList")
@js.native
object DOMRectList
  extends org.scalablytyped.runtime.Instantiable0[DOMRectList]

