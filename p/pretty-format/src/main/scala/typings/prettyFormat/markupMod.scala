package typings.prettyFormat

import typings.prettyFormat.typesMod.Config
import typings.prettyFormat.typesMod.Printer
import typings.prettyFormat.typesMod.Refs
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object markupMod {
  
  @JSImport("pretty-format/build/plugins/lib/markup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def printChildren(
    children: js.Array[js.Any],
    config: Config,
    indentation: String,
    depth: Double,
    refs: Refs,
    printer: Printer
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printChildren")(children.asInstanceOf[js.Any], config.asInstanceOf[js.Any], indentation.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], refs.asInstanceOf[js.Any], printer.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def printComment(comment: String, config: Config): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printComment")(comment.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def printElement(`type`: String, printedProps: String, printedChildren: String, config: Config, indentation: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printElement")(`type`.asInstanceOf[js.Any], printedProps.asInstanceOf[js.Any], printedChildren.asInstanceOf[js.Any], config.asInstanceOf[js.Any], indentation.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def printElementAsLeaf(`type`: String, config: Config): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printElementAsLeaf")(`type`.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def printProps(
    keys: js.Array[String],
    props: Record[String, js.Any],
    config: Config,
    indentation: String,
    depth: Double,
    refs: Refs,
    printer: Printer
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printProps")(keys.asInstanceOf[js.Any], props.asInstanceOf[js.Any], config.asInstanceOf[js.Any], indentation.asInstanceOf[js.Any], depth.asInstanceOf[js.Any], refs.asInstanceOf[js.Any], printer.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def printText(text: String, config: Config): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printText")(text.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[String]
}
