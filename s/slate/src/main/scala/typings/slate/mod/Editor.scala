package typings.slate.mod

import typings.immutable.Immutable.List
import typings.slate.AnonNormalize
import typings.slate.AnonOperations
import typings.slate.slateStrings.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "Editor")
@js.native
class Editor protected () extends Controller {
  def this(attributes: EditorProperties[Editor]) = this()
  def this(attributes: EditorProperties[Editor], options: EditorOptions) = this()
  var controller: Controller = js.native
  var middleware: js.Object = js.native
  var `object`: editor = js.native
  var operations: List[Operation] = js.native
  var plugins: js.Array[Plugin[Editor]] = js.native
  var readOnly: Boolean = js.native
  var value: Value = js.native
  /**
    * Synchronously flush the current changes to editor, calling onChange.
    * In normal operation you never need to use this method! Reserved for testing.
    */
  def flush(): Editor = js.native
  def insertNodeByKey(key: String, index: Double, node: Block): Editor = js.native
  def insertNodeByKey(key: String, index: Double, node: Document): Editor = js.native
  def insertNodeByKey(key: String, index: Double, node: Inline): Editor = js.native
  def insertNodeByKey(key: String, index: Double, node: Text): Editor = js.native
  def insertNodeByPath(path: List[Double], index: Double, node: Block): Editor = js.native
  def insertNodeByPath(path: List[Double], index: Double, node: Document): Editor = js.native
  def insertNodeByPath(path: List[Double], index: Double, node: Inline): Editor = js.native
  def insertNodeByPath(path: List[Double], index: Double, node: Text): Editor = js.native
  def isEditor(maybeEditor: js.Any): /* is slate.slate.Editor */ Boolean = js.native
  def moveAnchorToEndOfNode(node: Block): Editor = js.native
  def moveAnchorToEndOfNode(node: Document): Editor = js.native
  def moveAnchorToEndOfNode(node: Inline): Editor = js.native
  def moveAnchorToEndOfNode(node: Text): Editor = js.native
  def moveAnchorToStartOfNode(node: Block): Editor = js.native
  def moveAnchorToStartOfNode(node: Document): Editor = js.native
  def moveAnchorToStartOfNode(node: Inline): Editor = js.native
  def moveAnchorToStartOfNode(node: Text): Editor = js.native
  def moveEndToEndOfNode(node: Block): Editor = js.native
  def moveEndToEndOfNode(node: Document): Editor = js.native
  def moveEndToEndOfNode(node: Inline): Editor = js.native
  def moveEndToEndOfNode(node: Text): Editor = js.native
  def moveEndToStartOfNode(node: Block): Editor = js.native
  def moveEndToStartOfNode(node: Document): Editor = js.native
  def moveEndToStartOfNode(node: Inline): Editor = js.native
  def moveEndToStartOfNode(node: Text): Editor = js.native
  def moveFocusToEndOfNode(node: Block): Editor = js.native
  def moveFocusToEndOfNode(node: Document): Editor = js.native
  def moveFocusToEndOfNode(node: Inline): Editor = js.native
  def moveFocusToEndOfNode(node: Text): Editor = js.native
  def moveFocusToStartOfNode(node: Block): Editor = js.native
  def moveFocusToStartOfNode(node: Document): Editor = js.native
  def moveFocusToStartOfNode(node: Inline): Editor = js.native
  def moveFocusToStartOfNode(node: Text): Editor = js.native
  def moveStartToEndOfNode(node: Block): Editor = js.native
  def moveStartToEndOfNode(node: Document): Editor = js.native
  def moveStartToEndOfNode(node: Inline): Editor = js.native
  def moveStartToEndOfNode(node: Text): Editor = js.native
  def moveStartToStartOfNode(node: Block): Editor = js.native
  def moveStartToStartOfNode(node: Document): Editor = js.native
  def moveStartToStartOfNode(node: Inline): Editor = js.native
  def moveStartToStartOfNode(node: Text): Editor = js.native
  def moveToEndOfNode(node: Block): Editor = js.native
  def moveToEndOfNode(node: Document): Editor = js.native
  def moveToEndOfNode(node: Inline): Editor = js.native
  def moveToEndOfNode(node: Text): Editor = js.native
  def moveToRangeOfNode(node: Block): Editor = js.native
  def moveToRangeOfNode(node: Document): Editor = js.native
  def moveToRangeOfNode(node: Inline): Editor = js.native
  def moveToRangeOfNode(node: Text): Editor = js.native
  def moveToStartOfNode(node: Block): Editor = js.native
  def moveToStartOfNode(node: Document): Editor = js.native
  def moveToStartOfNode(node: Inline): Editor = js.native
  def moveToStartOfNode(node: Text): Editor = js.native
  def onChange(change: AnonOperations): Unit = js.native
  def replaceNodeByKey(key: String, node: Block): Editor = js.native
  def replaceNodeByKey(key: String, node: Document): Editor = js.native
  def replaceNodeByKey(key: String, node: Inline): Editor = js.native
  def replaceNodeByKey(key: String, node: Text): Editor = js.native
  def replaceNodeByPath(path: List[Double], newNode: Block): Editor = js.native
  def replaceNodeByPath(path: List[Double], newNode: Document): Editor = js.native
  def replaceNodeByPath(path: List[Double], newNode: Inline): Editor = js.native
  def replaceNodeByPath(path: List[Double], newNode: Text): Editor = js.native
  def replaceTextByKey(key: String, node: Block): Editor = js.native
  def replaceTextByKey(key: String, node: Document): Editor = js.native
  def replaceTextByKey(key: String, node: Inline): Editor = js.native
  def replaceTextByKey(key: String, node: Text): Editor = js.native
  def setMarkByKey(key: String, offset: Double, length: Double, properties: String, newProperties: String): Editor = js.native
  def setMarkByKey(key: String, offset: Double, length: Double, properties: MarkJSON, newProperties: String): Editor = js.native
  def setMarkByKey(key: String, offset: Double, length: Double, properties: MarkProperties, newProperties: String): Editor = js.native
  def setMarkByKey(key: String, offset: Double, length: Double, properties: Mark, newProperties: String): Editor = js.native
  def setMarkByPath(path: List[Double], offset: Double, length: Double, properties: String, newProperties: String): Editor = js.native
  def setMarkByPath(path: List[Double], offset: Double, length: Double, properties: MarkJSON, newProperties: String): Editor = js.native
  def setMarkByPath(
    path: List[Double],
    offset: Double,
    length: Double,
    properties: MarkProperties,
    newProperties: String
  ): Editor = js.native
  def setMarkByPath(path: List[Double], offset: Double, length: Double, properties: Mark, newProperties: String): Editor = js.native
  def setReadOnly(readOnly: Boolean): Editor = js.native
  /**
    * Set the editor's value state.
    * You can optionally provide a normalize option to either for the editor to completely re-normalize the new value based on its schema or not.
    * By default, the editor will re-normalize only if the value is not equal to its previously seen value (which it knows was normalized).
    */
  def setValue(value: Value): Editor = js.native
  def setValue(value: Value, options: AnonNormalize): Editor = js.native
  def wrapNodeByKey(key: String, parent: Block): Editor = js.native
  def wrapNodeByKey(key: String, parent: Document): Editor = js.native
  def wrapNodeByKey(key: String, parent: Inline): Editor = js.native
  def wrapNodeByKey(key: String, parent: Text): Editor = js.native
  def wrapNodeByPath(path: List[Double], parent: Block): Editor = js.native
  def wrapNodeByPath(path: List[Double], parent: Document): Editor = js.native
  def wrapNodeByPath(path: List[Double], parent: Inline): Editor = js.native
  def wrapNodeByPath(path: List[Double], parent: Text): Editor = js.native
}

