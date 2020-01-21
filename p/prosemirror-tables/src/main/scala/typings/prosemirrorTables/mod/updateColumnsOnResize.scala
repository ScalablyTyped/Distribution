package typings.prosemirrorTables.mod

import typings.prosemirrorModel.mod.Node
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-tables", "updateColumnsOnResize")
@js.native
object updateColumnsOnResize extends js.Object {
  def apply(node: Node[_], colgroup: Element, table: Element, cellMinWidth: Double): Unit = js.native
  def apply(node: Node[_], colgroup: Element, table: Element, cellMinWidth: Double, overrideCol: Double): Unit = js.native
  def apply(
    node: Node[_],
    colgroup: Element,
    table: Element,
    cellMinWidth: Double,
    overrideCol: Double,
    overrideValue: Double
  ): Unit = js.native
}

