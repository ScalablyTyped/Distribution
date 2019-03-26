package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMRectList
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[DOMRect] {
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[DOMRect]]
  val length: scala.Double
  def item(index: scala.Double): DOMRect | scala.Null
}

@JSGlobal("DOMRectList")
@js.native
class DOMRectListCls () extends DOMRectList {
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  override var iterator: js.Function0[IterableIterator[DOMRect]] = js.native
  /* CompleteClass */
  override val length: scala.Double = js.native
  /* CompleteClass */
  override def item(index: scala.Double): DOMRect | scala.Null = js.native
}

@JSGlobal("DOMRectList")
@js.native
object DOMRectList
  extends org.scalablytyped.runtime.Instantiable0[DOMRectList]

