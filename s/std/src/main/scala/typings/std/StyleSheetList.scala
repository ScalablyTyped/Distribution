package typings.std

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A list of StyleSheet. */
@js.native
trait StyleSheetList extends /* index */ NumberDictionary[StyleSheet] {
  @JSName(scala.scalajs.js.Symbol.iterator)
  var iterator: js.Function0[IterableIterator[StyleSheet]] = js.native
  val length: Double = js.native
  def item(index: Double): StyleSheet | Null = js.native
}

@JSGlobal("StyleSheetList")
@js.native
object StyleSheetList extends Instantiable0[StyleSheetList]

