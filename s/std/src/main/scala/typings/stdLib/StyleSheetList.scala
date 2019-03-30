package typings
package stdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The StyleSheetList interface represents a list of StyleSheet. */
trait StyleSheetList
  extends /* index */ org.scalablytyped.runtime.NumberDictionary[StyleSheet] {
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[StyleSheet]]
  val length: scala.Double
  def item(index: scala.Double): StyleSheet | scala.Null
}

@JSGlobal("StyleSheetList")
@js.native
class StyleSheetListCls () extends StyleSheetList {
  /* CompleteClass */
  @JSName(org.scalablytyped.runtime.Symbol.iterator)
  override var iterator: js.Function0[IterableIterator[StyleSheet]] = js.native
  /* CompleteClass */
  override val length: scala.Double = js.native
  /* CompleteClass */
  override def item(index: scala.Double): StyleSheet | scala.Null = js.native
}

@JSGlobal("StyleSheetList")
@js.native
object StyleSheetList
  extends org.scalablytyped.runtime.Instantiable0[StyleSheetList]

