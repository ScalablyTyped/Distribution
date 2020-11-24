package typings.prosemirrorTables.mod

import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.mod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prosemirror-tables", "addRow")
@js.native
object addRow extends js.Object {
  
  def apply[S /* <: Schema[_, _] */](transaction: Transaction[S], rect: TableRect, row: Double): Transaction[S] = js.native
}
