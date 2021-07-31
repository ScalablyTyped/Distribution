package typings.prettyFormat

import typings.prettyFormat.typesMod.Config
import typings.prettyFormat.typesMod.Printer
import typings.prettyFormat.typesMod.Refs
import typings.std.ArrayLike
import typings.std.Iterator
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collectionsMod {
  
  @JSImport("pretty-format/build/collections", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def printIteratorEntries(
    iterator: Iterator[js.Tuple2[js.Any, js.Any], js.Any, Unit],
    config: Config,
    indentation: String,
    depth: Double,
    refs: Refs,
    printer: Printer
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printIteratorEntries")(iterator.asInstanceOf[js.Any], config.asInstanceOf[js.Any], indentation.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], refs.asInstanceOf[js.Any], printer.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def printIteratorEntries(
    iterator: Iterator[js.Tuple2[js.Any, js.Any], js.Any, Unit],
    config: Config,
    indentation: String,
    depth: Double,
    refs: Refs,
    printer: Printer,
    separator: String
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printIteratorEntries")(iterator.asInstanceOf[js.Any], config.asInstanceOf[js.Any], indentation.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], refs.asInstanceOf[js.Any], printer.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def printIteratorValues(
    iterator: Iterator[js.Any, js.Any, Unit],
    config: Config,
    indentation: String,
    depth: Double,
    refs: Refs,
    printer: Printer
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printIteratorValues")(iterator.asInstanceOf[js.Any], config.asInstanceOf[js.Any], indentation.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], refs.asInstanceOf[js.Any], printer.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def printListItems(
    list: ArrayLike[js.Any],
    config: Config,
    indentation: String,
    depth: Double,
    refs: Refs,
    printer: Printer
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printListItems")(list.asInstanceOf[js.Any], config.asInstanceOf[js.Any], indentation.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], refs.asInstanceOf[js.Any], printer.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def printObjectProperties(
    `val`: Record[String, js.Any],
    config: Config,
    indentation: String,
    depth: Double,
    refs: Refs,
    printer: Printer
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printObjectProperties")(`val`.asInstanceOf[js.Any], config.asInstanceOf[js.Any], indentation.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], refs.asInstanceOf[js.Any], printer.asInstanceOf[js.Any])).asInstanceOf[String]
}
