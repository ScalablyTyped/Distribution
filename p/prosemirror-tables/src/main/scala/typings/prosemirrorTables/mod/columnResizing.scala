package typings.prosemirrorTables.mod

import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.mod.Plugin
import typings.prosemirrorTables.AnonCellMinWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-tables", "columnResizing")
@js.native
object columnResizing extends js.Object {
  def apply[S /* <: Schema[_, _] */](props: AnonCellMinWidth[S]): Plugin[S, _] = js.native
}

