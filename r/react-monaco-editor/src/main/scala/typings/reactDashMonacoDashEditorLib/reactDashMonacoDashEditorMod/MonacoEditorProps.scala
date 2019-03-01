package typings
package reactDashMonacoDashEditorLib.reactDashMonacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MonacoEditorProps extends MonacoEditorBaseProps {
  /**
    * An event emitted when the editor has been mounted (similar to componentDidMount of React).
    */
  var editorDidMount: js.UndefOr[EditorDidMount] = js.undefined
  /**
    * An event emitted before the editor mounted (similar to componentWillMount of React).
    */
  var editorWillMount: js.UndefOr[EditorWillMount] = js.undefined
  /**
    * An event emitted when the content of the current model has changed.
    */
  var onChange: js.UndefOr[ChangeHandler] = js.undefined
  /**
    * Refer to Monaco interface {monaco.editor.IEditorConstructionOptions}.
    */
  var options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify monacoEditor.editor.IEditorConstructionOptions */ js.UndefOr[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify monacoEditor.editor.IEditorConstructionOptions */ js.Any
  ] = js.undefined
  /**
    * Value of the auto created model in the editor.
    * If you specify value property, the component behaves in controlled mode. Otherwise, it behaves in uncontrolled mode.
    */
  var value: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object MonacoEditorProps {
  @scala.inline
  def apply(
    context: js.Any = null,
    defaultValue: java.lang.String = null,
    editorDidMount: EditorDidMount = null,
    editorWillMount: EditorWillMount = null,
    height: java.lang.String | scala.Double = null,
    language: java.lang.String = null,
    onChange: ChangeHandler = null,
    options: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify monacoEditor.editor.IEditorConstructionOptions */ js.Any = null,
    requireConfig: js.Any = null,
    theme: java.lang.String = null,
    value: java.lang.String = null,
    width: java.lang.String | scala.Double = null
  ): MonacoEditorProps = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (editorDidMount != null) __obj.updateDynamic("editorDidMount")(editorDidMount)
    if (editorWillMount != null) __obj.updateDynamic("editorWillMount")(editorWillMount)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (language != null) __obj.updateDynamic("language")(language)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (options != null) __obj.updateDynamic("options")(options)
    if (requireConfig != null) __obj.updateDynamic("requireConfig")(requireConfig)
    if (theme != null) __obj.updateDynamic("theme")(theme)
    if (value != null) __obj.updateDynamic("value")(value)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MonacoEditorProps]
  }
}

