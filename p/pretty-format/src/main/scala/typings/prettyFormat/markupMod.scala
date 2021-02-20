package typings.prettyFormat

import typings.prettyFormat.typesMod.Config
import typings.prettyFormat.typesMod.Printer
import typings.prettyFormat.typesMod.Refs
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object markupMod {
  
  @JSImport("pretty-format/build/plugins/lib/markup", "printChildren")
  @js.native
  def printChildren(
    children: js.Array[_],
    config: Config,
    indentation: String,
    depth: Double,
    refs: Refs,
    printer: Printer
  ): String = js.native
  
  @JSImport("pretty-format/build/plugins/lib/markup", "printComment")
  @js.native
  def printComment(comment: String, config: Config): String = js.native
  
  @JSImport("pretty-format/build/plugins/lib/markup", "printElement")
  @js.native
  def printElement(`type`: String, printedProps: String, printedChildren: String, config: Config, indentation: String): String = js.native
  
  @JSImport("pretty-format/build/plugins/lib/markup", "printElementAsLeaf")
  @js.native
  def printElementAsLeaf(`type`: String, config: Config): String = js.native
  
  @JSImport("pretty-format/build/plugins/lib/markup", "printProps")
  @js.native
  def printProps(
    keys: js.Array[String],
    props: Record[String, _],
    config: Config,
    indentation: String,
    depth: Double,
    refs: Refs,
    printer: Printer
  ): String = js.native
  
  @JSImport("pretty-format/build/plugins/lib/markup", "printText")
  @js.native
  def printText(text: String, config: Config): String = js.native
}
