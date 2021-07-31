package typings.prosemirrorSchemaList

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.NodeSpec
import typings.prosemirrorModel.mod.NodeType
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.mod.EditorState
import typings.prosemirrorState.mod.Transaction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-schema-list", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def addListNodes(nodes: typings.orderedmap.mod.^[NodeSpec], itemContent: String): typings.orderedmap.mod.^[NodeSpec] = (^.asInstanceOf[js.Dynamic].applyDynamic("addListNodes")(nodes.asInstanceOf[js.Any], itemContent.asInstanceOf[js.Any])).asInstanceOf[typings.orderedmap.mod.^[NodeSpec]]
  @scala.inline
  def addListNodes(nodes: typings.orderedmap.mod.^[NodeSpec], itemContent: String, listGroup: String): typings.orderedmap.mod.^[NodeSpec] = (^.asInstanceOf[js.Dynamic].applyDynamic("addListNodes")(nodes.asInstanceOf[js.Any], itemContent.asInstanceOf[js.Any], listGroup.asInstanceOf[js.Any])).asInstanceOf[typings.orderedmap.mod.^[NodeSpec]]
  
  @JSImport("prosemirror-schema-list", "bulletList")
  @js.native
  def bulletList: NodeSpec = js.native
  @scala.inline
  def bulletList_=(x: NodeSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bulletList")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def liftListItem[S /* <: Schema[js.Any, js.Any] */](itemType: NodeType[S]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("liftListItem")(itemType.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ]]
  
  @JSImport("prosemirror-schema-list", "listItem")
  @js.native
  def listItem: NodeSpec = js.native
  @scala.inline
  def listItem_=(x: NodeSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("listItem")(x.asInstanceOf[js.Any])
  
  @JSImport("prosemirror-schema-list", "orderedList")
  @js.native
  def orderedList: NodeSpec = js.native
  @scala.inline
  def orderedList_=(x: NodeSpec): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orderedList")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def sinkListItem[S /* <: Schema[js.Any, js.Any] */](itemType: NodeType[S]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("sinkListItem")(itemType.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ]]
  
  @scala.inline
  def splitListItem[S /* <: Schema[js.Any, js.Any] */](itemType: NodeType[S]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("splitListItem")(itemType.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ]]
  
  @scala.inline
  def wrapInList[S /* <: Schema[js.Any, js.Any] */](listType: NodeType[S]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapInList")(listType.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ]]
  @scala.inline
  def wrapInList[S /* <: Schema[js.Any, js.Any] */](listType: NodeType[S], attrs: StringDictionary[js.Any]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapInList")(listType.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ]]
}
