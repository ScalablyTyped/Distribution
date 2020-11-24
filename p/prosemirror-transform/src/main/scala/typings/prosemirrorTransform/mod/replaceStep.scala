package typings.prosemirrorTransform.mod

import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorModel.mod.Slice
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("prosemirror-transform", "replaceStep")
@js.native
object replaceStep extends js.Object {
  
  def apply[S /* <: Schema[_, _] */](doc: Node[S], from: Double): js.UndefOr[Step[S] | Null] = js.native
  def apply[S /* <: Schema[_, _] */](doc: Node[S], from: Double, to: js.UndefOr[scala.Nothing], slice: Slice[S]): js.UndefOr[Step[S] | Null] = js.native
  def apply[S /* <: Schema[_, _] */](doc: Node[S], from: Double, to: Double): js.UndefOr[Step[S] | Null] = js.native
  def apply[S /* <: Schema[_, _] */](doc: Node[S], from: Double, to: Double, slice: Slice[S]): js.UndefOr[Step[S] | Null] = js.native
}
