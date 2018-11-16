package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ClientRectList
  extends /* index */ ScalablyTyped.runtime.NumberDictionary[ClientRect] {
  @JSName(ScalablyTyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[ClientRect]]
  val length: scala.Double
  def item(index: scala.Double): ClientRect
}

@JSGlobal("ClientRectList")
@js.native
object ClientRectList
  extends ScalablyTyped.runtime.Instantiable0[ClientRectList]

