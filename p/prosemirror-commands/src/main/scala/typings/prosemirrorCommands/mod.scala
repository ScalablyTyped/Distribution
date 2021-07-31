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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-commands", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def autoJoin[S /* <: Schema[js.Any, js.Any] */](
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
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("autoJoin")(command.asInstanceOf[js.Any], isJoinable.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* state */ EditorState[S], 
    /* p1 */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ]]
  @scala.inline
  def autoJoin[S /* <: Schema[js.Any, js.Any] */](
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
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("autoJoin")(command.asInstanceOf[js.Any], isJoinable.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* state */ EditorState[S], 
    /* p1 */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ]]
  
  @JSImport("prosemirror-commands", "baseKeymap")
  @js.native
  def baseKeymap: Keymap[js.Any] = js.native
  @scala.inline
  def baseKeymap_=(x: Keymap[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("baseKeymap")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def chainCommands[S /* <: Schema[js.Any, js.Any] */](commands: Command[S]*): Command[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainCommands")(commands.asInstanceOf[js.Any]).asInstanceOf[Command[S]]
  
  @scala.inline
  def createParagraphNear[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("createParagraphNear")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def createParagraphNear[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("createParagraphNear")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def deleteSelection[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteSelection")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def deleteSelection[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteSelection")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def exitCode[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("exitCode")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def exitCode[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("exitCode")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def joinBackward[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("joinBackward")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def joinBackward[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("joinBackward")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def joinBackward[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit], view: EditorView[S]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("joinBackward")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def joinBackward[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: Unit, view: EditorView[S]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("joinBackward")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def joinDown[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("joinDown")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def joinDown[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("joinDown")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def joinForward[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("joinForward")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def joinForward[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("joinForward")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def joinForward[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit], view: EditorView[S]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("joinForward")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def joinForward[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: Unit, view: EditorView[S]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("joinForward")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def joinUp[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("joinUp")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def joinUp[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("joinUp")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def lift[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("lift")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def lift[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lift")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def liftEmptyBlock[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("liftEmptyBlock")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def liftEmptyBlock[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("liftEmptyBlock")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("prosemirror-commands", "macBaseKeymap")
  @js.native
  def macBaseKeymap: Keymap[js.Any] = js.native
  @scala.inline
  def macBaseKeymap_=(x: Keymap[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("macBaseKeymap")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def newlineInCode[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("newlineInCode")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def newlineInCode[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("newlineInCode")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("prosemirror-commands", "pcBaseKeymap")
  @js.native
  def pcBaseKeymap: Keymap[js.Any] = js.native
  @scala.inline
  def pcBaseKeymap_=(x: Keymap[js.Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pcBaseKeymap")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def selectAll[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("selectAll")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def selectAll[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("selectAll")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def selectNodeBackward[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("selectNodeBackward")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def selectNodeBackward[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNodeBackward")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def selectNodeBackward[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit], view: EditorView[S]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNodeBackward")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def selectNodeBackward[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: Unit, view: EditorView[S]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNodeBackward")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def selectNodeForward[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("selectNodeForward")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def selectNodeForward[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNodeForward")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def selectNodeForward[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit], view: EditorView[S]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNodeForward")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def selectNodeForward[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: Unit, view: EditorView[S]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNodeForward")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def selectParentNode[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("selectParentNode")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def selectParentNode[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("selectParentNode")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def setBlockType[S /* <: Schema[js.Any, js.Any] */](nodeType: NodeType[S]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("setBlockType")(nodeType.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ]]
  @scala.inline
  def setBlockType[S /* <: Schema[js.Any, js.Any] */](nodeType: NodeType[S], attrs: StringDictionary[js.Any]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("setBlockType")(nodeType.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ]]
  
  @scala.inline
  def splitBlock[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("splitBlock")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def splitBlock[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("splitBlock")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def splitBlockKeepMarks[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("splitBlockKeepMarks")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def splitBlockKeepMarks[S /* <: Schema[js.Any, js.Any] */](state: EditorState[S], dispatch: js.Function1[/* tr */ Transaction[S], Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("splitBlockKeepMarks")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def toggleMark[S /* <: Schema[js.Any, js.Any] */](markType: MarkType[S]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleMark")(markType.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ]]
  @scala.inline
  def toggleMark[S /* <: Schema[js.Any, js.Any] */](markType: MarkType[S], attrs: StringDictionary[js.Any]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleMark")(markType.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ]]
  
  @scala.inline
  def wrapIn[S /* <: Schema[js.Any, js.Any] */](nodeType: NodeType[S]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapIn")(nodeType.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ]]
  @scala.inline
  def wrapIn[S /* <: Schema[js.Any, js.Any] */](nodeType: NodeType[S], attrs: StringDictionary[js.Any]): js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapIn")(nodeType.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    Boolean
  ]]
  
  type Command[S /* <: Schema[js.Any, js.Any] */] = js.Function3[
    /* state */ EditorState[S], 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction[S], Unit]], 
    /* view */ js.UndefOr[EditorView[S]], 
    Boolean
  ]
  
  type Keymap[S /* <: Schema[js.Any, js.Any] */] = StringDictionary[Command[S]]
}
