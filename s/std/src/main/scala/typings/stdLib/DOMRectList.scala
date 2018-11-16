package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DOMRectList
  extends /* index */ ScalablyTyped.runtime.NumberDictionary[DOMRect] {
  @JSName(ScalablyTyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[DOMRect]]
  val length: scala.Double
  def item(index: scala.Double): DOMRect | scala.Null
}

@JSGlobal("DOMRectList")
@js.native
object DOMRectList
  extends ScalablyTyped.runtime.Instantiable0[DOMRectList]

