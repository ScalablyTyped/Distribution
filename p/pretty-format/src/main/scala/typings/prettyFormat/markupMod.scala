package typings.prettyFormat

import typings.prettyFormat.typesMod.Config
import typings.prettyFormat.typesMod.Printer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pretty-format/build/plugins/lib/markup", JSImport.Namespace)
@js.native
object markupMod extends js.Object {
  def printChildren(
    children: js.Array[_],
    config: Config,
    indentation: String,
    depth: Double,
    refs: js.Array[_],
    printer: Printer
  ): String = js.native
  def printComment(comment: String, config: Config): String = js.native
  def printElement(`type`: String, printedProps: String, printedChildren: String, config: Config, indentation: String): String = js.native
  def printElementAsLeaf(`type`: String, config: Config): String = js.native
  def printProps(
    keys: js.Array[String],
    props: js.Any,
    config: Config,
    indentation: String,
    depth: Double,
    refs: js.Array[_],
    printer: Printer
  ): String = js.native
  def printText(text: String, config: Config): String = js.native
}

