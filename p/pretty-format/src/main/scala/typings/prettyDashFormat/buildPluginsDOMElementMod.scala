package typings.prettyDashFormat

import typings.prettyDashFormat.buildTypesMod.Config
import typings.prettyDashFormat.buildTypesMod.NewPlugin
import typings.prettyDashFormat.buildTypesMod.Printer
import typings.std.Comment
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pretty-format/build/plugins/DOMElement", JSImport.Namespace)
@js.native
object buildPluginsDOMElementMod extends js.Object {
  val default: NewPlugin = js.native
  def serialize(
    node: HandledType,
    config: Config,
    indentation: String,
    depth: Double,
    refs: js.Array[_],
    printer: Printer
  ): String = js.native
  def test(`val`: js.Any): Boolean = js.native
  type HandledType = Element | Text | Comment | DocumentFragment
}

