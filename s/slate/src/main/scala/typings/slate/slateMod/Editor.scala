package typings.slate.slateMod

import typings.immutable.immutableMod.List
import typings.slate.Anon_Normalize
import typings.slate.Anon_Operations
import typings.slate.slateStrings.editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "Editor")
@js.native
class Editor protected () extends Controller {
  def this(attributes: EditorProperties) = this()
  var `object`: editor = js.native
  var operations: List[Operation] = js.native
  var plugins: js.Array[Plugin] = js.native
  var readOnly: Boolean = js.native
  var value: Value = js.native
  def command(name: CommandFunc, args: js.Any*): Editor = js.native
  /**
    * Synchronously flush the current changes to editor, calling onChange.
    * In normal operation you never need to use this method! Reserved for testing.
    */
  def flush(): Editor = js.native
  def onChange(change: Anon_Operations): Unit = js.native
  def query(query: QueryFunc, args: js.Any*): js.Any = js.native
  def setDecorations(decorations: js.Array[Decoration]): Editor = js.native
  def setDecorations(decorations: List[Decoration]): Editor = js.native
  def setReadOnly(readOnly: Boolean): Editor = js.native
  /**
    * Set the editor's value state.
    * You can optionally provide a normalize option to either for the editor to completely re-normalize the new value based on its schema or not.
    * By default, the editor will re-normalize only if the value is not equal to its previously seen value (which it knows was normalized).
    */
  def setValue(value: Value): Editor = js.native
  def setValue(value: Value, options: Anon_Normalize): Editor = js.native
  def splitBlock(): Editor = js.native
  def splitBlockAtRange(range: Range): Editor = js.native
  def splitInline(): Editor = js.native
  def splitInlineAtRange(range: Range): Editor = js.native
}

