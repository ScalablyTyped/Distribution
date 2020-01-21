package typings.prosemirrorTransform.mod

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.NodeRange
import typings.prosemirrorModel.mod.NodeType
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorTransform.AnonAttrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-transform", "findWrapping")
@js.native
object findWrapping extends js.Object {
  def apply[S /* <: Schema[_, _] */](range: NodeRange[S], nodeType: NodeType[S]): js.UndefOr[js.Array[AnonAttrs[S]] | Null] = js.native
  def apply[S /* <: Schema[_, _] */](range: NodeRange[S], nodeType: NodeType[S], attrs: StringDictionary[js.Any]): js.UndefOr[js.Array[AnonAttrs[S]] | Null] = js.native
  def apply[S /* <: Schema[_, _] */](
    range: NodeRange[S],
    nodeType: NodeType[S],
    attrs: StringDictionary[js.Any],
    innerRange: NodeRange[S]
  ): js.UndefOr[js.Array[AnonAttrs[S]] | Null] = js.native
}

