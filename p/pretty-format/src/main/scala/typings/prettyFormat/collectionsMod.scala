package typings.prettyFormat

import typings.prettyFormat.typesMod.Config
import typings.prettyFormat.typesMod.Printer
import typings.prettyFormat.typesMod.Refs
import typings.std.ArrayLike
import typings.std.Iterator
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pretty-format/build/collections", JSImport.Namespace)
@js.native
object collectionsMod extends js.Object {
  def printIteratorEntries(
    iterator: Iterator[_, _, js.UndefOr[scala.Nothing]],
    config: Config,
    indentation: String,
    depth: Double,
    refs: Refs,
    printer: Printer
  ): String = js.native
  def printIteratorEntries(
    iterator: Iterator[_, _, js.UndefOr[scala.Nothing]],
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
  def printListItems(
    list: ArrayLike[_],
    config: Config,
    indentation: String,
    depth: Double,
    refs: Refs,
    printer: Printer
  ): String = js.native
  def printObjectProperties(
    `val`: Record[String, _],
    config: Config,
    indentation: String,
    depth: Double,
    refs: Refs,
    printer: Printer
  ): String = js.native
}

