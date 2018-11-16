package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TouchList
  extends /* index */ ScalablyTyped.runtime.NumberDictionary[Touch] {
  @JSName(ScalablyTyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Touch]]
  val length: scala.Double
  def item(index: scala.Double): Touch | scala.Null
}

@JSGlobal("TouchList")
@js.native
object TouchList
  extends ScalablyTyped.runtime.Instantiable0[TouchList]

