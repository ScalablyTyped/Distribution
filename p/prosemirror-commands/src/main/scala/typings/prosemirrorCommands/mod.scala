package typings.prosemirrorCommands

import typings.prosemirrorModel.mod.Attrs
import typings.prosemirrorModel.mod.MarkType
import typings.prosemirrorModel.mod.Node
import typings.prosemirrorModel.mod.NodeType
import typings.prosemirrorState.mod.Command
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("prosemirror-commands", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def autoJoin(command: Command, isJoinable: js.Array[String]): Command = (^.asInstanceOf[js.Dynamic].applyDynamic("autoJoin")(command.asInstanceOf[js.Any], isJoinable.asInstanceOf[js.Any])).asInstanceOf[Command]
  /**
  Wrap a command so that, when it produces a transform that causes
  two joinable nodes to end up next to each other, those are joined.
  Nodes are considered joinable when they are of the same type and
  when the `isJoinable` predicate returns true for them or, if an
  array of strings was passed, if their node type name is in that
  array.
  */
  inline def autoJoin(command: Command, isJoinable: js.Function2[/* before */ Node, /* after */ Node, Boolean]): Command = (^.asInstanceOf[js.Dynamic].applyDynamic("autoJoin")(command.asInstanceOf[js.Any], isJoinable.asInstanceOf[js.Any])).asInstanceOf[Command]
  
  /**
  Combine a number of command functions into a single function (which
  calls them one by one until one returns true).
  */
  inline def chainCommands(commands: Command*): Command = ^.asInstanceOf[js.Dynamic].applyDynamic("chainCommands")(commands.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Command]
  
  /**
  If a block node is selected, create an empty paragraph before (if
  it is its parent's first child) or after it.
  */
  @JSImport("prosemirror-commands", "createParagraphNear")
  @js.native
  val createParagraphNear: Command = js.native
  
  /**
  Delete the selection, if there is one.
  */
  @JSImport("prosemirror-commands", "deleteSelection")
  @js.native
  val deleteSelection: Command = js.native
  
  /**
  When the selection is in a node with a truthy
  [`code`](https://prosemirror.net/docs/ref/#model.NodeSpec.code) property in its spec, create a
  default block after the code block, and move the cursor there.
  */
  @JSImport("prosemirror-commands", "exitCode")
  @js.native
  val exitCode: Command = js.native
  
  /**
  If the selection is empty and at the start of a textblock, try to
  reduce the distance between that block and the one before it—if
  there's a block directly before it that can be joined, join them.
  If not, try to move the selected block closer to the next one in
  the document structure by lifting it out of its parent or moving it
  into a parent of the previous block. Will use the view for accurate
  (bidi-aware) start-of-textblock detection if given.
  */
  @JSImport("prosemirror-commands", "joinBackward")
  @js.native
  val joinBackward: Command = js.native
  
  /**
  Join the selected block, or the closest ancestor of the selection
  that can be joined, with the sibling after it.
  */
  @JSImport("prosemirror-commands", "joinDown")
  @js.native
  val joinDown: Command = js.native
  
  /**
  If the selection is empty and the cursor is at the end of a
  textblock, try to reduce or remove the boundary between that block
  and the one after it, either by joining them or by moving the other
  block closer to this one in the tree structure. Will use the view
  for accurate start-of-textblock detection if given.
  */
  @JSImport("prosemirror-commands", "joinForward")
  @js.native
  val joinForward: Command = js.native
  
  /**
  Join the selected block or, if there is a text selection, the
  closest ancestor block of the selection that can be joined, with
  the sibling above it.
  */
  @JSImport("prosemirror-commands", "joinUp")
  @js.native
  val joinUp: Command = js.native
  
  /**
  Lift the selected block, or the closest ancestor block of the
  selection that can be lifted, out of its parent node.
  */
  @JSImport("prosemirror-commands", "lift")
  @js.native
  val lift: Command = js.native
  
  /**
  If the cursor is in an empty textblock that can be lifted, lift the
  block.
  */
  @JSImport("prosemirror-commands", "liftEmptyBlock")
  @js.native
  val liftEmptyBlock: Command = js.native
  
  /**
  If the selection is in a node whose type has a truthy
  [`code`](https://prosemirror.net/docs/ref/#model.NodeSpec.code) property in its spec, replace the
  selection with a newline character.
  */
  @JSImport("prosemirror-commands", "newlineInCode")
  @js.native
  val newlineInCode: Command = js.native
  
  /**
  Select the whole document.
  */
  @JSImport("prosemirror-commands", "selectAll")
  @js.native
  val selectAll: Command = js.native
  
  /**
  When the selection is empty and at the start of a textblock, select
  the node before that textblock, if possible. This is intended to be
  bound to keys like backspace, after
  [`joinBackward`](https://prosemirror.net/docs/ref/#commands.joinBackward) or other deleting
  commands, as a fall-back behavior when the schema doesn't allow
  deletion at the selected point.
  */
  @JSImport("prosemirror-commands", "selectNodeBackward")
  @js.native
  val selectNodeBackward: Command = js.native
  
  /**
  When the selection is empty and at the end of a textblock, select
  the node coming after that textblock, if possible. This is intended
  to be bound to keys like delete, after
  [`joinForward`](https://prosemirror.net/docs/ref/#commands.joinForward) and similar deleting
  commands, to provide a fall-back behavior when the schema doesn't
  allow deletion at the selected point.
  */
  @JSImport("prosemirror-commands", "selectNodeForward")
  @js.native
  val selectNodeForward: Command = js.native
  
  /**
  Move the selection to the node wrapping the current selection, if
  any. (Will not select the document node.)
  */
  @JSImport("prosemirror-commands", "selectParentNode")
  @js.native
  val selectParentNode: Command = js.native
  
  /**
  Moves the cursor to the end of current text block.
  */
  @JSImport("prosemirror-commands", "selectTextblockEnd")
  @js.native
  val selectTextblockEnd: Command = js.native
  
  /**
  Moves the cursor to the start of current text block.
  */
  @JSImport("prosemirror-commands", "selectTextblockStart")
  @js.native
  val selectTextblockStart: Command = js.native
  
  /**
  Returns a command that tries to set the selected textblocks to the
  given node type with the given attributes.
  */
  inline def setBlockType(nodeType: NodeType): Command = ^.asInstanceOf[js.Dynamic].applyDynamic("setBlockType")(nodeType.asInstanceOf[js.Any]).asInstanceOf[Command]
  inline def setBlockType(nodeType: NodeType, attrs: Attrs): Command = (^.asInstanceOf[js.Dynamic].applyDynamic("setBlockType")(nodeType.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Command]
  
  /**
  Split the parent block of the selection. If the selection is a text
  selection, also delete its content.
  */
  @JSImport("prosemirror-commands", "splitBlock")
  @js.native
  val splitBlock: Command = js.native
  
  /**
  Acts like [`splitBlock`](https://prosemirror.net/docs/ref/#commands.splitBlock), but without
  resetting the set of active marks at the cursor.
  */
  @JSImport("prosemirror-commands", "splitBlockKeepMarks")
  @js.native
  val splitBlockKeepMarks: Command = js.native
  
  /**
  Create a command function that toggles the given mark with the
  given attributes. Will return `false` when the current selection
  doesn't support that mark. This will remove the mark if any marks
  of that type exist in the selection, or add it otherwise. If the
  selection is empty, this applies to the [stored
  marks](https://prosemirror.net/docs/ref/#state.EditorState.storedMarks) instead of a range of the
  document.
  */
  inline def toggleMark(markType: MarkType): Command = ^.asInstanceOf[js.Dynamic].applyDynamic("toggleMark")(markType.asInstanceOf[js.Any]).asInstanceOf[Command]
  inline def toggleMark(markType: MarkType, attrs: Attrs): Command = (^.asInstanceOf[js.Dynamic].applyDynamic("toggleMark")(markType.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Command]
  
  /**
  Wrap the selection in a node of the given type with the given
  attributes.
  */
  inline def wrapIn(nodeType: NodeType): Command = ^.asInstanceOf[js.Dynamic].applyDynamic("wrapIn")(nodeType.asInstanceOf[js.Any]).asInstanceOf[Command]
  inline def wrapIn(nodeType: NodeType, attrs: Attrs): Command = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapIn")(nodeType.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Command]
}
