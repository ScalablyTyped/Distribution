package typings.prettyDashFormat

import typings.prettyDashFormat.buildTypesMod.Config
import typings.prettyDashFormat.buildTypesMod.Printer
import typings.prettyDashFormat.buildTypesMod.Refs
import typings.std.Iterator
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pretty-format/build/collections", JSImport.Namespace)
@js.native
object buildCollectionsMod extends js.Object {
  def printIteratorEntries(iterator: js.Any, config: Config, indentation: String, depth: Double, refs: Refs, printer: Printer): String = js.native
  def printIteratorEntries(
    iterator: js.Any,
    config: Config,
    indentation: String,
    depth: Double,
    refs: Refs,
    printer: Printer,
    separator: String
  ): String = js.native
  def printIteratorValues(
    iterator: Iterator[_, _, js.UndefOr[scala.Nothing]],
    config: Config,
    indentation: String,
    depth: Double,
    refs: Refs,
    printer: Printer
  ): String = js.native
  def printListItems(list: js.Any, config: Config, indentation: String, depth: Double, refs: Refs, printer: Printer): String = js.native
  def printObjectProperties(
    `val`: Record[String, _],
    config: Config,
    indentation: String,
    depth: Double,
    refs: Refs,
    printer: Printer
  ): String = js.native
}

