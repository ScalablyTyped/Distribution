package typings
package slateDashReactLib.slateDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate-react", "Editor")
@js.native
class Editor ()
  extends reactLib.reactMod.Component[EditorProps, EditorState, js.Any]
     with slateLib.slateMod.Controller {
  // Controller
  var addMark: slateDashReactLib.Anon_Mark = js.native
  var addMarkAtRange: slateDashReactLib.Anon_MarkRange = js.native
  var addMarkByKey: slateDashReactLib.Anon_Key = js.native
  var addMarkByPath: slateDashReactLib.Anon_Length = js.native
  var applyOperation: slateDashReactLib.Anon_Operation = js.native
  @JSName("blur")
  var blur_FEditor: slateDashReactLib.Anon_Controller = js.native
  var command: slateDashReactLib.Anon_Args = js.native
  var controller: slateLib.slateMod.Editor = js.native
  var deleteAtRange: slateDashReactLib.Anon_Range = js.native
  var deleteBackward: slateDashReactLib.Anon_N = js.native
  var deleteBackwardAtRange: slateDashReactLib.Anon_NRange = js.native
  var deleteCharBackwardAtRange: slateDashReactLib.Anon_Range = js.native
  var deleteCharForwardAtRange: slateDashReactLib.Anon_Range = js.native
  var deleteForward: slateDashReactLib.Anon_N = js.native
  var deleteForwardAtRange: slateDashReactLib.Anon_NRange = js.native
  var deleteLineBackwardAtRange: slateDashReactLib.Anon_Range = js.native
  var deleteLineForwardAtRange: slateDashReactLib.Anon_Range = js.native
  var deleteWordBackwardAtRange: slateDashReactLib.Anon_Range = js.native
  var deleteWordForwardAtRange: slateDashReactLib.Anon_Range = js.native
  @JSName("delete")
  var delete_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("deselect")
  var deselect_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("flip")
  var flip_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("focus")
  var focus_FEditor: slateDashReactLib.Anon_Controller = js.native
  var insertBlock: slateDashReactLib.Anon_Block = js.native
  var insertBlockAtRange: slateDashReactLib.Anon_BlockRange = js.native
  var insertFragment: slateDashReactLib.Anon_Fragment = js.native
  var insertFragmentAtRange: slateDashReactLib.Anon_FragmentKey = js.native
  var insertFragmentByKey: slateDashReactLib.Anon_FragmentIndex = js.native
  var insertFragmentByPath: slateDashReactLib.Anon_FragmentIndexKey = js.native
  var insertInline: slateDashReactLib.Anon_Inline = js.native
  var insertInlineAtRange: slateDashReactLib.Anon_InlineRange = js.native
  var insertNodeByKey: slateDashReactLib.Anon_Index = js.native
  var insertNodeByPath: slateDashReactLib.Anon_IndexNode = js.native
  var insertText: slateDashReactLib.Anon_Text = js.native
  var insertTextAtRange: slateDashReactLib.Anon_RangeText = js.native
  var insertTextByKey: slateDashReactLib.Anon_KeyMarks = js.native
  var insertTextByPath: slateDashReactLib.Anon_Marks = js.native
  var mergeNodeByKey: slateDashReactLib.Anon_KeyController = js.native
  var mergeNodeByPath: slateDashReactLib.Anon_Path = js.native
  @JSName("moveAnchorBackward")
  var moveAnchorBackward_FEditor: slateDashReactLib.Anon_NController = js.native
  var moveAnchorEndOfNode: slateDashReactLib.Anon_Node = js.native
  @JSName("moveAnchorForward")
  var moveAnchorForward_FEditor: slateDashReactLib.Anon_NController = js.native
  var moveAnchorTo: slateDashReactLib.Anon_Offset = js.native
  @JSName("moveAnchorToEndOfBlock")
  var moveAnchorToEndOfBlock_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToEndOfDocument")
  var moveAnchorToEndOfDocument_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToEndOfInline")
  var moveAnchorToEndOfInline_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToEndOfNextBlock")
  var moveAnchorToEndOfNextBlock_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToEndOfNextInline")
  var moveAnchorToEndOfNextInline_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToEndOfNextText")
  var moveAnchorToEndOfNextText_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToEndOfPreviousBlock")
  var moveAnchorToEndOfPreviousBlock_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToEndOfPreviousInline")
  var moveAnchorToEndOfPreviousInline_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToEndOfPreviousText")
  var moveAnchorToEndOfPreviousText_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToEndOfText")
  var moveAnchorToEndOfText_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToStartOfBlock")
  var moveAnchorToStartOfBlock_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToStartOfDocument")
  var moveAnchorToStartOfDocument_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToStartOfInline")
  var moveAnchorToStartOfInline_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToStartOfNextBlock")
  var moveAnchorToStartOfNextBlock_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToStartOfNextInline")
  var moveAnchorToStartOfNextInline_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToStartOfNextText")
  var moveAnchorToStartOfNextText_FEditor: slateDashReactLib.Anon_Controller = js.native
  var moveAnchorToStartOfNode: slateDashReactLib.Anon_Node = js.native
  @JSName("moveAnchorToStartOfPreviousBlock")
  var moveAnchorToStartOfPreviousBlock_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToStartOfPreviousInline")
  var moveAnchorToStartOfPreviousInline_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToStartOfPreviousText")
  var moveAnchorToStartOfPreviousText_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToStartOfText")
  var moveAnchorToStartOfText_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveBackward")
  var moveBackward_FEditor: slateDashReactLib.Anon_NController = js.native
  @JSName("moveEndBackward")
  var moveEndBackward_FEditor: slateDashReactLib.Anon_NController = js.native
  @JSName("moveEndForward")
  var moveEndForward_FEditor: slateDashReactLib.Anon_NController = js.native
  var moveEndTo: slateDashReactLib.Anon_Offset = js.native
  @JSName("moveEndToEndOfBlock")
  var moveEndToEndOfBlock_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToEndOfDocument")
  var moveEndToEndOfDocument_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToEndOfInline")
  var moveEndToEndOfInline_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToEndOfNextBlock")
  var moveEndToEndOfNextBlock_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToEndOfNextInline")
  var moveEndToEndOfNextInline_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToEndOfNextText")
  var moveEndToEndOfNextText_FEditor: slateDashReactLib.Anon_Controller = js.native
  var moveEndToEndOfNode: slateDashReactLib.Anon_Node = js.native
  @JSName("moveEndToEndOfPreviousBlock")
  var moveEndToEndOfPreviousBlock_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToEndOfPreviousInline")
  var moveEndToEndOfPreviousInline_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToEndOfPreviousText")
  var moveEndToEndOfPreviousText_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToEndOfText")
  var moveEndToEndOfText_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToStartOfBlock")
  var moveEndToStartOfBlock_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToStartOfDocument")
  var moveEndToStartOfDocument_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToStartOfInline")
  var moveEndToStartOfInline_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToStartOfNextBlock")
  var moveEndToStartOfNextBlock_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToStartOfNextInline")
  var moveEndToStartOfNextInline_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToStartOfNextText")
  var moveEndToStartOfNextText_FEditor: slateDashReactLib.Anon_Controller = js.native
  var moveEndToStartOfNode: slateDashReactLib.Anon_Node = js.native
  @JSName("moveEndToStartOfPreviousBlock")
  var moveEndToStartOfPreviousBlock_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToStartOfPreviousInline")
  var moveEndToStartOfPreviousInline_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToStartOfPreviousText")
  var moveEndToStartOfPreviousText_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToStartOfText")
  var moveEndToStartOfText_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusBackward")
  var moveFocusBackward_FEditor: slateDashReactLib.Anon_NController = js.native
  @JSName("moveFocusForward")
  var moveFocusForward_FEditor: slateDashReactLib.Anon_NController = js.native
  var moveFocusTo: slateDashReactLib.Anon_Offset = js.native
  @JSName("moveFocusToEndOfBlock")
  var moveFocusToEndOfBlock_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToEndOfDocument")
  var moveFocusToEndOfDocument_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToEndOfInline")
  var moveFocusToEndOfInline_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToEndOfNextBlock")
  var moveFocusToEndOfNextBlock_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToEndOfNextInline")
  var moveFocusToEndOfNextInline_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToEndOfNextText")
  var moveFocusToEndOfNextText_FEditor: slateDashReactLib.Anon_Controller = js.native
  var moveFocusToEndOfNode: slateDashReactLib.Anon_Node = js.native
  @JSName("moveFocusToEndOfPreviousBlock")
  var moveFocusToEndOfPreviousBlock_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToEndOfPreviousInline")
  var moveFocusToEndOfPreviousInline_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToEndOfPreviousText")
  var moveFocusToEndOfPreviousText_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToEndOfText")
  var moveFocusToEndOfText_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToStartOfBlock")
  var moveFocusToStartOfBlock_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToStartOfDocument")
  var moveFocusToStartOfDocument_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToStartOfInline")
  var moveFocusToStartOfInline_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToStartOfNextBlock")
  var moveFocusToStartOfNextBlock_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToStartOfNextInline")
  var moveFocusToStartOfNextInline_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToStartOfNextText")
  var moveFocusToStartOfNextText_FEditor: slateDashReactLib.Anon_Controller = js.native
  var moveFocusToStartOfNode: slateDashReactLib.Anon_Node = js.native
  @JSName("moveFocusToStartOfPreviousBlock")
  var moveFocusToStartOfPreviousBlock_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToStartOfPreviousInline")
  var moveFocusToStartOfPreviousInline_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToStartOfPreviousText")
  var moveFocusToStartOfPreviousText_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToStartOfText")
  var moveFocusToStartOfText_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveForward")
  var moveForward_FEditor: slateDashReactLib.Anon_NController = js.native
  var moveNodeByKey: slateDashReactLib.Anon_KeyNewIndex = js.native
  var moveNodeByPath: slateDashReactLib.Anon_NewIndex = js.native
  @JSName("moveStartBackward")
  var moveStartBackward_FEditor: slateDashReactLib.Anon_NController = js.native
  @JSName("moveStartForward")
  var moveStartForward_FEditor: slateDashReactLib.Anon_NController = js.native
  var moveStartTo: slateDashReactLib.Anon_NPath = js.native
  @JSName("moveStartToEndOfBlock")
  var moveStartToEndOfBlock_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToEndOfDocument")
  var moveStartToEndOfDocument_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToEndOfInline")
  var moveStartToEndOfInline_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToEndOfNextBlock")
  var moveStartToEndOfNextBlock_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToEndOfNextInline")
  var moveStartToEndOfNextInline_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToEndOfNextText")
  var moveStartToEndOfNextText_FEditor: slateDashReactLib.Anon_Controller = js.native
  var moveStartToEndOfNode: slateDashReactLib.Anon_Node = js.native
  @JSName("moveStartToEndOfPreviousBlock")
  var moveStartToEndOfPreviousBlock_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToEndOfPreviousInline")
  var moveStartToEndOfPreviousInline_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToEndOfPreviousText")
  var moveStartToEndOfPreviousText_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToEndOfText")
  var moveStartToEndOfText_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToStartOfBlock")
  var moveStartToStartOfBlock_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToStartOfDocument")
  var moveStartToStartOfDocument_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToStartOfInline")
  var moveStartToStartOfInline_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToStartOfNextBlock")
  var moveStartToStartOfNextBlock_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToStartOfNextInline")
  var moveStartToStartOfNextInline_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToStartOfNextText")
  var moveStartToStartOfNextText_FEditor: slateDashReactLib.Anon_Controller = js.native
  var moveStartToStartOfNode: slateDashReactLib.Anon_Node = js.native
  @JSName("moveStartToStartOfPreviousBlock")
  var moveStartToStartOfPreviousBlock_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToStartOfPreviousInline")
  var moveStartToStartOfPreviousInline_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToStartOfPreviousText")
  var moveStartToStartOfPreviousText_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToStartOfText")
  var moveStartToStartOfText_FEditor: slateDashReactLib.Anon_Controller = js.native
  var moveTo: slateDashReactLib.Anon_Offset = js.native
  @JSName("moveToAnchor")
  var moveToAnchor_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToEndOfBlock")
  var moveToEndOfBlock_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToEndOfDocument")
  var moveToEndOfDocument_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToEndOfInline")
  var moveToEndOfInline_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToEndOfNextBlock")
  var moveToEndOfNextBlock_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToEndOfNextInline")
  var moveToEndOfNextInline_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToEndOfNextText")
  var moveToEndOfNextText_FEditor: slateDashReactLib.Anon_Controller = js.native
  var moveToEndOfNode: slateDashReactLib.Anon_Node = js.native
  @JSName("moveToEndOfPreviousBlock")
  var moveToEndOfPreviousBlock_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToEndOfPreviousInline")
  var moveToEndOfPreviousInline_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToEndOfPreviousText")
  var moveToEndOfPreviousText_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToEndOfText")
  var moveToEndOfText_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToEnd")
  var moveToEnd_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToFocus")
  var moveToFocus_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToRangeOfDocument")
  var moveToRangeOfDocument_FEditor: slateDashReactLib.Anon_Controller = js.native
  var moveToRangeOfNode: slateDashReactLib.Anon_Node = js.native
  @JSName("moveToStartOfBlock")
  var moveToStartOfBlock_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToStartOfDocument")
  var moveToStartOfDocument_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToStartOfInline")
  var moveToStartOfInline_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToStartOfNextBlock")
  var moveToStartOfNextBlock_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToStartOfNextInline")
  var moveToStartOfNextInline_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToStartOfNextText")
  var moveToStartOfNextText_FEditor: slateDashReactLib.Anon_Controller = js.native
  var moveToStartOfNode: slateDashReactLib.Anon_Node = js.native
  @JSName("moveToStartOfPreviousBlock")
  var moveToStartOfPreviousBlock_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToStartOfPreviousInline")
  var moveToStartOfPreviousInline_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToStartOfPreviousText")
  var moveToStartOfPreviousText_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToStartOfText")
  var moveToStartOfText_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToStart")
  var moveToStart_FEditor: slateDashReactLib.Anon_Controller = js.native
  @JSName("normalize")
  var normalize_FEditor: slateDashReactLib.Anon_Controller = js.native
  val operations: immutableLib.immutableMod.List[slateLib.slateMod.Operation] = js.native
  val plugins: js.Array[Plugin] = js.native
  var query: js.Function2[/* query */ java.lang.String, /* repeated */ js.Any, _] = js.native
  val readOnly: scala.Boolean = js.native
  @JSName("redo")
  var redo_FEditor: slateDashReactLib.Anon_Controller = js.native
  var registerCommand: slateDashReactLib.Anon_Command = js.native
  var registerQuery: slateDashReactLib.Anon_Query = js.native
  var removeMark: slateDashReactLib.Anon_Mark = js.native
  var removeMarkAtRange: slateDashReactLib.Anon_MarkRange = js.native
  var removeMarkByKey: slateDashReactLib.Anon_KeyLength = js.native
  var removeMarkByPath: slateDashReactLib.Anon_Length = js.native
  var removeNodeByKey: slateDashReactLib.Anon_KeyController = js.native
  var removeNodeByPath: slateDashReactLib.Anon_Path = js.native
  var removeTextByKey: slateDashReactLib.Anon_KeyLengthOffset = js.native
  var removeTextByPath: slateDashReactLib.Anon_LengthOffset = js.native
  var replaceMark: slateDashReactLib.Anon_MarkNewMark = js.native
  var replaceNodeByKey: slateDashReactLib.Anon_KeyNode = js.native
  var replaceNodeByPath: slateDashReactLib.Anon_NewNode = js.native
  var run: slateDashReactLib.Anon_Args = js.native
  var select: slateDashReactLib.Anon_PropertiesControllerEditor = js.native
  var setBlocks: slateDashReactLib.Anon_Properties = js.native
  var setBlocksAtRange: slateDashReactLib.Anon_PropertiesRange = js.native
  var setDecorations: slateDashReactLib.Anon_Decorations = js.native
  var setInlines: slateDashReactLib.Anon_PropertiesController = js.native
  var setInlinesAtRange: slateDashReactLib.Anon_PropertiesRangeController = js.native
  var setMarkByKey: slateDashReactLib.Anon_KeyLengthMark = js.native
  var setMarksByPath: slateDashReactLib.Anon_LengthMark = js.native
  var setNodeByKey: slateDashReactLib.Anon_KeyProperties = js.native
  var setNodeByPath: slateDashReactLib.Anon_PathProperties = js.native
  @JSName("snapshotSelection")
  var snapshotSelection_FEditor: slateDashReactLib.Anon_Controller = js.native
  var splitBlock: slateDashReactLib.Anon_Depth = js.native
  var splitBlockAtRange: slateDashReactLib.Anon_DepthRange = js.native
  var splitInline: slateDashReactLib.Anon_Depth = js.native
  var splitInlineAtRange: slateDashReactLib.Anon_DepthRange = js.native
  var splitNodeByKey: slateDashReactLib.Anon_KeyOffset = js.native
  var splitNodeByPath: slateDashReactLib.Anon_PathPosition = js.native
  var toggleMark: slateDashReactLib.Anon_Mark = js.native
  var toggleMarkAtRange: slateDashReactLib.Anon_MarkRange = js.native
  @JSName("undo")
  var undo_FEditor: slateDashReactLib.Anon_Controller = js.native
  var unwrapBlock: slateDashReactLib.Anon_Properties = js.native
  var unwrapBlockAtRange: slateDashReactLib.Anon_PropertiesRange = js.native
  var unwrapBlockByKey: slateDashReactLib.Anon_KeyPropertiesBlockProperties = js.native
  var unwrapBlockByPath: slateDashReactLib.Anon_PathPropertiesBlockProperties = js.native
  var unwrapInline: slateDashReactLib.Anon_PropertiesController = js.native
  var unwrapInlineAtRange: slateDashReactLib.Anon_PropertiesRangeController = js.native
  var unwrapInlineByKey: slateDashReactLib.Anon_KeyPropertiesController = js.native
  var unwrapInlineByPath: slateDashReactLib.Anon_PathPropertiesController = js.native
  var unwrapNodeByKey: slateDashReactLib.Anon_KeyController = js.native
  var unwrapNodeByPath: slateDashReactLib.Anon_Path = js.native
  val value: slateLib.slateMod.Value = js.native
  var withoutMerging: slateDashReactLib.Anon_Fn = js.native
  var withoutNormalizing: slateDashReactLib.Anon_Fn = js.native
  var withoutSaving: slateDashReactLib.Anon_Fn = js.native
  var wrapBlock: slateDashReactLib.Anon_Properties = js.native
  var wrapBlockAtRange: slateDashReactLib.Anon_PropertiesRange = js.native
  var wrapBlockByKey: slateDashReactLib.Anon_KeyPropertiesBlockProperties = js.native
  var wrapBlockByPath: slateDashReactLib.Anon_BlockPath = js.native
  var wrapInline: slateDashReactLib.Anon_PropertiesController = js.native
  var wrapInlineAtRange: slateDashReactLib.Anon_PropertiesRangeController = js.native
  var wrapInlineByKey: slateDashReactLib.Anon_KeyPropertiesController = js.native
  var wrapInlineByPath: slateDashReactLib.Anon_PathPropertiesController = js.native
  var wrapNodeByKey: slateDashReactLib.Anon_KeyParent = js.native
  var wrapNodeByPath: slateDashReactLib.Anon_Parent = js.native
  var wrapText: slateDashReactLib.Anon_Prefix = js.native
  var wrapTextAtRange: slateDashReactLib.Anon_PrefixRange = js.native
  // Instance methods
  def resolveController(
    plugins: js.Array[Plugin],
    schema: slateLib.slateMod.SchemaProperties,
    commands: js.Array[_],
    queries: js.Array[_]
  ): scala.Unit = js.native
}

