package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TouchList
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[Touch] {
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[Touch]]
  val length: scala.Double
  def item(index: scala.Double): Touch | scala.Null
}

@JSGlobal("TouchList")
@js.native
object TouchList
  extends org.scalablytyped.runtime.Instantiable0[TouchList]

