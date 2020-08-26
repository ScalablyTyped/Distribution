package typings.reactMonacoEditor

import typings.monacoEditor.mod.editor.IStandaloneDiffEditor
import typings.monacoEditor.mod.editor.IStandaloneEditorConstructionOptions
import typings.react.mod.Component
import typings.reactMonacoEditor.anon.DefaultValue
import typings.reactMonacoEditor.anon.EditorDidMount
import typings.reactMonacoEditor.typesMod.MonacoDiffEditorProps
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-monaco-editor/lib/diff", JSImport.Namespace)
@js.native
object diffMod extends js.Object {
  @js.native
  trait MonacoDiffEditor
    extends Component[MonacoDiffEditorProps, js.Object, js.Any] {
    var __prevent_trigger_change_event: js.Any = js.native
    var _subscription: js.Any = js.native
    var containerElement: js.Any = js.native
    var editor: js.UndefOr[IStandaloneDiffEditor] = js.native
    def assignRef(component: HTMLDivElement): Unit = js.native
    @JSName("componentDidMount")
    def componentDidMount_MMonacoDiffEditor(): Unit = js.native
    @JSName("componentDidUpdate")
    def componentDidUpdate_MMonacoDiffEditor(prevProps: MonacoDiffEditorProps): Unit = js.native
    @JSName("componentWillUnmount")
    def componentWillUnmount_MMonacoDiffEditor(): Unit = js.native
    def destroyMonaco(): Unit = js.native
    def editorDidMount(editor: IStandaloneDiffEditor): Unit = js.native
    def editorWillMount(): IStandaloneEditorConstructionOptions = js.native
    def initModels(value: String, original: String): Unit = js.native
    def initMonaco(): Unit = js.native
  }
  
  @js.native
  class default protected () extends MonacoDiffEditor {
    def this(props: MonacoDiffEditorProps) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    var defaultProps: EditorDidMount = js.native
    var propTypes: DefaultValue = js.native
  }
  
}

