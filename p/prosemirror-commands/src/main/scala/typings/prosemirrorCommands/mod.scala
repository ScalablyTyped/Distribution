package typings.prosemirrorCommands

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.MarkType
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.NodeType
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.mod.EditorState
import typings.prosemirrorState.mod.Transaction
import typings.prosemirrorView.mod.EditorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-commands", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("prosemirror-commands", "autoJoin")
  @js.native
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
  @JSImport("prosemirror-commands", "autoJoin")
  @js.native
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
  
  @JSImport("prosemirror-commands", "baseKeymap")
  @js.native
  def baseKeymap: Keymap[js.Any] = js.native
  @scala.inline
  def baseKeymap_=(x: Keymap[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("baseKeymap")(x.asInstanceOf[js.Any])
  
  @JSImport("prosemirror-commands", "chainCommands")
  @js.native
  def chainCommands[S /* <: Schema[_, _] */](commands: Command[S]*): Command[S] = js.native
  
  @JSImport("prosemirror-commands", "createParagraphNear")
  @js.native
  def createParagraphNear[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  @JSImport("prosemirror-commands", "createParagraphNear")
  @js.native
  def createParagraphNear[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  
  @JSImport("prosemirror-commands", "deleteSelection")
  @js.native
  def deleteSelection[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  @JSImport("prosemirror-commands", "deleteSelection")
  @js.native
  def deleteSelection[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  
  @JSImport("prosemirror-commands", "exitCode")
  @js.native
  def exitCode[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  @JSImport("prosemirror-commands", "exitCode")
  @js.native
  def exitCode[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  
  @JSImport("prosemirror-commands", "joinBackward")
  @js.native
  def joinBackward[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  @JSImport("prosemirror-commands", "joinBackward")
  @js.native
  def joinBackward[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.UndefOr[scala.Nothing], view: EditorView[S]): Boolean = js.native
  @JSImport("prosemirror-commands", "joinBackward")
  @js.native
  def joinBackward[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  @JSImport("prosemirror-commands", "joinBackward")
  @js.native
  def joinBackward[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit], view: EditorView[S]): Boolean = js.native
  
  @JSImport("prosemirror-commands", "joinDown")
  @js.native
  def joinDown[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  @JSImport("prosemirror-commands", "joinDown")
  @js.native
  def joinDown[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  
  @JSImport("prosemirror-commands", "joinForward")
  @js.native
  def joinForward[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  @JSImport("prosemirror-commands", "joinForward")
  @js.native
  def joinForward[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.UndefOr[scala.Nothing], view: EditorView[S]): Boolean = js.native
  @JSImport("prosemirror-commands", "joinForward")
  @js.native
  def joinForward[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  @JSImport("prosemirror-commands", "joinForward")
  @js.native
  def joinForward[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit], view: EditorView[S]): Boolean = js.native
  
  @JSImport("prosemirror-commands", "joinUp")
  @js.native
  def joinUp[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  @JSImport("prosemirror-commands", "joinUp")
  @js.native
  def joinUp[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  
  @JSImport("prosemirror-commands", "lift")
  @js.native
  def lift[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  @JSImport("prosemirror-commands", "lift")
  @js.native
  def lift[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  
  @JSImport("prosemirror-commands", "liftEmptyBlock")
  @js.native
  def liftEmptyBlock[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  @JSImport("prosemirror-commands", "liftEmptyBlock")
  @js.native
  def liftEmptyBlock[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  
  @JSImport("prosemirror-commands", "macBaseKeymap")
  @js.native
  def macBaseKeymap: Keymap[js.Any] = js.native
  @scala.inline
  def macBaseKeymap_=(x: Keymap[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("macBaseKeymap")(x.asInstanceOf[js.Any])
  
  @JSImport("prosemirror-commands", "newlineInCode")
  @js.native
  def newlineInCode[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  @JSImport("prosemirror-commands", "newlineInCode")
  @js.native
  def newlineInCode[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  
  @JSImport("prosemirror-commands", "pcBaseKeymap")
  @js.native
  def pcBaseKeymap: Keymap[js.Any] = js.native
  @scala.inline
  def pcBaseKeymap_=(x: Keymap[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pcBaseKeymap")(x.asInstanceOf[js.Any])
  
  @JSImport("prosemirror-commands", "selectAll")
  @js.native
  def selectAll[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  @JSImport("prosemirror-commands", "selectAll")
  @js.native
  def selectAll[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  
  @JSImport("prosemirror-commands", "selectNodeBackward")
  @js.native
  def selectNodeBackward[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  @JSImport("prosemirror-commands", "selectNodeBackward")
  @js.native
  def selectNodeBackward[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.UndefOr[scala.Nothing], view: EditorView[S]): Boolean = js.native
  @JSImport("prosemirror-commands", "selectNodeBackward")
  @js.native
  def selectNodeBackward[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  @JSImport("prosemirror-commands", "selectNodeBackward")
  @js.native
  def selectNodeBackward[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit], view: EditorView[S]): Boolean = js.native
  
  @JSImport("prosemirror-commands", "selectNodeForward")
  @js.native
  def selectNodeForward[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  @JSImport("prosemirror-commands", "selectNodeForward")
  @js.native
  def selectNodeForward[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.UndefOr[scala.Nothing], view: EditorView[S]): Boolean = js.native
  @JSImport("prosemirror-commands", "selectNodeForward")
  @js.native
  def selectNodeForward[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  @JSImport("prosemirror-commands", "selectNodeForward")
  @js.native
  def selectNodeForward[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit], view: EditorView[S]): Boolean = js.native
  
  @JSImport("prosemirror-commands", "selectParentNode")
  @js.native
  def selectParentNode[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  @JSImport("prosemirror-commands", "selectParentNode")
  @js.native
  def selectParentNode[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  
  @JSImport("prosemirror-commands", "setBlockType")
  @js.native
  def setBlockType[S /* <: Schema[_, _] */](nodeType: NodeType[S]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  @JSImport("prosemirror-commands", "setBlockType")
  @js.native
  def setBlockType[S /* <: Schema[_, _] */](nodeType: NodeType[S], attrs: StringDictionary[js.Any]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  
  @JSImport("prosemirror-commands", "splitBlock")
  @js.native
  def splitBlock[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  @JSImport("prosemirror-commands", "splitBlock")
  @js.native
  def splitBlock[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  
  @JSImport("prosemirror-commands", "splitBlockKeepMarks")
  @js.native
  def splitBlockKeepMarks[S /* <: Schema[_, _] */](state: EditorState[S]): Boolean = js.native
  @JSImport("prosemirror-commands", "splitBlockKeepMarks")
  @js.native
  def splitBlockKeepMarks[S /* <: Schema[_, _] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = js.native
  
  @JSImport("prosemirror-commands", "toggleMark")
  @js.native
  def toggleMark[S /* <: Schema[_, _] */](markType: MarkType[S]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  @JSImport("prosemirror-commands", "toggleMark")
  @js.native
  def toggleMark[S /* <: Schema[_, _] */](markType: MarkType[S], attrs: StringDictionary[js.Any]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  
  @JSImport("prosemirror-commands", "wrapIn")
  @js.native
  def wrapIn[S /* <: Schema[_, _] */](nodeType: NodeType[S]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  @JSImport("prosemirror-commands", "wrapIn")
  @js.native
  def wrapIn[S /* <: Schema[_, _] */](nodeType: NodeType[S], attrs: StringDictionary[js.Any]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = js.native
  
  type Command[S /* <: Schema[_, _] */] = js.Function3[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    /* view */ js.UndefOr[EditorView[S]], 
    Boolean
  ]
  
  type Keymap[S /* <: Schema[_, _] */] = StringDictionary[Command[S]]
}
