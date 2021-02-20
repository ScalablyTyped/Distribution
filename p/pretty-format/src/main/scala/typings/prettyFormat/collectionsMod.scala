package typings.prettyFormat

import typings.prettyFormat.typesMod.Config
import typings.prettyFormat.typesMod.Printer
import typings.prettyFormat.typesMod.Refs
import typings.std.ArrayLike
import typings.std.Iterator
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collectionsMod {
  
  @JSImport("pretty-format/build/collections", "printIteratorEntries")
  @js.native
  def printIteratorEntries(
    iterator: Iterator[js.Tuple2[_, _], _, js.UndefOr[scala.Nothing]],
    config: Config,
    indentation: String,
    depth: Double,
    refs: Refs,
    printer: Printer
  ): String = js.native
  @JSImport("pretty-format/build/collections", "printIteratorEntries")
  @js.native
  def printIteratorEntries(
    iterator: Iterator[js.Tuple2[_, _], _, js.UndefOr[scala.Nothing]],
    config: Config,
    indentation: String,
    depth: Double,
    refs: Refs,
    printer: Printer,
    separator: String
  ): String = js.native
  
  @JSImport("pretty-format/build/collections", "printIteratorValues")
  @js.native
  def printIteratorValues(
    iterator: Iterator[_, _, js.UndefOr[scala.Nothing]],
    config: Config,
    indentation: String,
    depth: Double,
    refs: Refs,
    printer: Printer
  ): String = js.native
  
  @JSImport("pretty-format/build/collections", "printListItems")
  @js.native
  def printListItems(
    list: ArrayLike[_],
    config: Config,
    indentation: String,
    depth: Double,
    refs: Refs,
    printer: Printer
  ): String = js.native
  
  @JSImport("pretty-format/build/collections", "printObjectProperties")
  @js.native
  def printObjectProperties(
    `val`: Record[String, _],
    config: Config,
    indentation: String,
    depth: Double,
    refs: Refs,
    printer: Printer
  ): String = js.native
}
