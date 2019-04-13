package typings
package prosemirrorDashSchemaDashListLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-schema-list", JSImport.Namespace)
@js.native
object prosemirrorDashSchemaDashListMod extends js.Object {
  var bulletList: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeSpec = js.native
  var listItem: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeSpec = js.native
  var orderedList: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeSpec = js.native
  def addListNodes(
    nodes: orderedmapLib.orderedmapMod.^[prosemirrorDashModelLib.prosemirrorDashModelMod.NodeSpec],
    itemContent: java.lang.String
  ): orderedmapLib.orderedmapMod.^[prosemirrorDashModelLib.prosemirrorDashModelMod.NodeSpec] = js.native
  def addListNodes(
    nodes: orderedmapLib.orderedmapMod.^[prosemirrorDashModelLib.prosemirrorDashModelMod.NodeSpec],
    itemContent: java.lang.String,
    listGroup: java.lang.String
  ): orderedmapLib.orderedmapMod.^[prosemirrorDashModelLib.prosemirrorDashModelMod.NodeSpec] = js.native
  def liftListItem[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](itemType: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S]): js.Function2[
    /* state */ prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], 
    /* dispatch */ js.UndefOr[
      js.Function1[
        /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
        scala.Unit
      ]
    ], 
    scala.Boolean
  ] = js.native
  def sinkListItem[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](itemType: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S]): js.Function2[
    /* state */ prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], 
    /* dispatch */ js.UndefOr[
      js.Function1[
        /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
        scala.Unit
      ]
    ], 
    scala.Boolean
  ] = js.native
  def splitListItem[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](itemType: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S]): js.Function2[
    /* state */ prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], 
    /* dispatch */ js.UndefOr[
      js.Function1[
        /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
        scala.Unit
      ]
    ], 
    scala.Boolean
  ] = js.native
  def wrapInList[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](listType: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S]): js.Function2[
    /* state */ prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], 
    /* dispatch */ js.UndefOr[
      js.Function1[
        /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
        scala.Unit
      ]
    ], 
    scala.Boolean
  ] = js.native
  def wrapInList[S /* <: prosemirrorDashModelLib.prosemirrorDashModelMod.Schema[_, _] */](
    listType: prosemirrorDashModelLib.prosemirrorDashModelMod.NodeType[S],
    attrs: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): js.Function2[
    /* state */ prosemirrorDashStateLib.prosemirrorDashStateMod.EditorState[S], 
    /* dispatch */ js.UndefOr[
      js.Function1[
        /* tr */ prosemirrorDashStateLib.prosemirrorDashStateMod.Transaction[S], 
        scala.Unit
      ]
    ], 
    scala.Boolean
  ] = js.native
}

