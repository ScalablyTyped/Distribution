package typings
package reactDashMonacoDashEditorLib.reactDashMonacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait MonacoDiffEditorProps extends MonacoEditorBaseProps {
  /**
     * An event emitted when the editor has been mounted (similar to componentDidMount of React).
     */
  var editorDidMount: js.UndefOr[DiffEditorDidMount] = js.undefined
  /**
     * An event emitted before the editor mounted (similar to componentWillMount of React).
     */
  var editorWillMount: js.UndefOr[DiffEditorWillMount] = js.undefined
  /**
     * An event emitted when the content of the current model has changed.
     */
  var onChange: js.UndefOr[DiffChangeHandler] = js.undefined
  /**
     * Refer to Monaco interface {monaco.editor.IDiffEditorConstructionOptions}.
     */
  var options: js.UndefOr[monacoDashEditorLib.monacoDashEditorMod.editorNs.IDiffEditorConstructionOptions] = js.undefined
  /**
     * The original value to compare against.
     */
  var original: js.UndefOr[java.lang.String] = js.undefined
  /**
     * Value of the auto created model in the editor.
     * If you specify value property, the component behaves in controlled mode. Otherwise, it behaves in uncontrolled mode.
     */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

