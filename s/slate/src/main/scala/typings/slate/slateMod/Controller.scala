package typings.slate.slateMod

import typings.immutable.immutableMod.List
import typings.slate.Anon_Snapshot
import typings.slate.Anon_Target
import typings.std.Partial
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Controller extends js.Object {
  /**
    * Add annotation
    */
  def addAnnotation(annotation: Annotation): Controller = js.native
  def addAnnotation(annotation: AnnotationJSON): Controller = js.native
  def addAnnotation(annotation: AnnotationProperties): Controller = js.native
  def addMark(mark: String): Controller = js.native
  def addMark(mark: Mark): Controller = js.native
  def addMark(mark: MarkJSON): Controller = js.native
  // Current Selection Commands //
  /**
    * Add a mark to the characters in the current selection
    */
  def addMark(mark: MarkProperties): Controller = js.native
  def addMarkAtRange(range: RangeTypeJSON, mark: String): Controller = js.native
  def addMarkAtRange(range: RangeTypeJSON, mark: Mark): Controller = js.native
  def addMarkAtRange(range: RangeTypeJSON, mark: MarkProperties): Controller = js.native
  def addMarkAtRange(range: RangeTypeProperties, mark: String): Controller = js.native
  def addMarkAtRange(range: RangeTypeProperties, mark: Mark): Controller = js.native
  def addMarkAtRange(range: RangeTypeProperties, mark: MarkProperties): Controller = js.native
  def addMarkAtRange(range: RangeType, mark: String): Controller = js.native
  // Document Range Commands //
  /**
    * Add a mark to the characters in the range.
    * Passing a string as `mark` will implicitly create a mark with that `type`
    */
  def addMarkAtRange(range: RangeType, mark: Mark): Controller = js.native
  def addMarkAtRange(range: RangeType, mark: MarkProperties): Controller = js.native
  def addMarkByKey(key: String, offset: Double, length: Double, mark: String): Controller = js.native
  def addMarkByKey(key: String, offset: Double, length: Double, mark: Mark): Controller = js.native
  def addMarkByKey(key: String, offset: Double, length: Double, mark: MarkJSON): Controller = js.native
  // Node commands //
  /**
    * Add a mark to length characters starting at an offset in a node by key
    */
  def addMarkByKey(key: String, offset: Double, length: Double, mark: MarkProperties): Controller = js.native
  def addMarkByPath(path: List[Double], offset: Double, length: Double, mark: String): Controller = js.native
  def addMarkByPath(path: List[Double], offset: Double, length: Double, mark: Mark): Controller = js.native
  def addMarkByPath(path: List[Double], offset: Double, length: Double, mark: MarkJSON): Controller = js.native
  /**
    * Add a mark to length characters starting at an offset in a node by path
    */
  def addMarkByPath(path: List[Double], offset: Double, length: Double, mark: MarkProperties): Controller = js.native
  def addMarks(mark: js.Array[MarkProperties | MarkJSON | Mark | String]): Controller = js.native
  def addMarks(mark: Set[MarkProperties | MarkJSON | Mark | String]): Controller = js.native
  def addMarksAtRange(range: RangeTypeJSON, marks: js.Array[MarkProperties | MarkJSON | Mark | String]): Controller = js.native
  def addMarksAtRange(
    range: RangeTypeJSON,
    marks: typings.immutable.immutableMod.Set[MarkProperties | MarkJSON | Mark | String]
  ): Controller = js.native
  def addMarksAtRange(range: RangeTypeProperties, marks: js.Array[MarkProperties | MarkJSON | Mark | String]): Controller = js.native
  def addMarksAtRange(
    range: RangeTypeProperties,
    marks: typings.immutable.immutableMod.Set[MarkProperties | MarkJSON | Mark | String]
  ): Controller = js.native
  def addMarksAtRange(range: RangeType, marks: js.Array[MarkProperties | MarkJSON | Mark | String]): Controller = js.native
  def addMarksAtRange(
    range: RangeType,
    marks: typings.immutable.immutableMod.Set[MarkProperties | MarkJSON | Mark | String]
  ): Controller = js.native
  def addMarksByPath(
    path: List[Double],
    offset: Double,
    length: Double,
    marks: js.Array[MarkProperties | MarkJSON | Mark | String]
  ): Controller = js.native
  def addMarksByPath(
    path: List[Double],
    offset: Double,
    length: Double,
    marks: typings.immutable.immutableMod.Set[MarkProperties | MarkJSON | Mark | String]
  ): Controller = js.native
  /**
    * Apply an `operation` to the controller, updating its value.
    */
  def applyOperation(operation: Operation): Controller = js.native
  def applyOperation(operation: OperationJSON): Controller = js.native
  def applyOperation(operation: OperationProperties): Controller = js.native
  // Selection Commands //
  /**
    * Blur the current selection
    */
  def blur(): Controller = js.native
  def command(`type`: String, args: js.Any*): Controller = js.native
  def command(`type`: js.Function1[/* repeated */ js.Any, _], args: js.Any*): Controller = js.native
  /**
    * Delete everything in the current selection.
    */
  def delete(): Controller = js.native
  /**
    * Delete everything in the range
    */
  def deleteAtRange(range: RangeType): Controller = js.native
  def deleteAtRange(range: RangeTypeJSON): Controller = js.native
  def deleteAtRange(range: RangeTypeProperties): Controller = js.native
  /**
    * Delete backward n characters at the current cursor.
    * If the selection is expanded, behaviour is equivalent to delete()
    */
  def deleteBackward(): Controller = js.native
  def deleteBackward(n: Double): Controller = js.native
  /**
    * Delete backward n characters at a range
    */
  def deleteBackwardAtRange(range: RangeType): Controller = js.native
  def deleteBackwardAtRange(range: RangeTypeJSON): Controller = js.native
  def deleteBackwardAtRange(range: RangeTypeJSON, n: Double): Controller = js.native
  def deleteBackwardAtRange(range: RangeTypeProperties): Controller = js.native
  def deleteBackwardAtRange(range: RangeTypeProperties, n: Double): Controller = js.native
  def deleteBackwardAtRange(range: RangeType, n: Double): Controller = js.native
  /**
    * Delete backward one character
    */
  def deleteCharBackward(): Controller = js.native
  /**
    * Delete backward until the char boundary at a range
    */
  def deleteCharBackwardAtRange(range: RangeType): Controller = js.native
  def deleteCharBackwardAtRange(range: RangeTypeJSON): Controller = js.native
  def deleteCharBackwardAtRange(range: RangeTypeProperties): Controller = js.native
  /**
    * Delete forward one character
    */
  def deleteCharForward(): Controller = js.native
  /**
    * Delete forward until the char boundary at a range
    */
  def deleteCharForwardAtRange(range: RangeType): Controller = js.native
  def deleteCharForwardAtRange(range: RangeTypeJSON): Controller = js.native
  def deleteCharForwardAtRange(range: RangeTypeProperties): Controller = js.native
  /**
    * Delete backward n characters at the current cursor.
    * If the selection is expanded, behaviour is equivalent to delete()
    */
  def deleteForward(): Controller = js.native
  def deleteForward(n: Double): Controller = js.native
  /**
    * Delete forward n characters at a range
    */
  def deleteForwardAtRange(range: RangeType): Controller = js.native
  def deleteForwardAtRange(range: RangeTypeJSON): Controller = js.native
  def deleteForwardAtRange(range: RangeTypeJSON, n: Double): Controller = js.native
  def deleteForwardAtRange(range: RangeTypeProperties): Controller = js.native
  def deleteForwardAtRange(range: RangeTypeProperties, n: Double): Controller = js.native
  def deleteForwardAtRange(range: RangeType, n: Double): Controller = js.native
  /**
    * Delete backward one line
    */
  def deleteLineBackward(): Controller = js.native
  /**
    * Delete backward until the line boundary at a range
    */
  def deleteLineBackwardAtRange(range: RangeType): Controller = js.native
  def deleteLineBackwardAtRange(range: RangeTypeJSON): Controller = js.native
  def deleteLineBackwardAtRange(range: RangeTypeProperties): Controller = js.native
  /**
    * Delete forward one line
    */
  def deleteLineForward(): Controller = js.native
  /**
    * Delete forward until the line boundary at a range
    */
  def deleteLineForwardAtRange(range: RangeType): Controller = js.native
  def deleteLineForwardAtRange(range: RangeTypeJSON): Controller = js.native
  def deleteLineForwardAtRange(range: RangeTypeProperties): Controller = js.native
  /**
    * Delete backward one word.
    */
  def deleteWordBackward(): Controller = js.native
  /**
    * Delete backward until the word boundary at a range
    */
  def deleteWordBackwardAtRange(range: RangeType): Controller = js.native
  def deleteWordBackwardAtRange(range: RangeTypeJSON): Controller = js.native
  def deleteWordBackwardAtRange(range: RangeTypeProperties): Controller = js.native
  /**
    * Delete forward one word
    */
  def deleteWordForward(): Controller = js.native
  /**
    * Delete forward until the word boundary at a range
    */
  def deleteWordForwardAtRange(range: RangeType): Controller = js.native
  def deleteWordForwardAtRange(range: RangeTypeJSON): Controller = js.native
  def deleteWordForwardAtRange(range: RangeTypeProperties): Controller = js.native
  /**
    * Unset the selection
    */
  def deselect(): Controller = js.native
  /**
    * Flip the selection
    */
  def flip(): Controller = js.native
  /**
    * Focus the current selection
    */
  def focus(): Controller = js.native
  def insertBlock(block: String): Controller = js.native
  /**
    * Insert a new block at the same level as the current block, splitting the current block to make room if it is non-empty.
    * If the selection is expanded, it will be deleted first.
    */
  def insertBlock(block: Block): Controller = js.native
  def insertBlock(block: BlockJSON): Controller = js.native
  def insertBlock(block: BlockProperties): Controller = js.native
  def insertBlockAtRange(range: RangeTypeJSON, block: String): Controller = js.native
  def insertBlockAtRange(range: RangeTypeJSON, block: Block): Controller = js.native
  def insertBlockAtRange(range: RangeTypeJSON, block: BlockJSON): Controller = js.native
  def insertBlockAtRange(range: RangeTypeJSON, block: BlockProperties): Controller = js.native
  def insertBlockAtRange(range: RangeTypeProperties, block: String): Controller = js.native
  def insertBlockAtRange(range: RangeTypeProperties, block: Block): Controller = js.native
  def insertBlockAtRange(range: RangeTypeProperties, block: BlockJSON): Controller = js.native
  def insertBlockAtRange(range: RangeTypeProperties, block: BlockProperties): Controller = js.native
  def insertBlockAtRange(range: RangeType, block: String): Controller = js.native
  /**
    * Insert a block node at range, splitting text to make room if it is non-empty.
    * If the range is expanded, it will be deleted first.
    */
  def insertBlockAtRange(range: RangeType, block: Block): Controller = js.native
  def insertBlockAtRange(range: RangeType, block: BlockJSON): Controller = js.native
  def insertBlockAtRange(range: RangeType, block: BlockProperties): Controller = js.native
  /**
    * Insert a document fragment at the current selection. If the selection is expanded, it will be deleted first.
    */
  def insertFragment(fragment: Document): Controller = js.native
  def insertFragmentAtRange(range: RangeTypeJSON, fragment: Document): Controller = js.native
  def insertFragmentAtRange(range: RangeTypeProperties, fragment: Document): Controller = js.native
  /**
    * Insert a document fragment at a range, if the range is expanded, it will be deleted first.
    */
  def insertFragmentAtRange(range: RangeType, fragment: Document): Controller = js.native
  /**
    * Insert a document fragment at index inside a parent node by key
    */
  def insertFragmentByKey(key: String, index: Double, fragment: Document): Controller = js.native
  /**
    * Insert a document fragment at index inside a parent node by path
    */
  def insertFragmentByPath(path: List[Double], index: Double, fragment: Document): Controller = js.native
  def insertInline(`inline`: String): Controller = js.native
  /**
    * Insert a new inline at the current cursor position, splitting the text to make room if it is non-empty.
    * If the selection is expanded, it will be deleted first.
    */
  def insertInline(`inline`: Inline): Controller = js.native
  def insertInline(`inline`: InlineJSON): Controller = js.native
  def insertInline(`inline`: InlineProperties): Controller = js.native
  def insertInlineAtRange(range: RangeTypeJSON, `inline`: Inline): Controller = js.native
  def insertInlineAtRange(range: RangeTypeJSON, `inline`: InlineJSON): Controller = js.native
  def insertInlineAtRange(range: RangeTypeJSON, `inline`: InlineProperties): Controller = js.native
  def insertInlineAtRange(range: RangeTypeProperties, `inline`: Inline): Controller = js.native
  def insertInlineAtRange(range: RangeTypeProperties, `inline`: InlineJSON): Controller = js.native
  def insertInlineAtRange(range: RangeTypeProperties, `inline`: InlineProperties): Controller = js.native
  /**
    * Insert a new inline at range, splitting text to make room if it is non-empty.
    * If the range is expanded, it will be deleted first.
    */
  def insertInlineAtRange(range: RangeType, `inline`: Inline): Controller = js.native
  def insertInlineAtRange(range: RangeType, `inline`: InlineJSON): Controller = js.native
  def insertInlineAtRange(range: RangeType, `inline`: InlineProperties): Controller = js.native
  /**
    * Insert a node at index inside a parent node by key
    */
  def insertNodeByKey(key: String, index: Double, node: Node): Controller = js.native
  /**
    * Insert a node at index inside a parent node by apth
    */
  def insertNodeByPath(path: List[Double], index: Double, node: Node): Controller = js.native
  /**
    * Insert a string of text at the current selection. If the selection is expanded, it will be deleted first
    */
  def insertText(text: String): Controller = js.native
  def insertTextAtRange(range: RangeTypeJSON, text: String): Controller = js.native
  def insertTextAtRange(range: RangeTypeProperties, text: String): Controller = js.native
  /**
    * Insert text at range. If the range is expanded it will be deleted first
    */
  def insertTextAtRange(range: RangeType, text: String): Controller = js.native
  /**
    * Insert text at an offset in a text node by its key with optional marks
    */
  def insertTextByKey(key: String, offset: Double, text: String): Controller = js.native
  def insertTextByKey(
    key: String,
    offset: Double,
    text: String,
    marks: js.Array[MarkProperties | MarkJSON | Mark | String]
  ): Controller = js.native
  def insertTextByKey(
    key: String,
    offset: Double,
    text: String,
    marks: typings.immutable.immutableMod.Set[MarkProperties | MarkJSON | Mark | String]
  ): Controller = js.native
  /**
    * Insert text at an offset in a text node by its path with optional marks
    */
  def insertTextByPath(path: List[Double], offset: Double, text: String): Controller = js.native
  def insertTextByPath(
    path: List[Double],
    offset: Double,
    text: String,
    marks: js.Array[MarkProperties | MarkJSON | Mark | String]
  ): Controller = js.native
  def insertTextByPath(
    path: List[Double],
    offset: Double,
    text: String,
    marks: typings.immutable.immutableMod.Set[MarkProperties | MarkJSON | Mark | String]
  ): Controller = js.native
  /**
    * Merge a node by its key with its previous sibling
    */
  def mergeNodeByKey(key: String): Controller = js.native
  /**
    * Merge a node by its path with its previous sibling
    */
  def mergeNodeByPath(path: List[Double]): Controller = js.native
  /**
    * Move the anchor of the current selection backward n characters
    */
  def moveAnchorBackward(): Controller = js.native
  def moveAnchorBackward(n: Double): Controller = js.native
  /**
    * Move the anchor of the current selection forward n characters
    */
  def moveAnchorForward(): Controller = js.native
  def moveAnchorForward(n: Double): Controller = js.native
  /**
    * Move the anchor of the current selection to a new path and offset
    */
  def moveAnchorTo(path: String): Controller = js.native
  def moveAnchorTo(path: String, offset: Double): Controller = js.native
  def moveAnchorTo(path: Double): Controller = js.native
  def moveAnchorTo(path: Double, offset: Double): Controller = js.native
  def moveAnchorTo(path: List[Double]): Controller = js.native
  def moveAnchorTo(path: List[Double], offset: Double): Controller = js.native
  /**
    * Move the anchor of the current selection to the end of the closest block parent.
    */
  def moveAnchorToEndOfBlock(): Controller = js.native
  /**
    * Move the anchor of the current selection to the end of the document.
    */
  def moveAnchorToEndOfDocument(): Controller = js.native
  /**
    * Move the anchor of the current selection to the end of the closest inline parent.
    */
  def moveAnchorToEndOfInline(): Controller = js.native
  /**
    * Move the anchor of the current selection to the end of the next block.
    */
  def moveAnchorToEndOfNextBlock(): Controller = js.native
  /**
    * Move the anchor of the current selection to the end of the next inline.
    */
  def moveAnchorToEndOfNextInline(): Controller = js.native
  /**
    * Move the anchor of the current selection to the end of the next text.
    */
  def moveAnchorToEndOfNextText(): Controller = js.native
  /**
    * Move the anchor of the current selection to the end of the provided node.
    */
  def moveAnchorToEndOfNode(node: Node): Controller = js.native
  /**
    * Move the anchor of the current selection to the end of the previous block.
    */
  def moveAnchorToEndOfPreviousBlock(): Controller = js.native
  /**
    * Move the anchor of the current selection to the end of the previous inline.
    */
  def moveAnchorToEndOfPreviousInline(): Controller = js.native
  /**
    * Move the anchor of the current selection to the end of the previous text.
    */
  def moveAnchorToEndOfPreviousText(): Controller = js.native
  /**
    * Move the anchor of the current selection to the end of the current text node.
    */
  def moveAnchorToEndOfText(): Controller = js.native
  /**
    * Move the anchor of the current selection to the start of the closest block parent.
    */
  def moveAnchorToStartOfBlock(): Controller = js.native
  /**
    * Move the anchor of the current selection to the start of the document.
    */
  def moveAnchorToStartOfDocument(): Controller = js.native
  /**
    * Move the anchor of the current selection to the start of the closest inline parent.
    */
  def moveAnchorToStartOfInline(): Controller = js.native
  /**
    * Move the anchor of the current selection to the start of the next block.
    */
  def moveAnchorToStartOfNextBlock(): Controller = js.native
  /**
    * Move the anchor of the current selection to the start of the next inline.
    */
  def moveAnchorToStartOfNextInline(): Controller = js.native
  /**
    * Move the anchor of the current selection to the start of the next text node.
    */
  def moveAnchorToStartOfNextText(): Controller = js.native
  /**
    * Move the anchor of the current selection to the start of the provided node.
    */
  def moveAnchorToStartOfNode(node: Node): Controller = js.native
  /**
    * Move the anchor of the current selection to the start of the previous block.
    */
  def moveAnchorToStartOfPreviousBlock(): Controller = js.native
  /**
    * Move the anchor of the current selection to the start of the previous inline.
    */
  def moveAnchorToStartOfPreviousInline(): Controller = js.native
  /**
    * Move the anchor of the current selection to the start of the previous text node.
    */
  def moveAnchorToStartOfPreviousText(): Controller = js.native
  /**
    * Move the anchor of the current selection to the start of the current text node.
    */
  def moveAnchorToStartOfText(): Controller = js.native
  def moveAnchorWordBackward(): Controller = js.native
  def moveAnchorWordForward(): Controller = js.native
  /**
    * Move the anchor and focus of the selection backward n characters.
    */
  def moveBackward(): Controller = js.native
  def moveBackward(n: Double): Controller = js.native
  /**
    * Move the end of the selection backward n characters
    */
  def moveEndBackward(): Controller = js.native
  def moveEndBackward(n: Double): Controller = js.native
  /**
    * Move the end of the selection foward n characters
    */
  def moveEndForward(): Controller = js.native
  def moveEndForward(n: Double): Controller = js.native
  /**
    * Move the end of the selection to a new path and offset
    */
  def moveEndTo(path: String): Controller = js.native
  def moveEndTo(path: String, offset: Double): Controller = js.native
  def moveEndTo(path: Double): Controller = js.native
  def moveEndTo(path: Double, offset: Double): Controller = js.native
  def moveEndTo(path: List[Double]): Controller = js.native
  def moveEndTo(path: List[Double], offset: Double): Controller = js.native
  /**
    * Move the end of the current selection to the end of the closest block parent.
    */
  def moveEndToEndOfBlock(): Controller = js.native
  /**
    * Move the end of the current selection to the end of the document.
    */
  def moveEndToEndOfDocument(): Controller = js.native
  /**
    * Move the end of the current selection to the end of the closest inline parent.
    */
  def moveEndToEndOfInline(): Controller = js.native
  /**
    * Move the anchor of the current selection to the end of the next block.
    */
  def moveEndToEndOfNextBlock(): Controller = js.native
  /**
    * Move the end of the current selection to the end of the next inline.
    */
  def moveEndToEndOfNextInline(): Controller = js.native
  /**
    * Move the end of the current selection to the end of the next text.
    */
  def moveEndToEndOfNextText(): Controller = js.native
  /**
    * Move the end of the current selection to the end of the provided node.
    */
  def moveEndToEndOfNode(node: Node): Controller = js.native
  /**
    * Move the end of the current selection to the end of the previous block.
    */
  def moveEndToEndOfPreviousBlock(): Controller = js.native
  /**
    * Move the end of the current selection to the end of the previous inline.
    */
  def moveEndToEndOfPreviousInline(): Controller = js.native
  /**
    * Move the commandable of the current selection to the end of the previous text.
    */
  def moveEndToEndOfPreviousText(): Controller = js.native
  /**
    * Move the end of the current selection to the end of the current text node.
    */
  def moveEndToEndOfText(): Controller = js.native
  /**
    * Move the end of the current selection to the start of the closest block parent.
    */
  def moveEndToStartOfBlock(): Controller = js.native
  /**
    * Move the end of the current selection to the start of the document.
    */
  def moveEndToStartOfDocument(): Controller = js.native
  /**
    * Move the end of the current selection to the start of the closest inline parent.
    */
  def moveEndToStartOfInline(): Controller = js.native
  /**
    * Move the end of the current selection to the start of the next block.
    */
  def moveEndToStartOfNextBlock(): Controller = js.native
  /**
    * Move the end of the current selection to the start of the next inline.
    */
  def moveEndToStartOfNextInline(): Controller = js.native
  /**
    * Move the end of the current selection to the start of the next text node.
    */
  def moveEndToStartOfNextText(): Controller = js.native
  /**
    * Move the end of the current selection to the start of the provided node.
    */
  def moveEndToStartOfNode(node: Node): Controller = js.native
  /**
    * Move the end of the current selection to the start of the previous block.
    */
  def moveEndToStartOfPreviousBlock(): Controller = js.native
  /**
    * Move the end of the current selection to the start of the previous inline.
    */
  def moveEndToStartOfPreviousInline(): Controller = js.native
  /**
    * Move the end of the current selection to the start of the previous text node.
    */
  def moveEndToStartOfPreviousText(): Controller = js.native
  /**
    * Move the end of the current selection to the start of the current text node.
    */
  def moveEndToStartOfText(): Controller = js.native
  def moveEndWordBackward(): Controller = js.native
  def moveEndWordForward(): Controller = js.native
  /**
    * Move the focus of the current selection backward n characters
    */
  def moveFocusBackward(): Controller = js.native
  def moveFocusBackward(n: Double): Controller = js.native
  /**
    * Move the focus of the current selection forward n characters
    */
  def moveFocusForward(): Controller = js.native
  def moveFocusForward(n: Double): Controller = js.native
  /**
    * Move the focus of the current selection to a new path and offset
    */
  def moveFocusTo(path: String): Controller = js.native
  def moveFocusTo(path: String, offset: Double): Controller = js.native
  def moveFocusTo(path: Double): Controller = js.native
  def moveFocusTo(path: Double, offset: Double): Controller = js.native
  def moveFocusTo(path: List[Double]): Controller = js.native
  def moveFocusTo(path: List[Double], offset: Double): Controller = js.native
  /**
    * Move the focus of the current selection to the end of the closest block parent.
    */
  def moveFocusToEndOfBlock(): Controller = js.native
  /**
    * Move the focus of the current selection to the end of the document.
    */
  def moveFocusToEndOfDocument(): Controller = js.native
  /**
    * Move the focus of the current selection to the end of the closest inline parent.
    */
  def moveFocusToEndOfInline(): Controller = js.native
  /**
    * Move the focus of the current selection to the end of the next block.
    */
  def moveFocusToEndOfNextBlock(): Controller = js.native
  /**
    * Move the focus of the current selection to the end of the next inline.
    */
  def moveFocusToEndOfNextInline(): Controller = js.native
  /**
    * Move the focus of the current selection to the end of the next text.
    */
  def moveFocusToEndOfNextText(): Controller = js.native
  /**
    * Move the focus of the current selection to the end of the provided node.
    */
  def moveFocusToEndOfNode(node: Node): Controller = js.native
  /**
    * Move the focus of the current selection to the end of the previous block.
    */
  def moveFocusToEndOfPreviousBlock(): Controller = js.native
  /**
    * Move the focus of the current selection to the end of the previous inline.
    */
  def moveFocusToEndOfPreviousInline(): Controller = js.native
  /**
    * Move the focus of the current selection to the end of the previous text.
    */
  def moveFocusToEndOfPreviousText(): Controller = js.native
  /**
    * Move the focus of the current selection to the end of the current text node.
    */
  def moveFocusToEndOfText(): Controller = js.native
  /**
    * Move the focus of the current selection to the start of the closest block parent.
    */
  def moveFocusToStartOfBlock(): Controller = js.native
  /**
    * Move the focus of the current selection to the start of the document.
    */
  def moveFocusToStartOfDocument(): Controller = js.native
  /**
    * Move the focus of the current selection to the start of the closest inline parent.
    */
  def moveFocusToStartOfInline(): Controller = js.native
  /**
    * Move the focus of the current selection to the start of the next block.
    */
  def moveFocusToStartOfNextBlock(): Controller = js.native
  /**
    * Move the focus of the current selection to the start of the next inline.
    */
  def moveFocusToStartOfNextInline(): Controller = js.native
  /**
    * Move the focus of the current selection to the start of the next text node.
    */
  def moveFocusToStartOfNextText(): Controller = js.native
  /**
    * Move the focus of the current selection to the start of the provided node.
    */
  def moveFocusToStartOfNode(node: Node): Controller = js.native
  /**
    * Move the focus of the current selection to the start of the previous block.
    */
  def moveFocusToStartOfPreviousBlock(): Controller = js.native
  /**
    * Move the focus of the current selection to the start of the previous inline.
    */
  def moveFocusToStartOfPreviousInline(): Controller = js.native
  /**
    * Move the focus of the current selection to the start of the previous text node.
    */
  def moveFocusToStartOfPreviousText(): Controller = js.native
  /**
    * Move the focus of the current selection to the start of the current text node.
    */
  def moveFocusToStartOfText(): Controller = js.native
  def moveFocusWordBackward(): Controller = js.native
  def moveFocusWordForward(): Controller = js.native
  /**
    * Move the anchor and focus of the selection forward n characters.
    */
  def moveForward(): Controller = js.native
  def moveForward(n: Double): Controller = js.native
  /**
    * Move a node by its key to a new parent node with with newkey at newindex
    */
  def moveNodeByKey(key: String, newKey: String, newIndex: Double): Controller = js.native
  /**
    * Move a node by its path to a new parent node with with newpath at newindex
    */
  def moveNodeByPath(path: List[Double], newPath: List[Double], newIndex: Double): Controller = js.native
  /**
    * Move the start of the current selection forward n characters
    */
  def moveStartBackward(): Controller = js.native
  def moveStartBackward(n: Double): Controller = js.native
  /**
    * Move the start of the current selection backward n characters
    */
  def moveStartForward(): Controller = js.native
  def moveStartForward(n: Double): Controller = js.native
  /**
    * Move the start of the current selection to a new path and offset
    */
  def moveStartTo(path: String): Controller = js.native
  def moveStartTo(path: String, n: Double): Controller = js.native
  def moveStartTo(path: Double): Controller = js.native
  def moveStartTo(path: Double, n: Double): Controller = js.native
  def moveStartTo(path: List[Double]): Controller = js.native
  def moveStartTo(path: List[Double], n: Double): Controller = js.native
  /**
    * Move the start of the current selection to the end of the closest block parent.
    */
  def moveStartToEndOfBlock(): Controller = js.native
  /**
    * Move the start of the current selection to the end of the document.
    */
  def moveStartToEndOfDocument(): Controller = js.native
  /**
    * Move the start of the current selection to the end of the closest inline parent.
    */
  def moveStartToEndOfInline(): Controller = js.native
  /**
    * Move the start of the current selection to the end of the next block.
    */
  def moveStartToEndOfNextBlock(): Controller = js.native
  /**
    * Move the start of the current selection to the end of the next inline.
    */
  def moveStartToEndOfNextInline(): Controller = js.native
  /**
    * Move the start of the current selection to the end of the next text.
    */
  def moveStartToEndOfNextText(): Controller = js.native
  /**
    * Move the start of the current selection to the end of the provided node.
    */
  def moveStartToEndOfNode(node: Node): Controller = js.native
  /**
    * Move the start of the current selection to the end of the previous block.
    */
  def moveStartToEndOfPreviousBlock(): Controller = js.native
  /**
    * Move the start of the current selection to the end of the previous inline.
    */
  def moveStartToEndOfPreviousInline(): Controller = js.native
  /**
    * Move the start of the current selection to the end of the previous text.
    */
  def moveStartToEndOfPreviousText(): Controller = js.native
  /**
    * Move the start of the current selection to the end of the current text node.
    */
  def moveStartToEndOfText(): Controller = js.native
  /**
    * Move the start of the current selection to the start of the closest block parent.
    */
  def moveStartToStartOfBlock(): Controller = js.native
  /**
    * Move the start of the current selection to the start of the document.
    */
  def moveStartToStartOfDocument(): Controller = js.native
  /**
    * Move the start of the current selection to the start of the closest inline parent.
    */
  def moveStartToStartOfInline(): Controller = js.native
  /**
    * Move the start of the current selection to the start of the next block.
    */
  def moveStartToStartOfNextBlock(): Controller = js.native
  /**
    * Move the start of the current selection to the start of the next inline.
    */
  def moveStartToStartOfNextInline(): Controller = js.native
  /**
    * Move the start of the current selection to the start of the next text node.
    */
  def moveStartToStartOfNextText(): Controller = js.native
  /**
    * Move the start of the current selection to the start of the provided node.
    */
  def moveStartToStartOfNode(node: Node): Controller = js.native
  /**
    * Move the start of the current selection to the start of the previous block.
    */
  def moveStartToStartOfPreviousBlock(): Controller = js.native
  /**
    * Move the start of the current selection to the start of the previous inline.
    */
  def moveStartToStartOfPreviousInline(): Controller = js.native
  /**
    * Move the start of the current selection to the start of the previous text node.
    */
  def moveStartToStartOfPreviousText(): Controller = js.native
  /**
    * Move the start of the current selection to the start of the current text node.
    */
  def moveStartToStartOfText(): Controller = js.native
  def moveStartWordBackward(): Controller = js.native
  def moveStartWordForward(): Controller = js.native
  /**
    * Collapse the current selection at the provided new path and offset.
    */
  def moveTo(path: String): Controller = js.native
  def moveTo(path: String, offset: Double): Controller = js.native
  def moveTo(path: Double): Controller = js.native
  def moveTo(path: Double, offset: Double): Controller = js.native
  def moveTo(path: List[Double]): Controller = js.native
  def moveTo(path: List[Double], offset: Double): Controller = js.native
  /**
    * Collapse the current selection at the anchor.
    */
  def moveToAnchor(): Controller = js.native
  /**
    * Collapse the current selection at the end.
    */
  def moveToEnd(): Controller = js.native
  /**
    * Collapse the current selection at the end of the closest block parent.
    */
  def moveToEndOfBlock(): Controller = js.native
  /**
    * Collapse the current selection at the end of the document.
    */
  def moveToEndOfDocument(): Controller = js.native
  /**
    * Collapse the current selection at the end of the closest inline parent.
    */
  def moveToEndOfInline(): Controller = js.native
  /**
    * Collapse the current selection at the end of the next block.
    */
  def moveToEndOfNextBlock(): Controller = js.native
  /**
    * Collapse the current selection at the end of the inline.
    */
  def moveToEndOfNextInline(): Controller = js.native
  /**
    * Collapse the current selection at the end of the next text node.
    */
  def moveToEndOfNextText(): Controller = js.native
  /**
    * Collapse the current selection at the end of the provided node.
    */
  def moveToEndOfNode(node: Node): Controller = js.native
  /**
    * Collapse the current selection at the end of the previous block.
    */
  def moveToEndOfPreviousBlock(): Controller = js.native
  /**
    * Collapse the current selection at the end of the previous inline.
    */
  def moveToEndOfPreviousInline(): Controller = js.native
  /**
    * Collapse the current selection at the end of the previous text node.
    */
  def moveToEndOfPreviousText(): Controller = js.native
  /**
    * Collapse the current selection at the end of the current text node.
    */
  def moveToEndOfText(): Controller = js.native
  /**
    * Collapse the current selection at the focus.
    */
  def moveToFocus(): Controller = js.native
  /**
    * Move the current selection's anchor to the start of the document and its focus to the end of it, selecting everything.
    */
  def moveToRangeOfDocument(): Controller = js.native
  /**
    * Move the current selection's anchor to the start of the provided node and its focus to the end of it.
    */
  def moveToRangeOfNode(node: Node): Controller = js.native
  /**
    * Collapse the current selection at the start.
    */
  def moveToStart(): Controller = js.native
  /**
    * Collapse the current selection at the start of the nearest block parent.
    */
  def moveToStartOfBlock(): Controller = js.native
  /**
    * Collapse the current selection at the start of the document.
    */
  def moveToStartOfDocument(): Controller = js.native
  /**
    * Collapse the current selection at the start of the nearest inline parent.
    */
  def moveToStartOfInline(): Controller = js.native
  /**
    * Collapse the current selection at the start of the next block.
    */
  def moveToStartOfNextBlock(): Controller = js.native
  /**
    * Collapse the current selection at the start of the next inline.
    */
  def moveToStartOfNextInline(): Controller = js.native
  /**
    * Collapse the current selection at the start of the next text node.
    */
  def moveToStartOfNextText(): Controller = js.native
  /**
    * Collapse the current selection at the start of the provided node.
    */
  def moveToStartOfNode(node: Node): Controller = js.native
  /**
    * Collapse the current selection at the start of the previous block.
    */
  def moveToStartOfPreviousBlock(): Controller = js.native
  /**
    * Collapse the current selection at the start of the previous inline.
    */
  def moveToStartOfPreviousInline(): Controller = js.native
  /**
    * Collapse the current selection at the start of the previous text node.
    */
  def moveToStartOfPreviousText(): Controller = js.native
  /**
    * Collapse the current selection at the start of the current text node.
    */
  def moveToStartOfText(): Controller = js.native
  def moveWordBackward(): Controller = js.native
  def moveWordForward(): Controller = js.native
  // Miscellaneous Commands //
  /**
    * Normalizes the document with the value's schema. Run automatically unless manually disabled.
    * Use it sparingly and strategically, as it can be very expensive.
    */
  def normalize(): Controller = js.native
  def query(query: String, args: js.Any*): js.Any = js.native
  def query(query: js.Function1[/* repeated */ js.Any, _], args: js.Any*): js.Any = js.native
  // History Commands //
  /**
    * Move forward one step in the history
    */
  def redo(): Controller = js.native
  /**
    * Add a new command by type to the controller. This will make the command available as a top-level method on the controller
    */
  def registerCommand(command: String): Controller = js.native
  /**
    * Add a new query by type to the controller. This will make the query available as a top-level method on the controller.
    */
  def registerQuery(query: String): Controller = js.native
  /**
    * Remove all `marks` from node by `key`.
    */
  def removeAllMarksByKey(key: String): Controller = js.native
  /**
    * Remove all `marks` from node by `path`.
    */
  def removeAllMarksByPath(path: List[Double]): Controller = js.native
  /**
    * Remove annotation
    */
  def removeAnnotation(annotation: Annotation): Controller = js.native
  def removeAnnotation(annotation: AnnotationJSON): Controller = js.native
  def removeAnnotation(annotation: AnnotationProperties): Controller = js.native
  def removeMark(mark: String): Controller = js.native
  /**
    * Remove a mark from the characters in the current selection.
    * Passing a string will implicitly create a Mark of that type for removal.
    */
  def removeMark(mark: Mark): Controller = js.native
  def removeMark(mark: MarkJSON): Controller = js.native
  def removeMark(mark: MarkProperties): Controller = js.native
  def removeMarkAtRange(range: RangeTypeJSON, mark: String): Controller = js.native
  def removeMarkAtRange(range: RangeTypeJSON, mark: Mark): Controller = js.native
  def removeMarkAtRange(range: RangeTypeJSON, mark: MarkJSON): Controller = js.native
  def removeMarkAtRange(range: RangeTypeJSON, mark: MarkProperties): Controller = js.native
  def removeMarkAtRange(range: RangeTypeProperties, mark: String): Controller = js.native
  def removeMarkAtRange(range: RangeTypeProperties, mark: Mark): Controller = js.native
  def removeMarkAtRange(range: RangeTypeProperties, mark: MarkJSON): Controller = js.native
  def removeMarkAtRange(range: RangeTypeProperties, mark: MarkProperties): Controller = js.native
  def removeMarkAtRange(range: RangeType, mark: String): Controller = js.native
  /**
    * Remove a mark from characters in the range. Passing a string will
    * implicitly create a mark of that type for deletion.
    */
  def removeMarkAtRange(range: RangeType, mark: Mark): Controller = js.native
  def removeMarkAtRange(range: RangeType, mark: MarkJSON): Controller = js.native
  def removeMarkAtRange(range: RangeType, mark: MarkProperties): Controller = js.native
  def removeMarkByKey(key: String, offset: Double, length: Double, mark: String): Controller = js.native
  def removeMarkByKey(key: String, offset: Double, length: Double, mark: Mark): Controller = js.native
  def removeMarkByKey(key: String, offset: Double, length: Double, mark: MarkJSON): Controller = js.native
  /**
    * Remove a mark from length characters starting at an offset in a node by key
    */
  def removeMarkByKey(key: String, offset: Double, length: Double, mark: MarkProperties): Controller = js.native
  def removeMarkByPath(path: List[Double], offset: Double, length: Double, mark: String): Controller = js.native
  def removeMarkByPath(path: List[Double], offset: Double, length: Double, mark: Mark): Controller = js.native
  def removeMarkByPath(path: List[Double], offset: Double, length: Double, mark: MarkJSON): Controller = js.native
  /**
    * Remove a mark from length characters starting at an offset in a node by path
    */
  def removeMarkByPath(path: List[Double], offset: Double, length: Double, mark: MarkProperties): Controller = js.native
  def removeMarksByPath(
    path: List[Double],
    offset: Double,
    length: Double,
    marks: js.Array[MarkProperties | MarkJSON | Mark | String]
  ): Controller = js.native
  def removeMarksByPath(
    path: List[Double],
    offset: Double,
    length: Double,
    marks: typings.immutable.immutableMod.Set[MarkProperties | MarkJSON | Mark | String]
  ): Controller = js.native
  /**
    * Remove a node from the document by its key
    */
  def removeNodeByKey(key: String): Controller = js.native
  /**
    * Remove a node from the document by its path
    */
  def removeNodeByPath(path: List[Double]): Controller = js.native
  /**
    * Remove length characters of text starting at an offset in a node by key
    */
  def removeTextByKey(key: String, offset: Double, length: Double): Controller = js.native
  /**
    * Remove length characters of text starting at an offset in a node by path
    */
  def removeTextByPath(path: List[Double], offset: Double, length: Double): Controller = js.native
  def replaceMark(mark: String, newMark: String): Controller = js.native
  def replaceMark(mark: String, newMark: Mark): Controller = js.native
  def replaceMark(mark: String, newMark: MarkJSON): Controller = js.native
  def replaceMark(mark: String, newMark: MarkProperties): Controller = js.native
  def replaceMark(mark: MarkJSON, newMark: String): Controller = js.native
  def replaceMark(mark: MarkJSON, newMark: Mark): Controller = js.native
  def replaceMark(mark: MarkJSON, newMark: MarkJSON): Controller = js.native
  def replaceMark(mark: MarkJSON, newMark: MarkProperties): Controller = js.native
  def replaceMark(mark: MarkProperties, newMark: String): Controller = js.native
  def replaceMark(mark: MarkProperties, newMark: Mark): Controller = js.native
  def replaceMark(mark: MarkProperties, newMark: MarkJSON): Controller = js.native
  /**
    * Remove a mark from the characters in the current selection.
    * Passing a string will implicitly create a Mark of that type.
    */
  def replaceMark(mark: MarkProperties, newMark: MarkProperties): Controller = js.native
  def replaceMark(mark: Mark, newMark: String): Controller = js.native
  def replaceMark(mark: Mark, newMark: Mark): Controller = js.native
  def replaceMark(mark: Mark, newMark: MarkJSON): Controller = js.native
  def replaceMark(mark: Mark, newMark: MarkProperties): Controller = js.native
  /**
    * Replace a node in the document with a new node by key
    */
  def replaceNodeByKey(key: String, node: Node): Controller = js.native
  /**
    * Replace a node in the document with a new node by path
    */
  def replaceNodeByPath(path: List[Double], newNode: Node): Controller = js.native
  /**
    * Set a dictionary of newProperties on a mark by its key.
    */
  /**
    * Replace a length of text at offset with new text and optional marks by key
    */
  def replaceTextByKey(key: String, node: Node): Controller = js.native
  /**
    * Replace a length of text at offset with new text and optional marks by path
    */
  def replaceTextByPath(path: List[Double], offset: Double, length: Double, text: String): Controller = js.native
  def replaceTextByPath(path: List[Double], offset: Double, length: Double, text: String, marks: js.Array[Mark]): Controller = js.native
  def replaceTextByPath(
    path: List[Double],
    offset: Double,
    length: Double,
    text: String,
    marks: typings.immutable.immutableMod.Set[Mark]
  ): Controller = js.native
  /**
    * Run the middleware stack by key with args, returning its result.
    * In normal operation you never need to use this method! Reserved for testing.
    */
  def run(key: String, args: js.Any*): Controller = js.native
  /**
    * Save an `operation` into the history.
    */
  def save(operation: Operation): Unit = js.native
  def select(properties: String): Controller = js.native
  def select(properties: String, options: Anon_Snapshot): Controller = js.native
  def select(properties: RangeType): Controller = js.native
  def select(properties: RangeTypeJSON): Controller = js.native
  def select(properties: RangeTypeJSON, options: Anon_Snapshot): Controller = js.native
  /**
    * Merge the current selection with the provided properties
    */
  def select(properties: RangeTypeProperties): Controller = js.native
  def select(properties: RangeTypeProperties, options: Anon_Snapshot): Controller = js.native
  def select(properties: RangeType, options: Anon_Snapshot): Controller = js.native
  def setAnchor(point: Point): Unit = js.native
  def setAnnotation(annotation: Annotation, newProperties: Annotation): Controller = js.native
  def setAnnotation(annotation: Annotation, newProperties: AnnotationJSON): Controller = js.native
  /**
    * Set annotation
    */
  def setAnnotation(annotation: Annotation, newProperties: AnnotationProperties): Controller = js.native
  def setBlocks(properties: String): Controller = js.native
  /**
    * Set the properties of the Blocks in the current selection.
    * Passing a string will set the blocks' type only.
    */
  def setBlocks(properties: Block): Controller = js.native
  def setBlocks(properties: BlockJSON): Controller = js.native
  def setBlocks(properties: BlockProperties): Controller = js.native
  def setBlocksAtRange(range: RangeTypeJSON, properties: String): Controller = js.native
  def setBlocksAtRange(range: RangeTypeJSON, properties: Block): Controller = js.native
  def setBlocksAtRange(range: RangeTypeJSON, properties: BlockJSON): Controller = js.native
  def setBlocksAtRange(range: RangeTypeJSON, properties: BlockProperties): Controller = js.native
  def setBlocksAtRange(range: RangeTypeProperties, properties: String): Controller = js.native
  def setBlocksAtRange(range: RangeTypeProperties, properties: Block): Controller = js.native
  def setBlocksAtRange(range: RangeTypeProperties, properties: BlockJSON): Controller = js.native
  def setBlocksAtRange(range: RangeTypeProperties, properties: BlockProperties): Controller = js.native
  def setBlocksAtRange(range: RangeType, properties: String): Controller = js.native
  /**
    * Set the properties of the block nodes in a range.
    * Passing a string will set the nodes' type only
    */
  def setBlocksAtRange(range: RangeType, properties: Block): Controller = js.native
  def setBlocksAtRange(range: RangeType, properties: BlockJSON): Controller = js.native
  def setBlocksAtRange(range: RangeType, properties: BlockProperties): Controller = js.native
  /**
    * Set data
    */
  def setData(data: Data): Controller = js.native
  def setEnd(point: Point): Unit = js.native
  def setFocus(point: Point): Unit = js.native
  def setInlines(properties: String): Controller = js.native
  /**
    * Set the properties of the Inlines nodes in the current selection.
    * Passing a string will set the nodes' type only.
    */
  def setInlines(properties: Inline): Controller = js.native
  def setInlines(properties: InlineProperties): Controller = js.native
  def setInlinesAtRange(range: RangeTypeJSON, properties: String): Controller = js.native
  def setInlinesAtRange(range: RangeTypeJSON, properties: Inline): Controller = js.native
  def setInlinesAtRange(range: RangeTypeJSON, properties: InlineJSON): Controller = js.native
  def setInlinesAtRange(range: RangeTypeJSON, properties: InlineProperties): Controller = js.native
  def setInlinesAtRange(range: RangeTypeProperties, properties: String): Controller = js.native
  def setInlinesAtRange(range: RangeTypeProperties, properties: Inline): Controller = js.native
  def setInlinesAtRange(range: RangeTypeProperties, properties: InlineJSON): Controller = js.native
  def setInlinesAtRange(range: RangeTypeProperties, properties: InlineProperties): Controller = js.native
  def setInlinesAtRange(range: RangeType, properties: String): Controller = js.native
  def setInlinesAtRange(range: RangeType, properties: Inline): Controller = js.native
  def setInlinesAtRange(range: RangeType, properties: InlineJSON): Controller = js.native
  /**
    * Set the properties of the inline nodes in a range.
    * Passing a string will set the nodes' type only
    */
  def setInlinesAtRange(range: RangeType, properties: InlineProperties): Controller = js.native
  def setMarkByKey(
    key: String,
    offset: Double,
    length: Double,
    properties: String,
    newProperties: Partial[MarkProperties | MarkJSON | Mark | String]
  ): Controller = js.native
  def setMarkByKey(
    key: String,
    offset: Double,
    length: Double,
    properties: MarkJSON,
    newProperties: Partial[MarkProperties | MarkJSON | Mark | String]
  ): Controller = js.native
  /**
    * Remove length characters of text starting at an offset in a node by key
    */
  def setMarkByKey(
    key: String,
    offset: Double,
    length: Double,
    properties: MarkProperties,
    newProperties: Partial[MarkProperties | MarkJSON | Mark | String]
  ): Controller = js.native
  def setMarkByKey(
    key: String,
    offset: Double,
    length: Double,
    properties: Mark,
    newProperties: Partial[MarkProperties | MarkJSON | Mark | String]
  ): Controller = js.native
  def setMarkByPath(
    path: List[Double],
    offset: Double,
    length: Double,
    properties: String,
    newProperties: Partial[MarkProperties | MarkJSON | Mark | String]
  ): Controller = js.native
  def setMarkByPath(
    path: List[Double],
    offset: Double,
    length: Double,
    properties: MarkJSON,
    newProperties: Partial[MarkProperties | MarkJSON | Mark | String]
  ): Controller = js.native
  /**
    * Set a dictionary of newProperties on a mark by its path.
    */
  def setMarkByPath(
    path: List[Double],
    offset: Double,
    length: Double,
    properties: MarkProperties,
    newProperties: Partial[MarkProperties | MarkJSON | Mark | String]
  ): Controller = js.native
  def setMarkByPath(
    path: List[Double],
    offset: Double,
    length: Double,
    properties: Mark,
    newProperties: Partial[MarkProperties | MarkJSON | Mark | String]
  ): Controller = js.native
  def setNodeByKey(key: String, properties: String): Controller = js.native
  /**
    * Set a dictionary of properties on a node by its key.
    */
  def setNodeByKey(key: String, properties: BlockProperties): Controller = js.native
  def setNodeByKey(key: String, properties: InlineProperties): Controller = js.native
  def setNodeByPath(path: List[Double], newProperties: String): Controller = js.native
  def setNodeByPath(path: List[Double], newProperties: InlineProperties): Controller = js.native
  /**
    * Set a dictionary of properties on a node by its key.
    */
  def setNodeByPath(path: List[Double], newProperties: NodeProperties): Controller = js.native
  def setStart(point: Point): Unit = js.native
  /**
    *  Insert `text` at `offset` in node by `key`.
    */
  def setTextByKey(key: String, text: String, marks: typings.immutable.immutableMod.Set[Mark]): Controller = js.native
  /**
    *  Insert `text` at `offset` in node by `path`.
    */
  def setTextByPath(path: List[Double], text: String, marks: typings.immutable.immutableMod.Set[Mark]): Controller = js.native
  /**
    * Snapshot the current selection for undo purposes.
    */
  def snapshotSelection(): Controller = js.native
  /**
    * Split the Block in the current selection by depth levels.
    * If the selection is expanded, it will be deleted first.
    */
  def splitBlock(): Controller = js.native
  def splitBlock(depth: Double): Controller = js.native
  /**
    * Split the block nodes at a `range`, to optional `height`.
    */
  def splitBlockAtRange(range: RangeType): Controller = js.native
  def splitBlockAtRange(range: RangeTypeJSON): Controller = js.native
  def splitBlockAtRange(range: RangeTypeJSON, height: Double): Controller = js.native
  def splitBlockAtRange(range: RangeTypeProperties): Controller = js.native
  def splitBlockAtRange(range: RangeTypeProperties, height: Double): Controller = js.native
  def splitBlockAtRange(range: RangeType, height: Double): Controller = js.native
  /**
    * Split a node deeply down the tree by `key`, `textKey` and `textOffset`.
    */
  def splitDescendantsByKey(key: String, textKey: String, textOffset: Double): Controller = js.native
  /**
    * Split a node deeply down the tree by `path`, `textPath` and `textOffset`.
    */
  def splitDescendantsByPath(path: List[Double], textPath: List[Double], textOffset: Double): Controller = js.native
  /**
    * Split the Inline node in the current selection by depth levels.
    * If the selection is expanded, it will be deleted first
    */
  def splitInline(depth: Double): Controller = js.native
  /**
    * Split the inline nodes at a `range`, to optional `height`.
    */
  def splitInlineAtRange(range: RangeType): Controller = js.native
  def splitInlineAtRange(range: RangeTypeJSON): Controller = js.native
  def splitInlineAtRange(range: RangeTypeJSON, height: Double): Controller = js.native
  def splitInlineAtRange(range: RangeTypeProperties): Controller = js.native
  def splitInlineAtRange(range: RangeTypeProperties, height: Double): Controller = js.native
  def splitInlineAtRange(range: RangeType, height: Double): Controller = js.native
  /**
    * Split a node by its key at an offset
    */
  def splitNodeByKey(key: String, offset: Double): Controller = js.native
  /**
    * Split a node by its path at an offset
    */
  def splitNodeByPath(path: List[Double], position: Double): Controller = js.native
  def splitNodeByPath(path: List[Double], position: Double, options: Anon_Target): Controller = js.native
  def toggleMark(mark: String): Controller = js.native
  def toggleMark(mark: Mark): Controller = js.native
  def toggleMark(mark: MarkJSON): Controller = js.native
  /**
    * Add or remove a mark from the characters in the current selection, depending on it already exists on any or not.
    * Passing a string will implicitly create a Mark of that type to toggle.
    */
  def toggleMark(mark: MarkProperties): Controller = js.native
  def toggleMarkAtRange(range: RangeTypeJSON, mark: String): Controller = js.native
  def toggleMarkAtRange(range: RangeTypeJSON, mark: Mark): Controller = js.native
  def toggleMarkAtRange(range: RangeTypeJSON, mark: MarkJSON): Controller = js.native
  def toggleMarkAtRange(range: RangeTypeJSON, mark: MarkProperties): Controller = js.native
  def toggleMarkAtRange(range: RangeTypeProperties, mark: String): Controller = js.native
  def toggleMarkAtRange(range: RangeTypeProperties, mark: Mark): Controller = js.native
  def toggleMarkAtRange(range: RangeTypeProperties, mark: MarkJSON): Controller = js.native
  def toggleMarkAtRange(range: RangeTypeProperties, mark: MarkProperties): Controller = js.native
  def toggleMarkAtRange(range: RangeType, mark: String): Controller = js.native
  /**
    * Add or remove a mark from characters in the range. Passing a string will
    * implicitly create a mark of that type for deletion.
    */
  def toggleMarkAtRange(range: RangeType, mark: Mark): Controller = js.native
  def toggleMarkAtRange(range: RangeType, mark: MarkJSON): Controller = js.native
  def toggleMarkAtRange(range: RangeType, mark: MarkProperties): Controller = js.native
  /**
    * Move backward one step in the history
    */
  def undo(): Controller = js.native
  def unwrapBlock(properties: String): Controller = js.native
  def unwrapBlock(properties: Block): Controller = js.native
  def unwrapBlock(properties: BlockJSON): Controller = js.native
  /**
    * Unwrap all Block nodes in the current selection that match a type and/or data
    */
  def unwrapBlock(properties: BlockProperties): Controller = js.native
  def unwrapBlockAtRange(range: RangeTypeJSON, properties: String): Controller = js.native
  def unwrapBlockAtRange(range: RangeTypeJSON, properties: Block): Controller = js.native
  def unwrapBlockAtRange(range: RangeTypeJSON, properties: BlockJSON): Controller = js.native
  def unwrapBlockAtRange(range: RangeTypeJSON, properties: BlockProperties): Controller = js.native
  def unwrapBlockAtRange(range: RangeTypeProperties, properties: String): Controller = js.native
  def unwrapBlockAtRange(range: RangeTypeProperties, properties: Block): Controller = js.native
  def unwrapBlockAtRange(range: RangeTypeProperties, properties: BlockJSON): Controller = js.native
  def unwrapBlockAtRange(range: RangeTypeProperties, properties: BlockProperties): Controller = js.native
  def unwrapBlockAtRange(range: RangeType, properties: String): Controller = js.native
  def unwrapBlockAtRange(range: RangeType, properties: Block): Controller = js.native
  def unwrapBlockAtRange(range: RangeType, properties: BlockJSON): Controller = js.native
  /**
    * Unwrap all block nodes in a range that match properties
    */
  def unwrapBlockAtRange(range: RangeType, properties: BlockProperties): Controller = js.native
  def unwrapBlockByKey(key: String, properties: String): Controller = js.native
  /**
    * Unwrap all inner content of a block node by its key that match properties
    */
  def unwrapBlockByKey(key: String, properties: BlockProperties): Controller = js.native
  def unwrapBlockByPath(path: Path, properties: String): Controller = js.native
  /**
    * Unwrap all inner content of a block node by its path that match properties
    */
  def unwrapBlockByPath(path: Path, properties: BlockProperties): Controller = js.native
  /**
    * Unwrap all of the children of a node by its key.
    */
  def unwrapChildrenByKey(key: String): Controller = js.native
  def unwrapChildrenByPath(path: js.Array[Double]): Controller = js.native
  /**
    * Unwrap all of the children of a node, by removing the node and replacing it
    * with the children in the tree.
    */
  def unwrapChildrenByPath(path: List[Double]): Controller = js.native
  def unwrapInline(properties: String): Controller = js.native
  def unwrapInline(properties: Inline): Controller = js.native
  def unwrapInline(properties: InlineJSON): Controller = js.native
  /**
    * Unwrap all Inline nodes in the current selection that match a type and/or data
    */
  def unwrapInline(properties: InlineProperties): Controller = js.native
  def unwrapInlineAtRange(range: RangeTypeJSON, properties: String): Controller = js.native
  def unwrapInlineAtRange(range: RangeTypeJSON, properties: Inline): Controller = js.native
  def unwrapInlineAtRange(range: RangeTypeJSON, properties: InlineJSON): Controller = js.native
  def unwrapInlineAtRange(range: RangeTypeJSON, properties: InlineProperties): Controller = js.native
  def unwrapInlineAtRange(range: RangeTypeProperties, properties: String): Controller = js.native
  def unwrapInlineAtRange(range: RangeTypeProperties, properties: Inline): Controller = js.native
  def unwrapInlineAtRange(range: RangeTypeProperties, properties: InlineJSON): Controller = js.native
  def unwrapInlineAtRange(range: RangeTypeProperties, properties: InlineProperties): Controller = js.native
  def unwrapInlineAtRange(range: RangeType, properties: String): Controller = js.native
  def unwrapInlineAtRange(range: RangeType, properties: Inline): Controller = js.native
  def unwrapInlineAtRange(range: RangeType, properties: InlineJSON): Controller = js.native
  /**
    * Unwrap all inline nodes in a range that match properties
    */
  def unwrapInlineAtRange(range: RangeType, properties: InlineProperties): Controller = js.native
  def unwrapInlineByKey(key: String, properties: String): Controller = js.native
  /**
    * Unwrap all inner content of an inline node by its key that match properties
    */
  def unwrapInlineByKey(key: String, properties: InlineProperties): Controller = js.native
  def unwrapInlineByPath(path: Path, properties: String): Controller = js.native
  /**
    * Unwrap all inner content of an inline node by its path that match properties
    */
  def unwrapInlineByPath(path: Path, properties: InlineProperties): Controller = js.native
  /**
    * Unwrap a single node from its parent. if the node is surrounded with siblings the parent will be split.
    * If the node is an only child, it will replace the parent
    */
  def unwrapNodeByKey(key: String): Controller = js.native
  /**
    * Unwrap a single node from its parent. if the node is surrounded with siblings the parent will be split.
    * If the node is an only child, it will replace the parent
    */
  def unwrapNodeByPath(path: List[Double]): Controller = js.native
  /**
    * Usually all command operations are merged into a single save point in history,
    * if more control is desired, create single save points using this function.
    */
  def withoutMerging(fn: js.Function0[Unit]): Unit = js.native
  /**
    * Calls the provided function with the current commandable as the first argument.
    * Normalization does not occur while the function is executing and is deferred to execute immediately after completion.
    *
    * This allows for sequence change operations to not be interrupted by normalization
    */
  def withoutNormalizing(fn: js.Function0[Unit]): Controller = js.native
  /**
    * By default all operations are saved to the commandable's history. If you have
    * changes that you don't want to show up in history, use this function.
    */
  def withoutSaving(fn: js.Function0[Unit]): Unit = js.native
  def wrapBlock(properties: String): Controller = js.native
  def wrapBlock(properties: Block): Controller = js.native
  def wrapBlock(properties: BlockJSON): Controller = js.native
  /**
    * Wrap the Block nodes in the current selection with a new Block
    */
  def wrapBlock(properties: BlockProperties): Controller = js.native
  def wrapBlockAtRange(range: RangeTypeJSON, properties: String): Controller = js.native
  def wrapBlockAtRange(range: RangeTypeJSON, properties: Block): Controller = js.native
  def wrapBlockAtRange(range: RangeTypeJSON, properties: BlockJSON): Controller = js.native
  def wrapBlockAtRange(range: RangeTypeJSON, properties: BlockProperties): Controller = js.native
  def wrapBlockAtRange(range: RangeTypeProperties, properties: String): Controller = js.native
  def wrapBlockAtRange(range: RangeTypeProperties, properties: Block): Controller = js.native
  def wrapBlockAtRange(range: RangeTypeProperties, properties: BlockJSON): Controller = js.native
  def wrapBlockAtRange(range: RangeTypeProperties, properties: BlockProperties): Controller = js.native
  def wrapBlockAtRange(range: RangeType, properties: String): Controller = js.native
  def wrapBlockAtRange(range: RangeType, properties: Block): Controller = js.native
  def wrapBlockAtRange(range: RangeType, properties: BlockJSON): Controller = js.native
  /**
    * wrap all block nodes in a range with a new block node with the provided properties
    */
  def wrapBlockAtRange(range: RangeType, properties: BlockProperties): Controller = js.native
  def wrapBlockByKey(key: String, properties: String): Controller = js.native
  /**
    * Wrap the given node by key in a block node that matches properties.
    */
  def wrapBlockByKey(key: String, properties: BlockProperties): Controller = js.native
  def wrapBlockByPath(path: List[Double], block: String): Controller = js.native
  /**
    * Wrap the given node by path in a block node that matches properties.
    */
  def wrapBlockByPath(path: List[Double], block: Block): Controller = js.native
  def wrapInline(properties: String): Controller = js.native
  def wrapInline(properties: Inline): Controller = js.native
  def wrapInline(properties: InlineJSON): Controller = js.native
  /**
    *  Wrap the Block nodes in the current selection with a new Inline
    */
  def wrapInline(properties: InlineProperties): Controller = js.native
  def wrapInlineAtRange(range: RangeTypeJSON, properties: String): Controller = js.native
  def wrapInlineAtRange(range: RangeTypeJSON, properties: Inline): Controller = js.native
  def wrapInlineAtRange(range: RangeTypeJSON, properties: InlineJSON): Controller = js.native
  def wrapInlineAtRange(range: RangeTypeJSON, properties: InlineProperties): Controller = js.native
  def wrapInlineAtRange(range: RangeTypeProperties, properties: String): Controller = js.native
  def wrapInlineAtRange(range: RangeTypeProperties, properties: Inline): Controller = js.native
  def wrapInlineAtRange(range: RangeTypeProperties, properties: InlineJSON): Controller = js.native
  def wrapInlineAtRange(range: RangeTypeProperties, properties: InlineProperties): Controller = js.native
  def wrapInlineAtRange(range: RangeType, properties: String): Controller = js.native
  def wrapInlineAtRange(range: RangeType, properties: Inline): Controller = js.native
  def wrapInlineAtRange(range: RangeType, properties: InlineJSON): Controller = js.native
  /**
    * wrap all inline nodes in a range with a new inline node with the provided properties
    */
  def wrapInlineAtRange(range: RangeType, properties: InlineProperties): Controller = js.native
  def wrapInlineByKey(key: String, properties: String): Controller = js.native
  /**
    * Wrap the given node by key in an Inline node that matches properties.
    */
  def wrapInlineByKey(key: String, properties: InlineProperties): Controller = js.native
  def wrapInlineByPath(path: Path, properties: String): Controller = js.native
  /**
    * Wrap the given node by path in an Inline node that matches properties.
    */
  def wrapInlineByPath(path: Path, properties: InlineProperties): Controller = js.native
  /**
    * Wrap the node with the specified key with the parent node, this will clear all children of the parent.
    */
  def wrapNodeByKey(key: String, parent: Node): Controller = js.native
  /**
    * Wrap the node with the specified key with the parent node, this will clear all children of the parent.
    */
  def wrapNodeByPath(path: List[Double], parent: Node): Controller = js.native
  /**
    * Surround the text in the current selection with prefix and suffix strings.
    * If the suffix is ommitted, the prefix will be used instead.
    */
  def wrapText(prefix: String): Controller = js.native
  def wrapText(prefix: String, suffix: String): Controller = js.native
  def wrapTextAtRange(range: RangeTypeJSON, prefix: String): Controller = js.native
  def wrapTextAtRange(range: RangeTypeJSON, prefix: String, suffix: String): Controller = js.native
  def wrapTextAtRange(range: RangeTypeProperties, prefix: String): Controller = js.native
  def wrapTextAtRange(range: RangeTypeProperties, prefix: String, suffix: String): Controller = js.native
  /**
    * Surround the text in a range with a prefix and suffix. If the suffix is ommitted,
    * the prefix will be used instead.
    */
  def wrapTextAtRange(range: RangeType, prefix: String): Controller = js.native
  def wrapTextAtRange(range: RangeType, prefix: String, suffix: String): Controller = js.native
}

