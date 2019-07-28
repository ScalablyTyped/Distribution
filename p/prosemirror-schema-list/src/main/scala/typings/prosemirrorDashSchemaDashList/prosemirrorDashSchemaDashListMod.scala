package typings.prosemirrorDashSchemaDashList

import org.scalablytyped.runtime.StringDictionary
import typings.orderedmap.orderedmapMod.^
import typings.prosemirrorDashModel.prosemirrorDashModelMod.NodeSpec
import typings.prosemirrorDashModel.prosemirrorDashModelMod.NodeType
import typings.prosemirrorDashModel.prosemirrorDashModelMod.Schema
import typings.prosemirrorDashState.prosemirrorDashStateMod.EditorState
import typings.prosemirrorDashState.prosemirrorDashStateMod.Transaction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-schema-list", JSImport.Namespace)
@js.native
object prosemirrorDashSchemaDashListMod extends js.Object {
  var bulletList: NodeSpec = js.native
  var listItem: NodeSpec = js.native
  var orderedList: NodeSpec = js.native
  def addListNodes(nodes: ^[NodeSpec], itemContent: String): ^[NodeSpec] = js.native
  def addListNodes(nodes: ^[NodeSpec], itemContent: String, listGroup: String): ^[NodeSpec] = js.native
  def liftListItem[S /* <: Schema[_, _] */](itemType: NodeType[S]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  def sinkListItem[S /* <: Schema[_, _] */](itemType: NodeType[S]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  def splitListItem[S /* <: Schema[_, _] */](itemType: NodeType[S]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  def wrapInList[S /* <: Schema[_, _] */](listType: NodeType[S]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  def wrapInList[S /* <: Schema[_, _] */](listType: NodeType[S], attrs: StringDictionary[js.Any]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
}

