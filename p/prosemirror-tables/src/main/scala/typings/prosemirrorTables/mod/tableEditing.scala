package typings.prosemirrorTables.mod

import typings.prosemirrorState.mod.Plugin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-tables", "tableEditing")
@js.native
object tableEditing extends js.Object {
  def apply(): Plugin[_, _] = js.native
  def apply(options: TableEditingOptions): Plugin[_, _] = js.native
}

