package typings.prosemirrorCommands

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.MarkType
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.NodeType
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.mod.EditorState
import typings.prosemirrorState.mod.Transaction
import typings.prosemirrorView.mod.EditorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-commands", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def autoJoin[S /* <: Schema[_, _] */](
    command: js.Function2[
      /* state */ EditorState[S], 
      /* p1 */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
      Boolean
    ],
    isJoinable: js.Array[String]
  ): js.Function2[
    /* state */ EditorState[S], 
    /* p1 */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  def autoJoin[S /* <: Schema[_, _] */](
    command: js.Function2[
      /* state */ EditorState[S], 
      /* p1 */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
      Boolean
    ],
    isJoinable: js.Function2[/* before */ Node[S], /* after */ Node[S], Boolean]
  ): js.Function2[
    /* state */ EditorState[S], 
    /* p1 */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  def chainCommands[S /* <: Schema[_, _] */](
    commands: (js.Function3[
      /* p1 */ EditorState[S], 
      /* p2 */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
      /* p3 */ js.UndefOr[EditorView[S]], 
      Boolean
    ])*
  ): js.Function3[
    /* p1 */ EditorState[S], 
    /* p2 */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    /* p3 */ js.UndefOr[EditorView[S]], 
    Boolean
  ] = js.native
  def createParagraphNear[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def createParagraphNear[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  def deleteSelection[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def deleteSelection[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  def exitCode[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def exitCode[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  def joinBackward[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def joinBackward[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  def joinBackward[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit], view: EditorView[S]): Boolean = js.native
  def joinDown[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def joinDown[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  def joinForward[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def joinForward[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  def joinForward[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit], view: EditorView[S]): Boolean = js.native
  def joinUp[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def joinUp[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  def lift[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def lift[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  def liftEmptyBlock[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def liftEmptyBlock[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  def newlineInCode[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def newlineInCode[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  def selectAll[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def selectAll[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  def selectNodeBackward[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def selectNodeBackward[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  def selectNodeBackward[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit], view: EditorView[S]): Boolean = js.native
  def selectNodeForward[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def selectNodeForward[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  def selectNodeForward[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit], view: EditorView[S]): Boolean = js.native
  def selectParentNode[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def selectParentNode[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  def setBlockType[S /* <: Schema[_, _] */](nodeType: NodeType[S]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  def setBlockType[S /* <: Schema[_, _] */](nodeType: NodeType[S], attrs: StringDictionary[js.Any]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  def splitBlock[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def splitBlock[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  def splitBlockKeepMarks[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  def splitBlockKeepMarks[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  def toggleMark[S /* <: Schema[_, _] */](markType: MarkType[S]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  def toggleMark[S /* <: Schema[_, _] */](markType: MarkType[S], attrs: StringDictionary[js.Any]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  def wrapIn[S /* <: Schema[_, _] */](nodeType: NodeType[S]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  def wrapIn[S /* <: Schema[_, _] */](nodeType: NodeType[S], attrs: StringDictionary[js.Any]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  @js.native
  object baseKeymap
    extends /* key */ StringDictionary[js.Any]
  
  @js.native
  object macBaseKeymap
    extends /* key */ StringDictionary[js.Any]
  
  @js.native
  object pcBaseKeymap
    extends /* key */ StringDictionary[js.Any]
  
}

