package typings.reactMonacoEditor

import typings.monacoEditor.mod.editor.IStandaloneDiffEditor
import typings.monacoEditor.mod.editor.IStandaloneEditorConstructionOptions
import typings.propTypes.mod.Requireable
import typings.react.mod.Component
import typings.reactMonacoEditor.typesMod.MonacoDiffEditorProps
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object diffMod {
  
  @JSImport("react-monaco-editor/lib/diff", JSImport.Default)
  @js.native
  class default protected () extends MonacoDiffEditor {
    def this(props: MonacoDiffEditorProps) = this()
  }
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("react-monaco-editor/lib/diff", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-monaco-editor/lib/diff", "default.defaultProps.defaultValue")
      @js.native
      def defaultValue: String = js.native
      @scala.inline
      def defaultValue_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/diff", "default.defaultProps.editorDidMount")
      @js.native
      def editorDidMount: js.Function0[Unit] = js.native
      @scala.inline
      def editorDidMount_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editorDidMount")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/diff", "default.defaultProps.editorWillMount")
      @js.native
      def editorWillMount: js.Function0[Unit] = js.native
      @scala.inline
      def editorWillMount_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editorWillMount")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/diff", "default.defaultProps.height")
      @js.native
      def height: String = js.native
      @scala.inline
      def height_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("height")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/diff", "default.defaultProps.language")
      @js.native
      def language: String = js.native
      @scala.inline
      def language_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("language")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/diff", "default.defaultProps.onChange")
      @js.native
      def onChange: js.Function0[Unit] = js.native
      @scala.inline
      def onChange_=(x: js.Function0[Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/diff", "default.defaultProps.original")
      @js.native
      def original: js.Any = js.native
      @scala.inline
      def original_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("original")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/diff", "default.defaultProps.theme")
      @js.native
      def theme: js.Any = js.native
      @scala.inline
      def theme_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("theme")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/diff", "default.defaultProps.value")
      @js.native
      def value: js.Any = js.native
      @scala.inline
      def value_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/diff", "default.defaultProps.width")
      @js.native
      def width: String = js.native
      @scala.inline
      def width_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    object propTypes {
      
      @JSImport("react-monaco-editor/lib/diff", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-monaco-editor/lib/diff", "default.propTypes.defaultValue")
      @js.native
      def defaultValue: Requireable[String] = js.native
      @scala.inline
      def defaultValue_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/diff", "default.propTypes.editorDidMount")
      @js.native
      def editorDidMount: Requireable[js.Function1[/* repeated */ js.Any, js.Any]] = js.native
      @scala.inline
      def editorDidMount_=(x: Requireable[js.Function1[/* repeated */ js.Any, js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editorDidMount")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/diff", "default.propTypes.editorWillMount")
      @js.native
      def editorWillMount: Requireable[js.Function1[/* repeated */ js.Any, js.Any]] = js.native
      @scala.inline
      def editorWillMount_=(x: Requireable[js.Function1[/* repeated */ js.Any, js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editorWillMount")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/diff", "default.propTypes.height")
      @js.native
      def height: Requireable[String | Double] = js.native
      @scala.inline
      def height_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("height")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/diff", "default.propTypes.language")
      @js.native
      def language: Requireable[String] = js.native
      @scala.inline
      def language_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("language")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/diff", "default.propTypes.onChange")
      @js.native
      def onChange: Requireable[js.Function1[/* repeated */ js.Any, js.Any]] = js.native
      @scala.inline
      def onChange_=(x: Requireable[js.Function1[/* repeated */ js.Any, js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onChange")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/diff", "default.propTypes.options")
      @js.native
      def options: Requireable[js.Object] = js.native
      @scala.inline
      def options_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/diff", "default.propTypes.original")
      @js.native
      def original: Requireable[String] = js.native
      @scala.inline
      def original_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("original")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/diff", "default.propTypes.overrideServices")
      @js.native
      def overrideServices: Requireable[js.Object] = js.native
      @scala.inline
      def overrideServices_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("overrideServices")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/diff", "default.propTypes.theme")
      @js.native
      def theme: Requireable[String] = js.native
      @scala.inline
      def theme_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("theme")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/diff", "default.propTypes.value")
      @js.native
      def value: Requireable[String] = js.native
      @scala.inline
      def value_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
      
      @JSImport("react-monaco-editor/lib/diff", "default.propTypes.width")
      @js.native
      def width: Requireable[String | Double] = js.native
      @scala.inline
      def width_=(x: Requireable[String | Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("width")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MonacoDiffEditor
    extends Component[MonacoDiffEditorProps, js.Object, js.Any] {
    
    var __prevent_trigger_change_event: js.Any = js.native
    
    var _subscription: js.Any = js.native
    
    def assignRef(component: HTMLDivElement): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MMonacoDiffEditor(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MMonacoDiffEditor(prevProps: MonacoDiffEditorProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MMonacoDiffEditor(): Unit = js.native
    
    var containerElement: js.Any = js.native
    
    def destroyMonaco(): Unit = js.native
    
    var editor: js.UndefOr[IStandaloneDiffEditor] = js.native
    
    def editorDidMount(editor: IStandaloneDiffEditor): Unit = js.native
    
    def editorWillMount(): IStandaloneEditorConstructionOptions = js.native
    
    def initModels(value: String, original: String): Unit = js.native
    
    def initMonaco(): Unit = js.native
  }
}
