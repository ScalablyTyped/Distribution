package typings.reactMonacoEditor.typesMod

import typings.monacoEditor.mod.editor.IDiffEditorConstructionOptions
import typings.monacoEditor.mod.editor.IEditorOverrideServices
import typings.monacoEditor.mod.editor.IModelContentChangedEvent
import typings.monacoEditor.mod.editor.IStandaloneDiffEditor
import typings.monacoEditor.mod.editor.IStandaloneEditorConstructionOptions
import typings.reactMonacoEditor.anon.TypeofmonacoEditor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MonacoDiffEditorProps extends MonacoEditorBaseProps {
  /**
    * An event emitted when the editor has been mounted (similar to componentDidMount of React).
    */
  var editorDidMount: js.UndefOr[DiffEditorDidMount] = js.native
  /**
    * An event emitted before the editor mounted (similar to componentWillMount of React).
    */
  var editorWillMount: js.UndefOr[DiffEditorWillMount] = js.native
  /**
    * An event emitted when the content of the current model has changed.
    */
  var onChange: js.UndefOr[DiffChangeHandler] = js.native
  /**
    * Refer to Monaco interface {monaco.editor.IDiffEditorConstructionOptions}.
    */
  var options: js.UndefOr[IDiffEditorConstructionOptions] = js.native
  /**
    * The original value to compare against.
    */
  var original: js.UndefOr[String] = js.native
  /**
    * Refer to Monaco interface {monaco.editor.IEditorOverrideServices}.
    */
  var overrideServices: js.UndefOr[IEditorOverrideServices] = js.native
  /**
    * Value of the auto created model in the editor.
    * If you specify value property, the component behaves in controlled mode. Otherwise, it behaves in uncontrolled mode.
    */
  var value: js.UndefOr[String] = js.native
}

object MonacoDiffEditorProps {
  @scala.inline
  def apply(): MonacoDiffEditorProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonacoDiffEditorProps]
  }
  @scala.inline
  implicit class MonacoDiffEditorPropsOps[Self <: MonacoDiffEditorProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEditorDidMount(value: (/* editor */ IStandaloneDiffEditor, /* monaco */ TypeofmonacoEditor) => Unit): Self = this.set("editorDidMount", js.Any.fromFunction2(value))
    @scala.inline
    def deleteEditorDidMount: Self = this.set("editorDidMount", js.undefined)
    @scala.inline
    def setEditorWillMount(value: /* monaco */ TypeofmonacoEditor => Unit | IStandaloneEditorConstructionOptions): Self = this.set("editorWillMount", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEditorWillMount: Self = this.set("editorWillMount", js.undefined)
    @scala.inline
    def setOnChange(value: (/* value */ String, /* event */ IModelContentChangedEvent) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setOptions(value: IDiffEditorConstructionOptions): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
    @scala.inline
    def setOriginal(value: String): Self = this.set("original", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOriginal: Self = this.set("original", js.undefined)
    @scala.inline
    def setOverrideServices(value: IEditorOverrideServices): Self = this.set("overrideServices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrideServices: Self = this.set("overrideServices", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

