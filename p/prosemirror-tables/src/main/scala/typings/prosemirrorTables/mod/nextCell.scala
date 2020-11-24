package typings.prosemirrorTables.mod

import typings.prosemirrorModel.mod.ResolvedPos
import typings.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prosemirror-tables", "nextCell")
@js.native
object nextCell extends js.Object {
  
  def apply[S /* <: Schema[_, _] */](pos: ResolvedPos[S], axis: String, dir: Double): Null | ResolvedPos[S] = js.native
}
