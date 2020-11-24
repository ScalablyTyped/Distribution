package typings.prosemirrorTables.mod

import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.mod.Plugin
import typings.prosemirrorTables.anon.CellMinWidth
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prosemirror-tables", "columnResizing")
@js.native
object columnResizing extends js.Object {
  
  def apply[S /* <: Schema[_, _] */](props: CellMinWidth[S]): Plugin[S, _] = js.native
}
