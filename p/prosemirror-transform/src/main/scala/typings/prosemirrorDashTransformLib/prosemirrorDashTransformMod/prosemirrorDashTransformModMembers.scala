package typings
package prosemirrorDashTransformLib.prosemirrorDashTransformMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-transform", JSImport.Namespace)
@js.native
object prosemirrorDashTransformModMembers extends js.Object {
  def canJoin(doc: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[_], pos: scala.Double): scala.Boolean = js.native
  def canSplit[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](doc: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S], pos: scala.Double): scala.Boolean = js.native
  def canSplit[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    doc: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S],
    pos: scala.Double,
    depth: scala.Double
  ): scala.Boolean = js.native
  def canSplit[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    doc: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S],
    pos: scala.Double,
    depth: scala.Double,
    typesAfter: js.Array[prosemirrorDashTransformLib.Anon_Type[S]]
  ): scala.Boolean = js.native
  def dropPoint[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    doc: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S],
    pos: scala.Double,
    slice: prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[S]
  ): js.UndefOr[scala.Double | scala.Null] = js.native
  def findWrapping[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    range: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeRange[S],
    nodeType: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S]
  ): js.UndefOr[js.Array[prosemirrorDashTransformLib.Anon_Type[S]] | scala.Null] = js.native
  def findWrapping[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    range: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeRange[S],
    nodeType: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S],
    attrs: ScalablyTyped.runtime.StringDictionary[js.Any]
  ): js.UndefOr[js.Array[prosemirrorDashTransformLib.Anon_Type[S]] | scala.Null] = js.native
  def findWrapping[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    range: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeRange[S],
    nodeType: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S],
    attrs: ScalablyTyped.runtime.StringDictionary[js.Any],
    innerRange: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeRange[S]
  ): js.UndefOr[js.Array[prosemirrorDashTransformLib.Anon_Type[S]] | scala.Null] = js.native
  def insertPoint[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    doc: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S],
    pos: scala.Double,
    nodeType: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S]
  ): js.UndefOr[scala.Double | scala.Null] = js.native
  def joinPoint(doc: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[_], pos: scala.Double): js.UndefOr[scala.Double | scala.Null] = js.native
  def joinPoint(doc: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[_], pos: scala.Double, dir: scala.Double): js.UndefOr[scala.Double | scala.Null] = js.native
  def liftTarget(range: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeRange[_]): js.UndefOr[scala.Double | scala.Null] = js.native
  def replaceStep[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](doc: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S], from: scala.Double): js.UndefOr[Step[S] | scala.Null] = js.native
  def replaceStep[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](doc: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S], from: scala.Double, to: scala.Double): js.UndefOr[Step[S] | scala.Null] = js.native
  def replaceStep[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    doc: prosemirrorDashModelLib.prosemirrorDashModelMod.Node[S],
    from: scala.Double,
    to: scala.Double,
    slice: prosemirrorDashModelLib.prosemirrorDashModelMod.Slice[S]
  ): js.UndefOr[Step[S] | scala.Null] = js.native
}

