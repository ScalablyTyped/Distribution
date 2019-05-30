package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A list of StyleSheet. */
@js.native
trait StyleSheetList
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[StyleSheet] {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[StyleSheet]] = js.native
  val length: scala.Double = js.native
  def item(index: scala.Double): StyleSheet | scala.Null = js.native
}

@JSGlobal("StyleSheetList")
@js.native
class StyleSheetListCls () extends StyleSheetList

@JSGlobal("StyleSheetList")
@js.native
object StyleSheetList
  extends org.scalablytyped.runtime.Instantiable0[StyleSheetList]

