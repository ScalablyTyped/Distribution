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
  @JSName("addMarkAtRange")
  var addMarkAtRange_Original: slateDashReactLib.Anon_MarkRange = js.native
  @JSName("addMarkByKey")
  var addMarkByKey_Original: slateDashReactLib.Anon_Key = js.native
  @JSName("addMarkByPath")
  var addMarkByPath_Original: slateDashReactLib.Anon_Length = js.native
  // Controller
  @JSName("addMark")
  var addMark_Original: slateDashReactLib.Anon_Mark = js.native
  @JSName("applyOperation")
  var applyOperation_Original: slateDashReactLib.Anon_Operation = js.native
  @JSName("blur")
  var blur_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("command")
  var command_Original: slateDashReactLib.Anon_Args = js.native
  var controller: slateLib.slateMod.Editor = js.native
  @JSName("deleteAtRange")
  var deleteAtRange_Original: slateDashReactLib.Anon_Range = js.native
  @JSName("deleteBackwardAtRange")
  var deleteBackwardAtRange_Original: slateDashReactLib.Anon_NRange = js.native
  @JSName("deleteBackward")
  var deleteBackward_Original: slateDashReactLib.Anon_N = js.native
  @JSName("deleteCharBackwardAtRange")
  var deleteCharBackwardAtRange_Original: slateDashReactLib.Anon_Range = js.native
  @JSName("deleteCharForwardAtRange")
  var deleteCharForwardAtRange_Original: slateDashReactLib.Anon_Range = js.native
  @JSName("deleteForwardAtRange")
  var deleteForwardAtRange_Original: slateDashReactLib.Anon_NRange = js.native
  @JSName("deleteForward")
  var deleteForward_Original: slateDashReactLib.Anon_N = js.native
  @JSName("deleteLineBackwardAtRange")
  var deleteLineBackwardAtRange_Original: slateDashReactLib.Anon_Range = js.native
  @JSName("deleteLineForwardAtRange")
  var deleteLineForwardAtRange_Original: slateDashReactLib.Anon_Range = js.native
  @JSName("deleteWordBackwardAtRange")
  var deleteWordBackwardAtRange_Original: slateDashReactLib.Anon_Range = js.native
  @JSName("deleteWordForwardAtRange")
  var deleteWordForwardAtRange_Original: slateDashReactLib.Anon_Range = js.native
  @JSName("delete")
  var delete_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("deselect")
  var deselect_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("flip")
  var flip_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("focus")
  var focus_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("insertBlockAtRange")
  var insertBlockAtRange_Original: slateDashReactLib.Anon_BlockRange = js.native
  @JSName("insertBlock")
  var insertBlock_Original: slateDashReactLib.Anon_Block = js.native
  @JSName("insertFragmentAtRange")
  var insertFragmentAtRange_Original: slateDashReactLib.Anon_FragmentKey = js.native
  @JSName("insertFragmentByKey")
  var insertFragmentByKey_Original: slateDashReactLib.Anon_FragmentIndex = js.native
  @JSName("insertFragmentByPath")
  var insertFragmentByPath_Original: slateDashReactLib.Anon_FragmentIndexKey = js.native
  @JSName("insertFragment")
  var insertFragment_Original: slateDashReactLib.Anon_Fragment = js.native
  @JSName("insertInlineAtRange")
  var insertInlineAtRange_Original: slateDashReactLib.Anon_InlineRange = js.native
  @JSName("insertInline")
  var insertInline_Original: slateDashReactLib.Anon_Inline = js.native
  @JSName("insertNodeByKey")
  var insertNodeByKey_Original: slateDashReactLib.Anon_Index = js.native
  @JSName("insertNodeByPath")
  var insertNodeByPath_Original: slateDashReactLib.Anon_IndexNode = js.native
  @JSName("insertTextAtRange")
  var insertTextAtRange_Original: slateDashReactLib.Anon_RangeText = js.native
  @JSName("insertTextByKey")
  var insertTextByKey_Original: slateDashReactLib.Anon_KeyMarks = js.native
  @JSName("insertTextByPath")
  var insertTextByPath_Original: slateDashReactLib.Anon_Marks = js.native
  @JSName("insertText")
  var insertText_Original: slateDashReactLib.Anon_Text = js.native
  @JSName("mergeNodeByKey")
  var mergeNodeByKey_Original: slateDashReactLib.Anon_KeyController = js.native
  @JSName("mergeNodeByPath")
  var mergeNodeByPath_Original: slateDashReactLib.Anon_Path = js.native
  @JSName("moveAnchorBackward")
  var moveAnchorBackward_Original: slateDashReactLib.Anon_NController = js.native
  @JSName("moveAnchorEndOfNode")
  var moveAnchorEndOfNode_Original: slateDashReactLib.Anon_Node = js.native
  @JSName("moveAnchorForward")
  var moveAnchorForward_Original: slateDashReactLib.Anon_NController = js.native
  @JSName("moveAnchorToEndOfBlock")
  var moveAnchorToEndOfBlock_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToEndOfDocument")
  var moveAnchorToEndOfDocument_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToEndOfInline")
  var moveAnchorToEndOfInline_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToEndOfNextBlock")
  var moveAnchorToEndOfNextBlock_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToEndOfNextInline")
  var moveAnchorToEndOfNextInline_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToEndOfNextText")
  var moveAnchorToEndOfNextText_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToEndOfPreviousBlock")
  var moveAnchorToEndOfPreviousBlock_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToEndOfPreviousInline")
  var moveAnchorToEndOfPreviousInline_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToEndOfPreviousText")
  var moveAnchorToEndOfPreviousText_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToEndOfText")
  var moveAnchorToEndOfText_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToStartOfBlock")
  var moveAnchorToStartOfBlock_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToStartOfDocument")
  var moveAnchorToStartOfDocument_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToStartOfInline")
  var moveAnchorToStartOfInline_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToStartOfNextBlock")
  var moveAnchorToStartOfNextBlock_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToStartOfNextInline")
  var moveAnchorToStartOfNextInline_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToStartOfNextText")
  var moveAnchorToStartOfNextText_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToStartOfNode")
  var moveAnchorToStartOfNode_Original: slateDashReactLib.Anon_Node = js.native
  @JSName("moveAnchorToStartOfPreviousBlock")
  var moveAnchorToStartOfPreviousBlock_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToStartOfPreviousInline")
  var moveAnchorToStartOfPreviousInline_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToStartOfPreviousText")
  var moveAnchorToStartOfPreviousText_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorToStartOfText")
  var moveAnchorToStartOfText_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveAnchorTo")
  var moveAnchorTo_Original: slateDashReactLib.Anon_Offset = js.native
  @JSName("moveBackward")
  var moveBackward_Original: slateDashReactLib.Anon_NController = js.native
  @JSName("moveEndBackward")
  var moveEndBackward_Original: slateDashReactLib.Anon_NController = js.native
  @JSName("moveEndForward")
  var moveEndForward_Original: slateDashReactLib.Anon_NController = js.native
  @JSName("moveEndToEndOfBlock")
  var moveEndToEndOfBlock_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToEndOfDocument")
  var moveEndToEndOfDocument_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToEndOfInline")
  var moveEndToEndOfInline_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToEndOfNextBlock")
  var moveEndToEndOfNextBlock_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToEndOfNextInline")
  var moveEndToEndOfNextInline_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToEndOfNextText")
  var moveEndToEndOfNextText_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToEndOfNode")
  var moveEndToEndOfNode_Original: slateDashReactLib.Anon_Node = js.native
  @JSName("moveEndToEndOfPreviousBlock")
  var moveEndToEndOfPreviousBlock_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToEndOfPreviousInline")
  var moveEndToEndOfPreviousInline_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToEndOfPreviousText")
  var moveEndToEndOfPreviousText_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToEndOfText")
  var moveEndToEndOfText_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToStartOfBlock")
  var moveEndToStartOfBlock_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToStartOfDocument")
  var moveEndToStartOfDocument_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToStartOfInline")
  var moveEndToStartOfInline_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToStartOfNextBlock")
  var moveEndToStartOfNextBlock_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToStartOfNextInline")
  var moveEndToStartOfNextInline_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToStartOfNextText")
  var moveEndToStartOfNextText_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToStartOfNode")
  var moveEndToStartOfNode_Original: slateDashReactLib.Anon_Node = js.native
  @JSName("moveEndToStartOfPreviousBlock")
  var moveEndToStartOfPreviousBlock_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToStartOfPreviousInline")
  var moveEndToStartOfPreviousInline_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToStartOfPreviousText")
  var moveEndToStartOfPreviousText_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndToStartOfText")
  var moveEndToStartOfText_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveEndTo")
  var moveEndTo_Original: slateDashReactLib.Anon_Offset = js.native
  @JSName("moveFocusBackward")
  var moveFocusBackward_Original: slateDashReactLib.Anon_NController = js.native
  @JSName("moveFocusForward")
  var moveFocusForward_Original: slateDashReactLib.Anon_NController = js.native
  @JSName("moveFocusToEndOfBlock")
  var moveFocusToEndOfBlock_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToEndOfDocument")
  var moveFocusToEndOfDocument_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToEndOfInline")
  var moveFocusToEndOfInline_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToEndOfNextBlock")
  var moveFocusToEndOfNextBlock_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToEndOfNextInline")
  var moveFocusToEndOfNextInline_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToEndOfNextText")
  var moveFocusToEndOfNextText_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToEndOfNode")
  var moveFocusToEndOfNode_Original: slateDashReactLib.Anon_Node = js.native
  @JSName("moveFocusToEndOfPreviousBlock")
  var moveFocusToEndOfPreviousBlock_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToEndOfPreviousInline")
  var moveFocusToEndOfPreviousInline_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToEndOfPreviousText")
  var moveFocusToEndOfPreviousText_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToEndOfText")
  var moveFocusToEndOfText_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToStartOfBlock")
  var moveFocusToStartOfBlock_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToStartOfDocument")
  var moveFocusToStartOfDocument_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToStartOfInline")
  var moveFocusToStartOfInline_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToStartOfNextBlock")
  var moveFocusToStartOfNextBlock_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToStartOfNextInline")
  var moveFocusToStartOfNextInline_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToStartOfNextText")
  var moveFocusToStartOfNextText_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToStartOfNode")
  var moveFocusToStartOfNode_Original: slateDashReactLib.Anon_Node = js.native
  @JSName("moveFocusToStartOfPreviousBlock")
  var moveFocusToStartOfPreviousBlock_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToStartOfPreviousInline")
  var moveFocusToStartOfPreviousInline_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToStartOfPreviousText")
  var moveFocusToStartOfPreviousText_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusToStartOfText")
  var moveFocusToStartOfText_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveFocusTo")
  var moveFocusTo_Original: slateDashReactLib.Anon_Offset = js.native
  @JSName("moveForward")
  var moveForward_Original: slateDashReactLib.Anon_NController = js.native
  @JSName("moveNodeByKey")
  var moveNodeByKey_Original: slateDashReactLib.Anon_KeyNewIndex = js.native
  @JSName("moveNodeByPath")
  var moveNodeByPath_Original: slateDashReactLib.Anon_NewIndex = js.native
  @JSName("moveStartBackward")
  var moveStartBackward_Original: slateDashReactLib.Anon_NController = js.native
  @JSName("moveStartForward")
  var moveStartForward_Original: slateDashReactLib.Anon_NController = js.native
  @JSName("moveStartToEndOfBlock")
  var moveStartToEndOfBlock_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToEndOfDocument")
  var moveStartToEndOfDocument_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToEndOfInline")
  var moveStartToEndOfInline_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToEndOfNextBlock")
  var moveStartToEndOfNextBlock_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToEndOfNextInline")
  var moveStartToEndOfNextInline_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToEndOfNextText")
  var moveStartToEndOfNextText_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToEndOfNode")
  var moveStartToEndOfNode_Original: slateDashReactLib.Anon_Node = js.native
  @JSName("moveStartToEndOfPreviousBlock")
  var moveStartToEndOfPreviousBlock_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToEndOfPreviousInline")
  var moveStartToEndOfPreviousInline_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToEndOfPreviousText")
  var moveStartToEndOfPreviousText_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToEndOfText")
  var moveStartToEndOfText_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToStartOfBlock")
  var moveStartToStartOfBlock_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToStartOfDocument")
  var moveStartToStartOfDocument_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToStartOfInline")
  var moveStartToStartOfInline_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToStartOfNextBlock")
  var moveStartToStartOfNextBlock_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToStartOfNextInline")
  var moveStartToStartOfNextInline_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToStartOfNextText")
  var moveStartToStartOfNextText_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToStartOfNode")
  var moveStartToStartOfNode_Original: slateDashReactLib.Anon_Node = js.native
  @JSName("moveStartToStartOfPreviousBlock")
  var moveStartToStartOfPreviousBlock_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToStartOfPreviousInline")
  var moveStartToStartOfPreviousInline_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToStartOfPreviousText")
  var moveStartToStartOfPreviousText_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartToStartOfText")
  var moveStartToStartOfText_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveStartTo")
  var moveStartTo_Original: slateDashReactLib.Anon_NPath = js.native
  @JSName("moveToAnchor")
  var moveToAnchor_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToEndOfBlock")
  var moveToEndOfBlock_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToEndOfDocument")
  var moveToEndOfDocument_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToEndOfInline")
  var moveToEndOfInline_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToEndOfNextBlock")
  var moveToEndOfNextBlock_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToEndOfNextInline")
  var moveToEndOfNextInline_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToEndOfNextText")
  var moveToEndOfNextText_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToEndOfNode")
  var moveToEndOfNode_Original: slateDashReactLib.Anon_Node = js.native
  @JSName("moveToEndOfPreviousBlock")
  var moveToEndOfPreviousBlock_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToEndOfPreviousInline")
  var moveToEndOfPreviousInline_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToEndOfPreviousText")
  var moveToEndOfPreviousText_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToEndOfText")
  var moveToEndOfText_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToEnd")
  var moveToEnd_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToFocus")
  var moveToFocus_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToRangeOfDocument")
  var moveToRangeOfDocument_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToRangeOfNode")
  var moveToRangeOfNode_Original: slateDashReactLib.Anon_Node = js.native
  @JSName("moveToStartOfBlock")
  var moveToStartOfBlock_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToStartOfDocument")
  var moveToStartOfDocument_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToStartOfInline")
  var moveToStartOfInline_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToStartOfNextBlock")
  var moveToStartOfNextBlock_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToStartOfNextInline")
  var moveToStartOfNextInline_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToStartOfNextText")
  var moveToStartOfNextText_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToStartOfNode")
  var moveToStartOfNode_Original: slateDashReactLib.Anon_Node = js.native
  @JSName("moveToStartOfPreviousBlock")
  var moveToStartOfPreviousBlock_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToStartOfPreviousInline")
  var moveToStartOfPreviousInline_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToStartOfPreviousText")
  var moveToStartOfPreviousText_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToStartOfText")
  var moveToStartOfText_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveToStart")
  var moveToStart_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("moveTo")
  var moveTo_Original: slateDashReactLib.Anon_Offset = js.native
  @JSName("normalize")
  var normalize_Original: slateDashReactLib.Anon_Controller = js.native
  val operations: immutableLib.immutableMod.List[slateLib.slateMod.Operation] = js.native
  val plugins: js.Array[Plugin] = js.native
  @JSName("query")
  var query_Original: slateDashReactLib.Anon_Args = js.native
  val readOnly: scala.Boolean = js.native
  @JSName("redo")
  var redo_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("registerCommand")
  var registerCommand_Original: slateDashReactLib.Anon_Command = js.native
  @JSName("registerQuery")
  var registerQuery_Original: slateDashReactLib.Anon_Query = js.native
  @JSName("removeMarkAtRange")
  var removeMarkAtRange_Original: slateDashReactLib.Anon_MarkRange = js.native
  @JSName("removeMarkByKey")
  var removeMarkByKey_Original: slateDashReactLib.Anon_KeyLength = js.native
  @JSName("removeMarkByPath")
  var removeMarkByPath_Original: slateDashReactLib.Anon_Length = js.native
  @JSName("removeMark")
  var removeMark_Original: slateDashReactLib.Anon_Mark = js.native
  @JSName("removeNodeByKey")
  var removeNodeByKey_Original: slateDashReactLib.Anon_KeyController = js.native
  @JSName("removeNodeByPath")
  var removeNodeByPath_Original: slateDashReactLib.Anon_Path = js.native
  @JSName("removeTextByKey")
  var removeTextByKey_Original: slateDashReactLib.Anon_KeyLengthOffset = js.native
  @JSName("removeTextByPath")
  var removeTextByPath_Original: slateDashReactLib.Anon_LengthOffset = js.native
  @JSName("replaceMark")
  var replaceMark_Original: slateDashReactLib.Anon_MarkNewMark = js.native
  @JSName("replaceNodeByKey")
  var replaceNodeByKey_Original: slateDashReactLib.Anon_KeyNode = js.native
  @JSName("replaceNodeByPath")
  var replaceNodeByPath_Original: slateDashReactLib.Anon_NewNode = js.native
  @JSName("run")
  var run_Original: slateDashReactLib.Anon_Args = js.native
  @JSName("select")
  var select_Original: slateDashReactLib.Anon_PropertiesControllerEditor = js.native
  @JSName("setBlocksAtRange")
  var setBlocksAtRange_Original: slateDashReactLib.Anon_PropertiesRange = js.native
  @JSName("setBlocks")
  var setBlocks_Original: slateDashReactLib.Anon_Properties = js.native
  @JSName("setDecorations")
  var setDecorations_Original: slateDashReactLib.Anon_Decorations = js.native
  @JSName("setInlinesAtRange")
  var setInlinesAtRange_Original: slateDashReactLib.Anon_PropertiesRangeController = js.native
  @JSName("setInlines")
  var setInlines_Original: slateDashReactLib.Anon_PropertiesController = js.native
  @JSName("setMarkByKey")
  var setMarkByKey_Original: slateDashReactLib.Anon_KeyLengthMark = js.native
  @JSName("setMarksByPath")
  var setMarksByPath_Original: slateDashReactLib.Anon_LengthMark = js.native
  @JSName("setNodeByKey")
  var setNodeByKey_Original: slateDashReactLib.Anon_KeyProperties = js.native
  @JSName("setNodeByPath")
  var setNodeByPath_Original: slateDashReactLib.Anon_PathProperties = js.native
  @JSName("snapshotSelection")
  var snapshotSelection_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("splitBlockAtRange")
  var splitBlockAtRange_Original: slateDashReactLib.Anon_DepthRange = js.native
  @JSName("splitBlock")
  var splitBlock_Original: slateDashReactLib.Anon_Depth = js.native
  @JSName("splitInlineAtRange")
  var splitInlineAtRange_Original: slateDashReactLib.Anon_DepthRange = js.native
  @JSName("splitInline")
  var splitInline_Original: slateDashReactLib.Anon_Depth = js.native
  @JSName("splitNodeByKey")
  var splitNodeByKey_Original: slateDashReactLib.Anon_KeyOffset = js.native
  @JSName("splitNodeByPath")
  var splitNodeByPath_Original: slateDashReactLib.Anon_PathPosition = js.native
  @JSName("toggleMarkAtRange")
  var toggleMarkAtRange_Original: slateDashReactLib.Anon_MarkRange = js.native
  @JSName("toggleMark")
  var toggleMark_Original: slateDashReactLib.Anon_Mark = js.native
  @JSName("undo")
  var undo_Original: slateDashReactLib.Anon_Controller = js.native
  @JSName("unwrapBlockAtRange")
  var unwrapBlockAtRange_Original: slateDashReactLib.Anon_PropertiesRange = js.native
  @JSName("unwrapBlockByKey")
  var unwrapBlockByKey_Original: slateDashReactLib.Anon_KeyPropertiesBlockProperties = js.native
  @JSName("unwrapBlockByPath")
  var unwrapBlockByPath_Original: slateDashReactLib.Anon_PathPropertiesBlockProperties = js.native
  @JSName("unwrapBlock")
  var unwrapBlock_Original: slateDashReactLib.Anon_Properties = js.native
  @JSName("unwrapInlineAtRange")
  var unwrapInlineAtRange_Original: slateDashReactLib.Anon_PropertiesRangeController = js.native
  @JSName("unwrapInlineByKey")
  var unwrapInlineByKey_Original: slateDashReactLib.Anon_KeyPropertiesController = js.native
  @JSName("unwrapInlineByPath")
  var unwrapInlineByPath_Original: slateDashReactLib.Anon_PathPropertiesController = js.native
  @JSName("unwrapInline")
  var unwrapInline_Original: slateDashReactLib.Anon_PropertiesController = js.native
  @JSName("unwrapNodeByKey")
  var unwrapNodeByKey_Original: slateDashReactLib.Anon_KeyController = js.native
  @JSName("unwrapNodeByPath")
  var unwrapNodeByPath_Original: slateDashReactLib.Anon_Path = js.native
  val value: slateLib.slateMod.Value = js.native
  @JSName("withoutMerging")
  var withoutMerging_Original: slateDashReactLib.Anon_Fn = js.native
  @JSName("withoutNormalizing")
  var withoutNormalizing_Original: slateDashReactLib.Anon_Fn = js.native
  @JSName("withoutSaving")
  var withoutSaving_Original: slateDashReactLib.Anon_Fn = js.native
  @JSName("wrapBlockAtRange")
  var wrapBlockAtRange_Original: slateDashReactLib.Anon_PropertiesRange = js.native
  @JSName("wrapBlockByKey")
  var wrapBlockByKey_Original: slateDashReactLib.Anon_KeyPropertiesBlockProperties = js.native
  @JSName("wrapBlockByPath")
  var wrapBlockByPath_Original: slateDashReactLib.Anon_BlockPath = js.native
  @JSName("wrapBlock")
  var wrapBlock_Original: slateDashReactLib.Anon_Properties = js.native
  @JSName("wrapInlineAtRange")
  var wrapInlineAtRange_Original: slateDashReactLib.Anon_PropertiesRangeController = js.native
  @JSName("wrapInlineByKey")
  var wrapInlineByKey_Original: slateDashReactLib.Anon_KeyPropertiesController = js.native
  @JSName("wrapInlineByPath")
  var wrapInlineByPath_Original: slateDashReactLib.Anon_PathPropertiesController = js.native
  @JSName("wrapInline")
  var wrapInline_Original: slateDashReactLib.Anon_PropertiesController = js.native
  @JSName("wrapNodeByKey")
  var wrapNodeByKey_Original: slateDashReactLib.Anon_KeyParent = js.native
  @JSName("wrapNodeByPath")
  var wrapNodeByPath_Original: slateDashReactLib.Anon_Parent = js.native
  @JSName("wrapTextAtRange")
  var wrapTextAtRange_Original: slateDashReactLib.Anon_PrefixRange = js.native
  @JSName("wrapText")
  var wrapText_Original: slateDashReactLib.Anon_Prefix = js.native
  @JSName("addMarkAtRange")
  def addMarkAtRange_Controller(range: slateLib.slateMod.Range, mark: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("addMarkAtRange")
  def addMarkAtRange_Controller(range: slateLib.slateMod.Range, mark: slateLib.slateMod.Mark): slateLib.slateMod.Controller = js.native
  @JSName("addMarkAtRange")
  def addMarkAtRange_Controller(range: slateLib.slateMod.Range, mark: slateLib.slateMod.MarkProperties): slateLib.slateMod.Controller = js.native
  @JSName("addMarkByKey")
  def addMarkByKey_Controller(key: java.lang.String, offset: scala.Double, length: scala.Double, mark: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("addMarkByKey")
  def addMarkByKey_Controller(key: java.lang.String, offset: scala.Double, length: scala.Double, mark: slateLib.slateMod.Mark): slateLib.slateMod.Controller = js.native
  @JSName("addMarkByKey")
  def addMarkByKey_Controller(
    key: java.lang.String,
    offset: scala.Double,
    length: scala.Double,
    mark: slateLib.slateMod.MarkProperties
  ): slateLib.slateMod.Controller = js.native
  @JSName("addMarkByPath")
  def addMarkByPath_Controller(path: slateLib.slateMod.Path, offset: scala.Double, length: scala.Double, mark: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("addMarkByPath")
  def addMarkByPath_Controller(
    path: slateLib.slateMod.Path,
    offset: scala.Double,
    length: scala.Double,
    mark: slateLib.slateMod.Mark
  ): slateLib.slateMod.Controller = js.native
  @JSName("addMarkByPath")
  def addMarkByPath_Controller(
    path: slateLib.slateMod.Path,
    offset: scala.Double,
    length: scala.Double,
    mark: slateLib.slateMod.MarkProperties
  ): slateLib.slateMod.Controller = js.native
  // Controller
  @JSName("addMark")
  def addMark_Controller(mark: java.lang.String): slateLib.slateMod.Controller = js.native
  // Controller
  @JSName("addMark")
  def addMark_Controller(mark: slateLib.slateMod.Mark): slateLib.slateMod.Controller = js.native
  // Controller
  @JSName("addMark")
  def addMark_Controller(mark: slateLib.slateMod.MarkProperties): slateLib.slateMod.Controller = js.native
  @JSName("applyOperation")
  def applyOperation_Controller(operation: slateLib.slateMod.Operation): slateLib.slateMod.Controller = js.native
  @JSName("blur")
  def blur_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("command")
  def command_Controller(key: java.lang.String, args: js.Any*): slateLib.slateMod.Controller = js.native
  @JSName("deleteAtRange")
  def deleteAtRange_Controller(range: slateLib.slateMod.Range): slateLib.slateMod.Controller = js.native
  @JSName("deleteBackwardAtRange")
  def deleteBackwardAtRange_Controller(range: slateLib.slateMod.Range, n: scala.Double): slateLib.slateMod.Controller = js.native
  @JSName("deleteBackward")
  def deleteBackward_Controller(n: scala.Double): slateLib.slateMod.Controller = js.native
  @JSName("deleteCharBackwardAtRange")
  def deleteCharBackwardAtRange_Controller(range: slateLib.slateMod.Range): slateLib.slateMod.Controller = js.native
  @JSName("deleteCharForwardAtRange")
  def deleteCharForwardAtRange_Controller(range: slateLib.slateMod.Range): slateLib.slateMod.Controller = js.native
  @JSName("deleteForwardAtRange")
  def deleteForwardAtRange_Controller(range: slateLib.slateMod.Range, n: scala.Double): slateLib.slateMod.Controller = js.native
  @JSName("deleteForward")
  def deleteForward_Controller(n: scala.Double): slateLib.slateMod.Controller = js.native
  @JSName("deleteLineBackwardAtRange")
  def deleteLineBackwardAtRange_Controller(range: slateLib.slateMod.Range): slateLib.slateMod.Controller = js.native
  @JSName("deleteLineForwardAtRange")
  def deleteLineForwardAtRange_Controller(range: slateLib.slateMod.Range): slateLib.slateMod.Controller = js.native
  @JSName("deleteWordBackwardAtRange")
  def deleteWordBackwardAtRange_Controller(range: slateLib.slateMod.Range): slateLib.slateMod.Controller = js.native
  @JSName("deleteWordForwardAtRange")
  def deleteWordForwardAtRange_Controller(range: slateLib.slateMod.Range): slateLib.slateMod.Controller = js.native
  @JSName("delete")
  def delete_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("deselect")
  def deselect_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("flip")
  def flip_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("focus")
  def focus_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("insertBlockAtRange")
  def insertBlockAtRange_Controller(range: slateLib.slateMod.Range, block: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("insertBlockAtRange")
  def insertBlockAtRange_Controller(range: slateLib.slateMod.Range, block: slateLib.slateMod.Block): slateLib.slateMod.Controller = js.native
  @JSName("insertBlockAtRange")
  def insertBlockAtRange_Controller(range: slateLib.slateMod.Range, block: slateLib.slateMod.BlockProperties): slateLib.slateMod.Controller = js.native
  @JSName("insertBlock")
  def insertBlock_Controller(block: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("insertBlock")
  def insertBlock_Controller(block: slateLib.slateMod.Block): slateLib.slateMod.Controller = js.native
  @JSName("insertBlock")
  def insertBlock_Controller(block: slateLib.slateMod.BlockProperties): slateLib.slateMod.Controller = js.native
  @JSName("insertFragmentAtRange")
  def insertFragmentAtRange_Controller(
    range: slateLib.slateMod.Range,
    fragment: slateLib.slateMod.Document[org.scalablytyped.runtime.StringDictionary[_]]
  ): slateLib.slateMod.Controller = js.native
  @JSName("insertFragmentByKey")
  def insertFragmentByKey_Controller(
    key: java.lang.String,
    index: scala.Double,
    fragment: slateLib.slateMod.Document[org.scalablytyped.runtime.StringDictionary[_]]
  ): slateLib.slateMod.Controller = js.native
  @JSName("insertFragmentByPath")
  def insertFragmentByPath_Controller(
    path: slateLib.slateMod.Path,
    index: scala.Double,
    fragment: slateLib.slateMod.Document[org.scalablytyped.runtime.StringDictionary[_]]
  ): slateLib.slateMod.Controller = js.native
  @JSName("insertFragment")
  def insertFragment_Controller(fragment: slateLib.slateMod.Document[org.scalablytyped.runtime.StringDictionary[_]]): slateLib.slateMod.Controller = js.native
  @JSName("insertInlineAtRange")
  def insertInlineAtRange_Controller(range: slateLib.slateMod.Range, `inline`: slateLib.slateMod.Inline): slateLib.slateMod.Controller = js.native
  @JSName("insertInlineAtRange")
  def insertInlineAtRange_Controller(range: slateLib.slateMod.Range, `inline`: slateLib.slateMod.InlineProperties): slateLib.slateMod.Controller = js.native
  @JSName("insertInline")
  def insertInline_Controller(`inline`: slateLib.slateMod.Inline): slateLib.slateMod.Controller = js.native
  @JSName("insertInline")
  def insertInline_Controller(`inline`: slateLib.slateMod.InlineProperties): slateLib.slateMod.Controller = js.native
  @JSName("insertNodeByKey")
  def insertNodeByKey_Controller(key: java.lang.String, index: scala.Double, node: slateLib.slateMod.Node): slateLib.slateMod.Controller = js.native
  @JSName("insertNodeByPath")
  def insertNodeByPath_Controller(path: slateLib.slateMod.Path, index: scala.Double, node: slateLib.slateMod.Node): slateLib.slateMod.Controller = js.native
  @JSName("insertTextAtRange")
  def insertTextAtRange_Controller(range: slateLib.slateMod.Range, text: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("insertTextByKey")
  def insertTextByKey_Controller(key: java.lang.String, offset: scala.Double, text: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("insertTextByKey")
  def insertTextByKey_Controller(
    key: java.lang.String,
    offset: scala.Double,
    text: java.lang.String,
    marks: immutableLib.immutableMod.Set[slateLib.slateMod.Mark]
  ): slateLib.slateMod.Controller = js.native
  @JSName("insertTextByKey")
  def insertTextByKey_Controller(
    key: java.lang.String,
    offset: scala.Double,
    text: java.lang.String,
    marks: js.Array[slateLib.slateMod.Mark]
  ): slateLib.slateMod.Controller = js.native
  @JSName("insertTextByPath")
  def insertTextByPath_Controller(path: slateLib.slateMod.Path, offset: scala.Double, text: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("insertTextByPath")
  def insertTextByPath_Controller(
    path: slateLib.slateMod.Path,
    offset: scala.Double,
    text: java.lang.String,
    marks: immutableLib.immutableMod.Set[slateLib.slateMod.Mark]
  ): slateLib.slateMod.Controller = js.native
  @JSName("insertTextByPath")
  def insertTextByPath_Controller(
    path: slateLib.slateMod.Path,
    offset: scala.Double,
    text: java.lang.String,
    marks: js.Array[slateLib.slateMod.Mark]
  ): slateLib.slateMod.Controller = js.native
  @JSName("insertText")
  def insertText_Controller(text: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("mergeNodeByKey")
  def mergeNodeByKey_Controller(key: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("mergeNodeByPath")
  def mergeNodeByPath_Controller(path: slateLib.slateMod.Path): slateLib.slateMod.Controller = js.native
  @JSName("moveAnchorBackward")
  def moveAnchorBackward_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveAnchorBackward")
  def moveAnchorBackward_Controller(n: scala.Double): slateLib.slateMod.Controller = js.native
  @JSName("moveAnchorEndOfNode")
  def moveAnchorEndOfNode_Controller(node: slateLib.slateMod.Node): slateLib.slateMod.Controller = js.native
  @JSName("moveAnchorForward")
  def moveAnchorForward_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveAnchorForward")
  def moveAnchorForward_Controller(n: scala.Double): slateLib.slateMod.Controller = js.native
  @JSName("moveAnchorToEndOfBlock")
  def moveAnchorToEndOfBlock_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveAnchorToEndOfDocument")
  def moveAnchorToEndOfDocument_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveAnchorToEndOfInline")
  def moveAnchorToEndOfInline_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveAnchorToEndOfNextBlock")
  def moveAnchorToEndOfNextBlock_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveAnchorToEndOfNextInline")
  def moveAnchorToEndOfNextInline_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveAnchorToEndOfNextText")
  def moveAnchorToEndOfNextText_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveAnchorToEndOfPreviousBlock")
  def moveAnchorToEndOfPreviousBlock_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveAnchorToEndOfPreviousInline")
  def moveAnchorToEndOfPreviousInline_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveAnchorToEndOfPreviousText")
  def moveAnchorToEndOfPreviousText_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveAnchorToEndOfText")
  def moveAnchorToEndOfText_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveAnchorToStartOfBlock")
  def moveAnchorToStartOfBlock_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveAnchorToStartOfDocument")
  def moveAnchorToStartOfDocument_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveAnchorToStartOfInline")
  def moveAnchorToStartOfInline_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveAnchorToStartOfNextBlock")
  def moveAnchorToStartOfNextBlock_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveAnchorToStartOfNextInline")
  def moveAnchorToStartOfNextInline_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveAnchorToStartOfNextText")
  def moveAnchorToStartOfNextText_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveAnchorToStartOfNode")
  def moveAnchorToStartOfNode_Controller(node: slateLib.slateMod.Node): slateLib.slateMod.Controller = js.native
  @JSName("moveAnchorToStartOfPreviousBlock")
  def moveAnchorToStartOfPreviousBlock_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveAnchorToStartOfPreviousInline")
  def moveAnchorToStartOfPreviousInline_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveAnchorToStartOfPreviousText")
  def moveAnchorToStartOfPreviousText_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveAnchorToStartOfText")
  def moveAnchorToStartOfText_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveAnchorTo")
  def moveAnchorTo_Controller(path: slateLib.slateMod.Path): slateLib.slateMod.Controller = js.native
  @JSName("moveAnchorTo")
  def moveAnchorTo_Controller(path: slateLib.slateMod.Path, offset: scala.Double): slateLib.slateMod.Controller = js.native
  @JSName("moveBackward")
  def moveBackward_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveBackward")
  def moveBackward_Controller(n: scala.Double): slateLib.slateMod.Controller = js.native
  @JSName("moveEndBackward")
  def moveEndBackward_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveEndBackward")
  def moveEndBackward_Controller(n: scala.Double): slateLib.slateMod.Controller = js.native
  @JSName("moveEndForward")
  def moveEndForward_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveEndForward")
  def moveEndForward_Controller(n: scala.Double): slateLib.slateMod.Controller = js.native
  @JSName("moveEndToEndOfBlock")
  def moveEndToEndOfBlock_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveEndToEndOfDocument")
  def moveEndToEndOfDocument_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveEndToEndOfInline")
  def moveEndToEndOfInline_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveEndToEndOfNextBlock")
  def moveEndToEndOfNextBlock_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveEndToEndOfNextInline")
  def moveEndToEndOfNextInline_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveEndToEndOfNextText")
  def moveEndToEndOfNextText_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveEndToEndOfNode")
  def moveEndToEndOfNode_Controller(node: slateLib.slateMod.Node): slateLib.slateMod.Controller = js.native
  @JSName("moveEndToEndOfPreviousBlock")
  def moveEndToEndOfPreviousBlock_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveEndToEndOfPreviousInline")
  def moveEndToEndOfPreviousInline_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveEndToEndOfPreviousText")
  def moveEndToEndOfPreviousText_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveEndToEndOfText")
  def moveEndToEndOfText_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveEndToStartOfBlock")
  def moveEndToStartOfBlock_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveEndToStartOfDocument")
  def moveEndToStartOfDocument_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveEndToStartOfInline")
  def moveEndToStartOfInline_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveEndToStartOfNextBlock")
  def moveEndToStartOfNextBlock_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveEndToStartOfNextInline")
  def moveEndToStartOfNextInline_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveEndToStartOfNextText")
  def moveEndToStartOfNextText_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveEndToStartOfNode")
  def moveEndToStartOfNode_Controller(node: slateLib.slateMod.Node): slateLib.slateMod.Controller = js.native
  @JSName("moveEndToStartOfPreviousBlock")
  def moveEndToStartOfPreviousBlock_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveEndToStartOfPreviousInline")
  def moveEndToStartOfPreviousInline_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveEndToStartOfPreviousText")
  def moveEndToStartOfPreviousText_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveEndToStartOfText")
  def moveEndToStartOfText_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveEndTo")
  def moveEndTo_Controller(path: slateLib.slateMod.Path): slateLib.slateMod.Controller = js.native
  @JSName("moveEndTo")
  def moveEndTo_Controller(path: slateLib.slateMod.Path, offset: scala.Double): slateLib.slateMod.Controller = js.native
  @JSName("moveFocusBackward")
  def moveFocusBackward_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveFocusBackward")
  def moveFocusBackward_Controller(n: scala.Double): slateLib.slateMod.Controller = js.native
  @JSName("moveFocusForward")
  def moveFocusForward_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveFocusForward")
  def moveFocusForward_Controller(n: scala.Double): slateLib.slateMod.Controller = js.native
  @JSName("moveFocusToEndOfBlock")
  def moveFocusToEndOfBlock_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveFocusToEndOfDocument")
  def moveFocusToEndOfDocument_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveFocusToEndOfInline")
  def moveFocusToEndOfInline_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveFocusToEndOfNextBlock")
  def moveFocusToEndOfNextBlock_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveFocusToEndOfNextInline")
  def moveFocusToEndOfNextInline_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveFocusToEndOfNextText")
  def moveFocusToEndOfNextText_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveFocusToEndOfNode")
  def moveFocusToEndOfNode_Controller(node: slateLib.slateMod.Node): slateLib.slateMod.Controller = js.native
  @JSName("moveFocusToEndOfPreviousBlock")
  def moveFocusToEndOfPreviousBlock_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveFocusToEndOfPreviousInline")
  def moveFocusToEndOfPreviousInline_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveFocusToEndOfPreviousText")
  def moveFocusToEndOfPreviousText_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveFocusToEndOfText")
  def moveFocusToEndOfText_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveFocusToStartOfBlock")
  def moveFocusToStartOfBlock_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveFocusToStartOfDocument")
  def moveFocusToStartOfDocument_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveFocusToStartOfInline")
  def moveFocusToStartOfInline_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveFocusToStartOfNextBlock")
  def moveFocusToStartOfNextBlock_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveFocusToStartOfNextInline")
  def moveFocusToStartOfNextInline_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveFocusToStartOfNextText")
  def moveFocusToStartOfNextText_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveFocusToStartOfNode")
  def moveFocusToStartOfNode_Controller(node: slateLib.slateMod.Node): slateLib.slateMod.Controller = js.native
  @JSName("moveFocusToStartOfPreviousBlock")
  def moveFocusToStartOfPreviousBlock_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveFocusToStartOfPreviousInline")
  def moveFocusToStartOfPreviousInline_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveFocusToStartOfPreviousText")
  def moveFocusToStartOfPreviousText_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveFocusToStartOfText")
  def moveFocusToStartOfText_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveFocusTo")
  def moveFocusTo_Controller(path: slateLib.slateMod.Path): slateLib.slateMod.Controller = js.native
  @JSName("moveFocusTo")
  def moveFocusTo_Controller(path: slateLib.slateMod.Path, offset: scala.Double): slateLib.slateMod.Controller = js.native
  @JSName("moveForward")
  def moveForward_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveForward")
  def moveForward_Controller(n: scala.Double): slateLib.slateMod.Controller = js.native
  @JSName("moveNodeByKey")
  def moveNodeByKey_Controller(key: java.lang.String, newKey: java.lang.String, newIndex: scala.Double): slateLib.slateMod.Controller = js.native
  @JSName("moveNodeByPath")
  def moveNodeByPath_Controller(path: slateLib.slateMod.Path, newPath: slateLib.slateMod.Path, newIndex: scala.Double): slateLib.slateMod.Controller = js.native
  @JSName("moveStartBackward")
  def moveStartBackward_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveStartBackward")
  def moveStartBackward_Controller(n: scala.Double): slateLib.slateMod.Controller = js.native
  @JSName("moveStartForward")
  def moveStartForward_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveStartForward")
  def moveStartForward_Controller(n: scala.Double): slateLib.slateMod.Controller = js.native
  @JSName("moveStartToEndOfBlock")
  def moveStartToEndOfBlock_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveStartToEndOfDocument")
  def moveStartToEndOfDocument_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveStartToEndOfInline")
  def moveStartToEndOfInline_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveStartToEndOfNextBlock")
  def moveStartToEndOfNextBlock_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveStartToEndOfNextInline")
  def moveStartToEndOfNextInline_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveStartToEndOfNextText")
  def moveStartToEndOfNextText_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveStartToEndOfNode")
  def moveStartToEndOfNode_Controller(node: slateLib.slateMod.Node): slateLib.slateMod.Controller = js.native
  @JSName("moveStartToEndOfPreviousBlock")
  def moveStartToEndOfPreviousBlock_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveStartToEndOfPreviousInline")
  def moveStartToEndOfPreviousInline_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveStartToEndOfPreviousText")
  def moveStartToEndOfPreviousText_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveStartToEndOfText")
  def moveStartToEndOfText_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveStartToStartOfBlock")
  def moveStartToStartOfBlock_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveStartToStartOfDocument")
  def moveStartToStartOfDocument_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveStartToStartOfInline")
  def moveStartToStartOfInline_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveStartToStartOfNextBlock")
  def moveStartToStartOfNextBlock_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveStartToStartOfNextInline")
  def moveStartToStartOfNextInline_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveStartToStartOfNextText")
  def moveStartToStartOfNextText_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveStartToStartOfNode")
  def moveStartToStartOfNode_Controller(node: slateLib.slateMod.Node): slateLib.slateMod.Controller = js.native
  @JSName("moveStartToStartOfPreviousBlock")
  def moveStartToStartOfPreviousBlock_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveStartToStartOfPreviousInline")
  def moveStartToStartOfPreviousInline_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveStartToStartOfPreviousText")
  def moveStartToStartOfPreviousText_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveStartToStartOfText")
  def moveStartToStartOfText_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveStartTo")
  def moveStartTo_Controller(path: slateLib.slateMod.Path): slateLib.slateMod.Controller = js.native
  @JSName("moveStartTo")
  def moveStartTo_Controller(path: slateLib.slateMod.Path, n: scala.Double): slateLib.slateMod.Controller = js.native
  @JSName("moveToAnchor")
  def moveToAnchor_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveToEndOfBlock")
  def moveToEndOfBlock_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveToEndOfDocument")
  def moveToEndOfDocument_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveToEndOfInline")
  def moveToEndOfInline_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveToEndOfNextBlock")
  def moveToEndOfNextBlock_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveToEndOfNextInline")
  def moveToEndOfNextInline_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveToEndOfNextText")
  def moveToEndOfNextText_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveToEndOfNode")
  def moveToEndOfNode_Controller(node: slateLib.slateMod.Node): slateLib.slateMod.Controller = js.native
  @JSName("moveToEndOfPreviousBlock")
  def moveToEndOfPreviousBlock_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveToEndOfPreviousInline")
  def moveToEndOfPreviousInline_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveToEndOfPreviousText")
  def moveToEndOfPreviousText_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveToEndOfText")
  def moveToEndOfText_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveToEnd")
  def moveToEnd_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveToFocus")
  def moveToFocus_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveToRangeOfDocument")
  def moveToRangeOfDocument_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveToRangeOfNode")
  def moveToRangeOfNode_Controller(node: slateLib.slateMod.Node): slateLib.slateMod.Controller = js.native
  @JSName("moveToStartOfBlock")
  def moveToStartOfBlock_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveToStartOfDocument")
  def moveToStartOfDocument_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveToStartOfInline")
  def moveToStartOfInline_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveToStartOfNextBlock")
  def moveToStartOfNextBlock_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveToStartOfNextInline")
  def moveToStartOfNextInline_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveToStartOfNextText")
  def moveToStartOfNextText_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveToStartOfNode")
  def moveToStartOfNode_Controller(node: slateLib.slateMod.Node): slateLib.slateMod.Controller = js.native
  @JSName("moveToStartOfPreviousBlock")
  def moveToStartOfPreviousBlock_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveToStartOfPreviousInline")
  def moveToStartOfPreviousInline_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveToStartOfPreviousText")
  def moveToStartOfPreviousText_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveToStartOfText")
  def moveToStartOfText_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveToStart")
  def moveToStart_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("moveTo")
  def moveTo_Controller(path: slateLib.slateMod.Path): slateLib.slateMod.Controller = js.native
  @JSName("moveTo")
  def moveTo_Controller(path: slateLib.slateMod.Path, offset: scala.Double): slateLib.slateMod.Controller = js.native
  @JSName("normalize")
  def normalize_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("query")
  def query_Controller(key: java.lang.String, args: js.Any*): slateLib.slateMod.Controller = js.native
  @JSName("redo")
  def redo_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("registerCommand")
  def registerCommand_Controller(command: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("registerQuery")
  def registerQuery_Controller(query: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("removeMarkAtRange")
  def removeMarkAtRange_Controller(range: slateLib.slateMod.Range, mark: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("removeMarkAtRange")
  def removeMarkAtRange_Controller(range: slateLib.slateMod.Range, mark: slateLib.slateMod.Mark): slateLib.slateMod.Controller = js.native
  @JSName("removeMarkAtRange")
  def removeMarkAtRange_Controller(range: slateLib.slateMod.Range, mark: slateLib.slateMod.MarkProperties): slateLib.slateMod.Controller = js.native
  @JSName("removeMarkByKey")
  def removeMarkByKey_Controller(key: java.lang.String, offset: scala.Double, length: scala.Double, mark: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("removeMarkByKey")
  def removeMarkByKey_Controller(key: java.lang.String, offset: scala.Double, length: scala.Double, mark: slateLib.slateMod.Mark): slateLib.slateMod.Controller = js.native
  @JSName("removeMarkByPath")
  def removeMarkByPath_Controller(path: slateLib.slateMod.Path, offset: scala.Double, length: scala.Double, mark: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("removeMarkByPath")
  def removeMarkByPath_Controller(
    path: slateLib.slateMod.Path,
    offset: scala.Double,
    length: scala.Double,
    mark: slateLib.slateMod.Mark
  ): slateLib.slateMod.Controller = js.native
  @JSName("removeMarkByPath")
  def removeMarkByPath_Controller(
    path: slateLib.slateMod.Path,
    offset: scala.Double,
    length: scala.Double,
    mark: slateLib.slateMod.MarkProperties
  ): slateLib.slateMod.Controller = js.native
  @JSName("removeMark")
  def removeMark_Controller(mark: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("removeMark")
  def removeMark_Controller(mark: slateLib.slateMod.Mark): slateLib.slateMod.Controller = js.native
  @JSName("removeMark")
  def removeMark_Controller(mark: slateLib.slateMod.MarkProperties): slateLib.slateMod.Controller = js.native
  @JSName("removeNodeByKey")
  def removeNodeByKey_Controller(key: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("removeNodeByPath")
  def removeNodeByPath_Controller(path: slateLib.slateMod.Path): slateLib.slateMod.Controller = js.native
  @JSName("removeTextByKey")
  def removeTextByKey_Controller(key: java.lang.String, offset: scala.Double, length: scala.Double): slateLib.slateMod.Controller = js.native
  @JSName("removeTextByPath")
  def removeTextByPath_Controller(path: slateLib.slateMod.Path, offset: scala.Double, length: scala.Double): slateLib.slateMod.Controller = js.native
  @JSName("replaceMark")
  def replaceMark_Controller(mark: java.lang.String, newMark: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("replaceMark")
  def replaceMark_Controller(mark: java.lang.String, newMark: slateLib.slateMod.Mark): slateLib.slateMod.Controller = js.native
  @JSName("replaceMark")
  def replaceMark_Controller(mark: java.lang.String, newMark: slateLib.slateMod.MarkProperties): slateLib.slateMod.Controller = js.native
  @JSName("replaceMark")
  def replaceMark_Controller(mark: slateLib.slateMod.MarkProperties, newMark: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("replaceMark")
  def replaceMark_Controller(mark: slateLib.slateMod.MarkProperties, newMark: slateLib.slateMod.Mark): slateLib.slateMod.Controller = js.native
  @JSName("replaceMark")
  def replaceMark_Controller(mark: slateLib.slateMod.MarkProperties, newMark: slateLib.slateMod.MarkProperties): slateLib.slateMod.Controller = js.native
  @JSName("replaceMark")
  def replaceMark_Controller(mark: slateLib.slateMod.Mark, newMark: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("replaceMark")
  def replaceMark_Controller(mark: slateLib.slateMod.Mark, newMark: slateLib.slateMod.Mark): slateLib.slateMod.Controller = js.native
  @JSName("replaceMark")
  def replaceMark_Controller(mark: slateLib.slateMod.Mark, newMark: slateLib.slateMod.MarkProperties): slateLib.slateMod.Controller = js.native
  @JSName("replaceNodeByKey")
  def replaceNodeByKey_Controller(key: java.lang.String, node: slateLib.slateMod.Node): slateLib.slateMod.Controller = js.native
  @JSName("replaceNodeByPath")
  def replaceNodeByPath_Controller(path: slateLib.slateMod.Path, newNode: slateLib.slateMod.Node): slateLib.slateMod.Controller = js.native
  // Instance methods
  def resolveController(
    plugins: js.Array[Plugin],
    schema: slateLib.slateMod.SchemaProperties,
    commands: js.Array[_],
    queries: js.Array[_]
  ): scala.Unit = js.native
  @JSName("run")
  def run_Controller(key: java.lang.String, args: js.Any*): slateLib.slateMod.Controller = js.native
  @JSName("select")
  def select_Controller(properties: slateLib.slateMod.Range): slateLib.slateMod.Controller = js.native
  @JSName("select")
  def select_Controller(properties: slateLib.slateMod.RangeProperties): slateLib.slateMod.Controller = js.native
  @JSName("setBlocksAtRange")
  def setBlocksAtRange_Controller(range: slateLib.slateMod.Range, properties: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("setBlocksAtRange")
  def setBlocksAtRange_Controller(range: slateLib.slateMod.Range, properties: slateLib.slateMod.BlockProperties): slateLib.slateMod.Controller = js.native
  @JSName("setBlocks")
  def setBlocks_Controller(properties: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("setBlocks")
  def setBlocks_Controller(properties: slateLib.slateMod.BlockProperties): slateLib.slateMod.Controller = js.native
  def setDecorations(decorations: immutableLib.immutableMod.List[slateLib.slateMod.Decoration]): slateLib.slateMod.Editor = js.native
  def setDecorations(decorations: js.Array[slateLib.slateMod.Decoration]): slateLib.slateMod.Editor = js.native
  @JSName("setInlinesAtRange")
  def setInlinesAtRange_Controller(range: slateLib.slateMod.Range, properties: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("setInlinesAtRange")
  def setInlinesAtRange_Controller(range: slateLib.slateMod.Range, properties: slateLib.slateMod.InlineProperties): slateLib.slateMod.Controller = js.native
  @JSName("setInlines")
  def setInlines_Controller(properties: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("setInlines")
  def setInlines_Controller(properties: slateLib.slateMod.InlineProperties): slateLib.slateMod.Controller = js.native
  @JSName("setMarkByKey")
  def setMarkByKey_Controller(
    key: java.lang.String,
    offset: scala.Double,
    length: scala.Double,
    mark: slateLib.slateMod.Mark,
    properties: slateLib.slateMod.MarkProperties
  ): slateLib.slateMod.Controller = js.native
  @JSName("setMarksByPath")
  def setMarksByPath_Controller(
    path: slateLib.slateMod.Path,
    offset: scala.Double,
    length: scala.Double,
    mark: slateLib.slateMod.Mark,
    properties: slateLib.slateMod.MarkProperties
  ): slateLib.slateMod.Controller = js.native
  @JSName("setNodeByKey")
  def setNodeByKey_Controller(key: java.lang.String, properties: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("setNodeByKey")
  def setNodeByKey_Controller(key: java.lang.String, properties: slateLib.slateMod.BlockProperties): slateLib.slateMod.Controller = js.native
  @JSName("setNodeByKey")
  def setNodeByKey_Controller(key: java.lang.String, properties: slateLib.slateMod.InlineProperties): slateLib.slateMod.Controller = js.native
  @JSName("setNodeByPath")
  def setNodeByPath_Controller(path: slateLib.slateMod.Path, properties: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("setNodeByPath")
  def setNodeByPath_Controller(path: slateLib.slateMod.Path, properties: slateLib.slateMod.InlineProperties): slateLib.slateMod.Controller = js.native
  @JSName("setNodeByPath")
  def setNodeByPath_Controller(path: slateLib.slateMod.Path, properties: slateLib.slateMod.NodeProperties): slateLib.slateMod.Controller = js.native
  @JSName("snapshotSelection")
  def snapshotSelection_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("splitBlockAtRange")
  def splitBlockAtRange_Controller(range: slateLib.slateMod.Range, depth: scala.Double): slateLib.slateMod.Controller = js.native
  @JSName("splitBlock")
  def splitBlock_Controller(depth: scala.Double): slateLib.slateMod.Controller = js.native
  @JSName("splitInlineAtRange")
  def splitInlineAtRange_Controller(range: slateLib.slateMod.Range, depth: scala.Double): slateLib.slateMod.Controller = js.native
  @JSName("splitInline")
  def splitInline_Controller(depth: scala.Double): slateLib.slateMod.Controller = js.native
  @JSName("splitNodeByKey")
  def splitNodeByKey_Controller(key: java.lang.String, offset: scala.Double): slateLib.slateMod.Controller = js.native
  @JSName("splitNodeByPath")
  def splitNodeByPath_Controller(path: slateLib.slateMod.Path, position: scala.Double): slateLib.slateMod.Controller = js.native
  @JSName("toggleMarkAtRange")
  def toggleMarkAtRange_Controller(range: slateLib.slateMod.Range, mark: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("toggleMarkAtRange")
  def toggleMarkAtRange_Controller(range: slateLib.slateMod.Range, mark: slateLib.slateMod.Mark): slateLib.slateMod.Controller = js.native
  @JSName("toggleMarkAtRange")
  def toggleMarkAtRange_Controller(range: slateLib.slateMod.Range, mark: slateLib.slateMod.MarkProperties): slateLib.slateMod.Controller = js.native
  @JSName("toggleMark")
  def toggleMark_Controller(mark: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("toggleMark")
  def toggleMark_Controller(mark: slateLib.slateMod.Mark): slateLib.slateMod.Controller = js.native
  @JSName("toggleMark")
  def toggleMark_Controller(mark: slateLib.slateMod.MarkProperties): slateLib.slateMod.Controller = js.native
  @JSName("undo")
  def undo_Controller(): slateLib.slateMod.Controller = js.native
  @JSName("unwrapBlockAtRange")
  def unwrapBlockAtRange_Controller(range: slateLib.slateMod.Range, properties: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("unwrapBlockAtRange")
  def unwrapBlockAtRange_Controller(range: slateLib.slateMod.Range, properties: slateLib.slateMod.BlockProperties): slateLib.slateMod.Controller = js.native
  @JSName("unwrapBlockByKey")
  def unwrapBlockByKey_Controller(key: java.lang.String, properties: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("unwrapBlockByKey")
  def unwrapBlockByKey_Controller(key: java.lang.String, properties: slateLib.slateMod.BlockProperties): slateLib.slateMod.Controller = js.native
  @JSName("unwrapBlockByPath")
  def unwrapBlockByPath_Controller(path: slateLib.slateMod.Path, properties: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("unwrapBlockByPath")
  def unwrapBlockByPath_Controller(path: slateLib.slateMod.Path, properties: slateLib.slateMod.BlockProperties): slateLib.slateMod.Controller = js.native
  @JSName("unwrapBlock")
  def unwrapBlock_Controller(properties: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("unwrapBlock")
  def unwrapBlock_Controller(properties: slateLib.slateMod.BlockProperties): slateLib.slateMod.Controller = js.native
  @JSName("unwrapInlineAtRange")
  def unwrapInlineAtRange_Controller(range: slateLib.slateMod.Range, properties: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("unwrapInlineAtRange")
  def unwrapInlineAtRange_Controller(range: slateLib.slateMod.Range, properties: slateLib.slateMod.InlineProperties): slateLib.slateMod.Controller = js.native
  @JSName("unwrapInlineByKey")
  def unwrapInlineByKey_Controller(key: java.lang.String, properties: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("unwrapInlineByKey")
  def unwrapInlineByKey_Controller(key: java.lang.String, properties: slateLib.slateMod.InlineProperties): slateLib.slateMod.Controller = js.native
  @JSName("unwrapInlineByPath")
  def unwrapInlineByPath_Controller(path: slateLib.slateMod.Path, properties: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("unwrapInlineByPath")
  def unwrapInlineByPath_Controller(path: slateLib.slateMod.Path, properties: slateLib.slateMod.InlineProperties): slateLib.slateMod.Controller = js.native
  @JSName("unwrapInline")
  def unwrapInline_Controller(properties: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("unwrapInline")
  def unwrapInline_Controller(properties: slateLib.slateMod.InlineProperties): slateLib.slateMod.Controller = js.native
  @JSName("unwrapNodeByKey")
  def unwrapNodeByKey_Controller(key: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("unwrapNodeByPath")
  def unwrapNodeByPath_Controller(path: slateLib.slateMod.Path): slateLib.slateMod.Controller = js.native
  @JSName("withoutMerging")
  def withoutMerging_Controller(fn: js.Function0[scala.Unit]): slateLib.slateMod.Controller = js.native
  @JSName("withoutNormalizing")
  def withoutNormalizing_Controller(fn: js.Function0[scala.Unit]): slateLib.slateMod.Controller = js.native
  @JSName("withoutSaving")
  def withoutSaving_Controller(fn: js.Function0[scala.Unit]): slateLib.slateMod.Controller = js.native
  @JSName("wrapBlockAtRange")
  def wrapBlockAtRange_Controller(range: slateLib.slateMod.Range, properties: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("wrapBlockAtRange")
  def wrapBlockAtRange_Controller(range: slateLib.slateMod.Range, properties: slateLib.slateMod.BlockProperties): slateLib.slateMod.Controller = js.native
  @JSName("wrapBlockByKey")
  def wrapBlockByKey_Controller(key: java.lang.String, properties: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("wrapBlockByKey")
  def wrapBlockByKey_Controller(key: java.lang.String, properties: slateLib.slateMod.BlockProperties): slateLib.slateMod.Controller = js.native
  @JSName("wrapBlockByPath")
  def wrapBlockByPath_Controller(path: slateLib.slateMod.Path, block: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("wrapBlockByPath")
  def wrapBlockByPath_Controller(path: slateLib.slateMod.Path, block: slateLib.slateMod.Block): slateLib.slateMod.Controller = js.native
  @JSName("wrapBlock")
  def wrapBlock_Controller(properties: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("wrapBlock")
  def wrapBlock_Controller(properties: slateLib.slateMod.BlockProperties): slateLib.slateMod.Controller = js.native
  @JSName("wrapInlineAtRange")
  def wrapInlineAtRange_Controller(range: slateLib.slateMod.Range, properties: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("wrapInlineAtRange")
  def wrapInlineAtRange_Controller(range: slateLib.slateMod.Range, properties: slateLib.slateMod.InlineProperties): slateLib.slateMod.Controller = js.native
  @JSName("wrapInlineByKey")
  def wrapInlineByKey_Controller(key: java.lang.String, properties: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("wrapInlineByKey")
  def wrapInlineByKey_Controller(key: java.lang.String, properties: slateLib.slateMod.InlineProperties): slateLib.slateMod.Controller = js.native
  @JSName("wrapInlineByPath")
  def wrapInlineByPath_Controller(path: slateLib.slateMod.Path, properties: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("wrapInlineByPath")
  def wrapInlineByPath_Controller(path: slateLib.slateMod.Path, properties: slateLib.slateMod.InlineProperties): slateLib.slateMod.Controller = js.native
  @JSName("wrapInline")
  def wrapInline_Controller(properties: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("wrapInline")
  def wrapInline_Controller(properties: slateLib.slateMod.InlineProperties): slateLib.slateMod.Controller = js.native
  @JSName("wrapNodeByKey")
  def wrapNodeByKey_Controller(key: java.lang.String, parent: slateLib.slateMod.Node): slateLib.slateMod.Controller = js.native
  @JSName("wrapNodeByPath")
  def wrapNodeByPath_Controller(path: slateLib.slateMod.Path, parent: slateLib.slateMod.Node): slateLib.slateMod.Controller = js.native
  @JSName("wrapTextAtRange")
  def wrapTextAtRange_Controller(range: slateLib.slateMod.Range, prefix: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("wrapTextAtRange")
  def wrapTextAtRange_Controller(range: slateLib.slateMod.Range, prefix: java.lang.String, suffix: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("wrapText")
  def wrapText_Controller(prefix: java.lang.String): slateLib.slateMod.Controller = js.native
  @JSName("wrapText")
  def wrapText_Controller(prefix: java.lang.String, suffix: java.lang.String): slateLib.slateMod.Controller = js.native
}

