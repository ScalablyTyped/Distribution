package typings.slateReact.mod

import typings.immutable.Immutable.List
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.slate.mod.Controller
import typings.slate.mod.Node
import typings.slate.mod.Operation
import typings.slate.mod.Point
import typings.slate.mod.PointJSON
import typings.slate.mod.PointProperties
import typings.slate.mod.RangeType
import typings.slate.mod.RangeTypeJSON
import typings.slate.mod.RangeTypeProperties
import typings.slate.mod.SchemaProperties
import typings.slate.mod.Value
import typings.slateReact.AnonNode
import typings.slateReact.Fn0
import typings.slateReact.Fn1
import typings.slateReact.Fn10
import typings.slateReact.Fn11
import typings.slateReact.Fn12
import typings.slateReact.Fn13
import typings.slateReact.Fn14
import typings.slateReact.Fn2
import typings.slateReact.Fn3
import typings.slateReact.Fn4
import typings.slateReact.Fn5
import typings.slateReact.Fn6
import typings.slateReact.Fn7
import typings.slateReact.Fn8
import typings.slateReact.Fn9
import typings.slateReact.FnCall
import typings.slateReact.FnCallAnnotationNewProperties
import typings.slateReact.FnCallBlock
import typings.slateReact.FnCallCommand
import typings.slateReact.FnCallData
import typings.slateReact.FnCallDepth
import typings.slateReact.FnCallFn
import typings.slateReact.FnCallFragment
import typings.slateReact.FnCallInline
import typings.slateReact.FnCallKey
import typings.slateReact.FnCallKeyArgs
import typings.slateReact.FnCallKeyIndexFragment
import typings.slateReact.FnCallKeyIndexNode
import typings.slateReact.FnCallKeyNewKeyNewIndex
import typings.slateReact.FnCallKeyNode
import typings.slateReact.FnCallKeyOffset
import typings.slateReact.FnCallKeyOffsetLength
import typings.slateReact.FnCallKeyOffsetLengthMark
import typings.slateReact.FnCallKeyOffsetLengthPropertiesNewProperties
import typings.slateReact.FnCallKeyOffsetTextMarks
import typings.slateReact.FnCallKeyParent
import typings.slateReact.FnCallKeyProperties
import typings.slateReact.FnCallKeyTextKeyTextOffset
import typings.slateReact.FnCallKeyTextMarks
import typings.slateReact.FnCallMark
import typings.slateReact.FnCallMarkNewMark
import typings.slateReact.FnCallN
import typings.slateReact.FnCallNode
import typings.slateReact.FnCallOperation
import typings.slateReact.FnCallPath
import typings.slateReact.FnCallPathBlock
import typings.slateReact.FnCallPathIndexFragment
import typings.slateReact.FnCallPathIndexNode
import typings.slateReact.FnCallPathN
import typings.slateReact.FnCallPathNewNode
import typings.slateReact.FnCallPathNewPathNewIndex
import typings.slateReact.FnCallPathNewProperties
import typings.slateReact.FnCallPathOffset
import typings.slateReact.FnCallPathOffsetLength
import typings.slateReact.FnCallPathOffsetLengthMark
import typings.slateReact.FnCallPathOffsetLengthMarks
import typings.slateReact.FnCallPathOffsetLengthPropertiesNewProperties
import typings.slateReact.FnCallPathOffsetLengthTextMarks
import typings.slateReact.FnCallPathOffsetTextMarks
import typings.slateReact.FnCallPathParent
import typings.slateReact.FnCallPathPositionOptions
import typings.slateReact.FnCallPathProperties
import typings.slateReact.FnCallPathTextMarks
import typings.slateReact.FnCallPathTextPathTextOffset
import typings.slateReact.FnCallPrefixSuffix
import typings.slateReact.FnCallProperties
import typings.slateReact.FnCallPropertiesOptions
import typings.slateReact.FnCallQuery
import typings.slateReact.FnCallQueryArgs
import typings.slateReact.FnCallRange
import typings.slateReact.FnCallRangeBlock
import typings.slateReact.FnCallRangeFragment
import typings.slateReact.FnCallRangeHeight
import typings.slateReact.FnCallRangeInline
import typings.slateReact.FnCallRangeMark
import typings.slateReact.FnCallRangeMarks
import typings.slateReact.FnCallRangeN
import typings.slateReact.FnCallRangePrefixSuffix
import typings.slateReact.FnCallRangeProperties
import typings.slateReact.FnCallRangeText
import typings.slateReact.FnCallText
import typings.slateReact.FnCallTypeArgs
import typings.std.Element
import typings.std.Event_
import typings.std.Range
import typings.std.Selection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate-react", "Editor")
@js.native
class Editor ()
  extends Component[EditorProps[Editor], EditorState, js.Any]
     with Controller {
  // Controller
  var addAnnotation: FnCall = js.native
  var addMark: FnCallMark = js.native
  var addMarkAtRange: FnCallRangeMark = js.native
  var addMarkByKey: FnCallKeyOffsetLengthMark = js.native
  var addMarkByPath: FnCallPathOffsetLengthMark = js.native
  var addMarks: Fn0 = js.native
  var addMarksAtRange: FnCallRangeMarks = js.native
  var addMarksByPath: FnCallPathOffsetLengthMarks = js.native
  var applyOperation: FnCallOperation = js.native
  @JSName("blur")
  var blur_FEditor: Fn1 = js.native
  var command: FnCallTypeArgs = js.native
  var controller: typings.slate.mod.Editor = js.native
  var deleteAtRange: FnCallRange = js.native
  var deleteBackwardAtRange: FnCallRangeN = js.native
  @JSName("deleteBackward")
  var deleteBackward_FEditor: FnCallN = js.native
  var deleteCharBackwardAtRange: FnCallRange = js.native
  @JSName("deleteCharBackward")
  var deleteCharBackward_FEditor: Fn1 = js.native
  var deleteCharForwardAtRange: FnCallRange = js.native
  @JSName("deleteCharForward")
  var deleteCharForward_FEditor: Fn1 = js.native
  var deleteForwardAtRange: FnCallRangeN = js.native
  @JSName("deleteForward")
  var deleteForward_FEditor: FnCallN = js.native
  var deleteLineBackwardAtRange: FnCallRange = js.native
  @JSName("deleteLineBackward")
  var deleteLineBackward_FEditor: Fn1 = js.native
  var deleteLineForwardAtRange: FnCallRange = js.native
  @JSName("deleteLineForward")
  var deleteLineForward_FEditor: Fn1 = js.native
  var deleteWordBackwardAtRange: FnCallRange = js.native
  @JSName("deleteWordBackward")
  var deleteWordBackward_FEditor: Fn1 = js.native
  var deleteWordForwardAtRange: FnCallRange = js.native
  @JSName("deleteWordForward")
  var deleteWordForward_FEditor: Fn1 = js.native
  @JSName("delete")
  var delete_FEditor: Fn1 = js.native
  @JSName("deselect")
  var deselect_FEditor: Fn1 = js.native
  @JSName("flip")
  var flip_FEditor: Fn1 = js.native
  @JSName("focus")
  var focus_FEditor: Fn1 = js.native
  var hasCommand: js.Function1[/* type */ String, Boolean] = js.native
  var hasQuery: js.Function1[/* type */ String, Boolean] = js.native
  var insertBlock: FnCallBlock = js.native
  var insertBlockAtRange: FnCallRangeBlock = js.native
  var insertFragment: FnCallFragment = js.native
  var insertFragmentAtRange: FnCallRangeFragment = js.native
  var insertFragmentByKey: FnCallKeyIndexFragment = js.native
  var insertFragmentByPath: FnCallPathIndexFragment = js.native
  var insertInline: FnCallInline = js.native
  var insertInlineAtRange: FnCallRangeInline = js.native
  var insertNodeByKey: FnCallKeyIndexNode = js.native
  var insertNodeByPath: FnCallPathIndexNode = js.native
  var insertText: FnCallText = js.native
  var insertTextAtRange: FnCallRangeText = js.native
  var insertTextByKey: FnCallKeyOffsetTextMarks = js.native
  var insertTextByPath: FnCallPathOffsetTextMarks = js.native
  var mergeNodeByKey: FnCallKey = js.native
  var mergeNodeByPath: FnCallPath = js.native
  @JSName("moveAnchorBackward")
  var moveAnchorBackward_FEditor: FnCallN = js.native
  @JSName("moveAnchorForward")
  var moveAnchorForward_FEditor: FnCallN = js.native
  var moveAnchorTo: FnCallPathOffset = js.native
  @JSName("moveAnchorToEndOfBlock")
  var moveAnchorToEndOfBlock_FEditor: Fn1 = js.native
  @JSName("moveAnchorToEndOfDocument")
  var moveAnchorToEndOfDocument_FEditor: Fn1 = js.native
  @JSName("moveAnchorToEndOfInline")
  var moveAnchorToEndOfInline_FEditor: Fn1 = js.native
  @JSName("moveAnchorToEndOfNextBlock")
  var moveAnchorToEndOfNextBlock_FEditor: Fn1 = js.native
  @JSName("moveAnchorToEndOfNextInline")
  var moveAnchorToEndOfNextInline_FEditor: Fn1 = js.native
  @JSName("moveAnchorToEndOfNextText")
  var moveAnchorToEndOfNextText_FEditor: Fn1 = js.native
  var moveAnchorToEndOfNode: FnCallNode = js.native
  @JSName("moveAnchorToEndOfPreviousBlock")
  var moveAnchorToEndOfPreviousBlock_FEditor: Fn1 = js.native
  @JSName("moveAnchorToEndOfPreviousInline")
  var moveAnchorToEndOfPreviousInline_FEditor: Fn1 = js.native
  @JSName("moveAnchorToEndOfPreviousText")
  var moveAnchorToEndOfPreviousText_FEditor: Fn1 = js.native
  @JSName("moveAnchorToEndOfText")
  var moveAnchorToEndOfText_FEditor: Fn1 = js.native
  @JSName("moveAnchorToStartOfBlock")
  var moveAnchorToStartOfBlock_FEditor: Fn1 = js.native
  @JSName("moveAnchorToStartOfDocument")
  var moveAnchorToStartOfDocument_FEditor: Fn1 = js.native
  @JSName("moveAnchorToStartOfInline")
  var moveAnchorToStartOfInline_FEditor: Fn1 = js.native
  @JSName("moveAnchorToStartOfNextBlock")
  var moveAnchorToStartOfNextBlock_FEditor: Fn1 = js.native
  @JSName("moveAnchorToStartOfNextInline")
  var moveAnchorToStartOfNextInline_FEditor: Fn1 = js.native
  @JSName("moveAnchorToStartOfNextText")
  var moveAnchorToStartOfNextText_FEditor: Fn1 = js.native
  var moveAnchorToStartOfNode: FnCallNode = js.native
  @JSName("moveAnchorToStartOfPreviousBlock")
  var moveAnchorToStartOfPreviousBlock_FEditor: Fn1 = js.native
  @JSName("moveAnchorToStartOfPreviousInline")
  var moveAnchorToStartOfPreviousInline_FEditor: Fn1 = js.native
  @JSName("moveAnchorToStartOfPreviousText")
  var moveAnchorToStartOfPreviousText_FEditor: Fn1 = js.native
  @JSName("moveAnchorToStartOfText")
  var moveAnchorToStartOfText_FEditor: Fn1 = js.native
  @JSName("moveAnchorWordBackward")
  var moveAnchorWordBackward_FEditor: Fn1 = js.native
  @JSName("moveAnchorWordForward")
  var moveAnchorWordForward_FEditor: Fn1 = js.native
  @JSName("moveBackward")
  var moveBackward_FEditor: FnCallN = js.native
  @JSName("moveEndBackward")
  var moveEndBackward_FEditor: FnCallN = js.native
  @JSName("moveEndForward")
  var moveEndForward_FEditor: FnCallN = js.native
  var moveEndTo: FnCallPathOffset = js.native
  @JSName("moveEndToEndOfBlock")
  var moveEndToEndOfBlock_FEditor: Fn1 = js.native
  @JSName("moveEndToEndOfDocument")
  var moveEndToEndOfDocument_FEditor: Fn1 = js.native
  @JSName("moveEndToEndOfInline")
  var moveEndToEndOfInline_FEditor: Fn1 = js.native
  @JSName("moveEndToEndOfNextBlock")
  var moveEndToEndOfNextBlock_FEditor: Fn1 = js.native
  @JSName("moveEndToEndOfNextInline")
  var moveEndToEndOfNextInline_FEditor: Fn1 = js.native
  @JSName("moveEndToEndOfNextText")
  var moveEndToEndOfNextText_FEditor: Fn1 = js.native
  var moveEndToEndOfNode: FnCallNode = js.native
  @JSName("moveEndToEndOfPreviousBlock")
  var moveEndToEndOfPreviousBlock_FEditor: Fn1 = js.native
  @JSName("moveEndToEndOfPreviousInline")
  var moveEndToEndOfPreviousInline_FEditor: Fn1 = js.native
  @JSName("moveEndToEndOfPreviousText")
  var moveEndToEndOfPreviousText_FEditor: Fn1 = js.native
  @JSName("moveEndToEndOfText")
  var moveEndToEndOfText_FEditor: Fn1 = js.native
  @JSName("moveEndToStartOfBlock")
  var moveEndToStartOfBlock_FEditor: Fn1 = js.native
  @JSName("moveEndToStartOfDocument")
  var moveEndToStartOfDocument_FEditor: Fn1 = js.native
  @JSName("moveEndToStartOfInline")
  var moveEndToStartOfInline_FEditor: Fn1 = js.native
  @JSName("moveEndToStartOfNextBlock")
  var moveEndToStartOfNextBlock_FEditor: Fn1 = js.native
  @JSName("moveEndToStartOfNextInline")
  var moveEndToStartOfNextInline_FEditor: Fn1 = js.native
  @JSName("moveEndToStartOfNextText")
  var moveEndToStartOfNextText_FEditor: Fn1 = js.native
  var moveEndToStartOfNode: FnCallNode = js.native
  @JSName("moveEndToStartOfPreviousBlock")
  var moveEndToStartOfPreviousBlock_FEditor: Fn1 = js.native
  @JSName("moveEndToStartOfPreviousInline")
  var moveEndToStartOfPreviousInline_FEditor: Fn1 = js.native
  @JSName("moveEndToStartOfPreviousText")
  var moveEndToStartOfPreviousText_FEditor: Fn1 = js.native
  @JSName("moveEndToStartOfText")
  var moveEndToStartOfText_FEditor: Fn1 = js.native
  @JSName("moveEndWordBackward")
  var moveEndWordBackward_FEditor: Fn1 = js.native
  @JSName("moveEndWordForward")
  var moveEndWordForward_FEditor: Fn1 = js.native
  @JSName("moveFocusBackward")
  var moveFocusBackward_FEditor: FnCallN = js.native
  @JSName("moveFocusForward")
  var moveFocusForward_FEditor: FnCallN = js.native
  var moveFocusTo: FnCallPathOffset = js.native
  @JSName("moveFocusToEndOfBlock")
  var moveFocusToEndOfBlock_FEditor: Fn1 = js.native
  @JSName("moveFocusToEndOfDocument")
  var moveFocusToEndOfDocument_FEditor: Fn1 = js.native
  @JSName("moveFocusToEndOfInline")
  var moveFocusToEndOfInline_FEditor: Fn1 = js.native
  @JSName("moveFocusToEndOfNextBlock")
  var moveFocusToEndOfNextBlock_FEditor: Fn1 = js.native
  @JSName("moveFocusToEndOfNextInline")
  var moveFocusToEndOfNextInline_FEditor: Fn1 = js.native
  @JSName("moveFocusToEndOfNextText")
  var moveFocusToEndOfNextText_FEditor: Fn1 = js.native
  var moveFocusToEndOfNode: FnCallNode = js.native
  @JSName("moveFocusToEndOfPreviousBlock")
  var moveFocusToEndOfPreviousBlock_FEditor: Fn1 = js.native
  @JSName("moveFocusToEndOfPreviousInline")
  var moveFocusToEndOfPreviousInline_FEditor: Fn1 = js.native
  @JSName("moveFocusToEndOfPreviousText")
  var moveFocusToEndOfPreviousText_FEditor: Fn1 = js.native
  @JSName("moveFocusToEndOfText")
  var moveFocusToEndOfText_FEditor: Fn1 = js.native
  @JSName("moveFocusToStartOfBlock")
  var moveFocusToStartOfBlock_FEditor: Fn1 = js.native
  @JSName("moveFocusToStartOfDocument")
  var moveFocusToStartOfDocument_FEditor: Fn1 = js.native
  @JSName("moveFocusToStartOfInline")
  var moveFocusToStartOfInline_FEditor: Fn1 = js.native
  @JSName("moveFocusToStartOfNextBlock")
  var moveFocusToStartOfNextBlock_FEditor: Fn1 = js.native
  @JSName("moveFocusToStartOfNextInline")
  var moveFocusToStartOfNextInline_FEditor: Fn1 = js.native
  @JSName("moveFocusToStartOfNextText")
  var moveFocusToStartOfNextText_FEditor: Fn1 = js.native
  var moveFocusToStartOfNode: FnCallNode = js.native
  @JSName("moveFocusToStartOfPreviousBlock")
  var moveFocusToStartOfPreviousBlock_FEditor: Fn1 = js.native
  @JSName("moveFocusToStartOfPreviousInline")
  var moveFocusToStartOfPreviousInline_FEditor: Fn1 = js.native
  @JSName("moveFocusToStartOfPreviousText")
  var moveFocusToStartOfPreviousText_FEditor: Fn1 = js.native
  @JSName("moveFocusToStartOfText")
  var moveFocusToStartOfText_FEditor: Fn1 = js.native
  @JSName("moveFocusWordBackward")
  var moveFocusWordBackward_FEditor: Fn1 = js.native
  @JSName("moveFocusWordForward")
  var moveFocusWordForward_FEditor: Fn1 = js.native
  @JSName("moveForward")
  var moveForward_FEditor: FnCallN = js.native
  var moveNodeByKey: FnCallKeyNewKeyNewIndex = js.native
  var moveNodeByPath: FnCallPathNewPathNewIndex = js.native
  @JSName("moveStartBackward")
  var moveStartBackward_FEditor: FnCallN = js.native
  @JSName("moveStartForward")
  var moveStartForward_FEditor: FnCallN = js.native
  var moveStartTo: FnCallPathN = js.native
  @JSName("moveStartToEndOfBlock")
  var moveStartToEndOfBlock_FEditor: Fn1 = js.native
  @JSName("moveStartToEndOfDocument")
  var moveStartToEndOfDocument_FEditor: Fn1 = js.native
  @JSName("moveStartToEndOfInline")
  var moveStartToEndOfInline_FEditor: Fn1 = js.native
  @JSName("moveStartToEndOfNextBlock")
  var moveStartToEndOfNextBlock_FEditor: Fn1 = js.native
  @JSName("moveStartToEndOfNextInline")
  var moveStartToEndOfNextInline_FEditor: Fn1 = js.native
  @JSName("moveStartToEndOfNextText")
  var moveStartToEndOfNextText_FEditor: Fn1 = js.native
  var moveStartToEndOfNode: FnCallNode = js.native
  @JSName("moveStartToEndOfPreviousBlock")
  var moveStartToEndOfPreviousBlock_FEditor: Fn1 = js.native
  @JSName("moveStartToEndOfPreviousInline")
  var moveStartToEndOfPreviousInline_FEditor: Fn1 = js.native
  @JSName("moveStartToEndOfPreviousText")
  var moveStartToEndOfPreviousText_FEditor: Fn1 = js.native
  @JSName("moveStartToEndOfText")
  var moveStartToEndOfText_FEditor: Fn1 = js.native
  @JSName("moveStartToStartOfBlock")
  var moveStartToStartOfBlock_FEditor: Fn1 = js.native
  @JSName("moveStartToStartOfDocument")
  var moveStartToStartOfDocument_FEditor: Fn1 = js.native
  @JSName("moveStartToStartOfInline")
  var moveStartToStartOfInline_FEditor: Fn1 = js.native
  @JSName("moveStartToStartOfNextBlock")
  var moveStartToStartOfNextBlock_FEditor: Fn1 = js.native
  @JSName("moveStartToStartOfNextInline")
  var moveStartToStartOfNextInline_FEditor: Fn1 = js.native
  @JSName("moveStartToStartOfNextText")
  var moveStartToStartOfNextText_FEditor: Fn1 = js.native
  var moveStartToStartOfNode: FnCallNode = js.native
  @JSName("moveStartToStartOfPreviousBlock")
  var moveStartToStartOfPreviousBlock_FEditor: Fn1 = js.native
  @JSName("moveStartToStartOfPreviousInline")
  var moveStartToStartOfPreviousInline_FEditor: Fn1 = js.native
  @JSName("moveStartToStartOfPreviousText")
  var moveStartToStartOfPreviousText_FEditor: Fn1 = js.native
  @JSName("moveStartToStartOfText")
  var moveStartToStartOfText_FEditor: Fn1 = js.native
  @JSName("moveStartWordBackward")
  var moveStartWordBackward_FEditor: Fn1 = js.native
  @JSName("moveStartWordForward")
  var moveStartWordForward_FEditor: Fn1 = js.native
  var moveTo: FnCallPathOffset = js.native
  @JSName("moveToAnchor")
  var moveToAnchor_FEditor: Fn1 = js.native
  @JSName("moveToEndOfBlock")
  var moveToEndOfBlock_FEditor: Fn1 = js.native
  @JSName("moveToEndOfDocument")
  var moveToEndOfDocument_FEditor: Fn1 = js.native
  @JSName("moveToEndOfInline")
  var moveToEndOfInline_FEditor: Fn1 = js.native
  @JSName("moveToEndOfNextBlock")
  var moveToEndOfNextBlock_FEditor: Fn1 = js.native
  @JSName("moveToEndOfNextInline")
  var moveToEndOfNextInline_FEditor: Fn1 = js.native
  @JSName("moveToEndOfNextText")
  var moveToEndOfNextText_FEditor: Fn1 = js.native
  var moveToEndOfNode: FnCallNode = js.native
  @JSName("moveToEndOfPreviousBlock")
  var moveToEndOfPreviousBlock_FEditor: Fn1 = js.native
  @JSName("moveToEndOfPreviousInline")
  var moveToEndOfPreviousInline_FEditor: Fn1 = js.native
  @JSName("moveToEndOfPreviousText")
  var moveToEndOfPreviousText_FEditor: Fn1 = js.native
  @JSName("moveToEndOfText")
  var moveToEndOfText_FEditor: Fn1 = js.native
  @JSName("moveToEnd")
  var moveToEnd_FEditor: Fn1 = js.native
  @JSName("moveToFocus")
  var moveToFocus_FEditor: Fn1 = js.native
  @JSName("moveToRangeOfDocument")
  var moveToRangeOfDocument_FEditor: Fn1 = js.native
  var moveToRangeOfNode: FnCallNode = js.native
  @JSName("moveToStartOfBlock")
  var moveToStartOfBlock_FEditor: Fn1 = js.native
  @JSName("moveToStartOfDocument")
  var moveToStartOfDocument_FEditor: Fn1 = js.native
  @JSName("moveToStartOfInline")
  var moveToStartOfInline_FEditor: Fn1 = js.native
  @JSName("moveToStartOfNextBlock")
  var moveToStartOfNextBlock_FEditor: Fn1 = js.native
  @JSName("moveToStartOfNextInline")
  var moveToStartOfNextInline_FEditor: Fn1 = js.native
  @JSName("moveToStartOfNextText")
  var moveToStartOfNextText_FEditor: Fn1 = js.native
  var moveToStartOfNode: FnCallNode = js.native
  @JSName("moveToStartOfPreviousBlock")
  var moveToStartOfPreviousBlock_FEditor: Fn1 = js.native
  @JSName("moveToStartOfPreviousInline")
  var moveToStartOfPreviousInline_FEditor: Fn1 = js.native
  @JSName("moveToStartOfPreviousText")
  var moveToStartOfPreviousText_FEditor: Fn1 = js.native
  @JSName("moveToStartOfText")
  var moveToStartOfText_FEditor: Fn1 = js.native
  @JSName("moveToStart")
  var moveToStart_FEditor: Fn1 = js.native
  @JSName("moveWordBackward")
  var moveWordBackward_FEditor: Fn1 = js.native
  @JSName("moveWordForward")
  var moveWordForward_FEditor: Fn1 = js.native
  @JSName("normalize")
  var normalize_FEditor: Fn1 = js.native
  val operations: List[Operation] = js.native
  val plugins: js.Array[Plugin[Editor]] = js.native
  var query: FnCallQueryArgs = js.native
  val readOnly: Boolean = js.native
  @JSName("redo")
  var redo_FEditor: Fn1 = js.native
  var registerCommand: FnCallCommand = js.native
  var registerQuery: FnCallQuery = js.native
  var removeAllMarksByKey: FnCallKey = js.native
  var removeAllMarksByPath: FnCallPath = js.native
  var removeAnnotation: FnCall = js.native
  var removeMark: Fn4 = js.native
  var removeMarkAtRange: Fn7 = js.native
  var removeMarkByKey: FnCallKeyOffsetLengthMark = js.native
  var removeMarkByPath: FnCallPathOffsetLengthMark = js.native
  var removeMarksByPath: FnCallPathOffsetLengthMarks = js.native
  var removeNodeByKey: FnCallKey = js.native
  var removeNodeByPath: FnCallPath = js.native
  var removeTextByKey: FnCallKeyOffsetLength = js.native
  var removeTextByPath: FnCallPathOffsetLength = js.native
  var replaceMark: FnCallMarkNewMark = js.native
  var replaceNodeByKey: FnCallKeyNode = js.native
  var replaceNodeByPath: FnCallPathNewNode = js.native
  var replaceTextByKey: FnCallKeyNode = js.native
  var replaceTextByPath: FnCallPathOffsetLengthTextMarks = js.native
  var run: FnCallKeyArgs = js.native
  var save: js.Function1[/* operation */ Operation, Unit] = js.native
  var select: FnCallPropertiesOptions = js.native
  var setAnchor: js.Function1[/* point */ Point, Unit] = js.native
  var setAnnotation: FnCallAnnotationNewProperties = js.native
  var setBlocks: FnCallProperties = js.native
  var setBlocksAtRange: FnCallRangeProperties = js.native
  var setData: FnCallData = js.native
  var setEnd: js.Function1[/* point */ Point, Unit] = js.native
  var setFocus: js.Function1[/* point */ Point, Unit] = js.native
  var setInlines: Fn2 = js.native
  var setInlinesAtRange: Fn8 = js.native
  var setMarkByKey: FnCallKeyOffsetLengthPropertiesNewProperties = js.native
  var setMarkByPath: FnCallPathOffsetLengthPropertiesNewProperties = js.native
  var setNodeByKey: FnCallKeyProperties = js.native
  var setNodeByPath: FnCallPathNewProperties = js.native
  var setStart: js.Function1[/* point */ Point, Unit] = js.native
  var setTextByKey: FnCallKeyTextMarks = js.native
  var setTextByPath: FnCallPathTextMarks = js.native
  @JSName("snapshotSelection")
  var snapshotSelection_FEditor: Fn1 = js.native
  var splitBlockAtRange: FnCallRangeHeight = js.native
  @JSName("splitBlock")
  var splitBlock_FEditor: FnCallDepth = js.native
  var splitDescendantsByKey: FnCallKeyTextKeyTextOffset = js.native
  var splitDescendantsByPath: FnCallPathTextPathTextOffset = js.native
  var splitInline: Fn3 = js.native
  var splitInlineAtRange: FnCallRangeHeight = js.native
  var splitNodeByKey: FnCallKeyOffset = js.native
  var splitNodeByPath: FnCallPathPositionOptions = js.native
  var toggleMark: FnCallMark = js.native
  var toggleMarkAtRange: Fn7 = js.native
  @JSName("undo")
  var undo_FEditor: Fn1 = js.native
  var unwrapBlock: Fn5 = js.native
  var unwrapBlockAtRange: Fn9 = js.native
  var unwrapBlockByKey: Fn10 = js.native
  var unwrapBlockByPath: FnCallPathProperties = js.native
  var unwrapChildrenByKey: FnCallKey = js.native
  var unwrapChildrenByPath: Fn11 = js.native
  var unwrapInline: Fn6 = js.native
  var unwrapInlineAtRange: Fn8 = js.native
  var unwrapInlineByKey: Fn12 = js.native
  var unwrapInlineByPath: Fn13 = js.native
  var unwrapNodeByKey: FnCallKey = js.native
  var unwrapNodeByPath: FnCallPath = js.native
  val value: Value = js.native
  var withoutMerging: Fn14 = js.native
  var withoutNormalizing: FnCallFn = js.native
  var withoutSaving: Fn14 = js.native
  var wrapBlock: Fn5 = js.native
  var wrapBlockAtRange: Fn9 = js.native
  var wrapBlockByKey: Fn10 = js.native
  var wrapBlockByPath: FnCallPathBlock = js.native
  var wrapInline: Fn6 = js.native
  var wrapInlineAtRange: Fn8 = js.native
  var wrapInlineByKey: Fn12 = js.native
  var wrapInlineByPath: Fn13 = js.native
  var wrapNodeByKey: FnCallKeyParent = js.native
  var wrapNodeByPath: FnCallPathParent = js.native
  var wrapText: FnCallPrefixSuffix = js.native
  var wrapTextAtRange: FnCallRangePrefixSuffix = js.native
  def findDOMNode(path: js.Array[Double]): ReactNode | Null = js.native
  def findDOMNode(path: List[Double]): ReactNode | Null = js.native
  def findDOMPoint(point: Point): AnonNode | Null = js.native
  def findDOMPoint(point: PointJSON): AnonNode | Null = js.native
  def findDOMPoint(point: PointProperties): AnonNode | Null = js.native
  def findDOMRange(range: RangeType): Range | Null = js.native
  def findDOMRange(range: RangeTypeJSON): Range | Null = js.native
  def findDOMRange(range: RangeTypeProperties): Range | Null = js.native
  def findEventRange(event: SyntheticEvent[Element, Event_]): typings.slate.mod.Range | Null = js.native
  def findEventRange(event: Event_): typings.slate.mod.Range | Null = js.native
  def findNode(element: Element): Node | Null = js.native
  def findPath(element: Element): List[Double] | Null = js.native
  def findPoint(nativeNode: Element, nativeOffset: Double): Point | Null = js.native
  def findRange(domRange: Range): typings.slate.mod.Range | Null = js.native
  def findRange(domRange: Selection): typings.slate.mod.Range | Null = js.native
  def findSelection(domSelection: Selection): typings.slate.mod.Selection | Null = js.native
  // Instance methods
  def resolveController(
    plugins: js.Array[Plugin[Editor]],
    schema: SchemaProperties,
    commands: js.Array[_],
    queries: js.Array[_]
  ): Unit = js.native
}

