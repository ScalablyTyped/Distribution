package typings.prosemirrorDashTransform.prosemirrorDashTransformMod

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorDashModel.prosemirrorDashModelMod.Node
import typings.prosemirrorDashModel.prosemirrorDashModelMod.NodeRange
import typings.prosemirrorDashModel.prosemirrorDashModelMod.NodeType
import typings.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import typings.prosemirrorDashModel.prosemirrorDashModelMod.Slice
import typings.prosemirrorDashTransform.Anon_Attrs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-transform", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def canJoin(doc: Node[_], pos: Double): Boolean = js.native
  def canSplit[S /* <: Schema[_, _] */](doc: Node[S], pos: Double): Boolean = js.native
  def canSplit[S /* <: Schema[_, _] */](doc: Node[S], pos: Double, depth: Double): Boolean = js.native
  def canSplit[S /* <: Schema[_, _] */](doc: Node[S], pos: Double, depth: Double, typesAfter: js.Array[Anon_Attrs[S]]): Boolean = js.native
  def dropPoint[S /* <: Schema[_, _] */](doc: Node[S], pos: Double, slice: Slice[S]): js.UndefOr[Double | Null] = js.native
  def findWrapping[S /* <: Schema[_, _] */](range: NodeRange[S], nodeType: NodeType[S]): js.UndefOr[js.Array[Anon_Attrs[S]] | Null] = js.native
  def findWrapping[S /* <: Schema[_, _] */](range: NodeRange[S], nodeType: NodeType[S], attrs: StringDictionary[js.Any]): js.UndefOr[js.Array[Anon_Attrs[S]] | Null] = js.native
  def findWrapping[S /* <: Schema[_, _] */](
    range: NodeRange[S],
    nodeType: NodeType[S],
    attrs: StringDictionary[js.Any],
    innerRange: NodeRange[S]
  ): js.UndefOr[js.Array[Anon_Attrs[S]] | Null] = js.native
  def insertPoint[S /* <: Schema[_, _] */](doc: Node[S], pos: Double, nodeType: NodeType[S]): js.UndefOr[Double | Null] = js.native
  def joinPoint(doc: Node[_], pos: Double): js.UndefOr[Double | Null] = js.native
  def joinPoint(doc: Node[_], pos: Double, dir: Double): js.UndefOr[Double | Null] = js.native
  def liftTarget(range: NodeRange[_]): js.UndefOr[Double | Null] = js.native
  def replaceStep[S /* <: Schema[_, _] */](doc: Node[S], from: Double): js.UndefOr[Step[S] | Null] = js.native
  def replaceStep[S /* <: Schema[_, _] */](doc: Node[S], from: Double, to: Double): js.UndefOr[Step[S] | Null] = js.native
  def replaceStep[S /* <: Schema[_, _] */](doc: Node[S], from: Double, to: Double, slice: Slice[S]): js.UndefOr[Step[S] | Null] = js.native
}

