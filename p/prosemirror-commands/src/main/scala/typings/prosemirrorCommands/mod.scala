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
  
  inline def autoJoin[S /* <: Schema[Any, Any] */](
    command: js.Function2[
      /* state */ EditorState, 
      /* p1 */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
      Boolean
    ],
    isJoinable: js.Array[String]
  ): js.Function2[
    /* state */ EditorState, 
    /* p1 */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("autoJoin")(command.asInstanceOf[js.Any], isJoinable.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* state */ EditorState, 
    /* p1 */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ]]
  inline def autoJoin[S /* <: Schema[Any, Any] */](
    command: js.Function2[
      /* state */ EditorState, 
      /* p1 */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
      Boolean
    ],
    isJoinable: js.Function2[/* before */ Node, /* after */ Node, Boolean]
  ): js.Function2[
    /* state */ EditorState, 
    /* p1 */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("autoJoin")(command.asInstanceOf[js.Any], isJoinable.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* state */ EditorState, 
    /* p1 */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ]]
  
  @JSImport("prosemirror-commands", "baseKeymap")
  @js.native
  def baseKeymap: Keymap[Any] = js.native
  inline def baseKeymap_=(x: Keymap[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("baseKeymap")(x.asInstanceOf[js.Any])
  
  inline def chainCommands[S /* <: Schema[Any, Any] */](commands: Command[S]*): Command[S] = ^.asInstanceOf[js.Dynamic].applyDynamic("chainCommands")(commands.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Command[S]]
  
  inline def createParagraphNear[S /* <: Schema[Any, Any] */](state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("createParagraphNear")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def createParagraphNear[S /* <: Schema[Any, Any] */](state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("createParagraphNear")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def deleteSelection[S /* <: Schema[Any, Any] */](state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteSelection")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def deleteSelection[S /* <: Schema[Any, Any] */](state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteSelection")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def exitCode[S /* <: Schema[Any, Any] */](state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("exitCode")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def exitCode[S /* <: Schema[Any, Any] */](state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("exitCode")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def joinBackward[S /* <: Schema[Any, Any] */](state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("joinBackward")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def joinBackward[S /* <: Schema[Any, Any] */](state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("joinBackward")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def joinBackward[S /* <: Schema[Any, Any] */](state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit], view: EditorView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("joinBackward")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def joinBackward[S /* <: Schema[Any, Any] */](state: EditorState, dispatch: Unit, view: EditorView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("joinBackward")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def joinDown[S /* <: Schema[Any, Any] */](state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("joinDown")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def joinDown[S /* <: Schema[Any, Any] */](state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("joinDown")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def joinForward[S /* <: Schema[Any, Any] */](state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("joinForward")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def joinForward[S /* <: Schema[Any, Any] */](state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("joinForward")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def joinForward[S /* <: Schema[Any, Any] */](state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit], view: EditorView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("joinForward")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def joinForward[S /* <: Schema[Any, Any] */](state: EditorState, dispatch: Unit, view: EditorView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("joinForward")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def joinUp[S /* <: Schema[Any, Any] */](state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("joinUp")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def joinUp[S /* <: Schema[Any, Any] */](state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("joinUp")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def lift[S /* <: Schema[Any, Any] */](state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("lift")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def lift[S /* <: Schema[Any, Any] */](state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("lift")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def liftEmptyBlock[S /* <: Schema[Any, Any] */](state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("liftEmptyBlock")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def liftEmptyBlock[S /* <: Schema[Any, Any] */](state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("liftEmptyBlock")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("prosemirror-commands", "macBaseKeymap")
  @js.native
  def macBaseKeymap: Keymap[Any] = js.native
  inline def macBaseKeymap_=(x: Keymap[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("macBaseKeymap")(x.asInstanceOf[js.Any])
  
  inline def newlineInCode[S /* <: Schema[Any, Any] */](state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("newlineInCode")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def newlineInCode[S /* <: Schema[Any, Any] */](state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("newlineInCode")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("prosemirror-commands", "pcBaseKeymap")
  @js.native
  def pcBaseKeymap: Keymap[Any] = js.native
  inline def pcBaseKeymap_=(x: Keymap[Any]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pcBaseKeymap")(x.asInstanceOf[js.Any])
  
  inline def selectAll[S /* <: Schema[Any, Any] */](state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("selectAll")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def selectAll[S /* <: Schema[Any, Any] */](state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("selectAll")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def selectNodeBackward[S /* <: Schema[Any, Any] */](state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("selectNodeBackward")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def selectNodeBackward[S /* <: Schema[Any, Any] */](state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNodeBackward")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def selectNodeBackward[S /* <: Schema[Any, Any] */](state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit], view: EditorView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNodeBackward")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def selectNodeBackward[S /* <: Schema[Any, Any] */](state: EditorState, dispatch: Unit, view: EditorView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNodeBackward")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def selectNodeForward[S /* <: Schema[Any, Any] */](state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("selectNodeForward")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def selectNodeForward[S /* <: Schema[Any, Any] */](state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNodeForward")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def selectNodeForward[S /* <: Schema[Any, Any] */](state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit], view: EditorView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNodeForward")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def selectNodeForward[S /* <: Schema[Any, Any] */](state: EditorState, dispatch: Unit, view: EditorView): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("selectNodeForward")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any], view.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def selectParentNode[S /* <: Schema[Any, Any] */](state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("selectParentNode")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def selectParentNode[S /* <: Schema[Any, Any] */](state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("selectParentNode")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def setBlockType[S /* <: Schema[Any, Any] */](nodeType: NodeType): js.Function2[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("setBlockType")(nodeType.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ]]
  inline def setBlockType[S /* <: Schema[Any, Any] */](nodeType: NodeType, attrs: StringDictionary[Any]): js.Function2[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("setBlockType")(nodeType.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ]]
  
  inline def splitBlock[S /* <: Schema[Any, Any] */](state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("splitBlock")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def splitBlock[S /* <: Schema[Any, Any] */](state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("splitBlock")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def splitBlockKeepMarks[S /* <: Schema[Any, Any] */](state: EditorState): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("splitBlockKeepMarks")(state.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def splitBlockKeepMarks[S /* <: Schema[Any, Any] */](state: EditorState, dispatch: js.Function1[/* tr */ Transaction, Unit]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("splitBlockKeepMarks")(state.asInstanceOf[js.Any], dispatch.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def toggleMark[S /* <: Schema[Any, Any] */](markType: MarkType): js.Function2[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleMark")(markType.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ]]
  inline def toggleMark[S /* <: Schema[Any, Any] */](markType: MarkType, attrs: StringDictionary[Any]): js.Function2[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleMark")(markType.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ]]
  
  inline def wrapIn[S /* <: Schema[Any, Any] */](nodeType: NodeType): js.Function2[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapIn")(nodeType.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ]]
  inline def wrapIn[S /* <: Schema[Any, Any] */](nodeType: NodeType, attrs: StringDictionary[Any]): js.Function2[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapIn")(nodeType.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[js.Function2[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    Boolean
  ]]
  
  type Command[S /* <: Schema[Any, Any] */] = js.Function3[
    /* state */ EditorState, 
    /* dispatch */ js.UndefOr[js.Function1[/* tr */ Transaction, Unit]], 
    /* view */ js.UndefOr[EditorView], 
    Boolean
  ]
  
  type Keymap[S /* <: Schema[Any, Any] */] = StringDictionary[Command[S]]
}
