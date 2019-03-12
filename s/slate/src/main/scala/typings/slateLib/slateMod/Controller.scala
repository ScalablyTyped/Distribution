package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Controller extends js.Object {
  def addMark(mark: java.lang.String): Controller = js.native
  // Current Selection Commands //
  /**
    * Add a mark to the characters in the current selection
    */
  def addMark(mark: Mark): Controller = js.native
  def addMark(mark: MarkProperties): Controller = js.native
  def addMarkAtRange(range: Range, mark: java.lang.String): Controller = js.native
  // Document Range Commands //
  /**
    * Add a mark to the characters in the range.
    * Passing a string as `mark` will implicitly create a mark with that `type`
    */
  def addMarkAtRange(range: Range, mark: Mark): Controller = js.native
  def addMarkAtRange(range: Range, mark: MarkProperties): Controller = js.native
  def addMarkByKey(key: java.lang.String, offset: scala.Double, length: scala.Double, mark: java.lang.String): Controller = js.native
  def addMarkByKey(key: java.lang.String, offset: scala.Double, length: scala.Double, mark: Mark): Controller = js.native
  // Node commands //
  /**
    * Add a mark to length characters starting at an offset in a node by key
    */
  def addMarkByKey(key: java.lang.String, offset: scala.Double, length: scala.Double, mark: MarkProperties): Controller = js.native
  def addMarkByPath(path: Path, offset: scala.Double, length: scala.Double, mark: java.lang.String): Controller = js.native
  def addMarkByPath(path: Path, offset: scala.Double, length: scala.Double, mark: Mark): Controller = js.native
  /**
    * Add a mark to length characters starting at an offset in a node by path
    */
  def addMarkByPath(path: Path, offset: scala.Double, length: scala.Double, mark: MarkProperties): Controller = js.native
  /**
    * Apply an `operation` to the controller, updating its value.
    */
  def applyOperation(operation: Operation): Controller = js.native
  // Selection Commands //
  /**
    * Blur the current selection
    */
  def blur(): Controller = js.native
  def command(name: java.lang.String, args: js.Any*): Controller = js.native
  /**
    * Delete everything in the current selection.
    */
  def delete(): Controller = js.native
  /**
    * Delete everything in the range
    */
  def deleteAtRange(range: Range): Controller = js.native
  /**
    * Delete backward n characters at the current cursor.
    * If the selection is expanded, behaviour is equivalent to delete()
    */
  def deleteBackward(n: scala.Double): Controller = js.native
  /**
    * Delete backward n characters at a range
    */
  def deleteBackwardAtRange(range: Range, n: scala.Double): Controller = js.native
  /**
    * Delete backward until the char boundary at a range
    */
  def deleteCharBackwardAtRange(range: Range): Controller = js.native
  /**
    * Delete forward until the char boundary at a range
    */
  def deleteCharForwardAtRange(range: Range): Controller = js.native
  /**
    * Delete backward n characters at the current cursor.
    * If the selection is expanded, behaviour is equivalent to delete()
    */
  def deleteForward(n: scala.Double): Controller = js.native
  /**
    * Delete forward n characters at a range
    */
  def deleteForwardAtRange(range: Range, n: scala.Double): Controller = js.native
  /**
    * Delete backward until the line boundary at a range
    */
  def deleteLineBackwardAtRange(range: Range): Controller = js.native
  /**
    * Delete forward until the line boundary at a range
    */
  def deleteLineForwardAtRange(range: Range): Controller = js.native
  /**
    * Delete backward until the word boundary at a range
    */
  def deleteWordBackwardAtRange(range: Range): Controller = js.native
  /**
    * Delete forward until the word boundary at a range
    */
  def deleteWordForwardAtRange(range: Range): Controller = js.native
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
  def insertBlock(block: java.lang.String): Controller = js.native
  /**
    * Insert a new block at the same level as the current block, splitting the current block to make room if it is non-empty.
    * If the selection is expanded, it will be deleted first.
    */
  def insertBlock(block: Block): Controller = js.native
  def insertBlock(block: BlockProperties): Controller = js.native
  def insertBlockAtRange(range: Range, block: java.lang.String): Controller = js.native
  /**
    * Insert a block node at range, splitting text to make room if it is non-empty.
    * If the range is expanded, it will be deleted first.
    */
  def insertBlockAtRange(range: Range, block: Block): Controller = js.native
  def insertBlockAtRange(range: Range, block: BlockProperties): Controller = js.native
  /**
    * Insert a document fragment at the current selection. If the selection is expanded, it will be deleted first.
    */
  def insertFragment(fragment: Document[org.scalablytyped.runtime.StringDictionary[_]]): Controller = js.native
  /**
    * Insert a document fragment at a range, if the range is expanded, it will be deleted first.
    */
  def insertFragmentAtRange(range: Range, fragment: Document[org.scalablytyped.runtime.StringDictionary[_]]): Controller = js.native
  /**
    * Insert a document fragment at index inside a parent node by key
    */
  def insertFragmentByKey(
    key: java.lang.String,
    index: scala.Double,
    fragment: Document[org.scalablytyped.runtime.StringDictionary[_]]
  ): Controller = js.native
  /**
    * Insert a document fragment at index inside a parent node by path
    */
  def insertFragmentByPath(path: Path, index: scala.Double, fragment: Document[org.scalablytyped.runtime.StringDictionary[_]]): Controller = js.native
  /**
    * Insert a new inline at the current cursor position, splitting the text to make room if it is non-empty.
    * If the selection is expanded, it will be deleted first.
    */
  def insertInline(`inline`: Inline): Controller = js.native
  def insertInline(`inline`: InlineProperties): Controller = js.native
  /**
    * Insert a new inline at range, splitting text to make room if it is non-empty.
    * If the range is expanded, it will be deleted first.
    */
  def insertInlineAtRange(range: Range, `inline`: Inline): Controller = js.native
  def insertInlineAtRange(range: Range, `inline`: InlineProperties): Controller = js.native
  /**
    * Insert a node at index inside a parent node by key
    */
  def insertNodeByKey(key: java.lang.String, index: scala.Double, node: Node): Controller = js.native
  /**
    * Insert a node at index inside a parent node by apth
    */
  def insertNodeByPath(path: Path, index: scala.Double, node: Node): Controller = js.native
  /**
    * Insert a string of text at the current selection. If the selection is expanded, it will be deleted first
    */
  def insertText(text: java.lang.String): Controller = js.native
  /**
    * Insert text at range. If the range is expanded it will be deleted first
    */
  def insertTextAtRange(range: Range, text: java.lang.String): Controller = js.native
  /**
    * Insert text at an offset in a text node by its key with optional marks
    */
  def insertTextByKey(key: java.lang.String, offset: scala.Double, text: java.lang.String): Controller = js.native
  def insertTextByKey(
    key: java.lang.String,
    offset: scala.Double,
    text: java.lang.String,
    marks: immutableLib.immutableMod.Set[Mark]
  ): Controller = js.native
  def insertTextByKey(key: java.lang.String, offset: scala.Double, text: java.lang.String, marks: js.Array[Mark]): Controller = js.native
  /**
    * Insert text at an offset in a text node by its path with optional marks
    */
  def insertTextByPath(path: Path, offset: scala.Double, text: java.lang.String): Controller = js.native
  def insertTextByPath(
    path: Path,
    offset: scala.Double,
    text: java.lang.String,
    marks: immutableLib.immutableMod.Set[Mark]
  ): Controller = js.native
  def insertTextByPath(path: Path, offset: scala.Double, text: java.lang.String, marks: js.Array[Mark]): Controller = js.native
  /**
    * Merge a node by its key with its previous sibling
    */
  def mergeNodeByKey(key: java.lang.String): Controller = js.native
  /**
    * Merge a node by its path with its previous sibling
    */
  def mergeNodeByPath(path: Path): Controller = js.native
  /**
    * Move the anchor of the current selection backward n characters
    */
  def moveAnchorBackward(): Controller = js.native
  def moveAnchorBackward(n: scala.Double): Controller = js.native
  /**
    * Move the anchor of the current selection to the end of the provided node.
    */
  def moveAnchorEndOfNode(node: Node): Controller = js.native
  /**
    * Move the anchor of the current selection forward n characters
    */
  def moveAnchorForward(): Controller = js.native
  def moveAnchorForward(n: scala.Double): Controller = js.native
  /**
    * Move the anchor of the current selection to a new path and offset
    */
  def moveAnchorTo(path: Path): Controller = js.native
  def moveAnchorTo(path: Path, offset: scala.Double): Controller = js.native
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
  /**
    * Move the anchor and focus of the selection backward n characters.
    */
  def moveBackward(): Controller = js.native
  def moveBackward(n: scala.Double): Controller = js.native
  /**
    * Move the end of the selection backward n characters
    */
  def moveEndBackward(): Controller = js.native
  def moveEndBackward(n: scala.Double): Controller = js.native
  /**
    * Move the end of the selection foward n characters
    */
  def moveEndForward(): Controller = js.native
  def moveEndForward(n: scala.Double): Controller = js.native
  /**
    * Move the end of the selection to a new path and offset
    */
  def moveEndTo(path: Path): Controller = js.native
  def moveEndTo(path: Path, offset: scala.Double): Controller = js.native
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
  /**
    * Move the focus of the current selection backward n characters
    */
  def moveFocusBackward(): Controller = js.native
  def moveFocusBackward(n: scala.Double): Controller = js.native
  /**
    * Move the focus of the current selection forward n characters
    */
  def moveFocusForward(): Controller = js.native
  def moveFocusForward(n: scala.Double): Controller = js.native
  /**
    * Move the focus of the current selection to a new path and offset
    */
  def moveFocusTo(path: Path): Controller = js.native
  def moveFocusTo(path: Path, offset: scala.Double): Controller = js.native
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
  /**
    * Move the anchor and focus of the selection forward n characters.
    */
  def moveForward(): Controller = js.native
  def moveForward(n: scala.Double): Controller = js.native
  /**
    * Move a node by its key to a new parent node with with newkey at newindex
    */
  def moveNodeByKey(key: java.lang.String, newKey: java.lang.String, newIndex: scala.Double): Controller = js.native
  /**
    * Move a node by its path to a new parent node with with newpath at newindex
    */
  def moveNodeByPath(path: Path, newPath: Path, newIndex: scala.Double): Controller = js.native
  /**
    * Move the start of the current selection forward n characters
    */
  def moveStartBackward(): Controller = js.native
  def moveStartBackward(n: scala.Double): Controller = js.native
  /**
    * Move the start of the current selection backward n characters
    */
  def moveStartForward(): Controller = js.native
  def moveStartForward(n: scala.Double): Controller = js.native
  /**
    * Move the start of the current selection to a new path and offset
    */
  def moveStartTo(path: Path): Controller = js.native
  def moveStartTo(path: Path, n: scala.Double): Controller = js.native
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
  /**
    * Collapse the current selection at the provided new path and offset.
    */
  def moveTo(path: Path): Controller = js.native
  def moveTo(path: Path, offset: scala.Double): Controller = js.native
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
  // Miscellaneous Commands //
  /**
    * Normalizes the document with the value's schema. Run automatically unless manually disabled.
    * Use it sparingly and strategically, as it can be very expensive.
    */
  def normalize(): Controller = js.native
  def query(query: java.lang.String, args: js.Any*): Controller = js.native
  // History Commands //
  /**
    * Move forward one step in the history
    */
  def redo(): Controller = js.native
  /**
    * Add a new command by type to the controller. This will make the command available as a top-level method on the controller
    */
  def registerCommand(command: java.lang.String): Controller = js.native
  /**
    * Add a new query by type to the controller. This will make the query available as a top-level method on the controller.
    */
  def registerQuery(query: java.lang.String): Controller = js.native
  def removeMark(mark: java.lang.String): Controller = js.native
  /**
    * Remove a mark from the characters in the current selection.
    * Passing a string will implicitly create a Mark of that type for removal.
    */
  def removeMark(mark: Mark): Controller = js.native
  def removeMark(mark: MarkProperties): Controller = js.native
  def removeMarkAtRange(range: Range, mark: java.lang.String): Controller = js.native
  /**
    * Remove a mark from characters in the range. Passing a string will
    * implicitly create a mark of that type for deletion.
    */
  def removeMarkAtRange(range: Range, mark: Mark): Controller = js.native
  def removeMarkAtRange(range: Range, mark: MarkProperties): Controller = js.native
  def removeMarkByKey(key: java.lang.String, offset: scala.Double, length: scala.Double, mark: java.lang.String): Controller = js.native
  /**
    * Remove a mark from length characters starting at an offset in a node by key
    */
  def removeMarkByKey(key: java.lang.String, offset: scala.Double, length: scala.Double, mark: Mark): Controller = js.native
  def removeMarkByPath(path: Path, offset: scala.Double, length: scala.Double, mark: java.lang.String): Controller = js.native
  def removeMarkByPath(path: Path, offset: scala.Double, length: scala.Double, mark: Mark): Controller = js.native
  /**
    * Remove a mark from length characters starting at an offset in a node by path
    */
  def removeMarkByPath(path: Path, offset: scala.Double, length: scala.Double, mark: MarkProperties): Controller = js.native
  /**
    * Remove a node from the document by its key
    */
  def removeNodeByKey(key: java.lang.String): Controller = js.native
  /**
    * Remove a node from the document by its path
    */
  def removeNodeByPath(path: Path): Controller = js.native
  /**
    * Remove length characters of text starting at an offset in a node by key
    */
  def removeTextByKey(key: java.lang.String, offset: scala.Double, length: scala.Double): Controller = js.native
  /**
    * Remove length characters of text starting at an offset in a node by path
    */
  def removeTextByPath(path: Path, offset: scala.Double, length: scala.Double): Controller = js.native
  def replaceMark(mark: java.lang.String, newMark: java.lang.String): Controller = js.native
  def replaceMark(mark: java.lang.String, newMark: Mark): Controller = js.native
  def replaceMark(mark: java.lang.String, newMark: MarkProperties): Controller = js.native
  def replaceMark(mark: MarkProperties, newMark: java.lang.String): Controller = js.native
  def replaceMark(mark: MarkProperties, newMark: Mark): Controller = js.native
  def replaceMark(mark: MarkProperties, newMark: MarkProperties): Controller = js.native
  def replaceMark(mark: Mark, newMark: java.lang.String): Controller = js.native
  /**
    * Remove a mark from the characters in the current selection.
    * Passing a string will implicitly create a Mark of that type.
    */
  def replaceMark(mark: Mark, newMark: Mark): Controller = js.native
  def replaceMark(mark: Mark, newMark: MarkProperties): Controller = js.native
  /**
    * Replace a node in the document with a new node by key
    */
  def replaceNodeByKey(key: java.lang.String, node: Node): Controller = js.native
  /**
    * Replace a node in the document with a new node by path
    */
  def replaceNodeByPath(path: Path, newNode: Node): Controller = js.native
  /**
    * Run the middleware stack by key with args, returning its result.
    * In normal operation you never need to use this method! Reserved for testing.
    */
  def run(key: java.lang.String, args: js.Any*): Controller = js.native
  /**
    * Merge the current selection with the provided properties
    */
  def select(properties: Range): Controller = js.native
  def select(properties: RangeProperties): Controller = js.native
  def setBlocks(properties: java.lang.String): Controller = js.native
  /**
    * Set the properties of the Blocks in the current selection.
    * Passing a string will set the blocks' type only.
    */
  def setBlocks(properties: BlockProperties): Controller = js.native
  def setBlocksAtRange(range: Range, properties: java.lang.String): Controller = js.native
  /**
    * Set the properties of the block nodes in a range.
    * Passing a string will set the nodes' type only
    */
  def setBlocksAtRange(range: Range, properties: BlockProperties): Controller = js.native
  def setInlines(properties: java.lang.String): Controller = js.native
  /**
    * Set the properties of the Inlines nodes in the current selection.
    * Passing a string will set the nodes' type only.
    */
  def setInlines(properties: InlineProperties): Controller = js.native
  def setInlinesAtRange(range: Range, properties: java.lang.String): Controller = js.native
  /**
    * Set the properties of the inline nodes in a range.
    * Passing a string will set the nodes' type only
    */
  def setInlinesAtRange(range: Range, properties: InlineProperties): Controller = js.native
  /**
    * Set a dictionary of properties on a mark by its key.
    */
  def setMarkByKey(
    key: java.lang.String,
    offset: scala.Double,
    length: scala.Double,
    mark: Mark,
    properties: MarkProperties
  ): Controller = js.native
  /**
    * Set a dictionary of properties on a mark by its path.
    */
  def setMarksByPath(path: Path, offset: scala.Double, length: scala.Double, mark: Mark, properties: MarkProperties): Controller = js.native
  def setNodeByKey(key: java.lang.String, properties: java.lang.String): Controller = js.native
  /**
    * Set a dictionary of properties on a node by its key.
    */
  def setNodeByKey(key: java.lang.String, properties: BlockProperties): Controller = js.native
  def setNodeByKey(key: java.lang.String, properties: InlineProperties): Controller = js.native
  def setNodeByPath(path: Path, properties: java.lang.String): Controller = js.native
  def setNodeByPath(path: Path, properties: InlineProperties): Controller = js.native
  /**
    * Set a dictionary of properties on a node by its key.
    */
  def setNodeByPath(path: Path, properties: NodeProperties): Controller = js.native
  /**
    * Snapshot the current selection for undo purposes.
    */
  def snapshotSelection(): Controller = js.native
  /**
    * Split the Block in the current selection by depth levels.
    * If the selection is expanded, it will be deleted first.
    */
  def splitBlock(depth: scala.Double): Controller = js.native
  /**
    * Split the block in a range by depth levels. If the range is expanded it will be deleted first.
    */
  def splitBlockAtRange(range: Range, depth: scala.Double): Controller = js.native
  /**
    * Split the Inline node in the current selection by depth levels.
    * If the selection is expanded, it will be deleted first
    */
  def splitInline(depth: scala.Double): Controller = js.native
  /**
    * Split the inline in a range by depth levels. If the range is expanded it will be deleted first.
    */
  def splitInlineAtRange(range: Range, depth: scala.Double): Controller = js.native
  /**
    * Split a node by its key at an offset
    */
  def splitNodeByKey(key: java.lang.String, offset: scala.Double): Controller = js.native
  /**
    * Split a node by its path at an offset
    */
  def splitNodeByPath(path: Path, position: scala.Double): Controller = js.native
  def toggleMark(mark: java.lang.String): Controller = js.native
  /**
    * Add or remove a mark from the characters in the current selection, depending on it already exists on any or not.
    * Passing a string will implicitly create a Mark of that type to toggle.
    */
  def toggleMark(mark: Mark): Controller = js.native
  def toggleMark(mark: MarkProperties): Controller = js.native
  def toggleMarkAtRange(range: Range, mark: java.lang.String): Controller = js.native
  /**
    * Add or remove a mark from characters in the range. Passing a string will
    * implicitly create a mark of that type for deletion.
    */
  def toggleMarkAtRange(range: Range, mark: Mark): Controller = js.native
  def toggleMarkAtRange(range: Range, mark: MarkProperties): Controller = js.native
  /**
    * Move backward one step in the history
    */
  def undo(): Controller = js.native
  def unwrapBlock(properties: java.lang.String): Controller = js.native
  /**
    * Unwrap all Block nodes in the current selection that match a type and/or data
    */
  def unwrapBlock(properties: BlockProperties): Controller = js.native
  def unwrapBlockAtRange(range: Range, properties: java.lang.String): Controller = js.native
  /**
    * Unwrap all block nodes in a range that match properties
    */
  def unwrapBlockAtRange(range: Range, properties: BlockProperties): Controller = js.native
  def unwrapBlockByKey(key: java.lang.String, properties: java.lang.String): Controller = js.native
  /**
    * Unwrap all inner content of a block node by its key that match properties
    */
  def unwrapBlockByKey(key: java.lang.String, properties: BlockProperties): Controller = js.native
  def unwrapBlockByPath(path: Path, properties: java.lang.String): Controller = js.native
  /**
    * Unwrap all inner content of a block node by its path that match properties
    */
  def unwrapBlockByPath(path: Path, properties: BlockProperties): Controller = js.native
  def unwrapInline(properties: java.lang.String): Controller = js.native
  /**
    * Unwrap all Inline nodes in the current selection that match a type and/or data
    */
  def unwrapInline(properties: InlineProperties): Controller = js.native
  def unwrapInlineAtRange(range: Range, properties: java.lang.String): Controller = js.native
  /**
    * Unwrap all inline nodes in a range that match properties
    */
  def unwrapInlineAtRange(range: Range, properties: InlineProperties): Controller = js.native
  def unwrapInlineByKey(key: java.lang.String, properties: java.lang.String): Controller = js.native
  /**
    * Unwrap all inner content of an inline node by its key that match properties
    */
  def unwrapInlineByKey(key: java.lang.String, properties: InlineProperties): Controller = js.native
  def unwrapInlineByPath(path: Path, properties: java.lang.String): Controller = js.native
  /**
    * Unwrap all inner content of an inline node by its path that match properties
    */
  def unwrapInlineByPath(path: Path, properties: InlineProperties): Controller = js.native
  /**
    * Unwrap a single node from its parent. if the node is surrounded with siblings the parent will be split.
    * If the node is an only child, it will replace the parent
    */
  def unwrapNodeByKey(key: java.lang.String): Controller = js.native
  /**
    * Unwrap a single node from its parent. if the node is surrounded with siblings the parent will be split.
    * If the node is an only child, it will replace the parent
    */
  def unwrapNodeByPath(path: Path): Controller = js.native
  /**
    * Usually all command operations are merged into a single save point in history,
    * if more control is desired, create single save points using this function.
    */
  def withoutMerging(fn: js.Function0[scala.Unit]): Controller = js.native
  /**
    * Calls the provided function with the current commandable as the first argument.
    * Normalization does not occur while the function is executing and is deferred to execute immediately after completion.
    *
    * This allows for sequence change operations to not be interrupted by normalization
    */
  def withoutNormalizing(fn: js.Function0[scala.Unit]): Controller = js.native
  /**
    * By default all operations are saved to the commandable's history. If you have
    * changes that you don't want to show up in history, use this function.
    */
  def withoutSaving(fn: js.Function0[scala.Unit]): Controller = js.native
  def wrapBlock(properties: java.lang.String): Controller = js.native
  /**
    * Wrap the Block nodes in the current selection with a new Block
    */
  def wrapBlock(properties: BlockProperties): Controller = js.native
  def wrapBlockAtRange(range: Range, properties: java.lang.String): Controller = js.native
  /**
    * wrap all block nodes in a range with a new block node with the provided properties
    */
  def wrapBlockAtRange(range: Range, properties: BlockProperties): Controller = js.native
  def wrapBlockByKey(key: java.lang.String, properties: java.lang.String): Controller = js.native
  /**
    * Wrap the given node by key in a block node that matches properties.
    */
  def wrapBlockByKey(key: java.lang.String, properties: BlockProperties): Controller = js.native
  def wrapBlockByPath(path: Path, block: java.lang.String): Controller = js.native
  /**
    * Wrap the given node by path in a block node that matches properties.
    */
  def wrapBlockByPath(path: Path, block: Block): Controller = js.native
  def wrapInline(properties: java.lang.String): Controller = js.native
  /**
    *  Wrap the Block nodes in the current selection with a new Inline
    */
  def wrapInline(properties: InlineProperties): Controller = js.native
  def wrapInlineAtRange(range: Range, properties: java.lang.String): Controller = js.native
  /**
    * wrap all inline nodes in a range with a new inline node with the provided properties
    */
  def wrapInlineAtRange(range: Range, properties: InlineProperties): Controller = js.native
  def wrapInlineByKey(key: java.lang.String, properties: java.lang.String): Controller = js.native
  /**
    * Wrap the given node by key in an Inline node that matches properties.
    */
  def wrapInlineByKey(key: java.lang.String, properties: InlineProperties): Controller = js.native
  def wrapInlineByPath(path: Path, properties: java.lang.String): Controller = js.native
  /**
    * Wrap the given node by path in an Inline node that matches properties.
    */
  def wrapInlineByPath(path: Path, properties: InlineProperties): Controller = js.native
  /**
    * Wrap the node with the specified key with the parent node, this will clear all children of the parent.
    */
  def wrapNodeByKey(key: java.lang.String, parent: Node): Controller = js.native
  /**
    * Wrap the node with the specified key with the parent node, this will clear all children of the parent.
    */
  def wrapNodeByPath(path: Path, parent: Node): Controller = js.native
  /**
    * Surround the text in the current selection with prefix and suffix strings.
    * If the suffix is ommitted, the prefix will be used instead.
    */
  def wrapText(prefix: java.lang.String): Controller = js.native
  def wrapText(prefix: java.lang.String, suffix: java.lang.String): Controller = js.native
  /**
    * Surround the text in a range with a prefix and suffix. If the suffix is ommitted,
    * the prefix will be used instead.
    */
  def wrapTextAtRange(range: Range, prefix: java.lang.String): Controller = js.native
  def wrapTextAtRange(range: Range, prefix: java.lang.String, suffix: java.lang.String): Controller = js.native
}

