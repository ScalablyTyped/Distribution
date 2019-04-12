package typings
package slateLib.slateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("slate", "Editor")
@js.native
class Editor protected () extends Controller {
  def this(attributes: EditorProperties) = this()
  var `object`: slateLib.slateLibStrings.editor = js.native
  var operations: immutableLib.immutableMod.List[Operation] = js.native
  var plugins: js.Array[Plugin] = js.native
  var readOnly: scala.Boolean = js.native
  var value: Value = js.native
  /**
    * Synchronously flush the current changes to editor, calling onChange.
    * In normal operation you never need to use this method! Reserved for testing.
    */
  def flush(): Editor = js.native
  def onChange(change: slateLib.Anon_Operations): scala.Unit = js.native
  def setDecorations(decorations: immutableLib.immutableMod.List[Decoration]): Editor = js.native
  def setDecorations(decorations: js.Array[Decoration]): Editor = js.native
  def setReadOnly(readOnly: scala.Boolean): Editor = js.native
  /**
    * Set the editor's value state.
    * You can optionally provide a normalize option to either for the editor to completely re-normalize the new value based on its schema or not.
    * By default, the editor will re-normalize only if the value is not equal to its previously seen value (which it knows was normalized).
    */
  def setValue(value: Value): Editor = js.native
  def setValue(value: Value, options: slateLib.Anon_Normalize): Editor = js.native
}

