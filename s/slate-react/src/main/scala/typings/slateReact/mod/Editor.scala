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
import typings.slateReact.FnAnnotation
import typings.slateReact.FnAnnotationNewProperties
import typings.slateReact.FnArgs
import typings.slateReact.FnArgsKey
import typings.slateReact.FnArgsQuery
import typings.slateReact.FnBlock
import typings.slateReact.FnBlockPath
import typings.slateReact.FnBlockRange
import typings.slateReact.FnCommand
import typings.slateReact.FnController
import typings.slateReact.FnData
import typings.slateReact.FnDepth
import typings.slateReact.FnDepthController
import typings.slateReact.FnFn
import typings.slateReact.FnFnEditor
import typings.slateReact.FnFragment
import typings.slateReact.FnFragmentIndex
import typings.slateReact.FnFragmentIndexPath
import typings.slateReact.FnFragmentRange
import typings.slateReact.FnHeight
import typings.slateReact.FnIndex
import typings.slateReact.FnIndexNode
import typings.slateReact.FnInline
import typings.slateReact.FnInlineRange
import typings.slateReact.FnKey
import typings.slateReact.FnKeyController
import typings.slateReact.FnKeyLength
import typings.slateReact.FnKeyLengthNewProperties
import typings.slateReact.FnKeyMarks
import typings.slateReact.FnKeyMarksText
import typings.slateReact.FnKeyNewIndex
import typings.slateReact.FnKeyNode
import typings.slateReact.FnKeyOffset
import typings.slateReact.FnKeyParent
import typings.slateReact.FnKeyProperties
import typings.slateReact.FnKeyPropertiesBlockProperties
import typings.slateReact.FnKeyPropertiesController
import typings.slateReact.FnKeyTextKey
import typings.slateReact.FnLength
import typings.slateReact.FnLengthMarks
import typings.slateReact.FnLengthMarksOffset
import typings.slateReact.FnLengthNewProperties
import typings.slateReact.FnLengthOffset
import typings.slateReact.FnMark
import typings.slateReact.FnMarkArray
import typings.slateReact.FnMarkController
import typings.slateReact.FnMarkNewMark
import typings.slateReact.FnMarkRange
import typings.slateReact.FnMarkRangeController
import typings.slateReact.FnMarks
import typings.slateReact.FnMarksOffset
import typings.slateReact.FnMarksPath
import typings.slateReact.FnN
import typings.slateReact.FnNPath
import typings.slateReact.FnNRange
import typings.slateReact.FnNewIndex
import typings.slateReact.FnNewNode
import typings.slateReact.FnNewProperties
import typings.slateReact.FnNode
import typings.slateReact.FnOffset
import typings.slateReact.FnOperation
import typings.slateReact.FnOptions
import typings.slateReact.FnOptionsPath
import typings.slateReact.FnParent
import typings.slateReact.FnPath
import typings.slateReact.FnPathArray
import typings.slateReact.FnPathProperties
import typings.slateReact.FnPathPropertiesController
import typings.slateReact.FnPathTextOffset
import typings.slateReact.FnPrefix
import typings.slateReact.FnPrefixRange
import typings.slateReact.FnProperties
import typings.slateReact.FnPropertiesBlock
import typings.slateReact.FnPropertiesController
import typings.slateReact.FnPropertiesControllerEditor
import typings.slateReact.FnPropertiesRange
import typings.slateReact.FnPropertiesRangeBlock
import typings.slateReact.FnPropertiesRangeController
import typings.slateReact.FnQuery
import typings.slateReact.FnRange
import typings.slateReact.FnRangeText
import typings.slateReact.FnText
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
  var addAnnotation: FnAnnotation = js.native
  var addMark: FnMark = js.native
  var addMarkAtRange: FnMarkRange = js.native
  var addMarkByKey: FnKey = js.native
  var addMarkByPath: FnLength = js.native
  var addMarks: FnMarkArray = js.native
  var addMarksAtRange: FnMarks = js.native
  var addMarksByPath: FnLengthMarks = js.native
  var applyOperation: FnOperation = js.native
  @JSName("blur")
  var blur_FEditor: FnController = js.native
  var command: FnArgs = js.native
  var controller: typings.slate.mod.Editor = js.native
  var deleteAtRange: FnRange = js.native
  var deleteBackwardAtRange: FnNRange = js.native
  @JSName("deleteBackward")
  var deleteBackward_FEditor: FnN = js.native
  var deleteCharBackwardAtRange: FnRange = js.native
  @JSName("deleteCharBackward")
  var deleteCharBackward_FEditor: FnController = js.native
  var deleteCharForwardAtRange: FnRange = js.native
  @JSName("deleteCharForward")
  var deleteCharForward_FEditor: FnController = js.native
  var deleteForwardAtRange: FnNRange = js.native
  @JSName("deleteForward")
  var deleteForward_FEditor: FnN = js.native
  var deleteLineBackwardAtRange: FnRange = js.native
  @JSName("deleteLineBackward")
  var deleteLineBackward_FEditor: FnController = js.native
  var deleteLineForwardAtRange: FnRange = js.native
  @JSName("deleteLineForward")
  var deleteLineForward_FEditor: FnController = js.native
  var deleteWordBackwardAtRange: FnRange = js.native
  @JSName("deleteWordBackward")
  var deleteWordBackward_FEditor: FnController = js.native
  var deleteWordForwardAtRange: FnRange = js.native
  @JSName("deleteWordForward")
  var deleteWordForward_FEditor: FnController = js.native
  @JSName("delete")
  var delete_FEditor: FnController = js.native
  @JSName("deselect")
  var deselect_FEditor: FnController = js.native
  @JSName("flip")
  var flip_FEditor: FnController = js.native
  @JSName("focus")
  var focus_FEditor: FnController = js.native
  var hasCommand: js.Function1[/* type */ String, Boolean] = js.native
  var hasQuery: js.Function1[/* type */ String, Boolean] = js.native
  var insertBlock: FnBlock = js.native
  var insertBlockAtRange: FnBlockRange = js.native
  var insertFragment: FnFragment = js.native
  var insertFragmentAtRange: FnFragmentRange = js.native
  var insertFragmentByKey: FnFragmentIndex = js.native
  var insertFragmentByPath: FnFragmentIndexPath = js.native
  var insertInline: FnInline = js.native
  var insertInlineAtRange: FnInlineRange = js.native
  var insertNodeByKey: FnIndex = js.native
  var insertNodeByPath: FnIndexNode = js.native
  var insertText: FnText = js.native
  var insertTextAtRange: FnRangeText = js.native
  var insertTextByKey: FnKeyMarks = js.native
  var insertTextByPath: FnMarksOffset = js.native
  var mergeNodeByKey: FnKeyController = js.native
  var mergeNodeByPath: FnPath = js.native
  @JSName("moveAnchorBackward")
  var moveAnchorBackward_FEditor: FnN = js.native
  @JSName("moveAnchorForward")
  var moveAnchorForward_FEditor: FnN = js.native
  var moveAnchorTo: FnOffset = js.native
  @JSName("moveAnchorToEndOfBlock")
  var moveAnchorToEndOfBlock_FEditor: FnController = js.native
  @JSName("moveAnchorToEndOfDocument")
  var moveAnchorToEndOfDocument_FEditor: FnController = js.native
  @JSName("moveAnchorToEndOfInline")
  var moveAnchorToEndOfInline_FEditor: FnController = js.native
  @JSName("moveAnchorToEndOfNextBlock")
  var moveAnchorToEndOfNextBlock_FEditor: FnController = js.native
  @JSName("moveAnchorToEndOfNextInline")
  var moveAnchorToEndOfNextInline_FEditor: FnController = js.native
  @JSName("moveAnchorToEndOfNextText")
  var moveAnchorToEndOfNextText_FEditor: FnController = js.native
  var moveAnchorToEndOfNode: FnNode = js.native
  @JSName("moveAnchorToEndOfPreviousBlock")
  var moveAnchorToEndOfPreviousBlock_FEditor: FnController = js.native
  @JSName("moveAnchorToEndOfPreviousInline")
  var moveAnchorToEndOfPreviousInline_FEditor: FnController = js.native
  @JSName("moveAnchorToEndOfPreviousText")
  var moveAnchorToEndOfPreviousText_FEditor: FnController = js.native
  @JSName("moveAnchorToEndOfText")
  var moveAnchorToEndOfText_FEditor: FnController = js.native
  @JSName("moveAnchorToStartOfBlock")
  var moveAnchorToStartOfBlock_FEditor: FnController = js.native
  @JSName("moveAnchorToStartOfDocument")
  var moveAnchorToStartOfDocument_FEditor: FnController = js.native
  @JSName("moveAnchorToStartOfInline")
  var moveAnchorToStartOfInline_FEditor: FnController = js.native
  @JSName("moveAnchorToStartOfNextBlock")
  var moveAnchorToStartOfNextBlock_FEditor: FnController = js.native
  @JSName("moveAnchorToStartOfNextInline")
  var moveAnchorToStartOfNextInline_FEditor: FnController = js.native
  @JSName("moveAnchorToStartOfNextText")
  var moveAnchorToStartOfNextText_FEditor: FnController = js.native
  var moveAnchorToStartOfNode: FnNode = js.native
  @JSName("moveAnchorToStartOfPreviousBlock")
  var moveAnchorToStartOfPreviousBlock_FEditor: FnController = js.native
  @JSName("moveAnchorToStartOfPreviousInline")
  var moveAnchorToStartOfPreviousInline_FEditor: FnController = js.native
  @JSName("moveAnchorToStartOfPreviousText")
  var moveAnchorToStartOfPreviousText_FEditor: FnController = js.native
  @JSName("moveAnchorToStartOfText")
  var moveAnchorToStartOfText_FEditor: FnController = js.native
  @JSName("moveAnchorWordBackward")
  var moveAnchorWordBackward_FEditor: FnController = js.native
  @JSName("moveAnchorWordForward")
  var moveAnchorWordForward_FEditor: FnController = js.native
  @JSName("moveBackward")
  var moveBackward_FEditor: FnN = js.native
  @JSName("moveEndBackward")
  var moveEndBackward_FEditor: FnN = js.native
  @JSName("moveEndForward")
  var moveEndForward_FEditor: FnN = js.native
  var moveEndTo: FnOffset = js.native
  @JSName("moveEndToEndOfBlock")
  var moveEndToEndOfBlock_FEditor: FnController = js.native
  @JSName("moveEndToEndOfDocument")
  var moveEndToEndOfDocument_FEditor: FnController = js.native
  @JSName("moveEndToEndOfInline")
  var moveEndToEndOfInline_FEditor: FnController = js.native
  @JSName("moveEndToEndOfNextBlock")
  var moveEndToEndOfNextBlock_FEditor: FnController = js.native
  @JSName("moveEndToEndOfNextInline")
  var moveEndToEndOfNextInline_FEditor: FnController = js.native
  @JSName("moveEndToEndOfNextText")
  var moveEndToEndOfNextText_FEditor: FnController = js.native
  var moveEndToEndOfNode: FnNode = js.native
  @JSName("moveEndToEndOfPreviousBlock")
  var moveEndToEndOfPreviousBlock_FEditor: FnController = js.native
  @JSName("moveEndToEndOfPreviousInline")
  var moveEndToEndOfPreviousInline_FEditor: FnController = js.native
  @JSName("moveEndToEndOfPreviousText")
  var moveEndToEndOfPreviousText_FEditor: FnController = js.native
  @JSName("moveEndToEndOfText")
  var moveEndToEndOfText_FEditor: FnController = js.native
  @JSName("moveEndToStartOfBlock")
  var moveEndToStartOfBlock_FEditor: FnController = js.native
  @JSName("moveEndToStartOfDocument")
  var moveEndToStartOfDocument_FEditor: FnController = js.native
  @JSName("moveEndToStartOfInline")
  var moveEndToStartOfInline_FEditor: FnController = js.native
  @JSName("moveEndToStartOfNextBlock")
  var moveEndToStartOfNextBlock_FEditor: FnController = js.native
  @JSName("moveEndToStartOfNextInline")
  var moveEndToStartOfNextInline_FEditor: FnController = js.native
  @JSName("moveEndToStartOfNextText")
  var moveEndToStartOfNextText_FEditor: FnController = js.native
  var moveEndToStartOfNode: FnNode = js.native
  @JSName("moveEndToStartOfPreviousBlock")
  var moveEndToStartOfPreviousBlock_FEditor: FnController = js.native
  @JSName("moveEndToStartOfPreviousInline")
  var moveEndToStartOfPreviousInline_FEditor: FnController = js.native
  @JSName("moveEndToStartOfPreviousText")
  var moveEndToStartOfPreviousText_FEditor: FnController = js.native
  @JSName("moveEndToStartOfText")
  var moveEndToStartOfText_FEditor: FnController = js.native
  @JSName("moveEndWordBackward")
  var moveEndWordBackward_FEditor: FnController = js.native
  @JSName("moveEndWordForward")
  var moveEndWordForward_FEditor: FnController = js.native
  @JSName("moveFocusBackward")
  var moveFocusBackward_FEditor: FnN = js.native
  @JSName("moveFocusForward")
  var moveFocusForward_FEditor: FnN = js.native
  var moveFocusTo: FnOffset = js.native
  @JSName("moveFocusToEndOfBlock")
  var moveFocusToEndOfBlock_FEditor: FnController = js.native
  @JSName("moveFocusToEndOfDocument")
  var moveFocusToEndOfDocument_FEditor: FnController = js.native
  @JSName("moveFocusToEndOfInline")
  var moveFocusToEndOfInline_FEditor: FnController = js.native
  @JSName("moveFocusToEndOfNextBlock")
  var moveFocusToEndOfNextBlock_FEditor: FnController = js.native
  @JSName("moveFocusToEndOfNextInline")
  var moveFocusToEndOfNextInline_FEditor: FnController = js.native
  @JSName("moveFocusToEndOfNextText")
  var moveFocusToEndOfNextText_FEditor: FnController = js.native
  var moveFocusToEndOfNode: FnNode = js.native
  @JSName("moveFocusToEndOfPreviousBlock")
  var moveFocusToEndOfPreviousBlock_FEditor: FnController = js.native
  @JSName("moveFocusToEndOfPreviousInline")
  var moveFocusToEndOfPreviousInline_FEditor: FnController = js.native
  @JSName("moveFocusToEndOfPreviousText")
  var moveFocusToEndOfPreviousText_FEditor: FnController = js.native
  @JSName("moveFocusToEndOfText")
  var moveFocusToEndOfText_FEditor: FnController = js.native
  @JSName("moveFocusToStartOfBlock")
  var moveFocusToStartOfBlock_FEditor: FnController = js.native
  @JSName("moveFocusToStartOfDocument")
  var moveFocusToStartOfDocument_FEditor: FnController = js.native
  @JSName("moveFocusToStartOfInline")
  var moveFocusToStartOfInline_FEditor: FnController = js.native
  @JSName("moveFocusToStartOfNextBlock")
  var moveFocusToStartOfNextBlock_FEditor: FnController = js.native
  @JSName("moveFocusToStartOfNextInline")
  var moveFocusToStartOfNextInline_FEditor: FnController = js.native
  @JSName("moveFocusToStartOfNextText")
  var moveFocusToStartOfNextText_FEditor: FnController = js.native
  var moveFocusToStartOfNode: FnNode = js.native
  @JSName("moveFocusToStartOfPreviousBlock")
  var moveFocusToStartOfPreviousBlock_FEditor: FnController = js.native
  @JSName("moveFocusToStartOfPreviousInline")
  var moveFocusToStartOfPreviousInline_FEditor: FnController = js.native
  @JSName("moveFocusToStartOfPreviousText")
  var moveFocusToStartOfPreviousText_FEditor: FnController = js.native
  @JSName("moveFocusToStartOfText")
  var moveFocusToStartOfText_FEditor: FnController = js.native
  @JSName("moveFocusWordBackward")
  var moveFocusWordBackward_FEditor: FnController = js.native
  @JSName("moveFocusWordForward")
  var moveFocusWordForward_FEditor: FnController = js.native
  @JSName("moveForward")
  var moveForward_FEditor: FnN = js.native
  var moveNodeByKey: FnKeyNewIndex = js.native
  var moveNodeByPath: FnNewIndex = js.native
  @JSName("moveStartBackward")
  var moveStartBackward_FEditor: FnN = js.native
  @JSName("moveStartForward")
  var moveStartForward_FEditor: FnN = js.native
  var moveStartTo: FnNPath = js.native
  @JSName("moveStartToEndOfBlock")
  var moveStartToEndOfBlock_FEditor: FnController = js.native
  @JSName("moveStartToEndOfDocument")
  var moveStartToEndOfDocument_FEditor: FnController = js.native
  @JSName("moveStartToEndOfInline")
  var moveStartToEndOfInline_FEditor: FnController = js.native
  @JSName("moveStartToEndOfNextBlock")
  var moveStartToEndOfNextBlock_FEditor: FnController = js.native
  @JSName("moveStartToEndOfNextInline")
  var moveStartToEndOfNextInline_FEditor: FnController = js.native
  @JSName("moveStartToEndOfNextText")
  var moveStartToEndOfNextText_FEditor: FnController = js.native
  var moveStartToEndOfNode: FnNode = js.native
  @JSName("moveStartToEndOfPreviousBlock")
  var moveStartToEndOfPreviousBlock_FEditor: FnController = js.native
  @JSName("moveStartToEndOfPreviousInline")
  var moveStartToEndOfPreviousInline_FEditor: FnController = js.native
  @JSName("moveStartToEndOfPreviousText")
  var moveStartToEndOfPreviousText_FEditor: FnController = js.native
  @JSName("moveStartToEndOfText")
  var moveStartToEndOfText_FEditor: FnController = js.native
  @JSName("moveStartToStartOfBlock")
  var moveStartToStartOfBlock_FEditor: FnController = js.native
  @JSName("moveStartToStartOfDocument")
  var moveStartToStartOfDocument_FEditor: FnController = js.native
  @JSName("moveStartToStartOfInline")
  var moveStartToStartOfInline_FEditor: FnController = js.native
  @JSName("moveStartToStartOfNextBlock")
  var moveStartToStartOfNextBlock_FEditor: FnController = js.native
  @JSName("moveStartToStartOfNextInline")
  var moveStartToStartOfNextInline_FEditor: FnController = js.native
  @JSName("moveStartToStartOfNextText")
  var moveStartToStartOfNextText_FEditor: FnController = js.native
  var moveStartToStartOfNode: FnNode = js.native
  @JSName("moveStartToStartOfPreviousBlock")
  var moveStartToStartOfPreviousBlock_FEditor: FnController = js.native
  @JSName("moveStartToStartOfPreviousInline")
  var moveStartToStartOfPreviousInline_FEditor: FnController = js.native
  @JSName("moveStartToStartOfPreviousText")
  var moveStartToStartOfPreviousText_FEditor: FnController = js.native
  @JSName("moveStartToStartOfText")
  var moveStartToStartOfText_FEditor: FnController = js.native
  @JSName("moveStartWordBackward")
  var moveStartWordBackward_FEditor: FnController = js.native
  @JSName("moveStartWordForward")
  var moveStartWordForward_FEditor: FnController = js.native
  var moveTo: FnOffset = js.native
  @JSName("moveToAnchor")
  var moveToAnchor_FEditor: FnController = js.native
  @JSName("moveToEndOfBlock")
  var moveToEndOfBlock_FEditor: FnController = js.native
  @JSName("moveToEndOfDocument")
  var moveToEndOfDocument_FEditor: FnController = js.native
  @JSName("moveToEndOfInline")
  var moveToEndOfInline_FEditor: FnController = js.native
  @JSName("moveToEndOfNextBlock")
  var moveToEndOfNextBlock_FEditor: FnController = js.native
  @JSName("moveToEndOfNextInline")
  var moveToEndOfNextInline_FEditor: FnController = js.native
  @JSName("moveToEndOfNextText")
  var moveToEndOfNextText_FEditor: FnController = js.native
  var moveToEndOfNode: FnNode = js.native
  @JSName("moveToEndOfPreviousBlock")
  var moveToEndOfPreviousBlock_FEditor: FnController = js.native
  @JSName("moveToEndOfPreviousInline")
  var moveToEndOfPreviousInline_FEditor: FnController = js.native
  @JSName("moveToEndOfPreviousText")
  var moveToEndOfPreviousText_FEditor: FnController = js.native
  @JSName("moveToEndOfText")
  var moveToEndOfText_FEditor: FnController = js.native
  @JSName("moveToEnd")
  var moveToEnd_FEditor: FnController = js.native
  @JSName("moveToFocus")
  var moveToFocus_FEditor: FnController = js.native
  @JSName("moveToRangeOfDocument")
  var moveToRangeOfDocument_FEditor: FnController = js.native
  var moveToRangeOfNode: FnNode = js.native
  @JSName("moveToStartOfBlock")
  var moveToStartOfBlock_FEditor: FnController = js.native
  @JSName("moveToStartOfDocument")
  var moveToStartOfDocument_FEditor: FnController = js.native
  @JSName("moveToStartOfInline")
  var moveToStartOfInline_FEditor: FnController = js.native
  @JSName("moveToStartOfNextBlock")
  var moveToStartOfNextBlock_FEditor: FnController = js.native
  @JSName("moveToStartOfNextInline")
  var moveToStartOfNextInline_FEditor: FnController = js.native
  @JSName("moveToStartOfNextText")
  var moveToStartOfNextText_FEditor: FnController = js.native
  var moveToStartOfNode: FnNode = js.native
  @JSName("moveToStartOfPreviousBlock")
  var moveToStartOfPreviousBlock_FEditor: FnController = js.native
  @JSName("moveToStartOfPreviousInline")
  var moveToStartOfPreviousInline_FEditor: FnController = js.native
  @JSName("moveToStartOfPreviousText")
  var moveToStartOfPreviousText_FEditor: FnController = js.native
  @JSName("moveToStartOfText")
  var moveToStartOfText_FEditor: FnController = js.native
  @JSName("moveToStart")
  var moveToStart_FEditor: FnController = js.native
  @JSName("moveWordBackward")
  var moveWordBackward_FEditor: FnController = js.native
  @JSName("moveWordForward")
  var moveWordForward_FEditor: FnController = js.native
  @JSName("normalize")
  var normalize_FEditor: FnController = js.native
  val operations: List[Operation] = js.native
  val plugins: js.Array[Plugin[Editor]] = js.native
  var query: FnArgsQuery = js.native
  val readOnly: Boolean = js.native
  @JSName("redo")
  var redo_FEditor: FnController = js.native
  var registerCommand: FnCommand = js.native
  var registerQuery: FnQuery = js.native
  var removeAllMarksByKey: FnKeyController = js.native
  var removeAllMarksByPath: FnPath = js.native
  var removeAnnotation: FnAnnotation = js.native
  var removeMark: FnMarkController = js.native
  var removeMarkAtRange: FnMarkRangeController = js.native
  var removeMarkByKey: FnKey = js.native
  var removeMarkByPath: FnLength = js.native
  var removeMarksByPath: FnLengthMarks = js.native
  var removeNodeByKey: FnKeyController = js.native
  var removeNodeByPath: FnPath = js.native
  var removeTextByKey: FnKeyLength = js.native
  var removeTextByPath: FnLengthOffset = js.native
  var replaceMark: FnMarkNewMark = js.native
  var replaceNodeByKey: FnKeyNode = js.native
  var replaceNodeByPath: FnNewNode = js.native
  var replaceTextByKey: FnKeyNode = js.native
  var replaceTextByPath: FnLengthMarksOffset = js.native
  var run: FnArgsKey = js.native
  var save: js.Function1[/* operation */ Operation, Unit] = js.native
  var select: FnOptions = js.native
  var setAnchor: js.Function1[/* point */ Point, Unit] = js.native
  var setAnnotation: FnAnnotationNewProperties = js.native
  var setBlocks: FnProperties = js.native
  var setBlocksAtRange: FnPropertiesRange = js.native
  var setData: FnData = js.native
  var setEnd: js.Function1[/* point */ Point, Unit] = js.native
  var setFocus: js.Function1[/* point */ Point, Unit] = js.native
  var setInlines: FnPropertiesController = js.native
  var setInlinesAtRange: FnPropertiesRangeController = js.native
  var setMarkByKey: FnKeyLengthNewProperties = js.native
  var setMarkByPath: FnLengthNewProperties = js.native
  var setNodeByKey: FnKeyProperties = js.native
  var setNodeByPath: FnNewProperties = js.native
  var setStart: js.Function1[/* point */ Point, Unit] = js.native
  var setTextByKey: FnKeyMarksText = js.native
  var setTextByPath: FnMarksPath = js.native
  @JSName("snapshotSelection")
  var snapshotSelection_FEditor: FnController = js.native
  var splitBlockAtRange: FnHeight = js.native
  @JSName("splitBlock")
  var splitBlock_FEditor: FnDepth = js.native
  var splitDescendantsByKey: FnKeyTextKey = js.native
  var splitDescendantsByPath: FnPathTextOffset = js.native
  var splitInline: FnDepthController = js.native
  var splitInlineAtRange: FnHeight = js.native
  var splitNodeByKey: FnKeyOffset = js.native
  var splitNodeByPath: FnOptionsPath = js.native
  var toggleMark: FnMark = js.native
  var toggleMarkAtRange: FnMarkRangeController = js.native
  @JSName("undo")
  var undo_FEditor: FnController = js.native
  var unwrapBlock: FnPropertiesBlock = js.native
  var unwrapBlockAtRange: FnPropertiesRangeBlock = js.native
  var unwrapBlockByKey: FnKeyPropertiesBlockProperties = js.native
  var unwrapBlockByPath: FnPathProperties = js.native
  var unwrapChildrenByKey: FnKeyController = js.native
  var unwrapChildrenByPath: FnPathArray = js.native
  var unwrapInline: FnPropertiesControllerEditor = js.native
  var unwrapInlineAtRange: FnPropertiesRangeController = js.native
  var unwrapInlineByKey: FnKeyPropertiesController = js.native
  var unwrapInlineByPath: FnPathPropertiesController = js.native
  var unwrapNodeByKey: FnKeyController = js.native
  var unwrapNodeByPath: FnPath = js.native
  val value: Value = js.native
  var withoutMerging: FnFnEditor = js.native
  var withoutNormalizing: FnFn = js.native
  var withoutSaving: FnFnEditor = js.native
  var wrapBlock: FnPropertiesBlock = js.native
  var wrapBlockAtRange: FnPropertiesRangeBlock = js.native
  var wrapBlockByKey: FnKeyPropertiesBlockProperties = js.native
  var wrapBlockByPath: FnBlockPath = js.native
  var wrapInline: FnPropertiesControllerEditor = js.native
  var wrapInlineAtRange: FnPropertiesRangeController = js.native
  var wrapInlineByKey: FnKeyPropertiesController = js.native
  var wrapInlineByPath: FnPathPropertiesController = js.native
  var wrapNodeByKey: FnKeyParent = js.native
  var wrapNodeByPath: FnParent = js.native
  var wrapText: FnPrefix = js.native
  var wrapTextAtRange: FnPrefixRange = js.native
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

