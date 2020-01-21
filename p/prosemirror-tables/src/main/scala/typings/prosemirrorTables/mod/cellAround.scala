package typings.prosemirrorTables.mod

import typings.prosemirrorModel.mod.ResolvedPos
import typings.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-tables", "cellAround")
@js.native
object cellAround extends js.Object {
  def apply[S /* <: Schema[_, _] */](pos: ResolvedPos[S]): ResolvedPos[S] | Null = js.native
}

