package typings.prosemirrorTables.mod

import typings.prosemirrorModel.mod.ResolvedPos
import typings.prosemirrorModel.mod.Schema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-tables", "inSameTable")
@js.native
object inSameTable extends js.Object {
  def apply[S /* <: Schema[_, _] */]($a: ResolvedPos[S], $b: ResolvedPos[S]): Boolean = js.native
}

