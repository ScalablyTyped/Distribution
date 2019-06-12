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
  var addMark: slateDashReactLib.Fn_Mark = js.native
  var addMarkAtRange: slateDashReactLib.Fn_MarkRange = js.native
  var addMarkByKey: slateDashReactLib.Fn_Key = js.native
  var addMarkByPath: slateDashReactLib.Fn_Length = js.native
  var applyOperation: slateDashReactLib.Fn_Operation = js.native
  @JSName("blur")
  var blur_FEditor: slateDashReactLib.Fn_Controller = js.native
  var command: slateDashReactLib.Fn_Args = js.native
  var controller: slateLib.slateMod.Editor = js.native
  var deleteAtRange: slateDashReactLib.Fn_Range = js.native
  var deleteBackward: slateDashReactLib.Fn_N = js.native
  var deleteBackwardAtRange: slateDashReactLib.Fn_NRange = js.native
  var deleteCharBackwardAtRange: slateDashReactLib.Fn_Range = js.native
  var deleteCharForwardAtRange: slateDashReactLib.Fn_Range = js.native
  var deleteForward: slateDashReactLib.Fn_N = js.native
  var deleteForwardAtRange: slateDashReactLib.Fn_NRange = js.native
  var deleteLineBackwardAtRange: slateDashReactLib.Fn_Range = js.native
  var deleteLineForwardAtRange: slateDashReactLib.Fn_Range = js.native
  var deleteWordBackwardAtRange: slateDashReactLib.Fn_Range = js.native
  var deleteWordForwardAtRange: slateDashReactLib.Fn_Range = js.native
  @JSName("delete")
  var delete_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("deselect")
  var deselect_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("flip")
  var flip_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("focus")
  var focus_FEditor: slateDashReactLib.Fn_Controller = js.native
  var insertBlock: slateDashReactLib.Fn_Block = js.native
  var insertBlockAtRange: slateDashReactLib.Fn_BlockRange = js.native
  var insertFragment: slateDashReactLib.Fn_Fragment = js.native
  var insertFragmentAtRange: slateDashReactLib.Fn_FragmentKey = js.native
  var insertFragmentByKey: slateDashReactLib.Fn_FragmentIndex = js.native
  var insertFragmentByPath: slateDashReactLib.Fn_FragmentIndexKey = js.native
  var insertInline: slateDashReactLib.Fn_Inline = js.native
  var insertInlineAtRange: slateDashReactLib.Fn_InlineRange = js.native
  var insertNodeByKey: slateDashReactLib.Fn_Index = js.native
  var insertNodeByPath: slateDashReactLib.Fn_IndexNode = js.native
  var insertText: slateDashReactLib.Fn_Text = js.native
  var insertTextAtRange: slateDashReactLib.Fn_RangeText = js.native
  var insertTextByKey: slateDashReactLib.Fn_KeyMarks = js.native
  var insertTextByPath: slateDashReactLib.Fn_Marks = js.native
  var mergeNodeByKey: slateDashReactLib.Fn_KeyController = js.native
  var mergeNodeByPath: slateDashReactLib.Fn_Path = js.native
  @JSName("moveAnchorBackward")
  var moveAnchorBackward_FEditor: slateDashReactLib.Fn_NController = js.native
  var moveAnchorEndOfNode: slateDashReactLib.Fn_Node = js.native
  @JSName("moveAnchorForward")
  var moveAnchorForward_FEditor: slateDashReactLib.Fn_NController = js.native
  var moveAnchorTo: slateDashReactLib.Fn_Offset = js.native
  @JSName("moveAnchorToEndOfBlock")
  var moveAnchorToEndOfBlock_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveAnchorToEndOfDocument")
  var moveAnchorToEndOfDocument_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveAnchorToEndOfInline")
  var moveAnchorToEndOfInline_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveAnchorToEndOfNextBlock")
  var moveAnchorToEndOfNextBlock_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveAnchorToEndOfNextInline")
  var moveAnchorToEndOfNextInline_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveAnchorToEndOfNextText")
  var moveAnchorToEndOfNextText_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveAnchorToEndOfPreviousBlock")
  var moveAnchorToEndOfPreviousBlock_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveAnchorToEndOfPreviousInline")
  var moveAnchorToEndOfPreviousInline_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveAnchorToEndOfPreviousText")
  var moveAnchorToEndOfPreviousText_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveAnchorToEndOfText")
  var moveAnchorToEndOfText_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveAnchorToStartOfBlock")
  var moveAnchorToStartOfBlock_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveAnchorToStartOfDocument")
  var moveAnchorToStartOfDocument_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveAnchorToStartOfInline")
  var moveAnchorToStartOfInline_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveAnchorToStartOfNextBlock")
  var moveAnchorToStartOfNextBlock_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveAnchorToStartOfNextInline")
  var moveAnchorToStartOfNextInline_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveAnchorToStartOfNextText")
  var moveAnchorToStartOfNextText_FEditor: slateDashReactLib.Fn_Controller = js.native
  var moveAnchorToStartOfNode: slateDashReactLib.Fn_Node = js.native
  @JSName("moveAnchorToStartOfPreviousBlock")
  var moveAnchorToStartOfPreviousBlock_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveAnchorToStartOfPreviousInline")
  var moveAnchorToStartOfPreviousInline_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveAnchorToStartOfPreviousText")
  var moveAnchorToStartOfPreviousText_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveAnchorToStartOfText")
  var moveAnchorToStartOfText_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveBackward")
  var moveBackward_FEditor: slateDashReactLib.Fn_NController = js.native
  @JSName("moveEndBackward")
  var moveEndBackward_FEditor: slateDashReactLib.Fn_NController = js.native
  @JSName("moveEndForward")
  var moveEndForward_FEditor: slateDashReactLib.Fn_NController = js.native
  var moveEndTo: slateDashReactLib.Fn_Offset = js.native
  @JSName("moveEndToEndOfBlock")
  var moveEndToEndOfBlock_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveEndToEndOfDocument")
  var moveEndToEndOfDocument_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveEndToEndOfInline")
  var moveEndToEndOfInline_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveEndToEndOfNextBlock")
  var moveEndToEndOfNextBlock_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveEndToEndOfNextInline")
  var moveEndToEndOfNextInline_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveEndToEndOfNextText")
  var moveEndToEndOfNextText_FEditor: slateDashReactLib.Fn_Controller = js.native
  var moveEndToEndOfNode: slateDashReactLib.Fn_Node = js.native
  @JSName("moveEndToEndOfPreviousBlock")
  var moveEndToEndOfPreviousBlock_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveEndToEndOfPreviousInline")
  var moveEndToEndOfPreviousInline_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveEndToEndOfPreviousText")
  var moveEndToEndOfPreviousText_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveEndToEndOfText")
  var moveEndToEndOfText_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveEndToStartOfBlock")
  var moveEndToStartOfBlock_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveEndToStartOfDocument")
  var moveEndToStartOfDocument_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveEndToStartOfInline")
  var moveEndToStartOfInline_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveEndToStartOfNextBlock")
  var moveEndToStartOfNextBlock_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveEndToStartOfNextInline")
  var moveEndToStartOfNextInline_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveEndToStartOfNextText")
  var moveEndToStartOfNextText_FEditor: slateDashReactLib.Fn_Controller = js.native
  var moveEndToStartOfNode: slateDashReactLib.Fn_Node = js.native
  @JSName("moveEndToStartOfPreviousBlock")
  var moveEndToStartOfPreviousBlock_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveEndToStartOfPreviousInline")
  var moveEndToStartOfPreviousInline_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveEndToStartOfPreviousText")
  var moveEndToStartOfPreviousText_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveEndToStartOfText")
  var moveEndToStartOfText_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveFocusBackward")
  var moveFocusBackward_FEditor: slateDashReactLib.Fn_NController = js.native
  @JSName("moveFocusForward")
  var moveFocusForward_FEditor: slateDashReactLib.Fn_NController = js.native
  var moveFocusTo: slateDashReactLib.Fn_Offset = js.native
  @JSName("moveFocusToEndOfBlock")
  var moveFocusToEndOfBlock_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveFocusToEndOfDocument")
  var moveFocusToEndOfDocument_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveFocusToEndOfInline")
  var moveFocusToEndOfInline_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveFocusToEndOfNextBlock")
  var moveFocusToEndOfNextBlock_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveFocusToEndOfNextInline")
  var moveFocusToEndOfNextInline_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveFocusToEndOfNextText")
  var moveFocusToEndOfNextText_FEditor: slateDashReactLib.Fn_Controller = js.native
  var moveFocusToEndOfNode: slateDashReactLib.Fn_Node = js.native
  @JSName("moveFocusToEndOfPreviousBlock")
  var moveFocusToEndOfPreviousBlock_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveFocusToEndOfPreviousInline")
  var moveFocusToEndOfPreviousInline_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveFocusToEndOfPreviousText")
  var moveFocusToEndOfPreviousText_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveFocusToEndOfText")
  var moveFocusToEndOfText_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveFocusToStartOfBlock")
  var moveFocusToStartOfBlock_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveFocusToStartOfDocument")
  var moveFocusToStartOfDocument_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveFocusToStartOfInline")
  var moveFocusToStartOfInline_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveFocusToStartOfNextBlock")
  var moveFocusToStartOfNextBlock_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveFocusToStartOfNextInline")
  var moveFocusToStartOfNextInline_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveFocusToStartOfNextText")
  var moveFocusToStartOfNextText_FEditor: slateDashReactLib.Fn_Controller = js.native
  var moveFocusToStartOfNode: slateDashReactLib.Fn_Node = js.native
  @JSName("moveFocusToStartOfPreviousBlock")
  var moveFocusToStartOfPreviousBlock_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveFocusToStartOfPreviousInline")
  var moveFocusToStartOfPreviousInline_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveFocusToStartOfPreviousText")
  var moveFocusToStartOfPreviousText_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveFocusToStartOfText")
  var moveFocusToStartOfText_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveForward")
  var moveForward_FEditor: slateDashReactLib.Fn_NController = js.native
  var moveNodeByKey: slateDashReactLib.Fn_KeyNewIndex = js.native
  var moveNodeByPath: slateDashReactLib.Fn_NewIndex = js.native
  @JSName("moveStartBackward")
  var moveStartBackward_FEditor: slateDashReactLib.Fn_NController = js.native
  @JSName("moveStartForward")
  var moveStartForward_FEditor: slateDashReactLib.Fn_NController = js.native
  var moveStartTo: slateDashReactLib.Fn_NPath = js.native
  @JSName("moveStartToEndOfBlock")
  var moveStartToEndOfBlock_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveStartToEndOfDocument")
  var moveStartToEndOfDocument_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveStartToEndOfInline")
  var moveStartToEndOfInline_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveStartToEndOfNextBlock")
  var moveStartToEndOfNextBlock_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveStartToEndOfNextInline")
  var moveStartToEndOfNextInline_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveStartToEndOfNextText")
  var moveStartToEndOfNextText_FEditor: slateDashReactLib.Fn_Controller = js.native
  var moveStartToEndOfNode: slateDashReactLib.Fn_Node = js.native
  @JSName("moveStartToEndOfPreviousBlock")
  var moveStartToEndOfPreviousBlock_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveStartToEndOfPreviousInline")
  var moveStartToEndOfPreviousInline_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveStartToEndOfPreviousText")
  var moveStartToEndOfPreviousText_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveStartToEndOfText")
  var moveStartToEndOfText_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveStartToStartOfBlock")
  var moveStartToStartOfBlock_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveStartToStartOfDocument")
  var moveStartToStartOfDocument_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveStartToStartOfInline")
  var moveStartToStartOfInline_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveStartToStartOfNextBlock")
  var moveStartToStartOfNextBlock_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveStartToStartOfNextInline")
  var moveStartToStartOfNextInline_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveStartToStartOfNextText")
  var moveStartToStartOfNextText_FEditor: slateDashReactLib.Fn_Controller = js.native
  var moveStartToStartOfNode: slateDashReactLib.Fn_Node = js.native
  @JSName("moveStartToStartOfPreviousBlock")
  var moveStartToStartOfPreviousBlock_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveStartToStartOfPreviousInline")
  var moveStartToStartOfPreviousInline_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveStartToStartOfPreviousText")
  var moveStartToStartOfPreviousText_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveStartToStartOfText")
  var moveStartToStartOfText_FEditor: slateDashReactLib.Fn_Controller = js.native
  var moveTo: slateDashReactLib.Fn_Offset = js.native
  @JSName("moveToAnchor")
  var moveToAnchor_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveToEndOfBlock")
  var moveToEndOfBlock_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveToEndOfDocument")
  var moveToEndOfDocument_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveToEndOfInline")
  var moveToEndOfInline_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveToEndOfNextBlock")
  var moveToEndOfNextBlock_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveToEndOfNextInline")
  var moveToEndOfNextInline_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveToEndOfNextText")
  var moveToEndOfNextText_FEditor: slateDashReactLib.Fn_Controller = js.native
  var moveToEndOfNode: slateDashReactLib.Fn_Node = js.native
  @JSName("moveToEndOfPreviousBlock")
  var moveToEndOfPreviousBlock_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveToEndOfPreviousInline")
  var moveToEndOfPreviousInline_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveToEndOfPreviousText")
  var moveToEndOfPreviousText_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveToEndOfText")
  var moveToEndOfText_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveToEnd")
  var moveToEnd_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveToFocus")
  var moveToFocus_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveToRangeOfDocument")
  var moveToRangeOfDocument_FEditor: slateDashReactLib.Fn_Controller = js.native
  var moveToRangeOfNode: slateDashReactLib.Fn_Node = js.native
  @JSName("moveToStartOfBlock")
  var moveToStartOfBlock_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveToStartOfDocument")
  var moveToStartOfDocument_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveToStartOfInline")
  var moveToStartOfInline_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveToStartOfNextBlock")
  var moveToStartOfNextBlock_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveToStartOfNextInline")
  var moveToStartOfNextInline_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveToStartOfNextText")
  var moveToStartOfNextText_FEditor: slateDashReactLib.Fn_Controller = js.native
  var moveToStartOfNode: slateDashReactLib.Fn_Node = js.native
  @JSName("moveToStartOfPreviousBlock")
  var moveToStartOfPreviousBlock_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveToStartOfPreviousInline")
  var moveToStartOfPreviousInline_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveToStartOfPreviousText")
  var moveToStartOfPreviousText_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveToStartOfText")
  var moveToStartOfText_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("moveToStart")
  var moveToStart_FEditor: slateDashReactLib.Fn_Controller = js.native
  @JSName("normalize")
  var normalize_FEditor: slateDashReactLib.Fn_Controller = js.native
  val operations: immutableLib.immutableMod.List[slateLib.slateMod.Operation] = js.native
  val plugins: js.Array[Plugin] = js.native
  var query: slateDashReactLib.Fn_ArgsQuery = js.native
  val readOnly: scala.Boolean = js.native
  @JSName("redo")
  var redo_FEditor: slateDashReactLib.Fn_Controller = js.native
  var registerCommand: slateDashReactLib.Fn_Command = js.native
  var registerQuery: slateDashReactLib.Fn_Query = js.native
  var removeMark: slateDashReactLib.Fn_Mark = js.native
  var removeMarkAtRange: slateDashReactLib.Fn_MarkRange = js.native
  var removeMarkByKey: slateDashReactLib.Fn_KeyLength = js.native
  var removeMarkByPath: slateDashReactLib.Fn_Length = js.native
  var removeNodeByKey: slateDashReactLib.Fn_KeyController = js.native
  var removeNodeByPath: slateDashReactLib.Fn_Path = js.native
  var removeTextByKey: slateDashReactLib.Fn_KeyLengthOffset = js.native
  var removeTextByPath: slateDashReactLib.Fn_LengthOffset = js.native
  var replaceMark: slateDashReactLib.Fn_MarkNewMark = js.native
  var replaceNodeByKey: slateDashReactLib.Fn_KeyNode = js.native
  var replaceNodeByPath: slateDashReactLib.Fn_NewNode = js.native
  var run: slateDashReactLib.Fn_ArgsKey = js.native
  var select: slateDashReactLib.Fn_PropertiesControllerEditor = js.native
  var setBlocks: slateDashReactLib.Fn_Properties = js.native
  var setBlocksAtRange: slateDashReactLib.Fn_PropertiesRange = js.native
  var setDecorations: slateDashReactLib.Fn_Decorations = js.native
  var setInlines: slateDashReactLib.Fn_PropertiesController = js.native
  var setInlinesAtRange: slateDashReactLib.Fn_PropertiesRangeController = js.native
  var setMarkByKey: slateDashReactLib.Fn_KeyLengthMark = js.native
  var setMarksByPath: slateDashReactLib.Fn_LengthMark = js.native
  var setNodeByKey: slateDashReactLib.Fn_KeyProperties = js.native
  var setNodeByPath: slateDashReactLib.Fn_PathProperties = js.native
  @JSName("snapshotSelection")
  var snapshotSelection_FEditor: slateDashReactLib.Fn_Controller = js.native
  var splitBlock: slateDashReactLib.Fn_Depth = js.native
  var splitBlockAtRange: slateDashReactLib.Fn_DepthRange = js.native
  var splitInline: slateDashReactLib.Fn_Depth = js.native
  var splitInlineAtRange: slateDashReactLib.Fn_DepthRange = js.native
  var splitNodeByKey: slateDashReactLib.Fn_KeyOffset = js.native
  var splitNodeByPath: slateDashReactLib.Fn_PathPosition = js.native
  var toggleMark: slateDashReactLib.Fn_Mark = js.native
  var toggleMarkAtRange: slateDashReactLib.Fn_MarkRange = js.native
  @JSName("undo")
  var undo_FEditor: slateDashReactLib.Fn_Controller = js.native
  var unwrapBlock: slateDashReactLib.Fn_Properties = js.native
  var unwrapBlockAtRange: slateDashReactLib.Fn_PropertiesRange = js.native
  var unwrapBlockByKey: slateDashReactLib.Fn_KeyPropertiesBlockProperties = js.native
  var unwrapBlockByPath: slateDashReactLib.Fn_PathPropertiesBlockProperties = js.native
  var unwrapInline: slateDashReactLib.Fn_PropertiesController = js.native
  var unwrapInlineAtRange: slateDashReactLib.Fn_PropertiesRangeController = js.native
  var unwrapInlineByKey: slateDashReactLib.Fn_KeyPropertiesController = js.native
  var unwrapInlineByPath: slateDashReactLib.Fn_PathPropertiesController = js.native
  var unwrapNodeByKey: slateDashReactLib.Fn_KeyController = js.native
  var unwrapNodeByPath: slateDashReactLib.Fn_Path = js.native
  val value: slateLib.slateMod.Value = js.native
  var withoutMerging: slateDashReactLib.Fn_Fn = js.native
  var withoutNormalizing: slateDashReactLib.Fn_Fn = js.native
  var withoutSaving: slateDashReactLib.Fn_Fn = js.native
  var wrapBlock: slateDashReactLib.Fn_Properties = js.native
  var wrapBlockAtRange: slateDashReactLib.Fn_PropertiesRange = js.native
  var wrapBlockByKey: slateDashReactLib.Fn_KeyPropertiesBlockProperties = js.native
  var wrapBlockByPath: slateDashReactLib.Fn_BlockPath = js.native
  var wrapInline: slateDashReactLib.Fn_PropertiesController = js.native
  var wrapInlineAtRange: slateDashReactLib.Fn_PropertiesRangeController = js.native
  var wrapInlineByKey: slateDashReactLib.Fn_KeyPropertiesController = js.native
  var wrapInlineByPath: slateDashReactLib.Fn_PathPropertiesController = js.native
  var wrapNodeByKey: slateDashReactLib.Fn_KeyParent = js.native
  var wrapNodeByPath: slateDashReactLib.Fn_Parent = js.native
  var wrapText: slateDashReactLib.Fn_Prefix = js.native
  var wrapTextAtRange: slateDashReactLib.Fn_PrefixRange = js.native
  // Instance methods
  def resolveController(
    plugins: js.Array[Plugin],
    schema: slateLib.slateMod.SchemaProperties,
    commands: js.Array[_],
    queries: js.Array[_]
  ): scala.Unit = js.native
}

