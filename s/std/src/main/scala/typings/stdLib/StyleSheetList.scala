package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait StyleSheetList
  extends /* index */ ScalablyTyped.runtime.NumberDictionary[StyleSheet] {
  @JSName(ScalablyTyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[StyleSheet]]
  val length: scala.Double
  def item(index: scala.Double): StyleSheet | scala.Null
}

@JSGlobal("StyleSheetList")
@js.native
object StyleSheetList
  extends ScalablyTyped.runtime.Instantiable0[StyleSheetList]

