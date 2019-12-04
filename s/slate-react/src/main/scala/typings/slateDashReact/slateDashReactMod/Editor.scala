package typings.slateDashReact.slateDashReactMod

import typings.immutable.Immutable.List
import typings.react.reactMod.Component
import typings.react.reactMod.ReactNode
import typings.react.reactMod.SyntheticEvent
import typings.slate.slateMod.Controller
import typings.slate.slateMod.Node
import typings.slate.slateMod.Operation
import typings.slate.slateMod.Point
import typings.slate.slateMod.PointJSON
import typings.slate.slateMod.PointProperties
import typings.slate.slateMod.RangeType
import typings.slate.slateMod.RangeTypeJSON
import typings.slate.slateMod.RangeTypeProperties
import typings.slate.slateMod.SchemaProperties
import typings.slate.slateMod.Value
import typings.slateDashReact.Anon_Node
import typings.slateDashReact.Fn_Annotation
import typings.slateDashReact.Fn_AnnotationNewProperties
import typings.slateDashReact.Fn_Args
import typings.slateDashReact.Fn_ArgsKey
import typings.slateDashReact.Fn_ArgsQuery
import typings.slateDashReact.Fn_Block
import typings.slateDashReact.Fn_BlockPath
import typings.slateDashReact.Fn_BlockRange
import typings.slateDashReact.Fn_Command
import typings.slateDashReact.Fn_Controller
import typings.slateDashReact.Fn_Data
import typings.slateDashReact.Fn_Depth
import typings.slateDashReact.Fn_DepthController
import typings.slateDashReact.Fn_Fn
import typings.slateDashReact.Fn_FnEditor
import typings.slateDashReact.Fn_Fragment
import typings.slateDashReact.Fn_FragmentIndex
import typings.slateDashReact.Fn_FragmentIndexPath
import typings.slateDashReact.Fn_FragmentRange
import typings.slateDashReact.Fn_Height
import typings.slateDashReact.Fn_Index
import typings.slateDashReact.Fn_IndexNode
import typings.slateDashReact.Fn_Inline
import typings.slateDashReact.Fn_InlineRange
import typings.slateDashReact.Fn_Key
import typings.slateDashReact.Fn_KeyController
import typings.slateDashReact.Fn_KeyLength
import typings.slateDashReact.Fn_KeyLengthNewProperties
import typings.slateDashReact.Fn_KeyMarks
import typings.slateDashReact.Fn_KeyMarksText
import typings.slateDashReact.Fn_KeyNewIndex
import typings.slateDashReact.Fn_KeyNode
import typings.slateDashReact.Fn_KeyOffset
import typings.slateDashReact.Fn_KeyParent
import typings.slateDashReact.Fn_KeyProperties
import typings.slateDashReact.Fn_KeyPropertiesBlockProperties
import typings.slateDashReact.Fn_KeyPropertiesController
import typings.slateDashReact.Fn_KeyTextKey
import typings.slateDashReact.Fn_Length
import typings.slateDashReact.Fn_LengthMarks
import typings.slateDashReact.Fn_LengthMarksOffset
import typings.slateDashReact.Fn_LengthNewProperties
import typings.slateDashReact.Fn_LengthOffset
import typings.slateDashReact.Fn_Mark
import typings.slateDashReact.Fn_MarkArray
import typings.slateDashReact.Fn_MarkController
import typings.slateDashReact.Fn_MarkNewMark
import typings.slateDashReact.Fn_MarkRange
import typings.slateDashReact.Fn_MarkRangeController
import typings.slateDashReact.Fn_Marks
import typings.slateDashReact.Fn_MarksOffset
import typings.slateDashReact.Fn_MarksPath
import typings.slateDashReact.Fn_N
import typings.slateDashReact.Fn_NPath
import typings.slateDashReact.Fn_NRange
import typings.slateDashReact.Fn_NewIndex
import typings.slateDashReact.Fn_NewNode
import typings.slateDashReact.Fn_NewProperties
import typings.slateDashReact.Fn_Node
import typings.slateDashReact.Fn_Offset
import typings.slateDashReact.Fn_Operation
import typings.slateDashReact.Fn_Options
import typings.slateDashReact.Fn_OptionsPath
import typings.slateDashReact.Fn_Parent
import typings.slateDashReact.Fn_Path
import typings.slateDashReact.Fn_PathArray
import typings.slateDashReact.Fn_PathProperties
import typings.slateDashReact.Fn_PathPropertiesController
import typings.slateDashReact.Fn_PathTextOffset
import typings.slateDashReact.Fn_Prefix
import typings.slateDashReact.Fn_PrefixRange
import typings.slateDashReact.Fn_Properties
import typings.slateDashReact.Fn_PropertiesBlock
import typings.slateDashReact.Fn_PropertiesController
import typings.slateDashReact.Fn_PropertiesControllerEditor
import typings.slateDashReact.Fn_PropertiesRange
import typings.slateDashReact.Fn_PropertiesRangeBlock
import typings.slateDashReact.Fn_PropertiesRangeController
import typings.slateDashReact.Fn_Query
import typings.slateDashReact.Fn_Range
import typings.slateDashReact.Fn_RangeText
import typings.slateDashReact.Fn_Text
import typings.std.Element
import typings.std.Event
import typings.std.Range
import typings.std.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate-react", "Editor")
@js.native
class Editor ()
  extends Component[EditorProps, EditorState, js.Any]
     with Controller {
  // Controller
  var addAnnotation: Fn_Annotation = js.native
  var addMark: Fn_Mark = js.native
  var addMarkAtRange: Fn_MarkRange = js.native
  var addMarkByKey: Fn_Key = js.native
  var addMarkByPath: Fn_Length = js.native
  var addMarks: Fn_MarkArray = js.native
  var addMarksAtRange: Fn_Marks = js.native
  var addMarksByPath: Fn_LengthMarks = js.native
  var applyOperation: Fn_Operation = js.native
  @JSName("blur")
  var blur_FEditor: Fn_Controller = js.native
  var command: Fn_Args = js.native
  var controller: typings.slate.slateMod.Editor = js.native
  var deleteAtRange: Fn_Range = js.native
  var deleteBackwardAtRange: Fn_NRange = js.native
  @JSName("deleteBackward")
  var deleteBackward_FEditor: Fn_N = js.native
  var deleteCharBackwardAtRange: Fn_Range = js.native
  @JSName("deleteCharBackward")
  var deleteCharBackward_FEditor: Fn_Controller = js.native
  var deleteCharForwardAtRange: Fn_Range = js.native
  @JSName("deleteCharForward")
  var deleteCharForward_FEditor: Fn_Controller = js.native
  var deleteForwardAtRange: Fn_NRange = js.native
  @JSName("deleteForward")
  var deleteForward_FEditor: Fn_N = js.native
  var deleteLineBackwardAtRange: Fn_Range = js.native
  @JSName("deleteLineBackward")
  var deleteLineBackward_FEditor: Fn_Controller = js.native
  var deleteLineForwardAtRange: Fn_Range = js.native
  @JSName("deleteLineForward")
  var deleteLineForward_FEditor: Fn_Controller = js.native
  var deleteWordBackwardAtRange: Fn_Range = js.native
  @JSName("deleteWordBackward")
  var deleteWordBackward_FEditor: Fn_Controller = js.native
  var deleteWordForwardAtRange: Fn_Range = js.native
  @JSName("deleteWordForward")
  var deleteWordForward_FEditor: Fn_Controller = js.native
  @JSName("delete")
  var delete_FEditor: Fn_Controller = js.native
  @JSName("deselect")
  var deselect_FEditor: Fn_Controller = js.native
  @JSName("flip")
  var flip_FEditor: Fn_Controller = js.native
  @JSName("focus")
  var focus_FEditor: Fn_Controller = js.native
  var hasCommand: js.Function1[/* type */ String, Boolean] = js.native
  var hasQuery: js.Function1[/* type */ String, Boolean] = js.native
  var insertBlock: Fn_Block = js.native
  var insertBlockAtRange: Fn_BlockRange = js.native
  var insertFragment: Fn_Fragment = js.native
  var insertFragmentAtRange: Fn_FragmentRange = js.native
  var insertFragmentByKey: Fn_FragmentIndex = js.native
  var insertFragmentByPath: Fn_FragmentIndexPath = js.native
  var insertInline: Fn_Inline = js.native
  var insertInlineAtRange: Fn_InlineRange = js.native
  var insertNodeByKey: Fn_Index = js.native
  var insertNodeByPath: Fn_IndexNode = js.native
  var insertText: Fn_Text = js.native
  var insertTextAtRange: Fn_RangeText = js.native
  var insertTextByKey: Fn_KeyMarks = js.native
  var insertTextByPath: Fn_MarksOffset = js.native
  var mergeNodeByKey: Fn_KeyController = js.native
  var mergeNodeByPath: Fn_Path = js.native
  @JSName("moveAnchorBackward")
  var moveAnchorBackward_FEditor: Fn_N = js.native
  @JSName("moveAnchorForward")
  var moveAnchorForward_FEditor: Fn_N = js.native
  var moveAnchorTo: Fn_Offset = js.native
  @JSName("moveAnchorToEndOfBlock")
  var moveAnchorToEndOfBlock_FEditor: Fn_Controller = js.native
  @JSName("moveAnchorToEndOfDocument")
  var moveAnchorToEndOfDocument_FEditor: Fn_Controller = js.native
  @JSName("moveAnchorToEndOfInline")
  var moveAnchorToEndOfInline_FEditor: Fn_Controller = js.native
  @JSName("moveAnchorToEndOfNextBlock")
  var moveAnchorToEndOfNextBlock_FEditor: Fn_Controller = js.native
  @JSName("moveAnchorToEndOfNextInline")
  var moveAnchorToEndOfNextInline_FEditor: Fn_Controller = js.native
  @JSName("moveAnchorToEndOfNextText")
  var moveAnchorToEndOfNextText_FEditor: Fn_Controller = js.native
  var moveAnchorToEndOfNode: Fn_Node = js.native
  @JSName("moveAnchorToEndOfPreviousBlock")
  var moveAnchorToEndOfPreviousBlock_FEditor: Fn_Controller = js.native
  @JSName("moveAnchorToEndOfPreviousInline")
  var moveAnchorToEndOfPreviousInline_FEditor: Fn_Controller = js.native
  @JSName("moveAnchorToEndOfPreviousText")
  var moveAnchorToEndOfPreviousText_FEditor: Fn_Controller = js.native
  @JSName("moveAnchorToEndOfText")
  var moveAnchorToEndOfText_FEditor: Fn_Controller = js.native
  @JSName("moveAnchorToStartOfBlock")
  var moveAnchorToStartOfBlock_FEditor: Fn_Controller = js.native
  @JSName("moveAnchorToStartOfDocument")
  var moveAnchorToStartOfDocument_FEditor: Fn_Controller = js.native
  @JSName("moveAnchorToStartOfInline")
  var moveAnchorToStartOfInline_FEditor: Fn_Controller = js.native
  @JSName("moveAnchorToStartOfNextBlock")
  var moveAnchorToStartOfNextBlock_FEditor: Fn_Controller = js.native
  @JSName("moveAnchorToStartOfNextInline")
  var moveAnchorToStartOfNextInline_FEditor: Fn_Controller = js.native
  @JSName("moveAnchorToStartOfNextText")
  var moveAnchorToStartOfNextText_FEditor: Fn_Controller = js.native
  var moveAnchorToStartOfNode: Fn_Node = js.native
  @JSName("moveAnchorToStartOfPreviousBlock")
  var moveAnchorToStartOfPreviousBlock_FEditor: Fn_Controller = js.native
  @JSName("moveAnchorToStartOfPreviousInline")
  var moveAnchorToStartOfPreviousInline_FEditor: Fn_Controller = js.native
  @JSName("moveAnchorToStartOfPreviousText")
  var moveAnchorToStartOfPreviousText_FEditor: Fn_Controller = js.native
  @JSName("moveAnchorToStartOfText")
  var moveAnchorToStartOfText_FEditor: Fn_Controller = js.native
  @JSName("moveAnchorWordBackward")
  var moveAnchorWordBackward_FEditor: Fn_Controller = js.native
  @JSName("moveAnchorWordForward")
  var moveAnchorWordForward_FEditor: Fn_Controller = js.native
  @JSName("moveBackward")
  var moveBackward_FEditor: Fn_N = js.native
  @JSName("moveEndBackward")
  var moveEndBackward_FEditor: Fn_N = js.native
  @JSName("moveEndForward")
  var moveEndForward_FEditor: Fn_N = js.native
  var moveEndTo: Fn_Offset = js.native
  @JSName("moveEndToEndOfBlock")
  var moveEndToEndOfBlock_FEditor: Fn_Controller = js.native
  @JSName("moveEndToEndOfDocument")
  var moveEndToEndOfDocument_FEditor: Fn_Controller = js.native
  @JSName("moveEndToEndOfInline")
  var moveEndToEndOfInline_FEditor: Fn_Controller = js.native
  @JSName("moveEndToEndOfNextBlock")
  var moveEndToEndOfNextBlock_FEditor: Fn_Controller = js.native
  @JSName("moveEndToEndOfNextInline")
  var moveEndToEndOfNextInline_FEditor: Fn_Controller = js.native
  @JSName("moveEndToEndOfNextText")
  var moveEndToEndOfNextText_FEditor: Fn_Controller = js.native
  var moveEndToEndOfNode: Fn_Node = js.native
  @JSName("moveEndToEndOfPreviousBlock")
  var moveEndToEndOfPreviousBlock_FEditor: Fn_Controller = js.native
  @JSName("moveEndToEndOfPreviousInline")
  var moveEndToEndOfPreviousInline_FEditor: Fn_Controller = js.native
  @JSName("moveEndToEndOfPreviousText")
  var moveEndToEndOfPreviousText_FEditor: Fn_Controller = js.native
  @JSName("moveEndToEndOfText")
  var moveEndToEndOfText_FEditor: Fn_Controller = js.native
  @JSName("moveEndToStartOfBlock")
  var moveEndToStartOfBlock_FEditor: Fn_Controller = js.native
  @JSName("moveEndToStartOfDocument")
  var moveEndToStartOfDocument_FEditor: Fn_Controller = js.native
  @JSName("moveEndToStartOfInline")
  var moveEndToStartOfInline_FEditor: Fn_Controller = js.native
  @JSName("moveEndToStartOfNextBlock")
  var moveEndToStartOfNextBlock_FEditor: Fn_Controller = js.native
  @JSName("moveEndToStartOfNextInline")
  var moveEndToStartOfNextInline_FEditor: Fn_Controller = js.native
  @JSName("moveEndToStartOfNextText")
  var moveEndToStartOfNextText_FEditor: Fn_Controller = js.native
  var moveEndToStartOfNode: Fn_Node = js.native
  @JSName("moveEndToStartOfPreviousBlock")
  var moveEndToStartOfPreviousBlock_FEditor: Fn_Controller = js.native
  @JSName("moveEndToStartOfPreviousInline")
  var moveEndToStartOfPreviousInline_FEditor: Fn_Controller = js.native
  @JSName("moveEndToStartOfPreviousText")
  var moveEndToStartOfPreviousText_FEditor: Fn_Controller = js.native
  @JSName("moveEndToStartOfText")
  var moveEndToStartOfText_FEditor: Fn_Controller = js.native
  @JSName("moveEndWordBackward")
  var moveEndWordBackward_FEditor: Fn_Controller = js.native
  @JSName("moveEndWordForward")
  var moveEndWordForward_FEditor: Fn_Controller = js.native
  @JSName("moveFocusBackward")
  var moveFocusBackward_FEditor: Fn_N = js.native
  @JSName("moveFocusForward")
  var moveFocusForward_FEditor: Fn_N = js.native
  var moveFocusTo: Fn_Offset = js.native
  @JSName("moveFocusToEndOfBlock")
  var moveFocusToEndOfBlock_FEditor: Fn_Controller = js.native
  @JSName("moveFocusToEndOfDocument")
  var moveFocusToEndOfDocument_FEditor: Fn_Controller = js.native
  @JSName("moveFocusToEndOfInline")
  var moveFocusToEndOfInline_FEditor: Fn_Controller = js.native
  @JSName("moveFocusToEndOfNextBlock")
  var moveFocusToEndOfNextBlock_FEditor: Fn_Controller = js.native
  @JSName("moveFocusToEndOfNextInline")
  var moveFocusToEndOfNextInline_FEditor: Fn_Controller = js.native
  @JSName("moveFocusToEndOfNextText")
  var moveFocusToEndOfNextText_FEditor: Fn_Controller = js.native
  var moveFocusToEndOfNode: Fn_Node = js.native
  @JSName("moveFocusToEndOfPreviousBlock")
  var moveFocusToEndOfPreviousBlock_FEditor: Fn_Controller = js.native
  @JSName("moveFocusToEndOfPreviousInline")
  var moveFocusToEndOfPreviousInline_FEditor: Fn_Controller = js.native
  @JSName("moveFocusToEndOfPreviousText")
  var moveFocusToEndOfPreviousText_FEditor: Fn_Controller = js.native
  @JSName("moveFocusToEndOfText")
  var moveFocusToEndOfText_FEditor: Fn_Controller = js.native
  @JSName("moveFocusToStartOfBlock")
  var moveFocusToStartOfBlock_FEditor: Fn_Controller = js.native
  @JSName("moveFocusToStartOfDocument")
  var moveFocusToStartOfDocument_FEditor: Fn_Controller = js.native
  @JSName("moveFocusToStartOfInline")
  var moveFocusToStartOfInline_FEditor: Fn_Controller = js.native
  @JSName("moveFocusToStartOfNextBlock")
  var moveFocusToStartOfNextBlock_FEditor: Fn_Controller = js.native
  @JSName("moveFocusToStartOfNextInline")
  var moveFocusToStartOfNextInline_FEditor: Fn_Controller = js.native
  @JSName("moveFocusToStartOfNextText")
  var moveFocusToStartOfNextText_FEditor: Fn_Controller = js.native
  var moveFocusToStartOfNode: Fn_Node = js.native
  @JSName("moveFocusToStartOfPreviousBlock")
  var moveFocusToStartOfPreviousBlock_FEditor: Fn_Controller = js.native
  @JSName("moveFocusToStartOfPreviousInline")
  var moveFocusToStartOfPreviousInline_FEditor: Fn_Controller = js.native
  @JSName("moveFocusToStartOfPreviousText")
  var moveFocusToStartOfPreviousText_FEditor: Fn_Controller = js.native
  @JSName("moveFocusToStartOfText")
  var moveFocusToStartOfText_FEditor: Fn_Controller = js.native
  @JSName("moveFocusWordBackward")
  var moveFocusWordBackward_FEditor: Fn_Controller = js.native
  @JSName("moveFocusWordForward")
  var moveFocusWordForward_FEditor: Fn_Controller = js.native
  @JSName("moveForward")
  var moveForward_FEditor: Fn_N = js.native
  var moveNodeByKey: Fn_KeyNewIndex = js.native
  var moveNodeByPath: Fn_NewIndex = js.native
  @JSName("moveStartBackward")
  var moveStartBackward_FEditor: Fn_N = js.native
  @JSName("moveStartForward")
  var moveStartForward_FEditor: Fn_N = js.native
  var moveStartTo: Fn_NPath = js.native
  @JSName("moveStartToEndOfBlock")
  var moveStartToEndOfBlock_FEditor: Fn_Controller = js.native
  @JSName("moveStartToEndOfDocument")
  var moveStartToEndOfDocument_FEditor: Fn_Controller = js.native
  @JSName("moveStartToEndOfInline")
  var moveStartToEndOfInline_FEditor: Fn_Controller = js.native
  @JSName("moveStartToEndOfNextBlock")
  var moveStartToEndOfNextBlock_FEditor: Fn_Controller = js.native
  @JSName("moveStartToEndOfNextInline")
  var moveStartToEndOfNextInline_FEditor: Fn_Controller = js.native
  @JSName("moveStartToEndOfNextText")
  var moveStartToEndOfNextText_FEditor: Fn_Controller = js.native
  var moveStartToEndOfNode: Fn_Node = js.native
  @JSName("moveStartToEndOfPreviousBlock")
  var moveStartToEndOfPreviousBlock_FEditor: Fn_Controller = js.native
  @JSName("moveStartToEndOfPreviousInline")
  var moveStartToEndOfPreviousInline_FEditor: Fn_Controller = js.native
  @JSName("moveStartToEndOfPreviousText")
  var moveStartToEndOfPreviousText_FEditor: Fn_Controller = js.native
  @JSName("moveStartToEndOfText")
  var moveStartToEndOfText_FEditor: Fn_Controller = js.native
  @JSName("moveStartToStartOfBlock")
  var moveStartToStartOfBlock_FEditor: Fn_Controller = js.native
  @JSName("moveStartToStartOfDocument")
  var moveStartToStartOfDocument_FEditor: Fn_Controller = js.native
  @JSName("moveStartToStartOfInline")
  var moveStartToStartOfInline_FEditor: Fn_Controller = js.native
  @JSName("moveStartToStartOfNextBlock")
  var moveStartToStartOfNextBlock_FEditor: Fn_Controller = js.native
  @JSName("moveStartToStartOfNextInline")
  var moveStartToStartOfNextInline_FEditor: Fn_Controller = js.native
  @JSName("moveStartToStartOfNextText")
  var moveStartToStartOfNextText_FEditor: Fn_Controller = js.native
  var moveStartToStartOfNode: Fn_Node = js.native
  @JSName("moveStartToStartOfPreviousBlock")
  var moveStartToStartOfPreviousBlock_FEditor: Fn_Controller = js.native
  @JSName("moveStartToStartOfPreviousInline")
  var moveStartToStartOfPreviousInline_FEditor: Fn_Controller = js.native
  @JSName("moveStartToStartOfPreviousText")
  var moveStartToStartOfPreviousText_FEditor: Fn_Controller = js.native
  @JSName("moveStartToStartOfText")
  var moveStartToStartOfText_FEditor: Fn_Controller = js.native
  @JSName("moveStartWordBackward")
  var moveStartWordBackward_FEditor: Fn_Controller = js.native
  @JSName("moveStartWordForward")
  var moveStartWordForward_FEditor: Fn_Controller = js.native
  var moveTo: Fn_Offset = js.native
  @JSName("moveToAnchor")
  var moveToAnchor_FEditor: Fn_Controller = js.native
  @JSName("moveToEndOfBlock")
  var moveToEndOfBlock_FEditor: Fn_Controller = js.native
  @JSName("moveToEndOfDocument")
  var moveToEndOfDocument_FEditor: Fn_Controller = js.native
  @JSName("moveToEndOfInline")
  var moveToEndOfInline_FEditor: Fn_Controller = js.native
  @JSName("moveToEndOfNextBlock")
  var moveToEndOfNextBlock_FEditor: Fn_Controller = js.native
  @JSName("moveToEndOfNextInline")
  var moveToEndOfNextInline_FEditor: Fn_Controller = js.native
  @JSName("moveToEndOfNextText")
  var moveToEndOfNextText_FEditor: Fn_Controller = js.native
  var moveToEndOfNode: Fn_Node = js.native
  @JSName("moveToEndOfPreviousBlock")
  var moveToEndOfPreviousBlock_FEditor: Fn_Controller = js.native
  @JSName("moveToEndOfPreviousInline")
  var moveToEndOfPreviousInline_FEditor: Fn_Controller = js.native
  @JSName("moveToEndOfPreviousText")
  var moveToEndOfPreviousText_FEditor: Fn_Controller = js.native
  @JSName("moveToEndOfText")
  var moveToEndOfText_FEditor: Fn_Controller = js.native
  @JSName("moveToEnd")
  var moveToEnd_FEditor: Fn_Controller = js.native
  @JSName("moveToFocus")
  var moveToFocus_FEditor: Fn_Controller = js.native
  @JSName("moveToRangeOfDocument")
  var moveToRangeOfDocument_FEditor: Fn_Controller = js.native
  var moveToRangeOfNode: Fn_Node = js.native
  @JSName("moveToStartOfBlock")
  var moveToStartOfBlock_FEditor: Fn_Controller = js.native
  @JSName("moveToStartOfDocument")
  var moveToStartOfDocument_FEditor: Fn_Controller = js.native
  @JSName("moveToStartOfInline")
  var moveToStartOfInline_FEditor: Fn_Controller = js.native
  @JSName("moveToStartOfNextBlock")
  var moveToStartOfNextBlock_FEditor: Fn_Controller = js.native
  @JSName("moveToStartOfNextInline")
  var moveToStartOfNextInline_FEditor: Fn_Controller = js.native
  @JSName("moveToStartOfNextText")
  var moveToStartOfNextText_FEditor: Fn_Controller = js.native
  var moveToStartOfNode: Fn_Node = js.native
  @JSName("moveToStartOfPreviousBlock")
  var moveToStartOfPreviousBlock_FEditor: Fn_Controller = js.native
  @JSName("moveToStartOfPreviousInline")
  var moveToStartOfPreviousInline_FEditor: Fn_Controller = js.native
  @JSName("moveToStartOfPreviousText")
  var moveToStartOfPreviousText_FEditor: Fn_Controller = js.native
  @JSName("moveToStartOfText")
  var moveToStartOfText_FEditor: Fn_Controller = js.native
  @JSName("moveToStart")
  var moveToStart_FEditor: Fn_Controller = js.native
  @JSName("moveWordBackward")
  var moveWordBackward_FEditor: Fn_Controller = js.native
  @JSName("moveWordForward")
  var moveWordForward_FEditor: Fn_Controller = js.native
  @JSName("normalize")
  var normalize_FEditor: Fn_Controller = js.native
  val operations: List[Operation] = js.native
  val plugins: js.Array[Plugin] = js.native
  var query: Fn_ArgsQuery = js.native
  val readOnly: Boolean = js.native
  @JSName("redo")
  var redo_FEditor: Fn_Controller = js.native
  var registerCommand: Fn_Command = js.native
  var registerQuery: Fn_Query = js.native
  var removeAllMarksByKey: Fn_KeyController = js.native
  var removeAllMarksByPath: Fn_Path = js.native
  var removeAnnotation: Fn_Annotation = js.native
  var removeMark: Fn_MarkController = js.native
  var removeMarkAtRange: Fn_MarkRangeController = js.native
  var removeMarkByKey: Fn_Key = js.native
  var removeMarkByPath: Fn_Length = js.native
  var removeMarksByPath: Fn_LengthMarks = js.native
  var removeNodeByKey: Fn_KeyController = js.native
  var removeNodeByPath: Fn_Path = js.native
  var removeTextByKey: Fn_KeyLength = js.native
  var removeTextByPath: Fn_LengthOffset = js.native
  var replaceMark: Fn_MarkNewMark = js.native
  var replaceNodeByKey: Fn_KeyNode = js.native
  var replaceNodeByPath: Fn_NewNode = js.native
  var replaceTextByKey: Fn_KeyNode = js.native
  var replaceTextByPath: Fn_LengthMarksOffset = js.native
  var run: Fn_ArgsKey = js.native
  var save: js.Function1[/* operation */ Operation, Unit] = js.native
  var select: Fn_Options = js.native
  var setAnchor: js.Function1[/* point */ Point, Unit] = js.native
  var setAnnotation: Fn_AnnotationNewProperties = js.native
  var setBlocks: Fn_Properties = js.native
  var setBlocksAtRange: Fn_PropertiesRange = js.native
  var setData: Fn_Data = js.native
  var setEnd: js.Function1[/* point */ Point, Unit] = js.native
  var setFocus: js.Function1[/* point */ Point, Unit] = js.native
  var setInlines: Fn_PropertiesController = js.native
  var setInlinesAtRange: Fn_PropertiesRangeController = js.native
  var setMarkByKey: Fn_KeyLengthNewProperties = js.native
  var setMarkByPath: Fn_LengthNewProperties = js.native
  var setNodeByKey: Fn_KeyProperties = js.native
  var setNodeByPath: Fn_NewProperties = js.native
  var setStart: js.Function1[/* point */ Point, Unit] = js.native
  var setTextByKey: Fn_KeyMarksText = js.native
  var setTextByPath: Fn_MarksPath = js.native
  @JSName("snapshotSelection")
  var snapshotSelection_FEditor: Fn_Controller = js.native
  var splitBlockAtRange: Fn_Height = js.native
  @JSName("splitBlock")
  var splitBlock_FEditor: Fn_Depth = js.native
  var splitDescendantsByKey: Fn_KeyTextKey = js.native
  var splitDescendantsByPath: Fn_PathTextOffset = js.native
  var splitInline: Fn_DepthController = js.native
  var splitInlineAtRange: Fn_Height = js.native
  var splitNodeByKey: Fn_KeyOffset = js.native
  var splitNodeByPath: Fn_OptionsPath = js.native
  var toggleMark: Fn_Mark = js.native
  var toggleMarkAtRange: Fn_MarkRangeController = js.native
  @JSName("undo")
  var undo_FEditor: Fn_Controller = js.native
  var unwrapBlock: Fn_PropertiesBlock = js.native
  var unwrapBlockAtRange: Fn_PropertiesRangeBlock = js.native
  var unwrapBlockByKey: Fn_KeyPropertiesBlockProperties = js.native
  var unwrapBlockByPath: Fn_PathProperties = js.native
  var unwrapChildrenByKey: Fn_KeyController = js.native
  var unwrapChildrenByPath: Fn_PathArray = js.native
  var unwrapInline: Fn_PropertiesControllerEditor = js.native
  var unwrapInlineAtRange: Fn_PropertiesRangeController = js.native
  var unwrapInlineByKey: Fn_KeyPropertiesController = js.native
  var unwrapInlineByPath: Fn_PathPropertiesController = js.native
  var unwrapNodeByKey: Fn_KeyController = js.native
  var unwrapNodeByPath: Fn_Path = js.native
  val value: Value = js.native
  var withoutMerging: Fn_FnEditor = js.native
  var withoutNormalizing: Fn_Fn = js.native
  var withoutSaving: Fn_FnEditor = js.native
  var wrapBlock: Fn_PropertiesBlock = js.native
  var wrapBlockAtRange: Fn_PropertiesRangeBlock = js.native
  var wrapBlockByKey: Fn_KeyPropertiesBlockProperties = js.native
  var wrapBlockByPath: Fn_BlockPath = js.native
  var wrapInline: Fn_PropertiesControllerEditor = js.native
  var wrapInlineAtRange: Fn_PropertiesRangeController = js.native
  var wrapInlineByKey: Fn_KeyPropertiesController = js.native
  var wrapInlineByPath: Fn_PathPropertiesController = js.native
  var wrapNodeByKey: Fn_KeyParent = js.native
  var wrapNodeByPath: Fn_Parent = js.native
  var wrapText: Fn_Prefix = js.native
  var wrapTextAtRange: Fn_PrefixRange = js.native
  def findDOMNode(path: js.Array[Double]): ReactNode | Null = js.native
  def findDOMNode(path: List[Double]): ReactNode | Null = js.native
  def findDOMPoint(point: Point): Anon_Node | Null = js.native
  def findDOMPoint(point: PointJSON): Anon_Node | Null = js.native
  def findDOMPoint(point: PointProperties): Anon_Node | Null = js.native
  def findDOMRange(range: RangeType): Range | Null = js.native
  def findDOMRange(range: RangeTypeJSON): Range | Null = js.native
  def findDOMRange(range: RangeTypeProperties): Range | Null = js.native
  def findEventRange(event: SyntheticEvent[Element, Event]): typings.slate.slateMod.Range | Null = js.native
  def findEventRange(event: Event): typings.slate.slateMod.Range | Null = js.native
  def findNode(element: Element): Node | Null = js.native
  def findPath(element: Element): List[Double] | Null = js.native
  def findPoint(nativeNode: Element, nativeOffset: Double): Point | Null = js.native
  def findRange(domRange: Range): typings.slate.slateMod.Range | Null = js.native
  def findRange(domRange: Selection): typings.slate.slateMod.Range | Null = js.native
  def findSelection(domSelection: Selection): typings.slate.slateMod.Selection | Null = js.native
  // Instance methods
  def resolveController(plugins: js.Array[Plugin], schema: SchemaProperties, commands: js.Array[_], queries: js.Array[_]): Unit = js.native
}

