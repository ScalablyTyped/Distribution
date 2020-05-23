package typings.prosemirrorTables.mod

import typings.prosemirrorModel.mod.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-tables", "columnIsHeader")
@js.native
object columnIsHeader extends js.Object {
  def apply(map: TableMap, table: Node[_], col: Double): Boolean = js.native
}

